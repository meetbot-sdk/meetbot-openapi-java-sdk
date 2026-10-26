package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Meta 可见状态：VISIBLE=可见 / INVISIBLE=不可见
 */
public enum CapabilityToVisitStatus {

    VISIBLE("VISIBLE"),
    INVISIBLE("INVISIBLE");

    private final String value;

    CapabilityToVisitStatus(String value) {
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
    public static CapabilityToVisitStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (CapabilityToVisitStatus e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
