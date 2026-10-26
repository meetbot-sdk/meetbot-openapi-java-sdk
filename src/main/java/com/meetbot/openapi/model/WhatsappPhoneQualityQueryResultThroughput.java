package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappPhoneQualityQueryResultThroughput
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappPhoneQualityQueryResultThroughput extends ExtensibleDto {

    /**
     * level
     */
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public WhatsappPhoneQualityQueryResultThroughput level(String level) {
        this.level = level;
        return this;
    }
}
