package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.user.User;
import p107ff.MultipartBody;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;
import pt.pingodoce.app.data.remote.models.request.DeleteAccountRequest;
import pt.pingodoce.app.data.remote.models.request.MadeForYou;
import pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

/* compiled from: UserApi.kt */
/* loaded from: classes2.dex */
public interface UserApi {
    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/email")
    Object deleteEmail(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/image")
    Object deletePhoto(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @HTTP(hasBody = true, method = "DELETE", path = "https://app-proxy.pingodoce.pt/api/v2/user/userprofiles")
    Object deleteUser(@Body DeleteAccountRequest deleteAccountRequest, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/notifications")
    Object getAppNotifications(InterfaceC1886d<? super Response<AppNotifications>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/preferences")
    Object getMadeForYou(InterfaceC1886d<? super Response<MadeForYou>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles")
    Object getProfile(InterfaceC1886d<? super Response<User>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/notifications")
    Object updateAppNotifications(@Body AppNotifications appNotifications, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/preferences")
    Object updateMadeForYou(@Body MadeForYou madeForYou, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @PUT("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles")
    Object updateProfile(@Body User user, InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/userprofiles/image")
    @Multipart
    Object uploadPhoto(@Part MultipartBody.C5508c c5508c, InterfaceC1886d<? super Response<PhotoUploadResponse>> interfaceC1886d);
}
