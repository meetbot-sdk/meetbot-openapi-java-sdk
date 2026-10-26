package com.meetbot.openapi.exception;

/**
 * Meetbot SDK 所有运行时异常的基类。
 */
public class MeetbotException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MeetbotException(String message) {
        super(message);
    }

    public MeetbotException(String message, Throwable cause) {
        super(message, cause);
    }
}
