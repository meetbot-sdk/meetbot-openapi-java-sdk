package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * WhatsappTemplateGroupListResultPaging
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateGroupListResultPaging extends ExtensibleDto {

    /**
     * cursors
     */
    private WhatsappTemplateGroupListResultPagingCursors cursors;

    public WhatsappTemplateGroupListResultPagingCursors getCursors() {
        return cursors;
    }

    public void setCursors(WhatsappTemplateGroupListResultPagingCursors cursors) {
        this.cursors = cursors;
    }

    public WhatsappTemplateGroupListResultPaging cursors(WhatsappTemplateGroupListResultPagingCursors cursors) {
        this.cursors = cursors;
        return this;
    }
}
