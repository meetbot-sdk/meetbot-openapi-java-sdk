package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryNodeResponse {

    /**
     * 分类ID
     */
    private String id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 是否系统分类
     */
    private Boolean system;

    /**
     * 分类描述
     */
    private String description;

    /**
     * 子分类列表（递归）
     */
    private java.util.List<CategoryNodeResponse> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CategoryNodeResponse id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryNodeResponse name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public CategoryNodeResponse system(Boolean system) {
        this.system = system;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryNodeResponse description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<CategoryNodeResponse> getChildren() {
        return children;
    }

    public void setChildren(java.util.List<CategoryNodeResponse> children) {
        this.children = children;
    }

    public CategoryNodeResponse children(java.util.List<CategoryNodeResponse> children) {
        this.children = children;
        return this;
    }

}
