package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 查询企业公钥响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowEncryptionResult extends ExtensibleDto {

    @JsonProperty("business_public_key")
    private String businessPublicKey;

    @JsonProperty("business_public_key_status")
    private String businessPublicKeyStatus;

    public String getBusinessPublicKey() {
        return businessPublicKey;
    }

    public void setBusinessPublicKey(String businessPublicKey) {
        this.businessPublicKey = businessPublicKey;
    }

    public String getBusinessPublicKeyStatus() {
        return businessPublicKeyStatus;
    }

    public void setBusinessPublicKeyStatus(String businessPublicKeyStatus) {
        this.businessPublicKeyStatus = businessPublicKeyStatus;
    }
}
