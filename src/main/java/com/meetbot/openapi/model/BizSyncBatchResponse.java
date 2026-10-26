package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncBatchResponse {

    /**
     * 本批通过校验并成功受理的条目数量；存在部分失败时仍可能大于 0。
     * Required.
     */
    private Long acceptedCount;

    /**
     * 逐条校验失败明细列表；全部成功时须返回空数组 []，不可省略该字段。
     * Required.
     */
    private java.util.List<BizSyncErrorDetail> errors;

    public Long getAcceptedCount() {
        return acceptedCount;
    }

    public void setAcceptedCount(Long acceptedCount) {
        this.acceptedCount = acceptedCount;
    }

    public BizSyncBatchResponse acceptedCount(Long acceptedCount) {
        this.acceptedCount = acceptedCount;
        return this;
    }

    public java.util.List<BizSyncErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(java.util.List<BizSyncErrorDetail> errors) {
        this.errors = errors;
    }

    public BizSyncBatchResponse errors(java.util.List<BizSyncErrorDetail> errors) {
        this.errors = errors;
        return this;
    }

}
