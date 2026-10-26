# Meetbot OpenAPI Java SDK

Meetbot 开放平台 Java SDK，对应 [OpenAPI 1.0.0](https://developers.meetbot.com/#/)。

- 坐标：`com.meetbot:meetbot-openapi-java-sdk:1.0.0`
- 包名：`com.meetbot.openapi`
- JDK：8+
- 许可证：[Apache License 2.0](LICENSE)
- 鉴权：请求头 `APIKEY`
- 默认地址：`https://openapi.meetbot.com`

## 安装

本项目通过 GitHub 提供源码。从 GitHub 克隆或下载源码后，先在 SDK 项目根目录安装到本地 Maven 仓库：

```bash
mvn clean install -Dmaven.test.skip=true
```

然后在使用 SDK 的项目中添加以下依赖。

### Maven

```xml
<dependency>
    <groupId>com.meetbot</groupId>
    <artifactId>meetbot-openapi-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
repositories {
    mavenLocal()
    mavenCentral()
}

implementation 'com.meetbot:meetbot-openapi-java-sdk:1.0.0'
```

源码仓库：[meetbot-sdk/meetbot-openapi-java-sdk](https://github.com/meetbot-sdk/meetbot-openapi-java-sdk)。

## 快速开始

`MeetbotClient` 实现了 `AutoCloseable`。SDK 内部 OkHttp 线程不是 daemon，用完请 `close()`，否则进程可能无法退出。

```java
import com.meetbot.openapi.MeetbotClient;
import com.meetbot.openapi.model.WhatsappMessageSendParam;
import com.meetbot.openapi.model.WhatsappTextObject;
import com.meetbot.openapi.model.enums.WhatsappMessageType;
import com.meetbot.openapi.model.enums.WhatsappRecipientType;

try (MeetbotClient client = MeetbotClient.builder()
        .apiKey("YOUR_API_KEY")
        // .baseUrl("https://openapi.meetbot.com") 默认生产环境
        .build()) {
    WhatsappMessageSendParam param = new WhatsappMessageSendParam()
            .messagingProduct("whatsapp")
            .recipientType(WhatsappRecipientType.INDIVIDUAL)
            .to("8618717850000") // 或 .recipient("CN.2142923803139817") 使用 BSUID
            .type(WhatsappMessageType.TEXT)
            .text(new WhatsappTextObject().body("hello text"));

    client.messages().send("12345", param);
}
```

发送内容消息：

```java
import com.meetbot.openapi.model.SendBlockMessageRequest;

SendBlockMessageRequest request = new SendBlockMessageRequest()
        .blockId(1087953L)
        .to("8615888886667")
        .sentAccount("8615888889999");
client.messages().sendBlock(request);
```

查询内容分组：

```java
client.blocks().listGroups();
```

## 模块入口

| 方法 | 能力 |
|------|------|
| `client.blocks()` | 内容分组、内容列表、预览 URL、动态参数 |
| `client.messages()` | 发送内容/自定义消息、媒体上传下载/删除、批量查询消息来源 |
| `client.templates()` | WhatsApp 模板查询/创建/编辑/删除/文件上传、归档、迁移、预览、模板组与模板库 |
| `client.customers()` | 渠道用户、专属客户添加、客服列表、会话状态与创建/关闭 |
| `client.accounts()` | WABA 资料、手机号、BM 信息、号码验证、号码质量、预验证号码 |
| `client.tags()` | 标签分类、静态标签、用户打标、按标签值游标查询用户 |
| `client.bizSync()` | 用户/订单/商品/系列同步、业务事件、CTWA 回传与数据集 |
| `client.flows()` | WhatsApp Flows |
| `client.catalogs()` | Catalog 与商品 CRUD / 批量导入 |
| `client.calling()` | WhatsApp Calling 信令 |
| `client.groups()` | 群组、成员、邀请链接、加入申请 |
| `client.welcomeMessages()` | 欢迎消息序列创建、查询、更新、删除 |
| `client.analytics()` | 分析指标查询、模板成效分析开通、WABA 活动记录 |

透传 Meta 官方结构的接口（模板、账号、Flow、Calling、CTWA 等）已按文档示例映射为具体 DTO；文档未列出的字段可通过 `getAdditionalProperties()` 读取，序列化时会摊平到 JSON 同级，不会出现名为 `additionalProperties` 的字段。

## 异常

业务失败（HTTP 200 但 `code != 0` / `success=false`）抛出 `MeetbotApiException`：

```java
try {
    client.messages().send("12345", param);
} catch (com.meetbot.openapi.exception.MeetbotApiException e) {
    Integer code = e.getCode();
    String message = e.getApiMessage();
    String traceId = e.getTraceId();
} catch (com.meetbot.openapi.exception.MeetbotHttpException e) {
    int httpStatus = e.getHttpStatus();
    String rawBody = e.getRawBody();
    String retryAfter = e.getHeader("Retry-After");
}
```

网络错误或 HTTP 非 2xx 抛出 `MeetbotHttpException`，可读取 `httpStatus`、`rawBody`、`responseHeaders`。

## Webhook

Meetbot 向你配置的地址 POST JSON。接收后返回 HTTP 2xx 即可；建议先入队再异步处理。失败会重试 3 次（5s / 30s / 180s）。

```java
import com.meetbot.openapi.webhook.WebhookEvent;
import com.meetbot.openapi.webhook.WebhookListenerAdapter;
import com.meetbot.openapi.webhook.WebhookParser;
import com.meetbot.openapi.model.WebhookSendSuccessCallback;

String body = ...; // request body
WebhookEvent event = WebhookParser.parse(body);

WebhookParser.dispatch(event, new WebhookListenerAdapter() {
    @Override
    public void onSendSuccess(WebhookSendSuccessCallback callback) {
        Long meetbotMessageId = callback.getMessageId();
        String wamid = callback.getMsg().getMid();
    }

    @Override
    public void onContent(com.meetbot.openapi.model.WebhookContentCallback callback) {
        // callback.getMsg() 为 Meta messages 透传结构
    }
});
```

## 配置

```java
MeetbotClient client = MeetbotClient.builder()
        .apiKey("YOUR_API_KEY")
        .baseUrl("https://openapi.meetbot.com")
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .debug(false)
        .build();
```

`.debug(true)` 时通过 SLF4J 打印 HTTP 方法、URL 与响应体摘要（logger：`com.meetbot.openapi.http.MeetbotHttpClient`）。**不会打印 API Key**，但响应体可能含用户消息等个人信息，生产环境请保持关闭。

SDK 传递 `slf4j-api` 1.7.36（不捆绑 Logback/Log4j）。接入方已有 SLF4J 时由 Maven 就近原则/BOM 决定版本；请自行提供日志实现，否则 SLF4J 使用 NOP。

Jackson 传递 `jackson-databind` 2.13.5。Spring Boot 2.x 工程通常由 BOM 统一 Jackson 版本；SDK 使用的 API 与 Jackson 2.9+ 兼容。

也可传入自定义 `OkHttpClient`：`.okHttpClient(myClient)`。此时 `MeetbotClient.close()` **不会**关闭该实例，由调用方负责生命周期。

运行 `mvn test` `可离线于业务服务验证新增接口的请求方法、路径、APIK`EY、JSON/query 参数、响应解析和业务错误，不会请求真实 Meetbot API。
