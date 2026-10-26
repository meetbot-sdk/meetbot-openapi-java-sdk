package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.WebhookActionType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookActionMsg {

    /** Required. */
    private WebhookActionType actionType;

    /**
     * 动作关联的用户 WhatsApp 号码
     * Required.
     */
    private String receiver;

    /**
     * 动作附加值；仅在标签类动作（如 ADD_USER_LABEL）中出现，值为标签值 ID
     */
    private String value;

    public WebhookActionType getActionType() {
        return actionType;
    }

    public void setActionType(WebhookActionType actionType) {
        this.actionType = actionType;
    }

    public WebhookActionMsg actionType(WebhookActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public WebhookActionMsg receiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public WebhookActionMsg value(String value) {
        this.value = value;
        return this;
    }

}
