package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockResponse {

    /**
     * 内容ID
     */
    private Long blockId;

    /**
     * 内容名称
     */
    private String blockName;

    /**
     * 应用场景
     */
    private String sceneType;

    /**
     * 消息类型：TEMPLATE（模板消息），NONE（普通消息）
     */
    private String messageType;

    /**
     * 内容分组ID
     */
    private Long groupId;

    /**
     * 内容分组名称
     */
    private String groupName;

    /**
     * WhatsApp Business Account Id(wabaId)
     */
    private String wabaId;

    /**
     * WABA名称
     */
    private String wabaName;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public BlockResponse blockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public BlockResponse blockName(String blockName) {
        this.blockName = blockName;
        return this;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public BlockResponse sceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public BlockResponse messageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public BlockResponse groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BlockResponse groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getWabaId() {
        return wabaId;
    }

    public void setWabaId(String wabaId) {
        this.wabaId = wabaId;
    }

    public BlockResponse wabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }

    public String getWabaName() {
        return wabaName;
    }

    public void setWabaName(String wabaName) {
        this.wabaName = wabaName;
    }

    public BlockResponse wabaName(String wabaName) {
        this.wabaName = wabaName;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BlockResponse createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public BlockResponse updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
