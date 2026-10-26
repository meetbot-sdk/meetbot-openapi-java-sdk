package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 客户所在渠道（messenger/instagram/whatsapp）
 */
public enum Channel {

    MESSENGER("messenger"),
    INSTAGRAM("instagram"),
    WHATSAPP("whatsapp");

    private final String value;

    Channel(String value) {
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
    public static Channel fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (Channel e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
