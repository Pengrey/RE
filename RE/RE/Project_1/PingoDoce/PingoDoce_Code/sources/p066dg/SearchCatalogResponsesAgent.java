package p066dg;

import bd.InterfaceC1886d;
import eg.AbstractC5067d;
import gg.C5676s;
import id.InterfaceC6112p;
import p181jd.C6435i;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import vg.CatalogService;

/* renamed from: dg.x */
/* loaded from: classes2.dex */
public final class SearchCatalogResponsesAgent extends AbstractC5067d {

    /* renamed from: e */
    private final CatalogService f13272e;

    /* compiled from: SearchCatalogResponsesAgent.kt */
    /* renamed from: dg.x$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4851a extends C6435i implements InterfaceC6112p {
        C4851a(Object obj) {
            super(2, obj, CatalogService.class, "searchCatalog", "searchCatalog(Lpt/pingodoce/app/data/remote/models/request/parameters/SearchCatalogParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo39856d(SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            return ((CatalogService) this.f18132x).m5539o(searchCatalogParameters, interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCatalogResponsesAgent(CatalogService catalogService, C5676s c5676s) {
        super(c5676s);
        Intrinsics.isThisObjectNull(catalogService, "catalogService");
        Intrinsics.isThisObjectNull(c5676s, "localDataProvider");
        this.f13272e = catalogService;
    }

    /* renamed from: h */
    public InterfaceC6112p m26469h() {
        return new C4851a(this.f13272e);
    }
}
