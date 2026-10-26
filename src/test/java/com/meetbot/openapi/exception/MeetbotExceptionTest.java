package com.meetbot.openapi.exception;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.StringIdResult;
import com.meetbot.openapi.util.Jsons;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeetbotExceptionTest {

    @Test
    void apiException_readsBusinessFailureFields() {
        String raw = "{\"code\":999,\"success\":false,\"message\":\"无账号权限\",\"traceId\":\"t-1\",\"result\":null}";
        ApiResponse<StringIdResult> response = Jsons.fromJson(raw, new TypeReference<ApiResponse<StringIdResult>>() {
        });
        assertFalse(response.isSuccessful());
        assertEquals(Integer.valueOf(999), response.getCode());

        MeetbotApiException ex = new MeetbotApiException(
                response.getCode(), response.getMessage(), response.getTraceId(), raw);
        assertEquals(Integer.valueOf(999), ex.getCode());
        assertEquals("无账号权限", ex.getApiMessage());
        assertEquals("t-1", ex.getTraceId());
        assertEquals(raw, ex.getRawBody());
        assertTrue(ex.getMessage().contains("999"));
        assertTrue(ex.getMessage().contains("t-1"));
    }

    @Test
    void httpException_exposesStatusBodyAndHeaders() {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("X-Trace-Id", Arrays.asList("abc"));
        MeetbotHttpException ex = new MeetbotHttpException("HTTP 429", 429, "{\"error\":\"limit\"}", headers);

        assertEquals(429, ex.getHttpStatus());
        assertEquals("{\"error\":\"limit\"}", ex.getRawBody());
        assertEquals("abc", ex.getHeader("x-trace-id"));
        assertEquals("abc", ex.getHeader("X-Trace-Id"));
        assertNull(ex.getHeader("missing"));
    }

    @Test
    void httpException_withoutHeaders() {
        MeetbotHttpException ex = new MeetbotHttpException("bad url", -1, null);
        assertEquals(-1, ex.getHttpStatus());
        assertNull(ex.getRawBody());
        assertEquals(Collections.emptyMap(), ex.getResponseHeaders());
        assertNull(ex.getHeader("X-Trace-Id"));
    }
}
