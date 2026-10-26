package com.meetbot.openapi.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.meetbot.openapi.util.Jsons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExtensibleDtoJsonTest {

    @Test
    void serializeTextObject_omitsAdditionalPropertiesKey() throws Exception {
        WhatsappTextObject text = new WhatsappTextObject().body("hello");
        String json = Jsons.toJson(text);
        JsonNode node = Jsons.mapper().readTree(json);

        assertEquals("hello", node.get("body").asText());
        assertFalse(node.has("additionalProperties"));
        assertFalse(node.has("preview_url"));
    }

    @Test
    void serializeTextObject_flattensUnknownFields() throws Exception {
        WhatsappTextObject text = new WhatsappTextObject().body("hello");
        text.setAdditionalProperty("foo", "bar");
        String json = Jsons.toJson(text);
        JsonNode node = Jsons.mapper().readTree(json);

        assertEquals("hello", node.get("body").asText());
        assertEquals("bar", node.get("foo").asText());
        assertFalse(node.has("additionalProperties"));
    }

    @Test
    void deserializeTextObject_capturesUnknownFields() {
        WhatsappTextObject text = Jsons.fromJson(
                "{\"body\":\"hi\",\"preview_url\":true,\"extra\":1}",
                WhatsappTextObject.class);

        assertEquals("hi", text.getBody());
        assertEquals(Boolean.TRUE, text.getPreviewUrl());
        assertEquals(1, ((Number) text.getAdditionalProperties().get("extra")).intValue());
        assertNull(text.getAdditionalProperties().get("body"));
    }

    @Test
    void serializeSendParam_includesRecipientBsuid() throws Exception {
        WhatsappMessageSendParam param = new WhatsappMessageSendParam()
                .messagingProduct("whatsapp")
                .recipient("CN.2142923803139817")
                .type(com.meetbot.openapi.model.enums.WhatsappMessageType.TEXT)
                .text(new WhatsappTextObject().body("hello"));
        String json = Jsons.toJson(param);
        JsonNode node = Jsons.mapper().readTree(json);

        assertEquals("CN.2142923803139817", node.get("recipient").asText());
        assertFalse(node.has("to"));
        assertFalse(node.has("additionalProperties"));
    }
}
