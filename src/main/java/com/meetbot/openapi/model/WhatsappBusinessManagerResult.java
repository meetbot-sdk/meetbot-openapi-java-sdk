package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Business Manager 信息查询响应。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappBusinessManagerResult extends ExtensibleDto {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
