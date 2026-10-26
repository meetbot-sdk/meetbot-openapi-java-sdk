package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceOrderExtendFieldDefResponse {

    /**
     * 字段 key
     */
    private String fieldKey;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 是否必填
     */
    private Boolean required;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 字段值
     */
    private String value;

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public CommerceOrderExtendFieldDefResponse fieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public CommerceOrderExtendFieldDefResponse fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public CommerceOrderExtendFieldDefResponse required(Boolean required) {
        this.required = required;
        return this;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public CommerceOrderExtendFieldDefResponse sort(Long sort) {
        this.sort = sort;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CommerceOrderExtendFieldDefResponse value(String value) {
        this.value = value;
        return this;
    }

}
