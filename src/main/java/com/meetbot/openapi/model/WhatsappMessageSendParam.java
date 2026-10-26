package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.WhatsappMessageType;
import com.meetbot.openapi.model.enums.WhatsappRecipientType;

import java.util.List;

/**
 * Meta Cloud API 发送消息请求体（Meetbot {@code SendMessageRequest.param}）。
 *
 * <p>{@code to}（手机号）与 {@code recipient}（BSUID / parent BSUID）至少填一个；两者都传时 {@code to} 优先。
 * 一键/零点击/复制验证码类认证模板仍须使用手机号，不能只用 BSUID。
 *
 * <p>通用结构：
 * <pre>
 * {
 *   "messaging_product": "whatsapp",
 *   "recipient_type": "individual",
 *   "to": "&lt;WHATSAPP_USER_PHONE_NUMBER&gt;",
 *   "recipient": "&lt;BSUID&gt;",
 *   "type": "&lt;MESSAGE_TYPE&gt;",
 *   "&lt;MESSAGE_TYPE&gt;": { ... }
 * }
 * </pre>
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/reference/whatsapp-business-phone-number/message-api">Message API</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappMessageSendParam extends ExtensibleDto {

    /**
     * 固定 {@code whatsapp}。
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct = "whatsapp";

    @JsonProperty("recipient_type")
    private WhatsappRecipientType recipientType;

    /**
     * 用户 WhatsApp 号码（建议含国家码与 {@code +}）。
     * 未传 {@link #recipient} 时必填；与 {@code recipient} 同时传时本字段优先。
     */
    private String to;

    /**
     * 用户的 WhatsApp Business-scoped user ID（BSUID）或 parent BSUID。
     * 未传 {@link #to} 时必填。格式如 {@code US.13491208655302741918}（parent 为 {@code US.ENT....}）。
     *
     * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a>
     */
    private String recipient;

    /**
     * 消息类型，且必须同时设置同名内容对象。
     * Required.
     */
    private WhatsappMessageType type;

    private WhatsappContextObject context;

    @JsonProperty("biz_opaque_callback_data")
    private String bizOpaqueCallbackData;

    private WhatsappTextObject text;
    private WhatsappMediaObject image;
    private WhatsappMediaObject audio;
    private WhatsappMediaObject document;
    private WhatsappMediaObject video;
    private WhatsappMediaObject sticker;
    private WhatsappLocationObject location;
    private List<WhatsappContactObject> contacts;
    private WhatsappInteractiveObject interactive;
    private WhatsappTemplateSendObject template;
    private WhatsappReactionObject reaction;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappMessageSendParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public WhatsappRecipientType getRecipientType() {
        return recipientType;
    }

    public void setRecipientType(WhatsappRecipientType recipientType) {
        this.recipientType = recipientType;
    }

    public WhatsappMessageSendParam recipientType(WhatsappRecipientType recipientType) {
        this.recipientType = recipientType;
        return this;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public WhatsappMessageSendParam to(String to) {
        this.to = to;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public WhatsappMessageSendParam recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public WhatsappMessageType getType() {
        return type;
    }

    public void setType(WhatsappMessageType type) {
        this.type = type;
    }

    public WhatsappMessageSendParam type(WhatsappMessageType type) {
        this.type = type;
        return this;
    }

    public WhatsappContextObject getContext() {
        return context;
    }

    public void setContext(WhatsappContextObject context) {
        this.context = context;
    }

    public WhatsappMessageSendParam context(WhatsappContextObject context) {
        this.context = context;
        return this;
    }

    public String getBizOpaqueCallbackData() {
        return bizOpaqueCallbackData;
    }

    public void setBizOpaqueCallbackData(String bizOpaqueCallbackData) {
        this.bizOpaqueCallbackData = bizOpaqueCallbackData;
    }

    public WhatsappMessageSendParam bizOpaqueCallbackData(String bizOpaqueCallbackData) {
        this.bizOpaqueCallbackData = bizOpaqueCallbackData;
        return this;
    }

    public WhatsappTextObject getText() {
        return text;
    }

    public void setText(WhatsappTextObject text) {
        this.text = text;
    }

    public WhatsappMessageSendParam text(WhatsappTextObject text) {
        this.text = text;
        return this;
    }

    public WhatsappMediaObject getImage() {
        return image;
    }

    public void setImage(WhatsappMediaObject image) {
        this.image = image;
    }

    public WhatsappMessageSendParam image(WhatsappMediaObject image) {
        this.image = image;
        return this;
    }

    public WhatsappMediaObject getAudio() {
        return audio;
    }

    public void setAudio(WhatsappMediaObject audio) {
        this.audio = audio;
    }

    public WhatsappMessageSendParam audio(WhatsappMediaObject audio) {
        this.audio = audio;
        return this;
    }

    public WhatsappMediaObject getDocument() {
        return document;
    }

    public void setDocument(WhatsappMediaObject document) {
        this.document = document;
    }

    public WhatsappMessageSendParam document(WhatsappMediaObject document) {
        this.document = document;
        return this;
    }

    public WhatsappMediaObject getVideo() {
        return video;
    }

    public void setVideo(WhatsappMediaObject video) {
        this.video = video;
    }

    public WhatsappMessageSendParam video(WhatsappMediaObject video) {
        this.video = video;
        return this;
    }

    public WhatsappMediaObject getSticker() {
        return sticker;
    }

    public void setSticker(WhatsappMediaObject sticker) {
        this.sticker = sticker;
    }

    public WhatsappMessageSendParam sticker(WhatsappMediaObject sticker) {
        this.sticker = sticker;
        return this;
    }

    public WhatsappLocationObject getLocation() {
        return location;
    }

    public void setLocation(WhatsappLocationObject location) {
        this.location = location;
    }

    public WhatsappMessageSendParam location(WhatsappLocationObject location) {
        this.location = location;
        return this;
    }

    public List<WhatsappContactObject> getContacts() {
        return contacts;
    }

    public void setContacts(List<WhatsappContactObject> contacts) {
        this.contacts = contacts;
    }

    public WhatsappMessageSendParam contacts(List<WhatsappContactObject> contacts) {
        this.contacts = contacts;
        return this;
    }

    public WhatsappInteractiveObject getInteractive() {
        return interactive;
    }

    public void setInteractive(WhatsappInteractiveObject interactive) {
        this.interactive = interactive;
    }

    public WhatsappMessageSendParam interactive(WhatsappInteractiveObject interactive) {
        this.interactive = interactive;
        return this;
    }

    public WhatsappTemplateSendObject getTemplate() {
        return template;
    }

    public void setTemplate(WhatsappTemplateSendObject template) {
        this.template = template;
    }

    public WhatsappMessageSendParam template(WhatsappTemplateSendObject template) {
        this.template = template;
        return this;
    }

    public WhatsappReactionObject getReaction() {
        return reaction;
    }

    public void setReaction(WhatsappReactionObject reaction) {
        this.reaction = reaction;
    }

    public WhatsappMessageSendParam reaction(WhatsappReactionObject reaction) {
        this.reaction = reaction;
        return this;
    }
}
