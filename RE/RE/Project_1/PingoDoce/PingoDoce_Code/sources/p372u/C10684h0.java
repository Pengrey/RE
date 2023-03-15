package p372u;

import androidx.compose.foundation.gestures.EnumC0627a;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p072e1.C4945d;
import p072e1.C4955g;
import p092f0.InterfaceC5242r1;
import p181jd.AbstractC6438m;
import p181jd.C6448x;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10776g;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13624s;
import p479z1.C13626t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* renamed from: u.h0 */
/* loaded from: classes.dex */
public final class C10684h0 {

    /* renamed from: a */
    private final EnumC0627a f27536a;

    /* renamed from: b */
    private final boolean f27537b;

    /* renamed from: c */
    private final InterfaceC5242r1 f27538c;

    /* renamed from: d */
    private final InterfaceC10675f0 f27539d;

    /* renamed from: e */
    private final InterfaceC10754p f27540e;

    /* renamed from: f */
    private final InterfaceC10764v f27541f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollingLogic", m20196f = "Scrollable.kt", m20195l = {304}, m20194m = "doFlingAnimation-QWom1Mo")
    /* renamed from: u.h0$a */
    /* loaded from: classes.dex */
    public static final class C10685a extends AbstractC6757d {

        /* renamed from: w */
        Object f27542w;

        /* renamed from: x */
        /* synthetic */ Object f27543x;

        /* renamed from: z */
        int f27545z;

        C10685a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27543x = obj;
            this.f27545z |= Integer.MIN_VALUE;
            return C10684h0.this.m7331b(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", m20196f = "Scrollable.kt", m20195l = {317}, m20194m = "invokeSuspend")
    /* renamed from: u.h0$b */
    /* loaded from: classes.dex */
    public static final class C10686b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        int f27546A;

        /* renamed from: B */
        private /* synthetic */ Object f27547B;

        /* renamed from: D */
        final /* synthetic */ C6448x f27549D;

        /* renamed from: E */
        final /* synthetic */ long f27550E;

        /* renamed from: x */
        Object f27551x;

        /* renamed from: y */
        Object f27552y;

        /* renamed from: z */
        long f27553z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        /* renamed from: u.h0$b$a */
        /* loaded from: classes.dex */
        public static final class C10687a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ C10684h0 f27554w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10653c0 f27555x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10687a(C10684h0 c10684h0, InterfaceC10653c0 interfaceC10653c0) {
                super(1);
                this.f27554w = c10684h0;
                this.f27555x = interfaceC10653c0;
            }

            /* renamed from: a */
            public final Float m7316a(float f) {
                C10684h0 c10684h0 = this.f27554w;
                return Float.valueOf(f - this.f27554w.m7324i(c10684h0.m7332a(this.f27555x, c10684h0.m7324i(f), null, C4955g.f13756a.m26182b())));
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                return m7316a(((Number) obj).floatValue());
            }
        }

        /* compiled from: Scrollable.kt */
        /* renamed from: u.h0$b$b */
        /* loaded from: classes.dex */
        public static final class C10688b implements InterfaceC10653c0 {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6108l f27556a;

            C10688b(InterfaceC6108l interfaceC6108l) {
                this.f27556a = interfaceC6108l;
            }

            /* renamed from: a */
            public float mo7395a(float f) {
                return ((Number) this.f27556a.mo9587d(Float.valueOf(f))).floatValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10686b(C6448x c6448x, long j, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27549D = c6448x;
            this.f27550E = j;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10686b c10686b = new C10686b(this.f27549D, this.f27550E, interfaceC1886d);
            c10686b.f27547B = obj;
            return c10686b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10653c0 interfaceC10653c0, InterfaceC1886d interfaceC1886d) {
            return ((C10686b) create(interfaceC10653c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            C10684h0 c10684h0;
            C6448x c6448x;
            C10684h0 c10684h02;
            long j;
            m34636d = C2116d.m34636d();
            int i = this.f27546A;
            if (i == 0) {
                C13186n.m1453b(obj);
                C10688b c10688b = new C10688b(new C10687a(C10684h0.this, (InterfaceC10653c0) this.f27547B));
                c10684h0 = C10684h0.this;
                C6448x c6448x2 = this.f27549D;
                long j2 = this.f27550E;
                InterfaceC10754p m7330c = c10684h0.m7330c();
                long j3 = c6448x2.f17532w;
                float m7324i = c10684h0.m7324i(c10684h0.m7322k(j2));
                this.f27547B = c10684h0;
                this.f27551x = c10684h0;
                this.f27552y = c6448x2;
                this.f27553z = j3;
                this.f27546A = 1;
                obj = m7330c.mo7218a(c10688b, m7324i, this);
                if (obj == m34636d) {
                    return m34636d;
                }
                c6448x = c6448x2;
                c10684h02 = c10684h0;
                j = j3;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                j = this.f27553z;
                c6448x = (C6448x) this.f27552y;
                c10684h0 = (C10684h0) this.f27551x;
                c10684h02 = (C10684h0) this.f27547B;
                C13186n.m1453b(obj);
            }
            c6448x.f17532w = c10684h0.m7318o(j, c10684h02.m7324i(((Number) obj).floatValue()));
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollingLogic", m20196f = "Scrollable.kt", m20195l = {292, 294, 296}, m20194m = "onDragStopped")
    /* renamed from: u.h0$c */
    /* loaded from: classes.dex */
    public static final class C10689c extends AbstractC6757d {

        /* renamed from: A */
        int f27557A;

        /* renamed from: w */
        Object f27558w;

        /* renamed from: x */
        long f27559x;

        /* renamed from: y */
        /* synthetic */ Object f27560y;

        C10689c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27560y = obj;
            this.f27557A |= Integer.MIN_VALUE;
            return C10684h0.this.m7326g(0.0f, this);
        }
    }

    public C10684h0(EnumC0627a enumC0627a, boolean z, InterfaceC5242r1 interfaceC5242r1, InterfaceC10675f0 interfaceC10675f0, InterfaceC10754p interfaceC10754p, InterfaceC10764v interfaceC10764v) {
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        Intrinsics.isThisObjectNull(interfaceC5242r1, "nestedScrollDispatcher");
        Intrinsics.isThisObjectNull(interfaceC10675f0, "scrollableState");
        Intrinsics.isThisObjectNull(interfaceC10754p, "flingBehavior");
        this.f27536a = enumC0627a;
        this.f27537b = z;
        this.f27538c = interfaceC5242r1;
        this.f27539d = interfaceC10675f0;
        this.f27540e = interfaceC10754p;
        this.f27541f = interfaceC10764v;
    }

    /* renamed from: a */
    public final float m7332a(InterfaceC10653c0 interfaceC10653c0, float f, C10774f c10774f, int i) {
        Intrinsics.isThisObjectNull(interfaceC10653c0, "$receiver");
        InterfaceC10764v interfaceC10764v = this.f27541f;
        float m7321l = f - (interfaceC10764v == null ? 0.0f : m7321l(interfaceC10764v.mo7192h(m7320m(f), c10774f, i)));
        C4945d c4945d = (C4945d) this.f27538c.getValue();
        float m7321l2 = m7321l - m7321l(c4945d.m26207d(m7320m(m7321l), i));
        float m7324i = m7324i(interfaceC10653c0.mo7395a(m7324i(m7321l2)));
        float f2 = m7321l2 - m7324i;
        long m26209b = c4945d.m26209b(m7320m(m7324i), m7320m(f2), i);
        InterfaceC10764v interfaceC10764v2 = this.f27541f;
        if (interfaceC10764v2 != null) {
            interfaceC10764v2.mo7198b(m7320m(m7321l2), m7320m(f2 - m7321l(m26209b)), c10774f, i);
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7331b(long r13, bd.InterfaceC1886d r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p372u.C10684h0.C10685a
            if (r0 == 0) goto L13
            r0 = r15
            u.h0$a r0 = (p372u.C10684h0.C10685a) r0
            int r1 = r0.f27545z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27545z = r1
            goto L18
        L13:
            u.h0$a r0 = new u.h0$a
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f27543x
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r4.f27545z
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.f27542w
            jd.x r13 = (p181jd.C6448x) r13
            p468yc.C13186n.m1453b(r15)
            goto L5f
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            p468yc.C13186n.m1453b(r15)
            jd.x r15 = new jd.x
            r15.<init>()
            r15.f17532w = r13
            u.f0 r1 = r12.m7327f()
            r3 = 0
            u.h0$b r11 = new u.h0$b
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f27542w = r15
            r4.f27545z = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = p372u.InterfaceC10675f0.C10676a.m7345a(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5e
            return r0
        L5e:
            r13 = r15
        L5f:
            long r13 = r13.f17532w
            z1.s r13 = p479z1.C13624s.m786b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10684h0.m7331b(long, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public final InterfaceC10754p m7330c() {
        return this.f27540e;
    }

    /* renamed from: d */
    public final InterfaceC5242r1 m7329d() {
        return this.f27538c;
    }

    /* renamed from: e */
    public final InterfaceC10764v m7328e() {
        return this.f27541f;
    }

    /* renamed from: f */
    public final InterfaceC10675f0 m7327f() {
        return this.f27539d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7326g(float r10, bd.InterfaceC1886d r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10684h0.m7326g(float, bd.d):java.lang.Object");
    }

    /* renamed from: h */
    public final long m7325h(long j) {
        if (this.f27539d.mo7348a()) {
            return C10774f.f27866b.m7134c();
        }
        return m7320m(m7324i(this.f27539d.mo7346c(m7324i(m7321l(j)))));
    }

    /* renamed from: i */
    public final float m7324i(float f) {
        return this.f27537b ? f * (-1) : f;
    }

    /* renamed from: j */
    public final boolean m7323j() {
        if (!this.f27539d.mo7348a()) {
            InterfaceC10764v interfaceC10764v = this.f27541f;
            if (!(interfaceC10764v == null ? false : interfaceC10764v.mo7193g())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final float m7322k(long j) {
        return this.f27536a == EnumC0627a.Horizontal ? C13624s.m780h(j) : C13624s.m779i(j);
    }

    /* renamed from: l */
    public final float m7321l(long j) {
        return this.f27536a == EnumC0627a.Horizontal ? C10774f.m7145k(j) : C10774f.m7144l(j);
    }

    /* renamed from: m */
    public final long m7320m(float f) {
        if (f == 0.0f) {
            return C10774f.f27866b.m7134c();
        }
        return this.f27536a == EnumC0627a.Horizontal ? C10776g.m7133a(f, 0.0f) : C10776g.m7133a(0.0f, f);
    }

    /* renamed from: n */
    public final long m7319n(float f) {
        return this.f27536a == EnumC0627a.Horizontal ? C13626t.m772a(f, 0.0f) : C13626t.m772a(0.0f, f);
    }

    /* renamed from: o */
    public final long m7318o(long j, float f) {
        return this.f27536a == EnumC0627a.Horizontal ? C13624s.m783e(j, f, 0.0f, 2, null) : C13624s.m783e(j, 0.0f, f, 1, null);
    }
}
