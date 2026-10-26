package com.meetbot.openapi.http;

import com.meetbot.openapi.MeetbotConfig;
import com.meetbot.openapi.exception.MeetbotApiException;
import com.meetbot.openapi.exception.MeetbotHttpException;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.util.Jsons;

import com.fasterxml.jackson.core.type.TypeReference;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import lombok.extern.slf4j.Slf4j;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Meetbot HTTP 传输层：自动附加 APIKEY、解析统一响应并在业务失败时抛出异常。
 *
 * <p>SDK 自行创建的 {@link OkHttpClient} 在 {@link #close()} 时关闭线程池与连接；
 * 调用方传入的自定义客户端不会被关闭。
 */
@Slf4j
public class MeetbotHttpClient implements Closeable {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final MeetbotConfig config;
    private final OkHttpClient okHttpClient;
    private final boolean ownedClient;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    public MeetbotHttpClient(MeetbotConfig config) {
        this.config = config;
        this.okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(config.getConnectTimeoutMs(), TimeUnit.MILLISECONDS)
                .readTimeout(config.getReadTimeoutMs(), TimeUnit.MILLISECONDS)
                .writeTimeout(config.getWriteTimeoutMs(), TimeUnit.MILLISECONDS)
                .build();
        this.ownedClient = true;
    }

    public MeetbotHttpClient(MeetbotConfig config, OkHttpClient okHttpClient) {
        this.config = config;
        this.okHttpClient = okHttpClient;
        this.ownedClient = false;
    }

    public MeetbotConfig getConfig() {
        return config;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    /**
     * 关闭 SDK 持有的 OkHttp 线程池与连接。自定义 {@link OkHttpClient} 不会被关闭。
     * 可重复调用。
     */
    @Override
    public void close() {
        if (!ownedClient || !closed.compareAndSet(false, true)) {
            return;
        }
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
        if (okHttpClient.cache() != null) {
            try {
                okHttpClient.cache().close();
            } catch (IOException ignored) {
                // ignore
            }
        }
    }

    public <T> T get(String path, TypeReference<ApiResponse<T>> typeRef) {
        return get(path, null, typeRef);
    }

    public <T> T get(String path, Map<String, String> query, TypeReference<ApiResponse<T>> typeRef) {
        return unwrap(execute("GET", path, query, null, null, typeRef));
    }

    /**
     * 部分接口文档定义为 GET 但携带 JSON Body（例如生成内容预览 URL）。
     */
    public <T> T getWithJson(String path, Object body, TypeReference<ApiResponse<T>> typeRef) {
        return unwrap(execute("GET", path, null, body, null, typeRef));
    }

    public <T> T post(String path, Object body, TypeReference<ApiResponse<T>> typeRef) {
        return unwrap(execute("POST", path, null, body, null, typeRef));
    }

    public <T> T post(String path, Map<String, String> query, Object body, TypeReference<ApiResponse<T>> typeRef) {
        return unwrap(execute("POST", path, query, body, null, typeRef));
    }

    public <T> T postMultipart(String path, Map<String, String> query, String fileFieldName, File file,
                               Map<String, String> formFields, TypeReference<ApiResponse<T>> typeRef) {
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        if (formFields != null) {
            for (Map.Entry<String, String> entry : formFields.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addFormDataPart(entry.getKey(), entry.getValue());
                }
            }
        }
        if (file != null) {
            String fileName = file.getName();
            RequestBody fileBody = RequestBody.create(MediaType.parse("application/octet-stream"), file);
            builder.addFormDataPart(fileFieldName, fileName, fileBody);
        }
        return unwrap(execute("POST", path, query, null, builder.build(), typeRef));
    }

    public <T> T postMultipart(String path, Map<String, String> query, String fileFieldName, String fileName,
                               InputStream content, Map<String, String> formFields,
                               TypeReference<ApiResponse<T>> typeRef) {
        byte[] bytes;
        try {
            bytes = readAll(content);
        } catch (IOException e) {
            throw new MeetbotHttpException("读取上传流失败", e);
        }
        MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        if (formFields != null) {
            for (Map.Entry<String, String> entry : formFields.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addFormDataPart(entry.getKey(), entry.getValue());
                }
            }
        }
        RequestBody fileBody = RequestBody.create(MediaType.parse("application/octet-stream"), bytes);
        builder.addFormDataPart(fileFieldName, fileName, fileBody);
        return unwrap(execute("POST", path, query, null, builder.build(), typeRef));
    }

    public <T> ApiResponse<T> execute(String method, String path, Map<String, String> query, Object jsonBody,
                                      RequestBody rawBody, TypeReference<ApiResponse<T>> typeRef) {
        HttpUrl httpUrl = buildUrl(path, query);
        Request.Builder requestBuilder = new Request.Builder()
                .url(httpUrl)
                .header("APIKEY", config.getApiKey())
                .header("Accept", "application/json")
                .header("User-Agent", MeetbotConfig.USER_AGENT);

        RequestBody requestBody = rawBody;
        if (requestBody == null && jsonBody != null) {
            requestBody = RequestBody.create(JSON, Jsons.toJson(jsonBody));
        }
        if ("GET".equalsIgnoreCase(method)) {
            if (requestBody != null) {
                requestBuilder.method("GET", requestBody);
            } else {
                requestBuilder.get();
            }
        } else if ("POST".equalsIgnoreCase(method)) {
            if (requestBody == null) {
                requestBody = RequestBody.create(JSON, "{}");
            }
            requestBuilder.post(requestBody);
        } else {
            requestBuilder.method(method, requestBody);
        }

        Request request = requestBuilder.build();
        if (config.isDebug()) {
            log.info("[Meetbot SDK] --> {} {}", method, httpUrl);
        }

        try (Response response = okHttpClient.newCall(request).execute()) {
            Map<String, List<String>> responseHeaders = copyHeaders(response.headers());
            ResponseBody body = response.body();
            String raw = body == null ? "" : body.string();
            if (config.isDebug()) {
                log.info("[Meetbot SDK] <-- {} {}", response.code(), abbreviate(raw));
            }
            if (!response.isSuccessful()) {
                throw new MeetbotHttpException(
                        "HTTP " + response.code() + " " + response.message() + " for " + path,
                        response.code(),
                        raw,
                        responseHeaders);
            }
            ApiResponse<T> apiResponse;
            try {
                apiResponse = Jsons.fromJson(raw, typeRef);
            } catch (MeetbotHttpException e) {
                throw e;
            } catch (RuntimeException e) {
                throw new MeetbotHttpException("响应 JSON 解析失败: " + e.getMessage(), e);
            }
            if (apiResponse == null) {
                throw new MeetbotHttpException("响应体为空", response.code(), raw, responseHeaders);
            }
            if (!apiResponse.isSuccessful()) {
                throw new MeetbotApiException(apiResponse.getCode(), apiResponse.getMessage(),
                        apiResponse.getTraceId(), raw);
            }
            return apiResponse;
        } catch (IOException e) {
            throw new MeetbotHttpException("调用 Meetbot API 失败: " + path, e);
        }
    }

    public <T> T unwrap(ApiResponse<T> response) {
        return response == null ? null : response.getResult();
    }

    private HttpUrl buildUrl(String path, Map<String, String> query) {
        String normalized = path.startsWith("/") ? path : "/" + path;
        HttpUrl parsed = HttpUrl.parse(config.getBaseUrl() + normalized);
        if (parsed == null) {
            throw new MeetbotHttpException("非法 URL: " + config.getBaseUrl() + normalized, -1, null);
        }
        HttpUrl.Builder builder = parsed.newBuilder();
        if (query != null) {
            for (Map.Entry<String, String> entry : query.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        return builder.build();
    }

    private static byte[] readAll(InputStream in) throws IOException {
        if (in == null) {
            return new byte[0];
        }
        byte[] buffer = new byte[8192];
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int n;
        while ((n = in.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }

    private static Map<String, List<String>> copyHeaders(Headers headers) {
        if (headers == null || headers.size() == 0) {
            return Collections.emptyMap();
        }
        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        for (String name : headers.names()) {
            map.put(name, Collections.unmodifiableList(new ArrayList<String>(headers.values(name))));
        }
        return Collections.unmodifiableMap(map);
    }

    private static String abbreviate(String raw) {
        if (raw == null) {
            return "";
        }
        if (raw.length() <= 2000) {
            return raw;
        }
        return raw.substring(0, 2000) + "...(" + raw.length() + " chars)";
    }
}
