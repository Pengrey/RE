package p051d0;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5255u0;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.AlignmentLine;
import p127h1.C5797m;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.Layout;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p297pd._Ranges;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p393v0.InterfaceC11001b1;
import p410w.Arrangement;
import p410w.C11406a;
import p410w.C11430e;
import p410w.C11440f;
import p410w.C11473l;
import p410w.Column;
import p410w.InterfaceC11428d0;
import p410w.Padding;
import p410w.Size;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13605g;
import p479z1.Density;
import p479z1.EnumC13618o;
import p489zc.C13777q;

/* renamed from: d0.y0 */
/* loaded from: classes.dex */
public final class Snackbar {

    /* renamed from: c */
    private static final float f12742c;

    /* renamed from: f */
    private static final float f12745f;

    /* renamed from: a */
    private static final float f12740a = C13605g.m875g(30);

    /* renamed from: b */
    private static final float f12741b = C13605g.m875g(16);

    /* renamed from: d */
    private static final float f12743d = C13605g.m875g(2);

    /* renamed from: e */
    private static final float f12744e = C13605g.m875g(6);

    /* renamed from: g */
    private static final float f12746g = C13605g.m875g(12);

    /* renamed from: h */
    private static final float f12747h = C13605g.m875g(48);

    /* renamed from: i */
    private static final float f12748i = C13605g.m875g(68);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$a */
    /* loaded from: classes.dex */
    public static final class C4680a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f12749w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12750x;

        /* renamed from: y */
        final /* synthetic */ int f12751y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4680a(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, int i) {
            super(2);
            this.f12749w = interfaceC6112p;
            this.f12750x = interfaceC6112p2;
            this.f12751y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26967a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26967a(InterfaceC5179i interfaceC5179i, int i) {
            Snackbar.m26974f(this.f12749w, this.f12750x, interfaceC5179i, this.f12751y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$b */
    /* loaded from: classes.dex */
    public static final class C4681b implements InterfaceC5804s {

        /* renamed from: a */
        final /* synthetic */ String f12752a;

        /* renamed from: b */
        final /* synthetic */ String f12753b;

        /* compiled from: Snackbar.kt */
        /* renamed from: d0.y0$b$a */
        /* loaded from: classes.dex */
        static final class C4682a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ int f12754A;

            /* renamed from: w */
            final /* synthetic */ Placeable f12755w;

            /* renamed from: x */
            final /* synthetic */ int f12756x;

            /* renamed from: y */
            final /* synthetic */ Placeable f12757y;

            /* renamed from: z */
            final /* synthetic */ int f12758z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4682a(Placeable placeable, int i, Placeable placeable2, int i2, int i3) {
                super(1);
                this.f12755w = placeable;
                this.f12756x = i;
                this.f12757y = placeable2;
                this.f12758z = i2;
                this.f12754A = i3;
            }

            /* renamed from: a */
            public final void m26966a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f12755w, 0, this.f12756x, 0.0f, 4, null);
                Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f12757y, this.f12758z, this.f12754A, 0.0f, 4, null);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m26966a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C4681b(String str, String str2) {
            this.f12752a = str;
            this.f12753b = str2;
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            int m15005d;
            int max;
            int i;
            int m23182l0;
            Intrinsics.isThisObjectNull(measureScope, "$this$Layout");
            Intrinsics.isThisObjectNull(list, "measurables");
            String str = this.f12752a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC5803r interfaceC5803r = (InterfaceC5803r) it.next();
                if (Intrinsics.equals(C5797m.m23020a(interfaceC5803r), str)) {
                    Placeable mo23007n = interfaceC5803r.mo23007n(j);
                    m15005d = _Ranges.m15005d((C13599b.m916n(j) - mo23007n.m23177q0()) - measureScope.m898O(Snackbar.m26968l()), C13599b.m914p(j));
                    String str2 = this.f12753b;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC5803r interfaceC5803r2 = (InterfaceC5803r) it2.next();
                        if (Intrinsics.equals(C5797m.m23020a(interfaceC5803r2), str2)) {
                            Placeable mo23007n2 = interfaceC5803r2.mo23007n(C13599b.m925e(j, 0, m15005d, 0, 0, 9, null));
                            int mo22989p = mo23007n2.mo22989p(AlignmentLine.m23198a());
                            if (mo22989p != Integer.MIN_VALUE) {
                                int mo22989p2 = mo23007n2.mo22989p(AlignmentLine.m23197b());
                                if (mo22989p2 != Integer.MIN_VALUE) {
                                    boolean z = mo22989p == mo22989p2;
                                    int m916n = C13599b.m916n(j) - mo23007n.m23177q0();
                                    if (z) {
                                        int max2 = Math.max(measureScope.m898O(Snackbar.m26970j()), mo23007n.m23182l0());
                                        int m23182l02 = (max2 - mo23007n2.m23182l0()) / 2;
                                        int mo22989p3 = mo23007n.mo22989p(AlignmentLine.m23198a());
                                        int i2 = mo22989p3 != Integer.MIN_VALUE ? (mo22989p + m23182l02) - mo22989p3 : 0;
                                        max = max2;
                                        m23182l0 = i2;
                                        i = m23182l02;
                                    } else {
                                        int m898O = measureScope.m898O(Snackbar.m26971i()) - mo22989p;
                                        max = Math.max(measureScope.m898O(Snackbar.m26969k()), mo23007n2.m23182l0() + m898O);
                                        i = m898O;
                                        m23182l0 = (max - mo23007n.m23182l0()) / 2;
                                    }
                                    return MeasureScope.C5806a.m22999b(measureScope, C13599b.m916n(j), max, null, new C4682a(mo23007n2, i, mo23007n, m916n, m23182l0), 4, null);
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$c */
    /* loaded from: classes.dex */
    public static final class C4683c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f12759w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12760x;

        /* renamed from: y */
        final /* synthetic */ int f12761y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4683c(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, int i) {
            super(2);
            this.f12759w = interfaceC6112p;
            this.f12760x = interfaceC6112p2;
            this.f12761y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26965a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26965a(InterfaceC5179i interfaceC5179i, int i) {
            Snackbar.m26973g(this.f12759w, this.f12760x, interfaceC5179i, this.f12761y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$d */
    /* loaded from: classes.dex */
    public static final class C4684d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f12762w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12763x;

        /* renamed from: y */
        final /* synthetic */ int f12764y;

        /* renamed from: z */
        final /* synthetic */ boolean f12765z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* renamed from: d0.y0$d$a */
        /* loaded from: classes.dex */
        public static final class C4685a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6112p f12766w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6112p f12767x;

            /* renamed from: y */
            final /* synthetic */ int f12768y;

            /* renamed from: z */
            final /* synthetic */ boolean f12769z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Snackbar.kt */
            /* renamed from: d0.y0$d$a$a */
            /* loaded from: classes.dex */
            public static final class C4686a extends AbstractC6438m implements InterfaceC6112p {

                /* renamed from: w */
                final /* synthetic */ InterfaceC6112p f12770w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC6112p f12771x;

                /* renamed from: y */
                final /* synthetic */ int f12772y;

                /* renamed from: z */
                final /* synthetic */ boolean f12773z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4686a(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, int i, boolean z) {
                    super(2);
                    this.f12770w = interfaceC6112p;
                    this.f12771x = interfaceC6112p2;
                    this.f12772y = i;
                    this.f12773z = z;
                }

                /* renamed from: F */
                public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                    m26962a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                    return C13195u.f34156a;
                }

                /* renamed from: a */
                public final void m26962a(InterfaceC5179i interfaceC5179i, int i) {
                    if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                        interfaceC5179i.mo25264f();
                    } else if (this.f12770w == null) {
                        interfaceC5179i.mo25263g(59708346);
                        Snackbar.m26972h(this.f12771x, interfaceC5179i, (this.f12772y >> 21) & 14);
                        interfaceC5179i.mo25282C();
                    } else if (this.f12773z) {
                        interfaceC5179i.mo25263g(59708411);
                        InterfaceC6112p interfaceC6112p = this.f12771x;
                        InterfaceC6112p interfaceC6112p2 = this.f12770w;
                        int i2 = this.f12772y;
                        Snackbar.m26974f(interfaceC6112p, interfaceC6112p2, interfaceC5179i, (i2 & 112) | ((i2 >> 21) & 14));
                        interfaceC5179i.mo25282C();
                    } else {
                        interfaceC5179i.mo25263g(59708478);
                        InterfaceC6112p interfaceC6112p3 = this.f12771x;
                        InterfaceC6112p interfaceC6112p4 = this.f12770w;
                        int i3 = this.f12772y;
                        Snackbar.m26973g(interfaceC6112p3, interfaceC6112p4, interfaceC5179i, (i3 & 112) | ((i3 >> 21) & 14));
                        interfaceC5179i.mo25282C();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4685a(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, int i, boolean z) {
                super(2);
                this.f12766w = interfaceC6112p;
                this.f12767x = interfaceC6112p2;
                this.f12768y = i;
                this.f12769z = z;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m26963a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m26963a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    Text.m27188a(C4591j0.f12477a.m27115c(interfaceC5179i, 6).m27121b(), ComposableLambda.m19327b(interfaceC5179i, -819890387, true, new C4686a(this.f12766w, this.f12767x, this.f12768y, this.f12769z)), interfaceC5179i, 48);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4684d(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, int i, boolean z) {
            super(2);
            this.f12762w = interfaceC6112p;
            this.f12763x = interfaceC6112p2;
            this.f12764y = i;
            this.f12765z = z;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26964a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26964a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                CompositionLocal.m24954a(new C5255u0[]{C4598l.m27102a().m24909c(Float.valueOf(C4594k.f12480a.m27108c(interfaceC5179i, 6)))}, ComposableLambda.m19327b(interfaceC5179i, -819890248, true, new C4685a(this.f12762w, this.f12763x, this.f12764y, this.f12765z)), interfaceC5179i, 56);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$e */
    /* loaded from: classes.dex */
    public static final class C4687e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ long f12774A;

        /* renamed from: B */
        final /* synthetic */ long f12775B;

        /* renamed from: C */
        final /* synthetic */ float f12776C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6112p f12777D;

        /* renamed from: E */
        final /* synthetic */ int f12778E;

        /* renamed from: F */
        final /* synthetic */ int f12779F;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f12780w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12781x;

        /* renamed from: y */
        final /* synthetic */ boolean f12782y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC11001b1 f12783z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4687e(InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, boolean z, InterfaceC11001b1 interfaceC11001b1, long j, long j2, float f, InterfaceC6112p interfaceC6112p2, int i, int i2) {
            super(2);
            this.f12780w = interfaceC9570f;
            this.f12781x = interfaceC6112p;
            this.f12782y = z;
            this.f12783z = interfaceC11001b1;
            this.f12774A = j;
            this.f12775B = j2;
            this.f12776C = f;
            this.f12777D = interfaceC6112p2;
            this.f12778E = i;
            this.f12779F = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26961a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26961a(InterfaceC5179i interfaceC5179i, int i) {
            Snackbar.m26977c(this.f12780w, this.f12781x, this.f12782y, this.f12783z, this.f12774A, this.f12775B, this.f12776C, this.f12777D, interfaceC5179i, this.f12778E | 1, this.f12779F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$f */
    /* loaded from: classes.dex */
    public static final class C4688f extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC4656t0 f12784w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4688f(InterfaceC4656t0 interfaceC4656t0) {
            super(2);
            this.f12784w = interfaceC4656t0;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26960a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26960a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                Text.m27187b(this.f12784w.m27018b(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5179i, 0, 0, 65534);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$g */
    /* loaded from: classes.dex */
    public static final class C4689g extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ long f12785A;

        /* renamed from: B */
        final /* synthetic */ long f12786B;

        /* renamed from: C */
        final /* synthetic */ long f12787C;

        /* renamed from: D */
        final /* synthetic */ float f12788D;

        /* renamed from: E */
        final /* synthetic */ int f12789E;

        /* renamed from: F */
        final /* synthetic */ int f12790F;

        /* renamed from: w */
        final /* synthetic */ InterfaceC4656t0 f12791w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12792x;

        /* renamed from: y */
        final /* synthetic */ boolean f12793y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC11001b1 f12794z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4689g(InterfaceC4656t0 interfaceC4656t0, InterfaceC9570f interfaceC9570f, boolean z, InterfaceC11001b1 interfaceC11001b1, long j, long j2, long j3, float f, int i, int i2) {
            super(2);
            this.f12791w = interfaceC4656t0;
            this.f12792x = interfaceC9570f;
            this.f12793y = z;
            this.f12794z = interfaceC11001b1;
            this.f12785A = j;
            this.f12786B = j2;
            this.f12787C = j3;
            this.f12788D = f;
            this.f12789E = i;
            this.f12790F = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26959a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26959a(InterfaceC5179i interfaceC5179i, int i) {
            Snackbar.m26976d(this.f12791w, this.f12792x, this.f12793y, this.f12794z, this.f12785A, this.f12786B, this.f12787C, this.f12788D, interfaceC5179i, this.f12789E | 1, this.f12790F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$h */
    /* loaded from: classes.dex */
    public static final class C4690h extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ long f12795w;

        /* renamed from: x */
        final /* synthetic */ int f12796x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC4656t0 f12797y;

        /* renamed from: z */
        final /* synthetic */ String f12798z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* renamed from: d0.y0$h$a */
        /* loaded from: classes.dex */
        public static final class C4691a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC4656t0 f12799w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4691a(InterfaceC4656t0 interfaceC4656t0) {
                super(0);
                this.f12799w = interfaceC4656t0;
            }

            /* renamed from: a */
            public final void m26957a() {
                this.f12799w.m27017c();
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m26957a();
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* renamed from: d0.y0$h$b */
        /* loaded from: classes.dex */
        public static final class C4692b extends AbstractC6438m implements InterfaceC6113q {

            /* renamed from: w */
            final /* synthetic */ String f12800w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4692b(String str) {
                super(3);
                this.f12800w = str;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                m26956a((InterfaceC11428d0) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m26956a(InterfaceC11428d0 interfaceC11428d0, InterfaceC5179i interfaceC5179i, int i) {
                Intrinsics.isThisObjectNull(interfaceC11428d0, "$this$TextButton");
                if (((i & 81) ^ 16) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    Text.m27187b(this.f12800w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5179i, 0, 0, 65534);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4690h(long j, int i, InterfaceC4656t0 interfaceC4656t0, String str) {
            super(2);
            this.f12795w = j;
            this.f12796x = i;
            this.f12797y = interfaceC4656t0;
            this.f12798z = str;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26958a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26958a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
                return;
            }
            Button.m27197c(new C4691a(this.f12797y), null, false, null, null, null, null, C4539d.f12261a.m27255g(0L, this.f12795w, 0L, interfaceC5179i, ((this.f12796x >> 15) & 112) | 3072, 5), null, ComposableLambda.m19327b(interfaceC5179i, -819890024, true, new C4692b(this.f12798z)), interfaceC5179i, 805306368, 382);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$i */
    /* loaded from: classes.dex */
    public static final class C4693i implements InterfaceC5804s {

        /* renamed from: a */
        public static final C4693i f12801a = new C4693i();

        /* compiled from: Snackbar.kt */
        /* renamed from: d0.y0$i$a */
        /* loaded from: classes.dex */
        static final class C4694a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ int f12802w;

            /* renamed from: x */
            final /* synthetic */ Placeable f12803x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4694a(int i, Placeable placeable) {
                super(1);
                this.f12802w = i;
                this.f12803x = placeable;
            }

            /* renamed from: a */
            public final void m26955a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                Placeable.AbstractC5751a.m23159n(abstractC5751a, this.f12803x, 0, (this.f12802w - this.f12803x.m23182l0()) / 2, 0.0f, 4, null);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m26955a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C4693i() {
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            float m26969k;
            Intrinsics.isThisObjectNull(measureScope, "$this$Layout");
            Intrinsics.isThisObjectNull(list, "measurables");
            if (list.size() == 1) {
                Placeable mo23007n = ((InterfaceC5803r) C13777q.m256L(list)).mo23007n(j);
                int mo22989p = mo23007n.mo22989p(AlignmentLine.m23198a());
                int mo22989p2 = mo23007n.mo22989p(AlignmentLine.m23197b());
                if (mo22989p != Integer.MIN_VALUE) {
                    if (mo22989p2 != Integer.MIN_VALUE) {
                        if (mo22989p == mo22989p2) {
                            m26969k = Snackbar.m26970j();
                        } else {
                            m26969k = Snackbar.m26969k();
                        }
                        int max = Math.max(measureScope.m898O(m26969k), mo23007n.m23182l0());
                        return MeasureScope.C5806a.m22999b(measureScope, C13599b.m916n(j), max, null, new C4694a(max, mo23007n), 4, null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* renamed from: d0.y0$j */
    /* loaded from: classes.dex */
    public static final class C4695j extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f12804w;

        /* renamed from: x */
        final /* synthetic */ int f12805x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4695j(InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12804w = interfaceC6112p;
            this.f12805x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26954a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26954a(InterfaceC5179i interfaceC5179i, int i) {
            Snackbar.m26972h(this.f12804w, interfaceC5179i, this.f12805x | 1);
        }
    }

    static {
        float f = 8;
        f12742c = C13605g.m875g(f);
        f12745f = C13605g.m875g(f);
    }

    /* renamed from: a */
    private static final void m26979a(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-829912271);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC6112p) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6112p2) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            InterfaceC9570f m5096m = Size.m5096m(c9571a, 0.0f, 1, null);
            float f = f12741b;
            float f2 = f12742c;
            InterfaceC9570f m4976m = Padding.m4976m(m5096m, f, 0.0f, f2, f12743d, 2, null);
            mo25249u.mo25263g(-1113030915);
            Arrangement.InterfaceC11424k m5175d = Arrangement.f29297a.m5175d();
            InterfaceC9560a.C9561a c9561a = InterfaceC9560a.f25145a;
            InterfaceC5804s m5060a = Column.m5060a(m5175d, c9561a.m10591e(), mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(m4976m);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a, m5060a, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(276693625);
            C11473l c11473l = C11473l.f29399a;
            mo25249u.mo25263g(71171629);
            InterfaceC9570f m4976m2 = Padding.m4976m(C11406a.m5211g(c9571a, f12740a, f12746g), 0.0f, 0.0f, f2, 0.0f, 11, null);
            mo25249u.mo25263g(-1990474327);
            InterfaceC5804s m5118i = C11430e.m5118i(c9561a.m10589g(), false, mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density2 = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o2 = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            InterfaceC6097a m21776a2 = c6227a.m21776a();
            InterfaceC6113q m23014a2 = Layout.m23014a(m4976m2);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a2);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a2 = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a2, m5118i, c6227a.m21773d());
            C5262w1.m24854c(m24856a2, density2, c6227a.m21775b());
            C5262w1.m24854c(m24856a2, enumC13618o2, c6227a.m21774c());
            C5262w1.m24854c(m24856a2, viewConfiguration2, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a2.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253629305);
            C11440f c11440f = C11440f.f29335a;
            mo25249u.mo25263g(683214577);
            interfaceC6112p.mo39856d(mo25249u, Integer.valueOf(i2 & 14));
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            InterfaceC9570f mo5046a = c11473l.mo5046a(c9571a, c9561a.m10592d());
            mo25249u.mo25263g(-1990474327);
            InterfaceC5804s m5118i2 = C11430e.m5118i(c9561a.m10589g(), false, mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density3 = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o3 = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            InterfaceC6097a m21776a3 = c6227a.m21776a();
            InterfaceC6113q m23014a3 = Layout.m23014a(mo5046a);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a3);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a3 = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a3, m5118i2, c6227a.m21773d());
            C5262w1.m24854c(m24856a3, density3, c6227a.m21775b());
            C5262w1.m24854c(m24856a3, enumC13618o3, c6227a.m21774c());
            C5262w1.m24854c(m24856a3, viewConfiguration3, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a3.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253629305);
            mo25249u.mo25263g(683214631);
            interfaceC6112p2.mo39856d(mo25249u, Integer.valueOf((i2 >> 3) & 14));
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4680a(interfaceC6112p, interfaceC6112p2, i));
    }

    /* renamed from: b */
    private static final void m26978b(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-1143069261);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC6112p) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6112p2) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            InterfaceC9570f m4976m = Padding.m4976m(c9571a, f12741b, 0.0f, f12742c, 0.0f, 10, null);
            C4681b c4681b = new C4681b("action", "text");
            mo25249u.mo25263g(1376089394);
            Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(m4976m);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a, c4681b, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-849178871);
            InterfaceC9570f m4978k = Padding.m4978k(C5797m.m23019b(c9571a, "text"), 0.0f, f12744e, 1, null);
            mo25249u.mo25263g(-1990474327);
            InterfaceC9560a.C9561a c9561a = InterfaceC9560a.f25145a;
            InterfaceC5804s m5118i = C11430e.m5118i(c9561a.m10589g(), false, mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density2 = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o2 = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            InterfaceC6097a m21776a2 = c6227a.m21776a();
            InterfaceC6113q m23014a2 = Layout.m23014a(m4978k);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a2);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a2 = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a2, m5118i, c6227a.m21773d());
            C5262w1.m24854c(m24856a2, density2, c6227a.m21775b());
            C5262w1.m24854c(m24856a2, enumC13618o2, c6227a.m21774c());
            C5262w1.m24854c(m24856a2, viewConfiguration2, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a2.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253629305);
            C11440f c11440f = C11440f.f29335a;
            mo25249u.mo25263g(-202240392);
            interfaceC6112p.mo39856d(mo25249u, Integer.valueOf(i2 & 14));
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            InterfaceC9570f m23019b = C5797m.m23019b(c9571a, "action");
            mo25249u.mo25263g(-1990474327);
            InterfaceC5804s m5118i2 = C11430e.m5118i(c9561a.m10589g(), false, mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density3 = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o3 = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            InterfaceC6097a m21776a3 = c6227a.m21776a();
            InterfaceC6113q m23014a3 = Layout.m23014a(m23019b);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a3);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a3 = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a3, m5118i2, c6227a.m21773d());
            C5262w1.m24854c(m24856a3, density3, c6227a.m21775b());
            C5262w1.m24854c(m24856a3, enumC13618o3, c6227a.m21774c());
            C5262w1.m24854c(m24856a3, viewConfiguration3, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a3.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253629305);
            mo25249u.mo25263g(-202240335);
            interfaceC6112p2.mo39856d(mo25249u, Integer.valueOf((i2 >> 3) & 14));
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4683c(interfaceC6112p, interfaceC6112p2, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m26977c(p302q0.InterfaceC9570f r29, id.InterfaceC6112p r30, boolean r31, p393v0.InterfaceC11001b1 r32, long r33, long r35, float r37, id.InterfaceC6112p r38, p092f0.InterfaceC5179i r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Snackbar.m26977c(q0.f, id.p, boolean, v0.b1, long, long, float, id.p, f0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m26976d(p051d0.InterfaceC4656t0 r29, p302q0.InterfaceC9570f r30, boolean r31, p393v0.InterfaceC11001b1 r32, long r33, long r35, long r37, float r39, p092f0.InterfaceC5179i r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Snackbar.m26976d(d0.t0, q0.f, boolean, v0.b1, long, long, long, float, f0.i, int, int):void");
    }

    /* renamed from: e */
    private static final void m26975e(InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-868771705);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC6112p) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((2 ^ (i2 & 11)) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            C4693i c4693i = C4693i.f12801a;
            mo25249u.mo25263g(1376089394);
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(c9571a);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a, c4693i, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1987608331);
            InterfaceC9570f m4979j = Padding.m4979j(c9571a, f12741b, f12744e);
            mo25249u.mo25263g(-1990474327);
            InterfaceC5804s m5118i = C11430e.m5118i(InterfaceC9560a.f25145a.m10589g(), false, mo25249u, 0);
            mo25249u.mo25263g(1376089394);
            Density density2 = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o2 = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            InterfaceC6097a m21776a2 = c6227a.m21776a();
            InterfaceC6113q m23014a2 = Layout.m23014a(m4979j);
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a2);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a2 = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a2, m5118i, c6227a.m21773d());
            C5262w1.m24854c(m24856a2, density2, c6227a.m21775b());
            C5262w1.m24854c(m24856a2, enumC13618o2, c6227a.m21774c());
            C5262w1.m24854c(m24856a2, viewConfiguration2, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a2.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253629305);
            C11440f c11440f = C11440f.f29335a;
            mo25249u.mo25263g(1159675981);
            interfaceC6112p.mo39856d(mo25249u, Integer.valueOf(i2 & 14));
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4695j(interfaceC6112p, i));
    }

    /* renamed from: f */
    public static final /* synthetic */ void m26974f(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, InterfaceC5179i interfaceC5179i, int i) {
        m26979a(interfaceC6112p, interfaceC6112p2, interfaceC5179i, i);
    }

    /* renamed from: g */
    public static final /* synthetic */ void m26973g(InterfaceC6112p interfaceC6112p, InterfaceC6112p interfaceC6112p2, InterfaceC5179i interfaceC5179i, int i) {
        m26978b(interfaceC6112p, interfaceC6112p2, interfaceC5179i, i);
    }

    /* renamed from: h */
    public static final /* synthetic */ void m26972h(InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        m26975e(interfaceC6112p, interfaceC5179i, i);
    }

    /* renamed from: i */
    public static final /* synthetic */ float m26971i() {
        return f12740a;
    }

    /* renamed from: j */
    public static final /* synthetic */ float m26970j() {
        return f12747h;
    }

    /* renamed from: k */
    public static final /* synthetic */ float m26969k() {
        return f12748i;
    }

    /* renamed from: l */
    public static final /* synthetic */ float m26968l() {
        return f12745f;
    }
}
