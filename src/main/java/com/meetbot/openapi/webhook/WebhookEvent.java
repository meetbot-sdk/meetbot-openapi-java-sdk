package com.meetbot.openapi.webhook;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.meetbot.openapi.model.CatalogProductHandleResultMessage;
import com.meetbot.openapi.model.CatalogProductUploadResultMessage;
import com.meetbot.openapi.model.WebhookActionCallback;
import com.meetbot.openapi.model.WebhookActionMsg;
import com.meetbot.openapi.model.WebhookCallsConnectCallback;
import com.meetbot.openapi.model.WebhookCallsPermissionReplyCallback;
import com.meetbot.openapi.model.WebhookCallsStatusCallback;
import com.meetbot.openapi.model.WebhookCallsTerminateCallback;
import com.meetbot.openapi.model.WebhookCatalogProductBatchImportCallback;
import com.meetbot.openapi.model.WebhookCatalogProductCreateCallback;
import com.meetbot.openapi.model.WebhookCatalogProductDeleteCallback;
import com.meetbot.openapi.model.WebhookCatalogProductUpdateCallback;
import com.meetbot.openapi.model.WebhookContentCallback;
import com.meetbot.openapi.model.WebhookContentForBClientCallback;
import com.meetbot.openapi.model.WebhookSendErrorCallback;
import com.meetbot.openapi.model.WebhookSendErrorMsg;
import com.meetbot.openapi.model.WebhookSendSuccessCallback;
import com.meetbot.openapi.model.WebhookSendSuccessMsg;
import com.meetbot.openapi.model.WebhookStatusChangeCallback;
import com.meetbot.openapi.model.enums.WebhookCallbackType;
import com.meetbot.openapi.util.Jsons;

/**
 * Webhook 统一回调信封。Meetbot POST 到客户配置地址，Body 含 {@code type}、{@code msg}，
 * 部分类型含 {@code messageId} 或任务 {@code id}。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookEvent {

    private String type;
    private Long messageId;
    private Long id;
    private JsonNode msg;
    private JsonNode raw;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookCallbackType getTypeEnum() {
        return WebhookCallbackType.fromValue(type);
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * Catalog 异步任务 ID。
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JsonNode getMsg() {
        return msg;
    }

    public void setMsg(JsonNode msg) {
        this.msg = msg;
    }

    public JsonNode getRaw() {
        return raw;
    }

    public void setRaw(JsonNode raw) {
        this.raw = raw;
    }

    public <T> T msgAs(Class<T> type) {
        if (msg == null || msg.isNull()) {
            return null;
        }
        return Jsons.convert(msg, type);
    }

    public WebhookSendSuccessMsg asSendSuccessMsg() {
        return msgAs(WebhookSendSuccessMsg.class);
    }

    public WebhookSendErrorMsg asSendErrorMsg() {
        return msgAs(WebhookSendErrorMsg.class);
    }

    public WebhookActionMsg asActionMsg() {
        return msgAs(WebhookActionMsg.class);
    }

    public CatalogProductHandleResultMessage asCatalogHandleResult() {
        return msgAs(CatalogProductHandleResultMessage.class);
    }

    public CatalogProductUploadResultMessage asCatalogUploadResult() {
        return msgAs(CatalogProductUploadResultMessage.class);
    }

    public WebhookSendSuccessCallback asSendSuccess() {
        return Jsons.convert(raw, WebhookSendSuccessCallback.class);
    }

    public WebhookSendErrorCallback asSendError() {
        return Jsons.convert(raw, WebhookSendErrorCallback.class);
    }

    public WebhookContentCallback asContent() {
        return Jsons.convert(raw, WebhookContentCallback.class);
    }

    public WebhookContentForBClientCallback asContentForBClient() {
        return Jsons.convert(raw, WebhookContentForBClientCallback.class);
    }

    public WebhookStatusChangeCallback asStatusChange() {
        return Jsons.convert(raw, WebhookStatusChangeCallback.class);
    }

    public WebhookActionCallback asAction() {
        return Jsons.convert(raw, WebhookActionCallback.class);
    }

    public WebhookCallsConnectCallback asCallsConnect() {
        return Jsons.convert(raw, WebhookCallsConnectCallback.class);
    }

    public WebhookCallsTerminateCallback asCallsTerminate() {
        return Jsons.convert(raw, WebhookCallsTerminateCallback.class);
    }

    public WebhookCallsStatusCallback asCallsStatus() {
        return Jsons.convert(raw, WebhookCallsStatusCallback.class);
    }

    public WebhookCallsPermissionReplyCallback asCallsPermissionReply() {
        return Jsons.convert(raw, WebhookCallsPermissionReplyCallback.class);
    }

    public WebhookCatalogProductCreateCallback asCatalogProductCreate() {
        return Jsons.convert(raw, WebhookCatalogProductCreateCallback.class);
    }

    public WebhookCatalogProductUpdateCallback asCatalogProductUpdate() {
        return Jsons.convert(raw, WebhookCatalogProductUpdateCallback.class);
    }

    public WebhookCatalogProductDeleteCallback asCatalogProductDelete() {
        return Jsons.convert(raw, WebhookCatalogProductDeleteCallback.class);
    }

    public WebhookCatalogProductBatchImportCallback asCatalogProductBatchImport() {
        return Jsons.convert(raw, WebhookCatalogProductBatchImportCallback.class);
    }
}
