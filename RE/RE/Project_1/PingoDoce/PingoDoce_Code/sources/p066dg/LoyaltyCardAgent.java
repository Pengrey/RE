package p066dg;

import bd.InterfaceC1886d;
import eg.ValueAgent;
import gg.C5670o;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.C6435i;
import p181jd.Intrinsics;
import vg.LoyaltyCardService;

/* renamed from: dg.s */
/* loaded from: classes2.dex */
public final class LoyaltyCardAgent extends ValueAgent {

    /* renamed from: h */
    private final LoyaltyCardService f13259h;

    /* renamed from: i */
    private final C5670o f13260i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.LoyaltyCardAgent", m20196f = "LoyaltyCardAgent.kt", m20195l = {24, 26, 27, 28}, m20194m = "get")
    /* renamed from: dg.s$a */
    /* loaded from: classes2.dex */
    public static final class C4845a extends AbstractC6757d {

        /* renamed from: w */
        Object f13261w;

        /* renamed from: x */
        /* synthetic */ Object f13262x;

        /* renamed from: z */
        int f13264z;

        C4845a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13262x = obj;
            this.f13264z |= Integer.MIN_VALUE;
            return LoyaltyCardAgent.this.m26484C(this);
        }
    }

    /* compiled from: LoyaltyCardAgent.kt */
    /* renamed from: dg.s$b */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4846b extends C6435i implements InterfaceC6108l {
        C4846b(Object obj) {
            super(1, obj, LoyaltyCardService.class, "cardStatus", "cardStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((LoyaltyCardService) this.f18132x).m5427m(interfaceC1886d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardAgent(LoyaltyCardService loyaltyCardService, C5670o c5670o) {
        super(null, c5670o, 1, null);
        Intrinsics.isThisObjectNull(loyaltyCardService, "service");
        Intrinsics.isThisObjectNull(c5670o, "localDataProvider");
        this.f13259h = loyaltyCardService;
        this.f13260i = c5670o;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[PHI: r1 
      PHI: (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:37:0x00bb, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m26484C(bd.InterfaceC1886d r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1 instanceof p066dg.LoyaltyCardAgent.C4845a
            if (r2 == 0) goto L17
            r2 = r1
            dg.s$a r2 = (p066dg.LoyaltyCardAgent.C4845a) r2
            int r3 = r2.f13264z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f13264z = r3
            goto L1c
        L17:
            dg.s$a r2 = new dg.s$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f13262x
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f13264z
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L57
            if (r4 == r8) goto L4f
            if (r4 == r7) goto L47
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            p468yc.C13186n.m1453b(r1)
            goto Lbe
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            java.lang.Object r4 = r2.f13261w
            dg.s r4 = (p066dg.LoyaltyCardAgent) r4
            p468yc.C13186n.m1453b(r1)
            goto Lb2
        L47:
            java.lang.Object r4 = r2.f13261w
            dg.s r4 = (p066dg.LoyaltyCardAgent) r4
            p468yc.C13186n.m1453b(r1)
            goto L75
        L4f:
            java.lang.Object r4 = r2.f13261w
            dg.s r4 = (p066dg.LoyaltyCardAgent) r4
            p468yc.C13186n.m1453b(r1)     // Catch: p339rg.CardNotFoundException -> L6a
            goto L66
        L57:
            p468yc.C13186n.m1453b(r1)
            r2.f13261w = r0     // Catch: p339rg.CardNotFoundException -> L69
            r2.f13264z = r8     // Catch: p339rg.CardNotFoundException -> L69
            java.lang.Object r1 = super.m25742C(r2)     // Catch: p339rg.CardNotFoundException -> L69
            if (r1 != r3) goto L65
            return r3
        L65:
            r4 = r0
        L66:
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard r1 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r1     // Catch: p339rg.CardNotFoundException -> L6a
            return r1
        L69:
            r4 = r0
        L6a:
            r2.f13261w = r4
            r2.f13264z = r7
            java.lang.Object r1 = r4.m25801g(r2)
            if (r1 != r3) goto L75
            return r3
        L75:
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard r1 = new pt.pingodoce.app.data.remote.models.response.LoyaltyCard
            r7 = r1
            r8 = 0
            r9 = 0
            r10 = 0
            pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus r11 = pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus.NOT_REGISTERED
            java.lang.String r11 = r11.toString()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 2097143(0x1ffff7, float:2.938723E-39)
            r30 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.f13261w = r4
            r2.f13264z = r6
            java.lang.Object r1 = r4.m25783y(r1, r2)
            if (r1 != r3) goto Lb2
            return r3
        Lb2:
            r1 = 0
            r2.f13261w = r1
            r2.f13264z = r5
            java.lang.Object r1 = super.m25742C(r2)
            if (r1 != r3) goto Lbe
            return r3
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.LoyaltyCardAgent.m26484C(bd.d):java.lang.Object");
    }

    /* renamed from: F */
    public InterfaceC6108l m26483F() {
        return new C4846b(this.f13259h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public C5670o m26480r() {
        return this.f13260i;
    }
}
