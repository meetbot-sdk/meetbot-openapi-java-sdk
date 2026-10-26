param(
    [string]$SpecPath = (Join-Path $PSScriptRoot '../../meetbot-official-site/public/rest-api-description/openapi.json')
)

$ErrorActionPreference = 'Stop'
$spec = Get-Content -Raw -Encoding UTF8 -LiteralPath $SpecPath | ConvertFrom-Json
$apiRoot = Join-Path $PSScriptRoot '../src/main/java/com/meetbot/openapi/api'
$implemented = @{}
Get-ChildItem -LiteralPath $apiRoot -Filter '*.java' | ForEach-Object {
    $source = Get-Content -Raw -Encoding UTF8 -LiteralPath $_.FullName
    foreach ($match in [regex]::Matches($source, 'http\.(getWithJson|postMultipart|get|post)\("([^"\r\n]+)"')) {
        $method = if ($match.Groups[1].Value.StartsWith('get')) { 'GET' } else { 'POST' }
        $implemented["$method $($match.Groups[2].Value)"] = $true
    }
}
$missing = @()
$count = 0
foreach ($path in $spec.paths.PSObject.Properties) {
    foreach ($operation in $path.Value.PSObject.Properties) {
        if ($operation.Name -notin @('get', 'post', 'put', 'patch', 'delete', 'head', 'options')) { continue }
        $count++
        $key = "$($operation.Name.ToUpperInvariant()) $($path.Name)"
        if (-not $implemented.ContainsKey($key)) { $missing += $key }
    }
}
if ($missing.Count -gt 0) {
    throw "Missing $($missing.Count)/$count operations:`n$($missing -join "`n")"
}
Write-Output "Covered $count/$count OpenAPI operations (HTTP method + path)."
