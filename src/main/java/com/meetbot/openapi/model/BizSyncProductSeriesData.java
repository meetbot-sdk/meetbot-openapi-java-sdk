package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 商品系列（Collection）主数据，用于将多个商品归组并支持系列类圈选条件。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BizSyncProductSeriesData {

    /**
     * 外部系列唯一 ID，被商品的 collections[] 引用。
     * Required.
     */
    private String id;

    /**
     * 系列记录最后变更时间（毫秒），必填。
     * Required.
     */
    private Long updateTime;

    /**
     * 系列 URL handle，店铺内唯一的 slug 标识。
     */
    private String collectionHandle;

    /**
     * 系列对外展示名称。
     */
    private String collectionTitle;

    /**
     * 系列类型：CUSTOM 表示手动挑选商品；SMART 表示按规则自动收录。接口层不校验，由集成方按源系统含义填写。
     */
    private String collectionType;

    /**
     * 系列在源系统中的创建时间（毫秒）；部分平台无此字段时可由集成方自行维护。
     */
    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BizSyncProductSeriesData id(String id) {
        this.id = id;
        return this;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public BizSyncProductSeriesData updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getCollectionHandle() {
        return collectionHandle;
    }

    public void setCollectionHandle(String collectionHandle) {
        this.collectionHandle = collectionHandle;
    }

    public BizSyncProductSeriesData collectionHandle(String collectionHandle) {
        this.collectionHandle = collectionHandle;
        return this;
    }

    public String getCollectionTitle() {
        return collectionTitle;
    }

    public void setCollectionTitle(String collectionTitle) {
        this.collectionTitle = collectionTitle;
    }

    public BizSyncProductSeriesData collectionTitle(String collectionTitle) {
        this.collectionTitle = collectionTitle;
        return this;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public BizSyncProductSeriesData collectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BizSyncProductSeriesData createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

}
