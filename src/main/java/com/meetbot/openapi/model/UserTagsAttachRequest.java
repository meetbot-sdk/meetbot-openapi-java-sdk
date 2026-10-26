package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.Channel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTagsAttachRequest {

    /**
     * 客户在渠道中的唯一标识
     * Required.
     */
    private String userId;

    /**
     * 客户所在渠道（messenger/instagram/whatsapp）
     * Required.
     */
    private Channel channel;

    /**
     * 标签值ID
     * Required.
     */
    private String valueId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserTagsAttachRequest userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public UserTagsAttachRequest channel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public UserTagsAttachRequest valueId(String valueId) {
        this.valueId = valueId;
        return this;
    }

}
