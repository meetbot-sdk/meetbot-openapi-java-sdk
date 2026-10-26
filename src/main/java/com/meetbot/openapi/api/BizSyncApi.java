package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.BizSyncBatchResponse;
import com.meetbot.openapi.model.BizSyncEventReportRequest;
import com.meetbot.openapi.model.BizSyncOrderBatchRequest;
import com.meetbot.openapi.model.BizSyncProductBatchRequest;
import com.meetbot.openapi.model.BizSyncProductSeriesBatchRequest;
import com.meetbot.openapi.model.BizSyncUserBatchRequest;
import com.meetbot.openapi.model.CtwaConversionPostbackRequest;
import com.meetbot.openapi.model.CtwaConversionResult;
import com.meetbot.openapi.model.CtwaDatasetCreateRequest;
import com.meetbot.openapi.model.EmptyResult;
import com.meetbot.openapi.model.StringIdResult;

/**
 * 自建渠道数据同步与 CTWA 转化回传。
 *
 * <p>对应 Meetbot 文档「数据同步」：
 * <a href="https://developers.meetbot.com/#/operations/bizSyncUsers">bizSyncUsers</a>
 */
public class BizSyncApi {

    private final MeetbotHttpClient http;

    public BizSyncApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 批量同步用户数据。单次 {@code data[]} 最多 100 条。请求级错误返回 {@code code=400001}；
     * 单条校验失败时仍可能 {@code code=0}，失败明细见 {@code result.errors[]}。
     *
     * <p>{@code POST /open/biz/sync/users}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/bizSyncUsers">bizSyncUsers</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 用户批量同步请求
     * @return 批量结果（含错误明细）
     */
    public BizSyncBatchResponse syncUsers(BizSyncUserBatchRequest request) {
        return http.post("/open/biz/sync/users", request,
                new TypeReference<ApiResponse<BizSyncBatchResponse>>() {
                });
    }

    /**
     * 批量同步订单数据。单次 {@code data[]} 最多 100 条。请求级错误返回 {@code code=400001}；
     * 单条校验失败时仍可能 {@code code=0}，失败明细见 {@code result.errors[]}。
     *
     * <p>{@code POST /open/biz/sync/orders}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/bizSyncOrders">bizSyncOrders</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 订单批量同步请求
     * @return 批量结果（含错误明细）
     */
    public BizSyncBatchResponse syncOrders(BizSyncOrderBatchRequest request) {
        return http.post("/open/biz/sync/orders", request,
                new TypeReference<ApiResponse<BizSyncBatchResponse>>() {
                });
    }

    /**
     * 批量同步商品数据。单次 {@code data[]} 最多 100 条。请求级错误返回 {@code code=400001}；
     * 单条校验失败时仍可能 {@code code=0}，失败明细见 {@code result.errors[]}。
     *
     * <p>{@code POST /open/biz/sync/products}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/bizSyncProducts">bizSyncProducts</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 商品批量同步请求
     * @return 批量结果（含错误明细）
     */
    public BizSyncBatchResponse syncProducts(BizSyncProductBatchRequest request) {
        return http.post("/open/biz/sync/products", request,
                new TypeReference<ApiResponse<BizSyncBatchResponse>>() {
                });
    }

    /**
     * 批量同步商品系列数据。单次 {@code data[]} 最多 100 条。请求级错误返回 {@code code=400001}；
     * 单条校验失败时仍可能 {@code code=0}，失败明细见 {@code result.errors[]}。
     *
     * <p>{@code POST /open/biz/sync/product/series}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/bizSyncProductSeries">bizSyncProductSeries</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 商品系列批量同步请求
     * @return 批量结果（含错误明细）
     */
    public BizSyncBatchResponse syncProductSeries(BizSyncProductSeriesBatchRequest request) {
        return http.post("/open/biz/sync/product/series", request,
                new TypeReference<ApiResponse<BizSyncBatchResponse>>() {
                });
    }

    /**
     * 单条业务事件上报。必填 {@code eventId}、{@code eventType}、{@code eventTime}（毫秒）及
     * {@code eventData.userId}（{@code LEAD_SUBMITTED} 除外，该类型需 {@code leadId} + {@code formId}）。
     * 校验失败整单 {@code code=400001}；成功时 result 为空。各 eventType 建议字段见 Meetbot 文档。
     *
     * <p>{@code POST /open/biz/sync/event}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/bizSyncReportEvent">bizSyncReportEvent</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 事件上报请求
     * @return 空业务结果
     */
    public EmptyResult reportEvent(BizSyncEventReportRequest request) {
        return http.post("/open/biz/sync/event", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 将转化事件回传至 Meta Conversions API（CAPI）。{@code wabaId} 为 WhatsApp Business Account ID，
     * {@code datasetId} 为 Meta Dataset ID；{@code param} 为 {@link com.meetbot.openapi.model.CtwaConversionPostbackParam}。
     *
     * <p>{@code POST /v1/ctwa/conversion/events}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/ctwaConversionPostback">ctwaConversionPostback</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/marketing-api/conversions-api">Conversions API</a></li>
     * </ul>
     *
     * @param request CTWA 转化回传请求
     * @return Meta CAPI 回传结果
     */
    public CtwaConversionResult ctwaConversionPostback(CtwaConversionPostbackRequest request) {
        return http.post("/v1/ctwa/conversion/events", request,
                new TypeReference<ApiResponse<CtwaConversionResult>>() {
                });
    }

    /**
     * 创建CTWA数据集。
     *
     * <p>为指定 WhatsApp 业务账号创建用于 Conversions API 的数据集。参考[官方文档](https://developers.facebook.com/documentation/marketing-api/conversions-api)。
     * <p>{@code POST /v1/ctwa/conversion/dataset/create}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/ctwaDatasetCreate">ctwaDatasetCreate</a>
     *
     * @param request 请求参数
     * @return 创建CTWA数据集结果
     */
    public StringIdResult createCtwaDataset(CtwaDatasetCreateRequest request) {
        return http.post("/v1/ctwa/conversion/dataset/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 查询CTWA数据集。
     *
     * <p>查询指定 WhatsApp 业务账号关联的数据集。参考[官方文档](https://developers.facebook.com/documentation/marketing-api/conversions-api)。
     * <p>{@code GET /v1/ctwa/conversion/dataset/query}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/ctwaDatasetQuery">ctwaDatasetQuery</a>
     *
     * @param wabaId WhatsApp 业务账号 ID（必填）
     * @return 查询CTWA数据集结果
     */
    public StringIdResult queryCtwaDataset(String wabaId) {
        return http.get("/v1/ctwa/conversion/dataset/query", QueryParams.create()
                        .add("wabaId", wabaId)
                        .toMap(),
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }
}
