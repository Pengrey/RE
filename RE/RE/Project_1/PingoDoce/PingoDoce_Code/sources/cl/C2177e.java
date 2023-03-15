package cl;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: cl.e */
/* loaded from: classes2.dex */
public final class C2177e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f6282a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f6283b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f6284c;

    public C2177e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f6282a = interfaceC12341a;
        this.f6283b = interfaceC12341a2;
        this.f6284c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C2177e m34505a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C2177e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingSuccessViewModel m34503c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new OnboardingSuccessViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingSuccessViewModel m34504b(C1459l0 c1459l0) {
        OnboardingSuccessViewModel m34503c = m34503c(c1459l0, this.f6282a.mo42226get(), this.f6283b.mo42226get());
        C13886p.m94a(m34503c, this.f6284c.mo42226get());
        return m34503c;
    }
}
