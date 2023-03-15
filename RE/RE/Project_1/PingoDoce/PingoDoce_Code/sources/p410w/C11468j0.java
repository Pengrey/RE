package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.LayoutModifier;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13605g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* renamed from: w.j0 */
/* loaded from: classes.dex */
public final class C11468j0 extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final float f29387x;

    /* renamed from: y */
    private final float f29388y;

    /* compiled from: Size.kt */
    /* renamed from: w.j0$a */
    /* loaded from: classes.dex */
    static final class C11469a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f29389w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11469a(Placeable placeable) {
            super(1);
            this.f29389w = placeable;
        }

        /* renamed from: a */
        public final void m5047a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f29389w, 0, 0, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5047a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    private C11468j0(float f, float f2, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f29387x = f;
        this.f29388y = f2;
    }

    public /* synthetic */ C11468j0(float f, float f2, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, interfaceC6108l);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5053S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        int m914p;
        int m915o;
        int m15000i;
        int m15000i2;
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        float m5050c = m5050c();
        C13605g.C13606a c13606a = C13605g.f34597x;
        if (!C13605g.m873i(m5050c, c13606a.m868b()) && C13599b.m914p(j) == 0) {
            m15000i2 = _Ranges.m15000i(measureScope.m898O(m5050c()), C13599b.m916n(j));
            m914p = _Ranges.m15005d(m15000i2, 0);
        } else {
            m914p = C13599b.m914p(j);
        }
        int m916n = C13599b.m916n(j);
        if (!C13605g.m873i(m5051b(), c13606a.m868b()) && C13599b.m915o(j) == 0) {
            m15000i = _Ranges.m15000i(measureScope.m898O(m5051b()), C13599b.m917m(j));
            m915o = _Ranges.m15005d(m15000i, 0);
        } else {
            m915o = C13599b.m915o(j);
        }
        Placeable mo23007n = interfaceC5803r.mo23007n(C13601c.m907a(m914p, m916n, m915o, C13599b.m917m(j)));
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11469a(mo23007n), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final float m5051b() {
        return this.f29388y;
    }

    /* renamed from: c */
    public final float m5050c() {
        return this.f29387x;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11468j0) {
            C11468j0 c11468j0 = (C11468j0) obj;
            return C13605g.m873i(m5050c(), c11468j0.m5050c()) && C13605g.m873i(m5051b(), c11468j0.m5051b());
        }
        return false;
    }

    public int hashCode() {
        return (C13605g.m872j(m5050c()) * 31) + C13605g.m872j(m5051b());
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
