package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 官方请求参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupInviteLinkResetParam {

    /**
     * 消息产品，固定为 whatsapp
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappGroupInviteLinkResetParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }
}
