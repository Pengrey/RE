package p066dg;

import bd.InterfaceC1886d;
import eg.ValueAgent;
import gg.C5679u;
import id.InterfaceC6108l;
import p181jd.C6435i;
import p181jd.Intrinsics;
import vg.StoreService;

/* renamed from: dg.z */
/* loaded from: classes2.dex */
public final class StoresAgent extends ValueAgent {

    /* renamed from: h */
    private final StoreService f13275h;

    /* compiled from: StoresAgent.kt */
    /* renamed from: dg.z$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4853a extends C6435i implements InterfaceC6108l {
        C4853a(Object obj) {
            super(1, obj, StoreService.class, "storeList", "storeList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((StoreService) this.f18132x).m5526o(interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoresAgent(StoreService storeService, C5679u c5679u) {
        super(null, c5679u, 1, null);
        Intrinsics.isThisObjectNull(storeService, "storeService");
        Intrinsics.isThisObjectNull(c5679u, "storesLocalDataProvider");
        this.f13275h = storeService;
    }

    /* renamed from: F */
    public InterfaceC6108l m26464F() {
        return new C4853a(this.f13275h);
    }
}
