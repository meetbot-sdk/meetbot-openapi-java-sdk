package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 透传 Meta Calling API 请求体。action 固定 reject，无需 session。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/calling/user-initiated-calls#reject-call)。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingRejectParam {

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

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappCallingRejectParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public WhatsappCallingRejectParam callId(String callId) {
        this.callId = callId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WhatsappCallingRejectParam action(String action) {
        this.action = action;
        return this;
    }

}
