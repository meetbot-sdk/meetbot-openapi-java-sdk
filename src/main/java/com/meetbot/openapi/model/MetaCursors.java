package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Meta Graph 分页游标。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaCursors extends ExtensibleDto {

    private String before;
    private String after;

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
