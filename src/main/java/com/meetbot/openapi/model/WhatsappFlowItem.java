package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Flow 列表/详情中的 Flow 对象。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappFlowItem extends ExtensibleDto {

    private String id;
    private String name;
    private String status;
    private List<String> categories;

    @JsonProperty("validation_errors")
    private List<MetaValidationError> validationErrors;

    @JsonProperty("update_time")
    private String updateTime;

    @JsonProperty("json_version")
    private String jsonVersion;

    @JsonProperty("data_api_version")
    private String dataApiVersion;

    @JsonProperty("endpoint_uri")
    private String endpointUri;

    private WhatsappFlowPreviewInfo preview;

    @JsonProperty("whatsapp_business_account")
    private GraphIdRef whatsappBusinessAccount;

    private GraphIdRef application;

    @JsonProperty("health_status")
    private WhatsappFlowHealthStatus healthStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<MetaValidationError> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<MetaValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getJsonVersion() {
        return jsonVersion;
    }

    public void setJsonVersion(String jsonVersion) {
        this.jsonVersion = jsonVersion;
    }

    public String getDataApiVersion() {
        return dataApiVersion;
    }

    public void setDataApiVersion(String dataApiVersion) {
        this.dataApiVersion = dataApiVersion;
    }

    public String getEndpointUri() {
        return endpointUri;
    }

    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    public WhatsappFlowPreviewInfo getPreview() {
        return preview;
    }

    public void setPreview(WhatsappFlowPreviewInfo preview) {
        this.preview = preview;
    }

    public GraphIdRef getWhatsappBusinessAccount() {
        return whatsappBusinessAccount;
    }

    public void setWhatsappBusinessAccount(GraphIdRef whatsappBusinessAccount) {
        this.whatsappBusinessAccount = whatsappBusinessAccount;
    }

    public GraphIdRef getApplication() {
        return application;
    }

    public void setApplication(GraphIdRef application) {
        this.application = application;
    }

    public WhatsappFlowHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(WhatsappFlowHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }
}
