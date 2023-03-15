package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.products.PriceCalculation;
import pt.pingodoce.app.data.remote.models.request.CheckoutRequest;
import pt.pingodoce.app.data.remote.models.request.PriceCalculationRequest;
import pt.pingodoce.app.data.remote.models.request.SharedWithUpdateRequest;
import pt.pingodoce.app.data.remote.models.request.ShoppingListStoreModeRequest;
import pt.pingodoce.app.data.remote.models.request.ShoppingListUpdateRequest;
import pt.pingodoce.app.data.remote.models.response.CheckoutResponse;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;
import pt.pingodoce.app.data.remote.models.response.ShoppingListUpdateResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* compiled from: ShoppingListApi.kt */
/* loaded from: classes2.dex */
public interface ShoppingListApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/calculate")
    Object calculatePriceWithPromotion(@Body PriceCalculationRequest priceCalculationRequest, InterfaceC1886d<? super Response<List<PriceCalculation>>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/addshoppingcart")
    Object checkout(@Body CheckoutRequest checkoutRequest, InterfaceC1886d<? super Response<CheckoutResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/add")
    Object create(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/{id}")
    Object delete(@Path("id") String str, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/{id}")
    Object get(@Path("id") String str, InterfaceC1886d<? super Response<ShoppingList>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists")
    Object getAll(InterfaceC1886d<? super Response<List<ShoppingList>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/activeList")
    Object getDefault(InterfaceC1886d<? super Response<ShoppingList>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/count")
    Object getListsCount(InterfaceC1886d<? super Response<Integer>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/setdefault/{id}")
    Object setDefault(@Path("id") String str, InterfaceC1886d<? super Response<ShoppingList>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/storemode")
    Object storeMode(@Body ShoppingListStoreModeRequest shoppingListStoreModeRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists")
    Object update(@Body ShoppingListUpdateRequest shoppingListUpdateRequest, InterfaceC1886d<? super Response<ShoppingListUpdateResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/shoppinglists/writepermissions")
    Object writePermissions(@Body SharedWithUpdateRequest sharedWithUpdateRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);
}
