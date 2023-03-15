package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.response.AuthenticationResponse;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.ChangePinRequest;
import pt.pingodoce.app.data.remote.models.request.PinValidationRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* compiled from: AuthApi.kt */
/* loaded from: classes2.dex */
public interface AuthApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/user/pin/change")
    Object changePin(@Body ChangePinRequest changePinRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @FormUrlEncoded
    @POST("https://app-proxy.pingodoce.pt//connect/token")
    Object login(@Field("client_id") String str, @Field("grant_type") String str2, @Field("username") String str3, @Field("password") String str4, @Field("code") String str5, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/pin/validate")
    Object validatePin(@Body PinValidationRequest pinValidationRequest, InterfaceC1886d<? super Response<String>> interfaceC1886d);
}
