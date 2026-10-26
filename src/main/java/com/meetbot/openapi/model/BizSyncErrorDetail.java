package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncErrorDetail {

    /**
     * 请求体 data[] 中校验失败条目的下标，从 0 开始计数。
     * Required.
     */
    private Long index;

    /**
     * 错误码；字段级校验失败通常为 400001。
     * Required.
     */
    private Long code;

    /**
     * 可读的错误原因，如缺必填字段名或非法枚举值。
     * Required.
     */
    private String message;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public BizSyncErrorDetail index(Long index) {
        this.index = index;
        return this;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public BizSyncErrorDetail code(Long code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BizSyncErrorDetail message(String message) {
        this.message = message;
        return this;
    }

}
