package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.WhatsappAnalyticsActivitiesResult;
import com.meetbot.openapi.model.WhatsappAnalyticsQueryRequest;
import com.meetbot.openapi.model.WhatsappAnalyticsQueryResult;
import com.meetbot.openapi.model.WhatsappTemplateInsightsEnableRequest;

/** Analytics API。 */
public class AnalyticsApi {

    private final MeetbotHttpClient http;

    public AnalyticsApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 查询WhatsApp分析数据。
     *
     * <p>统一查询消息、会话、定价、模板、模板组、通话或群组分析。通过 field 选择分析指标，并使用结构化过滤参数限定查询范围。开始时间必须早于结束时间，查询区间须符合 Meta 对对应指标的限制。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/analytics)。
     * <p>{@code GET /v1/whatsapp/analytics/query}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAnalyticsQuery">whatsappAnalyticsQuery</a>
     *
     * @param request 请求参数
     * @return 查询WhatsApp分析数据结果
     */
    public WhatsappAnalyticsQueryResult query(WhatsappAnalyticsQueryRequest request) {
        return http.get("/v1/whatsapp/analytics/query", QueryParams.create()
                        .add("wabaId", request.getWabaId())
                        .add("field", request.getField())
                        .add("start", request.getStart())
                        .add("end", request.getEnd())
                        .add("granularity", request.getGranularity())
                        .add("phoneNumbers", request.getPhoneNumbers())
                        .add("countryCodes", request.getCountryCodes())
                        .add("productTypes", request.getProductTypes())
                        .add("metricTypes", request.getMetricTypes())
                        .add("pricingTypes", request.getPricingTypes())
                        .add("pricingCategories", request.getPricingCategories())
                        .add("dimensions", request.getDimensions())
                        .add("conversationCategories", request.getConversationCategories())
                        .add("conversationTypes", request.getConversationTypes())
                        .add("conversationDirections", request.getConversationDirections())
                        .add("directions", request.getDirections())
                        .add("templateIds", request.getTemplateIds())
                        .add("templateGroupIds", request.getTemplateGroupIds())
                        .add("groupIds", request.getGroupIds())
                        .add("productType", request.getProductType())
                        .add("useWabaTimezone", request.getUseWabaTimezone())
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappAnalyticsQueryResult>>() {
                });
    }

    /**
     * 启用模板成效分析。
     *
     * <p>为指定 WhatsApp 业务账号启用模板及模板组成效分析。该设置启用后无法关闭，请确认后调用；重复调用不会关闭已启用的能力。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/analytics)。
     * <p>{@code POST /v1/whatsapp/analytics/templateInsights/enable}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateInsightsEnable">whatsappTemplateInsightsEnable</a>
     *
     * @param request 请求参数
     * @return 启用模板成效分析结果
     */
    public MetaSuccessResult enableTemplateInsights(WhatsappTemplateInsightsEnableRequest request) {
        return http.post("/v1/whatsapp/analytics/templateInsights/enable", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询WABA活动记录。
     *
     * <p>查询 WABA 活动记录。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/analytics)。
     * <p>{@code GET /v1/whatsapp/analytics/activities}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappAnalyticsActivities">whatsappAnalyticsActivities</a>
     *
     * @param wabaId WhatsApp 业务账号 ID（必填）
     * @param since 开始时间，Unix 秒（可选）
     * @param until 结束时间，Unix 秒（可选）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询WABA活动记录结果
     */
    public WhatsappAnalyticsActivitiesResult activities(String wabaId, Long since, Long until, Long limit, String after) {
        return http.get("/v1/whatsapp/analytics/activities", QueryParams.create()
                        .add("wabaId", wabaId)
                        .add("since", since)
                        .add("until", until)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappAnalyticsActivitiesResult>>() {
                });
    }
}
