package p318qh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: qh.i */
/* loaded from: classes2.dex */
public final class C9737i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25612a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f25613b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f25614c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f25615d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f25616e;

    public C9737i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f25612a = interfaceC12341a;
        this.f25613b = interfaceC12341a2;
        this.f25614c = interfaceC12341a3;
        this.f25615d = interfaceC12341a4;
        this.f25616e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C9737i m10076a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C9737i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static ElectronicInvoiceEmailViewModel m10074c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        return new ElectronicInvoiceEmailViewModel(c1459l0, resourcesProvider, c7405s1, loyaltyCardManager, analyticsManager);
    }

    /* renamed from: b */
    public ElectronicInvoiceEmailViewModel m10075b(C1459l0 c1459l0) {
        ElectronicInvoiceEmailViewModel m10074c = m10074c(c1459l0, this.f25612a.mo42226get(), this.f25613b.mo42226get(), this.f25614c.mo42226get(), this.f25615d.mo42226get());
        C13886p.m94a(m10074c, this.f25616e.mo42226get());
        return m10074c;
    }
}
