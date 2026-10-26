package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteStaticTagRequest {

    /**
     * 标签ID
     * Required.
     */
    private String tagId;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public DeleteStaticTagRequest tagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

}
