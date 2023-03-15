package p146hl;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.PurchasesManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: hl.h */
/* loaded from: classes2.dex */
public final class C5972h {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16496a;

    /* renamed from: b */
    private final InterfaceC12341a<PurchasesManager> f16497b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f16498c;

    public C5972h(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PurchasesManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f16496a = interfaceC12341a;
        this.f16497b = interfaceC12341a2;
        this.f16498c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5972h m22552a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PurchasesManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C5972h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static PurchaseDetailViewModel m22550c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PurchasesManager purchasesManager) {
        return new PurchaseDetailViewModel(c1459l0, resourcesProvider, purchasesManager);
    }

    /* renamed from: b */
    public PurchaseDetailViewModel m22551b(C1459l0 c1459l0) {
        PurchaseDetailViewModel m22550c = m22550c(c1459l0, this.f16496a.mo42226get(), this.f16497b.mo42226get());
        C13886p.m94a(m22550c, this.f16498c.mo42226get());
        return m22550c;
    }
}
