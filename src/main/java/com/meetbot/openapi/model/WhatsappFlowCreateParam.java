package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.WhatsappFlowCategory;

import java.util.List;

/**
 * Meta 创建 Flow 请求体（Meetbot {@code WhatsappFlowCreateRequest.param}）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#create-flow">Create Flow</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowCreateParam extends ExtensibleDto {

    /** Flow 名称。Required. */
    private String name;

    /** 分类数组。Required. */
    private List<WhatsappFlowCategory> categories;

    /** Flow JSON 字符串。 */
    @JsonProperty("flow_json")
    private String flowJson;

    /** Data Exchange Endpoint URL（v3.0+）。 */
    @JsonProperty("endpoint_uri")
    private String endpointUri;

    /** 是否同时发布。 */
    private Boolean publish;

    /** 从现有 Flow 克隆。 */
    @JsonProperty("clone_flow_id")
    private String cloneFlowId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappFlowCreateParam name(String name) {
        this.name = name;
        return this;
    }

    public List<WhatsappFlowCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<WhatsappFlowCategory> categories) {
        this.categories = categories;
    }

    public WhatsappFlowCreateParam categories(List<WhatsappFlowCategory> categories) {
        this.categories = categories;
        return this;
    }

    public String getFlowJson() {
        return flowJson;
    }

    public void setFlowJson(String flowJson) {
        this.flowJson = flowJson;
    }

    public WhatsappFlowCreateParam flowJson(String flowJson) {
        this.flowJson = flowJson;
        return this;
    }

    public String getEndpointUri() {
        return endpointUri;
    }

    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    public WhatsappFlowCreateParam endpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public WhatsappFlowCreateParam publish(Boolean publish) {
        this.publish = publish;
        return this;
    }

    public String getCloneFlowId() {
        return cloneFlowId;
    }

    public void setCloneFlowId(String cloneFlowId) {
        this.cloneFlowId = cloneFlowId;
    }

    public WhatsappFlowCreateParam cloneFlowId(String cloneFlowId) {
        this.cloneFlowId = cloneFlowId;
        return this;
    }
}
