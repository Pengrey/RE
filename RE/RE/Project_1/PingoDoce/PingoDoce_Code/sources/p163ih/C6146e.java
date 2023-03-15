package p163ih;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import mg.PurchasesManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ih.e */
/* loaded from: classes2.dex */
public final class C6146e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16873a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f16874b;

    /* renamed from: c */
    private final InterfaceC12341a<PurchasesManager> f16875c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f16876d;

    public C6146e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f16873a = interfaceC12341a;
        this.f16874b = interfaceC12341a2;
        this.f16875c = interfaceC12341a3;
        this.f16876d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6146e m22068a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6146e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PurchasesChartViewModel m22066c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PurchasesManager purchasesManager) {
        return new PurchasesChartViewModel(c1459l0, resourcesProvider, loyaltyCardManager, purchasesManager);
    }

    /* renamed from: b */
    public PurchasesChartViewModel m22067b(C1459l0 c1459l0) {
        PurchasesChartViewModel m22066c = m22066c(c1459l0, this.f16873a.mo42226get(), this.f16874b.mo42226get(), this.f16875c.mo42226get());
        C13886p.m94a(m22066c, this.f16876d.mo42226get());
        return m22066c;
    }
}
