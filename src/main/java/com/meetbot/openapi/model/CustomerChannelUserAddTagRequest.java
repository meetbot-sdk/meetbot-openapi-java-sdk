package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerChannelUserAddTagRequest {

    /**
     * 标签名
     * Required.
     */
    private String tagName;

    /**
     * 标签值
     * Required.
     */
    private String tagValue;

    /**
     * 是否覆盖之前已有标签值
     */
    private Boolean replaceIfPresent;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public CustomerChannelUserAddTagRequest tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public CustomerChannelUserAddTagRequest tagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    public Boolean getReplaceIfPresent() {
        return replaceIfPresent;
    }

    public void setReplaceIfPresent(Boolean replaceIfPresent) {
        this.replaceIfPresent = replaceIfPresent;
    }

    public CustomerChannelUserAddTagRequest replaceIfPresent(Boolean replaceIfPresent) {
        this.replaceIfPresent = replaceIfPresent;
        return this;
    }

}
