package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 文本消息对象。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/text-messages">Text messages</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTextObject extends ExtensibleDto {

    /**
     * 是否渲染正文中的 URL 预览。
     * <p>仅当 {@code body} 含 URL 且本字段为 {@code true} 时，WhatsApp 才会展示链接预览。
     */
    @JsonProperty("preview_url")
    private Boolean previewUrl;

    /**
     * 文本正文，最长 4096 个字符。
     * Required.
     */
    private String body;

    public Boolean getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(Boolean previewUrl) {
        this.previewUrl = previewUrl;
    }

    public WhatsappTextObject previewUrl(Boolean previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WhatsappTextObject body(String body) {
        this.body = body;
        return this;
    }
}
