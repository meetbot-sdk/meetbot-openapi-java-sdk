package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meetbot.openapi.model.enums.WhatsappFlowCategory;

import java.util.List;

/**
 * Meta 更新 Flow 基本信息请求体（Meetbot {@code WhatsappFlowUpdateRequest.param}）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#update-flow">Update Flow</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowUpdateParam extends ExtensibleDto {

    private String name;
    private List<WhatsappFlowCategory> categories;

    @JsonProperty("endpoint_uri")
    private String endpointUri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhatsappFlowUpdateParam name(String name) {
        this.name = name;
        return this;
    }

    public List<WhatsappFlowCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<WhatsappFlowCategory> categories) {
        this.categories = categories;
    }

    public WhatsappFlowUpdateParam categories(List<WhatsappFlowCategory> categories) {
        this.categories = categories;
        return this;
    }

    public String getEndpointUri() {
        return endpointUri;
    }

    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    public WhatsappFlowUpdateParam endpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }
}
