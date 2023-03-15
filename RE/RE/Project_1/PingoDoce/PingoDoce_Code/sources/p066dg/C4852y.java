package p066dg;

import gg.C5676s;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.CatalogService;

/* renamed from: dg.y */
/* loaded from: classes2.dex */
public final class C4852y implements InterfaceC11614c<SearchCatalogResponsesAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<CatalogService> f13273a;

    /* renamed from: b */
    private final InterfaceC12341a<C5676s> f13274b;

    public C4852y(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5676s> interfaceC12341a2) {
        this.f13273a = interfaceC12341a;
        this.f13274b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4852y m26467a(InterfaceC12341a<CatalogService> interfaceC12341a, InterfaceC12341a<C5676s> interfaceC12341a2) {
        return new C4852y(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static SearchCatalogResponsesAgent m26465c(CatalogService catalogService, C5676s c5676s) {
        return new SearchCatalogResponsesAgent(catalogService, c5676s);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SearchCatalogResponsesAgent mo42226get() {
        return m26465c(this.f13273a.mo42226get(), this.f13274b.mo42226get());
    }
}
