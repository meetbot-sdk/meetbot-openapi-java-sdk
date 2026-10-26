package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Meta Cloud API 发送消息 {@code type}。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
public enum WhatsappMessageType {

    TEXT("text"),
    IMAGE("image"),
    AUDIO("audio"),
    DOCUMENT("document"),
    VIDEO("video"),
    STICKER("sticker"),
    LOCATION("location"),
    CONTACTS("contacts"),
    INTERACTIVE("interactive"),
    TEMPLATE("template"),
    REACTION("reaction");

    private final String value;

    WhatsappMessageType(String value) {
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
    public static WhatsappMessageType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WhatsappMessageType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
