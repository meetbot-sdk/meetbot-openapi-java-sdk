package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * WhatsApp Calling 接口响应。connect 成功时 {@code calls[0].id} 为通话 ID。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappCallingResult extends ExtensibleDto {

    private Boolean success;

    @JsonProperty("messaging_product")
    private String messagingProduct;

    private List<WhatsappCallRef> calls;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public List<WhatsappCallRef> getCalls() {
        return calls;
    }

    public void setCalls(List<WhatsappCallRef> calls) {
        this.calls = calls;
    }
}
