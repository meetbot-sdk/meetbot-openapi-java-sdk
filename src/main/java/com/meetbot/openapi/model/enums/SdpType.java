package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SDP 类型。商家发起通话时为 offer；预接听/接听用户来电时为 answer
 */
public enum SdpType {

    OFFER("offer"),
    ANSWER("answer");

    private final String value;

    SdpType(String value) {
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
    public static SdpType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (SdpType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
