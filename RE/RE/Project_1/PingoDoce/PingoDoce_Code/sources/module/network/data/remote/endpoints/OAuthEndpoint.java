package module.network.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.response.AuthenticationResponse;
import p468yc.C13195u;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* renamed from: module.network.data.remote.endpoints.OAuthApi */
/* loaded from: classes2.dex */
public interface OAuthEndpoint {

    /* compiled from: OAuthEndpoint.kt */
    /* renamed from: module.network.data.remote.endpoints.OAuthApi$a */
    /* loaded from: classes2.dex */
    public static final class C7539a {
        /* renamed from: a */
        public static /* synthetic */ Object m18255a(OAuthEndpoint oAuthEndpoint, String str, String str2, String str3, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "refresh_token";
                }
                return oAuthEndpoint.logout(str, str2, str3, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
    }

    @FormUrlEncoded
    @POST("https://app-proxy.pingodoce.pt/connect/revocation")
    Object logout(@Field("client_id") String str, @Field("token") String str2, @Field("token_type_hint") String str3, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @FormUrlEncoded
    @POST("https://app-proxy.pingodoce.pt/connect/token")
    Object revalidateToken(@Field("client_id") String str, @Field("grant_type") String str2, @Field("refresh_token") String str3, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);
}
