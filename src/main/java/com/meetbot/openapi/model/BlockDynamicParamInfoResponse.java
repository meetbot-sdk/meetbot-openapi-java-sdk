package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDynamicParamInfoResponse {

    /**
     * 类型
     * Required.
     */
    private String type;

    /**
     * 参数名
     * Required.
     */
    private String key;

    /**
     * 参数值，当前为空字符串，后续【发送消息】需要传值
     * Required.
     */
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BlockDynamicParamInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BlockDynamicParamInfoResponse key(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BlockDynamicParamInfoResponse value(String value) {
        this.value = value;
        return this;
    }

}
