package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateStaticTagRequest {

    /**
     * 标签ID
     * Required.
     */
    private String tagId;

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
     * 标签描述
     */
    private String description;

    /**
     * 标签值列表
     */
    private java.util.List<UpdateStaticTagRequestValuesItem> values;

    /**
     * 是否同步客服工作台
     */
    private Boolean syncToCustomerService;

    /**
     * 乐观锁（毫秒时间戳）
     * Required.
     */
    private Long updateTime;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public UpdateStaticTagRequest tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateStaticTagRequest name(String name) {
        this.name = name;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public UpdateStaticTagRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateStaticTagRequest description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<UpdateStaticTagRequestValuesItem> getValues() {
        return values;
    }

    public void setValues(java.util.List<UpdateStaticTagRequestValuesItem> values) {
        this.values = values;
    }

    public UpdateStaticTagRequest values(java.util.List<UpdateStaticTagRequestValuesItem> values) {
        this.values = values;
        return this;
    }

    public Boolean getSyncToCustomerService() {
        return syncToCustomerService;
    }

    public void setSyncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
    }

    public UpdateStaticTagRequest syncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateStaticTagRequest updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
