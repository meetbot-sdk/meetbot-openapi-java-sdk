package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatAppAccountProfileRequest {

    /**
     * waba手机号id
     * Required.
     */
    private String phoneNumberId;

    /**
     * 需要返回的字段，具体字段参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/business-profiles#get-your-business-profile)，不填返回默认字段列表
     */
    private java.util.List<String> fields;

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatAppAccountProfileRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public java.util.List<String> getFields() {
        return fields;
    }

    public void setFields(java.util.List<String> fields) {
        this.fields = fields;
    }

    public WhatAppAccountProfileRequest fields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }

}
