package p066dg;

import bd.InterfaceC1886d;
import eg.AbstractC5067d;
import gg.C5652c;
import id.InterfaceC6112p;
import p181jd.C6435i;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCategoriesParameters;
import vg.CatalogService;

/* renamed from: dg.d */
/* loaded from: classes2.dex */
public final class CategoriesAgent extends AbstractC5067d {

    /* renamed from: e */
    private final CatalogService f13189e;

    /* compiled from: CategoriesAgent.kt */
    /* renamed from: dg.d$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4817a extends C6435i implements InterfaceC6112p {
        C4817a(Object obj) {
            super(2, obj, CatalogService.class, "searchCategories", "searchCategories(Lpt/pingodoce/app/data/remote/models/request/parameters/SearchCategoriesParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo39856d(SearchCategoriesParameters searchCategoriesParameters, InterfaceC1886d interfaceC1886d) {
            return ((CatalogService) this.f18132x).m5538p(searchCategoriesParameters, interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesAgent(CatalogService catalogService, C5652c c5652c) {
        super(c5652c);
        Intrinsics.isThisObjectNull(catalogService, "catalogService");
        Intrinsics.isThisObjectNull(c5652c, "localDataProvider");
        this.f13189e = catalogService;
    }

    /* renamed from: h */
    public InterfaceC6112p m26541h() {
        return new C4817a(this.f13189e);
    }
}
