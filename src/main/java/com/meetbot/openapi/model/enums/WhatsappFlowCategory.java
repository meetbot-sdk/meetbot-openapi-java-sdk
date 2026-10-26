package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WhatsApp Flow 分类。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#create-flow">Create Flow</a>
 */
public enum WhatsappFlowCategory {

    SIGN_UP("SIGN_UP"),
    SIGN_IN("SIGN_IN"),
    APPOINTMENT_BOOKING("APPOINTMENT_BOOKING"),
    LEAD_GENERATION("LEAD_GENERATION"),
    CONTACT_US("CONTACT_US"),
    CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),
    SURVEY("SURVEY"),
    OTHER("OTHER");

    private final String value;

    WhatsappFlowCategory(String value) {
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
    public static WhatsappFlowCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappFlowCategory e : values()) {
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }
}
