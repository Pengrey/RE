package p127h1;

import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p479z1.C13599b;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p479z1.C13617n;
import p479z1.EnumC13618o;

/* renamed from: h1.c0 */
/* loaded from: classes.dex */
public abstract class Placeable implements InterfaceC5808v {

    /* renamed from: w */
    private int f16062w;

    /* renamed from: x */
    private int f16063x;

    /* renamed from: y */
    private long f16064y = C13617n.m819a(0, 0);

    /* renamed from: z */
    private long f16065z = C5761d0.m23141a();

    /* compiled from: Placeable.kt */
    /* renamed from: h1.c0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC5751a {

        /* renamed from: a */
        public static final C5752a f16066a = new C5752a(null);

        /* renamed from: b */
        private static EnumC13618o f16067b = EnumC13618o.Ltr;

        /* renamed from: c */
        private static int f16068c;

        /* compiled from: Placeable.kt */
        /* renamed from: h1.c0$a$a */
        /* loaded from: classes.dex */
        public static final class C5752a extends AbstractC5751a {
            private C5752a() {
            }

            public /* synthetic */ C5752a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: y */
            public static final /* synthetic */ EnumC13618o m23146y(C5752a c5752a) {
                return c5752a.m23148g();
            }

            /* renamed from: z */
            public static final /* synthetic */ int m23145z(C5752a c5752a) {
                return c5752a.m23147h();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* renamed from: g */
            public EnumC13618o m23148g() {
                return AbstractC5751a.m23171b();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* renamed from: h */
            public int m23147h() {
                return AbstractC5751a.m23169d();
            }
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC13618o m23172a(AbstractC5751a abstractC5751a) {
            return abstractC5751a.m23166g();
        }

        /* renamed from: b */
        public static final /* synthetic */ EnumC13618o m23171b() {
            return f16067b;
        }

        /* renamed from: c */
        public static final /* synthetic */ int m23170c(AbstractC5751a abstractC5751a) {
            return abstractC5751a.m23165h();
        }

        /* renamed from: d */
        public static final /* synthetic */ int m23169d() {
            return f16068c;
        }

        /* renamed from: e */
        public static final /* synthetic */ void m23168e(EnumC13618o enumC13618o) {
            f16067b = enumC13618o;
        }

        /* renamed from: f */
        public static final /* synthetic */ void m23167f(int i) {
            f16068c = i;
        }

        /* renamed from: j */
        public static /* synthetic */ void m23163j(AbstractC5751a abstractC5751a, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            abstractC5751a.m23164i(placeable, i, i2, f);
        }

        /* renamed from: l */
        public static /* synthetic */ void m23161l(AbstractC5751a abstractC5751a, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            abstractC5751a.m23162k(placeable, j, f);
        }

        /* renamed from: n */
        public static /* synthetic */ void m23159n(AbstractC5751a abstractC5751a, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            abstractC5751a.m23160m(placeable, i, i2, f);
        }

        /* renamed from: p */
        public static /* synthetic */ void m23157p(AbstractC5751a abstractC5751a, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            abstractC5751a.m23158o(placeable, j, f);
        }

        /* renamed from: r */
        public static /* synthetic */ void m23155r(AbstractC5751a abstractC5751a, Placeable placeable, int i, int i2, float f, InterfaceC6108l interfaceC6108l, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                interfaceC6108l = C5761d0.m23140b();
            }
            abstractC5751a.m23156q(placeable, i, i2, f2, interfaceC6108l);
        }

        /* renamed from: t */
        public static /* synthetic */ void m23153t(AbstractC5751a abstractC5751a, Placeable placeable, long j, float f, InterfaceC6108l interfaceC6108l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                interfaceC6108l = C5761d0.m23140b();
            }
            abstractC5751a.m23154s(placeable, j, f2, interfaceC6108l);
        }

        /* renamed from: v */
        public static /* synthetic */ void m23151v(AbstractC5751a abstractC5751a, Placeable placeable, int i, int i2, float f, InterfaceC6108l interfaceC6108l, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                interfaceC6108l = C5761d0.m23140b();
            }
            abstractC5751a.m23152u(placeable, i, i2, f2, interfaceC6108l);
        }

        /* renamed from: x */
        public static /* synthetic */ void m23149x(AbstractC5751a abstractC5751a, Placeable placeable, long j, float f, InterfaceC6108l interfaceC6108l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                interfaceC6108l = C5761d0.m23140b();
            }
            abstractC5751a.m23150w(placeable, j, f2, interfaceC6108l);
        }

        /* renamed from: g */
        protected abstract EnumC13618o m23166g();

        /* renamed from: h */
        protected abstract int m23165h();

        /* renamed from: i */
        public final void m23164i(Placeable placeable, int i, int i2, float f) {
            Intrinsics.isThisObjectNull(placeable, "<this>");
            long m833a = C13614l.m833a(i, i2);
            long m23186e0 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e0), C13612k.m838i(m833a) + C13612k.m838i(m23186e0)), f, null);
        }

        /* renamed from: k */
        public final void m23162k(Placeable placeable, long j, float f) {
            Intrinsics.isThisObjectNull(placeable, "$receiver");
            long m23186e0 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(j) + C13612k.m839h(m23186e0), C13612k.m838i(j) + C13612k.m838i(m23186e0)), f, null);
        }

        /* renamed from: m */
        public final void m23160m(Placeable placeable, int i, int i2, float f) {
            Intrinsics.isThisObjectNull(placeable, "<this>");
            long m833a = C13614l.m833a(i, i2);
            if (m23172a(this) != EnumC13618o.Ltr && m23170c(this) != 0) {
                long m833a2 = C13614l.m833a((m23170c(this) - C13615m.m824g(Placeable.m23185h0(placeable))) - C13612k.m839h(m833a), C13612k.m838i(m833a));
                long m23186e0 = Placeable.m23186e0(placeable);
                Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a2) + C13612k.m839h(m23186e0), C13612k.m838i(m833a2) + C13612k.m838i(m23186e0)), f, null);
                return;
            }
            long m23186e02 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e02), C13612k.m838i(m833a) + C13612k.m838i(m23186e02)), f, null);
        }

        /* renamed from: o */
        public final void m23158o(Placeable placeable, long j, float f) {
            Intrinsics.isThisObjectNull(placeable, "$receiver");
            if (m23172a(this) != EnumC13618o.Ltr && m23170c(this) != 0) {
                long m833a = C13614l.m833a((m23170c(this) - C13615m.m824g(Placeable.m23185h0(placeable))) - C13612k.m839h(j), C13612k.m838i(j));
                long m23186e0 = Placeable.m23186e0(placeable);
                Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e0), C13612k.m838i(m833a) + C13612k.m838i(m23186e0)), f, null);
                return;
            }
            long m23186e02 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(j) + C13612k.m839h(m23186e02), C13612k.m838i(j) + C13612k.m838i(m23186e02)), f, null);
        }

        /* renamed from: q */
        public final void m23156q(Placeable placeable, int i, int i2, float f, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(placeable, "<this>");
            Intrinsics.isThisObjectNull(interfaceC6108l, "layerBlock");
            long m833a = C13614l.m833a(i, i2);
            if (m23172a(this) != EnumC13618o.Ltr && m23170c(this) != 0) {
                long m833a2 = C13614l.m833a((m23170c(this) - C13615m.m824g(Placeable.m23185h0(placeable))) - C13612k.m839h(m833a), C13612k.m838i(m833a));
                long m23186e0 = Placeable.m23186e0(placeable);
                Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a2) + C13612k.m839h(m23186e0), C13612k.m838i(m833a2) + C13612k.m838i(m23186e0)), f, interfaceC6108l);
                return;
            }
            long m23186e02 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e02), C13612k.m838i(m833a) + C13612k.m838i(m23186e02)), f, interfaceC6108l);
        }

        /* renamed from: s */
        public final void m23154s(Placeable placeable, long j, float f, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(placeable, "$receiver");
            Intrinsics.isThisObjectNull(interfaceC6108l, "layerBlock");
            if (m23172a(this) != EnumC13618o.Ltr && m23170c(this) != 0) {
                long m833a = C13614l.m833a((m23170c(this) - C13615m.m824g(Placeable.m23185h0(placeable))) - C13612k.m839h(j), C13612k.m838i(j));
                long m23186e0 = Placeable.m23186e0(placeable);
                Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e0), C13612k.m838i(m833a) + C13612k.m838i(m23186e0)), f, interfaceC6108l);
                return;
            }
            long m23186e02 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(j) + C13612k.m839h(m23186e02), C13612k.m838i(j) + C13612k.m838i(m23186e02)), f, interfaceC6108l);
        }

        /* renamed from: u */
        public final void m23152u(Placeable placeable, int i, int i2, float f, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(placeable, "<this>");
            Intrinsics.isThisObjectNull(interfaceC6108l, "layerBlock");
            long m833a = C13614l.m833a(i, i2);
            long m23186e0 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(m833a) + C13612k.m839h(m23186e0), C13612k.m838i(m833a) + C13612k.m838i(m23186e0)), f, interfaceC6108l);
        }

        /* renamed from: w */
        public final void m23150w(Placeable placeable, long j, float f, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(placeable, "$receiver");
            Intrinsics.isThisObjectNull(interfaceC6108l, "layerBlock");
            long m23186e0 = Placeable.m23186e0(placeable);
            Placeable.m23184j0(placeable, C13614l.m833a(C13612k.m839h(j) + C13612k.m839h(m23186e0), C13612k.m838i(j) + C13612k.m838i(m23186e0)), f, interfaceC6108l);
        }
    }

    /* renamed from: e0 */
    public static final /* synthetic */ long m23186e0(Placeable placeable) {
        return placeable.m23183k0();
    }

    /* renamed from: h0 */
    public static final /* synthetic */ long m23185h0(Placeable placeable) {
        return placeable.m23180n0();
    }

    /* renamed from: j0 */
    public static final /* synthetic */ void m23184j0(Placeable placeable, long j, float f, InterfaceC6108l interfaceC6108l) {
        placeable.m23176r0(j, f, interfaceC6108l);
    }

    /* renamed from: s0 */
    private final void m23175s0() {
        int m14996m;
        int m14996m2;
        m14996m = _Ranges.m14996m(C13615m.m824g(m23180n0()), C13599b.m914p(m23178p0()), C13599b.m916n(m23178p0()));
        this.f16062w = m14996m;
        m14996m2 = _Ranges.m14996m(C13615m.m825f(m23180n0()), C13599b.m915o(m23178p0()), C13599b.m917m(m23178p0()));
        this.f16063x = m14996m2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public final long m23183k0() {
        return C13614l.m833a((this.f16062w - C13615m.m824g(m23180n0())) / 2, (this.f16063x - C13615m.m825f(m23180n0())) / 2);
    }

    /* renamed from: l0 */
    public final int m23182l0() {
        return this.f16063x;
    }

    /* renamed from: m0 */
    public int m23181m0() {
        return C13615m.m825f(m23180n0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public final long m23180n0() {
        return this.f16064y;
    }

    /* renamed from: o0 */
    public int m23179o0() {
        return C13615m.m824g(m23180n0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public final long m23178p0() {
        return this.f16065z;
    }

    /* renamed from: q0 */
    public final int m23177q0() {
        return this.f16062w;
    }

    /* renamed from: r0 */
    protected abstract void m23176r0(long j, float f, InterfaceC6108l interfaceC6108l);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t0 */
    public final void m23174t0(long j) {
        if (C13615m.m826e(this.f16064y, j)) {
            return;
        }
        this.f16064y = j;
        m23175s0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u0 */
    public final void m23173u0(long j) {
        if (C13599b.m923g(this.f16065z, j)) {
            return;
        }
        this.f16065z = j;
        m23175s0();
    }
}
