package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Meta Cloud API {@code recipient_type}：1:1 为 {@code individual}，群聊为 {@code group}。
 */
public enum WhatsappRecipientType {

    INDIVIDUAL("individual"),
    GROUP("group");

    private final String value;

    WhatsappRecipientType(String value) {
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
    public static WhatsappRecipientType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappRecipientType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
