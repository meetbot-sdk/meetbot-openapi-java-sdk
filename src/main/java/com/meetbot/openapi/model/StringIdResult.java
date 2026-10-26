package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * result 为字符串 ID 的响应，例如分类 ID、标签 ID、Catalog ID、异步任务 ID。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StringIdResult {

    private String id;

    public StringIdResult() {
    }

    @JsonCreator
    public StringIdResult(String id) {
        this.id = id;
    }

    @JsonValue
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
