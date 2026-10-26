package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * result 为 boolean 的响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BooleanResult {

    private Boolean success;

    public BooleanResult() {
    }

    @JsonCreator
    public BooleanResult(Boolean success) {
        this.success = success;
    }

    @JsonValue
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public boolean isTrue() {
        return Boolean.TRUE.equals(success);
    }
}
