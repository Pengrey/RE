package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import pt.pingodoce.app.data.remote.models.response.Consent;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: ConsentsApi.kt */
/* loaded from: classes2.dex */
public interface ConsentsApi {

    /* compiled from: ConsentsApi.kt */
    /* renamed from: pt.pingodoce.app.data.remote.endpoints.ConsentsApi$a */
    /* loaded from: classes2.dex */
    public static final class C8726a {
        /* renamed from: a */
        public static /* synthetic */ Object m14221a(ConsentsApi consentsApi, String str, String str2, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "1";
                }
                return consentsApi.clubConsents(str, str2, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clubConsents");
        }
    }

    @GET("https://app-proxy.pingodoce.pt/api/v2/identity/consents/latest")
    Object clubConsents(@Query("type") String str, @Query("clubCode") String str2, InterfaceC1886d<? super Response<List<Consent>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/identity/consents/latest")
    Object consents(@Query("all") boolean z, InterfaceC1886d<? super Response<List<Consent>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/identity/consents/latest")
    Object latestConsents(InterfaceC1886d<? super Response<List<Consent>>> interfaceC1886d);
}
