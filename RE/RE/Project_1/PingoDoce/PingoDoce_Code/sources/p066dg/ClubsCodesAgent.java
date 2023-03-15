package p066dg;

import bd.InterfaceC1886d;
import eg.ValueAgent;
import gg.C5655e;
import id.InterfaceC6108l;
import p181jd.C6435i;
import p181jd.Intrinsics;
import vg.ClubService;

/* renamed from: dg.h */
/* loaded from: classes2.dex */
public final class ClubsCodesAgent extends ValueAgent {

    /* renamed from: h */
    private final ClubService f13212h;

    /* compiled from: ClubsCodesAgent.kt */
    /* renamed from: dg.h$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4825a extends C6435i implements InterfaceC6108l {
        C4825a(Object obj) {
            super(1, obj, ClubService.class, "clubSubscribedCodes", "clubSubscribedCodes(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((ClubService) this.f18132x).m5514m(interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClubsCodesAgent(ClubService clubService, C5655e c5655e) {
        super(null, c5655e, 1, null);
        Intrinsics.isThisObjectNull(clubService, "service");
        Intrinsics.isThisObjectNull(c5655e, "localDataProvider");
        this.f13212h = clubService;
    }

    /* renamed from: F */
    public InterfaceC6108l m26527F() {
        return new C4825a(this.f13212h);
    }
}
