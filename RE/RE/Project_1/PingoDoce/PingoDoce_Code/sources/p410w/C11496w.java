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
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13601c;
import p479z1.C13605g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
/* renamed from: w.w */
/* loaded from: classes.dex */
public final class C11496w extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: A */
    private final float f29431A;

    /* renamed from: B */
    private final boolean f29432B;

    /* renamed from: x */
    private final float f29433x;

    /* renamed from: y */
    private final float f29434y;

    /* renamed from: z */
    private final float f29435z;

    /* compiled from: Padding.kt */
    /* renamed from: w.w$a */
    /* loaded from: classes.dex */
    static final class C11497a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ Placeable f29437x;

        /* renamed from: y */
        final /* synthetic */ MeasureScope f29438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11497a(Placeable placeable, MeasureScope measureScope) {
            super(1);
            this.f29437x = placeable;
            this.f29438y = measureScope;
        }

        /* renamed from: a */
        public final void m4961a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            if (C11496w.this.m4966d()) {
                Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f29437x, this.f29438y.m898O(C11496w.this.m4965e()), this.f29438y.m898O(C11496w.this.m4964f()), 0.0f, 4, null);
            } else {
                Placeable.AbstractC5751a.m23163j(abstractC5751a, this.f29437x, this.f29438y.m898O(C11496w.this.m4965e()), this.f29438y.m898O(C11496w.this.m4964f()), 0.0f, 4, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m4961a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    private C11496w(float f, float f2, float f3, float f4, boolean z, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f29433x = f;
        this.f29434y = f2;
        this.f29435z = f3;
        this.f29431A = f4;
        this.f29432B = z;
        if (!((m4965e() >= 0.0f || C13605g.m873i(m4965e(), C13605g.f34597x.m868b())) && (m4964f() >= 0.0f || C13605g.m873i(m4964f(), C13605g.f34597x.m868b())) && ((m4967c() >= 0.0f || C13605g.m873i(m4967c(), C13605g.f34597x.m868b())) && (m4968b() >= 0.0f || C13605g.m873i(m4968b(), C13605g.f34597x.m868b()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ C11496w(float f, float f2, float f3, float f4, boolean z, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, interfaceC6108l);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m4970S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        int m898O = measureScope.m898O(m4965e()) + measureScope.m898O(m4967c());
        int m898O2 = measureScope.m898O(m4964f()) + measureScope.m898O(m4968b());
        Placeable mo23007n = interfaceC5803r.mo23007n(C13601c.m900h(j, -m898O, -m898O2));
        return MeasureScope.C5806a.m22999b(measureScope, C13601c.m901g(j, mo23007n.m23177q0() + m898O), C13601c.m902f(j, mo23007n.m23182l0() + m898O2), null, new C11497a(mo23007n, measureScope), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final float m4968b() {
        return this.f29431A;
    }

    /* renamed from: c */
    public final float m4967c() {
        return this.f29435z;
    }

    /* renamed from: d */
    public final boolean m4966d() {
        return this.f29432B;
    }

    /* renamed from: e */
    public final float m4965e() {
        return this.f29433x;
    }

    public boolean equals(Object obj) {
        C11496w c11496w = obj instanceof C11496w ? (C11496w) obj : null;
        return c11496w != null && C13605g.m873i(m4965e(), c11496w.m4965e()) && C13605g.m873i(m4964f(), c11496w.m4964f()) && C13605g.m873i(m4967c(), c11496w.m4967c()) && C13605g.m873i(m4968b(), c11496w.m4968b()) && this.f29432B == c11496w.f29432B;
    }

    /* renamed from: f */
    public final float m4964f() {
        return this.f29434y;
    }

    public int hashCode() {
        return (((((((C13605g.m872j(m4965e()) * 31) + C13605g.m872j(m4964f())) * 31) + C13605g.m872j(m4967c())) * 31) + C13605g.m872j(m4968b())) * 31) + Boolean.hashCode(this.f29432B);
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
