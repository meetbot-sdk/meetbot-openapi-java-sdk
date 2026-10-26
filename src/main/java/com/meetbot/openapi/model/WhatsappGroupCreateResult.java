package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 创建群组结果；保留 Meta 扩展字段。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappGroupCreateResult extends ExtensibleDto {

    /**
     * messaging_product
     */
    @JsonProperty("messaging_product")
    private String messagingProduct;

    /**
     * groups
     */
    private java.util.List<WhatsappGroupCreateResultGroupsItem> groups;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public WhatsappGroupCreateResult messagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
        return this;
    }

    public java.util.List<WhatsappGroupCreateResultGroupsItem> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<WhatsappGroupCreateResultGroupsItem> groups) {
        this.groups = groups;
    }

    public WhatsappGroupCreateResult groups(java.util.List<WhatsappGroupCreateResultGroupsItem> groups) {
        this.groups = groups;
        return this;
    }
}
