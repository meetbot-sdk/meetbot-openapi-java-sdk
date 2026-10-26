package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WhatsApp 消息模板分类。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a>
 */
public enum WhatsappTemplateCategory {

    MARKETING("MARKETING"),
    UTILITY("UTILITY"),
    AUTHENTICATION("AUTHENTICATION");

    private final String value;

    WhatsappTemplateCategory(String value) {
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
    public static WhatsappTemplateCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappTemplateCategory e : values()) {
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }
}
