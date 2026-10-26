package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Catalog 单条商品创建/编辑任务结果
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogProductHandleResultMessage {

    /**
     * 是否全部成功
     */
    private Boolean success;

    /**
     * 失败原因；success 为 false 时有值
     */
    private String failReason;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CatalogProductHandleResultMessage success(Boolean success) {
        this.success = success;
        return this;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public CatalogProductHandleResultMessage failReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

}
