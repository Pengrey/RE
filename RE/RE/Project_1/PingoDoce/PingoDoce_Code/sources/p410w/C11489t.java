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
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13612k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Offset.kt */
/* renamed from: w.t */
/* loaded from: classes.dex */
public final class C11489t extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final InterfaceC6108l f29414x;

    /* renamed from: y */
    private final boolean f29415y;

    /* compiled from: Offset.kt */
    /* renamed from: w.t$a */
    /* loaded from: classes.dex */
    static final class C11490a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ MeasureScope f29417x;

        /* renamed from: y */
        final /* synthetic */ Placeable f29418y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11490a(MeasureScope measureScope, Placeable placeable) {
            super(1);
            this.f29417x = measureScope;
            this.f29418y = placeable;
        }

        /* renamed from: a */
        public final void m4996a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            long m835l = ((C13612k) C11489t.this.m5000b().mo9587d(this.f29417x)).m835l();
            if (C11489t.this.m4999c()) {
                Placeable.AbstractC5751a.m23155r(abstractC5751a, this.f29418y, C13612k.m839h(m835l), C13612k.m838i(m835l), 0.0f, null, 12, null);
            } else {
                Placeable.AbstractC5751a.m23151v(abstractC5751a, this.f29418y, C13612k.m839h(m835l), C13612k.m838i(m835l), 0.0f, null, 12, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4996a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11489t(InterfaceC6108l interfaceC6108l, boolean z, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "offset");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f29414x = interfaceC6108l;
        this.f29415y = z;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5002S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        Placeable mo23007n = interfaceC5803r.mo23007n(j);
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11490a(measureScope, mo23007n), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final InterfaceC6108l m5000b() {
        return this.f29414x;
    }

    /* renamed from: c */
    public final boolean m4999c() {
        return this.f29415y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C11489t c11489t = obj instanceof C11489t ? (C11489t) obj : null;
        if (c11489t == null) {
            return false;
        }
        return Intrinsics.equals(this.f29414x, c11489t.f29414x) && this.f29415y == c11489t.f29415y;
    }

    public int hashCode() {
        return (this.f29414x.hashCode() * 31) + Boolean.hashCode(this.f29415y);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f29414x + ", rtlAware=" + this.f29415y + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }
}
