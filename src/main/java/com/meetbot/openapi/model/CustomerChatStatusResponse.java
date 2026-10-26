package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.CustomerChatStatus;

/**
 * CustomerChatStatusResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerChatStatusResponse {

    /**
     * 会话状态。PASS_THREAD_CONTROL：人工状态；TAKE_THREAD_CONTROL：机器人状态
     * Required.
     */
    private CustomerChatStatus chatStatus;

    public CustomerChatStatus getChatStatus() {
        return chatStatus;
    }

    public void setChatStatus(CustomerChatStatus chatStatus) {
        this.chatStatus = chatStatus;
    }

    public CustomerChatStatusResponse chatStatus(CustomerChatStatus chatStatus) {
        this.chatStatus = chatStatus;
        return this;
    }
}
