package com.meetbot.openapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MeetbotClientLifecycleTest {

    @Test
    void close_isIdempotent() {
        MeetbotClient client = MeetbotClient.builder()
                .apiKey("test-key")
                .baseUrl("https://example.invalid")
                .build();
        client.close();
        client.close();
        assertEquals("test-key", client.getConfig().getApiKey());
    }

    @Test
    void tryWithResources_closesWithoutError() {
        try (MeetbotClient client = MeetbotClient.create("test-key")) {
            assertEquals(MeetbotConfig.DEFAULT_BASE_URL, client.getConfig().getBaseUrl());
        }
    }

    @Test
    void builder_rejectsEmptyApiKey() {
        assertThrows(IllegalArgumentException.class, () -> MeetbotClient.builder().apiKey(" ").build());
    }
}
