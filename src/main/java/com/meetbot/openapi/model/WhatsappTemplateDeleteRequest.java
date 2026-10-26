package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateDeleteRequest {

    /**
     * WhatsApp Business Account Id(wabaId)
     * Required.
     */
    private String whatsappBusinessAccountId;

    /**
     * 模板名称
     * Required.
     */
    private String name;

    /**
     * 创建时返回的id字段（一个name可以有多个不同语种的模版，如果需要指定删除某个name下某个语种的模版，这个字段填入对应模版的Id，如果本字段为空则删除模版名为name的所有语种模版，如果该name只有一个语种的模版，则填写该模版的Id或者不填本字段等效）
     */
    private String hsmId;

    public String getWhatsappBusinessAccountId() {
        return whatsappBusinessAccountId;
    }

    public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    }

    public WhatsappTemplateDeleteRequest whatsappBusinessAccountId(String whatsappBusinessAccountId) {
        this.whatsappBusinessAccountId = whatsappBusinessAccountId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappTemplateDeleteRequest name(String name) {
        this.name = name;
        return this;
    }

    public String getHsmId() {
        return hsmId;
    }

    public void setHsmId(String hsmId) {
        this.hsmId = hsmId;
    }

    public WhatsappTemplateDeleteRequest hsmId(String hsmId) {
        this.hsmId = hsmId;
        return this;
    }

}
