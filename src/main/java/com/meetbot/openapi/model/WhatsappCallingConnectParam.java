package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 透传 Meta Calling API 请求体，字段名与官方一致。
 * {@code messaging_product} 固定 {@code whatsapp}；{@code action} 固定 {@code connect}；{@code session.sdp_type} 为 {@code offer}。
 * {@code to}（手机号）与 {@code recipient}（BSUID / parent BSUID）至少填一个，同时传时 {@code to} 优先。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/business-initiated-calls#endpoints-for-business-initiated-calling">Business-initiated calling</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingConnectParam {

    /** Required. */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 被叫用户 WhatsApp 号码。未传 {@link #recipient} 时必填；与 {@code recipient} 同时传时本字段优先。
     */
    private String to;

    /**
     * 被叫用户的 BSUID 或 parent BSUID。未传 {@link #to} 时必填。
     *
     * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-scoped-user-ids">Business-scoped user IDs</a>
     */
    private String recipient;

    /** Required. */
    private String action;

    /** Required. */
    private WhatsappCallingSession session;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappCallingConnectParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public WhatsappCallingConnectParam to(String to) {
        this.to = to;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public WhatsappCallingConnectParam recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WhatsappCallingConnectParam action(String action) {
        this.action = action;
        return this;
    }

    public WhatsappCallingSession getSession() {
        return session;
    }

    public void setSession(WhatsappCallingSession session) {
        this.session = session;
    }

    public WhatsappCallingConnectParam session(WhatsappCallingSession session) {
        this.session = session;
        return this;
    }

}
