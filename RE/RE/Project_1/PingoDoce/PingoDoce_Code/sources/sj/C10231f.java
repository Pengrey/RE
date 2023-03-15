package sj;

import ke.ViewModelFactoryByInjection;
import mg.AnalyticsManager;
import mg.StoreManager;
import mg.TransactionCacheManager;
import pt.pingodoce.app.presentation.flyer.FlyerActivity;

/* renamed from: sj.f */
/* loaded from: classes2.dex */
public final class C10231f {
    /* renamed from: a */
    public static void m8456a(FlyerActivity flyerActivity, AnalyticsManager analyticsManager) {
        flyerActivity.f24110h0 = analyticsManager;
    }

    /* renamed from: b */
    public static void m8455b(FlyerActivity flyerActivity, TransactionCacheManager transactionCacheManager) {
        flyerActivity.f24109g0 = transactionCacheManager;
    }

    /* renamed from: c */
    public static void m8454c(FlyerActivity flyerActivity, ViewModelFactoryByInjection viewModelFactoryByInjection) {
        flyerActivity.f24111i0 = viewModelFactoryByInjection;
    }

    /* renamed from: d */
    public static void m8453d(FlyerActivity flyerActivity, StoreManager storeManager) {
        flyerActivity.f24108f0 = storeManager;
    }
}
