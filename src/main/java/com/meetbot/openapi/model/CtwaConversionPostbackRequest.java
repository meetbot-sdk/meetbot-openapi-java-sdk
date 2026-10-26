package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 转化回传参数。wabaId：WhatsApp Business Account ID；datasetId：Meta Dataset ID；param：Meta Conversions API 回传参数。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CtwaConversionPostbackRequest {

    /**
     * WhatsApp Business Account ID
     * Required.
     */
    private String wabaId;

    /**
     * Meta Dataset ID
     * Required.
     */
    private String datasetId;

    /**
     * Meta Conversions API 回传参数，字段均为 Meta 官方定义。data（必填）：转化事件数组；test_event_code（可选）：测试事件代码。参考 Meta 官方文档。
     * Required.
     */
    private CtwaConversionPostbackParam param;

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public CtwaConversionPostbackRequest wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public CtwaConversionPostbackRequest datasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public CtwaConversionPostbackParam getParam() {
        return param;
    }

    public void setParam(CtwaConversionPostbackParam param) {
        this.param = param;
    }

    public CtwaConversionPostbackRequest param(CtwaConversionPostbackParam param) {
        this.param = param;
        return this;
    }

}
