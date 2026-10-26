package com.meetbot.openapi;

import com.meetbot.openapi.api.GroupApi;
import com.meetbot.openapi.api.WelcomeMessageApi;
import com.meetbot.openapi.api.AnalyticsApi;
import com.meetbot.openapi.api.AccountApi;
import com.meetbot.openapi.api.BizSyncApi;
import com.meetbot.openapi.api.BlockApi;
import com.meetbot.openapi.api.CallingApi;
import com.meetbot.openapi.api.CatalogApi;
import com.meetbot.openapi.api.CustomerApi;
import com.meetbot.openapi.api.FlowApi;
import com.meetbot.openapi.api.MessageApi;
import com.meetbot.openapi.api.TagApi;
import com.meetbot.openapi.api.TemplateApi;
import com.meetbot.openapi.http.MeetbotHttpClient;
import okhttp3.OkHttpClient;

/**
 * Meetbot 开放平台 Java SDK 入口。
 *
 * <p>SDK 自行创建的 HTTP 客户端会占用 OkHttp 非 daemon 线程，使用完毕后应 {@link #close()}，
 * 或使用 try-with-resources。若通过 {@link Builder#okHttpClient(okhttp3.OkHttpClient)} 传入自定义客户端，
 * {@code close()} 不会关闭该实例。
 *
 * <pre>
 * try (MeetbotClient client = MeetbotClient.builder()
 *         .apiKey("YOUR_API_KEY")
 *         .build()) {
 *     client.messages().send(phoneNumberId, param);
 * }
 * </pre>
 */
public class MeetbotClient implements AutoCloseable {

    private final MeetbotConfig config;
    private final MeetbotHttpClient http;
    private final BlockApi blocks;
    private final MessageApi messages;
    private final TemplateApi templates;
    private final CustomerApi customers;
    private final AccountApi accounts;
    private final TagApi tags;
    private final BizSyncApi bizSync;
    private final FlowApi flows;
    private final CatalogApi catalogs;
    private final GroupApi groups;
    private final WelcomeMessageApi welcomeMessages;
    private final AnalyticsApi analytics;
    private final CallingApi calling;

    public MeetbotClient(MeetbotConfig config) {
        this(config, null);
    }

    public MeetbotClient(MeetbotConfig config, OkHttpClient okHttpClient) {
        if (config == null) {
            throw new IllegalArgumentException("config 不能为空");
        }
        this.config = config;
        this.http = okHttpClient == null
                ? new MeetbotHttpClient(config)
                : new MeetbotHttpClient(config, okHttpClient);
        this.blocks = new BlockApi(http);
        this.messages = new MessageApi(http);
        this.templates = new TemplateApi(http);
        this.customers = new CustomerApi(http);
        this.accounts = new AccountApi(http);
        this.tags = new TagApi(http);
        this.bizSync = new BizSyncApi(http);
        this.flows = new FlowApi(http);
        this.catalogs = new CatalogApi(http);
        this.groups = new GroupApi(http);
        this.welcomeMessages = new WelcomeMessageApi(http);
        this.analytics = new AnalyticsApi(http);
        this.calling = new CallingApi(http);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 使用默认生产环境地址构建客户端。
     */
    public static MeetbotClient create(String apiKey) {
        return builder().apiKey(apiKey).build();
    }

    /**
     * 释放 SDK 持有的 HTTP 连接与调度线程。自定义 OkHttpClient 不会被关闭。
     */
    @Override
    public void close() {
        http.close();
    }

    public static final class Builder {
        private final MeetbotConfig.Builder configBuilder = MeetbotConfig.builder();
        private OkHttpClient okHttpClient;

        private Builder() {
        }

        public Builder baseUrl(String baseUrl) {
            configBuilder.baseUrl(baseUrl);
            return this;
        }

        public Builder apiKey(String apiKey) {
            configBuilder.apiKey(apiKey);
            return this;
        }

        public Builder connectTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            configBuilder.connectTimeout(timeout, unit);
            return this;
        }

        public Builder readTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            configBuilder.readTimeout(timeout, unit);
            return this;
        }

        public Builder writeTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            configBuilder.writeTimeout(timeout, unit);
            return this;
        }

        public Builder debug(boolean debug) {
            configBuilder.debug(debug);
            return this;
        }

        public Builder okHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
            return this;
        }

        public MeetbotClient build() {
            return new MeetbotClient(configBuilder.build(), okHttpClient);
        }
    }

    public MeetbotConfig getConfig() {
        return config;
    }

    public MeetbotHttpClient getHttpClient() {
        return http;
    }

    /** 内容管理 */
    public BlockApi blocks() {
        return blocks;
    }

    /** 消息管理 */
    public MessageApi messages() {
        return messages;
    }

    /** 模板管理 */
    public TemplateApi templates() {
        return templates;
    }

    /** 客户管理 */
    public CustomerApi customers() {
        return customers;
    }

    /** 账号管理 */
    public AccountApi accounts() {
        return accounts;
    }

    /** 标签管理 */
    public TagApi tags() {
        return tags;
    }

    /** 数据同步 / CTWA */
    public BizSyncApi bizSync() {
        return bizSync;
    }

    /** Flow 管理 */
    public FlowApi flows() {
        return flows;
    }

    /** Catalog 管理 */
    public CatalogApi catalogs() {
        return catalogs;
    }

    /** WhatsApp Calling */
    public CallingApi calling() {
        return calling;
    }

    /** Group API */
    public GroupApi groups() {
        return groups;
    }

    /** WelcomeMessage API */
    public WelcomeMessageApi welcomeMessages() {
        return welcomeMessages;
    }

    /** Analytics API */
    public AnalyticsApi analytics() {
        return analytics;
    }
}
