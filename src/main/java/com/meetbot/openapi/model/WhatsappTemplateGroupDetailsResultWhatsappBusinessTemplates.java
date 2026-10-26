package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates extends ExtensibleDto {

    /**
     * data
     */
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> data;

    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getData() {
        return data;
    }

    public void setData(java.util.List<com.fasterxml.jackson.databind.JsonNode> data) {
        this.data = data;
    }

    public WhatsappTemplateGroupDetailsResultWhatsappBusinessTemplates data(java.util.List<com.fasterxml.jackson.databind.JsonNode> data) {
        this.data = data;
        return this;
    }
}
