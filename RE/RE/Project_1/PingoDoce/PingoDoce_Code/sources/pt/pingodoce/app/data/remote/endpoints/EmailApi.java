package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.ConfirmationEmailRequest;
import pt.pingodoce.app.data.remote.models.request.EmailRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateAndSendEmailRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: EmailApi.kt */
/* loaded from: classes2.dex */
public interface EmailApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/identity/email/checkconfirmation")
    Object checkConfirmation(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v1/identity/email/sendemail")
    Object sendConfirmationEmail(@Body ConfirmationEmailRequest confirmationEmailRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/email/validateandsend")
    Object validateAndSendEmail(@Body ValidateAndSendEmailRequest validateAndSendEmailRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/email/validateemail")
    Object validateEmail(@Body EmailRequest emailRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);
}
