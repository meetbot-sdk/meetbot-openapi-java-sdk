package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteCategoryRequest {

    /**
     * 分类ID
     * Required.
     */
    private String categoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public DeleteCategoryRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

}
