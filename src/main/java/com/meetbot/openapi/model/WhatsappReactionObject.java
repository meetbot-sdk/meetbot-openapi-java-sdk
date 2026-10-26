package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 表情回复对象。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappReactionObject extends ExtensibleDto {

    /** 被回复消息的 wamid。Required. */
    @JsonProperty("message_id")
    private String messageId;

    /** emoji，空字符串表示取消表情。Required. */
    private String emoji;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public WhatsappReactionObject messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public WhatsappReactionObject emoji(String emoji) {
        this.emoji = emoji;
        return this;
    }
}
