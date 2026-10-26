package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 订单在管理端的履约展示状态，反映整单发货进度（非单次发货动作结果）。须使用 UNFULFILLED/FULFILLED/PARTIALLY_FULFILLED 等订单级枚举，勿传 SUCCESS/CANCELLED 等单次发货状态。取值：UNFULFILLED（未履约）、FULFILLED（已履约）、PARTIALLY_FULFILLED（部分履约）、IN_PROGRESS（履约中）、ON_HOLD（暂停履约）、SCHEDULED（已计划履约）、REQUEST_DECLINED（履约请求被拒绝）；OPEN/PENDING_FULFILLMENT/RESTOCKED 为已废弃值，语义分别同 UNFULFILLED/IN_PROGRESS/UNFULFILLED。
 */
public enum BizSyncFulfillmentStatus {

    UNFULFILLED("UNFULFILLED"),
    FULFILLED("FULFILLED"),
    PARTIALLY_FULFILLED("PARTIALLY_FULFILLED"),
    IN_PROGRESS("IN_PROGRESS"),
    ON_HOLD("ON_HOLD"),
    SCHEDULED("SCHEDULED"),
    REQUEST_DECLINED("REQUEST_DECLINED"),
    OPEN("OPEN"),
    PENDING_FULFILLMENT("PENDING_FULFILLMENT"),
    RESTOCKED("RESTOCKED");

    private final String value;

    BizSyncFulfillmentStatus(String value) {
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
    public static BizSyncFulfillmentStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (BizSyncFulfillmentStatus e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
