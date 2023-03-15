package p346s0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.C5775i0;
import p127h1.InterfaceC5753d;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p373u0.C10781l;
import p373u0.C10783m;
import p393v0.ColorFilter;
import p433x0.InterfaceC12238c;
import p456y0.Painter;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13612k;
import p479z1.C13617n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s0.h */
/* loaded from: classes.dex */
public final class PainterModifier extends AbstractC0820x0 implements LayoutModifier, InterfaceC10024e {

    /* renamed from: A */
    private final InterfaceC5753d f26214A;

    /* renamed from: B */
    private final float f26215B;

    /* renamed from: C */
    private final ColorFilter f26216C;

    /* renamed from: x */
    private final Painter f26217x;

    /* renamed from: y */
    private final boolean f26218y;

    /* renamed from: z */
    private final InterfaceC9560a f26219z;

    /* compiled from: PainterModifier.kt */
    /* renamed from: s0.h$a */
    /* loaded from: classes.dex */
    static final class C10030a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f26220w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10030a(Placeable placeable) {
            super(1);
            this.f26220w = placeable;
        }

        /* renamed from: a */
        public final void m9357a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f26220w, 0, 0, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9357a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(Painter painter, boolean z, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(painter, "painter");
        Intrinsics.isThisObjectNull(interfaceC9560a, "alignment");
        Intrinsics.isThisObjectNull(interfaceC5753d, "contentScale");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f26217x = painter;
        this.f26218y = z;
        this.f26219z = interfaceC9560a;
        this.f26214A = interfaceC5753d;
        this.f26215B = f;
        this.f26216C = colorFilter;
    }

    /* renamed from: b */
    private final long m9366b(long j) {
        float m7091i;
        float m7093g;
        if (m9362f()) {
            if (!m9360h(this.f26217x.m1760h())) {
                m7091i = C10781l.m7091i(j);
            } else {
                m7091i = C10781l.m7091i(this.f26217x.m1760h());
            }
            if (!m9361g(this.f26217x.m1760h())) {
                m7093g = C10781l.m7093g(j);
            } else {
                m7093g = C10781l.m7093g(this.f26217x.m1760h());
            }
            long m7085a = C10783m.m7085a(m7091i, m7093g);
            if (!(C10781l.m7091i(j) == 0.0f)) {
                if (!(C10781l.m7093g(j) == 0.0f)) {
                    return C5775i0.m23110b(m7085a, this.f26214A.mo23142a(m7085a, j));
                }
            }
            return C10781l.f27885b.m7086b();
        }
        return j;
    }

    /* renamed from: f */
    private final boolean m9362f() {
        if (this.f26218y) {
            if (this.f26217x.m1760h() != C10781l.f27885b.m7087a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m9361g(long j) {
        if (!C10781l.m7094f(j, C10781l.f27885b.m7087a())) {
            float m7093g = C10781l.m7093g(j);
            if ((Float.isInfinite(m7093g) || Float.isNaN(m7093g)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m9360h(long j) {
        if (!C10781l.m7094f(j, C10781l.f27885b.m7087a())) {
            float m7091i = C10781l.m7091i(j);
            if ((Float.isInfinite(m7091i) || Float.isNaN(m7091i)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private final long m9359i(long j) {
        int m914p;
        int m915o;
        int m19530c;
        int m19530c2;
        boolean z = true;
        boolean z2 = C13599b.m920j(j) && C13599b.m921i(j);
        if (!C13599b.m918l(j) || !C13599b.m919k(j)) {
            z = false;
        }
        if ((!m9362f() && z2) || z) {
            return C13599b.m925e(j, C13599b.m916n(j), 0, C13599b.m917m(j), 0, 10, null);
        }
        long m1760h = this.f26217x.m1760h();
        if (m9360h(m1760h)) {
            m914p = C7037c.m19530c(C10781l.m7091i(m1760h));
        } else {
            m914p = C13599b.m914p(j);
        }
        if (m9361g(m1760h)) {
            m915o = C7037c.m19530c(C10781l.m7093g(m1760h));
        } else {
            m915o = C13599b.m915o(j);
        }
        long m9366b = m9366b(C10783m.m7085a(C13601c.m901g(j, m914p), C13601c.m902f(j, m915o)));
        m19530c = C7037c.m19530c(C10781l.m7091i(m9366b));
        int m901g = C13601c.m901g(j, m19530c);
        m19530c2 = C7037c.m19530c(C10781l.m7093g(m9366b));
        return C13599b.m925e(j, m901g, 0, C13601c.m902f(j, m19530c2), 0, 10, null);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m9367S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        Placeable mo23007n = interfaceC5803r.mo23007n(m9359i(j));
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C10030a(mo23007n), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: c */
    public final float m9365c() {
        return this.f26215B;
    }

    /* renamed from: d */
    public final ColorFilter m9364d() {
        return this.f26216C;
    }

    /* renamed from: e */
    public final Painter m9363e() {
        return this.f26217x;
    }

    public boolean equals(Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier != null && Intrinsics.equals(this.f26217x, painterModifier.f26217x) && this.f26218y == painterModifier.f26218y && Intrinsics.equals(this.f26219z, painterModifier.f26219z) && Intrinsics.equals(this.f26214A, painterModifier.f26214A)) {
            return ((this.f26215B > painterModifier.f26215B ? 1 : (this.f26215B == painterModifier.f26215B ? 0 : -1)) == 0) && Intrinsics.equals(this.f26216C, painterModifier.f26216C);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f26217x.hashCode() * 31) + Boolean.hashCode(this.f26218y)) * 31) + this.f26219z.hashCode()) * 31) + this.f26214A.hashCode()) * 31) + Float.hashCode(this.f26215B)) * 31;
        ColorFilter colorFilter = this.f26216C;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    /* renamed from: p */
    public void m9358p(InterfaceC12238c interfaceC12238c) {
        float m7091i;
        float m7093g;
        long m7086b;
        int m19530c;
        int m19530c2;
        int m19530c3;
        int m19530c4;
        Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
        long m1760h = this.f26217x.m1760h();
        if (m9360h(m1760h)) {
            m7091i = C10781l.m7091i(m1760h);
        } else {
            m7091i = C10781l.m7091i(interfaceC12238c.m3263a());
        }
        if (m9361g(m1760h)) {
            m7093g = C10781l.m7093g(m1760h);
        } else {
            m7093g = C10781l.m7093g(interfaceC12238c.m3263a());
        }
        long m7085a = C10783m.m7085a(m7091i, m7093g);
        if (!(C10781l.m7091i(interfaceC12238c.m3263a()) == 0.0f)) {
            if (!(C10781l.m7093g(interfaceC12238c.m3263a()) == 0.0f)) {
                m7086b = C5775i0.m23110b(m7085a, this.f26214A.mo23142a(m7085a, interfaceC12238c.m3263a()));
                long j = m7086b;
                InterfaceC9560a interfaceC9560a = this.f26219z;
                m19530c = C7037c.m19530c(C10781l.m7091i(j));
                m19530c2 = C7037c.m19530c(C10781l.m7093g(j));
                long m819a = C13617n.m819a(m19530c, m19530c2);
                m19530c3 = C7037c.m19530c(C10781l.m7091i(interfaceC12238c.m3263a()));
                m19530c4 = C7037c.m19530c(C10781l.m7093g(interfaceC12238c.m3263a()));
                long mo10596a = interfaceC9560a.mo10596a(m819a, C13617n.m819a(m19530c3, m19530c4), interfaceC12238c.getLayoutDirection());
                float m839h = C13612k.m839h(mo10596a);
                float m838i = C13612k.m838i(mo10596a);
                interfaceC12238c.m3272B().mo3274c().mo3245b(m839h, m838i);
                m9363e().m1761g(interfaceC12238c, j, m9365c(), m9364d());
                interfaceC12238c.m3272B().mo3274c().mo3245b(-m839h, -m838i);
                interfaceC12238c.mo3277g0();
            }
        }
        m7086b = C10781l.f27885b.m7086b();
        long j2 = m7086b;
        InterfaceC9560a interfaceC9560a2 = this.f26219z;
        m19530c = C7037c.m19530c(C10781l.m7091i(j2));
        m19530c2 = C7037c.m19530c(C10781l.m7093g(j2));
        long m819a2 = C13617n.m819a(m19530c, m19530c2);
        m19530c3 = C7037c.m19530c(C10781l.m7091i(interfaceC12238c.m3263a()));
        m19530c4 = C7037c.m19530c(C10781l.m7093g(interfaceC12238c.m3263a()));
        long mo10596a2 = interfaceC9560a2.mo10596a(m819a2, C13617n.m819a(m19530c3, m19530c4), interfaceC12238c.getLayoutDirection());
        float m839h2 = C13612k.m839h(mo10596a2);
        float m838i2 = C13612k.m838i(mo10596a2);
        interfaceC12238c.m3272B().mo3274c().mo3245b(m839h2, m838i2);
        m9363e().m1761g(interfaceC12238c, j2, m9365c(), m9364d());
        interfaceC12238c.m3272B().mo3274c().mo3245b(-m839h2, -m838i2);
        interfaceC12238c.mo3277g0();
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f26217x + ", sizeToIntrinsics=" + this.f26218y + ", alignment=" + this.f26219z + ", alpha=" + this.f26215B + ", colorFilter=" + this.f26216C + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
