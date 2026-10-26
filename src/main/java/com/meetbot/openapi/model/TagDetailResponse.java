package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.TagValueType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TagDetailResponse {

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
     * 所属分类ID
     */
    private String categoryId;

    /**
     * 所属分类名称
     */
    private String categoryName;

    /**
     * 值类型（STRING/NUMBER/TIME）
     */
    private TagValueType valueType;

    /**
     * 是否同步客服工作台
     */
    private Boolean syncToCustomerService;

    /**
     * 创建时间（毫秒）
     */
    private Long createTime;

    /**
     * 更新时间（毫秒）
     */
    private Long updateTime;

    /**
     * 标签值列表
     */
    private java.util.List<TagValueResponse> tagValues;

    /**
     * 是否系统标签
     */
    private Boolean system;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public TagDetailResponse tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagDetailResponse name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagDetailResponse description(String description) {
        this.description = description;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public TagDetailResponse categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public TagDetailResponse categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public TagValueType getValueType() {
        return valueType;
    }

    public void setValueType(TagValueType valueType) {
        this.valueType = valueType;
    }

    public TagDetailResponse valueType(TagValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    public Boolean getSyncToCustomerService() {
        return syncToCustomerService;
    }

    public void setSyncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
    }

    public TagDetailResponse syncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TagDetailResponse createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public TagDetailResponse updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public java.util.List<TagValueResponse> getTagValues() {
        return tagValues;
    }

    public void setTagValues(java.util.List<TagValueResponse> tagValues) {
        this.tagValues = tagValues;
    }

    public TagDetailResponse tagValues(java.util.List<TagValueResponse> tagValues) {
        this.tagValues = tagValues;
        return this;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public TagDetailResponse system(Boolean system) {
        this.system = system;
        return this;
    }

}
