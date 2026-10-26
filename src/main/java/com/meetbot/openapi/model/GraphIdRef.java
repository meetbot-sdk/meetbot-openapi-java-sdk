package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 仅含 id 的 Graph 对象引用。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphIdRef extends ExtensibleDto {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
