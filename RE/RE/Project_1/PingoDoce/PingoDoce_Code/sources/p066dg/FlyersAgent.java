package p066dg;

import bd.InterfaceC1886d;
import eg.AbstractC5067d;
import gg.C5667m;
import id.InterfaceC6112p;
import p181jd.C6435i;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchFlyersParameters;
import vg.CatalogService;

/* renamed from: dg.q */
/* loaded from: classes2.dex */
public final class FlyersAgent extends AbstractC5067d {

    /* renamed from: e */
    private final CatalogService f13255e;

    /* renamed from: f */
    private final long f13256f;

    /* compiled from: FlyersAgent.kt */
    /* renamed from: dg.q$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4843a extends C6435i implements InterfaceC6112p {
        C4843a(Object obj) {
            super(2, obj, CatalogService.class, "searchFlyers", "searchFlyers(Lpt/pingodoce/app/data/remote/models/request/parameters/SearchFlyersParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo39856d(SearchFlyersParameters searchFlyersParameters, InterfaceC1886d interfaceC1886d) {
            return ((CatalogService) this.f18132x).m5537q(searchFlyersParameters, interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyersAgent(CatalogService catalogService, C5667m c5667m) {
        super(c5667m);
        Intrinsics.isThisObjectNull(catalogService, "service");
        Intrinsics.isThisObjectNull(c5667m, "localDataProvider");
        this.f13255e = catalogService;
        this.f13256f = 600L;
    }

    /* renamed from: h */
    public InterfaceC6112p m26490h() {
        return new C4843a(this.f13255e);
    }

    /* renamed from: j */
    public long m26489j() {
        return this.f13256f;
    }
}
