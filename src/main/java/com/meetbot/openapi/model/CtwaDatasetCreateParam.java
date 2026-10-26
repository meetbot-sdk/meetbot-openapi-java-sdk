package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Meta 官方请求参数
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CtwaDatasetCreateParam {

    /**
     * 数据集名称
     * Required.
     */
    @JsonProperty("dataset_name")
    private String datasetName;

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public CtwaDatasetCreateParam datasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
}
