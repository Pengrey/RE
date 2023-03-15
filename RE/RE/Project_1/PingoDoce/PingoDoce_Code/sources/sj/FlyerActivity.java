package sj;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import mg.TransactionCacheManager;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: sj.e */
/* loaded from: classes2.dex */
public final class FlyerActivity {
    /* renamed from: a */
    public static final void m8458a(ActivityC0325c activityC0325c, Flyer flyer, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(flyer, "flyer");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        transactionCacheManager.m18588b(flyer);
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.flyer.FlyerActivity.class));
    }

    /* renamed from: b */
    public static final void m8457b(ActivityC0325c activityC0325c, Flyer flyer, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(flyer, "flyer");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        transactionCacheManager.m18588b(flyer);
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.flyer.FlyerActivity.class);
        intent.putExtra("EXTRA_FOR_FLYER_FROM_BANNER", true);
        activityC0325c.startActivity(intent);
    }
}
