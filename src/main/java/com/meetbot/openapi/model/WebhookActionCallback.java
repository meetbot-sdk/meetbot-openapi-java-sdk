package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookActionCallback {

    /**
     * 回调类型：标签、会话控制权转移等动作
     * Required.
     */
    private String type;

    /** Required. */
    private WebhookActionMsg msg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookActionCallback type(String type) {
        this.type = type;
        return this;
    }

    public WebhookActionMsg getMsg() {
        return msg;
    }

    public void setMsg(WebhookActionMsg msg) {
        this.msg = msg;
    }

    public WebhookActionCallback msg(WebhookActionMsg msg) {
        this.msg = msg;
        return this;
    }

}
