package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 透传 Meta Calling API 请求体。call_id 来自 calls_connect 回调；action 固定 pre_accept；session.sdp_type 为 answer。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#pre-accept-call)。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingPreAcceptParam {

    /** Required. */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 通话 ID（wacid），来自用户来电 calls_connect 回调
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

    public WhatsappCallingPreAcceptParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public WhatsappCallingPreAcceptParam callId(String callId) {
        this.callId = callId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WhatsappCallingPreAcceptParam action(String action) {
        this.action = action;
        return this;
    }

    public WhatsappCallingSession getSession() {
        return session;
    }

    public void setSession(WhatsappCallingSession session) {
        this.session = session;
    }

    public WhatsappCallingPreAcceptParam session(WhatsappCallingSession session) {
        this.session = session;
        return this;
    }

}
