package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStaticTagRequestValuesItem {

    /**
     * 标签值名称
     * Required.
     */
    private String value;

    /**
     * 标签值描述
     */
    private String description;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CreateStaticTagRequestValuesItem value(String value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStaticTagRequestValuesItem description(String description) {
        this.description = description;
        return this;
    }

}
