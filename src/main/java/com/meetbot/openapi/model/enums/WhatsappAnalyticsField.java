package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** WhatsappAnalyticsField：OpenAPI 协议枚举。 */
public enum WhatsappAnalyticsField {

    ANALYTICS("analytics"),
    CONVERSATION_ANALYTICS("conversation_analytics"),
    PRICING_ANALYTICS("pricing_analytics"),
    TEMPLATE_ANALYTICS("template_analytics"),
    TEMPLATE_GROUP_ANALYTICS("template_group_analytics"),
    CALL_ANALYTICS("call_analytics"),
    GROUP_ANALYTICS("group_analytics");

    private final String value;

    WhatsappAnalyticsField(String value) {
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
    public static WhatsappAnalyticsField fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappAnalyticsField e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
