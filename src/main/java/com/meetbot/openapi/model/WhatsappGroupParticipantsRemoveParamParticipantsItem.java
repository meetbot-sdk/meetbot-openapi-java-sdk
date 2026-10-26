package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappGroupParticipantsRemoveParamParticipantsItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupParticipantsRemoveParamParticipantsItem {

    /**
     * 成员 WhatsApp ID
     */
    private String user;

    /**
     * 业务范围用户 ID
     */
    @JsonProperty("user_id")
    private String userId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public WhatsappGroupParticipantsRemoveParamParticipantsItem user(String user) {
        this.user = user;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public WhatsappGroupParticipantsRemoveParamParticipantsItem userId(String userId) {
        this.userId = userId;
        return this;
    }
}
