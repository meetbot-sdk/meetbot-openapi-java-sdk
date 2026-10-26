package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappGroupCreateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupCreateRequest {

    /**
     * WhatsApp 手机号码 ID
     * Required.
     */
    private String phoneId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private com.fasterxml.jackson.databind.JsonNode param;

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public WhatsappGroupCreateRequest phoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    public com.fasterxml.jackson.databind.JsonNode getParam() {
        return param;
    }

    public void setParam(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
    }

    public WhatsappGroupCreateRequest param(com.fasterxml.jackson.databind.JsonNode param) {
        this.param = param;
        return this;
    }
}
