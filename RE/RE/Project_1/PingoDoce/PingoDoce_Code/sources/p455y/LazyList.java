package p455y;

import androidx.compose.foundation.lazy.LazyListState;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.Map;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p127h1.InterfaceC5805t;
import p127h1.MeasureScope;
import p169j1.C6267j0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p357t.Scroll;
import p372u.InterfaceC10754p;
import p372u.InterfaceC10764v;
import p373u0.C10783m;
import p410w.Arrangement;
import p410w.InterfaceC11498x;
import p410w.Padding;
import p432x.C12222l;
import p432x.InterfaceC12217f;
import p432x.InterfaceC12220h;
import p432x.InterfaceC12232r;
import p432x.LazyLayoutPlaceable;
import p432x.LazyMeasurePolicy;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13614l;
import p479z1.Density;
import p489zc.C13769l0;

/* renamed from: y.n */
/* loaded from: classes.dex */
public final class LazyList {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyList.kt */
    /* renamed from: y.n$a */
    /* loaded from: classes.dex */
    public static final class C13029a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5242r1 f33816w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13029a(InterfaceC5242r1 interfaceC5242r1) {
            super(0);
            this.f33816w = interfaceC5242r1;
        }

        /* renamed from: a */
        public final InterfaceC12217f mo42214q() {
            return (InterfaceC12217f) this.f33816w.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyList.kt */
    /* renamed from: y.n$b */
    /* loaded from: classes.dex */
    public static final class C13030b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ boolean f33817A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10754p f33818B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC9560a.InterfaceC9562b f33819C;

        /* renamed from: D */
        final /* synthetic */ Arrangement.InterfaceC11424k f33820D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC9560a.InterfaceC9563c f33821E;

        /* renamed from: F */
        final /* synthetic */ Arrangement.InterfaceC11416d f33822F;

        /* renamed from: G */
        final /* synthetic */ InterfaceC6108l f33823G;

        /* renamed from: H */
        final /* synthetic */ int f33824H;

        /* renamed from: I */
        final /* synthetic */ int f33825I;

        /* renamed from: J */
        final /* synthetic */ int f33826J;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f33827w;

        /* renamed from: x */
        final /* synthetic */ LazyListState f33828x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC11498x f33829y;

        /* renamed from: z */
        final /* synthetic */ boolean f33830z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13030b(InterfaceC9570f interfaceC9570f, LazyListState lazyListState, InterfaceC11498x interfaceC11498x, boolean z, boolean z2, InterfaceC10754p interfaceC10754p, InterfaceC9560a.InterfaceC9562b interfaceC9562b, Arrangement.InterfaceC11424k interfaceC11424k, InterfaceC9560a.InterfaceC9563c interfaceC9563c, Arrangement.InterfaceC11416d interfaceC11416d, InterfaceC6108l interfaceC6108l, int i, int i2, int i3) {
            super(2);
            this.f33827w = interfaceC9570f;
            this.f33828x = lazyListState;
            this.f33829y = interfaceC11498x;
            this.f33830z = z;
            this.f33817A = z2;
            this.f33818B = interfaceC10754p;
            this.f33819C = interfaceC9562b;
            this.f33820D = interfaceC11424k;
            this.f33821E = interfaceC9563c;
            this.f33822F = interfaceC11416d;
            this.f33823G = interfaceC6108l;
            this.f33824H = i;
            this.f33825I = i2;
            this.f33826J = i3;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m1863a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m1863a(InterfaceC5179i interfaceC5179i, int i) {
            LazyList.m1871a(this.f33827w, this.f33828x, this.f33829y, this.f33830z, this.f33817A, this.f33818B, this.f33819C, this.f33820D, this.f33821E, this.f33822F, this.f33823G, interfaceC5179i, this.f33824H | 1, this.f33825I, this.f33826J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyList.kt */
    /* renamed from: y.n$c */
    /* loaded from: classes.dex */
    public static final class C13031c implements InterfaceC12232r {

        /* renamed from: a */
        final /* synthetic */ boolean f33831a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11498x f33832b;

        /* renamed from: c */
        final /* synthetic */ boolean f33833c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC5242r1 f33834d;

        /* renamed from: e */
        final /* synthetic */ LazyListState f33835e;

        /* renamed from: f */
        final /* synthetic */ C6267j0 f33836f;

        /* renamed from: g */
        final /* synthetic */ Arrangement.InterfaceC11424k f33837g;

        /* renamed from: h */
        final /* synthetic */ Arrangement.InterfaceC11416d f33838h;

        /* renamed from: i */
        final /* synthetic */ LazyListItemPlacementAnimator f33839i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC9560a.InterfaceC9562b f33840j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC9560a.InterfaceC9563c f33841k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC10764v f33842l;

        /* compiled from: LazyList.kt */
        /* renamed from: y.n$c$a */
        /* loaded from: classes.dex */
        static final class C13032a extends AbstractC6438m implements InterfaceC6113q {

            /* renamed from: w */
            final /* synthetic */ MeasureScope f33843w;

            /* renamed from: x */
            final /* synthetic */ long f33844x;

            /* renamed from: y */
            final /* synthetic */ int f33845y;

            /* renamed from: z */
            final /* synthetic */ int f33846z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13032a(MeasureScope measureScope, long j, int i, int i2) {
                super(3);
                this.f33843w = measureScope;
                this.f33844x = j;
                this.f33845y = i;
                this.f33846z = i2;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                return m1860a(((Number) obj).intValue(), ((Number) obj2).intValue(), (InterfaceC6108l) obj3);
            }

            /* renamed from: a */
            public final InterfaceC5805t m1860a(int i, int i2, InterfaceC6108l interfaceC6108l) {
                Map m334e;
                Intrinsics.isThisObjectNull(interfaceC6108l, "placement");
                MeasureScope measureScope = this.f33843w;
                int m901g = C13601c.m901g(this.f33844x, i + this.f33845y);
                int m902f = C13601c.m902f(this.f33844x, i2 + this.f33846z);
                m334e = C13769l0.m334e();
                return measureScope.m23001s(m901g, m902f, m334e, interfaceC6108l);
            }
        }

        /* compiled from: LazyList.kt */
        /* renamed from: y.n$c$b */
        /* loaded from: classes.dex */
        static final class C13033b implements InterfaceC13054x {

            /* renamed from: a */
            final /* synthetic */ int f33847a;

            /* renamed from: b */
            final /* synthetic */ int f33848b;

            /* renamed from: c */
            final /* synthetic */ MeasureScope f33849c;

            /* renamed from: d */
            final /* synthetic */ int f33850d;

            /* renamed from: e */
            final /* synthetic */ int f33851e;

            /* renamed from: f */
            final /* synthetic */ boolean f33852f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC9560a.InterfaceC9562b f33853g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC9560a.InterfaceC9563c f33854h;

            /* renamed from: i */
            final /* synthetic */ boolean f33855i;

            /* renamed from: j */
            final /* synthetic */ int f33856j;

            /* renamed from: k */
            final /* synthetic */ int f33857k;

            /* renamed from: l */
            final /* synthetic */ LazyListItemPlacementAnimator f33858l;

            C13033b(int i, int i2, MeasureScope measureScope, int i3, int i4, boolean z, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC9560a.InterfaceC9563c interfaceC9563c, boolean z2, int i5, int i6, LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
                this.f33847a = i;
                this.f33848b = i2;
                this.f33849c = measureScope;
                this.f33850d = i3;
                this.f33851e = i4;
                this.f33852f = z;
                this.f33853g = interfaceC9562b;
                this.f33854h = interfaceC9563c;
                this.f33855i = z2;
                this.f33856j = i5;
                this.f33857k = i6;
                this.f33858l = lazyListItemPlacementAnimator;
            }

            /* renamed from: a */
            public final C13043u mo1784a(int i, Object obj, LazyLayoutPlaceable[] lazyLayoutPlaceableArr) {
                Intrinsics.isThisObjectNull(obj, "key");
                Intrinsics.isThisObjectNull(lazyLayoutPlaceableArr, "placeables");
                return new C13043u(i, lazyLayoutPlaceableArr, this.f33852f, this.f33853g, this.f33854h, this.f33849c.getLayoutDirection(), this.f33855i, this.f33856j, this.f33857k, this.f33858l, i == this.f33847a + (-1) ? 0 : this.f33848b, C13614l.m833a(this.f33850d, this.f33851e), obj, null);
            }
        }

        C13031c(boolean z, InterfaceC11498x interfaceC11498x, boolean z2, InterfaceC5242r1 interfaceC5242r1, LazyListState lazyListState, C6267j0 c6267j0, Arrangement.InterfaceC11424k interfaceC11424k, Arrangement.InterfaceC11416d interfaceC11416d, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC9560a.InterfaceC9563c interfaceC9563c, InterfaceC10764v interfaceC10764v) {
            this.f33831a = z;
            this.f33832b = interfaceC11498x;
            this.f33833c = z2;
            this.f33834d = interfaceC5242r1;
            this.f33835e = lazyListState;
            this.f33836f = c6267j0;
            this.f33837g = interfaceC11424k;
            this.f33838h = interfaceC11416d;
            this.f33839i = lazyListItemPlacementAnimator;
            this.f33840j = interfaceC9562b;
            this.f33841k = interfaceC9563c;
            this.f33842l = interfaceC10764v;
        }

        /* renamed from: a */
        public final InterfaceC12220h mo3324a(MeasureScope measureScope, LazyMeasurePolicy lazyMeasurePolicy, long j) {
            int i;
            float m5161a;
            int m916n;
            Intrinsics.isThisObjectNull(measureScope, "$this$LazyMeasurePolicy");
            Intrinsics.isThisObjectNull(lazyMeasurePolicy, "placeablesProvider");
            Scroll.m8285b(j, this.f33831a);
            int m898O = measureScope.m898O(Padding.m4982g(this.f33832b, measureScope.getLayoutDirection()));
            int m898O2 = measureScope.m898O(Padding.m4983f(this.f33832b, measureScope.getLayoutDirection()));
            int m898O3 = measureScope.m898O(this.f33832b.mo4958c());
            int m898O4 = measureScope.m898O(this.f33832b.mo4959b());
            int i2 = m898O3 + m898O4;
            int i3 = m898O + m898O2;
            boolean z = this.f33831a;
            int i4 = z ? i2 : i3;
            if (z && !this.f33833c) {
                i = m898O3;
            } else if (z && this.f33833c) {
                i = m898O4;
            } else {
                i = (z || this.f33833c) ? m898O2 : m898O;
            }
            int i5 = i4 - i;
            long m900h = C13601c.m900h(j, -i3, -i2);
            InterfaceC13023k interfaceC13023k = (InterfaceC13023k) this.f33834d.getValue();
            this.f33835e.m40011y(interfaceC13023k);
            this.f33835e.m40016t(measureScope);
            LazyList.m1869c(this.f33836f, measureScope, m900h);
            if (this.f33831a) {
                Arrangement.InterfaceC11424k interfaceC11424k = this.f33837g;
                if (interfaceC11424k == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                m5161a = interfaceC11424k.m5145a();
            } else {
                Arrangement.InterfaceC11416d interfaceC11416d = this.f33838h;
                if (interfaceC11416d == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                m5161a = interfaceC11416d.m5161a();
            }
            int m898O5 = measureScope.m898O(m5161a);
            int mo3321c = interfaceC13023k.mo3321c();
            boolean z2 = this.f33831a;
            C13044v c13044v = new C13044v(m900h, z2, interfaceC13023k, lazyMeasurePolicy, new C13033b(mo3321c, m898O5, measureScope, m898O, m898O3, z2, this.f33840j, this.f33841k, this.f33833c, i, i5, this.f33839i), null);
            C12222l m40022n = this.f33835e.m40022n();
            if (m40022n != null) {
                m40022n.m3360d(c13044v.m1799b());
            }
            if (this.f33831a) {
                m916n = C13599b.m917m(j) - i2;
            } else {
                m916n = C13599b.m916n(j) - i3;
            }
            LazyListMeasureResult m1858b = LazyListMeasure.m1858b(mo3321c, c13044v, m916n, i, i5, this.f33835e.m40028h(), this.f33835e.m40026j(), this.f33835e.m40021o(), m900h, this.f33831a, interfaceC13023k.mo1885d(), this.f33837g, this.f33838h, this.f33833c, measureScope, measureScope.getLayoutDirection(), this.f33839i, new C13032a(measureScope, j, i3, i2));
            LazyListState lazyListState = this.f33835e;
            InterfaceC10764v interfaceC10764v = this.f33842l;
            lazyListState.m40031e(m1858b);
            LazyList.m1870b(interfaceC10764v, m1858b, j, i3, i2);
            return m1858b.m1845k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1871a(p302q0.InterfaceC9570f r30, androidx.compose.foundation.lazy.LazyListState r31, p410w.InterfaceC11498x r32, boolean r33, boolean r34, p372u.InterfaceC10754p r35, p302q0.InterfaceC9560a.InterfaceC9562b r36, p410w.Arrangement.InterfaceC11424k r37, p302q0.InterfaceC9560a.InterfaceC9563c r38, p410w.Arrangement.InterfaceC11416d r39, id.InterfaceC6108l r40, p092f0.InterfaceC5179i r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p455y.LazyList.m1871a(q0.f, androidx.compose.foundation.lazy.g, w.x, boolean, boolean, u.p, q0.a$b, w.c$k, q0.a$c, w.c$d, id.l, f0.i, int, int, int):void");
    }

    /* renamed from: b */
    public static final /* synthetic */ void m1870b(InterfaceC10764v interfaceC10764v, LazyListMeasureResult lazyListMeasureResult, long j, int i, int i2) {
        m1868d(interfaceC10764v, lazyListMeasureResult, j, i, i2);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m1869c(C6267j0 c6267j0, Density density, long j) {
        m1866f(c6267j0, density, j);
    }

    /* renamed from: d */
    private static final void m1868d(InterfaceC10764v interfaceC10764v, LazyListMeasureResult lazyListMeasureResult, long j, int i, int i2) {
        boolean m1849g = lazyListMeasureResult.m1849g();
        C13043u m1847i = lazyListMeasureResult.m1847i();
        boolean z = false;
        boolean z2 = ((m1847i == null ? 0 : m1847i.m1805b()) == 0 && lazyListMeasureResult.m1846j() == 0) ? false : true;
        long m7085a = C10783m.m7085a(C13601c.m901g(j, lazyListMeasureResult.mo23004b() + i), C13601c.m902f(j, lazyListMeasureResult.mo23005a() + i2));
        if (m1849g || z2) {
            z = true;
        }
        interfaceC10764v.mo7194f(m7085a, z);
    }

    /* renamed from: e */
    private static final InterfaceC12232r m1867e(InterfaceC5242r1 interfaceC5242r1, C6267j0 c6267j0, LazyListState lazyListState, InterfaceC10764v interfaceC10764v, InterfaceC11498x interfaceC11498x, boolean z, boolean z2, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC9560a.InterfaceC9563c interfaceC9563c, Arrangement.InterfaceC11416d interfaceC11416d, Arrangement.InterfaceC11424k interfaceC11424k, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, InterfaceC5179i interfaceC5179i, int i, int i2, int i3) {
        interfaceC5179i.mo25263g(208079303);
        InterfaceC9560a.InterfaceC9562b interfaceC9562b2 = (i3 & 128) != 0 ? null : interfaceC9562b;
        InterfaceC9560a.InterfaceC9563c interfaceC9563c2 = (i3 & 256) != 0 ? null : interfaceC9563c;
        Arrangement.InterfaceC11416d interfaceC11416d2 = (i3 & 512) != 0 ? null : interfaceC11416d;
        Arrangement.InterfaceC11424k interfaceC11424k2 = (i3 & 1024) != 0 ? null : interfaceC11424k;
        int i4 = 0;
        Object[] objArr = {lazyListState, interfaceC10764v, interfaceC11498x, Boolean.valueOf(z), Boolean.valueOf(z2), interfaceC9562b2, interfaceC9563c2, interfaceC11416d2, interfaceC11424k2, lazyListItemPlacementAnimator};
        interfaceC5179i.mo25263g(-3685570);
        boolean z3 = false;
        while (i4 < 10) {
            Object obj = objArr[i4];
            i4++;
            z3 |= interfaceC5179i.mo25276I(obj);
        }
        Object mo25262h = interfaceC5179i.mo25262h();
        if (z3 || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new C13031c(z2, interfaceC11498x, z, interfaceC5242r1, lazyListState, c6267j0, interfaceC11424k2, interfaceC11416d2, lazyListItemPlacementAnimator, interfaceC9562b2, interfaceC9563c2, interfaceC10764v);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC12232r interfaceC12232r = (InterfaceC12232r) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC12232r;
    }

    /* renamed from: f */
    private static final void m1866f(C6267j0 c6267j0, Density density, long j) {
        C13019f c13019f = (C13019f) c6267j0.m21595a();
        if (c13019f != null && Intrinsics.equals(c13019f.m1901b(), density) && C13599b.m923g(c13019f.m1902a(), j)) {
            return;
        }
        c6267j0.m21594b(new C13019f(density, j, null));
    }
}
