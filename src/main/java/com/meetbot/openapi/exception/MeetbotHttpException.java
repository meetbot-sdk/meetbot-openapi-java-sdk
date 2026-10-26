package com.meetbot.openapi.exception;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * HTTP 层失败（非 2xx、超时、网络错误、响应无法解析等）。
 */
public class MeetbotHttpException extends MeetbotException {

    private static final long serialVersionUID = 1L;

    private final int httpStatus;
    private final String rawBody;
    private final Map<String, List<String>> responseHeaders;

    public MeetbotHttpException(String message, int httpStatus, String rawBody) {
        this(message, httpStatus, rawBody, null);
    }

    public MeetbotHttpException(String message, int httpStatus, String rawBody,
                                Map<String, List<String>> responseHeaders) {
        super(message);
        this.httpStatus = httpStatus;
        this.rawBody = rawBody;
        this.responseHeaders = responseHeaders == null
                ? Collections.<String, List<String>>emptyMap()
                : Collections.unmodifiableMap(responseHeaders);
    }

    public MeetbotHttpException(String message, Throwable cause) {
        super(message, cause);
        this.httpStatus = -1;
        this.rawBody = null;
        this.responseHeaders = Collections.emptyMap();
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getRawBody() {
        return rawBody;
    }

    /**
     * 响应头（可能为空）。键为原始头名称。
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * 按名称取第一个响应头，忽略大小写。
     */
    public String getHeader(String name) {
        if (name == null || responseHeaders.isEmpty()) {
            return null;
        }
        List<String> values = responseHeaders.get(name);
        if (values == null) {
            for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
                if (name.equalsIgnoreCase(entry.getKey())) {
                    values = entry.getValue();
                    break;
                }
            }
        }
        if (values == null || values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }
}
