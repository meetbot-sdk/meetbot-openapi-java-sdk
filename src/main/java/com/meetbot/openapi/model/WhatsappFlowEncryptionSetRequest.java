package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowEncryptionSetRequest {

    /**
     * WhatsApp Phone Number ID
     * Required.
     */
    private String phoneNumberId;

    /**
     * 2048位企业公钥，PEM格式。用于Flows端到端加密。当Flow使用Data Exchange Endpoint（指定了endpoint_uri）时，必须在发布前通过此接口设置公钥。
     * Required.
     */
    private String businessPublicKey;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsappFlowEncryptionSetRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public String getBusinessPublicKey() {
        return businessPublicKey;
    }

    public void setBusinessPublicKey(String businessPublicKey) {
        this.businessPublicKey = businessPublicKey;
    }

    public WhatsappFlowEncryptionSetRequest businessPublicKey(String businessPublicKey) {
        this.businessPublicKey = businessPublicKey;
        return this;
    }

}
