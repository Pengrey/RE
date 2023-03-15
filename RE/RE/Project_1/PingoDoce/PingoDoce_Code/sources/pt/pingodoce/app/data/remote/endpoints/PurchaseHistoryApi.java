package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import pt.pingodoce.app.data.local.models.purchases.ChartData;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: PurchaseHistoryApi.kt */
/* loaded from: classes2.dex */
public interface PurchaseHistoryApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/user/transactionsHistory/chart")
    Object getChartData(@Query("filter") String str, InterfaceC1886d<? super Response<ChartData>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/transactionsHistory/details")
    Object getPurchaseDetail(@Query("id") String str, InterfaceC1886d<? super Response<Purchase>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/transactionsHistory")
    Object getPurchaseList(@Query("pageNumber") int i, @Query("pageSize") int i2, InterfaceC1886d<? super Response<List<Purchase>>> interfaceC1886d);
}
