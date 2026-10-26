package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookAccountChangeCallback {

    /**
     * 回调类型：WhatsApp 业务账号变更
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

    public WebhookAccountChangeCallback type(String type) {
        this.type = type;
        return this;
    }

    public JsonNode getMsg() {
        return msg;
    }

    public void setMsg(JsonNode msg) {
        this.msg = msg;
    }

    public WebhookAccountChangeCallback msg(JsonNode msg) {
        this.msg = msg;
        return this;
    }

}
