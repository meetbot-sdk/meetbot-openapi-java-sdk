package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookSendErrorMsg {

    /**
     * 消息接收方 WhatsApp 号码
     * Required.
     */
    private String receiver;

    /**
     * 发送失败原因
     * Required.
     */
    private String reason;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public WebhookSendErrorMsg receiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public WebhookSendErrorMsg reason(String reason) {
        this.reason = reason;
        return this;
    }

}
