package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookSendErrorCallback {

    /**
     * 回调类型：OpenAPI 发送请求 Meta 同步调用失败
     * Required.
     */
    private String type;

    /**
     * OpenAPI 发送消息接口返回的 Meetbot 消息 ID
     * Required.
     */
    private Long messageId;

    /** Required. */
    private WebhookSendErrorMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookSendErrorCallback type(String type) {
        this.type = type;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public WebhookSendErrorCallback messageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public WebhookSendErrorMsg getMsg() {
        return msg;
    }

    public void setMsg(WebhookSendErrorMsg msg) {
        this.msg = msg;
    }

    public WebhookSendErrorCallback msg(WebhookSendErrorMsg msg) {
        this.msg = msg;
        return this;
    }

}
