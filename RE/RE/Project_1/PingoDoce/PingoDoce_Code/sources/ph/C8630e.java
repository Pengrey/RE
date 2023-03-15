package ph;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ph.e */
/* loaded from: classes2.dex */
public final class C8630e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f22245a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f22246b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f22247c;

    public C8630e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f22245a = interfaceC12341a;
        this.f22246b = interfaceC12341a2;
        this.f22247c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C8630e m14977a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C8630e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ElectronicInvoiceViewModel m14975c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        return new ElectronicInvoiceViewModel(c1459l0, resourcesProvider, loyaltyCardManager);
    }

    /* renamed from: b */
    public ElectronicInvoiceViewModel m14976b(C1459l0 c1459l0) {
        ElectronicInvoiceViewModel m14975c = m14975c(c1459l0, this.f22245a.mo42226get(), this.f22246b.mo42226get());
        C13886p.m94a(m14975c, this.f22247c.mo42226get());
        return m14975c;
    }
}
