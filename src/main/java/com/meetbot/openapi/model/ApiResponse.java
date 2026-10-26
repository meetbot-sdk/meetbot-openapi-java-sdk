package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Meetbot 统一响应包装。
 *
 * @param <T> result 业务数据类型
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse<T> {

    /**
     * 0 为成功，非 0 为错误码。
     */
    private Integer code;
    /**
     * code 非 0 时的错误原因。
     */
    private String message;
    /**
     * 业务数据。
     */
    private T result;
    private String traceId;
    private Boolean success;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public boolean isSuccessful() {
        if (success != null) {
            return success;
        }
        return code != null && code == 0;
    }
}
