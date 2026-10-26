package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupListResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupListResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * description
     */
    private String description;

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

    public WhatsappTemplateGroupListResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateGroupListResultDataItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhatsappTemplateGroupListResultDataItem description(String description) {
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WhatsappTemplateGroupListResultDataItem status(String status) {
        this.status = status;
        return this;
    }
}
