package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsAppAccountPhoneVerifySendRequest {

    /**
     * 语种，取值可参考官方文档language字段，不填默认为en
     */
    private String language;

    /**
     * whatsapp手机号id
     * Required.
     */
    private String phoneNumberId;

    /**
     * 具体参考官方文档code_method字段
     * Required.
     */
    private String codeMethod;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsAppAccountPhoneVerifySendRequest language(String language) {
        this.language = language;
        return this;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public WhatsAppAccountPhoneVerifySendRequest phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public String getCodeMethod() {
        return codeMethod;
    }

    public void setCodeMethod(String codeMethod) {
        this.codeMethod = codeMethod;
    }

    public WhatsAppAccountPhoneVerifySendRequest codeMethod(String codeMethod) {
        this.codeMethod = codeMethod;
        return this;
    }

}
