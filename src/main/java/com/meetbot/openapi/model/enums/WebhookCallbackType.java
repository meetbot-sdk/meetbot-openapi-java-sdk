package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Webhook 回调类型：SEND_SUCCESS（OpenAPI 发送 Meta 调用成功）、SEND_ERROR（OpenAPI 发送 Meta 同步失败）、CONTENT（C 端用户消息）、CONTENT_FOR_B_CLIENT（客服/B 端发送消息）、STATUS_CHANGE（消息状态变更）、ACCOUNT_CHANGE（账号变更）、TEMPLATE_CHANGE（模板变更）、ACTION（标签/会话控制等动作）、calls_connect（通话连接）、calls_terminate（通话终止）、calls_status（通话状态）、calls_call_permission_reply（通话权限回复）
 */
public enum WebhookCallbackType {

    SEND_SUCCESS("SEND_SUCCESS"),
    SEND_ERROR("SEND_ERROR"),
    CONTENT("CONTENT"),
    CONTENT_FOR_B_CLIENT("CONTENT_FOR_B_CLIENT"),
    STATUS_CHANGE("STATUS_CHANGE"),
    ACCOUNT_CHANGE("ACCOUNT_CHANGE"),
    TEMPLATE_CHANGE("TEMPLATE_CHANGE"),
    ACTION("ACTION"),
    CALLS_CONNECT("calls_connect"),
    CALLS_TERMINATE("calls_terminate"),
    CALLS_STATUS("calls_status"),
    CALLS_CALL_PERMISSION_REPLY("calls_call_permission_reply"),
    FLOW_WEBHOOK("FLOW_WEBHOOK"),
    CREATE_CATALOG_PRODUCT_BY_API("CREATE_CATALOG_PRODUCT_BY_API"),
    UPDATE_CATALOG_PRODUCT_BY_API("UPDATE_CATALOG_PRODUCT_BY_API"),
    DELETE_CATALOG_PRODUCT_BY_API("DELETE_CATALOG_PRODUCT_BY_API"),
    UPLOAD_CATALOG_PRODUCT_BY_API("UPLOAD_CATALOG_PRODUCT_BY_API");

    private final String value;

    WebhookCallbackType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static WebhookCallbackType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (WebhookCallbackType e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
