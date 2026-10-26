package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 上下文回复：引用此前一条消息。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappContextObject extends ExtensibleDto {

    @JsonProperty("message_id")
    private String messageId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public WhatsappContextObject messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
}
