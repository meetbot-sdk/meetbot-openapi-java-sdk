package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * CtwaDatasetCreateRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CtwaDatasetCreateRequest {

    /**
     * WhatsApp 业务账号 ID
     * Required.
     */
    private String wabaId;

    /**
     * Meta 官方请求参数
     * Required.
     */
    private CtwaDatasetCreateParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public CtwaDatasetCreateRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public CtwaDatasetCreateParam getParam() {
        return param;
    }

    public void setParam(CtwaDatasetCreateParam param) {
        this.param = param;
    }

    public CtwaDatasetCreateRequest param(CtwaDatasetCreateParam param) {
        this.param = param;
        return this;
    }
}
