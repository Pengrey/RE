package am;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7347m1;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: am.g */
/* loaded from: classes2.dex */
public final class C0223g {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f510a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f511b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f512c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f513d;

    public C0223g(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f510a = interfaceC12341a;
        this.f511b = interfaceC12341a2;
        this.f512c = interfaceC12341a3;
        this.f513d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C0223g m41521a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C0223g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TakeAwayProductListFragmentViewModel m41519c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        return new TakeAwayProductListFragmentViewModel(c1459l0, resourcesProvider, analyticsManager, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayProductListFragmentViewModel m41520b(C1459l0 c1459l0) {
        TakeAwayProductListFragmentViewModel m41519c = m41519c(c1459l0, this.f510a.mo42226get(), this.f511b.mo42226get(), this.f512c.mo42226get());
        C13886p.m94a(m41519c, this.f513d.mo42226get());
        return m41519c;
    }
}
