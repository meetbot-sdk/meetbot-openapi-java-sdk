package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncOrderBatchRequest {

    /**
     * 待同步的订单记录列表，单次请求最多 100 条。
     * Required.
     */
    private java.util.List<BizSyncOrderData> data;

    public java.util.List<BizSyncOrderData> getData() {
        return data;
    }

    public void setData(java.util.List<BizSyncOrderData> data) {
        this.data = data;
    }

    public BizSyncOrderBatchRequest data(java.util.List<BizSyncOrderData> data) {
        this.data = data;
        return this;
    }

}
