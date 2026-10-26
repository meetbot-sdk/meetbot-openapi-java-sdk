package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.WhatsappTemplateCategory;

import java.util.List;

/**
 * Meta 创建/编辑消息模板请求体（Meetbot {@code param}）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/reference/whatsapp-business-account/message-template-api">Message Template API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappMessageTemplateParam extends ExtensibleDto {

    /** 模板名称。Required. */
    private String name;

    /** 语言码，如 {@code en}、{@code zh_CN}。Required. */
    private String language;

    /** Required. */
    private WhatsappTemplateCategory category;

    @JsonProperty("parameter_format")
    private String parameterFormat;

    @JsonProperty("allow_category_change")
    private Boolean allowCategoryChange;

    @JsonProperty("library_template_name")
    private String libraryTemplateName;

    @JsonProperty("message_send_ttl_seconds")
    private Integer messageSendTtlSeconds;

    private List<WhatsappTemplateComponent> components;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappMessageTemplateParam name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappMessageTemplateParam language(String language) {
        this.language = language;
        return this;
    }

    public WhatsappTemplateCategory getCategory() {
        return category;
    }

    public void setCategory(WhatsappTemplateCategory category) {
        this.category = category;
    }

    public WhatsappMessageTemplateParam category(WhatsappTemplateCategory category) {
        this.category = category;
        return this;
    }

    public String getParameterFormat() {
        return parameterFormat;
    }

    public void setParameterFormat(String parameterFormat) {
        this.parameterFormat = parameterFormat;
    }

    public WhatsappMessageTemplateParam parameterFormat(String parameterFormat) {
        this.parameterFormat = parameterFormat;
        return this;
    }

    public Boolean getAllowCategoryChange() {
        return allowCategoryChange;
    }

    public void setAllowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
    }

    public WhatsappMessageTemplateParam allowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
        return this;
    }

    public String getLibraryTemplateName() {
        return libraryTemplateName;
    }

    public void setLibraryTemplateName(String libraryTemplateName) {
        this.libraryTemplateName = libraryTemplateName;
    }

    public WhatsappMessageTemplateParam libraryTemplateName(String libraryTemplateName) {
        this.libraryTemplateName = libraryTemplateName;
        return this;
    }

    public Integer getMessageSendTtlSeconds() {
        return messageSendTtlSeconds;
    }

    public void setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
    }

    public WhatsappMessageTemplateParam messageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }

    public List<WhatsappTemplateComponent> getComponents() {
        return components;
    }

    public void setComponents(List<WhatsappTemplateComponent> components) {
        this.components = components;
    }

    public WhatsappMessageTemplateParam components(List<WhatsappTemplateComponent> components) {
        this.components = components;
        return this;
    }
}
