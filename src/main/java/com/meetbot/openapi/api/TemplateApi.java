package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.MetaSuccessResult;
import com.meetbot.openapi.model.StringIdResult;
import com.meetbot.openapi.model.WhatsappMessageTemplateParam;
import com.meetbot.openapi.model.WhatsappTemplateArchiveRequest;
import com.meetbot.openapi.model.WhatsappTemplateArchiveResult;
import com.meetbot.openapi.model.WhatsappTemplateCompareResult;
import com.meetbot.openapi.model.WhatsappTemplateCreateRequest;
import com.meetbot.openapi.model.WhatsappTemplateCreateResult;
import com.meetbot.openapi.model.WhatsappTemplateDeleteRequest;
import com.meetbot.openapi.model.WhatsappTemplateDetailsResult;
import com.meetbot.openapi.model.WhatsappTemplateEditRequest;
import com.meetbot.openapi.model.WhatsappTemplateFileUploadResult;
import com.meetbot.openapi.model.WhatsappTemplateFileUplodRequest;
import com.meetbot.openapi.model.WhatsappTemplateGroupCreateRequest;
import com.meetbot.openapi.model.WhatsappTemplateGroupDeleteRequest;
import com.meetbot.openapi.model.WhatsappTemplateGroupDetailsResult;
import com.meetbot.openapi.model.WhatsappTemplateGroupListResult;
import com.meetbot.openapi.model.WhatsappTemplateGroupUpdateRequest;
import com.meetbot.openapi.model.WhatsappTemplateLibraryRequest;
import com.meetbot.openapi.model.WhatsappTemplateLibraryResult;
import com.meetbot.openapi.model.WhatsappTemplateMigrateRequest;
import com.meetbot.openapi.model.WhatsappTemplateMigrateResult;
import com.meetbot.openapi.model.WhatsappTemplatePreviewRequest;
import com.meetbot.openapi.model.WhatsappTemplatePreviewResult;
import com.meetbot.openapi.model.WhatsappTemplateQueryRequest;
import com.meetbot.openapi.model.WhatsappTemplateQueryResponse;
import com.meetbot.openapi.model.WhatsappTemplateUnarchiveRequest;
import com.meetbot.openapi.model.WhatsappTemplateUnarchiveResult;
import com.meetbot.openapi.model.WhatsappTemplateUpsertRequest;
import com.meetbot.openapi.model.WhatsappTemplateUpsertResult;

/**
 * WhatsApp 模板管理。
 *
 * <p>对应 Meetbot 文档「模板管理」：
 * <a href="https://developers.meetbot.com/#/operations/whatsappTemplateQuery">whatsappTemplateQuery</a>
 */
public class TemplateApi {

    private final MeetbotHttpClient http;

    public TemplateApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 模板查询。
     *
     * <p>{@code POST /open/whatsapp/template/query}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateQuery">whatsappTemplateQuery</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a></li>
     * </ul>
     *
     * @param request WABA ID、分页游标与返回字段
     * @return 模板列表及分页信息
     */
    public WhatsappTemplateQueryResponse query(WhatsappTemplateQueryRequest request) {
        return http.post("/open/whatsapp/template/query", request,
                new TypeReference<ApiResponse<WhatsappTemplateQueryResponse>>() {
                });
    }

    /**
     * 模板创建。{@code param} 为 Meta 消息模板结构。
     *
     * <p>{@code POST /open/whatsapp/template/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateCreate">whatsappTemplateCreate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a></li>
     * </ul>
     *
     * @param request 含 WABA ID 与 {@link WhatsappMessageTemplateParam}
     * @return 创建结果（含模板 ID 等 Meta 字段）
     */
    public WhatsappTemplateCreateResult create(WhatsappTemplateCreateRequest request) {
        return http.post("/open/whatsapp/template/create", request,
                new TypeReference<ApiResponse<WhatsappTemplateCreateResult>>() {
                });
    }

    /**
     * 模板创建（便捷重载）。
     *
     * @param whatsappBusinessAccountId WABA ID
     * @param param                     Meta 模板创建对象
     * @return 创建结果
     */
    public WhatsappTemplateCreateResult create(String whatsappBusinessAccountId, WhatsappMessageTemplateParam param) {
        return create(new WhatsappTemplateCreateRequest()
                .whatsappBusinessAccountId(whatsappBusinessAccountId)
                .param(param));
    }

    /**
     * 模板编辑。{@code param} 为 Meta 模板更新结构。
     *
     * <p>{@code POST /open/whatsapp/template/update}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateEdit">whatsappTemplateEdit</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a></li>
     * </ul>
     *
     * @param request 模板编辑请求
     * @return Meta success 结果
     */
    public MetaSuccessResult update(WhatsappTemplateEditRequest request) {
        return http.post("/open/whatsapp/template/update", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 模板编辑（便捷重载）。
     *
     * @param whatsappBusinessAccountId WABA ID
     * @param templateId                模板 ID
     * @param param                     Meta 模板更新对象
     * @return Meta success 结果
     */
    public MetaSuccessResult update(String whatsappBusinessAccountId, String templateId,
                                    WhatsappMessageTemplateParam param) {
        return update(new WhatsappTemplateEditRequest()
                .whatsappBusinessAccountId(whatsappBusinessAccountId)
                .templateId(templateId)
                .param(param));
    }

    /**
     * 模板删除。
     *
     * <p>{@code POST /open/whatsapp/template/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateDelete">whatsappTemplateDelete</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/overview">Message templates</a></li>
     * </ul>
     *
     * @param request 模板删除请求
     * @return Meta success 结果
     */
    public MetaSuccessResult delete(WhatsappTemplateDeleteRequest request) {
        return http.post("/open/whatsapp/template/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 模板文件上传。创建/编辑模板时 header 为素材时，需先上传获取媒体素材句柄。
     *
     * <p>{@code POST /open/whatsapp/template/file/upload}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateFileUpload">whatsappTemplateFileUpload</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/business-phone-numbers/media">Media</a></li>
     * </ul>
     *
     * @param request 模板素材上传请求
     * @return 上传结果（媒体句柄等）
     */
    public WhatsappTemplateFileUploadResult uploadFile(WhatsappTemplateFileUplodRequest request) {
        return http.post("/open/whatsapp/template/file/upload", request,
                new TypeReference<ApiResponse<WhatsappTemplateFileUploadResult>>() {
                });
    }

    /**
     * 查询模板详情。
     *
     * <p>查询指定消息模板详情。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates)。
     * <p>{@code GET /v1/whatsapp/template/details}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateDetails">whatsappTemplateDetails</a>
     *
     * @param templateId 消息模板 ID（必填）
     * @param fields 返回字段列表（可选）
     * @return 查询模板详情结果
     */
    public WhatsappTemplateDetailsResult details(String templateId, String fields) {
        return http.get("/v1/whatsapp/template/details", QueryParams.create()
                        .add("templateId", templateId)
                        .add("fields", fields)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplateDetailsResult>>() {
                });
    }

    /**
     * 对比消息模板表现。
     *
     * <p>对比同一 WABA 下两个消息模板在指定时间范围内的发送表现。两个模板在该范围内均须至少发送 1000 次；支持最近 7、30、60 或 90 天。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-comparison/)。
     * <p>{@code GET /v1/whatsapp/template/compare}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateCompare">whatsappTemplateCompare</a>
     *
     * @param templateId 作为对比基准的消息模板 ID（必填）
     * @param templateIds 另一个消息模板 ID；多个值使用逗号分隔，本接口当前只支持与一个模板对比（必填）
     * @param start 开始时间，Unix 秒级时间戳（必填）
     * @param end 结束时间，Unix 秒级时间戳（必填）
     * @return 对比消息模板表现结果
     */
    public WhatsappTemplateCompareResult compare(String templateId, String templateIds, Long start, Long end) {
        return http.get("/v1/whatsapp/template/compare", QueryParams.create()
                        .add("templateId", templateId)
                        .add("templateIds", templateIds)
                        .add("start", start)
                        .add("end", end)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplateCompareResult>>() {
                });
    }

    /**
     * 批量归档消息模板。
     *
     * <p>按模板 ID 批量归档消息模板，一次最多 100 个。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-archival/)。
     * <p>{@code POST /v1/whatsapp/template/archive}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateArchive">whatsappTemplateArchive</a>
     *
     * @param request 请求参数
     * @return 批量归档消息模板结果
     */
    public WhatsappTemplateArchiveResult archive(WhatsappTemplateArchiveRequest request) {
        return http.post("/v1/whatsapp/template/archive", request,
                new TypeReference<ApiResponse<WhatsappTemplateArchiveResult>>() {
                });
    }

    /**
     * 批量取消归档消息模板。
     *
     * <p>按模板 ID 批量取消归档消息模板，一次最多 100 个。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-archival/)。
     * <p>{@code POST /v1/whatsapp/template/unarchive}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateUnarchive">whatsappTemplateUnarchive</a>
     *
     * @param request 请求参数
     * @return 批量取消归档消息模板结果
     */
    public WhatsappTemplateUnarchiveResult unarchive(WhatsappTemplateUnarchiveRequest request) {
        return http.post("/v1/whatsapp/template/unarchive", request,
                new TypeReference<ApiResponse<WhatsappTemplateUnarchiveResult>>() {
                });
    }

    /**
     * 迁移消息模板。
     *
     * <p>将同一 Meta Business 下源 WABA 的合格模板迁移至目标 WABA。仅 APPROVED 且质量为 GREEN 或 UNKNOWN 的模板可迁移；count 和 template_ids 均最多 500。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-migration/)。
     * <p>{@code POST /v1/whatsapp/template/migrate}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateMigrate">whatsappTemplateMigrate</a>
     *
     * @param request 请求参数
     * @return 迁移消息模板结果
     */
    public WhatsappTemplateMigrateResult migrate(WhatsappTemplateMigrateRequest request) {
        return http.post("/v1/whatsapp/template/migrate", request,
                new TypeReference<ApiResponse<WhatsappTemplateMigrateResult>>() {
                });
    }

    /**
     * 预览认证模板。
     *
     * <p>生成多语言认证模板的本地化预览，不会创建或保存模板；确认预览内容后，可调用批量创建或更新认证模板接口。仅支持 AUTHENTICATION 类别，并且模板必须且只能包含一个 OTP 按钮；codeExpirationMinutes 的取值范围为 1–90 分钟。参考[官方文档](https://developers.facebook.com/docs/graph-api/reference/whats-app-business-account/message_template_previews/)。
     * <p>{@code GET /v1/whatsapp/template/preview}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplatePreview">whatsappTemplatePreview</a>
     *
     * @param request 请求参数
     * @return 预览认证模板结果
     */
    public WhatsappTemplatePreviewResult preview(WhatsappTemplatePreviewRequest request) {
        return http.get("/v1/whatsapp/template/preview", QueryParams.create()
                        .add("wabaId", request.getWabaId())
                        .add("category", request.getCategory())
                        .add("languages", request.getLanguages())
                        .add("addSecurityRecommendation", request.getAddSecurityRecommendation())
                        .add("codeExpirationMinutes", request.getCodeExpirationMinutes())
                        .add("buttonTypes", request.getButtonTypes())
                        .add("businessName", request.getBusinessName())
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplatePreviewResult>>() {
                });
    }

    /**
     * 批量创建或更新认证模板。
     *
     * <p>在指定 WABA 下批量创建或更新多个语言版本的认证模板。Meta 按模板名称和语言匹配：已存在则更新，不存在则创建；仅支持 AUTHENTICATION 类别，并使用 languages 数组指定语言。参考[官方文档](https://developers.facebook.com/docs/whatsapp/business-management-api/authentication-templates#bulk-management)。
     * <p>{@code POST /v1/whatsapp/template/upsert}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateUpsert">whatsappTemplateUpsert</a>
     *
     * @param request 请求参数
     * @return 批量创建或更新认证模板结果
     */
    public WhatsappTemplateUpsertResult upsert(WhatsappTemplateUpsertRequest request) {
        return http.post("/v1/whatsapp/template/upsert", request,
                new TypeReference<ApiResponse<WhatsappTemplateUpsertResult>>() {
                });
    }

    /**
     * 查询模板组列表。
     *
     * <p>分页查询 WABA 下的模板组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-groups)。
     * <p>{@code GET /v1/whatsapp/template/groups/list}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateGroupList">whatsappTemplateGroupList</a>
     *
     * @param wabaId WhatsApp 业务账号 ID（必填）
     * @param fields 返回字段列表（可选）
     * @param limit 每页数量（可选）
     * @param after 下一页游标（可选）
     * @return 查询模板组列表结果
     */
    public WhatsappTemplateGroupListResult groupList(String wabaId, String fields, Long limit, String after) {
        return http.get("/v1/whatsapp/template/groups/list", QueryParams.create()
                        .add("wabaId", wabaId)
                        .add("fields", fields)
                        .add("limit", limit)
                        .add("after", after)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplateGroupListResult>>() {
                });
    }

    /**
     * 创建模板组。
     *
     * <p>创建模板组并关联消息模板。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-groups)。
     * <p>{@code POST /v1/whatsapp/template/groups/create}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateGroupCreate">whatsappTemplateGroupCreate</a>
     *
     * @param request 请求参数
     * @return 创建模板组结果
     */
    public StringIdResult groupCreate(WhatsappTemplateGroupCreateRequest request) {
        return http.post("/v1/whatsapp/template/groups/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 查询模板组详情。
     *
     * <p>查询指定模板组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-groups)。
     * <p>{@code GET /v1/whatsapp/template/groups/details}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateGroupDetails">whatsappTemplateGroupDetails</a>
     *
     * @param templateGroupId 模板组 ID（必填）
     * @param fields 返回字段列表（可选）
     * @return 查询模板组详情结果
     */
    public WhatsappTemplateGroupDetailsResult groupDetails(String templateGroupId, String fields) {
        return http.get("/v1/whatsapp/template/groups/details", QueryParams.create()
                        .add("templateGroupId", templateGroupId)
                        .add("fields", fields)
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplateGroupDetailsResult>>() {
                });
    }

    /**
     * 更新模板组。
     *
     * <p>更新模板组信息或关联模板。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-groups)。
     * <p>{@code POST /v1/whatsapp/template/groups/update}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateGroupUpdate">whatsappTemplateGroupUpdate</a>
     *
     * @param request 请求参数
     * @return 更新模板组结果
     */
    public MetaSuccessResult groupUpdate(WhatsappTemplateGroupUpdateRequest request) {
        return http.post("/v1/whatsapp/template/groups/update", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 删除模板组。
     *
     * <p>删除指定模板组。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates/template-groups)。
     * <p>{@code POST /v1/whatsapp/template/groups/delete}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateGroupDelete">whatsappTemplateGroupDelete</a>
     *
     * @param request 请求参数
     * @return 删除模板组结果
     */
    public MetaSuccessResult groupDelete(WhatsappTemplateGroupDeleteRequest request) {
        return http.post("/v1/whatsapp/template/groups/delete", request,
                new TypeReference<ApiResponse<MetaSuccessResult>>() {
                });
    }

    /**
     * 查询模板库。
     *
     * <p>查询 Meta 消息模板库。参考[官方文档](https://developers.facebook.com/documentation/business-messaging/whatsapp/templates)。
     * <p>{@code GET /v1/whatsapp/template/library}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/whatsappTemplateLibrary">whatsappTemplateLibrary</a>
     *
     * @param request 请求参数
     * @return 查询模板库结果
     */
    public WhatsappTemplateLibraryResult library(WhatsappTemplateLibraryRequest request) {
        return http.get("/v1/whatsapp/template/library", QueryParams.create()
                        .add("category", request.getCategory())
                        .add("search", request.getSearch())
                        .add("topic", request.getTopic())
                        .add("usecase", request.getUsecase())
                        .add("industry", request.getIndustry())
                        .add("language", request.getLanguage())
                        .add("name", request.getName())
                        .add("limit", request.getLimit())
                        .add("after", request.getAfter())
                        .add("before", request.getBefore())
                        .toMap(),
                new TypeReference<ApiResponse<WhatsappTemplateLibraryResult>>() {
                });
    }
}
