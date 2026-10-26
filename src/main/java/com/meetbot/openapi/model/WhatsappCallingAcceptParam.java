package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 透传 Meta Calling API 请求体。action 固定 accept；session 与 preAccept 使用同一份 SDP Answer。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#accept-call)。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingAcceptParam {

    /** Required. */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 通话 ID（wacid）
     * Required.
     */
    @JsonProperty("call_id")
    private String callId;

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

    public WhatsappCallingAcceptParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public WhatsappCallingAcceptParam callId(String callId) {
        this.callId = callId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WhatsappCallingAcceptParam action(String action) {
        this.action = action;
        return this;
    }

    public WhatsappCallingSession getSession() {
        return session;
    }

    public void setSession(WhatsappCallingSession session) {
        this.session = session;
    }

    public WhatsappCallingAcceptParam session(WhatsappCallingSession session) {
        this.session = session;
        return this;
    }

}
