package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.StoreDefaultRequest;
import pt.pingodoce.app.data.remote.models.response.Store;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: StoreApi.kt */
/* loaded from: classes2.dex */
public interface StoreApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/store")
    /* renamed from: default  reason: not valid java name */
    Object m39646default(InterfaceC1886d<? super Response<Store>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/addstore")
    Object setDefault(@Body StoreDefaultRequest storeDefaultRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/{id}")
    Object store(@Path("id") int i, InterfaceC1886d<? super Response<Store>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/stores")
    Object stores(InterfaceC1886d<? super Response<List<Store>>> interfaceC1886d);
}
