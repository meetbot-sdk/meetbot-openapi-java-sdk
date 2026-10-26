package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 官方请求参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupParticipantsRemoveParam {

    /**
     * 消息产品，固定为 whatsapp
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 待移除的群组成员
     * Required.
     */
    private java.util.List<WhatsappGroupParticipantsRemoveParamParticipantsItem> participants;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappGroupParticipantsRemoveParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public java.util.List<WhatsappGroupParticipantsRemoveParamParticipantsItem> getParticipants() {
        return participants;
    }

    public void setParticipants(java.util.List<WhatsappGroupParticipantsRemoveParamParticipantsItem> participants) {
        this.participants = participants;
    }

    public WhatsappGroupParticipantsRemoveParam participants(java.util.List<WhatsappGroupParticipantsRemoveParamParticipantsItem> participants) {
        this.participants = participants;
        return this;
    }
}
