package androidx.compose.p018ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p169j1.InterfaceC6250e0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10773d;
import p373u0.C10774f;
import p373u0.C10783m;
import p393v0.AbstractC11073x0;
import p393v0.C11002c;
import p393v0.C11022g1;
import p393v0.C11028i;
import p393v0.C11068v;
import p393v0.InterfaceC11001b1;
import p393v0.InterfaceC11046o0;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p393v0.RectangleShape;
import p468yc.C13195u;
import p479z1.C13612k;
import p479z1.C13615m;
import p479z1.Density;
import p479z1.EnumC13618o;

/* compiled from: RenderNodeLayer.android.kt */
/* renamed from: androidx.compose.ui.platform.f1 */
/* loaded from: classes.dex */
public final class C0714f1 implements InterfaceC6250e0 {

    /* renamed from: I */
    private static final InterfaceC6112p f2243I;

    /* renamed from: A */
    private final C0688b1 f2244A;

    /* renamed from: B */
    private boolean f2245B;

    /* renamed from: C */
    private boolean f2246C;

    /* renamed from: D */
    private InterfaceC11046o0 f2247D;

    /* renamed from: E */
    private final LayerMatrixCache f2248E;

    /* renamed from: F */
    private final C11068v f2249F;

    /* renamed from: G */
    private long f2250G;

    /* renamed from: H */
    private final InterfaceC0756n0 f2251H;

    /* renamed from: w */
    private final AndroidComposeView f2252w;

    /* renamed from: x */
    private InterfaceC6108l f2253x;

    /* renamed from: y */
    private InterfaceC6097a f2254y;

    /* renamed from: z */
    private boolean f2255z;

    /* compiled from: RenderNodeLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.f1$a */
    /* loaded from: classes.dex */
    static final class C0715a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C0715a f2256w = new C0715a();

        C0715a() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39756a((InterfaceC0756n0) obj, (Matrix) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39756a(InterfaceC0756n0 interfaceC0756n0, Matrix matrix) {
            Intrinsics.isThisObjectNull(interfaceC0756n0, "rn");
            Intrinsics.isThisObjectNull(matrix, "matrix");
            interfaceC0756n0.mo39677H(matrix);
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    /* renamed from: androidx.compose.ui.platform.f1$b */
    /* loaded from: classes.dex */
    public static final class C0716b {
        private C0716b() {
        }

        public /* synthetic */ C0716b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0716b(null);
        f2243I = C0715a.f2256w;
    }

    public C0714f1(AndroidComposeView androidComposeView, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        InterfaceC0756n0 c0698c1;
        Intrinsics.isThisObjectNull(androidComposeView, "ownerView");
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        Intrinsics.isThisObjectNull(interfaceC6097a, "invalidateParentLayer");
        this.f2252w = androidComposeView;
        this.f2253x = interfaceC6108l;
        this.f2254y = interfaceC6097a;
        this.f2244A = new C0688b1(androidComposeView.getDensity());
        this.f2248E = new LayerMatrixCache(f2243I);
        this.f2249F = new C11068v();
        this.f2250G = C11022g1.f28371b.m6480a();
        if (Build.VERSION.SDK_INT >= 29) {
            c0698c1 = new C0703d1(androidComposeView);
        } else {
            c0698c1 = new C0698c1(androidComposeView);
        }
        c0698c1.mo39680E(true);
        this.f2251H = c0698c1;
    }

    /* renamed from: k */
    private final void m39759k(InterfaceC11064u interfaceC11064u) {
        if (this.f2251H.mo39683B() || this.f2251H.mo39660p()) {
            this.f2244A.m39824a(interfaceC11064u);
        }
    }

    /* renamed from: l */
    private final void m39758l(boolean z) {
        if (z != this.f2255z) {
            this.f2255z = z;
            this.f2252w.m39901Y(this, z);
        }
    }

    /* renamed from: m */
    private final void m39757m() {
        if (Build.VERSION.SDK_INT >= 26) {
            C0844z1.f2478a.m39449a(this.f2252w);
        } else {
            this.f2252w.invalidate();
        }
    }

    /* renamed from: a */
    public void mo21676a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11001b1 interfaceC11001b1, boolean z, AbstractC11073x0 abstractC11073x0, EnumC13618o enumC13618o, Density density) {
        InterfaceC6097a interfaceC6097a;
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(density, "density");
        this.f2250G = j;
        boolean z2 = true;
        boolean z3 = this.f2251H.mo39683B() && !this.f2244A.m39821d();
        this.f2251H.mo39669g(f);
        this.f2251H.mo39666j(f2);
        this.f2251H.mo39673c(f3);
        this.f2251H.mo39667i(f4);
        this.f2251H.mo39670f(f5);
        this.f2251H.mo39650z(f6);
        this.f2251H.mo39671e(f9);
        this.f2251H.mo39663m(f7);
        this.f2251H.mo39672d(f8);
        this.f2251H.mo39664l(f10);
        this.f2251H.mo39656t(C11022g1.m6485f(j) * this.f2251H.mo39674b());
        this.f2251H.mo39651y(C11022g1.m6484g(j) * this.f2251H.mo39675a());
        this.f2251H.mo39681D(z && interfaceC11001b1 != RectangleShape.m6240a());
        this.f2251H.mo39655u(z && interfaceC11001b1 == RectangleShape.m6240a());
        this.f2251H.mo39668h(abstractC11073x0);
        boolean m39818g = this.f2244A.m39818g(interfaceC11001b1, this.f2251H.mo39665k(), this.f2251H.mo39683B(), this.f2251H.mo39676I(), enumC13618o, density);
        this.f2251H.mo39678G(this.f2244A.m39822c());
        if (!this.f2251H.mo39683B() || this.f2244A.m39821d()) {
            z2 = false;
        }
        if (z3 == z2 && (!z2 || !m39818g)) {
            m39757m();
        } else {
            invalidate();
        }
        if (!this.f2246C && this.f2251H.mo39676I() > 0.0f && (interfaceC6097a = this.f2254y) != null) {
            interfaceC6097a.mo42214q();
        }
        this.f2248E.m39830c();
    }

    /* renamed from: b */
    public long mo21675b(long j, boolean z) {
        if (z) {
            float[] m39832a = this.f2248E.m39832a(this.f2251H);
            C10774f m7152d = m39832a == null ? null : C10774f.m7152d(p393v0.Matrix.m6434c(m39832a, j));
            return m7152d == null ? C10774f.f27866b.m7136a() : m7152d.m7137s();
        }
        return p393v0.Matrix.m6434c(this.f2248E.m39831b(this.f2251H), j);
    }

    /* renamed from: c */
    public void mo21674c(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        Canvas m6596c = C11002c.m6596c(interfaceC11064u);
        if (m6596c.isHardwareAccelerated()) {
            mo21668i();
            boolean z = this.f2251H.mo39676I() > 0.0f;
            this.f2246C = z;
            if (z) {
                interfaceC11064u.m6263n();
            }
            this.f2251H.mo39659q(m6596c);
            if (this.f2246C) {
                interfaceC11064u.m6267j();
                return;
            }
            return;
        }
        float mo39657s = this.f2251H.mo39657s();
        float mo39658r = this.f2251H.mo39658r();
        float mo39684A = this.f2251H.mo39684A();
        float mo39661o = this.f2251H.mo39661o();
        if (this.f2251H.mo39665k() < 1.0f) {
            InterfaceC11046o0 interfaceC11046o0 = this.f2247D;
            if (interfaceC11046o0 == null) {
                interfaceC11046o0 = C11028i.m6475a();
                this.f2247D = interfaceC11046o0;
            }
            interfaceC11046o0.mo6406c(this.f2251H.mo39665k());
            m6596c.saveLayer(mo39657s, mo39658r, mo39684A, mo39661o, interfaceC11046o0.mo6391r());
        } else {
            interfaceC11064u.m6269h();
        }
        interfaceC11064u.m6275b(mo39657s, mo39658r);
        interfaceC11064u.m6264m(this.f2248E.m39831b(this.f2251H));
        m39759k(interfaceC11064u);
        InterfaceC6108l interfaceC6108l = this.f2253x;
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(interfaceC11064u);
        }
        interfaceC11064u.m6270g();
        m39758l(false);
    }

    /* renamed from: d */
    public void mo21673d(InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "drawBlock");
        Intrinsics.isThisObjectNull(interfaceC6097a, "invalidateParentLayer");
        m39758l(false);
        this.f2245B = false;
        this.f2246C = false;
        this.f2250G = C11022g1.f28371b.m6480a();
        this.f2253x = interfaceC6108l;
        this.f2254y = interfaceC6097a;
    }

    /* renamed from: e */
    public void mo21672e(long j) {
        int m824g = C13615m.m824g(j);
        int m825f = C13615m.m825f(j);
        float f = m824g;
        this.f2251H.mo39656t(C11022g1.m6485f(this.f2250G) * f);
        float f2 = m825f;
        this.f2251H.mo39651y(C11022g1.m6484g(this.f2250G) * f2);
        InterfaceC0756n0 interfaceC0756n0 = this.f2251H;
        if (interfaceC0756n0.mo39654v(interfaceC0756n0.mo39657s(), this.f2251H.mo39658r(), this.f2251H.mo39657s() + m824g, this.f2251H.mo39658r() + m825f)) {
            this.f2244A.m39817h(C10783m.m7085a(f, f2));
            this.f2251H.mo39678G(this.f2244A.m39822c());
            invalidate();
            this.f2248E.m39830c();
        }
    }

    /* renamed from: f */
    public void mo21671f(C10773d c10773d, boolean z) {
        Intrinsics.isThisObjectNull(c10773d, "rect");
        if (z) {
            float[] m39832a = this.f2248E.m39832a(this.f2251H);
            if (m39832a == null) {
                c10773d.m7161g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                p393v0.Matrix.m6433d(m39832a, c10773d);
                return;
            }
        }
        p393v0.Matrix.m6433d(this.f2248E.m39831b(this.f2251H), c10773d);
    }

    /* renamed from: g */
    public void mo21670g() {
        if (this.f2251H.mo39679F()) {
            this.f2251H.mo39653w();
        }
        this.f2253x = null;
        this.f2254y = null;
        this.f2245B = true;
        m39758l(false);
        this.f2252w.m39894f0();
        this.f2252w.m39895e0(this);
    }

    /* renamed from: h */
    public void mo21669h(long j) {
        int mo39657s = this.f2251H.mo39657s();
        int mo39658r = this.f2251H.mo39658r();
        int m839h = C13612k.m839h(j);
        int m838i = C13612k.m838i(j);
        if (mo39657s == m839h && mo39658r == m838i) {
            return;
        }
        this.f2251H.mo39662n(m839h - mo39657s);
        this.f2251H.mo39682C(m838i - mo39658r);
        m39757m();
        this.f2248E.m39830c();
    }

    /* renamed from: i */
    public void mo21668i() {
        if (this.f2255z || !this.f2251H.mo39679F()) {
            m39758l(false);
            InterfaceC11052q0 m39823b = (!this.f2251H.mo39683B() || this.f2244A.m39821d()) ? null : this.f2244A.m39823b();
            InterfaceC6108l<? super InterfaceC11064u, C13195u> interfaceC6108l = this.f2253x;
            if (interfaceC6108l == null) {
                return;
            }
            this.f2251H.mo39652x(this.f2249F, m39823b, interfaceC6108l);
        }
    }

    public void invalidate() {
        if (this.f2255z || this.f2245B) {
            return;
        }
        this.f2252w.invalidate();
        m39758l(true);
    }

    /* renamed from: j */
    public boolean mo21667j(long j) {
        float m7145k = C10774f.m7145k(j);
        float m7144l = C10774f.m7144l(j);
        if (this.f2251H.mo39660p()) {
            return 0.0f <= m7145k && m7145k < ((float) this.f2251H.mo39674b()) && 0.0f <= m7144l && m7144l < ((float) this.f2251H.mo39675a());
        } else if (this.f2251H.mo39683B()) {
            return this.f2244A.m39820e(j);
        } else {
            return true;
        }
    }
}
