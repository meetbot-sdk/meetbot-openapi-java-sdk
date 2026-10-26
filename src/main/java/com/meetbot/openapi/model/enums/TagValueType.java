package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 值类型（STRING/NUMBER/TIME）
 */
public enum TagValueType {

    STRING("STRING"),
    NUMBER("NUMBER"),
    TIME("TIME");

    private final String value;

    TagValueType(String value) {
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
    public static TagValueType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (TagValueType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
