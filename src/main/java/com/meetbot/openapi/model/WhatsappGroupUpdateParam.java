package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 官方请求参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupUpdateParam {

    /**
     * 消息产品，固定为 whatsapp
     * Required.
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * 群组名称
     */
    private String subject;

    /**
     * 群组描述
     */
    private String description;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappGroupUpdateParam messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public WhatsappGroupUpdateParam subject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhatsappGroupUpdateParam description(String description) {
        this.description = description;
        return this;
    }
}
