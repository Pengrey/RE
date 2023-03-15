package p430wk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wk.j */
/* loaded from: classes2.dex */
public final class C12187j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32169a;

    /* renamed from: b */
    private final InterfaceC12341a<C7296j0> f32170b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f32171c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f32172d;

    public C12187j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f32169a = interfaceC12341a;
        this.f32170b = interfaceC12341a2;
        this.f32171c = interfaceC12341a3;
        this.f32172d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C12187j m3442a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C12187j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static OnboardingCardRegistrationViewModel m3440c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7296j0 c7296j0, AnalyticsManager analyticsManager) {
        return new OnboardingCardRegistrationViewModel(c1459l0, resourcesProvider, c7296j0, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingCardRegistrationViewModel m3441b(C1459l0 c1459l0) {
        OnboardingCardRegistrationViewModel m3440c = m3440c(c1459l0, this.f32169a.mo42226get(), this.f32170b.mo42226get(), this.f32171c.mo42226get());
        C13886p.m94a(m3440c, this.f32172d.mo42226get());
        return m3440c;
    }
}
