package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * WhatsApp 模板 component（HEADER / BODY / FOOTER / BUTTONS 等）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateComponent extends ExtensibleDto {

    /** {@code HEADER} / {@code BODY} / {@code FOOTER} / {@code BUTTONS} / {@code CAROUSEL} 等。 */
    private String type;
    private String text;
    /** HEADER 格式：{@code TEXT} / {@code IMAGE} / {@code VIDEO} / {@code DOCUMENT} / {@code LOCATION}。 */
    private String format;
    private WhatsappTemplateExample example;
    private List<WhatsappTemplateButton> buttons;

    @JsonProperty("add_security_recommendation")
    private Boolean addSecurityRecommendation;

    @JsonProperty("code_expiration_minutes")
    private Integer codeExpirationMinutes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsappTemplateComponent type(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WhatsappTemplateComponent text(String text) {
        this.text = text;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public WhatsappTemplateComponent format(String format) {
        this.format = format;
        return this;
    }

    public WhatsappTemplateExample getExample() {
        return example;
    }

    public void setExample(WhatsappTemplateExample example) {
        this.example = example;
    }

    public WhatsappTemplateComponent example(WhatsappTemplateExample example) {
        this.example = example;
        return this;
    }

    public List<WhatsappTemplateButton> getButtons() {
        return buttons;
    }

    public void setButtons(List<WhatsappTemplateButton> buttons) {
        this.buttons = buttons;
    }

    public WhatsappTemplateComponent buttons(List<WhatsappTemplateButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Boolean getAddSecurityRecommendation() {
        return addSecurityRecommendation;
    }

    public void setAddSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
    }

    public WhatsappTemplateComponent addSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
        return this;
    }

    public Integer getCodeExpirationMinutes() {
        return codeExpirationMinutes;
    }

    public void setCodeExpirationMinutes(Integer codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
    }

    public WhatsappTemplateComponent codeExpirationMinutes(Integer codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
        return this;
    }
}
