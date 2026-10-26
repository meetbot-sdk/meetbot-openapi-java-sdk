package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateQueryResponse {

    /**
     * 如需查询当前这批数据的上一页，可将此参数带入下一次查询中
     */
    private String before;

    /**
     * 如需查询当前这批数据的下一页，可将此参数带入下一次查询中
     */
    private String after;

    /**
     * 如需查询当前这批数据的上一页或者下一页，可将此参数带入下一次查询中
     */
    private String accessToken;

    /**
     * 具体模板列表
     */
    private List<WhatsappTemplateItem> data;

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public WhatsappTemplateQueryResponse before(String before) {
        this.before = before;
        return this;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WhatsappTemplateQueryResponse after(String after) {
        this.after = after;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public WhatsappTemplateQueryResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public List<WhatsappTemplateItem> getData() {
        return data;
    }

    public void setData(List<WhatsappTemplateItem> data) {
        this.data = data;
    }

    public WhatsappTemplateQueryResponse data(List<WhatsappTemplateItem> data) {
        this.data = data;
        return this;
    }
}
