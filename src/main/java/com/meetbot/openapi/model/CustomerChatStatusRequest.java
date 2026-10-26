package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * CustomerChatStatusRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerChatStatusRequest {

    /**
     * 客户用户 id
     * Required.
     */
    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerChatStatusRequest customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
}
