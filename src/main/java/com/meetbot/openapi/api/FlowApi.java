package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.WhatsappFlowAssetsResult;
import com.meetbot.openapi.model.WhatsappFlowCreateRequest;
import com.meetbot.openapi.model.WhatsappFlowCreateParam;
import com.meetbot.openapi.model.WhatsappFlowEncryptionResult;
import com.meetbot.openapi.model.WhatsappFlowEncryptionSetRequest;
import com.meetbot.openapi.model.WhatsappFlowIdRequest;
import com.meetbot.openapi.model.WhatsappFlowItem;
import com.meetbot.openapi.model.WhatsappFlowListResult;
import com.meetbot.openapi.model.WhatsappFlowMigrateRequest;
import com.meetbot.openapi.model.WhatsappFlowMutationResult;
import com.meetbot.openapi.model.WhatsappFlowPreviewResult;
import com.meetbot.openapi.model.WhatsappFlowUpdateRequest;
import com.meetbot.openapi.model.WhatsappFlowUpdateParam;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/**
 * WhatsApp Flows 管理。
 *
 * <p>对应 Meetbot 文档「Flow 管理」：
 * <a href="https://developers.meetbot.com/#/operations/whatsappFlowCreate">whatsappFlowCreate</a>
 */
public class FlowApi {

    private final MeetbotHttpClient http;

    public FlowApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 在指定 WABA 下创建 Flow。可通过 {@code param.flowJson} 提供初始 JSON，并通过 {@code param.publish} 同时发布。
     * 若使用 Data Exchange Endpoint（{@code endpointUri}），发布前须先调用 {@link #setEncryption}。
     *
     * <p>{@code POST /v1/flow/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowCreate">whatsappFlowCreate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#create-flow">Create Flow</a></li>
     * </ul>
     *
     * @param request 创建 Flow 请求
     * @return 含 Flow ID、success；若含 flow_json 可能返回 validation_errors
     */
    public WhatsappFlowMutationResult create(WhatsappFlowCreateRequest request) {
        return http.post("/v1/flow/create", request,
                new TypeReference<ApiResponse<WhatsappFlowMutationResult>>() {
                });
    }

    /**
     * 创建 Flow（便捷重载）。
     *
     * @param wabaId WABA ID
     * @param param  Meta Flow 创建对象
     * @return 创建结果
     */
    public WhatsappFlowMutationResult create(String wabaId, WhatsappFlowCreateParam param) {
        return create(new WhatsappFlowCreateRequest().wabaId(wabaId).param(param));
    }

    /**
     * 更新 Flow 的名称、类别等基本信息。更新 JSON 请使用 {@link #updateJson(String, File)}。
     *
     * <p>{@code POST /v1/flow/update}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowUpdate">whatsappFlowUpdate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#update-flow">Update Flow</a></li>
     * </ul>
     *
     * @param request 更新基本信息请求
     * @return Meta success 结果
     */
    public MetaSuccessResult update(WhatsappFlowUpdateRequest request) {
        return http.post("/v1/flow/update", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 更新 Flow 基本信息（便捷重载）。
     *
     * @param flowId Flow ID
     * @param param  Meta Flow 更新对象
     * @return Meta success 结果
     */
    public MetaSuccessResult update(String flowId, WhatsappFlowUpdateParam param) {
        return update(new WhatsappFlowUpdateRequest().flowId(flowId).param(param));
    }

    /**
     * 以 multipart/form-data 上传 flow.json，更新 Flow JSON 定义。
     * 若使用 Data Exchange Endpoint，发布前须先调用 {@link #setEncryption}。
     *
     * <p>{@code POST /v1/flow/update/json}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowUpdateJson">whatsappFlowUpdateJson</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/flowjson">Flow JSON</a></li>
     * </ul>
     *
     * @param flowId Flow ID
     * @param file   flow.json 文件
     * @return 更新结果，可能含 validation_errors
     */
    public WhatsappFlowMutationResult updateJson(String flowId, File file) {
        Map<String, String> query = QueryParams.create().add("flowId", flowId).toMap();
        Map<String, String> form = Collections.singletonMap("flowId", flowId);
        return http.postMultipart("/v1/flow/update/json", query, "file", file, form,
                new TypeReference<ApiResponse<WhatsappFlowMutationResult>>() {
                });
    }

    /**
     * 以输入流上传 flow.json，更新 Flow JSON 定义。
     *
     * <p>对应 {@code POST /v1/flow/update/json}，见 {@link #updateJson(String, File)}。
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowUpdateJson">whatsappFlowUpdateJson</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/flowjson">Flow JSON</a></li>
     * </ul>
     *
     * @param flowId   Flow ID
     * @param fileName 文件名（如 {@code flow.json}）
     * @param content  文件内容流
     * @return 更新结果，可能含 validation_errors
     */
    public WhatsappFlowMutationResult updateJson(String flowId, String fileName, InputStream content) {
        Map<String, String> query = QueryParams.create().add("flowId", flowId).toMap();
        Map<String, String> form = Collections.singletonMap("flowId", flowId);
        return http.postMultipart("/v1/flow/update/json", query, "file", fileName, content, form,
                new TypeReference<ApiResponse<WhatsappFlowMutationResult>>() {
                });
    }

    /**
     * 获取 Flow 互动预览 URL。无需登录即可访问，有效期 30 天。
     *
     * <p>{@code GET /v1/flow/preview}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowPreview">whatsappFlowPreview</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#get-flow">Get Flow</a></li>
     * </ul>
     *
     * @param flowId Flow ID
     * @return 预览信息
     */
    public WhatsappFlowPreviewResult preview(String flowId) {
        return http.get("/v1/flow/preview",
                QueryParams.create().add("flowId", flowId).toMap(),
                new TypeReference<ApiResponse<WhatsappFlowPreviewResult>>() {
                });
    }

    /**
     * 发布指定 Flow，使其对用户可用。发布前需确保 Flow JSON 有效且无验证错误。
     *
     * <p>{@code POST /v1/flow/publish}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowPublish">whatsappFlowPublish</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#publish-flow">Publish Flow</a></li>
     * </ul>
     *
     * @param request 含 Flow ID
     * @return Meta success 结果
     */
    public MetaSuccessResult publish(WhatsappFlowIdRequest request) {
        return http.post("/v1/flow/publish", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 停用已发布的 Flow。仅 {@code PUBLISHED} 状态可停用。
     *
     * <p>{@code POST /v1/flow/deprecate}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowDeprecate">whatsappFlowDeprecate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#deprecate-flow">Deprecate Flow</a></li>
     * </ul>
     *
     * @param request 含 Flow ID
     * @return Meta success 结果
     */
    public MetaSuccessResult deprecate(WhatsappFlowIdRequest request) {
        return http.post("/v1/flow/deprecate", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 删除指定 Flow。仅 {@code DRAFT} 状态可删除，删除后不可恢复。
     *
     * <p>{@code POST /v1/flow/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowDelete">whatsappFlowDelete</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#delete-flow">Delete Flow</a></li>
     * </ul>
     *
     * @param request 含 Flow ID
     * @return Meta success 结果
     */
    public MetaSuccessResult delete(WhatsappFlowIdRequest request) {
        return http.post("/v1/flow/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 将一个或多个 Flow 从一个 WABA 迁移到另一个 WABA。最多 100 个 Flow。
     *
     * <p>{@code POST /v1/flow/migrate}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowMigrate">whatsappFlowMigrate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#migrate-flows">Migrate Flows</a></li>
     * </ul>
     *
     * @param request 迁移请求
     * @return Meta success 结果
     */
    public MetaSuccessResult migrate(WhatsappFlowMigrateRequest request) {
        return http.post("/v1/flow/migrate", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询指定 WABA 下的 Flow 列表，支持分页和字段筛选。
     *
     * <p>{@code GET /v1/flow/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowList">whatsappFlowList</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#list-flows">List Flows</a></li>
     * </ul>
     *
     * @param wabaId WABA ID
     * @param fields 返回字段，如 {@code id,name,status}
     * @param limit  每页条数
     * @param after  分页游标
     * @return Flow 列表及分页
     */
    public WhatsappFlowListResult list(String wabaId, String fields, Integer limit, String after) {
        return http.get("/v1/flow/list",
                QueryParams.create()
                        .add("wabaId", wabaId)
                        .add("fields", fields)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappFlowListResult>>() {
                });
    }

    /**
     * 查询单个 Flow 详情（元数据、JSON 版本、预览、健康状态等）。
     * 可用 {@code health_status} 诊断无法发消息的原因。
     *
     * <p>{@code GET /v1/flow/details}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowDetails">whatsappFlowDetails</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#get-flow">Get Flow</a></li>
     * </ul>
     *
     * @param flowId Flow ID
     * @param fields 返回字段
     * @return Flow 详情
     */
    public WhatsappFlowItem details(String flowId, String fields) {
        return http.get("/v1/flow/details",
                QueryParams.create().add("flowId", flowId).add("fields", fields).toMap(),
                new TypeReference<ApiResponse<WhatsappFlowItem>>() {
                });
    }

    /**
     * 查询 Flow 附加资产（如 flow.json），含名称、类型和有时效的下载 URL。
     *
     * <p>{@code GET /v1/flow/assets}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowAssets">whatsappFlowAssets</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/reference/whatsapp-business-account/flows-api#get-flow-assets">Get Flow assets</a></li>
     * </ul>
     *
     * @param flowId Flow ID
     * @param fields 返回字段
     * @return 资产列表
     */
    public WhatsappFlowAssetsResult assets(String flowId, String fields) {
        return http.get("/v1/flow/assets",
                QueryParams.create().add("flowId", flowId).add("fields", fields).toMap(),
                new TypeReference<ApiResponse<WhatsappFlowAssetsResult>>() {
                });
    }

    /**
     * 为指定 Phone Number 设置 RSA 企业公钥（PEM，2048 位），用于 Flows 端到端加密。
     * 使用 Data Exchange Endpoint 时，发布前必须先设置公钥。
     *
     * <p>{@code POST /v1/flow/encryption/set}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowEncryptionSet">whatsappFlowEncryptionSet</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/whatsapp-business-encryption">WhatsApp Business Encryption</a></li>
     * </ul>
     *
     * @param request 加密公钥设置请求
     * @return Meta success 结果
     */
    public MetaSuccessResult setEncryption(WhatsappFlowEncryptionSetRequest request) {
        return http.post("/v1/flow/encryption/set", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询指定 Phone Number 上已设置的企业公钥信息。
     *
     * <p>{@code GET /v1/flow/encryption/get}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappFlowEncryptionGet">whatsappFlowEncryptionGet</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/flows/guides/whatsapp-business-encryption">WhatsApp Business Encryption</a></li>
     * </ul>
     *
     * @param phoneNumberId 手机号 ID
     * @return 公钥信息
     */
    public WhatsappFlowEncryptionResult getEncryption(String phoneNumberId) {
        return http.get("/v1/flow/encryption/get",
                QueryParams.create().add("phoneNumberId", phoneNumberId).toMap(),
                new TypeReference<ApiResponse<WhatsappFlowEncryptionResult>>() {
                });
    }
}
