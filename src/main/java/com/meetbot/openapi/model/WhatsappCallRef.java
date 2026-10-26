package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Calling API 返回的通话引用。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallRef extends ExtensibleDto {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
