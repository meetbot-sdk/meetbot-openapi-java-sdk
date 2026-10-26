package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappWelcomeMessageCreateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageCreateRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * 欢迎消息序列参数
     * Required.
     */
    private WhatsappWelcomeMessageCreateParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public WhatsappWelcomeMessageCreateRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public WhatsappWelcomeMessageCreateParam getParam() {
        return param;
    }

    public void setParam(WhatsappWelcomeMessageCreateParam param) {
        this.param = param;
    }

    public WhatsappWelcomeMessageCreateRequest param(WhatsappWelcomeMessageCreateParam param) {
        this.param = param;
        return this;
    }
}
