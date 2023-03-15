package p372u;

import androidx.compose.foundation.gestures.EnumC0627a;
import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p072e1.C4945d;
import p072e1.C4951f;
import p072e1.NestedScrollModifier;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p093f1.C5280e0;
import p093f1.C5318u;
import p149i1.C5992f;
import p149i1.ModifierLocal;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p373u0.C10774f;
import p392v.InterfaceC10987m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* compiled from: Scrollable.kt */
/* renamed from: u.e0 */
/* loaded from: classes.dex */
public final class C10660e0 {

    /* renamed from: a */
    private static final InterfaceC10653c0 f27472a = new C10662b();

    /* renamed from: b */
    private static final C5992f f27473b = ModifierLocal.m22448a(C10661a.f27474w);

    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$a */
    /* loaded from: classes.dex */
    static final class C10661a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10661a f27474w = new C10661a();

        C10661a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$b */
    /* loaded from: classes.dex */
    public static final class C10662b implements InterfaceC10653c0 {
        C10662b() {
        }

        /* renamed from: a */
        public float mo7395a(float f) {
            return f;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: u.e0$c */
    /* loaded from: classes.dex */
    public static final class C10663c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f27475A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10754p f27476B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC10987m f27477C;

        /* renamed from: w */
        final /* synthetic */ EnumC0627a f27478w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10675f0 f27479x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC10764v f27480y;

        /* renamed from: z */
        final /* synthetic */ boolean f27481z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10663c(EnumC0627a enumC0627a, InterfaceC10675f0 interfaceC10675f0, InterfaceC10764v interfaceC10764v, boolean z, boolean z2, InterfaceC10754p interfaceC10754p, InterfaceC10987m interfaceC10987m) {
            super(1);
            this.f27478w = enumC0627a;
            this.f27479x = interfaceC10675f0;
            this.f27480y = interfaceC10764v;
            this.f27481z = z;
            this.f27475A = z2;
            this.f27476B = interfaceC10754p;
            this.f27477C = interfaceC10987m;
        }

        /* renamed from: a */
        public final void m7366a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("scrollable");
            c0816w0.m39492a().m39649b("orientation", this.f27478w);
            c0816w0.m39492a().m39649b("state", this.f27479x);
            c0816w0.m39492a().m39649b("overScrollController", this.f27480y);
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f27481z));
            c0816w0.m39492a().m39649b("reverseDirection", Boolean.valueOf(this.f27475A));
            c0816w0.m39492a().m39649b("flingBehavior", this.f27476B);
            c0816w0.m39492a().m39649b("interactionSource", this.f27477C);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m7366a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$d */
    /* loaded from: classes.dex */
    public static final class C10664d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ boolean f27482A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10987m f27483B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC10754p f27484C;

        /* renamed from: w */
        final /* synthetic */ InterfaceC10764v f27485w;

        /* renamed from: x */
        final /* synthetic */ EnumC0627a f27486x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC10675f0 f27487y;

        /* renamed from: z */
        final /* synthetic */ boolean f27488z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        /* renamed from: u.e0$d$a */
        /* loaded from: classes.dex */
        public static final class C10665a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC10675f0 f27489w;

            /* renamed from: x */
            final /* synthetic */ boolean f27490x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10665a(InterfaceC10675f0 interfaceC10675f0, boolean z) {
                super(1);
                this.f27489w = interfaceC10675f0;
                this.f27490x = z;
            }

            /* renamed from: a */
            public final void m7362a(float f) {
                this.f27489w.mo7346c(C10664d.m7365a(f, this.f27490x));
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m7362a(((Number) obj).floatValue());
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10664d(InterfaceC10764v interfaceC10764v, EnumC0627a enumC0627a, InterfaceC10675f0 interfaceC10675f0, boolean z, boolean z2, InterfaceC10987m interfaceC10987m, InterfaceC10754p interfaceC10754p) {
            super(3);
            this.f27485w = interfaceC10764v;
            this.f27486x = enumC0627a;
            this.f27487y = interfaceC10675f0;
            this.f27488z = z;
            this.f27482A = z2;
            this.f27483B = interfaceC10987m;
            this.f27484C = interfaceC10754p;
        }

        /* renamed from: a */
        public static final /* synthetic */ float m7365a(float f, boolean z) {
            return m7363c(f, z);
        }

        /* renamed from: c */
        private static final float m7363c(float f, boolean z) {
            return z ? f * (-1) : f;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7364b((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: b */
        public final InterfaceC9570f m7364b(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            InterfaceC9570f interfaceC9570f2;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(536297813);
            InterfaceC10764v interfaceC10764v = this.f27485w;
            InterfaceC9570f m7403a = interfaceC10764v == null ? null : C10645b.m7403a(InterfaceC9570f.f25164r, interfaceC10764v);
            if (m7403a == null) {
                m7403a = InterfaceC9570f.f25164r;
            }
            EnumC0627a enumC0627a = this.f27486x;
            InterfaceC10675f0 interfaceC10675f0 = this.f27487y;
            Boolean valueOf = Boolean.valueOf(this.f27488z);
            EnumC0627a enumC0627a2 = this.f27486x;
            InterfaceC10675f0 interfaceC10675f02 = this.f27487y;
            boolean z = this.f27488z;
            interfaceC5179i.mo25263g(-3686095);
            boolean mo25276I = interfaceC5179i.mo25276I(enumC0627a) | interfaceC5179i.mo25276I(interfaceC10675f0) | interfaceC5179i.mo25276I(valueOf);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C10655e(enumC0627a2, interfaceC10675f02, z);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            C10655e c10655e = (C10655e) mo25262h;
            if (this.f27482A) {
                interfaceC9570f2 = C10760s.f27844w;
            } else {
                interfaceC9570f2 = InterfaceC9570f.f25164r;
            }
            InterfaceC9570f mo7205u = C10652c.m7396a(C10660e0.m7375c(InterfaceC9570f.f25164r.mo7205u(c10655e).mo7205u(m7403a), this.f27483B, this.f27486x, this.f27488z, this.f27487y, this.f27484C, this.f27485w, this.f27482A, interfaceC5179i, 0), this.f27486x, new C10665a(this.f27487y, this.f27488z)).mo7205u(interfaceC9570f2);
            interfaceC5179i.mo25282C();
            return mo7205u;
        }
    }

    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$e */
    /* loaded from: classes.dex */
    public static final class C10666e implements NestedScrollModifier {

        /* renamed from: a */
        final /* synthetic */ boolean f27491a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5242r1 f27492b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", m20196f = "Scrollable.kt", m20195l = {382}, m20194m = "onPostFling-RZ2iAVY")
        /* renamed from: u.e0$e$a */
        /* loaded from: classes.dex */
        public static final class C10667a extends AbstractC6757d {

            /* renamed from: w */
            long f27493w;

            /* renamed from: x */
            /* synthetic */ Object f27494x;

            /* renamed from: z */
            int f27496z;

            C10667a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f27494x = obj;
                this.f27496z |= Integer.MIN_VALUE;
                return C10666e.this.mo26211d(0L, 0L, this);
            }
        }

        C10666e(boolean z, InterfaceC5242r1 interfaceC5242r1) {
            this.f27491a = z;
            this.f27492b = interfaceC5242r1;
        }

        /* renamed from: a */
        public long mo26214a(long j, int i) {
            return NestedScrollModifier.C4940a.m26234b(this, j, i);
        }

        /* renamed from: b */
        public Object mo26213b(long j, InterfaceC1886d interfaceC1886d) {
            return NestedScrollModifier.C4940a.m26235a(this, j, interfaceC1886d);
        }

        /* renamed from: c */
        public long mo26212c(long j, long j2, int i) {
            if (this.f27491a) {
                return ((C10684h0) this.f27492b.getValue()).m7325h(j2);
            }
            return C10774f.f27866b.m7134c();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo26211d(long r3, long r5, bd.InterfaceC1886d r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof p372u.C10660e0.C10666e.C10667a
                if (r3 == 0) goto L13
                r3 = r7
                u.e0$e$a r3 = (p372u.C10660e0.C10666e.C10667a) r3
                int r4 = r3.f27496z
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f27496z = r4
                goto L18
            L13:
                u.e0$e$a r3 = new u.e0$e$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f27494x
                java.lang.Object r7 = cd.C2111b.m34640d()
                int r0 = r3.f27496z
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f27493w
                p468yc.C13186n.m1453b(r4)
                goto L4d
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                p468yc.C13186n.m1453b(r4)
                boolean r4 = r2.f27491a
                if (r4 == 0) goto L58
                f0.r1 r4 = r2.f27492b
                java.lang.Object r4 = r4.getValue()
                u.h0 r4 = (p372u.C10684h0) r4
                r3.f27493w = r5
                r3.f27496z = r1
                java.lang.Object r4 = r4.m7331b(r5, r3)
                if (r4 != r7) goto L4d
                return r7
            L4d:
                z1.s r4 = (p479z1.C13624s) r4
                long r3 = r4.m774n()
                long r3 = p479z1.C13624s.m777k(r5, r3)
                goto L5e
            L58:
                z1.s$a r3 = p479z1.C13624s.f34622b
                long r3 = r3.m773a()
            L5e:
                z1.s r3 = p479z1.C13624s.m786b(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p372u.C10660e0.C10666e.mo26211d(long, long, bd.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$f */
    /* loaded from: classes.dex */
    public static final class C10668f extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ Scrollable f27497w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10668f(Scrollable scrollable) {
            super(2);
            this.f27497w = scrollable;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m7357a((InterfaceC5179i) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final InterfaceC10766x m7357a(InterfaceC5179i interfaceC5179i, int i) {
            interfaceC5179i.mo25263g(-971263152);
            Scrollable scrollable = this.f27497w;
            interfaceC5179i.mo25282C();
            return scrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$g */
    /* loaded from: classes.dex */
    public static final class C10669g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10669g f27498w = new C10669g();

        C10669g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(C5318u c5318u) {
            Intrinsics.isThisObjectNull(c5318u, "down");
            return Boolean.valueOf(!C5280e0.m24806g(c5318u.m24646m(), C5280e0.f14552a.m24802b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* renamed from: u.e0$h */
    /* loaded from: classes.dex */
    public static final class C10670h extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5242r1 f27499w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10670h(InterfaceC5242r1 interfaceC5242r1) {
            super(0);
            this.f27499w = interfaceC5242r1;
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.valueOf(((C10684h0) this.f27499w.getValue()).m7323j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$4", m20196f = "Scrollable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.e0$i */
    /* loaded from: classes.dex */
    public static final class C10671i extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ InterfaceC5242r1 f27500A;

        /* renamed from: x */
        int f27501x;

        /* renamed from: y */
        /* synthetic */ float f27502y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC5220m0 f27503z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollableKt$touchScrollable$4$1", m20196f = "Scrollable.kt", m20195l = {214}, m20194m = "invokeSuspend")
        /* renamed from: u.e0$i$a */
        /* loaded from: classes.dex */
        public static final class C10672a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f27504x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC5242r1 f27505y;

            /* renamed from: z */
            final /* synthetic */ float f27506z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10672a(InterfaceC5242r1 interfaceC5242r1, float f, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27505y = interfaceC5242r1;
                this.f27506z = f;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10672a(this.f27505y, this.f27506z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10672a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27504x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    float f = this.f27506z;
                    this.f27504x = 1;
                    if (((C10684h0) this.f27505y.getValue()).m7326g(f, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10671i(InterfaceC5220m0 interfaceC5220m0, InterfaceC5242r1 interfaceC5242r1, InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
            this.f27503z = interfaceC5220m0;
            this.f27500A = interfaceC5242r1;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7354d((InterfaceC10524i0) obj, ((Number) obj2).floatValue(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m7354d(InterfaceC10524i0 interfaceC10524i0, float f, InterfaceC1886d interfaceC1886d) {
            C10671i c10671i = new C10671i(this.f27503z, this.f27500A, interfaceC1886d);
            c10671i.f27502y = f;
            return c10671i.invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27501x == 0) {
                C13186n.m1453b(obj);
                C6772d.m20158d(((C4945d) this.f27503z.getValue()).m26205f(), null, null, new C10672a(this.f27500A, this.f27502y, null), 3, null);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC10653c0 m7377a() {
        return f27472a;
    }

    /* renamed from: b */
    public static final /* synthetic */ float m7376b(float f, float f2, float f3) {
        return m7373e(f, f2, f3);
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC9570f m7375c(InterfaceC9570f interfaceC9570f, InterfaceC10987m interfaceC10987m, EnumC0627a enumC0627a, boolean z, InterfaceC10675f0 interfaceC10675f0, InterfaceC10754p interfaceC10754p, InterfaceC10764v interfaceC10764v, boolean z2, InterfaceC5179i interfaceC5179i, int i) {
        return m7369i(interfaceC9570f, interfaceC10987m, enumC0627a, z, interfaceC10675f0, interfaceC10754p, interfaceC10764v, z2, interfaceC5179i, i);
    }

    /* renamed from: d */
    public static final C5992f m7374d() {
        return f27473b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final float m7373e(float f, float f2, float f3) {
        if ((f < 0.0f || f2 > f3) && (f >= 0.0f || f2 <= f3)) {
            float f4 = f2 - f3;
            return Math.abs(f) < Math.abs(f4) ? f : f4;
        }
        return 0.0f;
    }

    /* renamed from: f */
    public static final InterfaceC9570f m7372f(InterfaceC9570f interfaceC9570f, InterfaceC10675f0 interfaceC10675f0, EnumC0627a enumC0627a, InterfaceC10764v interfaceC10764v, boolean z, boolean z2, InterfaceC10754p interfaceC10754p, InterfaceC10987m interfaceC10987m) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10675f0, "state");
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10663c(enumC0627a, interfaceC10675f0, interfaceC10764v, z, z2, interfaceC10754p, interfaceC10987m) : C0812v0.m39497a(), new C10664d(interfaceC10764v, enumC0627a, interfaceC10675f0, z2, z, interfaceC10987m, interfaceC10754p));
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC9570f m7371g(InterfaceC9570f interfaceC9570f, InterfaceC10675f0 interfaceC10675f0, EnumC0627a enumC0627a, InterfaceC10764v interfaceC10764v, boolean z, boolean z2, InterfaceC10754p interfaceC10754p, InterfaceC10987m interfaceC10987m, int i, Object obj) {
        return m7372f(interfaceC9570f, interfaceC10675f0, enumC0627a, interfaceC10764v, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : interfaceC10754p, (i & 64) != 0 ? null : interfaceC10987m);
    }

    /* renamed from: h */
    private static final NestedScrollModifier m7370h(InterfaceC5242r1 interfaceC5242r1, boolean z) {
        return new C10666e(z, interfaceC5242r1);
    }

    /* renamed from: i */
    private static final InterfaceC9570f m7369i(InterfaceC9570f interfaceC9570f, InterfaceC10987m interfaceC10987m, EnumC0627a enumC0627a, boolean z, InterfaceC10675f0 interfaceC10675f0, InterfaceC10754p interfaceC10754p, InterfaceC10764v interfaceC10764v, boolean z2, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-773069933);
        interfaceC5179i.mo25263g(-773069624);
        InterfaceC10754p m7391a = interfaceC10754p == null ? C10654d0.f27451a.m7391a(interfaceC5179i, 6) : interfaceC10754p;
        interfaceC5179i.mo25282C();
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
        if (mo25262h == c5180a.m25243a()) {
            mo25262h = C5232o1.m24962d(new C4945d(), null, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        InterfaceC5242r1 m25067k = C5209j1.m25067k(new C10684h0(enumC0627a, z, interfaceC5220m0, interfaceC10675f0, m7391a, interfaceC10764v), interfaceC5179i, 0);
        Boolean valueOf = Boolean.valueOf(z2);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(valueOf);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h2 == c5180a.m25243a()) {
            mo25262h2 = m7370h(m25067k, z2);
            interfaceC5179i.mo25247w(mo25262h2);
        }
        interfaceC5179i.mo25282C();
        NestedScrollModifier nestedScrollModifier = (NestedScrollModifier) mo25262h2;
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h3 = interfaceC5179i.mo25262h();
        if (mo25262h3 == c5180a.m25243a()) {
            mo25262h3 = new Scrollable(m25067k);
            interfaceC5179i.mo25247w(mo25262h3);
        }
        interfaceC5179i.mo25282C();
        InterfaceC9570f m26192a = C4951f.m26192a(C10730m.m7250j(interfaceC9570f, new C10668f((Scrollable) mo25262h3), C10669g.f27498w, enumC0627a, z2, interfaceC10987m, new C10670h(m25067k), null, new C10671i(interfaceC5220m0, m25067k, null), false, 64, null), nestedScrollModifier, (C4945d) interfaceC5220m0.getValue());
        interfaceC5179i.mo25282C();
        return m26192a;
    }
}
