package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.http.QueryParams;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.BooleanResult;
import com.meetbot.openapi.model.CategoryNodeResponse;
import com.meetbot.openapi.model.CreateCategoryRequest;
import com.meetbot.openapi.model.CreateStaticTagRequest;
import com.meetbot.openapi.model.DeleteCategoryRequest;
import com.meetbot.openapi.model.DeleteStaticTagRequest;
import com.meetbot.openapi.model.MoveCategoryRequest;
import com.meetbot.openapi.model.MoveStaticTagRequest;
import com.meetbot.openapi.model.PageResult;
import com.meetbot.openapi.model.StringIdResult;
import com.meetbot.openapi.model.TagDetailResponse;
import com.meetbot.openapi.model.TagStaticListItemResponse;
import com.meetbot.openapi.model.TagUsersPageResponse;
import com.meetbot.openapi.model.TagUsersQueryRequest;
import com.meetbot.openapi.model.UpdateCategoryRequest;
import com.meetbot.openapi.model.UpdateStaticTagRequest;
import com.meetbot.openapi.model.UserTagResponse;
import com.meetbot.openapi.model.UserTagsAttachRequest;
import com.meetbot.openapi.model.UserTagsDetachRequest;
import com.meetbot.openapi.model.enums.Channel;
import java.util.List;

/**
 * 标签管理：分类树、静态标签、用户打标。
 *
 * <p>对应 Meetbot 文档「标签管理」：
 * <a href="https://developers.meetbot.com/#/operations/getTagCategoryTree">getTagCategoryTree</a>
 */
public class TagApi {

    private final MeetbotHttpClient http;

    public TagApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 查询分类树。以树形结构返回全部标签分类，{@code children} 递归包含子分类；
     * {@code system=true} 为系统预置分类（不可编辑或删除）。无分页。
     *
     * <p>{@code GET /tags/categories/tree}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getTagCategoryTree">getTagCategoryTree</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @return 分类树根节点列表
     */
    public List<CategoryNodeResponse> getCategoryTree() {
        return http.get("/tags/categories/tree",
                new TypeReference<ApiResponse<List<CategoryNodeResponse>>>() {
                });
    }

    /**
     * 创建标签分类。不传 {@code parentCategoryId} 为顶级分类；传入则为子分类。
     * 分类名称在店铺内唯一，成功返回分类 ID。
     *
     * <p>{@code POST /tags/categories/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/createTagCategory">createTagCategory</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 创建分类请求
     * @return 分类 ID
     */
    public StringIdResult createCategory(CreateCategoryRequest request) {
        return http.post("/tags/categories/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 更新标签分类名称。仅改名称，不影响层级；移动请用 {@link #moveCategory(MoveCategoryRequest)}。
     *
     * <p>{@code POST /tags/categories/update}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/updateTagCategory">updateTagCategory</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 更新分类请求
     * @return 是否成功
     */
    public BooleanResult updateCategory(UpdateCategoryRequest request) {
        return http.post("/tags/categories/update", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 删除标签分类。仅允许删除无子分类的空分类，删除后不可恢复。
     *
     * <p>{@code POST /tags/categories/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/deleteTagCategory">deleteTagCategory</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 删除分类请求
     * @return 是否成功
     */
    public BooleanResult deleteCategory(DeleteCategoryRequest request) {
        return http.post("/tags/categories/delete", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 移动/排序标签分类。{@code parentCategoryId} 变更父分类（不传表示移至顶层）；
     * {@code beforeCategoryId} 控制同级排序（传 ID 表示排在其后，传 null 表示排首位）。
     *
     * <p>{@code POST /tags/categories/move}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/moveTagCategory">moveTagCategory</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 移动/排序请求
     * @return 是否成功
     */
    public BooleanResult moveCategory(MoveCategoryRequest request) {
        return http.post("/tags/categories/move", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 分页查询指定分类下的静态标签列表。{@code categoryId} 必填；{@code name} 可模糊搜索。
     * {@code pageNo} 从 1 开始，{@code pageSize} 最大 100。
     *
     * <p>{@code GET /tags/static/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getTagStaticList">getTagStaticList</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param categoryId 分类 ID
     * @param name       标签名称（可选，模糊匹配）
     * @param pageNo     页码，从 1 开始
     * @param pageSize   每页条数，最大 100
     * @return 静态标签分页结果
     */
    public PageResult<TagStaticListItemResponse> listStaticTags(String categoryId, String name,
                                                                Integer pageNo, Integer pageSize) {
        return http.get("/tags/static/list",
                QueryParams.create()
                        .add("categoryId", categoryId)
                        .add("name", name)
                        .add("pageNo", pageNo)
                        .add("pageSize", pageSize)
                        .toMap(),
                new TypeReference<ApiResponse<PageResult<TagStaticListItemResponse>>>() {
                });
    }

    /**
     * 查询单个静态标签详情，含名称、描述、分类、值类型、标签值列表、客服同步状态等。
     * 打标时使用 {@code tagValues[].id}。
     *
     * <p>{@code GET /tags/static/detail}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getTagDetail">getTagDetail</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param tagId 标签 ID
     * @return 标签详情
     */
    public TagDetailResponse getStaticTagDetail(String tagId) {
        return http.get("/tags/static/detail",
                QueryParams.create().add("tagId", tagId).toMap(),
                new TypeReference<ApiResponse<TagDetailResponse>>() {
                });
    }

    /**
     * 创建静态标签。需指定名称、所属分类和值类型（值类型创建后不可改）。成功返回标签 ID。
     *
     * <p>{@code POST /tags/static/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/createStaticTag">createStaticTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 创建静态标签请求
     * @return 标签 ID
     */
    public StringIdResult createStaticTag(CreateStaticTagRequest request) {
        return http.post("/tags/static/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 更新静态标签。标签值：带 id 为更新，不带 id 为新增，空数组为删除全部。
     * {@code updateTime} 为乐观锁，取自详情/列表响应。
     *
     * <p>{@code POST /tags/static/update}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/updateStaticTag">updateStaticTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 更新静态标签请求
     * @return 是否成功
     */
    public BooleanResult updateStaticTag(UpdateStaticTagRequest request) {
        return http.post("/tags/static/update", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 删除静态标签。会同步移除所有标签值及客户关联，删除后不可恢复。
     *
     * <p>{@code POST /tags/static/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/deleteStaticTag">deleteStaticTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 删除静态标签请求
     * @return 是否成功
     */
    public BooleanResult deleteStaticTag(DeleteStaticTagRequest request) {
        return http.post("/tags/static/delete", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 移动/排序静态标签。{@code categoryId} 为目标分类；
     * {@code beforeTagId} 传标签 ID 表示排在其后，传 null 表示排首位。
     *
     * <p>{@code POST /tags/static/move}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/moveStaticTag">moveStaticTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 移动/排序请求
     * @return 是否成功
     */
    public BooleanResult moveStaticTag(MoveStaticTagRequest request) {
        return http.post("/tags/static/move", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 查询用户已绑定的标签。通过 {@code userId} + {@code channel} 定位客户。
     *
     * <p>{@code GET /tags/user/tags}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getUserTags">getUserTags</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param userId  客户在渠道中的唯一标识（如 WhatsApp 号码）
     * @param channel 渠道：{@code messenger} / {@code instagram} / {@code whatsapp}
     * @return 用户已关联的标签及标签值
     */
    public List<UserTagResponse> getUserTags(String userId, String channel) {
        return http.get("/tags/user/tags",
                QueryParams.create().add("userId", userId).add("channel", channel).toMap(),
                new TypeReference<ApiResponse<List<UserTagResponse>>>() {
                });
    }

    /**
     * 查询用户已绑定的标签（渠道枚举重载）。
     *
     * <p>对应 {@code GET /tags/user/tags}，见 {@link #getUserTags(String, String)}。
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/getUserTags">getUserTags</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param userId  客户在渠道中的唯一标识
     * @param channel 渠道枚举
     * @return 用户已关联的标签及标签值
     */
    public List<UserTagResponse> getUserTags(String userId, Channel channel) {
        return getUserTags(userId, channel == null ? null : channel.getValue());
    }

    /**
     * 给用户打标签。关联的是标签值 {@code valueId} 而非标签本身。
     *
     * <p>{@code POST /tags/user/tags/attach}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/attachUserTag">attachUserTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 含 channel、userId、valueId
     * @return 是否成功
     */
    public BooleanResult attachUserTag(UserTagsAttachRequest request) {
        return http.post("/tags/user/tags/attach", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 取消用户标签值关联，不影响标签定义本身。
     *
     * <p>{@code POST /tags/user/tags/detach}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/detachUserTag">detachUserTag</a></li>
     *   <li>Meta：本接口为 Meetbot 自有能力，无对应 Meta 文档</li>
     * </ul>
     *
     * @param request 含 channel、userId、valueId
     * @return 是否成功
     */
    public BooleanResult detachUserTag(UserTagsDetachRequest request) {
        return http.post("/tags/user/tags/detach", request,
                new TypeReference<ApiResponse<BooleanResult>>() {
                });
    }

    /**
     * 按标签值分页查询关联用户。
     *
     * <p>根据单个标签值分页查询已关联的用户。接口使用 lastId 游标分页，首页可不传 lastId；查询下一页时传入上一页响应中的 lastId。
     * <p>{@code POST /tags/users/query}
     * <p>Meetbot：<a href="https://developers.meetbot.com/#/operations/queryUsersByTagValue">queryUsersByTagValue</a>
     *
     * @param request 请求参数
     * @return 按标签值分页查询关联用户结果
     */
    public TagUsersPageResponse queryUsersByTagValue(TagUsersQueryRequest request) {
        return http.post("/tags/users/query", request,
                new TypeReference<ApiResponse<TagUsersPageResponse>>() {
                });
    }
}
