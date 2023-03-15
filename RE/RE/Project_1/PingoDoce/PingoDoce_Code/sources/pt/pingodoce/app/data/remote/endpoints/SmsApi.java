package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.response.AuthenticationResponse;
import module.network.data.remote.models.response.authenticationv2.SmsValidationAuthenticationResponseV2;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.SendSmsRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateSmsRequest;
import pt.pingodoce.app.data.remote.models.response.VerifyNumber;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: SmsApi.kt */
/* loaded from: classes2.dex */
public interface SmsApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/sms/sendSmsValidation")
    Object sendSmsToken(@Body SendSmsRequest sendSmsRequest, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/sms/validateSmsAndGetPmCards")
    Object validateSmsAndGetPmCards(@Body ValidateSmsRequest validateSmsRequest, InterfaceC1886d<? super Response<SmsValidationAuthenticationResponseV2>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/sms/validate")
    Object validateSmsToken(@Body ValidateSmsRequest validateSmsRequest, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/sms/verifyNumber")
    Object verifyNumber(@Body PhoneRequest phoneRequest, InterfaceC1886d<? super Response<VerifyNumber>> interfaceC1886d);
}
