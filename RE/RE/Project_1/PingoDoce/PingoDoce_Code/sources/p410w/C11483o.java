package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p297pd._Ranges;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* renamed from: w.o */
/* loaded from: classes.dex */
public final class C11483o extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final EnumC11482n f29407x;

    /* renamed from: y */
    private final float f29408y;

    /* compiled from: Size.kt */
    /* renamed from: w.o$a */
    /* loaded from: classes.dex */
    static final class C11484a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f29409w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11484a(Placeable placeable) {
            super(1);
            this.f29409w = placeable;
        }

        /* renamed from: a */
        public final void m5021a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f29409w, 0, 0, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5021a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11483o(EnumC11482n enumC11482n, float f, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(enumC11482n, "direction");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f29407x = enumC11482n;
        this.f29408y = f;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5025S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        int m914p;
        int m916n;
        int m917m;
        int i;
        int m19530c;
        int m19530c2;
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        if (C13599b.m920j(j) && this.f29407x != EnumC11482n.Vertical) {
            m19530c2 = C7037c.m19530c(C13599b.m916n(j) * this.f29408y);
            m914p = _Ranges.m14996m(m19530c2, C13599b.m914p(j), C13599b.m916n(j));
            m916n = m914p;
        } else {
            m914p = C13599b.m914p(j);
            m916n = C13599b.m916n(j);
        }
        if (C13599b.m921i(j) && this.f29407x != EnumC11482n.Horizontal) {
            m19530c = C7037c.m19530c(C13599b.m917m(j) * this.f29408y);
            i = _Ranges.m14996m(m19530c, C13599b.m915o(j), C13599b.m917m(j));
            m917m = i;
        } else {
            int m915o = C13599b.m915o(j);
            m917m = C13599b.m917m(j);
            i = m915o;
        }
        Placeable mo23007n = interfaceC5803r.mo23007n(C13601c.m907a(m914p, m916n, i, m917m));
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11484a(mo23007n), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11483o) {
            C11483o c11483o = (C11483o) obj;
            if (this.f29407x == c11483o.f29407x) {
                if (this.f29408y == c11483o.f29408y) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f29407x.hashCode() * 31) + Float.hashCode(this.f29408y);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
