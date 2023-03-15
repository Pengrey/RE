package p066dg;

import gg.C5667m;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.CatalogService;

/* renamed from: dg.r */
/* loaded from: classes2.dex */
public final class C4844r implements InterfaceC11614c<FlyersAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<CatalogService> f13257a;

    /* renamed from: b */
    private final InterfaceC12341a<C5667m> f13258b;

    public C4844r(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5667m> interfaceC12341a2) {
        this.f13257a = interfaceC12341a;
        this.f13258b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4844r m26487a(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5667m> interfaceC12341a2) {
        return new C4844r(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static FlyersAgent m26485c(CatalogService catalogService, C5667m c5667m) {
        return new FlyersAgent(catalogService, c5667m);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public FlyersAgent mo42226get() {
        return m26485c(this.f13257a.mo42226get(), this.f13258b.mo42226get());
    }
}
