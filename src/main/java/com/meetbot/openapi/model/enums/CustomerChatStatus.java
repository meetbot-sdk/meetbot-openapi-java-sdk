package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** CustomerChatStatus：OpenAPI 协议枚举。 */
public enum CustomerChatStatus {

    PASS_THREAD_CONTROL("PASS_THREAD_CONTROL"),
    TAKE_THREAD_CONTROL("TAKE_THREAD_CONTROL");

    private final String value;

    CustomerChatStatus(String value) {
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
    public static CustomerChatStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (CustomerChatStatus e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
