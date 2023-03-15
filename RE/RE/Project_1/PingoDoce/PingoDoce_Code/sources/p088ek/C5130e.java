package p088ek;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ek.e */
/* loaded from: classes2.dex */
public final class C5130e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f14185a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f14186b;

    /* renamed from: c */
    private final InterfaceC12341a<ConsentsManager> f14187c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f14188d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f14189e;

    public C5130e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<ConsentsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f14185a = interfaceC12341a;
        this.f14186b = interfaceC12341a2;
        this.f14187c = interfaceC12341a3;
        this.f14188d = interfaceC12341a4;
        this.f14189e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C5130e m25594a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<ConsentsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C5130e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static IntroViewModel m25592c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, ConsentsManager consentsManager, C7405s1 c7405s1) {
        return new IntroViewModel(c1459l0, resourcesProvider, analyticsManager, consentsManager, c7405s1);
    }

    /* renamed from: b */
    public IntroViewModel m25593b(C1459l0 c1459l0) {
        IntroViewModel m25592c = m25592c(c1459l0, this.f14185a.mo42226get(), this.f14186b.mo42226get(), this.f14187c.mo42226get(), this.f14188d.mo42226get());
        C13886p.m94a(m25592c, this.f14189e.mo42226get());
        return m25592c;
    }
}
