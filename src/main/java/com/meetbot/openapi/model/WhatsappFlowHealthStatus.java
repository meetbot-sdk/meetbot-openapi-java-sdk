package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Flow 健康状态。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowHealthStatus extends ExtensibleDto {

    @JsonProperty("can_send_message")
    private String canSendMessage;

    private List<WhatsappFlowHealthEntity> entities;

    public String getCanSendMessage() {
        return canSendMessage;
    }

    public void setCanSendMessage(String canSendMessage) {
        this.canSendMessage = canSendMessage;
    }

    public List<WhatsappFlowHealthEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<WhatsappFlowHealthEntity> entities) {
        this.entities = entities;
    }
}
