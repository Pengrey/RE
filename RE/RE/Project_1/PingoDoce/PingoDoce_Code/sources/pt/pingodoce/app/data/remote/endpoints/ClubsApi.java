package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.remote.models.response.ClubListResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* compiled from: ClubsApi.kt */
/* loaded from: classes2.dex */
public interface ClubsApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/user/clubs/subscription/{clubId}")
    Object addSubscription(@Path("clubId") String str, @Body Club club, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/clubs/codes")
    Object clubSubscribedCodes(InterfaceC1886d<? super Response<List<String>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/clubs")
    Object clubs(InterfaceC1886d<? super Response<ClubListResponse>> interfaceC1886d);

    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/clubs/subscription/{clubId}")
    Object deleteSubscription(@Path("clubId") String str, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/clubs/subscription/{clubId}")
    Object updateSubscription(@Path("clubId") String str, @Body Club club, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);
}
