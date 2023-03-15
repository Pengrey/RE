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
import p479z1.C13601c;
import p479z1.C13605g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
/* renamed from: w.z */
/* loaded from: classes.dex */
public final class C11500z extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: x */
    private final InterfaceC11498x f29443x;

    /* compiled from: Padding.kt */
    /* renamed from: w.z$a */
    /* loaded from: classes.dex */
    static final class C11501a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f29444w;

        /* renamed from: x */
        final /* synthetic */ MeasureScope f29445x;

        /* renamed from: y */
        final /* synthetic */ C11500z f29446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11501a(Placeable placeable, MeasureScope measureScope, C11500z c11500z) {
            super(1);
            this.f29444w = placeable;
            this.f29445x = measureScope;
            this.f29446y = c11500z;
        }

        /* renamed from: a */
        public final void m4942a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23163j(abstractC5751a, this.f29444w, this.f29445x.m898O(this.f29446y.m4945b().mo4957d(this.f29445x.getLayoutDirection())), this.f29445x.m898O(this.f29446y.m4945b().mo4958c()), 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4942a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11500z(InterfaceC11498x interfaceC11498x, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(interfaceC11498x, "paddingValues");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f29443x = interfaceC11498x;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m4947S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        boolean z = false;
        float f = 0;
        if (C13605g.m876f(this.f29443x.mo4957d(measureScope.getLayoutDirection()), C13605g.m875g(f)) >= 0 && C13605g.m876f(this.f29443x.mo4958c(), C13605g.m875g(f)) >= 0 && C13605g.m876f(this.f29443x.mo4960a(measureScope.getLayoutDirection()), C13605g.m875g(f)) >= 0 && C13605g.m876f(this.f29443x.mo4959b(), C13605g.m875g(f)) >= 0) {
            z = true;
        }
        if (z) {
            int m898O = measureScope.m898O(this.f29443x.mo4957d(measureScope.getLayoutDirection())) + measureScope.m898O(this.f29443x.mo4960a(measureScope.getLayoutDirection()));
            int m898O2 = measureScope.m898O(this.f29443x.mo4958c()) + measureScope.m898O(this.f29443x.mo4959b());
            Placeable mo23007n = interfaceC5803r.mo23007n(C13601c.m900h(j, -m898O, -m898O2));
            return MeasureScope.C5806a.m22999b(measureScope, C13601c.m901g(j, mo23007n.m23177q0() + m898O), C13601c.m902f(j, mo23007n.m23182l0() + m898O2), null, new C11501a(mo23007n, measureScope, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final InterfaceC11498x m4945b() {
        return this.f29443x;
    }

    public boolean equals(Object obj) {
        C11500z c11500z = obj instanceof C11500z ? (C11500z) obj : null;
        if (c11500z == null) {
            return false;
        }
        return Intrinsics.equals(this.f29443x, c11500z.f29443x);
    }

    public int hashCode() {
        return this.f29443x.hashCode();
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
