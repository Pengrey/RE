package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Banner;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BannerApi.kt */
/* loaded from: classes2.dex */
public interface BannerApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/user/banners/dismiss/{id}")
    Object dismiss(@Path("id") int i, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/banners")
    Object getBanners(@Query("storeId") int i, InterfaceC1886d<? super Response<List<Banner>>> interfaceC1886d);
}
