package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Meta 审核状态筛选：PENDING=待审核 / REJECTED=已拒绝 / APPROVED=已通过 / OUTDATED=已过期。响应结果中 reviewStatus 还可能为空字符串（暂无审核状态）。
 */
public enum CatalogReviewStatus {

    PENDING("PENDING"),
    REJECTED("REJECTED"),
    APPROVED("APPROVED"),
    OUTDATED("OUTDATED");

    private final String value;

    CatalogReviewStatus(String value) {
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
    public static CatalogReviewStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (CatalogReviewStatus e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
