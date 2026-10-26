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
 * {@link WebhookListener} 的空实现适配器。继承本类并覆盖关心的方法即可，无需实现全部回调。
 */
public class WebhookListenerAdapter implements WebhookListener {

    @Override
    public void onSendSuccess(WebhookSendSuccessCallback callback) {
    }

    @Override
    public void onSendError(WebhookSendErrorCallback callback) {
    }

    @Override
    public void onContent(WebhookContentCallback callback) {
    }

    @Override
    public void onContentForBClient(WebhookContentForBClientCallback callback) {
    }

    @Override
    public void onStatusChange(WebhookStatusChangeCallback callback) {
    }

    @Override
    public void onAccountChange(WebhookEvent event) {
    }

    @Override
    public void onTemplateChange(WebhookEvent event) {
    }

    @Override
    public void onAction(WebhookActionCallback callback) {
    }

    @Override
    public void onCallsConnect(WebhookCallsConnectCallback callback) {
    }

    @Override
    public void onCallsTerminate(WebhookCallsTerminateCallback callback) {
    }

    @Override
    public void onCallsStatus(WebhookCallsStatusCallback callback) {
    }

    @Override
    public void onCallsPermissionReply(WebhookCallsPermissionReplyCallback callback) {
    }

    @Override
    public void onFlowWebhook(WebhookEvent event) {
    }

    @Override
    public void onCatalogProductCreate(WebhookCatalogProductCreateCallback callback) {
    }

    @Override
    public void onCatalogProductUpdate(WebhookCatalogProductUpdateCallback callback) {
    }

    @Override
    public void onCatalogProductDelete(WebhookCatalogProductDeleteCallback callback) {
    }

    @Override
    public void onCatalogProductBatchImport(WebhookCatalogProductBatchImportCallback callback) {
    }

    @Override
    public void onUnhandled(WebhookEvent event) {
    }
}
