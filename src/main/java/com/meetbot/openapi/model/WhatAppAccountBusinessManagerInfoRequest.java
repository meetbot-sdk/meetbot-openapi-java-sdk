package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatAppAccountBusinessManagerInfoRequest {

    /**
     * Business Manager ID(bm id)
     * Required.
     */
    private String businessId;

    /**
     * 需要返回的字段，具体字段参考[官方文档](https://developers.facebook.com/documentation/ads-commerce/marketing-api/reference/business#Reading)，不填返回默认字段列表
     */
    private java.util.List<String> fields;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public WhatAppAccountBusinessManagerInfoRequest businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    public java.util.List<String> getFields() {
        return fields;
    }

    public void setFields(java.util.List<String> fields) {
        this.fields = fields;
    }

    public WhatAppAccountBusinessManagerInfoRequest fields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }

}
