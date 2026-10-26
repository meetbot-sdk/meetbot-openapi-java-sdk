package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 迁移消息模板结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateMigrateResult extends ExtensibleDto {

    /**
     * migrated_templates
     */
    @JsonProperty("migrated_templates")
    private java.util.List<String> migratedTemplates;

    /**
     * failed_templates
     */
    @JsonProperty("failed_templates")
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> failedTemplates;

    public java.util.List<String> getMigratedTemplates() {
        return migratedTemplates;
    }

    public void setMigratedTemplates(java.util.List<String> migratedTemplates) {
        this.migratedTemplates = migratedTemplates;
    }

    public WhatsappTemplateMigrateResult migratedTemplates(java.util.List<String> migratedTemplates) {
        this.migratedTemplates = migratedTemplates;
        return this;
    }

    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getFailedTemplates() {
        return failedTemplates;
    }

    public void setFailedTemplates(java.util.List<com.fasterxml.jackson.databind.JsonNode> failedTemplates) {
        this.failedTemplates = failedTemplates;
    }

    public WhatsappTemplateMigrateResult failedTemplates(java.util.List<com.fasterxml.jackson.databind.JsonNode> failedTemplates) {
        this.failedTemplates = failedTemplates;
        return this;
    }
}
