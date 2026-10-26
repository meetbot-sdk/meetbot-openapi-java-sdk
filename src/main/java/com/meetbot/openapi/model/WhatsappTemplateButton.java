package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 模板 BUTTONS 中的按钮。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappTemplateButton extends ExtensibleDto {

    /** {@code QUICK_REPLY} / {@code URL} / {@code PHONE_NUMBER} / {@code OTP} / {@code MPM} / {@code FLOW} 等。 */
    private String type;
    private String text;
    private String url;

    @JsonProperty("phone_number")
    private String phoneNumber;

    private List<String> example;

    @JsonProperty("otp_type")
    private String otpType;

    @JsonProperty("autofill_text")
    private String autofillText;

    @JsonProperty("package_name")
    private String packageName;

    @JsonProperty("signature_hash")
    private String signatureHash;

    @JsonProperty("flow_id")
    private String flowId;

    @JsonProperty("flow_action")
    private String flowAction;

    @JsonProperty("navigate_screen")
    private String navigateScreen;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WhatsappTemplateButton type(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WhatsappTemplateButton text(String text) {
        this.text = text;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WhatsappTemplateButton url(String url) {
        this.url = url;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WhatsappTemplateButton phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public List<String> getExample() {
        return example;
    }

    public void setExample(List<String> example) {
        this.example = example;
    }

    public WhatsappTemplateButton example(List<String> example) {
        this.example = example;
        return this;
    }

    public String getOtpType() {
        return otpType;
    }

    public void setOtpType(String otpType) {
        this.otpType = otpType;
    }

    public WhatsappTemplateButton otpType(String otpType) {
        this.otpType = otpType;
        return this;
    }

    public String getAutofillText() {
        return autofillText;
    }

    public void setAutofillText(String autofillText) {
        this.autofillText = autofillText;
    }

    public WhatsappTemplateButton autofillText(String autofillText) {
        this.autofillText = autofillText;
        return this;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public WhatsappTemplateButton packageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getSignatureHash() {
        return signatureHash;
    }

    public void setSignatureHash(String signatureHash) {
        this.signatureHash = signatureHash;
    }

    public WhatsappTemplateButton signatureHash(String signatureHash) {
        this.signatureHash = signatureHash;
        return this;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public WhatsappTemplateButton flowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    public String getFlowAction() {
        return flowAction;
    }

    public void setFlowAction(String flowAction) {
        this.flowAction = flowAction;
    }

    public WhatsappTemplateButton flowAction(String flowAction) {
        this.flowAction = flowAction;
        return this;
    }

    public String getNavigateScreen() {
        return navigateScreen;
    }

    public void setNavigateScreen(String navigateScreen) {
        this.navigateScreen = navigateScreen;
    }

    public WhatsappTemplateButton navigateScreen(String navigateScreen) {
        this.navigateScreen = navigateScreen;
        return this;
    }
}
