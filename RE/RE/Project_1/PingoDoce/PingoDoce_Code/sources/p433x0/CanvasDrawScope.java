package p433x0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10769a;
import p373u0.C10774f;
import p373u0.C10781l;
import p393v0.AbstractC11057s;
import p393v0.C11007d0;
import p393v0.C11012e1;
import p393v0.C11018f1;
import p393v0.C11028i;
import p393v0.C11047p;
import p393v0.C11049p0;
import p393v0.Color;
import p393v0.ColorFilter;
import p393v0.InterfaceC11025h0;
import p393v0.InterfaceC11046o0;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p433x0.DrawScope;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {

    /* renamed from: w */
    private final C12234a f32273w = new C12234a(null, null, null, 0, 15, null);

    /* renamed from: x */
    private final InterfaceC12239d f32274x = new C12235b();

    /* renamed from: y */
    private InterfaceC11046o0 f32275y;

    /* renamed from: z */
    private InterfaceC11046o0 f32276z;

    /* compiled from: CanvasDrawScope.kt */
    /* renamed from: x0.a$b */
    /* loaded from: classes.dex */
    public static final class C12235b implements InterfaceC12239d {

        /* renamed from: a */
        private final InterfaceC12243g f32281a = C12236b.m3281a(this);

        C12235b() {
        }

        /* renamed from: a */
        public long mo3276a() {
            return CanvasDrawScope.this.m3299q().m3286h();
        }

        /* renamed from: b */
        public InterfaceC11064u mo3275b() {
            return CanvasDrawScope.this.m3299q().m3289e();
        }

        /* renamed from: c */
        public InterfaceC12243g mo3274c() {
            return this.f32281a;
        }

        /* renamed from: d */
        public void mo3273d(long j) {
            CanvasDrawScope.this.m3299q().m3282l(j);
        }
    }

    /* renamed from: k */
    private final InterfaceC11046o0 m3303k(long j, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i, int i2) {
        InterfaceC11046o0 m3294y = m3294y(abstractC12242f);
        long m3297t = m3297t(j, f);
        if (!Color.m6646n(m3294y.mo6408a(), m3297t)) {
            m3294y.mo6394o(m3297t);
        }
        if (m3294y.mo6389t() != null) {
            m3294y.mo6390s(null);
        }
        if (!Intrinsics.equals(m3294y.mo6393p(), colorFilter)) {
            m3294y.mo6404e(colorFilter);
        }
        if (!C11047p.m6380E(m3294y.mo6385x(), i)) {
            m3294y.mo6396m(i);
        }
        if (!C11007d0.m6559d(m3294y.mo6403f(), i2)) {
            m3294y.mo6405d(i2);
        }
        return m3294y;
    }

    /* renamed from: n */
    static /* synthetic */ InterfaceC11046o0 m3302n(CanvasDrawScope canvasDrawScope, long j, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        return canvasDrawScope.m3303k(j, abstractC12242f, f, colorFilter, i, (i3 & 32) != 0 ? DrawScope.f32285u.m3260b() : i2);
    }

    /* renamed from: o */
    private final InterfaceC11046o0 m3301o(AbstractC11057s abstractC11057s, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i, int i2) {
        InterfaceC11046o0 m3294y = m3294y(abstractC12242f);
        if (abstractC11057s != null) {
            abstractC11057s.mo6293a(m3306a(), m3294y, f);
        } else {
            if (!(m3294y.mo6398k() == f)) {
                m3294y.mo6406c(f);
            }
        }
        if (!Intrinsics.equals(m3294y.mo6393p(), colorFilter)) {
            m3294y.mo6404e(colorFilter);
        }
        if (!C11047p.m6380E(m3294y.mo6385x(), i)) {
            m3294y.mo6396m(i);
        }
        if (!C11007d0.m6559d(m3294y.mo6403f(), i2)) {
            m3294y.mo6405d(i2);
        }
        return m3294y;
    }

    /* renamed from: p */
    static /* synthetic */ InterfaceC11046o0 m3300p(CanvasDrawScope canvasDrawScope, AbstractC11057s abstractC11057s, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.f32285u.m3260b();
        }
        return canvasDrawScope.m3301o(abstractC11057s, abstractC12242f, f, colorFilter, i, i2);
    }

    /* renamed from: t */
    private final long m3297t(long j, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? Color.m6648l(j, Color.m6645o(j) * f, 0.0f, 0.0f, 0.0f, 14, null) : j;
    }

    /* renamed from: u */
    private final InterfaceC11046o0 m3296u() {
        InterfaceC11046o0 interfaceC11046o0 = this.f32275y;
        if (interfaceC11046o0 == null) {
            InterfaceC11046o0 m6475a = C11028i.m6475a();
            m6475a.mo6397l(C11049p0.f28431a.m6319a());
            this.f32275y = m6475a;
            return m6475a;
        }
        return interfaceC11046o0;
    }

    /* renamed from: x */
    private final InterfaceC11046o0 m3295x() {
        InterfaceC11046o0 interfaceC11046o0 = this.f32276z;
        if (interfaceC11046o0 == null) {
            InterfaceC11046o0 m6475a = C11028i.m6475a();
            m6475a.mo6397l(C11049p0.f28431a.m6318b());
            this.f32276z = m6475a;
            return m6475a;
        }
        return interfaceC11046o0;
    }

    /* renamed from: y */
    private final InterfaceC11046o0 m3294y(AbstractC12242f abstractC12242f) {
        if (Intrinsics.equals(abstractC12242f, C12245i.f32289a)) {
            return m3296u();
        }
        if (abstractC12242f instanceof C12246j) {
            InterfaceC11046o0 m3295x = m3295x();
            C12246j c12246j = (C12246j) abstractC12242f;
            if (!(m3295x.mo6386w() == c12246j.m3220e())) {
                m3295x.mo6388u(c12246j.m3220e());
            }
            if (!C11012e1.m6541g(m3295x.mo6401h(), c12246j.m3224a())) {
                m3295x.mo6400i(c12246j.m3224a());
            }
            if (!(m3295x.mo6395n() == c12246j.m3222c())) {
                m3295x.mo6387v(c12246j.m3222c());
            }
            if (!C11018f1.m6518g(m3295x.mo6407b(), c12246j.m3223b())) {
                m3295x.mo6399j(c12246j.m3223b());
            }
            if (!Intrinsics.equals(m3295x.mo6392q(), c12246j.m3221d())) {
                m3295x.mo6402g(c12246j.m3221d());
            }
            return m3295x;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: A */
    public float m3319A(float f) {
        return DrawScope.C12241b.m3248l(this, f);
    }

    /* renamed from: B */
    public InterfaceC12239d m3318B() {
        return this.f32274x;
    }

    /* renamed from: D */
    public void m3317D(long j, float f, long j2, float f2, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6266k(j2, f, m3302n(this, j, abstractC12242f, f2, colorFilter, i, 0, 32, null));
    }

    /* renamed from: E */
    public void m3316E(InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2) {
        Intrinsics.isThisObjectNull(interfaceC11025h0, "image");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6268i(interfaceC11025h0, j, j2, j3, j4, m3301o(null, abstractC12242f, f, colorFilter, i, i2));
    }

    /* renamed from: H */
    public void m3315H(InterfaceC11052q0 interfaceC11052q0, long j, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6262o(interfaceC11052q0, m3302n(this, j, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: M */
    public void m3314M(AbstractC11057s abstractC11057s, long j, long j2, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6273d(C10774f.m7145k(j), C10774f.m7144l(j), C10774f.m7145k(j) + C10781l.m7091i(j2), C10774f.m7144l(j) + C10781l.m7093g(j2), m3300p(this, abstractC11057s, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: N */
    public void m3313N(InterfaceC11052q0 interfaceC11052q0, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6262o(interfaceC11052q0, m3300p(this, abstractC11057s, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: O */
    public int m3312O(float f) {
        return DrawScope.C12241b.m3251i(this, f);
    }

    /* renamed from: Q */
    public long m3311Q() {
        return DrawScope.C12241b.m3254f(this);
    }

    /* renamed from: R */
    public void m3310R(long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6273d(C10774f.m7145k(j2), C10774f.m7144l(j2), C10774f.m7145k(j2) + C10781l.m7091i(j3), C10774f.m7144l(j2) + C10781l.m7093g(j3), m3302n(this, j, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: U */
    public long m3309U(long j) {
        return DrawScope.C12241b.m3247m(this, j);
    }

    /* renamed from: X */
    public void m3308X(AbstractC11057s abstractC11057s, long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC11057s, "brush");
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6272e(C10774f.m7145k(j), C10774f.m7144l(j), C10774f.m7145k(j) + C10781l.m7091i(j2), C10774f.m7144l(j) + C10781l.m7093g(j2), C10769a.m7175d(j3), C10769a.m7174e(j3), m3300p(this, abstractC11057s, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    /* renamed from: Y */
    public float m3307Y(long j) {
        return DrawScope.C12241b.m3249k(this, j);
    }

    /* renamed from: a */
    public long m3306a() {
        return DrawScope.C12241b.m3253g(this);
    }

    /* renamed from: d0 */
    public void m3305d0(long j, long j2, long j3, long j4, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i) {
        Intrinsics.isThisObjectNull(abstractC12242f, "style");
        this.f32273w.m3289e().m6272e(C10774f.m7145k(j2), C10774f.m7144l(j2), C10774f.m7145k(j2) + C10781l.m7091i(j3), C10774f.m7144l(j2) + C10781l.m7093g(j3), C10769a.m7175d(j4), C10769a.m7174e(j4), m3302n(this, j, abstractC12242f, f, colorFilter, i, 0, 32, null));
    }

    public float getDensity() {
        return this.f32273w.m3288f().getDensity();
    }

    public EnumC13618o getLayoutDirection() {
        return this.f32273w.m3287g();
    }

    /* renamed from: i0 */
    public float m3304i0(int i) {
        return DrawScope.C12241b.m3250j(this, i);
    }

    /* renamed from: q */
    public final C12234a m3299q() {
        return this.f32273w;
    }

    /* renamed from: r */
    public float m3298r() {
        return this.f32273w.m3288f().m894r();
    }

    /* compiled from: CanvasDrawScope.kt */
    /* renamed from: x0.a$a */
    /* loaded from: classes.dex */
    public static final class C12234a {

        /* renamed from: a */
        private Density f32277a;

        /* renamed from: b */
        private EnumC13618o f32278b;

        /* renamed from: c */
        private InterfaceC11064u f32279c;

        /* renamed from: d */
        private long f32280d;

        private C12234a(Density density, EnumC13618o enumC13618o, InterfaceC11064u interfaceC11064u, long j) {
            this.f32277a = density;
            this.f32278b = enumC13618o;
            this.f32279c = interfaceC11064u;
            this.f32280d = j;
        }

        public /* synthetic */ C12234a(Density density, EnumC13618o enumC13618o, InterfaceC11064u interfaceC11064u, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, enumC13618o, interfaceC11064u, j);
        }

        /* renamed from: a */
        public final Density m3293a() {
            return this.f32277a;
        }

        /* renamed from: b */
        public final EnumC13618o m3292b() {
            return this.f32278b;
        }

        /* renamed from: c */
        public final InterfaceC11064u m3291c() {
            return this.f32279c;
        }

        /* renamed from: d */
        public final long m3290d() {
            return this.f32280d;
        }

        /* renamed from: e */
        public final InterfaceC11064u m3289e() {
            return this.f32279c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12234a) {
                C12234a c12234a = (C12234a) obj;
                return Intrinsics.equals(this.f32277a, c12234a.f32277a) && this.f32278b == c12234a.f32278b && Intrinsics.equals(this.f32279c, c12234a.f32279c) && C10781l.m7094f(this.f32280d, c12234a.f32280d);
            }
            return false;
        }

        /* renamed from: f */
        public final Density m3288f() {
            return this.f32277a;
        }

        /* renamed from: g */
        public final EnumC13618o m3287g() {
            return this.f32278b;
        }

        /* renamed from: h */
        public final long m3286h() {
            return this.f32280d;
        }

        public int hashCode() {
            return (((((this.f32277a.hashCode() * 31) + this.f32278b.hashCode()) * 31) + this.f32279c.hashCode()) * 31) + C10781l.m7090j(this.f32280d);
        }

        /* renamed from: i */
        public final void m3285i(InterfaceC11064u interfaceC11064u) {
            Intrinsics.isThisObjectNull(interfaceC11064u, "<set-?>");
            this.f32279c = interfaceC11064u;
        }

        /* renamed from: j */
        public final void m3284j(Density density) {
            Intrinsics.isThisObjectNull(density, "<set-?>");
            this.f32277a = density;
        }

        /* renamed from: k */
        public final void m3283k(EnumC13618o enumC13618o) {
            Intrinsics.isThisObjectNull(enumC13618o, "<set-?>");
            this.f32278b = enumC13618o;
        }

        /* renamed from: l */
        public final void m3282l(long j) {
            this.f32280d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.f32277a + ", layoutDirection=" + this.f32278b + ", canvas=" + this.f32279c + ", size=" + ((Object) C10781l.m7089k(this.f32280d)) + ')';
        }

        public /* synthetic */ C12234a(Density density, EnumC13618o enumC13618o, InterfaceC11064u interfaceC11064u, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C12236b.m3280b() : density, (i & 2) != 0 ? EnumC13618o.Ltr : enumC13618o, (i & 4) != 0 ? new EmptyCanvas() : interfaceC11064u, (i & 8) != 0 ? C10781l.f27885b.m7086b() : j, null);
        }
    }
}
