package p497zk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.PrefsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: zk.f */
/* loaded from: classes2.dex */
public final class C13948f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f35103a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f35104b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f35105c;

    /* renamed from: d */
    private final InterfaceC12341a<PrefsManager> f35106d;

    /* renamed from: e */
    private final InterfaceC12341a<C7296j0> f35107e;

    /* renamed from: f */
    private final InterfaceC12341a<AnalyticsManager> f35108f;

    /* renamed from: g */
    private final InterfaceC12341a<C7405s1> f35109g;

    public C13948f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<PrefsManager> interfaceC12341a4, InterfaceC12341a<C7296j0> interfaceC12341a5, InterfaceC12341a<AnalyticsManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        this.f35103a = interfaceC12341a;
        this.f35104b = interfaceC12341a2;
        this.f35105c = interfaceC12341a3;
        this.f35106d = interfaceC12341a4;
        this.f35107e = interfaceC12341a5;
        this.f35108f = interfaceC12341a6;
        this.f35109g = interfaceC12341a7;
    }

    /* renamed from: a */
    public static C13948f m17a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<PrefsManager> interfaceC12341a4, InterfaceC12341a<C7296j0> interfaceC12341a5, InterfaceC12341a<AnalyticsManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        return new C13948f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7);
    }

    /* renamed from: c */
    public static OnboardingNotificationViewModel m15c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C7405s1 c7405s1, PrefsManager prefsManager, C7296j0 c7296j0, AnalyticsManager analyticsManager) {
        return new OnboardingNotificationViewModel(c1459l0, resourcesProvider, authManager, c7405s1, prefsManager, c7296j0, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingNotificationViewModel m16b(C1459l0 c1459l0) {
        OnboardingNotificationViewModel m15c = m15c(c1459l0, this.f35103a.mo42226get(), this.f35104b.mo42226get(), this.f35105c.mo42226get(), this.f35106d.mo42226get(), this.f35107e.mo42226get(), this.f35108f.mo42226get());
        C13886p.m94a(m15c, this.f35109g.mo42226get());
        return m15c;
    }
}
