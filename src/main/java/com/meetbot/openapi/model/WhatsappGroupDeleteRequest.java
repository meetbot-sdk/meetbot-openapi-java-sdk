package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupDeleteRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupDeleteRequest {

    /**
     * 群组 ID
     * Required.
     */
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WhatsappGroupDeleteRequest groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
}
