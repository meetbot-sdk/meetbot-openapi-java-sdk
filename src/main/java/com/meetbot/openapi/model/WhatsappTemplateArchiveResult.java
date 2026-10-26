package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 批量归档消息模板结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateArchiveResult extends ExtensibleDto {

    /**
     * archived_templates
     */
    @JsonProperty("archived_templates")
    private java.util.List<String> archivedTemplates;

    /**
     * failed_templates
     */
    @JsonProperty("failed_templates")
    private WhatsappTemplateArchiveResultFailedTemplates failedTemplates;

    public java.util.List<String> getArchivedTemplates() {
        return archivedTemplates;
    }

    public void setArchivedTemplates(java.util.List<String> archivedTemplates) {
        this.archivedTemplates = archivedTemplates;
    }

    public WhatsappTemplateArchiveResult archivedTemplates(java.util.List<String> archivedTemplates) {
        this.archivedTemplates = archivedTemplates;
        return this;
    }

    public WhatsappTemplateArchiveResultFailedTemplates getFailedTemplates() {
        return failedTemplates;
    }

    public void setFailedTemplates(WhatsappTemplateArchiveResultFailedTemplates failedTemplates) {
        this.failedTemplates = failedTemplates;
    }

    public WhatsappTemplateArchiveResult failedTemplates(WhatsappTemplateArchiveResultFailedTemplates failedTemplates) {
        this.failedTemplates = failedTemplates;
        return this;
    }
}
