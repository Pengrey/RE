package p430wk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wk.u */
/* loaded from: classes2.dex */
public final class C12197u {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32186a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f32187b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f32188c;

    public C12197u(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f32186a = interfaceC12341a;
        this.f32187b = interfaceC12341a2;
        this.f32188c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C12197u m3418a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C12197u(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingOtherUserCardTutorialViewModel m3416c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new OnboardingOtherUserCardTutorialViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingOtherUserCardTutorialViewModel m3417b(C1459l0 c1459l0) {
        OnboardingOtherUserCardTutorialViewModel m3416c = m3416c(c1459l0, this.f32186a.mo42226get(), this.f32187b.mo42226get());
        C13886p.m94a(m3416c, this.f32188c.mo42226get());
        return m3416c;
    }
}
