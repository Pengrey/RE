package p051d0;

import androidx.compose.foundation.gestures.EnumC0627a;
import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.CompositionLocals;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p372u.C10730m;
import p392v.InterfaceC10987m;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.Density;
import p489zc.C13766i0;
import p489zc.C13780s;
import p489zc.CollectionsJVM;
import p489zc._Collections;
import td.InterfaceC10524i0;

/* compiled from: Swipeable.kt */
/* renamed from: d0.d1 */
/* loaded from: classes.dex */
public final class C4541d1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    /* renamed from: d0.d1$a */
    /* loaded from: classes.dex */
    public static final class C4542a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C4542a f12270w = new C4542a();

        C4542a() {
            super(2);
        }

        /* renamed from: a */
        public final C4540d0 mo39856d(Object obj, Object obj2) {
            return new C4540d0(C13605g.m875g(56), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    /* renamed from: d0.d1$b */
    /* loaded from: classes.dex */
    public static final class C4543b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ InterfaceC10987m f12271A;

        /* renamed from: B */
        final /* synthetic */ boolean f12272B;

        /* renamed from: C */
        final /* synthetic */ C4607n0 f12273C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6112p f12274D;

        /* renamed from: E */
        final /* synthetic */ float f12275E;

        /* renamed from: w */
        final /* synthetic */ Map f12276w;

        /* renamed from: x */
        final /* synthetic */ C4551e1 f12277x;

        /* renamed from: y */
        final /* synthetic */ EnumC0627a f12278y;

        /* renamed from: z */
        final /* synthetic */ boolean f12279z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Swipeable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableKt$swipeable$3$3", m20196f = "Swipeable.kt", m20195l = {607}, m20194m = "invokeSuspend")
        /* renamed from: d0.d1$b$a */
        /* loaded from: classes.dex */
        public static final class C4544a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ C4607n0 f12280A;

            /* renamed from: B */
            final /* synthetic */ Density f12281B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6112p f12282C;

            /* renamed from: D */
            final /* synthetic */ float f12283D;

            /* renamed from: x */
            int f12284x;

            /* renamed from: y */
            final /* synthetic */ C4551e1 f12285y;

            /* renamed from: z */
            final /* synthetic */ Map f12286z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Swipeable.kt */
            /* renamed from: d0.d1$b$a$a */
            /* loaded from: classes.dex */
            public static final class C4545a extends AbstractC6438m implements InterfaceC6112p {

                /* renamed from: w */
                final /* synthetic */ Map f12287w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC6112p f12288x;

                /* renamed from: y */
                final /* synthetic */ Density f12289y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4545a(Map map, InterfaceC6112p interfaceC6112p, Density density) {
                    super(2);
                    this.f12287w = map;
                    this.f12288x = interfaceC6112p;
                    this.f12289y = density;
                }

                /* renamed from: F */
                public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                    return m27244a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }

                /* renamed from: a */
                public final Float m27244a(float f, float f2) {
                    return Float.valueOf(((InterfaceC4579g1) this.f12288x.mo39856d(C13766i0.m397f(this.f12287w, Float.valueOf(f)), C13766i0.m397f(this.f12287w, Float.valueOf(f2)))).mo27149a(this.f12289y, f, f2));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4544a(C4551e1 c4551e1, Map map, C4607n0 c4607n0, Density density, InterfaceC6112p interfaceC6112p, float f, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f12285y = c4551e1;
                this.f12286z = map;
                this.f12280A = c4607n0;
                this.f12281B = density;
                this.f12282C = interfaceC6112p;
                this.f12283D = f;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C4544a(this.f12285y, this.f12286z, this.f12280A, this.f12281B, this.f12282C, this.f12283D, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C4544a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f12284x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Map m27220l = this.f12285y.m27220l();
                    this.f12285y.m27206z(this.f12286z);
                    this.f12285y.m27235E(this.f12280A);
                    this.f12285y.m27234F(new C4545a(this.f12286z, this.f12282C, this.f12281B));
                    this.f12285y.m27233G(this.f12281B.m899A(this.f12283D));
                    C4551e1 c4551e1 = this.f12285y;
                    Map map = this.f12286z;
                    this.f12284x = 1;
                    if (c4551e1.m27207y(m27220l, map, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Swipeable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableKt$swipeable$3$4", m20196f = "Swipeable.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: d0.d1$b$b */
        /* loaded from: classes.dex */
        public static final class C4546b extends AbstractC6764l implements InterfaceC6113q {

            /* renamed from: A */
            final /* synthetic */ C4551e1 f12290A;

            /* renamed from: x */
            int f12291x;

            /* renamed from: y */
            private /* synthetic */ Object f12292y;

            /* renamed from: z */
            /* synthetic */ float f12293z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Swipeable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", m20196f = "Swipeable.kt", m20195l = {616}, m20194m = "invokeSuspend")
            /* renamed from: d0.d1$b$b$a */
            /* loaded from: classes.dex */
            public static final class C4547a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f12294x;

                /* renamed from: y */
                final /* synthetic */ C4551e1 f12295y;

                /* renamed from: z */
                final /* synthetic */ float f12296z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4547a(C4551e1 c4551e1, float f, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f12295y = c4551e1;
                    this.f12296z = f;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C4547a(this.f12295y, this.f12296z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C4547a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f12294x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C4551e1 c4551e1 = this.f12295y;
                        float f = this.f12296z;
                        this.f12294x = 1;
                        if (c4551e1.m27208x(f, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4546b(C4551e1 c4551e1, InterfaceC1886d interfaceC1886d) {
                super(3, interfaceC1886d);
                this.f12290A = c4551e1;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                return m27243d((InterfaceC10524i0) obj, ((Number) obj2).floatValue(), (InterfaceC1886d) obj3);
            }

            /* renamed from: d */
            public final Object m27243d(InterfaceC10524i0 interfaceC10524i0, float f, InterfaceC1886d interfaceC1886d) {
                C4546b c4546b = new C4546b(this.f12290A, interfaceC1886d);
                c4546b.f12292y = interfaceC10524i0;
                c4546b.f12293z = f;
                return c4546b.invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f12291x == 0) {
                    C13186n.m1453b(obj);
                    C6772d.m20158d((InterfaceC10524i0) this.f12292y, null, null, new C4547a(this.f12290A, this.f12293z, null), 3, null);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4543b(Map map, C4551e1 c4551e1, EnumC0627a enumC0627a, boolean z, InterfaceC10987m interfaceC10987m, boolean z2, C4607n0 c4607n0, InterfaceC6112p interfaceC6112p, float f) {
            super(3);
            this.f12276w = map;
            this.f12277x = c4551e1;
            this.f12278y = enumC0627a;
            this.f12279z = z;
            this.f12271A = interfaceC10987m;
            this.f12272B = z2;
            this.f12273C = c4607n0;
            this.f12274D = interfaceC6112p;
            this.f12275E = f;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m27246a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m27246a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            List m489F;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(1735465469);
            if (!this.f12276w.isEmpty()) {
                m489F = _Collections.m489F(this.f12276w.values());
                if (m489F.size() == this.f12276w.size()) {
                    Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                    this.f12277x.m27221k(this.f12276w);
                    Map map = this.f12276w;
                    C4551e1 c4551e1 = this.f12277x;
                    Effects.m25538d(map, c4551e1, new C4544a(c4551e1, map, this.f12273C, density, this.f12274D, this.f12275E, null), interfaceC5179i, 8);
                    InterfaceC9570f m7249k = C10730m.m7249k(InterfaceC9570f.f25164r, this.f12277x.m27216p(), this.f12278y, this.f12279z, this.f12271A, this.f12277x.m27209w(), null, new C4546b(this.f12277x, null), this.f12272B, 32, null);
                    interfaceC5179i.mo25282C();
                    return m7249k;
                }
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
            }
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: d0.d1$c */
    /* loaded from: classes.dex */
    public static final class C4548c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f12297A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10987m f12298B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6112p f12299C;

        /* renamed from: D */
        final /* synthetic */ C4607n0 f12300D;

        /* renamed from: E */
        final /* synthetic */ float f12301E;

        /* renamed from: w */
        final /* synthetic */ C4551e1 f12302w;

        /* renamed from: x */
        final /* synthetic */ Map f12303x;

        /* renamed from: y */
        final /* synthetic */ EnumC0627a f12304y;

        /* renamed from: z */
        final /* synthetic */ boolean f12305z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4548c(C4551e1 c4551e1, Map map, EnumC0627a enumC0627a, boolean z, boolean z2, InterfaceC10987m interfaceC10987m, InterfaceC6112p interfaceC6112p, C4607n0 c4607n0, float f) {
            super(1);
            this.f12302w = c4551e1;
            this.f12303x = map;
            this.f12304y = enumC0627a;
            this.f12305z = z;
            this.f12297A = z2;
            this.f12298B = interfaceC10987m;
            this.f12299C = interfaceC6112p;
            this.f12300D = c4607n0;
            this.f12301E = f;
        }

        /* renamed from: a */
        public final void m27241a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("swipeable");
            c0816w0.m39492a().m39649b("state", this.f12302w);
            c0816w0.m39492a().m39649b("anchors", this.f12303x);
            c0816w0.m39492a().m39649b("orientation", this.f12304y);
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f12305z));
            c0816w0.m39492a().m39649b("reverseDirection", Boolean.valueOf(this.f12297A));
            c0816w0.m39492a().m39649b("interactionSource", this.f12298B);
            c0816w0.m39492a().m39649b("thresholds", this.f12299C);
            c0816w0.m39492a().m39649b("resistance", this.f12300D);
            c0816w0.m39492a().m39649b("velocityThreshold", C13605g.m878d(this.f12301E));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27241a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ float m27254a(float f, float f2, Set set, InterfaceC6112p interfaceC6112p, float f3, float f4) {
        return m27252c(f, f2, set, interfaceC6112p, f3, f4);
    }

    /* renamed from: b */
    public static final /* synthetic */ Float m27253b(Map map, Object obj) {
        return m27250e(map, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 < ((java.lang.Number) r6.mo39856d(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r3 > ((java.lang.Number) r6.mo39856d(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return r0;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float m27252c(float r3, float r4, java.util.Set r5, id.InterfaceC6112p r6, float r7, float r8) {
        /*
            java.util.List r5 = m27251d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.mo39856d(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.mo39856d(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.C4541d1.m27252c(float, float, java.util.Set, id.p, float, float):float");
    }

    /* renamed from: d */
    private static final List m27251d(float f, Set set) {
        Float m470Y;
        Float m468a0;
        List m194j;
        List m202b;
        List m202b2;
        List m193k;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((double) ((Number) next).floatValue()) <= ((double) f) + 0.001d) {
                arrayList.add(next);
            }
        }
        m470Y = _Collections.m470Y(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((double) ((Number) obj).floatValue()) >= ((double) f) - 0.001d) {
                arrayList2.add(obj);
            }
        }
        m468a0 = _Collections.m468a0(arrayList2);
        if (m470Y == null) {
            m193k = C13780s.m193k(m468a0);
            return m193k;
        } else if (m468a0 == null) {
            m202b2 = CollectionsJVM.m202b(m470Y);
            return m202b2;
        } else if (Intrinsics.m20933b(m470Y, m468a0)) {
            m202b = CollectionsJVM.m202b(m470Y);
            return m202b;
        } else {
            m194j = C13780s.m194j(m470Y, m468a0);
            return m194j;
        }
    }

    /* renamed from: e */
    private static final Float m27250e(Map map, Object obj) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.equals(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    /* renamed from: f */
    public static final InterfaceC9570f m27249f(InterfaceC9570f interfaceC9570f, C4551e1 c4551e1, Map map, EnumC0627a enumC0627a, boolean z, boolean z2, InterfaceC10987m interfaceC10987m, InterfaceC6112p interfaceC6112p, C4607n0 c4607n0, float f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$swipeable");
        Intrinsics.isThisObjectNull(c4551e1, "state");
        Intrinsics.isThisObjectNull(map, "anchors");
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        Intrinsics.isThisObjectNull(interfaceC6112p, "thresholds");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C4548c(c4551e1, map, enumC0627a, z, z2, interfaceC10987m, interfaceC6112p, c4607n0, f) : C0812v0.m39497a(), new C4543b(map, c4551e1, enumC0627a, z, interfaceC10987m, z2, c4607n0, interfaceC6112p, f));
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC9570f m27248g(InterfaceC9570f interfaceC9570f, C4551e1 c4551e1, Map map, EnumC0627a enumC0627a, boolean z, boolean z2, InterfaceC10987m interfaceC10987m, InterfaceC6112p interfaceC6112p, C4607n0 c4607n0, float f, int i, Object obj) {
        return m27249f(interfaceC9570f, c4551e1, map, enumC0627a, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : interfaceC10987m, (i & 64) != 0 ? C4542a.f12270w : interfaceC6112p, (i & 128) != 0 ? Swipeable.m27262c(Swipeable.f12259a, map.keySet(), 0.0f, 0.0f, 6, null) : c4607n0, (i & 256) != 0 ? Swipeable.f12259a.m27264a() : f);
    }
}
