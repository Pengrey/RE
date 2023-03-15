package cm;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: cm.g */
/* loaded from: classes2.dex */
public final class C2182g {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f6291a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f6292b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f6293c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f6294d;

    public C2182g(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f6291a = interfaceC12341a;
        this.f6292b = interfaceC12341a2;
        this.f6293c = interfaceC12341a3;
        this.f6294d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C2182g m34492a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C2182g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TakeAwayProductDetailViewModel m34490c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        return new TakeAwayProductDetailViewModel(c1459l0, resourcesProvider, analyticsManager, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayProductDetailViewModel m34491b(C1459l0 c1459l0) {
        TakeAwayProductDetailViewModel m34490c = m34490c(c1459l0, this.f6291a.mo42226get(), this.f6292b.mo42226get(), this.f6293c.mo42226get());
        C13886p.m94a(m34490c, this.f6294d.mo42226get());
        return m34490c;
    }
}
