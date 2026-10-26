package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 批量取消归档消息模板结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUnarchiveResult extends ExtensibleDto {

    /**
     * unarchived_templates
     */
    @JsonProperty("unarchived_templates")
    private java.util.List<String> unarchivedTemplates;

    /**
     * failed_templates
     */
    @JsonProperty("failed_templates")
    private WhatsappTemplateUnarchiveResultFailedTemplates failedTemplates;

    public java.util.List<String> getUnarchivedTemplates() {
        return unarchivedTemplates;
    }

    public void setUnarchivedTemplates(java.util.List<String> unarchivedTemplates) {
        this.unarchivedTemplates = unarchivedTemplates;
    }

    public WhatsappTemplateUnarchiveResult unarchivedTemplates(java.util.List<String> unarchivedTemplates) {
        this.unarchivedTemplates = unarchivedTemplates;
        return this;
    }

    public WhatsappTemplateUnarchiveResultFailedTemplates getFailedTemplates() {
        return failedTemplates;
    }

    public void setFailedTemplates(WhatsappTemplateUnarchiveResultFailedTemplates failedTemplates) {
        this.failedTemplates = failedTemplates;
    }

    public WhatsappTemplateUnarchiveResult failedTemplates(WhatsappTemplateUnarchiveResultFailedTemplates failedTemplates) {
        this.failedTemplates = failedTemplates;
        return this;
    }
}
