package p454xl;

import androidx.lifecycle.C1459l0;
import mg.C7347m1;
import mg.C7405s1;
import mg.TransactionCacheManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: xl.d */
/* loaded from: classes2.dex */
public final class C13013d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f33773a;

    /* renamed from: b */
    private final InterfaceC12341a<TransactionCacheManager> f33774b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f33775c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f33776d;

    public C13013d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<TransactionCacheManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f33773a = interfaceC12341a;
        this.f33774b = interfaceC12341a2;
        this.f33775c = interfaceC12341a3;
        this.f33776d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C13013d m1919a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<TransactionCacheManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C13013d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TakeAwayStoreDetailViewModel m1917c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, TransactionCacheManager transactionCacheManager, C7347m1 c7347m1) {
        return new TakeAwayStoreDetailViewModel(c1459l0, resourcesProvider, transactionCacheManager, c7347m1);
    }

    /* renamed from: b */
    public TakeAwayStoreDetailViewModel m1918b(C1459l0 c1459l0) {
        TakeAwayStoreDetailViewModel m1917c = m1917c(c1459l0, this.f33773a.mo42226get(), this.f33774b.mo42226get(), this.f33775c.mo42226get());
        C13886p.m94a(m1917c, this.f33776d.mo42226get());
        return m1917c;
    }
}
