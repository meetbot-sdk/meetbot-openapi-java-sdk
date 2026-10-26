package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCategoryRequest {

    /**
     * 分类ID
     * Required.
     */
    private String categoryId;

    /**
     * 分类名称
     * Required.
     */
    private String name;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public UpdateCategoryRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCategoryRequest name(String name) {
        this.name = name;
        return this;
    }

}
