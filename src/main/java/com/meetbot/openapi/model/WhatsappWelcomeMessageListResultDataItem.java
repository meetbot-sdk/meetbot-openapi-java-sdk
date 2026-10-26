package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsappWelcomeMessageListResultDataItem
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappWelcomeMessageListResultDataItem extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * welcome_message_sequence
     */
    @JsonProperty("welcome_message_sequence")
    private WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence welcomeMessageSequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappWelcomeMessageListResultDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappWelcomeMessageListResultDataItem name(String name) {
        this.name = name;
        return this;
    }

    public WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence getWelcomeMessageSequence() {
        return welcomeMessageSequence;
    }

    public void setWelcomeMessageSequence(WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
    }

    public WhatsappWelcomeMessageListResultDataItem welcomeMessageSequence(WhatsappWelcomeMessageListResultDataItemWelcomeMessageSequence welcomeMessageSequence) {
        this.welcomeMessageSequence = welcomeMessageSequence;
        return this;
    }
}
