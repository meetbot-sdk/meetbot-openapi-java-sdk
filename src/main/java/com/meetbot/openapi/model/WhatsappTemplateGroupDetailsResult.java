package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询模板组详情结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupDetailsResult extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * status
     */
    private String status;

    /**
     * whatsapp_business_templates
     */
    @JsonProperty("whatsapp_business_templates")
    private WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates whatsappBusinessTemplates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappTemplateGroupDetailsResult id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateGroupDetailsResult name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WhatsappTemplateGroupDetailsResult status(String status) {
        this.status = status;
        return this;
    }

    public WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates getWhatsappBusinessTemplates() {
        return whatsappBusinessTemplates;
    }

    public void setWhatsappBusinessTemplates(WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates whatsappBusinessTemplates) {
        this.whatsappBusinessTemplates = whatsappBusinessTemplates;
    }

    public WhatsappTemplateGroupDetailsResult whatsappBusinessTemplates(WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates whatsappBusinessTemplates) {
        this.whatsappBusinessTemplates = whatsappBusinessTemplates;
        return this;
    }
}
