package am;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: am.s */
/* loaded from: classes2.dex */
public final class C0237s {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f535a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f536b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f537c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f538d;

    public C0237s(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f535a = interfaceC12341a;
        this.f536b = interfaceC12341a2;
        this.f537c = interfaceC12341a3;
        this.f538d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C0237s m41498a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C0237s(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TakeAwayProductsViewModel m41496c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        return new TakeAwayProductsViewModel(c1459l0, resourcesProvider, analyticsManager, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayProductsViewModel m41497b(C1459l0 c1459l0) {
        TakeAwayProductsViewModel m41496c = m41496c(c1459l0, this.f535a.mo42226get(), this.f536b.mo42226get(), this.f537c.mo42226get());
        C13886p.m94a(m41496c, this.f538d.mo42226get());
        return m41496c;
    }
}
