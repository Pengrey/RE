package p163ih;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.PurchasesManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ih.k */
/* loaded from: classes2.dex */
public final class C6156k {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16893a;

    /* renamed from: b */
    private final InterfaceC12341a<PurchasesManager> f16894b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f16895c;

    public C6156k(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PurchasesManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f16893a = interfaceC12341a;
        this.f16894b = interfaceC12341a2;
        this.f16895c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C6156k m22039a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<PurchasesManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C6156k(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static PurchasesRecentViewModel m22037c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PurchasesManager purchasesManager) {
        return new PurchasesRecentViewModel(c1459l0, resourcesProvider, purchasesManager);
    }

    /* renamed from: b */
    public PurchasesRecentViewModel m22038b(C1459l0 c1459l0) {
        PurchasesRecentViewModel m22037c = m22037c(c1459l0, this.f16893a.mo42226get(), this.f16894b.mo42226get());
        C13886p.m94a(m22037c, this.f16895c.mo42226get());
        return m22037c;
    }
}
