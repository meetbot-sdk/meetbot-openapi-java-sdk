package com.meetbot.openapi.http;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 构造 query string 的小工具。
 */
public final class QueryParams {

    private final Map<String, String> values = new LinkedHashMap<String, String>();

    public static QueryParams create() {
        return new QueryParams();
    }

    public QueryParams add(String name, Object value) {
        if (value != null) {
            values.put(name, String.valueOf(value));
        }
        return this;
    }

    public Map<String, String> toMap() {
        return values;
    }
}
