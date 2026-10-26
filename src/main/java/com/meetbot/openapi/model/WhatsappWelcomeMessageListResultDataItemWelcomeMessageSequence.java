package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence extends ExtensibleDto {

    /**
     * text
     */
    private String text;

    /**
     * autofill_message
     */
    @JsonProperty("autofill_message")
    private WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage autofillMessage;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence text(String text) {
        this.text = text;
        return this;
    }

    public WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage getAutofillMessage() {
        return autofillMessage;
    }

    public void setAutofillMessage(WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage autofillMessage) {
        this.autofillMessage = autofillMessage;
    }

    public WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence autofillMessage(WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage autofillMessage) {
        this.autofillMessage = autofillMessage;
        return this;
    }
}
