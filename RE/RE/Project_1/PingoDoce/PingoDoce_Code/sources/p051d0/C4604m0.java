package p051d0;

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
import p220ld.C7037c;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13610j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TouchTarget.kt */
/* renamed from: d0.m0 */
/* loaded from: classes.dex */
public final class C4604m0 implements LayoutModifier {

    /* renamed from: w */
    private final long f12498w;

    /* compiled from: TouchTarget.kt */
    /* renamed from: d0.m0$a */
    /* loaded from: classes.dex */
    static final class C4605a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ int f12499w;

        /* renamed from: x */
        final /* synthetic */ Placeable f12500x;

        /* renamed from: y */
        final /* synthetic */ int f12501y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4605a(int i, Placeable placeable, int i2) {
            super(1);
            this.f12499w = i;
            this.f12500x = placeable;
            this.f12501y = i2;
        }

        /* renamed from: a */
        public final void m27094a(Placeable.AbstractC5751a abstractC5751a) {
            int m19530c;
            int m19530c2;
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            m19530c = C7037c.m19530c((this.f12499w - this.f12500x.m23177q0()) / 2.0f);
            m19530c2 = C7037c.m19530c((this.f12501y - this.f12500x.m23182l0()) / 2.0f);
            Placeable.AbstractC5751a.m23163j(abstractC5751a, this.f12500x, m19530c, m19530c2, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27094a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    private C4604m0(long j) {
        this.f12498w = j;
    }

    public /* synthetic */ C4604m0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m27096S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        Placeable mo23007n = interfaceC5803r.mo23007n(j);
        int max = Math.max(mo23007n.m23177q0(), measureScope.m898O(C13610j.m850f(m27095a())));
        int max2 = Math.max(mo23007n.m23182l0(), measureScope.m898O(C13610j.m851e(m27095a())));
        return MeasureScope.C5806a.m22999b(measureScope, max, max2, null, new C4605a(max, mo23007n, max2), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    /* renamed from: a */
    public final long m27095a() {
        return this.f12498w;
    }

    public boolean equals(Object obj) {
        C4604m0 c4604m0 = obj instanceof C4604m0 ? (C4604m0) obj : null;
        if (c4604m0 == null) {
            return false;
        }
        return C13610j.m852d(m27095a(), c4604m0.m27095a());
    }

    public int hashCode() {
        return C13610j.m849g(m27095a());
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
