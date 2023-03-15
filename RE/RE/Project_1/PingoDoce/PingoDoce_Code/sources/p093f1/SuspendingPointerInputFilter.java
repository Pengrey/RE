package p093f1;

import androidx.compose.p018ui.input.pointer.EnumC0662a;
import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.C1894h;
import bd.Continuation;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p093f1.PointerEvent;
import p112g0.MutableVector;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p373u0.C10781l;
import p373u0.C10783m;
import p468yc.C13183m;
import p468yc.C13195u;
import p479z1.C13615m;
import p479z1.Density;
import td.C10534k;
import td.C10540l1;
import td.InterfaceC10524i0;
import td.InterfaceC10529j;

/* renamed from: f1.h0 */
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilter extends AbstractC5271a0 implements PointerEvent, InterfaceC5276c0, Density {

    /* renamed from: A */
    private final MutableVector f14569A;

    /* renamed from: B */
    private final MutableVector f14570B;

    /* renamed from: C */
    private C5306m f14571C;

    /* renamed from: D */
    private long f14572D;

    /* renamed from: E */
    private InterfaceC10524i0 f14573E;

    /* renamed from: F */
    private boolean f14574F;

    /* renamed from: x */
    private final ViewConfiguration f14575x;

    /* renamed from: y */
    private final /* synthetic */ Density f14576y;

    /* renamed from: z */
    private C5306m f14577z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.h0$a */
    /* loaded from: classes.dex */
    public final class C5286a<R> implements InterfaceC5274c, Density, InterfaceC1886d {

        /* renamed from: A */
        private final CoroutineContext f14578A;

        /* renamed from: B */
        final /* synthetic */ SuspendingPointerInputFilter f14579B;

        /* renamed from: w */
        private final InterfaceC1886d f14580w;

        /* renamed from: x */
        private final /* synthetic */ SuspendingPointerInputFilter f14581x;

        /* renamed from: y */
        private InterfaceC10529j f14582y;

        /* renamed from: z */
        private EnumC0662a f14583z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {573}, m20194m = "withTimeout")
        /* renamed from: f1.h0$a$a */
        /* loaded from: classes.dex */
        public static final class C5287a<T> extends AbstractC6757d {

            /* renamed from: w */
            Object f14584w;

            /* renamed from: x */
            /* synthetic */ Object f14585x;

            /* renamed from: z */
            int f14587z;

            C5287a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f14585x = obj;
                this.f14587z |= Integer.MIN_VALUE;
                return C5286a.this.mo24826J(0L, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {565, 566}, m20194m = "invokeSuspend")
        /* renamed from: f1.h0$a$b */
        /* loaded from: classes.dex */
        public static final class C5288b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f14588x;

            /* renamed from: y */
            final /* synthetic */ long f14589y;

            /* renamed from: z */
            final /* synthetic */ C5286a f14590z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5288b(long j, C5286a c5286a, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14589y = j;
                this.f14590z = c5286a;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C5288b(this.f14589y, this.f14590z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C5288b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r8.f14588x
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    p468yc.C13186n.m1453b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    p468yc.C13186n.m1453b(r9)
                    goto L2f
                L20:
                    p468yc.C13186n.m1453b(r9)
                    long r6 = r8.f14589y
                    long r6 = r6 - r2
                    r8.f14588x = r5
                    java.lang.Object r9 = td.C10565r0.m7677a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f14588x = r4
                    java.lang.Object r9 = td.C10565r0.m7677a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    f1.h0$a r9 = r8.f14590z
                    td.j r9 = p093f1.SuspendingPointerInputFilter.C5286a.m24747q(r9)
                    if (r9 != 0) goto L41
                    goto L55
                L41:
                    yc.m$a r0 = p468yc.C13183m.f34143w
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f14589y
                    r0.<init>(r1)
                    java.lang.Object r0 = p468yc.C13186n.m1454a(r0)
                    java.lang.Object r0 = p468yc.C13183m.m1458a(r0)
                    r9.resumeWith(r0)
                L55:
                    yc.u r9 = p468yc.C13195u.f34156a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p093f1.SuspendingPointerInputFilter.C5286a.C5288b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {545}, m20194m = "withTimeoutOrNull")
        /* renamed from: f1.h0$a$c */
        /* loaded from: classes.dex */
        public static final class C5289c<T> extends AbstractC6757d {

            /* renamed from: w */
            /* synthetic */ Object f14591w;

            /* renamed from: y */
            int f14593y;

            C5289c(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f14591w = obj;
                this.f14593y |= Integer.MIN_VALUE;
                return C5286a.this.mo24825T(0L, null, this);
            }
        }

        public C5286a(SuspendingPointerInputFilter suspendingPointerInputFilter, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(suspendingPointerInputFilter, "this$0");
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            this.f14579B = suspendingPointerInputFilter;
            this.f14580w = interfaceC1886d;
            this.f14581x = suspendingPointerInputFilter;
            this.f14583z = EnumC0662a.Main;
            this.f14578A = C1894h.f5621w;
        }

        /* renamed from: q */
        public static final /* synthetic */ InterfaceC10529j m24747q(C5286a c5286a) {
            return c5286a.f14582y;
        }

        /* renamed from: t */
        public static final /* synthetic */ void m24745t(C5286a c5286a, EnumC0662a enumC0662a) {
            c5286a.f14583z = enumC0662a;
        }

        /* renamed from: y */
        public static final /* synthetic */ void m24743y(C5286a c5286a, InterfaceC10529j interfaceC10529j) {
            c5286a.f14582y = interfaceC10529j;
        }

        /* renamed from: A */
        public float m24759A(float f) {
            return this.f14581x.m24777A(f);
        }

        /* renamed from: C */
        public final void m24758C(Throwable th2) {
            InterfaceC10529j interfaceC10529j = this.f14582y;
            if (interfaceC10529j != null) {
                interfaceC10529j.mo7776p(th2);
            }
            this.f14582y = null;
        }

        /* renamed from: F */
        public final void m24757F(C5306m c5306m, EnumC0662a enumC0662a) {
            InterfaceC10529j interfaceC10529j;
            Intrinsics.isThisObjectNull(c5306m, "event");
            Intrinsics.isThisObjectNull(enumC0662a, "pass");
            if (enumC0662a != this.f14583z || (interfaceC10529j = this.f14582y) == null) {
                return;
            }
            this.f14582y = null;
            C13183m.C13184a c13184a = C13183m.f34143w;
            interfaceC10529j.resumeWith(C13183m.m1458a(c5306m));
        }

        /* renamed from: G */
        public long mo24827G() {
            return this.f14579B.m24776G();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [td.t1] */
        /* JADX WARN: Type inference failed for: r12v3, types: [td.t1] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo24826J(long r12, id.InterfaceC6112p r14, bd.InterfaceC1886d r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof p093f1.SuspendingPointerInputFilter.C5286a.C5287a
                if (r0 == 0) goto L13
                r0 = r15
                f1.h0$a$a r0 = (p093f1.SuspendingPointerInputFilter.C5286a.C5287a) r0
                int r1 = r0.f14587z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14587z = r1
                goto L18
            L13:
                f1.h0$a$a r0 = new f1.h0$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f14585x
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f14587z
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r12 = r0.f14584w
                td.t1 r12 = (td.InterfaceC10574t1) r12
                p468yc.C13186n.m1453b(r15)     // Catch: java.lang.Throwable -> L2e
                goto L76
            L2e:
                r13 = move-exception
                goto L7a
            L30:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L38:
                p468yc.C13186n.m1453b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L58
                td.j r15 = r11.f14582y
                if (r15 != 0) goto L46
                goto L58
            L46:
                yc.m$a r2 = p468yc.C13183m.f34143w
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = p468yc.C13186n.m1454a(r2)
                java.lang.Object r2 = p468yc.C13183m.m1458a(r2)
                r15.resumeWith(r2)
            L58:
                f1.h0 r15 = r11.f14579B
                td.i0 r5 = r15.m24761v0()
                r6 = 0
                r7 = 0
                f1.h0$a$b r8 = new f1.h0$a$b
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                td.t1 r12 = kotlinx.coroutines.C6769b.m20167d(r5, r6, r7, r8, r9, r10)
                r0.f14584w = r12     // Catch: java.lang.Throwable -> L2e
                r0.f14587z = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r15 = r14.mo39856d(r11, r0)     // Catch: java.lang.Throwable -> L2e
                if (r15 != r1) goto L76
                return r1
            L76:
                td.InterfaceC10574t1.C10575a.m7654a(r12, r4, r3, r4)
                return r15
            L7a:
                td.InterfaceC10574t1.C10575a.m7654a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p093f1.SuspendingPointerInputFilter.C5286a.mo24826J(long, id.p, bd.d):java.lang.Object");
        }

        /* renamed from: O */
        public int m24754O(float f) {
            return this.f14581x.m24775O(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* renamed from: T */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo24825T(long r5, id.InterfaceC6112p r7, bd.InterfaceC1886d r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof p093f1.SuspendingPointerInputFilter.C5286a.C5289c
                if (r0 == 0) goto L13
                r0 = r8
                f1.h0$a$c r0 = (p093f1.SuspendingPointerInputFilter.C5286a.C5289c) r0
                int r1 = r0.f14593y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14593y = r1
                goto L18
            L13:
                f1.h0$a$c r0 = new f1.h0$a$c
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f14591w
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f14593y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p468yc.C13186n.m1453b(r8)     // Catch: androidx.compose.p018ui.input.pointer.SuspendingPointerInputFilter -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p468yc.C13186n.m1453b(r8)
                r0.f14593y = r3     // Catch: androidx.compose.p018ui.input.pointer.SuspendingPointerInputFilter -> L3d
                java.lang.Object r8 = r4.mo24826J(r5, r7, r0)     // Catch: androidx.compose.p018ui.input.pointer.SuspendingPointerInputFilter -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p093f1.SuspendingPointerInputFilter.C5286a.mo24825T(long, id.p, bd.d):java.lang.Object");
        }

        /* renamed from: U */
        public long m24752U(long j) {
            return this.f14581x.m24774U(j);
        }

        /* renamed from: Y */
        public float m24751Y(long j) {
            return this.f14581x.m24773Y(j);
        }

        /* renamed from: b */
        public long mo24824b() {
            return SuspendingPointerInputFilter.m24765r0(this.f14579B);
        }

        /* renamed from: b0 */
        public Object mo24823b0(EnumC0662a enumC0662a, InterfaceC1886d interfaceC1886d) {
            InterfaceC1886d m34637c;
            Object m34636d;
            m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
            C10534k c10534k = new C10534k(m34637c, 1);
            c10534k.m7723y();
            m24745t(this, enumC0662a);
            m24743y(this, c10534k);
            Object m7728t = c10534k.m7728t();
            m34636d = C2116d.m34636d();
            if (m7728t == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            return m7728t;
        }

        public CoroutineContext getContext() {
            return this.f14578A;
        }

        public float getDensity() {
            return this.f14581x.getDensity();
        }

        public ViewConfiguration getViewConfiguration() {
            return this.f14579B.getViewConfiguration();
        }

        /* renamed from: i0 */
        public float m24748i0(int i) {
            return this.f14581x.m24770i0(i);
        }

        /* renamed from: r */
        public float m24746r() {
            return this.f14581x.m24766r();
        }

        public void resumeWith(Object obj) {
            MutableVector m24763t0 = SuspendingPointerInputFilter.m24763t0(this.f14579B);
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14579B;
            synchronized (m24763t0) {
                SuspendingPointerInputFilter.m24763t0(suspendingPointerInputFilter).m23644u(this);
                C13195u c13195u = C13195u.f34156a;
            }
            this.f14580w.resumeWith(obj);
        }

        /* renamed from: w */
        public C5306m mo24822w() {
            return SuspendingPointerInputFilter.m24764s0(this.f14579B);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.h0$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5290b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14594a;

        static {
            int[] iArr = new int[EnumC0662a.values().length];
            iArr[EnumC0662a.Initial.ordinal()] = 1;
            iArr[EnumC0662a.Final.ordinal()] = 2;
            iArr[EnumC0662a.Main.ordinal()] = 3;
            f14594a = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.h0$c */
    /* loaded from: classes.dex */
    static final class C5291c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C5286a f14595w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5291c(C5286a c5286a) {
            super(1);
            this.f14595w = c5286a;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            this.f14595w.m24758C(th2);
        }
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration, Density density) {
        Intrinsics.isThisObjectNull(viewConfiguration, "viewConfiguration");
        Intrinsics.isThisObjectNull(density, "density");
        this.f14575x = viewConfiguration;
        this.f14576y = density;
        this.f14577z = C5293i0.m24740a();
        this.f14569A = new MutableVector(new C5286a[16], 0);
        this.f14570B = new MutableVector(new C5286a[16], 0);
        this.f14572D = C13615m.f34610b.m820a();
        this.f14573E = C10540l1.f27258w;
    }

    /* renamed from: r0 */
    public static final /* synthetic */ long m24765r0(SuspendingPointerInputFilter suspendingPointerInputFilter) {
        return suspendingPointerInputFilter.f14572D;
    }

    /* renamed from: s0 */
    public static final /* synthetic */ C5306m m24764s0(SuspendingPointerInputFilter suspendingPointerInputFilter) {
        return suspendingPointerInputFilter.f14577z;
    }

    /* renamed from: t0 */
    public static final /* synthetic */ MutableVector m24763t0(SuspendingPointerInputFilter suspendingPointerInputFilter) {
        return suspendingPointerInputFilter.f14569A;
    }

    /* renamed from: u0 */
    private final void m24762u0(C5306m c5306m, EnumC0662a enumC0662a) {
        MutableVector mutableVector;
        int m23649p;
        synchronized (this.f14569A) {
            MutableVector mutableVector2 = this.f14570B;
            mutableVector2.m23658d(mutableVector2.m23649p(), this.f14569A);
        }
        try {
            int i = C5290b.f14594a[enumC0662a.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector mutableVector3 = this.f14570B;
                int m23649p2 = mutableVector3.m23649p();
                if (m23649p2 > 0) {
                    int i2 = 0;
                    Object[] m23650o = mutableVector3.m23650o();
                    do {
                        ((C5286a) m23650o[i2]).m24757F(c5306m, enumC0662a);
                        i2++;
                    } while (i2 < m23649p2);
                }
            } else if (i == 3 && (m23649p = (mutableVector = this.f14570B).m23649p()) > 0) {
                int i3 = m23649p - 1;
                Object[] m23650o2 = mutableVector.m23650o();
                do {
                    ((C5286a) m23650o2[i3]).m24757F(c5306m, enumC0662a);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.f14570B.m23654i();
        }
    }

    /* renamed from: A */
    public float m24777A(float f) {
        return this.f14576y.m899A(f);
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return PointerEvent.C5273a.m24831a(this, interfaceC6108l);
    }

    /* renamed from: G */
    public long m24776G() {
        long m24774U = m24774U(getViewConfiguration().m39640e());
        long m24841b = m24841b();
        return C10783m.m7085a(Math.max(0.0f, C10781l.m7091i(m24774U) - C13615m.m824g(m24841b)) / 2.0f, Math.max(0.0f, C10781l.m7093g(m24774U) - C13615m.m825f(m24841b)) / 2.0f);
    }

    /* renamed from: O */
    public int m24775O(float f) {
        return this.f14576y.m898O(f);
    }

    /* renamed from: U */
    public long m24774U(long j) {
        return this.f14576y.m897U(j);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return PointerEvent.C5273a.m24829c(this, obj, interfaceC6112p);
    }

    /* renamed from: Y */
    public float m24773Y(long j) {
        return this.f14576y.m896Y(j);
    }

    /* renamed from: Z */
    public Object mo24820Z(InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        C5286a c5286a = new C5286a(this, c10534k);
        synchronized (m24763t0(this)) {
            m24763t0(this).m23659c(c5286a);
            InterfaceC1886d m35189a = Continuation.m35189a(interfaceC6112p, c5286a, c5286a);
            C13183m.C13184a c13184a = C13183m.f34143w;
            m35189a.resumeWith(C13183m.m1458a(C13195u.f34156a));
        }
        c10534k.mo7778n(new C5291c(c5286a));
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    public float getDensity() {
        return this.f14576y.getDensity();
    }

    public ViewConfiguration getViewConfiguration() {
        return this.f14575x;
    }

    /* renamed from: h0 */
    public AbstractC5271a0 m24771h0() {
        return this;
    }

    /* renamed from: i0 */
    public float m24770i0(int i) {
        return this.f14576y.m895i0(i);
    }

    /* renamed from: k0 */
    public boolean mo24840k0() {
        return this.f14574F;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return PointerEvent.C5273a.m24830b(this, obj, interfaceC6112p);
    }

    /* renamed from: o0 */
    public void mo24836o0() {
        List m24707b;
        boolean z;
        C5306m c5306m = this.f14571C;
        if (c5306m == null) {
            return;
        }
        int size = c5306m.m24707b().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            int i2 = i + 1;
            if (!(!((C5318u) m24707b.get(i)).m24650i())) {
                z = false;
                break;
            }
            i = i2;
        }
        if (z) {
            return;
        }
        List m24707b2 = c5306m.m24707b();
        ArrayList arrayList = new ArrayList(m24707b2.size());
        int size2 = m24707b2.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = i3 + 1;
            C5318u c5318u = (C5318u) m24707b2.get(i3);
            C5318u m24655d = C5318u.m24655d(c5318u, 0L, 0L, 0L, false, c5318u.m24645n(), c5318u.m24651h(), c5318u.m24650i(), new C5277d(false, c5318u.m24650i(), 1, null), 0, 263, null);
            if (m24655d != null) {
                arrayList.add(m24655d);
            }
            i3 = i4;
        }
        C5306m c5306m2 = new C5306m(arrayList);
        this.f14577z = c5306m2;
        m24762u0(c5306m2, EnumC0662a.Initial);
        m24762u0(c5306m2, EnumC0662a.Main);
        m24762u0(c5306m2, EnumC0662a.Final);
        this.f14571C = null;
    }

    /* renamed from: p0 */
    public void mo24835p0(C5306m c5306m, EnumC0662a enumC0662a, long j) {
        Intrinsics.isThisObjectNull(c5306m, "pointerEvent");
        Intrinsics.isThisObjectNull(enumC0662a, "pass");
        this.f14572D = j;
        if (enumC0662a == EnumC0662a.Initial) {
            this.f14577z = c5306m;
        }
        m24762u0(c5306m, enumC0662a);
        List m24707b = c5306m.m24707b();
        int size = m24707b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            int i2 = i + 1;
            if (!C5307n.m24700d((C5318u) m24707b.get(i))) {
                break;
            }
            i = i2;
        }
        if (!(!z)) {
            c5306m = null;
        }
        this.f14571C = c5306m;
    }

    /* renamed from: r */
    public float m24766r() {
        return this.f14576y.m894r();
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return PointerEvent.C5273a.m24828d(this, interfaceC9570f);
    }

    /* renamed from: v0 */
    public final InterfaceC10524i0 m24761v0() {
        return this.f14573E;
    }

    /* renamed from: w0 */
    public final void m24760w0(InterfaceC10524i0 interfaceC10524i0) {
        Intrinsics.isThisObjectNull(interfaceC10524i0, "<set-?>");
        this.f14573E = interfaceC10524i0;
    }
}
