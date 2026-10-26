package com.meetbot.openapi;

import java.util.concurrent.TimeUnit;

/**
 * Meetbot OpenAPI 客户端配置。
 */
public class MeetbotConfig {

    public static final String DEFAULT_BASE_URL = "https://openapi.meetbot.com";
    public static final String SDK_VERSION = "1.0.0";
    public static final String USER_AGENT = "meetbot-openapi-java/" + SDK_VERSION;

    private final String baseUrl;
    private final String apiKey;
    private final long connectTimeoutMs;
    private final long readTimeoutMs;
    private final long writeTimeoutMs;
    private final boolean debug;

    private MeetbotConfig(Builder builder) {
        this.baseUrl = trimTrailingSlash(builder.baseUrl);
        this.apiKey = builder.apiKey;
        this.connectTimeoutMs = builder.connectTimeoutMs;
        this.readTimeoutMs = builder.readTimeoutMs;
        this.writeTimeoutMs = builder.writeTimeoutMs;
        this.debug = builder.debug;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public long getWriteTimeoutMs() {
        return writeTimeoutMs;
    }

    public boolean isDebug() {
        return debug;
    }

    private static String trimTrailingSlash(String url) {
        if (url == null || url.isEmpty()) {
            return DEFAULT_BASE_URL;
        }
        int end = url.length();
        while (end > 0 && url.charAt(end - 1) == '/') {
            end--;
        }
        return url.substring(0, end);
    }

    public static final class Builder {
        private String baseUrl = DEFAULT_BASE_URL;
        private String apiKey;
        private long connectTimeoutMs = TimeUnit.SECONDS.toMillis(10);
        private long readTimeoutMs = TimeUnit.SECONDS.toMillis(60);
        private long writeTimeoutMs = TimeUnit.SECONDS.toMillis(60);
        private boolean debug;

        private Builder() {
        }

        /**
         * API 根地址，默认生产环境 {@code https://openapi.meetbot.com}。
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * 请求头 {@code APIKEY}。请在店铺后台「API管理 - 密钥管理」获取。
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder connectTimeout(long timeout, TimeUnit unit) {
            this.connectTimeoutMs = unit.toMillis(timeout);
            return this;
        }

        public Builder readTimeout(long timeout, TimeUnit unit) {
            this.readTimeoutMs = unit.toMillis(timeout);
            return this;
        }

        public Builder writeTimeout(long timeout, TimeUnit unit) {
            this.writeTimeoutMs = unit.toMillis(timeout);
            return this;
        }

        /**
         * 开启后通过 SLF4J 打印 HTTP 方法、URL 与响应体摘要（不含 API Key）。
         * 响应体可能含用户消息等个人信息，生产环境请保持关闭。
         */
        public Builder debug(boolean debug) {
            this.debug = debug;
            return this;
        }

        public MeetbotConfig build() {
            if (apiKey == null || apiKey.trim().isEmpty()) {
                throw new IllegalArgumentException("apiKey 不能为空");
            }
            if (baseUrl == null || baseUrl.trim().isEmpty()) {
                throw new IllegalArgumentException("baseUrl 不能为空");
            }
            return new MeetbotConfig(this);
        }
    }
}
