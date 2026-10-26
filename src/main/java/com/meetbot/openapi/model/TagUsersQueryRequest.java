package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * TagUsersQueryRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagUsersQueryRequest {

    /**
     * 标签值ID（valueId，不是标签ID）；仅支持查询单个标签值
     * Required.
     */
    private String tagValueId;

    /**
     * 上一页响应中的用户标签关系游标，不是用户ID；首页不传、传空字符串或传0，均按0处理；后续分页请原样回传，不要自行计算或递增
     */
    private String lastId;

    /**
     * 每次最多扫描的用户标签关系数，范围1至1000；结果还会按当前APIKEY所属门店过滤，因此实际返回的list数量可能小于pageSize
     * Required.
     */
    private Long pageSize;

    public String getTagValueId() {
        return tagValueId;
    }

    public void setTagValueId(String tagValueId) {
        this.tagValueId = tagValueId;
    }

    public TagUsersQueryRequest tagValueId(String tagValueId) {
        this.tagValueId = tagValueId;
        return this;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public TagUsersQueryRequest lastId(String lastId) {
        this.lastId = lastId;
        return this;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public TagUsersQueryRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
