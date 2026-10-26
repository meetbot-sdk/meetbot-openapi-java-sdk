package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveCategoryRequest {

    /**
     * 分类ID
     * Required.
     */
    private String categoryId;

    /**
     * 排序位置（排在此ID之后，null为排首位）
     */
    private String beforeCategoryId;

    /**
     * 目标父分类ID
     */
    private String parentCategoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public MoveCategoryRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getBeforeCategoryId() {
        return beforeCategoryId;
    }

    public void setBeforeCategoryId(String beforeCategoryId) {
        this.beforeCategoryId = beforeCategoryId;
    }

    public MoveCategoryRequest beforeCategoryId(String beforeCategoryId) {
        this.beforeCategoryId = beforeCategoryId;
        return this;
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public MoveCategoryRequest parentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }

}
