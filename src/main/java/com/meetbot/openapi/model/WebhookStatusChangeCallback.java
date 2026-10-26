package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookStatusChangeCallback {

    /**
     * 回调类型：消息状态变更（已发送/已送达/已读等）
     * Required.
     */
    private String type;

    /**
     * OpenAPI 发送消息接口返回的 Meetbot 消息 ID；仅当该状态消息关联 OpenAPI 发送记录时携带
     */
    private Long messageId;

    /** Required. */
    private JsonNode msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookStatusChangeCallback type(String type) {
        this.type = type;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public WebhookStatusChangeCallback messageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public JsonNode getMsg() {
        return msg;
    }

    public void setMsg(JsonNode msg) {
        this.msg = msg;
    }

    public WebhookStatusChangeCallback msg(JsonNode msg) {
        this.msg = msg;
        return this;
    }

}
