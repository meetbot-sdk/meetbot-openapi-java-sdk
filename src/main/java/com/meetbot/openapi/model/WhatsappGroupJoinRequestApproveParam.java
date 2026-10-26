package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 官方请求参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupJoinRequestApproveParam {

    /**
     * 消息产品，固定为 whatsapp
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 待处理的加入申请 ID
     * Required.
     */
    @JsonProperty("join_requests")
    private java.util.List<String> joinRequests;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappGroupJoinRequestApproveParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public java.util.List<String> getJoinRequests() {
        return joinRequests;
    }

    public void setJoinRequests(java.util.List<String> joinRequests) {
        this.joinRequests = joinRequests;
    }

    public WhatsappGroupJoinRequestApproveParam joinRequests(java.util.List<String> joinRequests) {
        this.joinRequests = joinRequests;
        return this;
    }
}
