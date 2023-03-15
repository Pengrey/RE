package p066dg;

import bd.InterfaceC1886d;
import eg.ValueAgent;
import gg.C5658g;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.C6435i;
import p181jd.Intrinsics;
import vg.ClubService;

/* renamed from: dg.f */
/* loaded from: classes2.dex */
public final class ClubsAgent extends ValueAgent {

    /* renamed from: h */
    private final ClubService f13192h;

    /* compiled from: ClubsAgent.kt */
    /* renamed from: dg.f$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C4819a extends C6435i implements InterfaceC6108l {
        C4819a(Object obj) {
            super(1, obj, ClubService.class, "clubs", "clubs(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((ClubService) this.f18132x).m5513n(interfaceC1886d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubsAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.ClubsAgent", m20196f = "ClubsAgent.kt", m20195l = {20, 21, 22}, m20194m = "markAsExpired$app_prodRelease")
    /* renamed from: dg.f$b */
    /* loaded from: classes2.dex */
    public static final class C4820b extends AbstractC6757d {

        /* renamed from: w */
        Object f13193w;

        /* renamed from: x */
        /* synthetic */ Object f13194x;

        /* renamed from: z */
        int f13196z;

        C4820b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13194x = obj;
            this.f13196z |= Integer.MIN_VALUE;
            return ClubsAgent.this.m26532v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubsAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.ClubsAgent", m20196f = "ClubsAgent.kt", m20195l = {34, 35}, m20194m = "subscribeClub")
    /* renamed from: dg.f$c */
    /* loaded from: classes2.dex */
    public static final class C4821c extends AbstractC6757d {

        /* renamed from: w */
        Object f13197w;

        /* renamed from: x */
        /* synthetic */ Object f13198x;

        /* renamed from: z */
        int f13200z;

        C4821c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13198x = obj;
            this.f13200z |= Integer.MIN_VALUE;
            return ClubsAgent.this.m26535I(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubsAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.ClubsAgent", m20196f = "ClubsAgent.kt", m20195l = {39, 40, 41}, m20194m = "unSubscribeClub")
    /* renamed from: dg.f$d */
    /* loaded from: classes2.dex */
    public static final class C4822d extends AbstractC6757d {

        /* renamed from: w */
        Object f13201w;

        /* renamed from: x */
        /* synthetic */ Object f13202x;

        /* renamed from: z */
        int f13204z;

        C4822d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13202x = obj;
            this.f13204z |= Integer.MIN_VALUE;
            return ClubsAgent.this.m26534J(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubsAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.ClubsAgent", m20196f = "ClubsAgent.kt", m20195l = {26, 27, 30}, m20194m = "updateClub")
    /* renamed from: dg.f$e */
    /* loaded from: classes2.dex */
    public static final class C4823e extends AbstractC6757d {

        /* renamed from: A */
        int f13205A;

        /* renamed from: w */
        Object f13206w;

        /* renamed from: x */
        Object f13207x;

        /* renamed from: y */
        /* synthetic */ Object f13208y;

        C4823e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13208y = obj;
            this.f13205A |= Integer.MIN_VALUE;
            return ClubsAgent.this.m26533K(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClubsAgent(ClubService clubService, C5658g c5658g) {
        super(null, c5658g, 1, null);
        Intrinsics.isThisObjectNull(clubService, "service");
        Intrinsics.isThisObjectNull(c5658g, "localDataProvider");
        this.f13192h = clubService;
    }

    /* renamed from: F */
    public InterfaceC6108l m26536F() {
        return new C4819a(this.f13192h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26535I(pt.pingodoce.app.data.local.models.clubs.Club r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p066dg.ClubsAgent.C4821c
            if (r0 == 0) goto L13
            r0 = r7
            dg.f$c r0 = (p066dg.ClubsAgent.C4821c) r0
            int r1 = r0.f13200z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13200z = r1
            goto L18
        L13:
            dg.f$c r0 = new dg.f$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13198x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13200z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f13197w
            dg.f r6 = (p066dg.ClubsAgent) r6
            p468yc.C13186n.m1453b(r7)
            goto L4d
        L3c:
            p468yc.C13186n.m1453b(r7)
            vg.i r7 = r5.f13192h
            r0.f13197w = r5
            r0.f13200z = r4
            java.lang.Object r6 = r7.m5511p(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            r7 = 0
            r0.f13197w = r7
            r0.f13200z = r3
            java.lang.Object r6 = r6.m26532v(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.ClubsAgent.m26535I(pt.pingodoce.app.data.local.models.clubs.Club, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[RETURN] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26534J(pt.pingodoce.app.data.local.models.clubs.Club r7, bd.InterfaceC1886d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p066dg.ClubsAgent.C4822d
            if (r0 == 0) goto L13
            r0 = r8
            dg.f$d r0 = (p066dg.ClubsAgent.C4822d) r0
            int r1 = r0.f13204z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13204z = r1
            goto L18
        L13:
            dg.f$d r0 = new dg.f$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13202x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13204z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r8)
            goto L76
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f13201w
            dg.f r7 = (p066dg.ClubsAgent) r7
            p468yc.C13186n.m1453b(r8)
            goto L67
        L3f:
            java.lang.Object r7 = r0.f13201w
            dg.f r7 = (p066dg.ClubsAgent) r7
            p468yc.C13186n.m1453b(r8)
            goto L5c
        L47:
            p468yc.C13186n.m1453b(r8)
            vg.i r8 = r6.f13192h
            java.lang.String r7 = r7.m14646m()
            r0.f13201w = r6
            r0.f13204z = r5
            java.lang.Object r7 = r8.m5512o(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r7 = r6
        L5c:
            r0.f13201w = r7
            r0.f13204z = r4
            java.lang.Object r8 = r7.m26532v(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            yc.u r8 = p468yc.C13195u.f34156a
            r2 = 0
            r4 = 0
            r0.f13201w = r4
            r0.f13204z = r3
            java.lang.Object r7 = r7.m25798j(r8, r2, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.ClubsAgent.m26534J(pt.pingodoce.app.data.local.models.clubs.Club, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26533K(pt.pingodoce.app.data.local.models.clubs.Club r9, bd.InterfaceC1886d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p066dg.ClubsAgent.C4823e
            if (r0 == 0) goto L13
            r0 = r10
            dg.f$e r0 = (p066dg.ClubsAgent.C4823e) r0
            int r1 = r0.f13205A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13205A = r1
            goto L18
        L13:
            dg.f$e r0 = new dg.f$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f13208y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13205A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p468yc.C13186n.m1453b(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f13207x
            pt.pingodoce.app.data.local.models.clubs.Club r9 = (pt.pingodoce.app.data.local.models.clubs.Club) r9
            java.lang.Object r2 = r0.f13206w
            dg.f r2 = (p066dg.ClubsAgent) r2
            p468yc.C13186n.m1453b(r10)
            goto L70
        L44:
            java.lang.Object r9 = r0.f13207x
            pt.pingodoce.app.data.local.models.clubs.Club r9 = (pt.pingodoce.app.data.local.models.clubs.Club) r9
            java.lang.Object r2 = r0.f13206w
            dg.f r2 = (p066dg.ClubsAgent) r2
            p468yc.C13186n.m1453b(r10)
            goto L63
        L50:
            p468yc.C13186n.m1453b(r10)
            vg.i r10 = r8.f13192h
            r0.f13206w = r8
            r0.f13207x = r9
            r0.f13205A = r5
            java.lang.Object r10 = r10.m5510q(r9, r0)
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            r0.f13206w = r2
            r0.f13207x = r9
            r0.f13205A = r4
            java.lang.Object r10 = r2.m25742C(r0)
            if (r10 != r1) goto L70
            return r1
        L70:
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.List r10 = p489zc.C13777q.m221p0(r10)
            r4 = 0
            java.util.Iterator r5 = r10.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L99
            java.lang.Object r6 = r5.next()
            pt.pingodoce.app.data.local.models.clubs.Club r6 = (pt.pingodoce.app.data.local.models.clubs.Club) r6
            java.lang.String r6 = r6.m14646m()
            java.lang.String r7 = r9.m14646m()
            boolean r6 = p181jd.Intrinsics.equals(r6, r7)
            if (r6 == 0) goto L96
            goto L9a
        L96:
            int r4 = r4 + 1
            goto L7b
        L99:
            r4 = -1
        L9a:
            r10.set(r4, r9)
            r9 = 0
            r0.f13206w = r9
            r0.f13207x = r9
            r0.f13205A = r3
            java.lang.Object r9 = r2.m25783y(r10, r0)
            if (r9 != r1) goto Lab
            return r1
        Lab:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.ClubsAgent.m26533K(pt.pingodoce.app.data.local.models.clubs.Club, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[RETURN] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m26532v(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p066dg.ClubsAgent.C4820b
            if (r0 == 0) goto L13
            r0 = r7
            dg.f$b r0 = (p066dg.ClubsAgent.C4820b) r0
            int r1 = r0.f13196z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13196z = r1
            goto L18
        L13:
            dg.f$b r0 = new dg.f$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13194x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13196z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r7)
            goto L71
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f13193w
            dg.f r2 = (p066dg.ClubsAgent) r2
            p468yc.C13186n.m1453b(r7)
            goto L65
        L3f:
            java.lang.Object r2 = r0.f13193w
            dg.f r2 = (p066dg.ClubsAgent) r2
            p468yc.C13186n.m1453b(r7)
            goto L56
        L47:
            p468yc.C13186n.m1453b(r7)
            r0.f13193w = r6
            r0.f13196z = r5
            java.lang.Object r7 = super.m25786v(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.util.List r7 = p489zc.C13777q.m237g()
            r0.f13193w = r2
            r0.f13196z = r4
            java.lang.Object r7 = r2.m25782z(r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r7 = 0
            r0.f13193w = r7
            r0.f13196z = r3
            java.lang.Object r7 = super.m25786v(r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.ClubsAgent.m26532v(bd.d):java.lang.Object");
    }
}
