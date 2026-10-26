package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncProductSeriesBatchRequest {

    /** Required. */
    private java.util.List<BizSyncProductSeriesData> data;

    public java.util.List<BizSyncProductSeriesData> getData() {
        return data;
    }

    public void setData(java.util.List<BizSyncProductSeriesData> data) {
        this.data = data;
    }

    public BizSyncProductSeriesBatchRequest data(java.util.List<BizSyncProductSeriesData> data) {
        this.data = data;
        return this;
    }

}
