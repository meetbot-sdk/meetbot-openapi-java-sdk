package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappTemplatePreviewResultDataItemButtonsItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplatePreviewResultDataItemButtonsItem extends ExtensibleDto {

    /**
     * autofill_text
     */
    @JsonProperty("autofill_text")
    private String autofillText;

    /**
     * text
     */
    private String text;

    public String getAutofillText() {
        return autofillText;
    }

    public void setAutofillText(String autofillText) {
        this.autofillText = autofillText;
    }

    public WhatsappTemplatePreviewResultDataItemButtonsItem autofillText(String autofillText) {
        this.autofillText = autofillText;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WhatsappTemplatePreviewResultDataItemButtonsItem text(String text) {
        this.text = text;
        return this;
    }
}
