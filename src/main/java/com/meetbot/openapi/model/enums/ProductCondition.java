package com.meetbot.openapi.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 商品成色（Meta code）：new=全新 / refurbished=翻新 / used=二手 / used_like_new=二手（几乎全新） / used_good=二手（成色好） / used_fair=二手（成色尚可）
 */
public enum ProductCondition {

    NEW("new"),
    REFURBISHED("refurbished"),
    USED("used"),
    USED_LIKE_NEW("used_like_new"),
    USED_GOOD("used_good"),
    USED_FAIR("used_fair");

    private final String value;

    ProductCondition(String value) {
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
    public static ProductCondition fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (ProductCondition e : values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
