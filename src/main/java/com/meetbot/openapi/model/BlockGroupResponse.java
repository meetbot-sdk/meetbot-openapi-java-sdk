package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockGroupResponse {

    /**
     * 内容分组ID
     * Required.
     */
    private Long groupId;

    /**
     * 内容分组名称
     * Required.
     */
    private String groupName;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public BlockGroupResponse groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BlockGroupResponse groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
