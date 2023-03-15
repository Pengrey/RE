package p456y0;

import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10778i;
import p373u0.C10781l;
import p373u0.C10783m;
import p373u0.Rect;
import p393v0.C11028i;
import p393v0.ColorFilter;
import p393v0.InterfaceC11046o0;
import p393v0.InterfaceC11064u;
import p433x0.DrawScope;
import p468yc.C13195u;
import p479z1.EnumC13618o;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public abstract class Painter {

    /* renamed from: a */
    private InterfaceC11046o0 f33955a;

    /* renamed from: b */
    private boolean f33956b;

    /* renamed from: c */
    private ColorFilter f33957c;

    /* renamed from: d */
    private float f33958d = 1.0f;

    /* renamed from: e */
    private EnumC13618o f33959e = EnumC13618o.Ltr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Painter.kt */
    /* renamed from: y0.b$a */
    /* loaded from: classes.dex */
    public static final class C13057a extends AbstractC6438m implements InterfaceC6108l {
        C13057a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1757a(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "$this$null");
            Painter.this.m1758j(drawScope);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1757a((DrawScope) obj);
            return C13195u.f34156a;
        }
    }

    public Painter() {
        new C13057a();
    }

    /* renamed from: d */
    private final void m1764d(float f) {
        if (this.f33958d == f) {
            return;
        }
        if (!m1767a(f)) {
            if (f == 1.0f) {
                InterfaceC11046o0 interfaceC11046o0 = this.f33955a;
                if (interfaceC11046o0 != null) {
                    interfaceC11046o0.mo6406c(f);
                }
                this.f33956b = false;
            } else {
                m1759i().mo6406c(f);
                this.f33956b = true;
            }
        }
        this.f33958d = f;
    }

    /* renamed from: e */
    private final void m1763e(ColorFilter colorFilter) {
        if (Intrinsics.equals(this.f33957c, colorFilter)) {
            return;
        }
        if (!m1766b(colorFilter)) {
            if (colorFilter == null) {
                InterfaceC11046o0 interfaceC11046o0 = this.f33955a;
                if (interfaceC11046o0 != null) {
                    interfaceC11046o0.mo6404e(null);
                }
                this.f33956b = false;
            } else {
                m1759i().mo6404e(colorFilter);
                this.f33956b = true;
            }
        }
        this.f33957c = colorFilter;
    }

    /* renamed from: f */
    private final void m1762f(EnumC13618o enumC13618o) {
        if (this.f33959e != enumC13618o) {
            m1765c(enumC13618o);
            this.f33959e = enumC13618o;
        }
    }

    /* renamed from: i */
    private final InterfaceC11046o0 m1759i() {
        InterfaceC11046o0 interfaceC11046o0 = this.f33955a;
        if (interfaceC11046o0 == null) {
            InterfaceC11046o0 m6475a = C11028i.m6475a();
            this.f33955a = m6475a;
            return m6475a;
        }
        return interfaceC11046o0;
    }

    /* renamed from: a */
    protected abstract boolean m1767a(float f);

    /* renamed from: b */
    protected abstract boolean m1766b(ColorFilter colorFilter);

    /* renamed from: c */
    protected boolean m1765c(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        return false;
    }

    /* renamed from: g */
    public final void m1761g(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(drawScope, "$receiver");
        m1764d(f);
        m1763e(colorFilter);
        m1762f(drawScope.getLayoutDirection());
        float m7091i = C10781l.m7091i(drawScope.m3263a()) - C10781l.m7091i(j);
        float m7093g = C10781l.m7093g(drawScope.m3263a()) - C10781l.m7093g(j);
        drawScope.m3272B().mo3274c().mo3243d(0.0f, 0.0f, m7091i, m7093g);
        if (f > 0.0f && C10781l.m7091i(j) > 0.0f && C10781l.m7093g(j) > 0.0f) {
            if (this.f33956b) {
                Rect m7114a = C10778i.m7114a(C10774f.f27866b.m7134c(), C10783m.m7085a(C10781l.m7091i(j), C10781l.m7093g(j)));
                InterfaceC11064u mo3275b = drawScope.m3272B().mo3275b();
                try {
                    mo3275b.m6261p(m7114a, m1759i());
                    m1758j(drawScope);
                } finally {
                    mo3275b.m6270g();
                }
            } else {
                m1758j(drawScope);
            }
        }
        drawScope.m3272B().mo3274c().mo3243d(-0.0f, -0.0f, -m7091i, -m7093g);
    }

    /* renamed from: h */
    public abstract long m1760h();

    /* renamed from: j */
    protected abstract void m1758j(DrawScope drawScope);
}
