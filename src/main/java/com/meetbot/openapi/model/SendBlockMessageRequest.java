package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SendBlockMessageRequest {

    /**
     * 内容id
     * Required.
     */
    private Long blockId;

    /**
     * 接收者手机号
     */
    private String to;

    /**
     * 发送者手机号，当店铺绑定多个WABA账号时需要传
     */
    private String sentAccount;

    /**
     * 内容管理-获取内容动态参数接口响应中result中的值，需要填充
     */
    private java.util.List<BlockDynamicParamResponse> blockParamList;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public SendBlockMessageRequest blockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public SendBlockMessageRequest to(String to) {
        this.to = to;
        return this;
    }

    public String getSentAccount() {
        return sentAccount;
    }

    public void setSentAccount(String sentAccount) {
        this.sentAccount = sentAccount;
    }

    public SendBlockMessageRequest sentAccount(String sentAccount) {
        this.sentAccount = sentAccount;
        return this;
    }

    public java.util.List<BlockDynamicParamResponse> getBlockParamList() {
        return blockParamList;
    }

    public void setBlockParamList(java.util.List<BlockDynamicParamResponse> blockParamList) {
        this.blockParamList = blockParamList;
    }

    public SendBlockMessageRequest blockParamList(java.util.List<BlockDynamicParamResponse> blockParamList) {
        this.blockParamList = blockParamList;
        return this;
    }

}
