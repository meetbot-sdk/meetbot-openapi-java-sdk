package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 发送模板消息时的 {@code template} 对象。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateSendObject extends ExtensibleDto {

    /** 模板名称。Required. */
    private String name;

    /** Required. */
    private WhatsappTemplateLanguageObject language;

    private List<WhatsappTemplateSendComponent> components;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateSendObject name(String name) {
        this.name = name;
        return this;
    }

    public WhatsappTemplateLanguageObject getLanguage() {
        return language;
    }

    public void setLanguage(WhatsappTemplateLanguageObject language) {
        this.language = language;
    }

    public WhatsappTemplateSendObject language(WhatsappTemplateLanguageObject language) {
        this.language = language;
        return this;
    }

    public List<WhatsappTemplateSendComponent> getComponents() {
        return components;
    }

    public void setComponents(List<WhatsappTemplateSendComponent> components) {
        this.components = components;
    }

    public WhatsappTemplateSendObject components(List<WhatsappTemplateSendComponent> components) {
        this.components = components;
        return this;
    }
}
