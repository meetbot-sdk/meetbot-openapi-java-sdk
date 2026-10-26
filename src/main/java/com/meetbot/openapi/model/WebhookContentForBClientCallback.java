package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookContentForBClientCallback {

    /**
     * 回调类型：客服/B 端发送的消息
     * Required.
     */
    private String type;

    /** Required. */
    private JsonNode msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookContentForBClientCallback type(String type) {
        this.type = type;
        return this;
    }

    public JsonNode getMsg() {
        return msg;
    }

    public void setMsg(JsonNode msg) {
        this.msg = msg;
    }

    public WebhookContentForBClientCallback msg(JsonNode msg) {
        this.msg = msg;
        return this;
    }

}
