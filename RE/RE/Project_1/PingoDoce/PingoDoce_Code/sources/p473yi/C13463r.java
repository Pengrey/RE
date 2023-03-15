package p473yi;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: yi.r */
/* loaded from: classes2.dex */
public final class C13463r {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f34236a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f34237b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f34238c;

    public C13463r(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f34236a = interfaceC12341a;
        this.f34237b = interfaceC12341a2;
        this.f34238c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C13463r m1342a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C13463r(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static VirtualCardSuccessViewModel m1340c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new VirtualCardSuccessViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public VirtualCardSuccessViewModel m1341b(C1459l0 c1459l0) {
        VirtualCardSuccessViewModel m1340c = m1340c(c1459l0, this.f34236a.mo42226get(), this.f34237b.mo42226get());
        C13886p.m94a(m1340c, this.f34238c.mo42226get());
        return m1340c;
    }
}
