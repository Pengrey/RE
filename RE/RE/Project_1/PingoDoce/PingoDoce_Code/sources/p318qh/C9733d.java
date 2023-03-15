package p318qh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: qh.d */
/* loaded from: classes2.dex */
public final class C9733d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25603a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f25604b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f25605c;

    public C9733d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f25603a = interfaceC12341a;
        this.f25604b = interfaceC12341a2;
        this.f25605c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C9733d m10084a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C9733d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ElectronicInvoiceEditEmailViewModel m10082c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new ElectronicInvoiceEditEmailViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public ElectronicInvoiceEditEmailViewModel m10083b(C1459l0 c1459l0) {
        ElectronicInvoiceEditEmailViewModel m10082c = m10082c(c1459l0, this.f25603a.mo42226get(), this.f25604b.mo42226get());
        C13886p.m94a(m10082c, this.f25605c.mo42226get());
        return m10082c;
    }
}
