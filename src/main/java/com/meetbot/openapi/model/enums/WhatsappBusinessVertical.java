package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WhatsApp 商业资料行业分类 {@code vertical}。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles">Business profiles</a>
 */
public enum WhatsappBusinessVertical {

    ALCOHOL("ALCOHOL"),
    APPAREL("APPAREL"),
    AUTO("AUTO"),
    BEAUTY("BEAUTY"),
    EDU("EDU"),
    ENTERTAIN("ENTERTAIN"),
    EVENT_PLAN("EVENT_PLAN"),
    FINANCE("FINANCE"),
    GOVT("GOVT"),
    GROCERY("GROCERY"),
    HEALTH("HEALTH"),
    HOTEL("HOTEL"),
    NONPROFIT("NONPROFIT"),
    ONLINE_GAMBLING("ONLINE_GAMBLING"),
    OTC_DRUGS("OTC_DRUGS"),
    OTHER("OTHER"),
    PHYSICAL_GAMBLING("PHYSICAL_GAMBLING"),
    PROF_SERVICES("PROF_SERVICES"),
    RESTAURANT("RESTAURANT"),
    RETAIL("RETAIL"),
    TRAVEL("TRAVEL");

    private final String value;

    WhatsappBusinessVertical(String value) {
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
    public static WhatsappBusinessVertical fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappBusinessVertical e : values()) {
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }
}
