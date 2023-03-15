package p051d0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p181jd.AbstractC6438m;
import p181jd.C6446v;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p345s.Animatable;
import p345s.C9937b;
import p345s.InterfaceC9950h;
import p372u.C10730m;
import p372u.InterfaceC10729l;
import p372u.InterfaceC10751n;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13769l0;

/* compiled from: Swipeable.kt */
/* renamed from: d0.e1 */
/* loaded from: classes.dex */
public class C4551e1<T> {

    /* renamed from: a */
    private final InterfaceC9950h f12307a;

    /* renamed from: b */
    private final InterfaceC6108l f12308b;

    /* renamed from: c */
    private final InterfaceC5220m0 f12309c;

    /* renamed from: d */
    private final InterfaceC5220m0 f12310d;

    /* renamed from: e */
    private final InterfaceC5220m0 f12311e;

    /* renamed from: f */
    private final InterfaceC5220m0 f12312f;

    /* renamed from: g */
    private final InterfaceC5220m0 f12313g;

    /* renamed from: h */
    private final InterfaceC5220m0 f12314h;

    /* renamed from: i */
    private final InterfaceC5220m0 f12315i;

    /* renamed from: j */
    private final InterfaceC6785c f12316j;

    /* renamed from: k */
    private float f12317k;

    /* renamed from: l */
    private float f12318l;

    /* renamed from: m */
    private final InterfaceC5220m0 f12319m;

    /* renamed from: n */
    private final InterfaceC5220m0 f12320n;

    /* renamed from: o */
    private final InterfaceC5220m0 f12321o;

    /* renamed from: p */
    private final InterfaceC10751n f12322p;

    /* compiled from: Swipeable.kt */
    /* renamed from: d0.e1$a */
    /* loaded from: classes.dex */
    public static final class C4552a {
        private C4552a() {
        }

        public /* synthetic */ C4552a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", m20196f = "Swipeable.kt", m20195l = {223}, m20194m = "invokeSuspend")
    /* renamed from: d0.e1$b */
    /* loaded from: classes.dex */
    public static final class C4553b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ float f12323A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC9950h f12324B;

        /* renamed from: x */
        int f12325x;

        /* renamed from: y */
        private /* synthetic */ Object f12326y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Swipeable.kt */
        /* renamed from: d0.e1$b$a */
        /* loaded from: classes.dex */
        public static final class C4554a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC10729l f12328w;

            /* renamed from: x */
            final /* synthetic */ C6446v f12329x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4554a(InterfaceC10729l interfaceC10729l, C6446v c6446v) {
                super(1);
                this.f12328w = interfaceC10729l;
                this.f12329x = c6446v;
            }

            /* renamed from: a */
            public final void m27204a(Animatable animatable) {
                Intrinsics.isThisObjectNull(animatable, "$this$animateTo");
                this.f12328w.mo7260a(((Number) animatable.m9644o()).floatValue() - this.f12329x.f17530w);
                this.f12329x.f17530w = ((Number) animatable.m9644o()).floatValue();
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m27204a((Animatable) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4553b(float f, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12323A = f;
            this.f12324B = interfaceC9950h;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4553b c4553b = new C4553b(this.f12323A, this.f12324B, interfaceC1886d);
            c4553b.f12326y = obj;
            return c4553b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10729l interfaceC10729l, InterfaceC1886d interfaceC1886d) {
            return ((C4553b) create(interfaceC10729l, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12325x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC10729l interfaceC10729l = (InterfaceC10729l) this.f12326y;
                    C6446v c6446v = new C6446v();
                    c6446v.f17530w = ((Number) C4551e1.m27230b(C4551e1.this).getValue()).floatValue();
                    C4551e1.m27229c(C4551e1.this).setValue(C6755b.m20200b(this.f12323A));
                    C4551e1.m27226f(C4551e1.this, true);
                    Animatable m9627b = C9937b.m9627b(c6446v.f17530w, 0.0f, 2, null);
                    Float m20200b = C6755b.m20200b(this.f12323A);
                    InterfaceC9950h interfaceC9950h = this.f12324B;
                    C4554a c4554a = new C4554a(interfaceC10729l, c6446v);
                    this.f12325x = 1;
                    if (Animatable.m9653f(m9627b, m20200b, interfaceC9950h, null, c4554a, this, 4, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                C4551e1.m27229c(C4551e1.this).setValue(null);
                C4551e1.m27226f(C4551e1.this, false);
                return C13195u.f34156a;
            } catch (Throwable th2) {
                C4551e1.m27229c(C4551e1.this).setValue(null);
                C4551e1.m27226f(C4551e1.this, false);
                throw th2;
            }
        }
    }

    /* compiled from: Collect.kt */
    /* renamed from: d0.e1$c */
    /* loaded from: classes.dex */
    public static final class C4555c implements InterfaceC6787d {

        /* renamed from: w */
        final /* synthetic */ Object f12330w;

        /* renamed from: x */
        final /* synthetic */ C4551e1 f12331x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC9950h f12332y;

        /* compiled from: Collect.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1", m20196f = "Swipeable.kt", m20195l = {140}, m20194m = "emit")
        /* renamed from: d0.e1$c$a */
        /* loaded from: classes.dex */
        public static final class C4556a extends AbstractC6757d {

            /* renamed from: A */
            Object f12333A;

            /* renamed from: w */
            /* synthetic */ Object f12334w;

            /* renamed from: x */
            int f12335x;

            /* renamed from: z */
            Object f12337z;

            public C4556a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f12334w = obj;
                this.f12335x |= Integer.MIN_VALUE;
                return C4555c.this.mo4529a(null, this);
            }
        }

        public C4555c(Object obj, C4551e1 c4551e1, InterfaceC9950h interfaceC9950h) {
            this.f12330w = obj;
            this.f12331x = c4551e1;
            this.f12332y = interfaceC9950h;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo4529a(java.lang.Object r9, bd.InterfaceC1886d r10) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p051d0.C4551e1.C4555c.mo4529a(java.lang.Object, bd.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    /* renamed from: d0.e1$d */
    /* loaded from: classes.dex */
    public static final class C4557d extends AbstractC6438m implements InterfaceC6108l {
        C4557d() {
            super(1);
        }

        /* renamed from: a */
        public final void m27203a(float f) {
            float m14997l;
            float floatValue = ((Number) C4551e1.m27230b(C4551e1.this).getValue()).floatValue() + f;
            m14997l = _Ranges.m14997l(floatValue, C4551e1.this.m27214r(), C4551e1.this.m27215q());
            float f2 = floatValue - m14997l;
            C4607n0 m27212t = C4551e1.this.m27212t();
            C4551e1.m27228d(C4551e1.this).setValue(Float.valueOf(m14997l + (m27212t == null ? 0.0f : m27212t.m27091a(f2))));
            C4551e1.m27227e(C4551e1.this).setValue(Float.valueOf(f2));
            C4551e1.m27230b(C4551e1.this).setValue(Float.valueOf(floatValue));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27203a(((Number) obj).floatValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    /* renamed from: d0.e1$e */
    /* loaded from: classes.dex */
    public static final class C4558e extends AbstractC6438m implements InterfaceC6097a {
        C4558e() {
            super(0);
        }

        /* renamed from: a */
        public final Map mo42214q() {
            return C4551e1.this.m27220l();
        }
    }

    /* compiled from: Collect.kt */
    /* renamed from: d0.e1$f */
    /* loaded from: classes.dex */
    public static final class C4559f implements InterfaceC6787d {

        /* renamed from: x */
        final /* synthetic */ float f12341x;

        public C4559f(float f) {
            this.f12341x = f;
        }

        /* renamed from: a */
        public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object m34636d2;
            Map map = (Map) obj;
            Float m27253b = C4541d1.m27253b(map, C4551e1.this.m27217o());
            Intrinsics.ifNullDoSomething(m27253b);
            float floatValue = m27253b.floatValue();
            Object obj2 = map.get(C6755b.m20200b(C4541d1.m27254a(((Number) C4551e1.this.m27213s().getValue()).floatValue(), floatValue, map.keySet(), C4551e1.this.m27211u(), this.f12341x, C4551e1.this.m27210v())));
            if (obj2 == null || !((Boolean) C4551e1.this.m27218n().mo9587d(obj2)).booleanValue()) {
                C4551e1 c4551e1 = C4551e1.this;
                Object m27231a = C4551e1.m27231a(c4551e1, floatValue, c4551e1.m27219m(), interfaceC1886d);
                m34636d = C2116d.m34636d();
                if (m27231a == m34636d) {
                    return m27231a;
                }
            } else {
                Object m27222j = C4551e1.m27222j(C4551e1.this, obj2, null, interfaceC1886d, 2, null);
                m34636d2 = C2116d.m34636d();
                if (m27222j == m34636d2) {
                    return m27222j;
                }
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableState", m20196f = "Swipeable.kt", m20195l = {159, 183, 186}, m20194m = "processNewAnchors$material_release")
    /* renamed from: d0.e1$g */
    /* loaded from: classes.dex */
    public static final class C4560g extends AbstractC6757d {

        /* renamed from: B */
        int f12343B;

        /* renamed from: w */
        Object f12344w;

        /* renamed from: x */
        Object f12345x;

        /* renamed from: y */
        float f12346y;

        /* renamed from: z */
        /* synthetic */ Object f12347z;

        C4560g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f12347z = obj;
            this.f12343B |= Integer.MIN_VALUE;
            return C4551e1.this.m27207y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", m20196f = "Swipeable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: d0.e1$h */
    /* loaded from: classes.dex */
    public static final class C4561h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C4551e1 f12348A;

        /* renamed from: x */
        int f12349x;

        /* renamed from: y */
        private /* synthetic */ Object f12350y;

        /* renamed from: z */
        final /* synthetic */ float f12351z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4561h(float f, C4551e1 c4551e1, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12351z = f;
            this.f12348A = c4551e1;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4561h c4561h = new C4561h(this.f12351z, this.f12348A, interfaceC1886d);
            c4561h.f12350y = obj;
            return c4561h;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10729l interfaceC10729l, InterfaceC1886d interfaceC1886d) {
            return ((C4561h) create(interfaceC10729l, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f12349x == 0) {
                C13186n.m1453b(obj);
                ((InterfaceC10729l) this.f12350y).mo7260a(this.f12351z - ((Number) C4551e1.m27230b(this.f12348A).getValue()).floatValue());
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: d0.e1$i */
    /* loaded from: classes.dex */
    public static final class C4562i implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f12352w;

        /* compiled from: Collect.kt */
        /* renamed from: d0.e1$i$a */
        /* loaded from: classes.dex */
        public static final class C4563a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f12353w;

            @InterfaceC6759f(m20197c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", m20196f = "Swipeable.kt", m20195l = {137}, m20194m = "emit")
            /* renamed from: d0.e1$i$a$a */
            /* loaded from: classes.dex */
            public static final class C4564a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f12354w;

                /* renamed from: x */
                int f12355x;

                public C4564a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f12354w = obj;
                    this.f12355x |= Integer.MIN_VALUE;
                    return C4563a.this.mo4529a(null, this);
                }
            }

            public C4563a(InterfaceC6787d interfaceC6787d) {
                this.f12353w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p051d0.C4551e1.C4562i.C4563a.C4564a
                    if (r0 == 0) goto L13
                    r0 = r6
                    d0.e1$i$a$a r0 = (p051d0.C4551e1.C4562i.C4563a.C4564a) r0
                    int r1 = r0.f12355x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12355x = r1
                    goto L18
                L13:
                    d0.e1$i$a$a r0 = new d0.e1$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12354w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f12355x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f12353w
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L49
                    r0.f12355x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p051d0.C4551e1.C4562i.C4563a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C4562i(InterfaceC6785c interfaceC6785c) {
            this.f12352w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f12352w.mo20086d(new C4563a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    /* renamed from: d0.e1$j */
    /* loaded from: classes.dex */
    public static final class C4565j extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C4565j f12357w = new C4565j();

        C4565j() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m27200a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }

        /* renamed from: a */
        public final Float m27200a(float f, float f2) {
            return Float.valueOf(0.0f);
        }
    }

    static {
        new C4552a(null);
    }

    public C4551e1(Object obj, InterfaceC9950h interfaceC9950h, InterfaceC6108l interfaceC6108l) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        InterfaceC5220m0 m24962d3;
        InterfaceC5220m0 m24962d4;
        InterfaceC5220m0 m24962d5;
        InterfaceC5220m0 m24962d6;
        Map m334e;
        InterfaceC5220m0 m24962d7;
        InterfaceC5220m0 m24962d8;
        InterfaceC5220m0 m24962d9;
        InterfaceC5220m0 m24962d10;
        Intrinsics.isThisObjectNull(interfaceC9950h, "animationSpec");
        Intrinsics.isThisObjectNull(interfaceC6108l, "confirmStateChange");
        this.f12307a = interfaceC9950h;
        this.f12308b = interfaceC6108l;
        m24962d = C5232o1.m24962d(obj, null, 2, null);
        this.f12309c = m24962d;
        m24962d2 = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
        this.f12310d = m24962d2;
        Float valueOf = Float.valueOf(0.0f);
        m24962d3 = C5232o1.m24962d(valueOf, null, 2, null);
        this.f12311e = m24962d3;
        m24962d4 = C5232o1.m24962d(valueOf, null, 2, null);
        this.f12312f = m24962d4;
        m24962d5 = C5232o1.m24962d(valueOf, null, 2, null);
        this.f12313g = m24962d5;
        m24962d6 = C5232o1.m24962d(null, null, 2, null);
        this.f12314h = m24962d6;
        m334e = C13769l0.m334e();
        m24962d7 = C5232o1.m24962d(m334e, null, 2, null);
        this.f12315i = m24962d7;
        this.f12316j = C6788e.m20124x(new C4562i(C5209j1.m25066l(new C4558e())), 1);
        this.f12317k = Float.NEGATIVE_INFINITY;
        this.f12318l = Float.POSITIVE_INFINITY;
        m24962d8 = C5232o1.m24962d(C4565j.f12357w, null, 2, null);
        this.f12319m = m24962d8;
        m24962d9 = C5232o1.m24962d(valueOf, null, 2, null);
        this.f12320n = m24962d9;
        m24962d10 = C5232o1.m24962d(null, null, 2, null);
        this.f12321o = m24962d10;
        this.f12322p = C10730m.m7259a(new C4557d());
    }

    /* renamed from: A */
    private final void m27239A(boolean z) {
        this.f12310d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: B */
    private final void m27238B(Object obj) {
        this.f12309c.setValue(obj);
    }

    /* renamed from: H */
    private final Object m27232H(float f, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7223a = InterfaceC10751n.C10752a.m7223a(m27216p(), null, new C4561h(f, this, null), interfaceC1886d, 1, null);
        m34636d = C2116d.m34636d();
        return m7223a == m34636d ? m7223a : C13195u.f34156a;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m27231a(C4551e1 c4551e1, float f, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
        return c4551e1.m27224h(f, interfaceC9950h, interfaceC1886d);
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5220m0 m27230b(C4551e1 c4551e1) {
        return c4551e1.f12313g;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC5220m0 m27229c(C4551e1 c4551e1) {
        return c4551e1.f12314h;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC5220m0 m27228d(C4551e1 c4551e1) {
        return c4551e1.f12311e;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC5220m0 m27227e(C4551e1 c4551e1) {
        return c4551e1.f12312f;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m27226f(C4551e1 c4551e1, boolean z) {
        c4551e1.m27239A(z);
    }

    /* renamed from: g */
    public static final /* synthetic */ void m27225g(C4551e1 c4551e1, Object obj) {
        c4551e1.m27238B(obj);
    }

    /* renamed from: h */
    private final Object m27224h(float f, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7223a = InterfaceC10751n.C10752a.m7223a(m27216p(), null, new C4553b(f, interfaceC9950h, null), interfaceC1886d, 1, null);
        m34636d = C2116d.m34636d();
        return m7223a == m34636d ? m7223a : C13195u.f34156a;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m27222j(C4551e1 c4551e1, Object obj, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                interfaceC9950h = c4551e1.m27219m();
            }
            return c4551e1.m27223i(obj, interfaceC9950h, interfaceC1886d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* renamed from: C */
    public final void m27237C(float f) {
        this.f12318l = f;
    }

    /* renamed from: D */
    public final void m27236D(float f) {
        this.f12317k = f;
    }

    /* renamed from: E */
    public final void m27235E(C4607n0 c4607n0) {
        this.f12321o.setValue(c4607n0);
    }

    /* renamed from: F */
    public final void m27234F(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "<set-?>");
        this.f12319m.setValue(interfaceC6112p);
    }

    /* renamed from: G */
    public final void m27233G(float f) {
        this.f12320n.setValue(Float.valueOf(f));
    }

    /* renamed from: i */
    public final Object m27223i(Object obj, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo20086d = this.f12316j.mo20086d(new C4555c(obj, this, interfaceC9950h), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }

    /* renamed from: k */
    public final void m27221k(Map map) {
        Intrinsics.isThisObjectNull(map, "newAnchors");
        if (m27220l().isEmpty()) {
            Float m27253b = C4541d1.m27253b(map, m27217o());
            if (m27253b != null) {
                this.f12311e.setValue(m27253b);
                this.f12313g.setValue(m27253b);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    /* renamed from: l */
    public final Map m27220l() {
        return (Map) this.f12315i.getValue();
    }

    /* renamed from: m */
    public final InterfaceC9950h m27219m() {
        return this.f12307a;
    }

    /* renamed from: n */
    public final InterfaceC6108l m27218n() {
        return this.f12308b;
    }

    /* renamed from: o */
    public final Object m27217o() {
        return this.f12309c.getValue();
    }

    /* renamed from: p */
    public final InterfaceC10751n m27216p() {
        return this.f12322p;
    }

    /* renamed from: q */
    public final float m27215q() {
        return this.f12318l;
    }

    /* renamed from: r */
    public final float m27214r() {
        return this.f12317k;
    }

    /* renamed from: s */
    public final InterfaceC5242r1 m27213s() {
        return this.f12311e;
    }

    /* renamed from: t */
    public final C4607n0 m27212t() {
        return (C4607n0) this.f12321o.getValue();
    }

    /* renamed from: u */
    public final InterfaceC6112p m27211u() {
        return (InterfaceC6112p) this.f12319m.getValue();
    }

    /* renamed from: v */
    public final float m27210v() {
        return ((Number) this.f12320n.getValue()).floatValue();
    }

    /* renamed from: w */
    public final boolean m27209w() {
        return ((Boolean) this.f12310d.getValue()).booleanValue();
    }

    /* renamed from: x */
    public final Object m27208x(float f, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo20086d = this.f12316j.mo20086d(new C4559f(f), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Type inference failed for: r10v27, types: [float] */
    /* JADX WARN: Type inference failed for: r10v75, types: [float] */
    /* JADX WARN: Type inference failed for: r10v77, types: [float] */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m27207y(java.util.Map r10, java.util.Map r11, bd.InterfaceC1886d r12) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.C4551e1.m27207y(java.util.Map, java.util.Map, bd.d):java.lang.Object");
    }

    /* renamed from: z */
    public final void m27206z(Map map) {
        Intrinsics.isThisObjectNull(map, "<set-?>");
        this.f12315i.setValue(map);
    }
}
