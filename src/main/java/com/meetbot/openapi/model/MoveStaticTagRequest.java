package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveStaticTagRequest {

    /**
     * 标签ID
     * Required.
     */
    private String tagId;

    /**
     * 排序位置（排在此ID之后，null为排首位）
     */
    private String beforeTagId;

    /**
     * 目标分类ID
     * Required.
     */
    private String categoryId;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public MoveStaticTagRequest tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getBeforeTagId() {
        return beforeTagId;
    }

    public void setBeforeTagId(String beforeTagId) {
        this.beforeTagId = beforeTagId;
    }

    public MoveStaticTagRequest beforeTagId(String beforeTagId) {
        this.beforeTagId = beforeTagId;
        return this;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public MoveStaticTagRequest categoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

}
