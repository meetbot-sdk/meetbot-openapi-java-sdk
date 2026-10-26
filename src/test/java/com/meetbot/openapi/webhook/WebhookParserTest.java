package com.meetbot.openapi.webhook;

import com.meetbot.openapi.exception.MeetbotException;
import com.meetbot.openapi.model.WebhookSendSuccessCallback;
import com.meetbot.openapi.model.enums.WebhookCallbackType;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebhookParserTest {

    @Test
    void parseSendSuccess_andDispatch() {
        String body = "{"
                + "\"type\":\"SEND_SUCCESS\","
                + "\"messageId\":12345,"
                + "\"msg\":{\"receiver\":\"8613800000000\",\"mid\":\"wamid.abc\"}"
                + "}";

        WebhookEvent event = WebhookParser.parse(body);
        assertEquals(WebhookCallbackType.SEND_SUCCESS, event.getTypeEnum());
        assertEquals(12345L, event.getMessageId());

        AtomicReference<WebhookSendSuccessCallback> captured = new AtomicReference<WebhookSendSuccessCallback>();
        WebhookParser.dispatch(event, new WebhookListenerAdapter() {
            @Override
            public void onSendSuccess(WebhookSendSuccessCallback callback) {
                captured.set(callback);
            }
        });

        WebhookSendSuccessCallback callback = captured.get();
        assertEquals(12345L, callback.getMessageId());
        assertEquals("wamid.abc", callback.getMsg().getMid());
        assertEquals("8613800000000", callback.getMsg().getReceiver());
    }

    @Test
    void dispatchUnknownType_goesToUnhandled() {
        WebhookEvent event = WebhookParser.parse("{\"type\":\"NOT_A_REAL_TYPE\",\"msg\":{}}");
        AtomicReference<WebhookEvent> unhandled = new AtomicReference<WebhookEvent>();
        WebhookParser.dispatch(event, new WebhookListenerAdapter() {
            @Override
            public void onUnhandled(WebhookEvent e) {
                unhandled.set(e);
            }
        });
        assertEquals("NOT_A_REAL_TYPE", unhandled.get().getType());
    }

    @Test
    void parseEmptyBody_throws() {
        MeetbotException ex = assertThrows(MeetbotException.class, () -> WebhookParser.parse("  "));
        assertTrue(ex.getMessage().contains("Webhook body"));
    }
}
