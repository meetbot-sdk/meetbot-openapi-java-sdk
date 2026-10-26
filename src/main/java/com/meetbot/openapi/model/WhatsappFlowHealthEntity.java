package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Flow 健康状态中的实体。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowHealthEntity extends ExtensibleDto {

    @JsonProperty("entity_type")
    private String entityType;

    private String id;

    @JsonProperty("can_send_message")
    private String canSendMessage;

    private List<MetaValidationError> errors;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCanSendMessage() {
        return canSendMessage;
    }

    public void setCanSendMessage(String canSendMessage) {
        this.canSendMessage = canSendMessage;
    }

    public List<MetaValidationError> getErrors() {
        return errors;
    }

    public void setErrors(List<MetaValidationError> errors) {
        this.errors = errors;
    }
}
