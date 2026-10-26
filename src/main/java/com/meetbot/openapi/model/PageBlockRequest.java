package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.meetbot.openapi.model.enums.SceneType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageBlockRequest {

    /**
     * 内容id
     */
    private Long blockId;

    /**
     * 内容名称（模糊）
     */
    private String blockName;

    /**
     * 应用场景：CUSTOMER_SERVICE_SESSION（客服会话），MARKETING（市场营销），TRANSACTION_NOTIFICATION（交易通知），PRIVATE_DOMAIN_PAYMENT（私域支付），AUTHENTICATION（身份验证），NO_SCENE（无场景）
     */
    private java.util.List<SceneType> sceneTypeList;

    /**
     * 消息类型：TEMPLATE（模板消息），NONE（普通消息）
     */
    private String messageType;

    /**
     * 业务账户(WABA)
     */
    private java.util.List<String> wabaIdList;

    /**
     * 内容分组，基于（内容-查询内容分组列表）接口中groupId字段
     */
    private java.util.List<String> groupIdList;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 创建时间-开始
     */
    private Long createTimeStart;

    /**
     * 创建时间-结束
     */
    private Long createTimeEnd;

    /**
     * 更新时间-开始
     */
    private Long updateTimeStart;

    /**
     * 更新时间-结束
     */
    private Long updateTimeEnd;

    /**
     * 第几页
     */
    private Long pageNo;

    /**
     * 分页数量
     */
    private Long pageSize;

    /**
     * 是否返回总数，默认为false
     */
    private Boolean includeTotal;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public PageBlockRequest blockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public PageBlockRequest blockName(String blockName) {
        this.blockName = blockName;
        return this;
    }

    public java.util.List<SceneType> getSceneTypeList() {
        return sceneTypeList;
    }

    public void setSceneTypeList(java.util.List<SceneType> sceneTypeList) {
        this.sceneTypeList = sceneTypeList;
    }

    public PageBlockRequest sceneTypeList(java.util.List<SceneType> sceneTypeList) {
        this.sceneTypeList = sceneTypeList;
        return this;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public PageBlockRequest messageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public java.util.List<String> getWabaIdList() {
        return wabaIdList;
    }

    public void setWabaIdList(java.util.List<String> wabaIdList) {
        this.wabaIdList = wabaIdList;
    }

    public PageBlockRequest wabaIdList(java.util.List<String> wabaIdList) {
        this.wabaIdList = wabaIdList;
        return this;
    }

    public java.util.List<String> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(java.util.List<String> groupIdList) {
        this.groupIdList = groupIdList;
    }

    public PageBlockRequest groupIdList(java.util.List<String> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public PageBlockRequest templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public Long getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public PageBlockRequest createTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }

    public Long getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public PageBlockRequest createTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    public Long getUpdateTimeStart() {
        return updateTimeStart;
    }

    public void setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public PageBlockRequest updateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }

    public Long getUpdateTimeEnd() {
        return updateTimeEnd;
    }

    public void setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public PageBlockRequest updateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public PageBlockRequest pageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public PageBlockRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Boolean getIncludeTotal() {
        return includeTotal;
    }

    public void setIncludeTotal(Boolean includeTotal) {
        this.includeTotal = includeTotal;
    }

    public PageBlockRequest includeTotal(Boolean includeTotal) {
        this.includeTotal = includeTotal;
        return this;
    }

}
