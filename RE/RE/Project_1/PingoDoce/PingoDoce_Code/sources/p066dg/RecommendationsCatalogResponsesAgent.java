package p066dg;

import bd.InterfaceC1886d;
import eg.AbstractC5067d;
import gg.C5673q;
import id.InterfaceC6112p;
import p181jd.C6435i;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters;
import vg.CatalogService;

/* renamed from: dg.v */
/* loaded from: classes2.dex */
public final class RecommendationsCatalogResponsesAgent extends AbstractC5067d {

    /* renamed from: e */
    private final CatalogService f13269e;

    /* compiled from: RecommendationsCatalogResponsesAgent.kt */
    /* renamed from: dg.v$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4849a extends C6435i implements InterfaceC6112p {
        C4849a(Object obj) {
            super(2, obj, CatalogService.class, "recommendations", "recommendations(Lpt/pingodoce/app/data/remote/models/request/parameters/RecommendationsParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo39856d(RecommendationsParameters recommendationsParameters, InterfaceC1886d interfaceC1886d) {
            return ((CatalogService) this.f18132x).m5540n(recommendationsParameters, interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsCatalogResponsesAgent(CatalogService catalogService, C5673q c5673q) {
        super(c5673q);
        Intrinsics.isThisObjectNull(catalogService, "catalogService");
        Intrinsics.isThisObjectNull(c5673q, "localDataProvider");
        this.f13269e = catalogService;
    }

    /* renamed from: h */
    public InterfaceC6112p m26474h() {
        return new C4849a(this.f13269e);
    }
}
