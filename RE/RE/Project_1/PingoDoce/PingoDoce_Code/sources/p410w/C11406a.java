package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p127h1.AbstractC5743a;
import p127h1.AlignmentLine;
import p127h1.C5767g;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5805t;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13605g;

/* compiled from: AlignmentLine.kt */
/* renamed from: w.a */
/* loaded from: classes.dex */
public final class C11406a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlignmentLine.kt */
    /* renamed from: w.a$a */
    /* loaded from: classes.dex */
    public static final class C11407a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ int f29265A;

        /* renamed from: B */
        final /* synthetic */ Placeable f29266B;

        /* renamed from: C */
        final /* synthetic */ int f29267C;

        /* renamed from: w */
        final /* synthetic */ AbstractC5743a f29268w;

        /* renamed from: x */
        final /* synthetic */ float f29269x;

        /* renamed from: y */
        final /* synthetic */ int f29270y;

        /* renamed from: z */
        final /* synthetic */ int f29271z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11407a(AbstractC5743a abstractC5743a, float f, int i, int i2, int i3, Placeable placeable, int i4) {
            super(1);
            this.f29268w = abstractC5743a;
            this.f29269x = f;
            this.f29270y = i;
            this.f29271z = i2;
            this.f29265A = i3;
            this.f29266B = placeable;
            this.f29267C = i4;
        }

        /* renamed from: a */
        public final void m5210a(Placeable.AbstractC5751a abstractC5751a) {
            int m23177q0;
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            int i = 0;
            if (C11406a.m5216b(this.f29268w)) {
                m23177q0 = 0;
            } else {
                m23177q0 = !C13605g.m873i(this.f29269x, C13605g.f34597x.m868b()) ? this.f29270y : (this.f29271z - this.f29265A) - this.f29266B.m23177q0();
            }
            if (C11406a.m5216b(this.f29268w)) {
                i = !C13605g.m873i(this.f29269x, C13605g.f34597x.m868b()) ? this.f29270y : (this.f29267C - this.f29265A) - this.f29266B.m23182l0();
            }
            Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f29266B, m23177q0, i, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5210a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.a$b */
    /* loaded from: classes.dex */
    public static final class C11408b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ AbstractC5743a f29272w;

        /* renamed from: x */
        final /* synthetic */ float f29273x;

        /* renamed from: y */
        final /* synthetic */ float f29274y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11408b(AbstractC5743a abstractC5743a, float f, float f2) {
            super(1);
            this.f29272w = abstractC5743a;
            this.f29273x = f;
            this.f29274y = f2;
        }

        /* renamed from: a */
        public final void m5209a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("paddingFrom");
            c0816w0.m39492a().m39649b("alignmentLine", this.f29272w);
            c0816w0.m39492a().m39649b("before", C13605g.m878d(this.f29273x));
            c0816w0.m39492a().m39649b("after", C13605g.m878d(this.f29274y));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5209a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC5805t m5217a(MeasureScope measureScope, AbstractC5743a abstractC5743a, float f, float f2, InterfaceC5803r interfaceC5803r, long j) {
        return m5215c(measureScope, abstractC5743a, f, f2, interfaceC5803r, j);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m5216b(AbstractC5743a abstractC5743a) {
        return m5214d(abstractC5743a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC5805t m5215c(MeasureScope measureScope, AbstractC5743a abstractC5743a, float f, float f2, InterfaceC5803r interfaceC5803r, long j) {
        int m14996m;
        int m14996m2;
        int max;
        int m23182l0;
        Placeable mo23007n = interfaceC5803r.mo23007n(m5214d(abstractC5743a) ? C13599b.m925e(j, 0, 0, 0, 0, 11, null) : C13599b.m925e(j, 0, 0, 0, 0, 14, null));
        int mo22989p = mo23007n.mo22989p(abstractC5743a);
        if (mo22989p == Integer.MIN_VALUE) {
            mo22989p = 0;
        }
        int m23182l02 = m5214d(abstractC5743a) ? mo23007n.m23182l0() : mo23007n.m23177q0();
        int m917m = m5214d(abstractC5743a) ? C13599b.m917m(j) : C13599b.m916n(j);
        C13605g.C13606a c13606a = C13605g.f34597x;
        int i = m917m - m23182l02;
        m14996m = _Ranges.m14996m((!C13605g.m873i(f, c13606a.m868b()) ? measureScope.m898O(f) : 0) - mo22989p, 0, i);
        m14996m2 = _Ranges.m14996m(((!C13605g.m873i(f2, c13606a.m868b()) ? measureScope.m898O(f2) : 0) - m23182l02) + mo22989p, 0, i - m14996m);
        if (m5214d(abstractC5743a)) {
            max = mo23007n.m23177q0();
        } else {
            max = Math.max(mo23007n.m23177q0() + m14996m + m14996m2, C13599b.m914p(j));
        }
        int i2 = max;
        if (m5214d(abstractC5743a)) {
            m23182l0 = Math.max(mo23007n.m23182l0() + m14996m + m14996m2, C13599b.m915o(j));
        } else {
            m23182l0 = mo23007n.m23182l0();
        }
        int i3 = m23182l0;
        return MeasureScope.C5806a.m22999b(measureScope, i2, i3, null, new C11407a(abstractC5743a, f, m14996m, i2, m14996m2, mo23007n, i3), 4, null);
    }

    /* renamed from: d */
    private static final boolean m5214d(AbstractC5743a abstractC5743a) {
        return abstractC5743a instanceof C5767g;
    }

    /* renamed from: e */
    public static final InterfaceC9570f m5213e(InterfaceC9570f interfaceC9570f, AbstractC5743a abstractC5743a, float f, float f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$paddingFrom");
        Intrinsics.isThisObjectNull(abstractC5743a, "alignmentLine");
        return interfaceC9570f.mo7205u(new C11411b(abstractC5743a, f, f2, C0812v0.m39495c() ? new C11408b(abstractC5743a, f, f2) : C0812v0.m39497a(), null));
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC9570f m5212f(InterfaceC9570f interfaceC9570f, AbstractC5743a abstractC5743a, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C13605g.f34597x.m868b();
        }
        if ((i & 4) != 0) {
            f2 = C13605g.f34597x.m868b();
        }
        return m5213e(interfaceC9570f, abstractC5743a, f, f2);
    }

    /* renamed from: g */
    public static final InterfaceC9570f m5211g(InterfaceC9570f interfaceC9570f, float f, float f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$paddingFromBaseline");
        C13605g.C13606a c13606a = C13605g.f34597x;
        return interfaceC9570f.mo7205u(!C13605g.m873i(f2, c13606a.m868b()) ? m5212f(interfaceC9570f, AlignmentLine.m23197b(), 0.0f, f2, 2, null) : InterfaceC9570f.f25164r).mo7205u(!C13605g.m873i(f, c13606a.m868b()) ? m5212f(interfaceC9570f, AlignmentLine.m23198a(), f, 0.0f, 4, null) : InterfaceC9570f.f25164r);
    }
}
