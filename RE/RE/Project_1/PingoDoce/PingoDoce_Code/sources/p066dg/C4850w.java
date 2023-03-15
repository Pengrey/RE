package p066dg;

import gg.C5673q;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.CatalogService;

/* renamed from: dg.w */
/* loaded from: classes2.dex */
public final class C4850w implements InterfaceC11614c<RecommendationsCatalogResponsesAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<CatalogService> f13270a;

    /* renamed from: b */
    private final InterfaceC12341a<C5673q> f13271b;

    public C4850w(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5673q> interfaceC12341a2) {
        this.f13270a = interfaceC12341a;
        this.f13271b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4850w m26472a(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5673q> interfaceC12341a2) {
        return new C4850w(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static RecommendationsCatalogResponsesAgent m26470c(CatalogService catalogService, C5673q c5673q) {
        return new RecommendationsCatalogResponsesAgent(catalogService, c5673q);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public RecommendationsCatalogResponsesAgent mo42226get() {
        return m26470c(this.f13270a.mo42226get(), this.f13271b.mo42226get());
    }
}
