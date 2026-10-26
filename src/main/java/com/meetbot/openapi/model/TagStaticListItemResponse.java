package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.TagValueType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagStaticListItemResponse {

    /**
     * 标签ID
     */
    private String tagId;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签描述
     */
    private String description;

    /**
     * 值类型（STRING/NUMBER/TIME）
     */
    private TagValueType valueType;

    /**
     * 所属分类ID
     */
    private String categoryId;

    /**
     * 是否同步客服工作台
     */
    private Boolean syncToCustomerService;

    /**
     * 是否系统标签
     */
    private Boolean system;

    /**
     * 创建时间（毫秒）
     */
    private Long createTime;

    /**
     * 更新时间（毫秒）
     */
    private Long updateTime;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public TagStaticListItemResponse tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagStaticListItemResponse name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagStaticListItemResponse description(String description) {
        this.description = description;
        return this;
    }

    public TagValueType getValueType() {
        return valueType;
    }

    public void setValueType(TagValueType valueType) {
        this.valueType = valueType;
    }

    public TagStaticListItemResponse valueType(TagValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public TagStaticListItemResponse categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Boolean getSyncToCustomerService() {
        return syncToCustomerService;
    }

    public void setSyncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
    }

    public TagStaticListItemResponse syncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
        return this;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public TagStaticListItemResponse system(Boolean system) {
        this.system = system;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TagStaticListItemResponse createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public TagStaticListItemResponse updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
