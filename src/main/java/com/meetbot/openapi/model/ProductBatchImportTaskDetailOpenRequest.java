package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductBatchImportTaskDetailOpenRequest {

    /**
     * 批量导入任务 ID
     * Required.
     */
    private Long taskId;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public ProductBatchImportTaskDetailOpenRequest taskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

}
