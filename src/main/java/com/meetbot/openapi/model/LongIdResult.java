package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * result 为整型 ID 的响应，例如 Catalog 批量导入任务 ID。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LongIdResult {

    private Long id;

    public LongIdResult() {
    }

    @JsonCreator
    public LongIdResult(Long id) {
        this.id = id;
    }

    @JsonValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
