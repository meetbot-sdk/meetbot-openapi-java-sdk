package com.meetbot.openapi.webhook;

import com.meetbot.openapi.model.WebhookActionCallback;
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
import com.meetbot.openapi.model.WebhookSendSuccessCallback;
import com.meetbot.openapi.model.WebhookStatusChangeCallback;

/**
 * Webhook 事件回调。日常接入请继承 {@link WebhookListenerAdapter}，只覆盖需要的方法。
 */
public interface WebhookListener {

    void onSendSuccess(WebhookSendSuccessCallback callback);

    void onSendError(WebhookSendErrorCallback callback);

    void onContent(WebhookContentCallback callback);

    void onContentForBClient(WebhookContentForBClientCallback callback);

    void onStatusChange(WebhookStatusChangeCallback callback);

    void onAccountChange(WebhookEvent event);

    void onTemplateChange(WebhookEvent event);

    void onAction(WebhookActionCallback callback);

    void onCallsConnect(WebhookCallsConnectCallback callback);

    void onCallsTerminate(WebhookCallsTerminateCallback callback);

    void onCallsStatus(WebhookCallsStatusCallback callback);

    void onCallsPermissionReply(WebhookCallsPermissionReplyCallback callback);

    void onFlowWebhook(WebhookEvent event);

    void onCatalogProductCreate(WebhookCatalogProductCreateCallback callback);

    void onCatalogProductUpdate(WebhookCatalogProductUpdateCallback callback);

    void onCatalogProductDelete(WebhookCatalogProductDeleteCallback callback);

    void onCatalogProductBatchImport(WebhookCatalogProductBatchImportCallback callback);

    /**
     * 未知或未识别的 type。
     */
    void onUnhandled(WebhookEvent event);
}
