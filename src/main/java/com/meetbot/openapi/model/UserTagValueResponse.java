package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTagValueResponse {

    /**
     * 标签值ID
     */
    private String valueId;

    /**
     * 标签值名称
     */
    private String value;

    /**
     * 标签值描述
     */
    private String description;

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public UserTagValueResponse valueId(String valueId) {
        this.valueId = valueId;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UserTagValueResponse value(String value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTagValueResponse description(String description) {
        this.description = description;
        return this;
    }

}
