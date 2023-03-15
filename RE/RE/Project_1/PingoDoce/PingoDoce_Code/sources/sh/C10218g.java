package sh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: sh.g */
/* loaded from: classes2.dex */
public final class C10218g {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f26637a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f26638b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f26639c;

    public C10218g(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f26637a = interfaceC12341a;
        this.f26638b = interfaceC12341a2;
        this.f26639c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C10218g m8484a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C10218g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ElectronicInvoiceStatusViewModel m8482c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        return new ElectronicInvoiceStatusViewModel(c1459l0, resourcesProvider, loyaltyCardManager);
    }

    /* renamed from: b */
    public ElectronicInvoiceStatusViewModel m8483b(C1459l0 c1459l0) {
        ElectronicInvoiceStatusViewModel m8482c = m8482c(c1459l0, this.f26637a.mo42226get(), this.f26638b.mo42226get());
        C13886p.m94a(m8482c, this.f26639c.mo42226get());
        return m8482c;
    }
}
