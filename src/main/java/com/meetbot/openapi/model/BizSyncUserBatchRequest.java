package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncUserBatchRequest {

    /**
     * 待同步的用户记录列表，单次请求最多 100 条。
     * Required.
     */
    private java.util.List<BizSyncUserData> data;

    public java.util.List<BizSyncUserData> getData() {
        return data;
    }

    public void setData(java.util.List<BizSyncUserData> data) {
        this.data = data;
    }

    public BizSyncUserBatchRequest data(java.util.List<BizSyncUserData> data) {
        this.data = data;
        return this;
    }

}
