package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建 Flow / 更新 Flow JSON 响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowMutationResult extends ExtensibleDto {

    private String id;
    private Boolean success;

    @JsonProperty("validation_errors")
    private List<MetaValidationError> validationErrors;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<MetaValidationError> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<MetaValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
