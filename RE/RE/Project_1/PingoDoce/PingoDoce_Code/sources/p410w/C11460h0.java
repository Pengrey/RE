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
/* renamed from: w.h0 */
/* loaded from: classes.dex */
public final class C11460h0 extends AbstractC0820x0 implements LayoutModifier {

    /* renamed from: A */
    private final float f29372A;

    /* renamed from: B */
    private final boolean f29373B;

    /* renamed from: x */
    private final float f29374x;

    /* renamed from: y */
    private final float f29375y;

    /* renamed from: z */
    private final float f29376z;

    /* compiled from: Size.kt */
    /* renamed from: w.h0$a */
    /* loaded from: classes.dex */
    static final class C11461a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f29377w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11461a(Placeable placeable) {
            super(1);
            this.f29377w = placeable;
        }

        /* renamed from: a */
        public final void m5066a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f29377w, 0, 0, 0.0f, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5066a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    public /* synthetic */ C11460h0(float f, float f2, float f3, float f4, boolean z, InterfaceC6108l interfaceC6108l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13605g.f34597x.m868b() : f, (i & 2) != 0 ? C13605g.f34597x.m868b() : f2, (i & 4) != 0 ? C13605g.f34597x.m868b() : f3, (i & 8) != 0 ? C13605g.f34597x.m868b() : f4, z, interfaceC6108l, null);
    }

    public /* synthetic */ C11460h0(float f, float f2, float f3, float f4, boolean z, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, interfaceC6108l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m5069b(p479z1.Density r8) {
        /*
            r7 = this;
            float r0 = r7.f29376z
            z1.g$a r1 = p479z1.C13605g.f34597x
            float r2 = r1.m868b()
            boolean r0 = p479z1.C13605g.m873i(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L30
            float r0 = r7.f29376z
            z1.g r0 = p479z1.C13605g.m878d(r0)
            float r4 = (float) r3
            float r4 = p479z1.C13605g.m875g(r4)
            z1.g r4 = p479z1.C13605g.m878d(r4)
            java.lang.Comparable r0 = p297pd.C8613g.m15020f(r0, r4)
            z1.g r0 = (p479z1.C13605g) r0
            float r0 = r0.m870l()
            int r0 = r8.m898O(r0)
            goto L31
        L30:
            r0 = r2
        L31:
            float r4 = r7.f29372A
            float r5 = r1.m868b()
            boolean r4 = p479z1.C13605g.m873i(r4, r5)
            if (r4 != 0) goto L5b
            float r4 = r7.f29372A
            z1.g r4 = p479z1.C13605g.m878d(r4)
            float r5 = (float) r3
            float r5 = p479z1.C13605g.m875g(r5)
            z1.g r5 = p479z1.C13605g.m878d(r5)
            java.lang.Comparable r4 = p297pd.C8613g.m15020f(r4, r5)
            z1.g r4 = (p479z1.C13605g) r4
            float r4 = r4.m870l()
            int r4 = r8.m898O(r4)
            goto L5c
        L5b:
            r4 = r2
        L5c:
            float r5 = r7.f29374x
            float r6 = r1.m868b()
            boolean r5 = p479z1.C13605g.m873i(r5, r6)
            if (r5 != 0) goto L79
            float r5 = r7.f29374x
            int r5 = r8.m898O(r5)
            int r5 = p297pd.C8613g.m15017i(r5, r0)
            int r5 = p297pd.C8613g.m15022d(r5, r3)
            if (r5 == r2) goto L79
            goto L7a
        L79:
            r5 = r3
        L7a:
            float r6 = r7.f29375y
            float r1 = r1.m868b()
            boolean r1 = p479z1.C13605g.m873i(r6, r1)
            if (r1 != 0) goto L97
            float r1 = r7.f29375y
            int r8 = r8.m898O(r1)
            int r8 = p297pd.C8613g.m15017i(r8, r4)
            int r8 = p297pd.C8613g.m15022d(r8, r3)
            if (r8 == r2) goto L97
            r3 = r8
        L97:
            long r0 = p479z1.C13601c.m907a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410w.C11460h0.m5069b(z1.d):long");
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return LayoutModifier.C5802a.m23011a(this, interfaceC6108l);
    }

    /* renamed from: S */
    public InterfaceC5805t m5071S(MeasureScope measureScope, InterfaceC5803r interfaceC5803r, long j) {
        int m15000i;
        int m15005d;
        int m15000i2;
        int m15005d2;
        long m907a;
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(interfaceC5803r, "measurable");
        long m5069b = m5069b(measureScope);
        if (this.f29373B) {
            m907a = C13601c.m903e(j, m5069b);
        } else {
            float f = this.f29374x;
            C13605g.C13606a c13606a = C13605g.f34597x;
            if (!C13605g.m873i(f, c13606a.m868b())) {
                m15000i = C13599b.m914p(m5069b);
            } else {
                m15000i = _Ranges.m15000i(C13599b.m914p(j), C13599b.m916n(m5069b));
            }
            if (!C13605g.m873i(this.f29376z, c13606a.m868b())) {
                m15005d = C13599b.m916n(m5069b);
            } else {
                m15005d = _Ranges.m15005d(C13599b.m916n(j), C13599b.m914p(m5069b));
            }
            if (!C13605g.m873i(this.f29375y, c13606a.m868b())) {
                m15000i2 = C13599b.m915o(m5069b);
            } else {
                m15000i2 = _Ranges.m15000i(C13599b.m915o(j), C13599b.m917m(m5069b));
            }
            if (!C13605g.m873i(this.f29372A, c13606a.m868b())) {
                m15005d2 = C13599b.m917m(m5069b);
            } else {
                m15005d2 = _Ranges.m15005d(C13599b.m917m(j), C13599b.m915o(m5069b));
            }
            m907a = C13601c.m907a(m15000i, m15005d, m15000i2, m15005d2);
        }
        Placeable mo23007n = interfaceC5803r.mo23007n(m907a);
        return MeasureScope.C5806a.m22999b(measureScope, mo23007n.m23177q0(), mo23007n.m23182l0(), null, new C11461a(mo23007n), 4, null);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23009c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11460h0) {
            C11460h0 c11460h0 = (C11460h0) obj;
            return C13605g.m873i(this.f29374x, c11460h0.f29374x) && C13605g.m873i(this.f29375y, c11460h0.f29375y) && C13605g.m873i(this.f29376z, c11460h0.f29376z) && C13605g.m873i(this.f29372A, c11460h0.f29372A) && this.f29373B == c11460h0.f29373B;
        }
        return false;
    }

    public int hashCode() {
        return ((((((C13605g.m872j(this.f29374x) * 31) + C13605g.m872j(this.f29375y)) * 31) + C13605g.m872j(this.f29376z)) * 31) + C13605g.m872j(this.f29372A)) * 31;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return LayoutModifier.C5802a.m23010b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return LayoutModifier.C5802a.m23008d(this, interfaceC9570f);
    }

    private C11460h0(float f, float f2, float f3, float f4, boolean z, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f29374x = f;
        this.f29375y = f2;
        this.f29376z = f3;
        this.f29372A = f4;
        this.f29373B = z;
    }
}
