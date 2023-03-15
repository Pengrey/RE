package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import pt.pingodoce.app.data.local.models.products.Category;
import pt.pingodoce.app.data.local.models.products.FilterCriteria;
import pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCategoriesParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchFlyersParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchTagsParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import pt.pingodoce.app.data.remote.models.response.Tag;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: CatalogApi.kt */
/* loaded from: classes2.dex */
public interface CatalogApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/catalog/search/criteria")
    Object criteria(InterfaceC1886d<? super Response<FilterCriteria>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/catalog/search/recommendations")
    Object recommendations(@Body RecommendationsParameters recommendationsParameters, InterfaceC1886d<? super Response<CatalogResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/catalog/search/products")
    Object searchCatalog(@Body SearchCatalogParameters searchCatalogParameters, InterfaceC1886d<? super Response<CatalogResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/catalog/search/categories")
    Object searchCategories(@Body SearchCategoriesParameters searchCategoriesParameters, InterfaceC1886d<? super Response<List<Category>>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/catalog/search/flyers")
    Object searchFlyers(@Body SearchFlyersParameters searchFlyersParameters, InterfaceC1886d<? super Response<List<Flyer>>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/catalog/search/tags")
    Object searchTags(@Body SearchTagsParameters searchTagsParameters, InterfaceC1886d<? super Response<List<Tag>>> interfaceC1886d);
}
