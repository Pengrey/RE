package p431wl;

import androidx.lifecycle.C1459l0;
import mg.C7347m1;
import mg.C7405s1;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wl.e */
/* loaded from: classes2.dex */
public final class C12207e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32203a;

    /* renamed from: b */
    private final InterfaceC12341a<C7347m1> f32204b;

    /* renamed from: c */
    private final InterfaceC12341a<StoreManager> f32205c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f32206d;

    public C12207e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<StoreManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f32203a = interfaceC12341a;
        this.f32204b = interfaceC12341a2;
        this.f32205c = interfaceC12341a3;
        this.f32206d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C12207e m3393a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7347m1> interfaceC12341a2, InterfaceC12341a<StoreManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C12207e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static TakeAwayStoreViewModel m3391c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1, StoreManager storeManager) {
        return new TakeAwayStoreViewModel(c1459l0, resourcesProvider, c7347m1, storeManager);
    }

    /* renamed from: b */
    public TakeAwayStoreViewModel m3392b(C1459l0 c1459l0) {
        TakeAwayStoreViewModel m3391c = m3391c(c1459l0, this.f32203a.mo42226get(), this.f32204b.mo42226get(), this.f32205c.mo42226get());
        C13886p.m94a(m3391c, this.f32206d.mo42226get());
        return m3391c;
    }
}
