package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p479z1.EnumC13618o;

/* renamed from: w.f0 */
/* loaded from: classes.dex */
public final class Size {

    /* renamed from: a */
    private static final C11483o f29336a = m5106c(1.0f);

    /* renamed from: b */
    private static final C11483o f29337b = m5108a(1.0f);

    /* renamed from: c */
    private static final C11483o f29338c = m5107b(1.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$a */
    /* loaded from: classes.dex */
    public static final class C11441a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29339w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11441a(float f) {
            super(1);
            this.f29339w = f;
        }

        /* renamed from: a */
        public final void m5091a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("fillMaxHeight");
            c0816w0.m39492a().m39649b("fraction", Float.valueOf(this.f29339w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5091a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$b */
    /* loaded from: classes.dex */
    public static final class C11442b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29340w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11442b(float f) {
            super(1);
            this.f29340w = f;
        }

        /* renamed from: a */
        public final void m5090a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("fillMaxSize");
            c0816w0.m39492a().m39649b("fraction", Float.valueOf(this.f29340w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5090a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$c */
    /* loaded from: classes.dex */
    public static final class C11443c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29341w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11443c(float f) {
            super(1);
            this.f29341w = f;
        }

        /* renamed from: a */
        public final void m5089a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("fillMaxWidth");
            c0816w0.m39492a().m39649b("fraction", Float.valueOf(this.f29341w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5089a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$d */
    /* loaded from: classes.dex */
    public static final class C11444d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a.InterfaceC9563c f29342w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11444d(InterfaceC9560a.InterfaceC9563c interfaceC9563c) {
            super(2);
            this.f29342w = interfaceC9563c;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return C13612k.m845b(m5088a(((C13615m) obj).m821j(), (EnumC13618o) obj2));
        }

        /* renamed from: a */
        public final long m5088a(long j, EnumC13618o enumC13618o) {
            Intrinsics.isThisObjectNull(enumC13618o, "$noName_1");
            return C13614l.m833a(0, this.f29342w.mo10587a(0, C13615m.m825f(j)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$e */
    /* loaded from: classes.dex */
    public static final class C11445e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a.InterfaceC9563c f29343w;

        /* renamed from: x */
        final /* synthetic */ boolean f29344x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11445e(InterfaceC9560a.InterfaceC9563c interfaceC9563c, boolean z) {
            super(1);
            this.f29343w = interfaceC9563c;
            this.f29344x = z;
        }

        /* renamed from: a */
        public final void m5087a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("wrapContentHeight");
            c0816w0.m39492a().m39649b("align", this.f29343w);
            c0816w0.m39492a().m39649b("unbounded", Boolean.valueOf(this.f29344x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5087a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$f */
    /* loaded from: classes.dex */
    public static final class C11446f extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a f29345w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11446f(InterfaceC9560a interfaceC9560a) {
            super(2);
            this.f29345w = interfaceC9560a;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return C13612k.m845b(m5086a(((C13615m) obj).m821j(), (EnumC13618o) obj2));
        }

        /* renamed from: a */
        public final long m5086a(long j, EnumC13618o enumC13618o) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            return this.f29345w.mo10596a(C13615m.f34610b.m820a(), j, enumC13618o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$g */
    /* loaded from: classes.dex */
    public static final class C11447g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a f29346w;

        /* renamed from: x */
        final /* synthetic */ boolean f29347x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11447g(InterfaceC9560a interfaceC9560a, boolean z) {
            super(1);
            this.f29346w = interfaceC9560a;
            this.f29347x = z;
        }

        /* renamed from: a */
        public final void m5085a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("wrapContentSize");
            c0816w0.m39492a().m39649b("align", this.f29346w);
            c0816w0.m39492a().m39649b("unbounded", Boolean.valueOf(this.f29347x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5085a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$h */
    /* loaded from: classes.dex */
    public static final class C11448h extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a.InterfaceC9562b f29348w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11448h(InterfaceC9560a.InterfaceC9562b interfaceC9562b) {
            super(2);
            this.f29348w = interfaceC9562b;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return C13612k.m845b(m5084a(((C13615m) obj).m821j(), (EnumC13618o) obj2));
        }

        /* renamed from: a */
        public final long m5084a(long j, EnumC13618o enumC13618o) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            return C13614l.m833a(this.f29348w.mo10588a(0, C13615m.m824g(j), enumC13618o), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Size.kt */
    /* renamed from: w.f0$i */
    /* loaded from: classes.dex */
    public static final class C11449i extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a.InterfaceC9562b f29349w;

        /* renamed from: x */
        final /* synthetic */ boolean f29350x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11449i(InterfaceC9560a.InterfaceC9562b interfaceC9562b, boolean z) {
            super(1);
            this.f29349w = interfaceC9562b;
            this.f29350x = z;
        }

        /* renamed from: a */
        public final void m5083a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$$receiver");
            c0816w0.m39491b("wrapContentWidth");
            c0816w0.m39492a().m39649b("align", this.f29349w);
            c0816w0.m39492a().m39649b("unbounded", Boolean.valueOf(this.f29350x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5083a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.f0$j */
    /* loaded from: classes.dex */
    public static final class C11450j extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29351w;

        /* renamed from: x */
        final /* synthetic */ float f29352x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11450j(float f, float f2) {
            super(1);
            this.f29351w = f;
            this.f29352x = f2;
        }

        /* renamed from: a */
        public final void m5082a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("defaultMinSize");
            c0816w0.m39492a().m39649b("minWidth", C13605g.m878d(this.f29351w));
            c0816w0.m39492a().m39649b("minHeight", C13605g.m878d(this.f29352x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5082a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.f0$k */
    /* loaded from: classes.dex */
    public static final class C11451k extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29353w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11451k(float f) {
            super(1);
            this.f29353w = f;
        }

        /* renamed from: a */
        public final void m5081a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("height");
            c0816w0.m39490c(C13605g.m878d(this.f29353w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5081a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.f0$l */
    /* loaded from: classes.dex */
    public static final class C11452l extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29354w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11452l(float f) {
            super(1);
            this.f29354w = f;
        }

        /* renamed from: a */
        public final void m5080a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("size");
            c0816w0.m39490c(C13605g.m878d(this.f29354w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5080a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.f0$m */
    /* loaded from: classes.dex */
    public static final class C11453m extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29355w;

        /* renamed from: x */
        final /* synthetic */ float f29356x;

        /* renamed from: y */
        final /* synthetic */ float f29357y;

        /* renamed from: z */
        final /* synthetic */ float f29358z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11453m(float f, float f2, float f3, float f4) {
            super(1);
            this.f29355w = f;
            this.f29356x = f2;
            this.f29357y = f3;
            this.f29358z = f4;
        }

        /* renamed from: a */
        public final void m5079a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("sizeIn");
            c0816w0.m39492a().m39649b("minWidth", C13605g.m878d(this.f29355w));
            c0816w0.m39492a().m39649b("minHeight", C13605g.m878d(this.f29356x));
            c0816w0.m39492a().m39649b("maxWidth", C13605g.m878d(this.f29357y));
            c0816w0.m39492a().m39649b("maxHeight", C13605g.m878d(this.f29358z));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5079a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.f0$n */
    /* loaded from: classes.dex */
    public static final class C11454n extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29359w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11454n(float f) {
            super(1);
            this.f29359w = f;
        }

        /* renamed from: a */
        public final void m5078a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("width");
            c0816w0.m39490c(C13605g.m878d(this.f29359w));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5078a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    static {
        InterfaceC9560a.C9561a c9561a = InterfaceC9560a.f25145a;
        m5103f(c9561a.m10594b(), false);
        m5103f(c9561a.m10591e(), false);
        m5105d(c9561a.m10593c(), false);
        m5105d(c9561a.m10590f(), false);
        m5104e(c9561a.m10595a(), false);
        m5104e(c9561a.m10589g(), false);
    }

    /* renamed from: a */
    private static final C11483o m5108a(float f) {
        return new C11483o(EnumC11482n.Vertical, f, new C11441a(f));
    }

    /* renamed from: b */
    private static final C11483o m5107b(float f) {
        return new C11483o(EnumC11482n.Both, f, new C11442b(f));
    }

    /* renamed from: c */
    private static final C11483o m5106c(float f) {
        return new C11483o(EnumC11482n.Horizontal, f, new C11443c(f));
    }

    /* renamed from: d */
    private static final C11471k0 m5105d(InterfaceC9560a.InterfaceC9563c interfaceC9563c, boolean z) {
        return new C11471k0(EnumC11482n.Vertical, z, new C11444d(interfaceC9563c), interfaceC9563c, new C11445e(interfaceC9563c, z));
    }

    /* renamed from: e */
    private static final C11471k0 m5104e(InterfaceC9560a interfaceC9560a, boolean z) {
        return new C11471k0(EnumC11482n.Both, z, new C11446f(interfaceC9560a), interfaceC9560a, new C11447g(interfaceC9560a, z));
    }

    /* renamed from: f */
    private static final C11471k0 m5103f(InterfaceC9560a.InterfaceC9562b interfaceC9562b, boolean z) {
        return new C11471k0(EnumC11482n.Horizontal, z, new C11448h(interfaceC9562b), interfaceC9562b, new C11449i(interfaceC9562b, z));
    }

    /* renamed from: g */
    public static final InterfaceC9570f m5102g(InterfaceC9570f interfaceC9570f, float f, float f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$defaultMinSize");
        return interfaceC9570f.mo7205u(new C11468j0(f, f2, C0812v0.m39495c() ? new C11450j(f, f2) : C0812v0.m39497a(), null));
    }

    /* renamed from: h */
    public static final InterfaceC9570f m5101h(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return interfaceC9570f.mo7205u((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? f29337b : m5108a(f));
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC9570f m5100i(InterfaceC9570f interfaceC9570f, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m5101h(interfaceC9570f, f);
    }

    /* renamed from: j */
    public static final InterfaceC9570f m5099j(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return interfaceC9570f.mo7205u((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? f29338c : m5107b(f));
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC9570f m5098k(InterfaceC9570f interfaceC9570f, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m5099j(interfaceC9570f, f);
    }

    /* renamed from: l */
    public static final InterfaceC9570f m5097l(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return interfaceC9570f.mo7205u((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? f29336a : m5106c(f));
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC9570f m5096m(InterfaceC9570f interfaceC9570f, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m5097l(interfaceC9570f, f);
    }

    /* renamed from: n */
    public static final InterfaceC9570f m5095n(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$height");
        return interfaceC9570f.mo7205u(new C11460h0(0.0f, f, 0.0f, f, true, C0812v0.m39495c() ? new C11451k(f) : C0812v0.m39497a(), 5, null));
    }

    /* renamed from: o */
    public static final InterfaceC9570f m5094o(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$size");
        return interfaceC9570f.mo7205u(new C11460h0(f, f, f, f, true, C0812v0.m39495c() ? new C11452l(f) : C0812v0.m39497a(), null));
    }

    /* renamed from: p */
    public static final InterfaceC9570f m5093p(InterfaceC9570f interfaceC9570f, float f, float f2, float f3, float f4) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$sizeIn");
        return interfaceC9570f.mo7205u(new C11460h0(f, f2, f3, f4, true, C0812v0.m39495c() ? new C11453m(f, f2, f3, f4) : C0812v0.m39497a(), null));
    }

    /* renamed from: q */
    public static final InterfaceC9570f m5092q(InterfaceC9570f interfaceC9570f, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$width");
        return interfaceC9570f.mo7205u(new C11460h0(f, 0.0f, f, 0.0f, true, C0812v0.m39495c() ? new C11454n(f) : C0812v0.m39497a(), 10, null));
    }
}
