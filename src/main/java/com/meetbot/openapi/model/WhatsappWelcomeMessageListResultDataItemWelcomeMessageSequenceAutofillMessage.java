package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage extends ExtensibleDto {

    /**
     * content
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequenceAutofillMessage content(String content) {
        this.content = content;
        return this;
    }
}
