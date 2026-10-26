package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 操作成功回执（success / messaging_product）。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaSuccessResult extends ExtensibleDto {

    private Boolean success;

    @JsonProperty("messaging_product")
    private String messagingProduct;

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
}
