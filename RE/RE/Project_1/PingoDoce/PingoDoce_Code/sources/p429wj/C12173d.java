package p429wj;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.StoreManager;
import mg.TransactionCacheManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wj.d */
/* loaded from: classes2.dex */
public final class C12173d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32137a;

    /* renamed from: b */
    private final InterfaceC12341a<TransactionCacheManager> f32138b;

    /* renamed from: c */
    private final InterfaceC12341a<StoreManager> f32139c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f32140d;

    public C12173d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<TransactionCacheManager> interfaceC12341a2, InterfaceC12341a<StoreManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f32137a = interfaceC12341a;
        this.f32138b = interfaceC12341a2;
        this.f32139c = interfaceC12341a3;
        this.f32140d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C12173d m3481a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<TransactionCacheManager> interfaceC12341a2, InterfaceC12341a<StoreManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C12173d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static DefaultStoreDetailViewModel m3479c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, TransactionCacheManager transactionCacheManager, StoreManager storeManager) {
        return new DefaultStoreDetailViewModel(c1459l0, resourcesProvider, transactionCacheManager, storeManager);
    }

    /* renamed from: b */
    public DefaultStoreDetailViewModel m3480b(C1459l0 c1459l0) {
        DefaultStoreDetailViewModel m3479c = m3479c(c1459l0, this.f32137a.mo42226get(), this.f32138b.mo42226get(), this.f32139c.mo42226get());
        C13886p.m94a(m3479c, this.f32140d.mo42226get());
        return m3479c;
    }
}
