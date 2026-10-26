package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupListResultPagingCursors
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupListResultPagingCursors extends ExtensibleDto {

    /**
     * after
     */
    private String after;

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WhatsappTemplateGroupListResultPagingCursors after(String after) {
        this.after = after;
        return this;
    }
}
