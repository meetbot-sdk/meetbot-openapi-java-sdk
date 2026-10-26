package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupListResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupListResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * subject
     */
    private String subject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappGroupListResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public WhatsappGroupListResultDataItem subject(String subject) {
        this.subject = subject;
        return this;
    }
}
