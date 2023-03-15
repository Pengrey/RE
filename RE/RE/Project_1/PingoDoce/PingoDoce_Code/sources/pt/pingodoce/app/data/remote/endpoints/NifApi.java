package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.NifRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: NifApi.kt */
/* loaded from: classes2.dex */
public interface NifApi {
    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/nif/validate")
    Object validateNif(@Body NifRequest nifRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);
}
