package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.Channel;

/**
 * TagUserItemResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagUserItemResponse {

    /**
     * 用户ID
     * Required.
     */
    private String userId;

    /**
     * 用户所属渠道，可选值为 messenger、instagram、whatsapp
     * Required.
     */
    private Channel channel;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TagUserItemResponse userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public TagUserItemResponse channel(Channel channel) {
        this.channel = channel;
        return this;
    }
}
