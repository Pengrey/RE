package androidx.compose.p018ui.platform;

import android.graphics.Outline;
import android.os.Build;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10769a;
import p373u0.C10771b;
import p373u0.C10774f;
import p373u0.C10776g;
import p373u0.C10779j;
import p373u0.C10781l;
import p373u0.C10783m;
import p373u0.Rect;
import p373u0.RoundRect;
import p393v0.C11033j;
import p393v0.C11042n;
import p393v0.InterfaceC11001b1;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p393v0.Outline;
import p393v0.RectangleShape;
import p479z1.Density;
import p479z1.EnumC13618o;

/* compiled from: OutlineResolver.android.kt */
/* renamed from: androidx.compose.ui.platform.b1 */
/* loaded from: classes.dex */
public final class C0688b1 {

    /* renamed from: a */
    private Density f2170a;

    /* renamed from: b */
    private boolean f2171b;

    /* renamed from: c */
    private final Outline f2172c;

    /* renamed from: d */
    private long f2173d;

    /* renamed from: e */
    private InterfaceC11001b1 f2174e;

    /* renamed from: f */
    private InterfaceC11052q0 f2175f;

    /* renamed from: g */
    private InterfaceC11052q0 f2176g;

    /* renamed from: h */
    private boolean f2177h;

    /* renamed from: i */
    private boolean f2178i;

    /* renamed from: j */
    private InterfaceC11052q0 f2179j;

    /* renamed from: k */
    private C10779j f2180k;

    /* renamed from: l */
    private float f2181l;

    /* renamed from: m */
    private long f2182m;

    /* renamed from: n */
    private long f2183n;

    /* renamed from: o */
    private boolean f2184o;

    /* renamed from: p */
    private EnumC13618o f2185p;

    /* renamed from: q */
    private InterfaceC11052q0 f2186q;

    /* renamed from: r */
    private InterfaceC11052q0 f2187r;

    /* renamed from: s */
    private p393v0.Outline f2188s;

    public C0688b1(Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        this.f2170a = density;
        this.f2171b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f2172c = outline;
        C10781l.C10782a c10782a = C10781l.f27885b;
        this.f2173d = c10782a.m7086b();
        this.f2174e = RectangleShape.m6240a();
        this.f2182m = C10774f.f27866b.m7134c();
        this.f2183n = c10782a.m7086b();
        this.f2185p = EnumC13618o.Ltr;
    }

    /* renamed from: f */
    private final boolean m39819f(C10779j c10779j, long j, long j2, float f) {
        if (c10779j == null || !RoundRect.m7100d(c10779j)) {
            return false;
        }
        if (c10779j.m7109e() == C10774f.m7145k(j)) {
            if (c10779j.m7107g() == C10774f.m7144l(j)) {
                if (c10779j.m7108f() == C10774f.m7145k(j) + C10781l.m7091i(j2)) {
                    if (c10779j.m7113a() == C10774f.m7144l(j) + C10781l.m7093g(j2)) {
                        return (C10769a.m7175d(c10779j.m7106h()) > f ? 1 : (C10769a.m7175d(c10779j.m7106h()) == f ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    private final void m39816i() {
        if (this.f2177h) {
            this.f2182m = C10774f.f27866b.m7134c();
            long j = this.f2173d;
            this.f2183n = j;
            this.f2181l = 0.0f;
            this.f2176g = null;
            this.f2177h = false;
            this.f2178i = false;
            if (this.f2184o && C10781l.m7091i(j) > 0.0f && C10781l.m7093g(this.f2173d) > 0.0f) {
                this.f2171b = true;
                p393v0.Outline mo6599a = this.f2174e.mo6599a(this.f2173d, this.f2185p, this.f2170a);
                this.f2188s = mo6599a;
                if (mo6599a instanceof Outline.C11040b) {
                    m39814k(((Outline.C11040b) mo6599a).m6424a());
                    return;
                } else if (mo6599a instanceof Outline.C11041c) {
                    m39813l(((Outline.C11041c) mo6599a).m6423a());
                    return;
                } else if (mo6599a instanceof Outline.C11039a) {
                    m39815j(((Outline.C11039a) mo6599a).m6425a());
                    return;
                } else {
                    return;
                }
            }
            this.f2172c.setEmpty();
        }
    }

    /* renamed from: j */
    private final void m39815j(InterfaceC11052q0 interfaceC11052q0) {
        if (Build.VERSION.SDK_INT <= 28 && !interfaceC11052q0.mo6315b()) {
            this.f2171b = false;
            this.f2172c.setEmpty();
            this.f2178i = true;
        } else {
            android.graphics.Outline outline = this.f2172c;
            if (interfaceC11052q0 instanceof C11033j) {
                outline.setConvexPath(((C11033j) interfaceC11052q0).m6440q());
                this.f2178i = !this.f2172c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f2176g = interfaceC11052q0;
    }

    /* renamed from: k */
    private final void m39814k(Rect rect) {
        int m19530c;
        int m19530c2;
        int m19530c3;
        int m19530c4;
        this.f2182m = C10776g.m7133a(rect.m7125f(), rect.m7122i());
        this.f2183n = C10783m.m7085a(rect.m7120k(), rect.m7126e());
        android.graphics.Outline outline = this.f2172c;
        m19530c = C7037c.m19530c(rect.m7125f());
        m19530c2 = C7037c.m19530c(rect.m7122i());
        m19530c3 = C7037c.m19530c(rect.m7124g());
        m19530c4 = C7037c.m19530c(rect.m7128c());
        outline.setRect(m19530c, m19530c2, m19530c3, m19530c4);
    }

    /* renamed from: l */
    private final void m39813l(C10779j c10779j) {
        int m19530c;
        int m19530c2;
        int m19530c3;
        int m19530c4;
        float m7175d = C10769a.m7175d(c10779j.m7106h());
        this.f2182m = C10776g.m7133a(c10779j.m7109e(), c10779j.m7107g());
        this.f2183n = C10783m.m7085a(c10779j.m7104j(), c10779j.m7110d());
        if (RoundRect.m7100d(c10779j)) {
            android.graphics.Outline outline = this.f2172c;
            m19530c = C7037c.m19530c(c10779j.m7109e());
            m19530c2 = C7037c.m19530c(c10779j.m7107g());
            m19530c3 = C7037c.m19530c(c10779j.m7108f());
            m19530c4 = C7037c.m19530c(c10779j.m7113a());
            outline.setRoundRect(m19530c, m19530c2, m19530c3, m19530c4, m7175d);
            this.f2181l = m7175d;
            return;
        }
        InterfaceC11052q0 interfaceC11052q0 = this.f2175f;
        if (interfaceC11052q0 == null) {
            interfaceC11052q0 = C11042n.m6421a();
            this.f2175f = interfaceC11052q0;
        }
        interfaceC11052q0.mo6316a();
        interfaceC11052q0.mo6313d(c10779j);
        m39815j(interfaceC11052q0);
    }

    /* renamed from: a */
    public final void m39824a(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        InterfaceC11052q0 m39823b = m39823b();
        if (m39823b != null) {
            InterfaceC11064u.C11065a.m6260a(interfaceC11064u, m39823b, 0, 2, null);
            return;
        }
        float f = this.f2181l;
        if (f > 0.0f) {
            InterfaceC11052q0 interfaceC11052q0 = this.f2179j;
            C10779j c10779j = this.f2180k;
            if (interfaceC11052q0 == null || !m39819f(c10779j, this.f2182m, this.f2183n, f)) {
                C10779j m7101c = RoundRect.m7101c(C10774f.m7145k(this.f2182m), C10774f.m7144l(this.f2182m), C10774f.m7145k(this.f2182m) + C10781l.m7091i(this.f2183n), C10774f.m7144l(this.f2182m) + C10781l.m7093g(this.f2183n), C10771b.m7169b(this.f2181l, 0.0f, 2, null));
                if (interfaceC11052q0 == null) {
                    interfaceC11052q0 = C11042n.m6421a();
                } else {
                    interfaceC11052q0.mo6316a();
                }
                interfaceC11052q0.mo6313d(m7101c);
                this.f2180k = m7101c;
                this.f2179j = interfaceC11052q0;
            }
            InterfaceC11064u.C11065a.m6260a(interfaceC11064u, interfaceC11052q0, 0, 2, null);
            return;
        }
        InterfaceC11064u.C11065a.m6259b(interfaceC11064u, C10774f.m7145k(this.f2182m), C10774f.m7144l(this.f2182m), C10774f.m7145k(this.f2182m) + C10781l.m7091i(this.f2183n), C10774f.m7144l(this.f2182m) + C10781l.m7093g(this.f2183n), 0, 16, null);
    }

    /* renamed from: b */
    public final InterfaceC11052q0 m39823b() {
        m39816i();
        return this.f2176g;
    }

    /* renamed from: c */
    public final android.graphics.Outline m39822c() {
        m39816i();
        if (this.f2184o && this.f2171b) {
            return this.f2172c;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m39821d() {
        return !this.f2178i;
    }

    /* renamed from: e */
    public final boolean m39820e(long j) {
        p393v0.Outline outline;
        if (this.f2184o && (outline = this.f2188s) != null) {
            return ShapeContainingUtil.m39723b(outline, C10774f.m7145k(j), C10774f.m7144l(j), this.f2186q, this.f2187r);
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m39818g(InterfaceC11001b1 interfaceC11001b1, float f, boolean z, float f2, EnumC13618o enumC13618o, Density density) {
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(density, "density");
        this.f2172c.setAlpha(f);
        boolean z2 = !Intrinsics.equals(this.f2174e, interfaceC11001b1);
        if (z2) {
            this.f2174e = interfaceC11001b1;
            this.f2177h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.f2184o != z3) {
            this.f2184o = z3;
            this.f2177h = true;
        }
        if (this.f2185p != enumC13618o) {
            this.f2185p = enumC13618o;
            this.f2177h = true;
        }
        if (!Intrinsics.equals(this.f2170a, density)) {
            this.f2170a = density;
            this.f2177h = true;
        }
        return z2;
    }

    /* renamed from: h */
    public final void m39817h(long j) {
        if (C10781l.m7094f(this.f2173d, j)) {
            return;
        }
        this.f2173d = j;
        this.f2177h = true;
    }
}
