package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.response.AuthenticationResponse;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.ChangeNumberRequest;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.SendSmsRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateOwnerRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: PhoneApi.kt */
/* loaded from: classes2.dex */
public interface PhoneApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/changeNumber/changePhoneNumber")
    Object changeNumber(@Body ChangeNumberRequest changeNumberRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/changeNumber/sendChangeNumberValidationSms")
    Object sendValidationSms(@Body SendSmsRequest sendSmsRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/changeNumber/validateNumber")
    Object validateNumber(@Body PhoneRequest phoneRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/changeNumber/validateOldPhoneNumber")
    Object validateOwner(@Body ValidateOwnerRequest validateOwnerRequest, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);
}
