package androidx.compose.foundation.lazy;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p244n0.InterfaceC7575i;
import p244n0.InterfaceC7579k;
import p244n0.ListSaver;
import p357t.EnumC10314o;
import p372u.InterfaceC10653c0;
import p372u.InterfaceC10675f0;
import p372u.ScrollableState;
import p392v.C10986l;
import p392v.InterfaceC10987m;
import p432x.C12222l;
import p432x.LazyLayoutState;
import p455y.C13015a;
import p455y.C13043u;
import p455y.InterfaceC13023k;
import p455y.LazyListItemPlacementAnimator;
import p455y.LazyListMeasureResult;
import p455y.LazyListScrollPosition;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13604f;
import p479z1.Density;
import p489zc.C13777q;
import p489zc.C13780s;

/* renamed from: androidx.compose.foundation.lazy.g */
/* loaded from: classes.dex */
public final class LazyListState implements InterfaceC10675f0 {

    /* renamed from: p */
    public static final C0638c f1976p = new C0638c(null);

    /* renamed from: q */
    private static final InterfaceC7575i f1977q = ListSaver.m18154a(C0636a.f1993w, C0637b.f1994w);

    /* renamed from: a */
    private final LazyListScrollPosition f1978a;

    /* renamed from: b */
    private final InterfaceC5220m0 f1979b;

    /* renamed from: c */
    private final InterfaceC10987m f1980c;

    /* renamed from: d */
    private float f1981d;

    /* renamed from: e */
    private Density f1982e;

    /* renamed from: f */
    private final InterfaceC10675f0 f1983f;

    /* renamed from: g */
    private int f1984g;

    /* renamed from: h */
    private boolean f1985h;

    /* renamed from: i */
    private int f1986i;

    /* renamed from: j */
    private boolean f1987j;

    /* renamed from: k */
    private LazyLayoutState f1988k;

    /* renamed from: l */
    private final InterfaceC5220m0 f1989l;

    /* renamed from: m */
    private boolean f1990m;

    /* renamed from: n */
    private boolean f1991n;

    /* renamed from: o */
    private C12222l f1992o;

    /* compiled from: LazyListState.kt */
    /* renamed from: androidx.compose.foundation.lazy.g$a */
    /* loaded from: classes.dex */
    static final class C0636a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C0636a f1993w = new C0636a();

        C0636a() {
            super(2);
        }

        /* renamed from: a */
        public final List mo39856d(InterfaceC7579k interfaceC7579k, LazyListState lazyListState) {
            List m194j;
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$listSaver");
            Intrinsics.isThisObjectNull(lazyListState, "it");
            m194j = C13780s.m194j(Integer.valueOf(lazyListState.m40029g()), Integer.valueOf(lazyListState.m40027i()));
            return m194j;
        }
    }

    /* compiled from: LazyListState.kt */
    /* renamed from: androidx.compose.foundation.lazy.g$b */
    /* loaded from: classes.dex */
    static final class C0637b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0637b f1994w = new C0637b();

        C0637b() {
            super(1);
        }

        /* renamed from: a */
        public final LazyListState mo9587d(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    /* compiled from: LazyListState.kt */
    /* renamed from: androidx.compose.foundation.lazy.g$c */
    /* loaded from: classes.dex */
    public static final class C0638c {
        private C0638c() {
        }

        public /* synthetic */ C0638c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC7575i m40008a() {
            return LazyListState.m40032d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListState.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", m20196f = "LazyListState.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.g$d */
    /* loaded from: classes.dex */
    public static final class C0639d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f1995A;

        /* renamed from: x */
        int f1996x;

        /* renamed from: z */
        final /* synthetic */ int f1998z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0639d(int i, int i2, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f1998z = i;
            this.f1995A = i2;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0639d(this.f1998z, this.f1995A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10653c0 interfaceC10653c0, InterfaceC1886d interfaceC1886d) {
            return ((C0639d) create(interfaceC10653c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f1996x == 0) {
                C13186n.m1453b(obj);
                LazyListState.this.m40012x(this.f1998z, this.f1995A);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListState.kt */
    /* renamed from: androidx.compose.foundation.lazy.g$e */
    /* loaded from: classes.dex */
    public static final class C0640e extends AbstractC6438m implements InterfaceC6108l {
        C0640e() {
            super(1);
        }

        /* renamed from: a */
        public final Float m40006a(float f) {
            return Float.valueOf(-LazyListState.this.m40019q(-f));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m40006a(((Number) obj).floatValue());
        }
    }

    public LazyListState() {
        this(0, 0, 3, null);
    }

    public LazyListState(int i, int i2) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        this.f1978a = new LazyListScrollPosition(i, i2);
        m24962d = C5232o1.m24962d(C0630a.f1963a, null, 2, null);
        this.f1979b = m24962d;
        this.f1980c = C10986l.m6673a();
        this.f1982e = C13604f.m882a(1.0f, 1.0f);
        this.f1983f = ScrollableState.m7343a(new C0640e());
        this.f1985h = true;
        this.f1986i = -1;
        m24962d2 = C5232o1.m24962d(null, null, 2, null);
        this.f1989l = m24962d2;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC7575i m40032d() {
        return f1977q;
    }

    /* renamed from: p */
    private final void m40020p(float f) {
        int index;
        C12222l c12222l;
        if (this.f1985h) {
            InterfaceC0634e m40024l = m40024l();
            boolean z = true;
            if (!m40024l.mo40035c().isEmpty()) {
                boolean z2 = f < 0.0f;
                if (z2) {
                    index = ((InterfaceC0633d) C13777q.m249W(m40024l.mo40035c())).getIndex() + 1;
                } else {
                    index = ((InterfaceC0633d) C13777q.m256L(m40024l.mo40035c())).getIndex() - 1;
                }
                if (index != this.f1986i) {
                    if (index < 0 || index >= m40024l.mo40034f()) {
                        z = false;
                    }
                    if (z) {
                        if (this.f1987j != z2 && (c12222l = this.f1992o) != null) {
                            c12222l.m3362b(this.f1986i);
                        }
                        this.f1987j = z2;
                        this.f1986i = index;
                        C12222l c12222l2 = this.f1992o;
                        if (c12222l2 == null) {
                            return;
                        }
                        c12222l2.m3361c(index);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static /* synthetic */ Object m40017s(LazyListState lazyListState, int i, int i2, InterfaceC1886d interfaceC1886d, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.m40018r(i, i2, interfaceC1886d);
    }

    /* renamed from: a */
    public boolean mo7348a() {
        return this.f1983f.mo7348a();
    }

    /* renamed from: b */
    public Object mo7347b(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo7347b = this.f1983f.mo7347b(enumC10314o, interfaceC6112p, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo7347b == m34636d ? mo7347b : C13195u.f34156a;
    }

    /* renamed from: c */
    public float mo7346c(float f) {
        return this.f1983f.mo7346c(f);
    }

    /* renamed from: e */
    public final void m40031e(LazyListMeasureResult lazyListMeasureResult) {
        Intrinsics.isThisObjectNull(lazyListMeasureResult, "result");
        lazyListMeasureResult.mo40035c().size();
        this.f1978a.m1810g(lazyListMeasureResult);
        this.f1981d -= lazyListMeasureResult.m1848h();
        this.f1979b.setValue(lazyListMeasureResult);
        this.f1991n = lazyListMeasureResult.m1849g();
        C13043u m1847i = lazyListMeasureResult.m1847i();
        boolean z = false;
        if ((m1847i == null ? 0 : m1847i.m1805b()) != 0 || lazyListMeasureResult.m1846j() != 0) {
            z = true;
        }
        this.f1990m = z;
        this.f1984g++;
    }

    /* renamed from: f */
    public final boolean m40030f() {
        return this.f1991n;
    }

    /* renamed from: g */
    public final int m40029g() {
        return this.f1978a.m1815b();
    }

    /* renamed from: h */
    public final int m40028h() {
        return this.f1978a.m1816a();
    }

    /* renamed from: i */
    public final int m40027i() {
        return this.f1978a.m1814c();
    }

    /* renamed from: j */
    public final int m40026j() {
        return this.f1978a.m1813d();
    }

    /* renamed from: k */
    public final InterfaceC10987m m40025k() {
        return this.f1980c;
    }

    /* renamed from: l */
    public final InterfaceC0634e m40024l() {
        return (InterfaceC0634e) this.f1979b.getValue();
    }

    /* renamed from: m */
    public final LazyListItemPlacementAnimator m40023m() {
        return (LazyListItemPlacementAnimator) this.f1989l.getValue();
    }

    /* renamed from: n */
    public final C12222l m40022n() {
        return this.f1992o;
    }

    /* renamed from: o */
    public final float m40021o() {
        return this.f1981d;
    }

    /* renamed from: q */
    public final float m40019q(float f) {
        if ((f >= 0.0f || this.f1991n) && (f <= 0.0f || this.f1990m)) {
            if (Math.abs(this.f1981d) <= 0.5f) {
                float f2 = this.f1981d + f;
                this.f1981d = f2;
                if (Math.abs(f2) > 0.5f) {
                    float f3 = this.f1981d;
                    LazyLayoutState lazyLayoutState = this.f1988k;
                    if (lazyLayoutState != null) {
                        lazyLayoutState.m3335f();
                    }
                    if (this.f1985h && this.f1992o != null) {
                        m40020p(f3 - this.f1981d);
                    }
                }
                if (Math.abs(this.f1981d) <= 0.5f) {
                    return f;
                }
                float f4 = f - this.f1981d;
                this.f1981d = 0.0f;
                return f4;
            }
            throw new IllegalStateException(Intrinsics.addStrAndObj("entered drag with non-zero pending scroll: ", Float.valueOf(m40021o())).toString());
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final Object m40018r(int i, int i2, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7345a = InterfaceC10675f0.C10676a.m7345a(this.f1983f, null, new C0639d(i, i2, null), interfaceC1886d, 1, null);
        m34636d = C2116d.m34636d();
        return m7345a == m34636d ? m7345a : C13195u.f34156a;
    }

    /* renamed from: t */
    public final void m40016t(Density density) {
        Intrinsics.isThisObjectNull(density, "<set-?>");
        this.f1982e = density;
    }

    /* renamed from: u */
    public final void m40015u(LazyLayoutState lazyLayoutState) {
        this.f1988k = lazyLayoutState;
    }

    /* renamed from: v */
    public final void m40014v(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.f1989l.setValue(lazyListItemPlacementAnimator);
    }

    /* renamed from: w */
    public final void m40013w(C12222l c12222l) {
        this.f1992o = c12222l;
    }

    /* renamed from: x */
    public final void m40012x(int i, int i2) {
        this.f1978a.m1812e(C13015a.m1914a(i), i2);
        LazyListItemPlacementAnimator m40023m = m40023m();
        if (m40023m != null) {
            m40023m.m1893e();
        }
        LazyLayoutState lazyLayoutState = this.f1988k;
        if (lazyLayoutState == null) {
            return;
        }
        lazyLayoutState.m3335f();
    }

    /* renamed from: y */
    public final void m40011y(InterfaceC13023k interfaceC13023k) {
        Intrinsics.isThisObjectNull(interfaceC13023k, "itemsProvider");
        this.f1978a.m1809h(interfaceC13023k);
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
