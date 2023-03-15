package p048cj;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import mg.TransactionCacheManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: cj.j */
/* loaded from: classes2.dex */
public final class C2166j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f6227a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f6228b;

    /* renamed from: c */
    private final InterfaceC12341a<TransactionCacheManager> f6229c;

    /* renamed from: d */
    private final InterfaceC12341a<C7310l> f6230d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f6231e;

    public C2166j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<TransactionCacheManager> interfaceC12341a3, InterfaceC12341a<C7310l> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f6227a = interfaceC12341a;
        this.f6228b = interfaceC12341a2;
        this.f6229c = interfaceC12341a3;
        this.f6230d = interfaceC12341a4;
        this.f6231e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C2166j m34544a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<TransactionCacheManager> interfaceC12341a3, InterfaceC12341a<C7310l> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C2166j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static ProductDetailViewModel m34542c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, TransactionCacheManager transactionCacheManager, C7310l c7310l) {
        return new ProductDetailViewModel(c1459l0, resourcesProvider, c7256f1, transactionCacheManager, c7310l);
    }

    /* renamed from: b */
    public ProductDetailViewModel m34543b(C1459l0 c1459l0) {
        ProductDetailViewModel m34542c = m34542c(c1459l0, this.f6227a.mo42226get(), this.f6228b.mo42226get(), this.f6229c.mo42226get(), this.f6230d.mo42226get());
        C13886p.m94a(m34542c, this.f6231e.mo42226get());
        return m34542c;
    }
}
