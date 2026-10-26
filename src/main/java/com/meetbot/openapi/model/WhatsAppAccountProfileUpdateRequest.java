package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 更新 WhatsApp 商业资料。{@code param} 为 Meta 官方字段。
 *
 * @see <a href="https://developers.meetbot.com/#/operations/whatsappAccountProfileUpdate">whatsappAccountProfileUpdate</a>
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles">Business profiles</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsAppAccountProfileUpdateRequest {

    /**
     * waba手机号id
     * Required.
     */
    private String phoneNumberId;

    /**
     * Meta 商业资料更新对象。
     * Required.
     */
    private WhatsappBusinessProfileUpdateParam param;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsAppAccountProfileUpdateRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public WhatsappBusinessProfileUpdateParam getParam() {
        return param;
    }

    public void setParam(WhatsappBusinessProfileUpdateParam param) {
        this.param = param;
    }

    public WhatsAppAccountProfileUpdateRequest param(WhatsappBusinessProfileUpdateParam param) {
        this.param = param;
        return this;
    }
}
