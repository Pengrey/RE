package p185ji;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ji.k0 */
/* loaded from: classes2.dex */
public final class C6494k0 {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17613a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f17614b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f17615c;

    public C6494k0(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f17613a = interfaceC12341a;
        this.f17614b = interfaceC12341a2;
        this.f17615c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C6494k0 m20816a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C6494k0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static WineClubWelcomeViewModel m20814c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new WineClubWelcomeViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public WineClubWelcomeViewModel m20815b(C1459l0 c1459l0) {
        WineClubWelcomeViewModel m20814c = m20814c(c1459l0, this.f17613a.mo42226get(), this.f17614b.mo42226get());
        C13886p.m94a(m20814c, this.f17615c.mo42226get());
        return m20814c;
    }
}
