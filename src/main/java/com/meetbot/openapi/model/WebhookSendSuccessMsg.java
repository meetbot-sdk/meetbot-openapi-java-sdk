package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookSendSuccessMsg {

    /**
     * 消息接收方 WhatsApp 号码
     * Required.
     */
    private String receiver;

    /**
     * WhatsApp 消息 ID（wamid）
     * Required.
     */
    private String mid;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public WebhookSendSuccessMsg receiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public WebhookSendSuccessMsg mid(String mid) {
        this.mid = mid;
        return this;
    }

}
