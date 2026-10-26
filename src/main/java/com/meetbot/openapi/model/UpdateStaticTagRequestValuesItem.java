package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateStaticTagRequestValuesItem {

    /**
     * 值ID（更新已有值必传）
     */
    private String id;

    /**
     * 标签值名称
     * Required.
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

    public UpdateStaticTagRequestValuesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UpdateStaticTagRequestValuesItem value(String value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateStaticTagRequestValuesItem description(String description) {
        this.description = description;
        return this;
    }

}
