package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupDetailsResultParticipants
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupDetailsResultParticipants extends ExtensibleDto {

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

    public WhatsappGroupDetailsResultParticipants data(java.util.List<com.fasterxml.jackson.databind.JsonNode> data) {
        this.data = data;
        return this;
    }
}
