package p188jl;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7405s1;
import mg.PurchasesManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: jl.j */
/* loaded from: classes2.dex */
public final class C6534j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17703a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f17704b;

    /* renamed from: c */
    private final InterfaceC12341a<PurchasesManager> f17705c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f17706d;

    public C6534j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f17703a = interfaceC12341a;
        this.f17704b = interfaceC12341a2;
        this.f17705c = interfaceC12341a3;
        this.f17706d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6534j m20683a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<PurchasesManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6534j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PurchaseProductsViewModel m20681c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, PurchasesManager purchasesManager) {
        return new PurchaseProductsViewModel(c1459l0, resourcesProvider, c7256f1, purchasesManager);
    }

    /* renamed from: b */
    public PurchaseProductsViewModel m20682b(C1459l0 c1459l0) {
        PurchaseProductsViewModel m20681c = m20681c(c1459l0, this.f17703a.mo42226get(), this.f17704b.mo42226get(), this.f17705c.mo42226get());
        C13886p.m94a(m20681c, this.f17706d.mo42226get());
        return m20681c;
    }
}
