package com.meetbot.openapi.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.meetbot.openapi.http.MeetbotHttpClient;
import com.meetbot.openapi.model.ApiResponse;
import com.meetbot.openapi.model.CartStatusOpenRequest;
import com.meetbot.openapi.model.CartStatusResponse;
import com.meetbot.openapi.model.CartToggleOpenRequest;
import com.meetbot.openapi.model.CatalogBindWabaOpenRequest;
import com.meetbot.openapi.model.CatalogCreateOpenRequest;
import com.meetbot.openapi.model.CatalogDeleteOpenRequest;
import com.meetbot.openapi.model.CatalogListOpenRequest;
import com.meetbot.openapi.model.CatalogProductListItemResponse;
import com.meetbot.openapi.model.CatalogProductResponse;
import com.meetbot.openapi.model.CatalogUnbindWabaOpenRequest;
import com.meetbot.openapi.model.EmptyResult;
import com.meetbot.openapi.model.LongIdResult;
import com.meetbot.openapi.model.OpenCatalogListResponse;
import com.meetbot.openapi.model.PageResult;
import com.meetbot.openapi.model.ProductBatchImportOpenRequest;
import com.meetbot.openapi.model.ProductBatchImportTaskDetailOpenRequest;
import com.meetbot.openapi.model.ProductBatchImportTaskDetailOpenResponse;
import com.meetbot.openapi.model.ProductCreateOpenRequest;
import com.meetbot.openapi.model.ProductDeleteOpenRequest;
import com.meetbot.openapi.model.ProductDetailOpenRequest;
import com.meetbot.openapi.model.ProductEditOpenRequest;
import com.meetbot.openapi.model.ProductListOpenRequest;
import com.meetbot.openapi.model.StringIdResult;

import java.util.List;

/**
 * WhatsApp Commerce Catalog 目录与商品管理。
 *
 * <p>对应 Meetbot 文档「Catalog」：
 * <a href="https://developers.meetbot.com/#/operations/catalogList">catalogList</a>
 */
public class CatalogApi {

    private final MeetbotHttpClient http;

    public CatalogApi(MeetbotHttpClient http) {
        this.http = http;
    }

    /**
     * 按 BM ID 查询 Catalog 列表，含 WABA 绑定信息。需在 Meetbot 后台完成对应 BM 授权。
     *
     * <p>{@code POST /open/catalog/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogList">catalogList</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 含 BM ID
     * @return Catalog 列表
     */
    public List<OpenCatalogListResponse> list(CatalogListOpenRequest request) {
        return http.post("/open/catalog/list", request,
                new TypeReference<ApiResponse<List<OpenCatalogListResponse>>>() {
                });
    }

    /**
     * 按 WABA ID 查询其下各手机号的购物车开关状态。
     *
     * <p>{@code POST /open/catalog/cart/status}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogCartStatus">catalogCartStatus</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 含 WABA ID
     * @return 各手机号购物车状态
     */
    public List<CartStatusResponse> cartStatus(CartStatusOpenRequest request) {
        return http.post("/open/catalog/cart/status", request,
                new TypeReference<ApiResponse<List<CartStatusResponse>>>() {
                });
    }

    /**
     * 按 Meta 手机号 ID 开启或关闭 WhatsApp 购物车功能。
     *
     * <p>{@code POST /open/catalog/cart/toggle}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogCartToggle">catalogCartToggle</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 购物车开关请求
     * @return 空业务结果
     */
    public EmptyResult toggleCart(CartToggleOpenRequest request) {
        return http.post("/open/catalog/cart/toggle", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 在指定 BM 下创建 Meta Commerce Catalog，返回 Catalog ID。
     *
     * <p>{@code POST /open/catalog/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogCreate">catalogCreate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 创建 Catalog 请求
     * @return Catalog ID
     */
    public StringIdResult create(CatalogCreateOpenRequest request) {
        return http.post("/open/catalog/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 删除指定 Catalog。
     *
     * <p>{@code POST /open/catalog/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogDelete">catalogDelete</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 删除 Catalog 请求
     * @return 空业务结果
     */
    public EmptyResult delete(CatalogDeleteOpenRequest request) {
        return http.post("/open/catalog/delete", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 将 Catalog 绑定到指定 WABA，绑定后该 WABA 下的 WhatsApp 号可使用该商品目录。
     *
     * <p>{@code POST /open/catalog/bindwaba}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogBindWaba">catalogBindWaba</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 绑定请求
     * @return 空业务结果
     */
    public EmptyResult bindWaba(CatalogBindWabaOpenRequest request) {
        return http.post("/open/catalog/bindwaba", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 解除 WABA 与 Catalog 的绑定关系。
     *
     * <p>{@code POST /open/catalog/unbindwaba}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogUnbindWaba">catalogUnbindWaba</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 解绑请求
     * @return 空业务结果
     */
    public EmptyResult unbindWaba(CatalogUnbindWabaOpenRequest request) {
        return http.post("/open/catalog/unbindwaba", request,
                new TypeReference<ApiResponse<EmptyResult>>() {
                });
    }

    /**
     * 按 Catalog ID 分页查询商品，支持按标题、retailerId、库存/审核/可见状态筛选。
     *
     * <p>{@code POST /open/catalog/product/list}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductList">catalogProductList</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 商品列表查询请求
     * @return 商品分页结果
     */
    public PageResult<CatalogProductListItemResponse> listProducts(ProductListOpenRequest request) {
        return http.post("/open/catalog/product/list", request,
                new TypeReference<ApiResponse<PageResult<CatalogProductListItemResponse>>>() {
                });
    }

    /**
     * 按 Catalog ID 与 retailerId 查询单个商品详情。
     *
     * <p>{@code POST /open/catalog/product/detail}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductDetail">catalogProductDetail</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 商品详情查询请求
     * @return 商品详情
     */
    public CatalogProductResponse getProduct(ProductDetailOpenRequest request) {
        return http.post("/open/catalog/product/detail", request,
                new TypeReference<ApiResponse<CatalogProductResponse>>() {
                });
    }

    /**
     * 提交单条商品创建任务（异步），立即返回任务 ID；完成后 Webhook {@code CREATE_CATALOG_PRODUCT_BY_API}。
     *
     * <p>{@code POST /open/catalog/product/create}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductCreate">catalogProductCreate</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 创建商品请求
     * @return 异步任务 ID
     */
    public StringIdResult createProduct(ProductCreateOpenRequest request) {
        return http.post("/open/catalog/product/create", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 提交单条商品编辑任务（异步），立即返回任务 ID；完成后 Webhook {@code UPDATE_CATALOG_PRODUCT_BY_API}。
     *
     * <p>{@code POST /open/catalog/product/edit}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductEdit">catalogProductEdit</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 编辑商品请求
     * @return 异步任务 ID
     */
    public StringIdResult editProduct(ProductEditOpenRequest request) {
        return http.post("/open/catalog/product/edit", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 提交单条商品删除任务（异步），立即返回任务 ID；完成后 Webhook {@code DELETE_CATALOG_PRODUCT_BY_API}。
     *
     * <p>{@code POST /open/catalog/product/delete}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductDelete">catalogProductDelete</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 删除商品请求
     * @return 异步任务 ID
     */
    public StringIdResult deleteProduct(ProductDeleteOpenRequest request) {
        return http.post("/open/catalog/product/delete", request,
                new TypeReference<ApiResponse<StringIdResult>>() {
                });
    }

    /**
     * 通过 Excel 文件 URL 提交批量导入任务（异步），立即返回任务 ID。
     * 完成后 Webhook {@code UPLOAD_CATALOG_PRODUCT_BY_API}；也可调用 {@link #batchImportDetail} 查进度。
     * Excel 表头要求见 Meetbot 文档。
     *
     * <p>{@code POST /open/catalog/product/batchImport}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductBatchImport">catalogProductBatchImport</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 批量导入请求（含文件 URL）
     * @return 任务 ID
     */
    public LongIdResult batchImport(ProductBatchImportOpenRequest request) {
        return http.post("/open/catalog/product/batchImport", request,
                new TypeReference<ApiResponse<LongIdResult>>() {
                });
    }

    /**
     * 按任务 ID 查询批量导入任务的执行进度与结果统计。
     *
     * <p>{@code POST /open/catalog/product/batchImport/detail}
     *
     * <ul>
     *   <li>Meetbot：<a href="https://developers.meetbot.com/#/operations/catalogProductBatchImportDetail">catalogProductBatchImportDetail</a></li>
     *   <li>Meta：<a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/catalogs">WhatsApp catalogs</a></li>
     * </ul>
     *
     * @param request 含任务 ID
     * @return 任务进度与统计
     */
    public ProductBatchImportTaskDetailOpenResponse batchImportDetail(
            ProductBatchImportTaskDetailOpenRequest request) {
        return http.post("/open/catalog/product/batchImport/detail", request,
                new TypeReference<ApiResponse<ProductBatchImportTaskDetailOpenResponse>>() {
                });
    }
}
