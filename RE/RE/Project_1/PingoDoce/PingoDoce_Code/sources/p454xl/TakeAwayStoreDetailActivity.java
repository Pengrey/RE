package p454xl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import mg.TransactionCacheManager;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: xl.a */
/* loaded from: classes2.dex */
public final class TakeAwayStoreDetailActivity {
    /* renamed from: a */
    public static final void m1923a(AbstractC0304b abstractC0304b, Activity activity, Store store, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(store, "store");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        transactionCacheManager.m18587c(store);
        abstractC0304b.m41324a(new Intent(activity, pt.pingodoce.app.presentation.takeaway.pickupstore.detail.TakeAwayStoreDetailActivity.class));
    }
}
