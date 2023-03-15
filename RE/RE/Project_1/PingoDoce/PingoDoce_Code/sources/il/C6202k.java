package il;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import mg.PurchasesManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: il.k */
/* loaded from: classes2.dex */
public final class C6202k {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17012a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f17013b;

    /* renamed from: c */
    private final InterfaceC12341a<PurchasesManager> f17014c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f17015d;

    public C6202k(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f17012a = interfaceC12341a;
        this.f17013b = interfaceC12341a2;
        this.f17014c = interfaceC12341a3;
        this.f17015d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6202k m21913a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6202k(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PurchaseListViewModel m21911c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PurchasesManager purchasesManager) {
        return new PurchaseListViewModel(c1459l0, resourcesProvider, loyaltyCardManager, purchasesManager);
    }

    /* renamed from: b */
    public PurchaseListViewModel m21912b(C1459l0 c1459l0) {
        PurchaseListViewModel m21911c = m21911c(c1459l0, this.f17012a.mo42226get(), this.f17013b.mo42226get(), this.f17014c.mo42226get());
        C13886p.m94a(m21911c, this.f17015d.mo42226get());
        return m21911c;
    }
}
