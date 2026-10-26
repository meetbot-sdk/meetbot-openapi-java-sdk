package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookCallsTerminateCallback {

    /**
     * 回调类型：通话已终止
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

    public WebhookCallsTerminateCallback type(String type) {
        this.type = type;
        return this;
    }

    public JsonNode getMsg() {
        return msg;
    }

    public void setMsg(JsonNode msg) {
        this.msg = msg;
    }

    public WebhookCallsTerminateCallback msg(JsonNode msg) {
        this.msg = msg;
        return this;
    }

}
