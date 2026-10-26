package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupCreateResultGroupsItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupCreateResultGroupsItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappGroupCreateResultGroupsItem id(String id) {
        this.id = id;
        return this;
    }
}
