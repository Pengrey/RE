package p066dg;

import bd.InterfaceC1886d;
import eg.ValueAgent;
import id.InterfaceC6108l;
import p181jd.C6435i;
import p181jd.Intrinsics;
import vg.ConsentsService;

/* renamed from: dg.m */
/* loaded from: classes2.dex */
public final class ConsentsAgent extends ValueAgent {

    /* renamed from: h */
    private final ConsentsService f13238h;

    /* renamed from: i */
    private final InterfaceC6108l f13239i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentsAgent.kt */
    /* renamed from: dg.m$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4837a extends C6435i implements InterfaceC6108l {
        C4837a(Object obj) {
            super(1, obj, ConsentsService.class, "consents", "consents(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((ConsentsService) this.f18132x).m5480n(interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentsAgent(ConsentsService consentsService) {
        super(null, null, 3, null);
        Intrinsics.isThisObjectNull(consentsService, "service");
        this.f13238h = consentsService;
        this.f13239i = new C4837a(consentsService);
    }

    /* renamed from: F */
    public InterfaceC6108l m26506F() {
        return this.f13239i;
    }
}
