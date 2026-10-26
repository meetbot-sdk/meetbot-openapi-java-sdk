package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.BlockDynamicParamResponse;
import com.meetbot.openapi.model.BlockGroupResponse;
import com.meetbot.openapi.model.BlockPreviewRequest;
import com.meetbot.openapi.model.BlockResponse;
import com.meetbot.openapi.model.PageBlockRequest;
import com.meetbot.openapi.model.PageResult;
import com.meetbot.openapi.model.PreviewUrlResult;

import java.util.List;

/**
 * 内容管理：分组、内容分页、预览 URL、动态参数。
 *
 * <p>对应 Meetbot 文档「内容管理」：
 * <a href="https://developers.meetbot.com/#/operations/getBlockGroupList">getBlockGroupList</a>
 */
public class BlockApi {

    private final MeetbotHttpClient http;

    public BlockApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 查询内容分组列表。
     *
     * <p>{@code GET /block/group/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getBlockGroupList">getBlockGroupList</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @return 内容分组列表
     */
    public List<BlockGroupResponse> listGroups() {
        return http.get("/block/group/list",
                new TypeReference<ApiResponse<List<BlockGroupResponse>>>() {
                });
    }

    /**
     * 分页查询内容列表。
     *
     * <p>{@code POST /block/page/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getBlockList">getBlockList</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 分页与筛选条件
     * @return 内容分页结果
     */
    public PageResult<BlockResponse> pageList(PageBlockRequest request) {
        return http.post("/block/page/list", request,
                new TypeReference<ApiResponse<PageResult<BlockResponse>>>() {
                });
    }

    /**
     * 生成内容详情预览 URL。
     *
     * <p>{@code GET /block/preview/url}（文档定义为 GET + JSON Body）
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/generateBlockPreviewUrl">generateBlockPreviewUrl</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param blockId 内容 ID
     * @return 预览 URL
     */
    public PreviewUrlResult generatePreviewUrl(Long blockId) {
        return generatePreviewUrl(new BlockPreviewRequest().blockId(blockId));
    }

    /**
     * 生成内容详情预览 URL。
     *
     * <p>{@code GET /block/preview/url}（文档定义为 GET + JSON Body）
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/generateBlockPreviewUrl">generateBlockPreviewUrl</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 预览请求，需包含内容 ID
     * @return 预览 URL
     */
    public PreviewUrlResult generatePreviewUrl(BlockPreviewRequest request) {
        return http.getWithJson("/block/preview/url", request,
                new TypeReference<ApiResponse<PreviewUrlResult>>() {
                });
    }

    /**
     * 获取内容动态参数。
     *
     * <p>{@code GET /api/v2/whatsapp/message/block/param}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getBlockDynamicParam">getBlockDynamicParam</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param blockId 内容 ID
     * @return 动态参数列表
     */
    public List<BlockDynamicParamResponse> getDynamicParam(Long blockId) {
        return http.get("/api/v2/whatsapp/message/block/param",
                QueryParams.create().add("blockId", blockId).toMap(),
                new TypeReference<ApiResponse<List<BlockDynamicParamResponse>>>() {
                });
    }
}
