package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 发送模板消息时的 language 对象。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateLanguageObject extends ExtensibleDto {

    /** 语言码，如 {@code en}、{@code zh_CN}。Required. */
    private String code;

    /** 通常为 {@code deterministic}。 */
    private String policy;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WhatsappTemplateLanguageObject code(String code) {
        this.code = code;
        return this;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public WhatsappTemplateLanguageObject policy(String policy) {
        this.policy = policy;
        return this;
    }
}
