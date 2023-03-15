package p449xg;

import com.google.firebase.analytics.FirebaseAnalytics;
import mg.AnalyticsManager;
import p248n4.AppEventsLogger;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.c */
/* loaded from: classes2.dex */
public final class C12376c implements InterfaceC11614c<AnalyticsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<FirebaseAnalytics> f32546a;

    /* renamed from: b */
    private final InterfaceC12341a<AppEventsLogger> f32547b;

    public C12376c(InterfaceC12341a<FirebaseAnalytics> interfaceC12341a, InterfaceC12341a<AppEventsLogger> interfaceC12341a2) {
        this.f32546a = interfaceC12341a;
        this.f32547b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12376c m2961a(InterfaceC12341a<FirebaseAnalytics> interfaceC12341a, InterfaceC12341a<AppEventsLogger> interfaceC12341a2) {
        return new C12376c(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static AnalyticsManager m2959c(FirebaseAnalytics firebaseAnalytics, AppEventsLogger appEventsLogger) {
        return (AnalyticsManager) C11617f.m4587d(AppProviders.f32545a.m2981a(firebaseAnalytics, appEventsLogger));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AnalyticsManager mo42226get() {
        return m2959c(this.f32546a.mo42226get(), this.f32547b.mo42226get());
    }
}
