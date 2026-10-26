package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * TagUsersPageResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TagUsersPageResponse {

    /**
     * 标签值关联的用户列表
     * Required.
     */
    private java.util.List<TagUserItemResponse> list;

    /**
     * 本页最后一条记录的游标；没有数据时为null
     */
    private String lastId;

    /**
     * 是否还有下一页
     * Required.
     */
    private Boolean hasMore;

    public java.util.List<TagUserItemResponse> getList() {
        return list;
    }

    public void setList(java.util.List<TagUserItemResponse> list) {
        this.list = list;
    }

    public TagUsersPageResponse list(java.util.List<TagUserItemResponse> list) {
        this.list = list;
        return this;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public TagUsersPageResponse lastId(String lastId) {
        this.lastId = lastId;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public TagUsersPageResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
}
