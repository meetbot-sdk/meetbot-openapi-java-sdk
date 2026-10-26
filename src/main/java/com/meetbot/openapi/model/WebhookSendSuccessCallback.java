package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookSendSuccessCallback {

    /**
     * 回调类型：OpenAPI 发送请求 Meta 调用成功
     * Required.
     */
    private String type;

    /**
     * OpenAPI 发送消息接口返回的 Meetbot 消息 ID
     * Required.
     */
    private Long messageId;

    /** Required. */
    private WebhookSendSuccessMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookSendSuccessCallback type(String type) {
        this.type = type;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public WebhookSendSuccessCallback messageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public WebhookSendSuccessMsg getMsg() {
        return msg;
    }

    public void setMsg(WebhookSendSuccessMsg msg) {
        this.msg = msg;
    }

    public WebhookSendSuccessCallback msg(WebhookSendSuccessMsg msg) {
        this.msg = msg;
        return this;
    }

}
