package p454xl;

import android.content.Intent;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import com.github.aachartmodel.aainfographics.C2336R;
import mg.C7347m1;
import mg.TransactionCacheManager;
import p181jd.Intrinsics;
import p205kj.StoreDetailViewModel;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: xl.c */
/* loaded from: classes2.dex */
public final class TakeAwayStoreDetailViewModel extends StoreDetailViewModel {

    /* renamed from: w */
    private final C7347m1 f33772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayStoreDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, TransactionCacheManager transactionCacheManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, transactionCacheManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        this.f33772w = c7347m1;
        C1436e0 m20746U = m20746U();
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_pickup_store);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m20746U.mo166p(string);
    }

    /* renamed from: N */
    protected void m1921N() {
    }

    /* renamed from: Y */
    public void m1920Y(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f33772w.m18666z(store);
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FOR_STORE", store);
        C13195u c13195u = C13195u.f34156a;
        UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
    }
}
