package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus;
import pt.pingodoce.app.data.remote.models.request.TakeAwayOrderCancellationRequest;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.data.remote.models.response.TakeAwayOrderResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: TakeAwayApi.kt */
/* loaded from: classes2.dex */
public interface TakeAwayApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders/cancel")
    Object cancelOrder(@Body TakeAwayOrderCancellationRequest takeAwayOrderCancellationRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/categories")
    Object categories(@Query("storeId") int i, @Query("pickUpDate") String str, InterfaceC1886d<? super Response<List<TakeAwayCategory>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/categories/{id}")
    Object categoryProducts(@Path("id") String str, @Query("storeId") int i, @Query("pickUpDate") String str2, @Query("pageNumber") int i2, @Query("pageSize") int i3, InterfaceC1886d<? super Response<List<TakeAwayProduct>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders")
    Object orders(InterfaceC1886d<? super Response<List<TakeAwayOrder>>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/takeaway/orders")
    Object placeOrder(@Body TakeAwayOrder takeAwayOrder, InterfaceC1886d<? super Response<TakeAwayOrderResponse>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/status")
    Object status(InterfaceC1886d<? super Response<TakeAwayStatus>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/takeaway/store/{id}")
    Object takeAwaySchedules(@Path("id") int i, InterfaceC1886d<? super Response<Store>> interfaceC1886d);
}
