package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Meta Graph 分页信息。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaPaging extends ExtensibleDto {

    private MetaCursors cursors;

    public MetaCursors getCursors() {
        return cursors;
    }

    public void setCursors(MetaCursors cursors) {
        this.cursors = cursors;
    }
}
