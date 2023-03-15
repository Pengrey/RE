package p066dg;

import gg.C5652c;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.CatalogService;

/* renamed from: dg.e */
/* loaded from: classes2.dex */
public final class C4818e implements InterfaceC11614c<CategoriesAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<CatalogService> f13190a;

    /* renamed from: b */
    private final InterfaceC12341a<C5652c> f13191b;

    public C4818e(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5652c> interfaceC12341a2) {
        this.f13190a = interfaceC12341a;
        this.f13191b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4818e m26539a(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5652c> interfaceC12341a2) {
        return new C4818e(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static CategoriesAgent m26537c(CatalogService catalogService, C5652c c5652c) {
        return new CategoriesAgent(catalogService, c5652c);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public CategoriesAgent mo42226get() {
        return m26537c(this.f13190a.mo42226get(), this.f13191b.mo42226get());
    }
}
