package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDynamicParamResponse {

    /**
     * 内容id
     * Required.
     */
    private Long blockId;

    /**
     * 内容名称
     * Required.
     */
    private String blockName;

    private java.util.List<BlockDynamicParamInfoResponse> paramList;

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public BlockDynamicParamResponse blockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public BlockDynamicParamResponse blockName(String blockName) {
        this.blockName = blockName;
        return this;
    }

    public java.util.List<BlockDynamicParamInfoResponse> getParamList() {
        return paramList;
    }

    public void setParamList(java.util.List<BlockDynamicParamInfoResponse> paramList) {
        this.paramList = paramList;
    }

    public BlockDynamicParamResponse paramList(java.util.List<BlockDynamicParamInfoResponse> paramList) {
        this.paramList = paramList;
        return this;
    }

}
