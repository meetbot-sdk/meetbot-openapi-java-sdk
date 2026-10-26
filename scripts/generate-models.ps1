# Generate Java model/enum classes from Meetbot OpenAPI globalObjectModel.
param(
  [string]$SpecPath = (Join-Path $PSScriptRoot '../../meetbot-official-site/public/rest-api-description/openapi.json'),
  [switch]$Overwrite
)

$ErrorActionPreference = 'Stop'
$Utf8NoBom = New-Object System.Text.UTF8Encoding $false

$outModel = Join-Path $PSScriptRoot '../src/main/java/com/meetbot/openapi/model'
$outEnum = Join-Path $outModel 'enums'

$spec = Get-Content -Raw -Encoding UTF8 $specPath | ConvertFrom-Json
$models = $spec.components.globalObjectModel

$skipModels = @(
  'CommonResponse', 'CommonPageResponse', 'CommonListResponse', 'CommonBooleanResponse',
  'WebhookCallback', 'BizSyncCountryCode', 'BizSyncMillisecondTimestamp',
  'WhatsappTemplateEditResponse',
  'WebhookMetaMessagesPayload', 'WebhookMetaStatusPayload', 'WebhookMetaAccountUpdatePayload',
  'WebhookMetaTemplateChangePayload', 'WebhookMetaCallsPayload',
  'SendMessageRequest', 'WhatsappTemplateCreateRequest', 'WhatsappTemplateEditRequest',
  'WhatsAppAccountProfileUpdateRequest', 'WhatsappFlowCreateRequest', 'WhatsappFlowUpdateRequest',
  'CtwaConversionPostbackParam', 'WhatsappTemplateComponent', 'WhatsappTemplateButton'
)

$jsonNodeRefs = @(
  'WebhookMetaMessagesPayload', 'WebhookMetaStatusPayload', 'WebhookMetaAccountUpdatePayload',
  'WebhookMetaTemplateChangePayload', 'WebhookMetaCallsPayload', 'WhatsappTemplateEditResponse'
)

$javaKeywords = [System.Collections.Generic.HashSet[string]]::new([string[]]@(
  'abstract','assert','boolean','break','byte','case','catch','char','class','const','continue',
  'default','do','double','else','enum','extends','final','finally','float','for','goto','if',
  'implements','import','instanceof','int','interface','long','native','new','package','private',
  'protected','public','return','short','static','strictfp','super','switch','synchronized','this',
  'throw','throws','transient','try','void','volatile','while','true','false','null'
))

function Write-Utf8([string]$path, [string]$content) {
  # Preserve hand-maintained types and extensions unless explicitly requested.
  if ((Test-Path -LiteralPath $path) -and -not $Overwrite) { return }
  $dir = Split-Path $path -Parent
  if (-not (Test-Path $dir)) { New-Item -ItemType Directory -Force -Path $dir | Out-Null }
  [System.IO.File]::WriteAllText($path, $content, $Utf8NoBom)
}

function ConvertTo-Camel([string]$name) {
  if ([string]::IsNullOrEmpty($name)) { return $name }
  if ($name -notmatch '_') { return $name }
  $parts = $name -split '_'
  $sb = New-Object System.Text.StringBuilder
  [void]$sb.Append($parts[0])
  for ($i = 1; $i -lt $parts.Length; $i++) {
    $p = $parts[$i]
    if ([string]::IsNullOrEmpty($p)) { continue }
    [void]$sb.Append($p.Substring(0, 1).ToUpperInvariant())
    if ($p.Length -gt 1) { [void]$sb.Append($p.Substring(1)) }
  }
  return $sb.ToString()
}

function ConvertTo-Pascal([string]$name) {
  $c = ConvertTo-Camel $name
  if ([string]::IsNullOrEmpty($c)) { return $c }
  return $c.Substring(0, 1).ToUpperInvariant() + $c.Substring(1)
}

function ConvertTo-JavaIdent([string]$name) {
  $c = ConvertTo-Camel $name
  if ($javaKeywords.Contains($c)) { return $c + 'Value' }
  if ($c -match '^\d') { return '_' + $c }
  return $c
}

function ConvertTo-EnumConst([string]$value) {
  if ([string]::IsNullOrEmpty($value)) { return 'EMPTY' }
  $s = $value.ToUpperInvariant()
  $s = [regex]::Replace($s, '[^A-Z0-9]+', '_')
  $s = $s.Trim('_')
  if ([string]::IsNullOrEmpty($s)) { return 'EMPTY' }
  if ($s -match '^\d') { $s = '_' + $s }
  return $s
}

function Test-CleanEnum([object]$values) {
  if (-not $values) { return $false }
  foreach ($v in @($values)) {
    if ($null -eq $v) { return $false }
    $s = [string]$v
    if ($s -eq '') { return $false }
    if ($s -notmatch '^[A-Za-z][A-Za-z0-9_]*$') { return $false }
  }
  return $true
}

function Get-RefName([object]$schema) {
  if ($null -eq $schema) { return $null }
  $ref = $schema.'$ref'
  if ($ref) { return ($ref -split '/')[-1] }
  return $null
}

function Get-SchemaByName([string]$name) {
  return $models.$name
}

$enumRegistry = @{}  # jsonPath-or-name -> @{ ClassName; Values; Description }

function Register-Enum([string]$className, $values, [string]$description) {
  if (-not $enumRegistry.ContainsKey($className)) {
    $enumRegistry[$className] = @{ ClassName = $className; Values = @($values); Description = $description }
  }
  return $className
}

# Pre-register top-level enum models
foreach ($m in $models.PSObject.Properties) {
  $schema = $m.Value
  if ($skipModels -contains $m.Name) { continue }
  if ($schema.enum -and -not $schema.properties) {
    if ($m.Name -eq 'BizSyncCountryCode') { continue }
    [void](Register-Enum $m.Name $schema.enum $schema.description)
  }
}

# Named enums for well-known fields
$namedFieldEnums = @{
  'SceneType' = $true
  'MessageType' = $false
  'TagValueType' = $true
  'Channel' = $true
  'ProductType' = $true
  'ProductCondition' = $true
  'ProductAvailability' = $true
  'CatalogReviewStatus' = $true
  'CapabilityToVisitStatus' = $true
  'SdpType' = $true
}

function Get-FieldEnumName([string]$parent, [string]$prop, $enumValues) {
  $propL = $prop.ToLowerInvariant()
  if ($propL -eq 'scenetypelist' -or $propL -eq 'scenetype') { return 'SceneType' }
  if ($propL -eq 'valuetype') { return 'TagValueType' }
  if ($propL -eq 'channel') { return 'Channel' }
  if ($propL -eq 'producttype') { return 'ProductType' }
  if ($propL -eq 'productcondition') { return 'ProductCondition' }
  if ($propL -eq 'availability' -and (Test-CleanEnum $enumValues) -eq $false) { return 'ProductAvailability' }
  if ($propL -eq 'reviewstatus') { return 'CatalogReviewStatus' }
  if ($propL -eq 'capabilitytovisitstatus') { return 'CapabilityToVisitStatus' }
  if ($propL -eq 'sdp_type' -or $propL -eq 'sdptype') { return 'SdpType' }
  if ($propL -eq 'eventtype') { return 'BizSyncEventType' }
  if ($propL -eq 'financialstatus') { return 'BizSyncFinancialStatus' }
  if ($propL -eq 'fulfillmentstatus') { return 'BizSyncFulfillmentStatus' }
  if ($propL -eq 'cancelreason') { return 'BizSyncCancelReason' }
  if ($propL -eq 'actiontype') { return 'WebhookActionType' }
  # single-value const on webhook type fields: keep String
  $vals = @($enumValues)
  if ($vals.Count -eq 1) { return $null }
  if (Test-CleanEnum $enumValues) {
    return $parent + (ConvertTo-Pascal $prop)
  }
  return $null
}

$extraClasses = @{}  # className -> schema-like hashtable

function Merge-AllOf($schema) {
  if (-not $schema.allOf) { return $schema }
  $props = @{}
  $required = New-Object System.Collections.Generic.List[string]
  $desc = $schema.description
  foreach ($part in @($schema.allOf)) {
    $resolved = $part
    $refName = Get-RefName $part
    if ($refName) { $resolved = Get-SchemaByName $refName }
    if ($resolved.description -and -not $desc) { $desc = $resolved.description }
    if ($resolved.properties) {
      foreach ($p in $resolved.properties.PSObject.Properties) {
        $props[$p.Name] = $p.Value
      }
    }
    if ($resolved.required) {
      foreach ($r in @($resolved.required)) { if (-not $required.Contains($r)) { $required.Add($r) } }
    }
  }
  $obj = [pscustomobject]@{
    type = 'object'
    description = $desc
    properties = [pscustomobject]$props
    required = $required
  }
  return $obj
}

function Resolve-JavaType($schema, [string]$parent, [string]$prop, [ref]$imports) {
  if ($null -eq $schema) { return 'Object' }

  if ($schema.allOf) {
    $refOnly = $null
    $hasProps = $false
    foreach ($part in @($schema.allOf)) {
      $rn = Get-RefName $part
      if ($rn) { $refOnly = $rn }
      if ($part.properties) { $hasProps = $true }
    }
    if ($refOnly -and -not $hasProps) {
      return Resolve-JavaType ([pscustomobject]@{ '$ref' = "#/components/globalObjectModel/$refOnly" }) $parent $prop $imports
    }
  }

  $refName = Get-RefName $schema
  if ($refName) {
    if ($refName -eq 'BizSyncMillisecondTimestamp') { return 'Long' }
    if ($refName -eq 'BizSyncCountryCode') { return 'String' }
    if ($jsonNodeRefs -contains $refName) {
      $imports.Value['JsonNode'] = 'com.fasterxml.jackson.databind.JsonNode'
      return 'JsonNode'
    }
    $refSchema = Get-SchemaByName $refName
    if ($refSchema -and $refSchema.enum -and -not $refSchema.properties) {
      $imports.Value[$refName] = "com.meetbot.openapi.model.enums.$refName"
      return $refName
    }
    return $refName
  }

  $t = [string](@($schema.type) | Where-Object { $_ -ne 'null' } | Select-Object -First 1)
  if ($t -eq 'boole' -or $t -eq 'boolean') { return 'Boolean' }
  if ($t -eq 'integer') { return 'Long' }
  if ($t -eq 'number') { return 'java.math.BigDecimal' }
  if ($t -eq 'string') {
    if ($schema.enum) {
      $enumClass = Get-FieldEnumName $parent $prop $schema.enum
      if ($enumClass) {
        [void](Register-Enum $enumClass $schema.enum $schema.description)
        $imports.Value[$enumClass] = "com.meetbot.openapi.model.enums.$enumClass"
        return $enumClass
      }
    }
    return 'String'
  }
  if ($t -eq 'array') {
    $itemType = Resolve-JavaType $schema.items $parent $prop $imports
    if ($itemType -eq 'JsonNode') {
      $imports.Value['JsonNode'] = 'com.fasterxml.jackson.databind.JsonNode'
    }
    return "java.util.List<$itemType>"
  }

  if ($schema.properties) {
    $nestedName = if ($prop -eq 'param' -and $parent -match 'Request$') {
      ($parent -replace 'Request$','') + 'Param'
    } elseif ($t -eq 'array' -or $prop) {
      $parent + (ConvertTo-Pascal $prop)
    } else {
      $parent + 'Nested'
    }
    if ($schema.items) {
      # shouldn't happen
    }
    $extraClasses[$nestedName] = $schema
    $extraClasses[$nestedName] | Out-Null
    # store parent context
    return $nestedName
  }

  if ($schema.items -and $schema.items.properties) {
    $nestedName = $parent + (ConvertTo-Pascal $prop) + 'Item'
    $extraClasses[$nestedName] = $schema.items
    return "java.util.List<$nestedName>"
  }

  $imports.Value['JsonNode'] = 'com.fasterxml.jackson.databind.JsonNode'
  return 'JsonNode'
}

# Second pass: array items with properties
function Resolve-JavaType2($schema, [string]$parent, [string]$prop, [ref]$imports) {
  if ($null -eq $schema) { return 'Object' }
  $t = [string]$schema.type
  if ($t -eq 'array' -and $schema.items) {
    $items = $schema.items
    if ((Get-RefName $items)) {
      $itemType = Resolve-JavaType $items $parent $prop $imports
      return "java.util.List<$itemType>"
    }
    if ($items.properties) {
      $nestedName = $parent + (ConvertTo-Pascal $prop) + 'Item'
      $extraClasses[$nestedName] = $items
      return "java.util.List<$nestedName>"
    }
    if ($items.enum) {
      $enumClass = Get-FieldEnumName $parent $prop $items.enum
      if ($enumClass) {
        [void](Register-Enum $enumClass $items.enum $items.description)
        $imports.Value[$enumClass] = "com.meetbot.openapi.model.enums.$enumClass"
        return "java.util.List<$enumClass>"
      }
    }
    $itemType = Resolve-JavaType $items $parent $prop $imports
    return "java.util.List<$itemType>"
  }
  return Resolve-JavaType $schema $parent $prop $imports
}

$JOpen = '/' + '**'
$JClose = '*' + '/'

function ConvertTo-Javadoc([string]$text, [string]$indent) {
  if ([string]::IsNullOrEmpty($text)) { return $null }
  $t = $text -replace "`r`n", "`n" -replace "`r", "`n"
  $t = $t.Replace(($JClose), '*\/')
  $lines = $t -split "`n"
  $out = New-Object System.Text.StringBuilder
  foreach ($line in $lines) {
    [void]$out.AppendLine($indent + ' * ' + $line)
  }
  return $out.ToString().TrimEnd()
}

function Emit-Pojo([string]$className, $schema, [string]$description) {
  if ($schema.allOf) { $schema = Merge-AllOf $schema }
  $imports = @{}
  $fields = New-Object System.Collections.Generic.List[object]
  $props = $schema.properties
  if ($props) {
    foreach ($p in $props.PSObject.Properties) {
      $jsonName = $p.Name
      $javaName = ConvertTo-JavaIdent $jsonName
      $javaType = Resolve-JavaType2 $p.Value $className $jsonName ([ref]$imports)
      $fields.Add([pscustomobject]@{
        JsonName = $jsonName
        JavaName = $javaName
        JavaType = $javaType
        Description = $p.Value.description
        Required = ($schema.required -contains $jsonName)
      })
    }
  }

  $sb = New-Object System.Text.StringBuilder
  [void]$sb.AppendLine('package com.meetbot.openapi.model;')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('import com.fasterxml.jackson.annotation.JsonIgnoreProperties;')
  $needProp = $false
  foreach ($f in $fields) {
    if ($f.JsonName -ne $f.JavaName) { $needProp = $true; break }
  }
  if ($needProp) {
    [void]$sb.AppendLine('import com.fasterxml.jackson.annotation.JsonProperty;')
  }
  $importLines = $imports.Values | Sort-Object -Unique
  foreach ($imp in $importLines) {
    [void]$sb.AppendLine("import $imp;")
  }
  [void]$sb.AppendLine()
  if ($description) {
    $jd = ConvertTo-Javadoc $description ''
    [void]$sb.AppendLine($JOpen)
    foreach ($line in ($jd -split "`n")) {
      [void]$sb.AppendLine($line.TrimEnd())
    }
    [void]$sb.AppendLine(' ' + $JClose)
  }
  [void]$sb.AppendLine('@JsonIgnoreProperties(ignoreUnknown = true)')
  [void]$sb.AppendLine("public class $className {")
  [void]$sb.AppendLine()

  foreach ($f in $fields) {
    if ($f.Description) {
      [void]$sb.AppendLine('    ' + $JOpen)
      $jd = ConvertTo-Javadoc $f.Description '    '
      foreach ($line in ($jd -split "`n")) {
        [void]$sb.AppendLine($line.TrimEnd())
      }
      if ($f.Required) { [void]$sb.AppendLine('     * Required.') }
      [void]$sb.AppendLine('     ' + $JClose)
    } elseif ($f.Required) {
      [void]$sb.AppendLine('    ' + $JOpen + ' Required. ' + $JClose)
    }
    if ($f.JsonName -ne $f.JavaName) {
      [void]$sb.AppendLine(('    @JsonProperty("{0}")' -f $f.JsonName))
    }
    [void]$sb.AppendLine(('    private {0} {1};' -f $f.JavaType, $f.JavaName))
    [void]$sb.AppendLine()
  }

  foreach ($f in $fields) {
    $cap = $f.JavaName.Substring(0,1).ToUpperInvariant() + $f.JavaName.Substring(1)
    [void]$sb.AppendLine(('    public {0} get{1}() {{' -f $f.JavaType, $cap))
    [void]$sb.AppendLine(('        return {0};' -f $f.JavaName))
    [void]$sb.AppendLine('    }')
    [void]$sb.AppendLine()
    [void]$sb.AppendLine(('    public void set{0}({1} {2}) {{' -f $cap, $f.JavaType, $f.JavaName))
    [void]$sb.AppendLine(('        this.{0} = {0};' -f $f.JavaName))
    [void]$sb.AppendLine('    }')
    [void]$sb.AppendLine()
    [void]$sb.AppendLine(('    public {0} {1}({2} {1}) {{' -f $className, $f.JavaName, $f.JavaType))
    [void]$sb.AppendLine(('        this.{0} = {0};' -f $f.JavaName))
    [void]$sb.AppendLine('        return this;')
    [void]$sb.AppendLine('    }')
    [void]$sb.AppendLine()
  }

  [void]$sb.AppendLine('}')
  Write-Utf8 (Join-Path $outModel "$className.java") $sb.ToString()
}

function Emit-Enum([string]$className, $values, [string]$description) {
  $sb = New-Object System.Text.StringBuilder
  [void]$sb.AppendLine('package com.meetbot.openapi.model.enums;')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('import com.fasterxml.jackson.annotation.JsonCreator;')
  [void]$sb.AppendLine('import com.fasterxml.jackson.annotation.JsonValue;')
  [void]$sb.AppendLine()
  if ($description) {
    $jd = ConvertTo-Javadoc $description ''
    [void]$sb.AppendLine($JOpen)
    foreach ($line in ($jd -split "`n")) {
      [void]$sb.AppendLine($line.TrimEnd())
    }
    [void]$sb.AppendLine(' ' + $JClose)
  }
  [void]$sb.AppendLine("public enum $className {")
  [void]$sb.AppendLine()
  $i = 0
  $vals = @($values)
  foreach ($v in $vals) {
    $i++
    $const = ConvertTo-EnumConst ([string]$v)
    $comma = if ($i -eq $vals.Count) { ';' } else { ',' }
    [void]$sb.AppendLine(('    {0}("{1}"){2}' -f $const, $v, $comma))
  }
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('    private final String value;')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine(('    {0}(String value) {{' -f $className))
  [void]$sb.AppendLine('        this.value = value;')
  [void]$sb.AppendLine('    }')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('    @JsonValue')
  [void]$sb.AppendLine('    public String getValue() {')
  [void]$sb.AppendLine('        return value;')
  [void]$sb.AppendLine('    }')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('    @Override')
  [void]$sb.AppendLine('    public String toString() {')
  [void]$sb.AppendLine('        return value;')
  [void]$sb.AppendLine('    }')
  [void]$sb.AppendLine()
  [void]$sb.AppendLine('    @JsonCreator')
  [void]$sb.AppendLine(('    public static {0} fromValue(String value) {{' -f $className))
  [void]$sb.AppendLine('        if (value == null) {')
  [void]$sb.AppendLine('            return null;')
  [void]$sb.AppendLine('        }')
  [void]$sb.AppendLine(('        for ({0} e : values()) {{' -f $className))
  [void]$sb.AppendLine('            if (e.value.equals(value)) {')
  [void]$sb.AppendLine('                return e;')
  [void]$sb.AppendLine('            }')
  [void]$sb.AppendLine('        }')
  [void]$sb.AppendLine('        return null;')
  [void]$sb.AppendLine('    }')
  [void]$sb.AppendLine('}')
  Write-Utf8 (Join-Path $outEnum "$className.java") $sb.ToString()
}

# Generate model classes
foreach ($m in $models.PSObject.Properties) {
  if ($skipModels -contains $m.Name) { continue }
  $schema = $m.Value
  if ($schema.enum -and -not $schema.properties) { continue }
  Emit-Pojo $m.Name $schema $schema.description
}

# Nested extras (may add more while emitting; iterate until stable)
$guard = 0
while ($guard -lt 10) {
  $guard++
  $names = @($extraClasses.Keys)
  $pending = @()
  foreach ($n in $names) {
    $path = Join-Path $outModel "$n.java"
    if (-not (Test-Path $path)) { $pending += $n }
  }
  if ($pending.Count -eq 0) { break }
  foreach ($n in $pending) {
    Emit-Pojo $n $extraClasses[$n] $extraClasses[$n].description
  }
}

# Extra named enums that field mapping may have registered
foreach ($e in @($enumRegistry.Values)) {
  Emit-Enum $e.ClassName $e.Values $e.Description
}

Write-Host ("Generated models in {0}" -f $outModel)
Write-Host ("Generated enums in {0}: {1}" -f $outEnum, $enumRegistry.Count)
Write-Host ("Extra nested classes: {0}" -f $extraClasses.Count)
