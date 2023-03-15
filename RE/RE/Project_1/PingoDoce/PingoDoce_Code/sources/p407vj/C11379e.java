package p407vj;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: vj.e */
/* loaded from: classes2.dex */
public final class C11379e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f29205a;

    /* renamed from: b */
    private final InterfaceC12341a<StoreManager> f29206b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f29207c;

    public C11379e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f29205a = interfaceC12341a;
        this.f29206b = interfaceC12341a2;
        this.f29207c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11379e m5287a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C11379e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static DefaultStoreViewModel m5285c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager) {
        return new DefaultStoreViewModel(c1459l0, resourcesProvider, storeManager);
    }

    /* renamed from: b */
    public DefaultStoreViewModel m5286b(C1459l0 c1459l0) {
        DefaultStoreViewModel m5285c = m5285c(c1459l0, this.f29205a.mo42226get(), this.f29206b.mo42226get());
        C13886p.m94a(m5285c, this.f29207c.mo42226get());
        return m5285c;
    }
}
