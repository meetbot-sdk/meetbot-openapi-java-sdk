package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplatePreviewResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplatePreviewResultDataItem extends ExtensibleDto {

    /**
     * body
     */
    private String body;

    /**
     * buttons
     */
    private java.util.List<WhatsappTemplatePreviewResultDataItemButtonsItem> buttons;

    /**
     * footer
     */
    private String footer;

    /**
     * language
     */
    private String language;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WhatsappTemplatePreviewResultDataItem body(String body) {
        this.body = body;
        return this;
    }

    public java.util.List<WhatsappTemplatePreviewResultDataItemButtonsItem> getButtons() {
        return buttons;
    }

    public void setButtons(java.util.List<WhatsappTemplatePreviewResultDataItemButtonsItem> buttons) {
        this.buttons = buttons;
    }

    public WhatsappTemplatePreviewResultDataItem buttons(java.util.List<WhatsappTemplatePreviewResultDataItemButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public WhatsappTemplatePreviewResultDataItem footer(String footer) {
        this.footer = footer;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WhatsappTemplatePreviewResultDataItem language(String language) {
        this.language = language;
        return this;
    }
}
