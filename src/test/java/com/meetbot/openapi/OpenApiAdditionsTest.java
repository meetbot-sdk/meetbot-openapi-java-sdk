package com.meetbot.openapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.meetbot.openapi.exception.MeetbotApiException;
import com.meetbot.openapi.model.ExtensibleDto;
import com.meetbot.openapi.model.StringIdResult;
import com.meetbot.openapi.util.Jsons;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/** Contract examples copied from openapi.json; all HTTP is intercepted locally. */
class OpenApiAdditionsTest {

    @TestFactory
    List<DynamicTest> documentedRequestsAndResponses() throws Exception {
        JsonNode fixtures;
        try (InputStream in = getClass().getResourceAsStream("/openapi-additions.json")) {
            assertNotNull(in);
            fixtures = Jsons.mapper().readTree(in);
        }
        assertEquals(42, fixtures.size());
        List<DynamicTest> tests = new ArrayList<>();
        for (JsonNode fixture : fixtures) {
            tests.add(DynamicTest.dynamicTest(fixture.get("operationId").asText(), () -> verify(fixture)));
        }
        return tests;
    }

    private void verify(JsonNode fixture) throws Exception {
        AtomicReference<Request> captured = new AtomicReference<>();
        AtomicReference<String> response = new AtomicReference<>(
                "{\"code\":0,\"success\":true,\"result\":" + fixture.get("result") + "}");
        OkHttpClient transport = new OkHttpClient.Builder().addInterceptor(chain -> {
            captured.set(chain.request());
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1)
                    .code(200).message("OK")
                    .body(ResponseBody.create(MediaType.parse("application/json"), response.get())).build();
        }).build();
        try (MeetbotClient client = MeetbotClient.builder().apiKey("contract-key")
                .baseUrl("https://example.invalid").okHttpClient(transport).build()) {
            Class<?> apiType = Class.forName("com.meetbot.openapi.api." + fixture.get("api").asText());
            Object api = null;
            for (Method accessor : MeetbotClient.class.getMethods()) {
                if (accessor.getReturnType().equals(apiType) && accessor.getParameterCount() == 0) {
                    api = accessor.invoke(client);
                }
            }
            assertNotNull(api, "API must be reachable from MeetbotClient");
            Class<?>[] types = new Class<?>[fixture.get("argTypes").size()];
            Object[] args = new Object[types.length];
            for (int i = 0; i < types.length; i++) {
                String name = fixture.get("argTypes").get(i).asText();
                types[i] = Class.forName((name.equals("String") || name.equals("Long") || name.equals("Boolean")
                        ? "java.lang." : "com.meetbot.openapi.model.") + name);
                args[i] = Jsons.convert(fixture.get("argValues").get(i), types[i]);
            }
            Method method = apiType.getMethod(fixture.get("method").asText(), types);
            Object result = method.invoke(api, args);
            if (result instanceof StringIdResult) {
                assertEquals(fixture.get("result").get("id").asText(), ((StringIdResult) result).getId());
            } else {
                assertEquals(fixture.get("result"), Jsons.readTree(Jsons.toJson(result)));
            }
            Request request = captured.get();
            assertEquals(fixture.get("verb").asText(), request.method());
            assertEquals(fixture.get("path").asText(), request.url().encodedPath());
            assertEquals("contract-key", request.header("APIKEY"));
            assertEquals(fixture.get("query").size(), request.url().querySize());
            Iterator<Map.Entry<String, JsonNode>> query = fixture.get("query").fields();
            while (query.hasNext()) {
                Map.Entry<String, JsonNode> entry = query.next();
                assertEquals(entry.getValue().asText(), request.url().queryParameter(entry.getKey()));
            }
            if (fixture.get("body").isNull()) {
                assertNull(request.body());
            } else {
                Buffer buffer = new Buffer();
                request.body().writeTo(buffer);
                assertEquals(fixture.get("body"), Jsons.readTree(buffer.readUtf8()));
            }
            if (result instanceof ExtensibleDto) {
                ((ExtensibleDto) result).setAdditionalProperty("future_meta_field", "retained");
                JsonNode serialized = Jsons.readTree(Jsons.toJson(result));
                assertEquals("retained", serialized.get("future_meta_field").asText());
                assertFalse(serialized.has("additionalProperties"));
            }
            response.set("{\"code\":400001,\"success\":false,\"message\":\"invalid request\"}");
            Object target = api;
            InvocationTargetException error = assertThrows(InvocationTargetException.class,
                    () -> method.invoke(target, args));
            assertTrue(error.getCause() instanceof MeetbotApiException);
        } finally {
            transport.dispatcher().executorService().shutdown();
            transport.connectionPool().evictAll();
        }
    }

    @Test
    void optionalQueryParametersAreOmittedAndCursorIsEncoded() {
        OkHttpClient transport = new OkHttpClient.Builder().addInterceptor(chain -> {
            assertEquals(2, chain.request().url().querySize());
            assertEquals("a+/=& 中文", chain.request().url().queryParameter("after"));
            assertNull(chain.request().url().queryParameter("limit"));
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1)
                    .code(200).message("OK").body(ResponseBody.create(MediaType.parse("application/json"),
                            "{\"code\":0,\"result\":{\"data\":[]}}" )).build();
        }).build();
        try (MeetbotClient client = MeetbotClient.builder().apiKey("test").okHttpClient(transport).build()) {
            assertTrue(client.groups().list("phone-id", null, null, "a+/=& 中文").getData().isEmpty());
        } finally {
            transport.dispatcher().executorService().shutdown();
            transport.connectionPool().evictAll();
        }
    }
}
