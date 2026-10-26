package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.TagValueType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStaticTagRequest {

    /**
     * 标签名称
     * Required.
     */
    private String name;

    /**
     * 所属分类ID
     * Required.
     */
    private String categoryId;

    /**
     * 值类型（STRING/NUMBER/TIME）
     * Required.
     */
    private TagValueType valueType;

    /**
     * 标签描述
     */
    private String description;

    /**
     * 标签可选值列表
     */
    private java.util.List<CreateStaticTagRequestValuesItem> values;

    /**
     * 是否同步客服工作台
     */
    private Boolean syncToCustomerService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateStaticTagRequest name(String name) {
        this.name = name;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public CreateStaticTagRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public TagValueType getValueType() {
        return valueType;
    }

    public void setValueType(TagValueType valueType) {
        this.valueType = valueType;
    }

    public CreateStaticTagRequest valueType(TagValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateStaticTagRequest description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<CreateStaticTagRequestValuesItem> getValues() {
        return values;
    }

    public void setValues(java.util.List<CreateStaticTagRequestValuesItem> values) {
        this.values = values;
    }

    public CreateStaticTagRequest values(java.util.List<CreateStaticTagRequestValuesItem> values) {
        this.values = values;
        return this;
    }

    public Boolean getSyncToCustomerService() {
        return syncToCustomerService;
    }

    public void setSyncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
    }

    public CreateStaticTagRequest syncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
        return this;
    }

}
