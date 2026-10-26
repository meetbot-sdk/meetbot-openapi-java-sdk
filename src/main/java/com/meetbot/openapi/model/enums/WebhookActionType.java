package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ACTION 回调中的动作类型：ADD_USER_LABEL（用户打标签）、REMOVE_USER_LABEL（移除用户标签）、PASS_THREAD_CONTROL（转人工）、TAKE_THREAD_CONTROL（转机器人）、JSON_API
 */
public enum WebhookActionType {

    ADD_USER_LABEL("ADD_USER_LABEL"),
    REMOVE_USER_LABEL("REMOVE_USER_LABEL"),
    PASS_THREAD_CONTROL("PASS_THREAD_CONTROL"),
    TAKE_THREAD_CONTROL("TAKE_THREAD_CONTROL"),
    JSON_API("JSON_API");

    private final String value;

    WebhookActionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static WebhookActionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WebhookActionType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
