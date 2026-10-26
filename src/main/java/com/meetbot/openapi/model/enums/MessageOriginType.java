package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** MessageOriginType：OpenAPI 协议枚举。 */
public enum MessageOriginType {

    OPEN_API("OPEN_API"),
    GROUP_SEND("GROUP_SEND"),
    EDIT_TEST("EDIT_TEST"),
    TEST("TEST"),
    DEFAULT_REPLY("DEFAULT_REPLY"),
    QUICK_SHOT_MENTION("QUICK_SHOT_MENTION"),
    CUSTOM_KEYWORD("CUSTOM_KEYWORD"),
    CUSTOM_NLP("CUSTOM_NLP"),
    CUSTOM_EVENT("CUSTOM_EVENT"),
    SEATS("SEATS"),
    COMMENT("COMMENT"),
    FACEBOOK_POST_COMMENT("FACEBOOK_POST_COMMENT"),
    INSTAGRAM_POST_COMMENT("INSTAGRAM_POST_COMMENT"),
    INSTAGRAM_STORY_MENTION("INSTAGRAM_STORY_MENTION"),
    USER_INPUT("USER_INPUT"),
    REFERRAL("REFERRAL"),
    SHORTLINK("SHORTLINK"),
    CUSTOMER_CHAT("CUSTOMER_CHAT"),
    AD("AD"),
    CHECKBOX("CHECKBOX"),
    SEND_TO_MESSENGER("SEND_TO_MESSENGER"),
    BUTTON_CLICK("BUTTON_CLICK"),
    QUICK_REPLY_CLICK("QUICK_REPLY_CLICK"),
    OPTIN("OPTIN"),
    WELCOME("WELCOME"),
    MARKETING_CAMPAIGN("MARKETING_CAMPAIGN"),
    MARKETING_CAMPAIGN_PRE_ORDER("MARKETING_CAMPAIGN_PRE_ORDER"),
    SYSTEM("SYSTEM"),
    SMPP("SMPP"),
    ORDER_NOTICE_STRATEGY("ORDER_NOTICE_STRATEGY"),
    SHOPIFY_MARKETING_PLUGIN("SHOPIFY_MARKETING_PLUGIN"),
    ABANDONED_PURCHASE_STRATEGY("ABANDONED_PURCHASE_STRATEGY"),
    ORDER_UPDATE_NOTICE_STRATEGY("ORDER_UPDATE_NOTICE_STRATEGY"),
    PERIODIC_GROUP_CUSTOMER_STRATEGY("PERIODIC_GROUP_CUSTOMER_STRATEGY"),
    NEW_CUSTOMER_ACTIVATION_STRATEGY("NEW_CUSTOMER_ACTIVATION_STRATEGY"),
    USER_INFO_STRATEGY("USER_INFO_STRATEGY"),
    APP_SYNC("APP_SYNC"),
    CTWA_SESSION_OPENED_STRATEGY("CTWA_SESSION_OPENED_STRATEGY"),
    OPEN_API_V2("OPEN_API_V2"),
    OPEN_API_V2_CUSTOMIZE("OPEN_API_V2_CUSTOMIZE"),
    CUSTOM_PERIODICALLY("CUSTOM_PERIODICALLY"),
    OTHER_APP("OTHER_APP"),
    DIALOGUE("DIALOGUE");

    private final String value;

    MessageOriginType(String value) {
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
    public static MessageOriginType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (MessageOriginType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
