package com.meetbot.openapi.exception;

/**
 * 服务端返回业务失败（HTTP 200 但 {@code code != 0} 或 {@code success = false}）。
 */
public class MeetbotApiException extends MeetbotException {

    private static final long serialVersionUID = 1L;

    private final Integer code;
    private final String apiMessage;
    private final String traceId;
    private final String rawBody;

    public MeetbotApiException(Integer code, String apiMessage, String traceId, String rawBody) {
        super(buildMessage(code, apiMessage, traceId));
        this.code = code;
        this.apiMessage = apiMessage;
        this.traceId = traceId;
        this.rawBody = rawBody;
    }

    private static String buildMessage(Integer code, String apiMessage, String traceId) {
        StringBuilder sb = new StringBuilder("Meetbot API error");
        if (code != null) {
            sb.append(", code=").append(code);
        }
        if (apiMessage != null && !apiMessage.isEmpty()) {
            sb.append(", message=").append(apiMessage);
        }
        if (traceId != null && !traceId.isEmpty()) {
            sb.append(", traceId=").append(traceId);
        }
        return sb.toString();
    }

    public Integer getCode() {
        return code;
    }

    public String getApiMessage() {
        return apiMessage;
    }

    public String getTraceId() {
        return traceId;
    }

    public String getRawBody() {
        return rawBody;
    }
}
