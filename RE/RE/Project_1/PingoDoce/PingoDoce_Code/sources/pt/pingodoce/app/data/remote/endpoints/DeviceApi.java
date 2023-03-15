package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.PUT;

/* compiled from: DeviceApi.kt */
/* loaded from: classes2.dex */
public interface DeviceApi {
    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/pushnotifications/devicepushregistration")
    Object sendDeviceToken(@Body DeviceTokenRequest deviceTokenRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);
}
