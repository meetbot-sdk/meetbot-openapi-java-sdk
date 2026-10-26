package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Flow 校验错误项。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaValidationError extends ExtensibleDto {

    @JsonProperty("error_code")
    private String errorCode;

    @JsonProperty("error_description")
    private String errorDescription;

    @JsonProperty("possible_solution")
    private String possibleSolution;

    private String message;
    private List<Map<String, Object>> pointers;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getPossibleSolution() {
        return possibleSolution;
    }

    public void setPossibleSolution(String possibleSolution) {
        this.possibleSolution = possibleSolution;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Map<String, Object>> getPointers() {
        return pointers;
    }

    public void setPointers(List<Map<String, Object>> pointers) {
        this.pointers = pointers;
    }
}
