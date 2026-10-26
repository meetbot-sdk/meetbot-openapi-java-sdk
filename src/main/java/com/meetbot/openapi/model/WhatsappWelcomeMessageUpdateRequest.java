package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappWelcomeMessageUpdateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageUpdateRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 欢迎消息序列参数
     * Required.
     */
    private WhatsappWelcomeMessageUpdateParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappWelcomeMessageUpdateRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappWelcomeMessageUpdateParam getParam() {
        return param;
    }

    public void setParam(WhatsappWelcomeMessageUpdateParam param) {
        this.param = param;
    }

    public WhatsappWelcomeMessageUpdateRequest param(WhatsappWelcomeMessageUpdateParam param) {
        this.param = param;
        return this;
    }
}
