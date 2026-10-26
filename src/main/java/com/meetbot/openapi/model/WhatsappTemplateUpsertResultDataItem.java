package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateUpsertResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateUpsertResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * language
     */
    private String language;

    /**
     * status
     */
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappTemplateUpsertResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappTemplateUpsertResultDataItem language(String language) {
        this.language = language;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WhatsappTemplateUpsertResultDataItem status(String status) {
        this.status = status;
        return this;
    }
}
