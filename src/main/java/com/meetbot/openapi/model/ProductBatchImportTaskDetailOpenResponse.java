package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBatchImportTaskDetailOpenResponse {

    /**
     * 任务 ID
     */
    private Long id;

    /**
     * 完成时间（毫秒时间戳）
     */
    private Long finishTime;

    /**
     * 导入文件名
     */
    private String importFileName;

    /**
     * 总数
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
     * 失败明细 Excel storyKey
     */
    private String errorDetailStoryKey;

    /**
     * 失败明细下载 URL（errorDetailStoryKey 非空时有值）
     */
    private String errorDetailUrl;

    /**
     * 任务状态：1=待执行；2=执行中；3=执行成功；4=执行失败
     */
    private Long status;

    /**
     * 任务状态描述
     */
    private String statusDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductBatchImportTaskDetailOpenResponse id(Long id) {
        this.id = id;
        return this;
    }

    public Long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    public ProductBatchImportTaskDetailOpenResponse finishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getImportFileName() {
        return importFileName;
    }

    public void setImportFileName(String importFileName) {
        this.importFileName = importFileName;
    }

    public ProductBatchImportTaskDetailOpenResponse importFileName(String importFileName) {
        this.importFileName = importFileName;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ProductBatchImportTaskDetailOpenResponse total(Long total) {
        this.total = total;
        return this;
    }

    public Long getSuccess() {
        return success;
    }

    public void setSuccess(Long success) {
        this.success = success;
    }

    public ProductBatchImportTaskDetailOpenResponse success(Long success) {
        this.success = success;
        return this;
    }

    public Long getFail() {
        return fail;
    }

    public void setFail(Long fail) {
        this.fail = fail;
    }

    public ProductBatchImportTaskDetailOpenResponse fail(Long fail) {
        this.fail = fail;
        return this;
    }

    public String getErrorDetailStoryKey() {
        return errorDetailStoryKey;
    }

    public void setErrorDetailStoryKey(String errorDetailStoryKey) {
        this.errorDetailStoryKey = errorDetailStoryKey;
    }

    public ProductBatchImportTaskDetailOpenResponse errorDetailStoryKey(String errorDetailStoryKey) {
        this.errorDetailStoryKey = errorDetailStoryKey;
        return this;
    }

    public String getErrorDetailUrl() {
        return errorDetailUrl;
    }

    public void setErrorDetailUrl(String errorDetailUrl) {
        this.errorDetailUrl = errorDetailUrl;
    }

    public ProductBatchImportTaskDetailOpenResponse errorDetailUrl(String errorDetailUrl) {
        this.errorDetailUrl = errorDetailUrl;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public ProductBatchImportTaskDetailOpenResponse status(Long status) {
        this.status = status;
        return this;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public ProductBatchImportTaskDetailOpenResponse statusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

}
