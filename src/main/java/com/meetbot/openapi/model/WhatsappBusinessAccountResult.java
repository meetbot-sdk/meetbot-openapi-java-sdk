package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WABA 信息和状态查询响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappBusinessAccountResult extends ExtensibleDto {

    @JsonProperty("message_template_namespace")
    private String messageTemplateNamespace;

    private String name;

    @JsonProperty("timezone_id")
    private String timezoneId;

    private String currency;
    private String id;

    public String getMessageTemplateNamespace() {
        return messageTemplateNamespace;
    }

    public void setMessageTemplateNamespace(String messageTemplateNamespace) {
        this.messageTemplateNamespace = messageTemplateNamespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
