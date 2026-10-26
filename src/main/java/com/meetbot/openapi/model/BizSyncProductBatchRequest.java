package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncProductBatchRequest {

    /** Required. */
    private java.util.List<BizSyncProductData> data;

    public java.util.List<BizSyncProductData> getData() {
        return data;
    }

    public void setData(java.util.List<BizSyncProductData> data) {
        this.data = data;
    }

    public BizSyncProductBatchRequest data(java.util.List<BizSyncProductData> data) {
        this.data = data;
        return this;
    }

}
