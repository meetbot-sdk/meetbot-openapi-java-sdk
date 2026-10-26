package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Catalog 商品批量导入任务结果
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogProductUploadResultMessage {

    /**
     * 任务 ID
     */
    private Long taskId;

    /**
     * 店铺 ID
     */
    private Long storeId;

    /**
     * Catalog ID
     */
    private String catalogId;

    /**
     * 导入总数
     */
    private Long total;

    /**
     * 成功数
     */
    private Long success;

    /**
     * 失败数
     */
    private Long fail;

    /**
     * 失败明细 Excel 下载 URL；有失败记录时有值
     */
    private String failFileUrl;

    /**
     * 任务级错误信息
     */
    private String errorMsg;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public CatalogProductUploadResultMessage taskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public CatalogProductUploadResultMessage storeId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public CatalogProductUploadResultMessage catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public CatalogProductUploadResultMessage total(Long total) {
        this.total = total;
        return this;
    }

    public Long getSuccess() {
        return success;
    }

    public void setSuccess(Long success) {
        this.success = success;
    }

    public CatalogProductUploadResultMessage success(Long success) {
        this.success = success;
        return this;
    }

    public Long getFail() {
        return fail;
    }

    public void setFail(Long fail) {
        this.fail = fail;
    }

    public CatalogProductUploadResultMessage fail(Long fail) {
        this.fail = fail;
        return this;
    }

    public String getFailFileUrl() {
        return failFileUrl;
    }

    public void setFailFileUrl(String failFileUrl) {
        this.failFileUrl = failFileUrl;
    }

    public CatalogProductUploadResultMessage failFileUrl(String failFileUrl) {
        this.failFileUrl = failFileUrl;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public CatalogProductUploadResultMessage errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

}
