package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagValueResponse {

    /**
     * 标签值ID
     */
    private String id;

    /**
     * 标签值名称
     */
    private String value;

    /**
     * 标签值描述
     */
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TagValueResponse id(String id) {
        this.id = id;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TagValueResponse value(String value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagValueResponse description(String description) {
        this.description = description;
        return this;
    }

}
