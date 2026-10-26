package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowIdRequest {

    /**
     * Flow ID
     * Required.
     */
    private String flowId;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public WhatsappFlowIdRequest flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

}
