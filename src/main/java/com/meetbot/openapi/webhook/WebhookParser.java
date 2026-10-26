package com.meetbot.openapi.webhook;

import com.fasterxml.jackson.databind.JsonNode;
import com.meetbot.openapi.exception.MeetbotException;
import com.meetbot.openapi.model.enums.WebhookCallbackType;
import com.meetbot.openapi.util.Jsons;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 解析 Meetbot 推送到客户 Webhook 地址的 JSON Body。
 */
public final class WebhookParser {

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private WebhookParser() {
    }

    public static WebhookEvent parse(String json) {
        if (json == null || json.trim().isEmpty()) {
            throw new MeetbotException("Webhook body 为空");
        }
        JsonNode tree = Jsons.readTree(json);
        WebhookEvent event = Jsons.convert(tree, WebhookEvent.class);
        if (event == null) {
            throw new MeetbotException("Webhook JSON 无法解析");
        }
        event.setRaw(tree);
        return event;
    }

    public static WebhookEvent parse(byte[] json) {
        if (json == null) {
            throw new MeetbotException("Webhook body 为空");
        }
        return parse(new String(json, UTF_8));
    }

    public static WebhookEvent parse(InputStream in) {
        if (in == null) {
            throw new MeetbotException("Webhook body 为空");
        }
        try {
            return parse(Jsons.mapper().readTree(in).toString());
        } catch (IOException e) {
            throw new MeetbotException("读取 Webhook body 失败", e);
        }
    }

    /**
     * 按 type 分发到 {@link WebhookListenerAdapter}。未知类型走 {@link WebhookListener#onUnhandled(WebhookEvent)}。
     * 接入方继承适配器并覆盖需要的方法即可。
     */
    public static void dispatch(WebhookEvent event, WebhookListenerAdapter adapter) {
        if (event == null || adapter == null) {
            return;
        }
        WebhookCallbackType type = event.getTypeEnum();
        if (type == null) {
            adapter.onUnhandled(event);
            return;
        }
        switch (type) {
            case SEND_SUCCESS:
                adapter.onSendSuccess(event.asSendSuccess());
                break;
            case SEND_ERROR:
                adapter.onSendError(event.asSendError());
                break;
            case CONTENT:
                adapter.onContent(event.asContent());
                break;
            case CONTENT_FOR_B_CLIENT:
                adapter.onContentForBClient(event.asContentForBClient());
                break;
            case STATUS_CHANGE:
                adapter.onStatusChange(event.asStatusChange());
                break;
            case ACCOUNT_CHANGE:
                adapter.onAccountChange(event);
                break;
            case TEMPLATE_CHANGE:
                adapter.onTemplateChange(event);
                break;
            case ACTION:
                adapter.onAction(event.asAction());
                break;
            case CALLS_CONNECT:
                adapter.onCallsConnect(event.asCallsConnect());
                break;
            case CALLS_TERMINATE:
                adapter.onCallsTerminate(event.asCallsTerminate());
                break;
            case CALLS_STATUS:
                adapter.onCallsStatus(event.asCallsStatus());
                break;
            case CALLS_CALL_PERMISSION_REPLY:
                adapter.onCallsPermissionReply(event.asCallsPermissionReply());
                break;
            case FLOW_WEBHOOK:
                adapter.onFlowWebhook(event);
                break;
            case CREATE_CATALOG_PRODUCT_BY_API:
                adapter.onCatalogProductCreate(event.asCatalogProductCreate());
                break;
            case UPDATE_CATALOG_PRODUCT_BY_API:
                adapter.onCatalogProductUpdate(event.asCatalogProductUpdate());
                break;
            case DELETE_CATALOG_PRODUCT_BY_API:
                adapter.onCatalogProductDelete(event.asCatalogProductDelete());
                break;
            case UPLOAD_CATALOG_PRODUCT_BY_API:
                adapter.onCatalogProductBatchImport(event.asCatalogProductBatchImport());
                break;
            default:
                adapter.onUnhandled(event);
                break;
        }
    }
}
