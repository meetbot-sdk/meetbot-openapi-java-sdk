package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTagResponse {

    /**
     * 标签ID
     */
    private String tagId;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 是否系统标签
     */
    private Boolean system;

    /**
     * 是否同步客服工作台
     */
    private Boolean syncToCustomerService;

    /**
     * 标签描述
     */
    private String description;

    /**
     * 已关联的标签值列表
     */
    private java.util.List<UserTagValueResponse> tagValues;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public UserTagResponse tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserTagResponse name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public UserTagResponse system(Boolean system) {
        this.system = system;
        return this;
    }

    public Boolean getSyncToCustomerService() {
        return syncToCustomerService;
    }

    public void setSyncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
    }

    public UserTagResponse syncToCustomerService(Boolean syncToCustomerService) {
        this.syncToCustomerService = syncToCustomerService;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTagResponse description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<UserTagValueResponse> getTagValues() {
        return tagValues;
    }

    public void setTagValues(java.util.List<UserTagValueResponse> tagValues) {
        this.tagValues = tagValues;
    }

    public UserTagResponse tagValues(java.util.List<UserTagValueResponse> tagValues) {
        this.tagValues = tagValues;
        return this;
    }

}
