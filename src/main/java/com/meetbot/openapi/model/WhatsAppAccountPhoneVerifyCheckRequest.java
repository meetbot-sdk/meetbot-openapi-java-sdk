package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsAppAccountPhoneVerifyCheckRequest {

    /**
     * whatsapp手机号id
     * Required.
     */
    private String phoneNumberId;

    /**
     * 请求的验证码
     * Required.
     */
    private String code;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsAppAccountPhoneVerifyCheckRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WhatsAppAccountPhoneVerifyCheckRequest code(String code) {
        this.code = code;
        return this;
    }

}
