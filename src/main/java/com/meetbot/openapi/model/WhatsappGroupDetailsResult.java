package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 查询群组详情结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupDetailsResult extends ExtensibleDto {

    /**
     * id
     */
    private String id;

    /**
     * subject
     */
    private String subject;

    /**
     * participants
     */
    private WhatsappGroupDetailsResultParticipants participants;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhatsappGroupDetailsResult id(String id) {
        this.id = id;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public WhatsappGroupDetailsResult subject(String subject) {
        this.subject = subject;
        return this;
    }

    public WhatsappGroupDetailsResultParticipants getParticipants() {
        return participants;
    }

    public void setParticipants(WhatsappGroupDetailsResultParticipants participants) {
        this.participants = participants;
    }

    public WhatsappGroupDetailsResult participants(WhatsappGroupDetailsResultParticipants participants) {
        this.participants = participants;
        return this;
    }
}
