package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.ChangePinSmsRequest;
import pt.pingodoce.app.data.remote.models.request.RecoveryPinRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateSmsCodeRequest;
import pt.pingodoce.app.data.remote.models.response.PinRecoveryResponse;
import pt.pingodoce.app.data.remote.models.response.TokenResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: PinRecoveryApi.kt */
/* loaded from: classes2.dex */
public interface PinRecoveryApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/pinrecoverywebandsms/changepinsms")
    Object changePin(@Body ChangePinSmsRequest changePinSmsRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/pinrecoverywebandsms/recoverpin")
    Object recoverPin(@Body RecoveryPinRequest recoveryPinRequest, InterfaceC1886d<? super Response<PinRecoveryResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/pinrecovery/sendpinrecoveryemail")
    Object sendPinRecoveryEmail(@Body RecoveryPinRequest recoveryPinRequest, InterfaceC1886d<? super Response<PinRecoveryResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/pinrecoverywebandsms/validatesmscode")
    Object validateSmsCode(@Body ValidateSmsCodeRequest validateSmsCodeRequest, InterfaceC1886d<? super Response<TokenResponse>> interfaceC1886d);
}
