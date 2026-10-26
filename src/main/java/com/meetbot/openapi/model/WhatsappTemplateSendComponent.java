package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 发送模板消息时的 component（header / body / button）。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateSendComponent extends ExtensibleDto {

    /** {@code header} / {@code body} / {@code button}。Required. */
    private String type;

    /** 按钮子类型，如 {@code quick_reply}、{@code url}。 */
    @JsonProperty("sub_type")
    private String subType;

    /** 按钮下标，从 0 开始。 */
    private String index;

    private List<WhatsappMessageParameter> parameters;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsappTemplateSendComponent type(String type) {
        this.type = type;
        return this;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public WhatsappTemplateSendComponent subType(String subType) {
        this.subType = subType;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public WhatsappTemplateSendComponent index(String index) {
        this.index = index;
        return this;
    }

    public List<WhatsappMessageParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WhatsappMessageParameter> parameters) {
        this.parameters = parameters;
    }

    public WhatsappTemplateSendComponent parameters(List<WhatsappMessageParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
}
