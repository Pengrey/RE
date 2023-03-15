package p372u;

import androidx.compose.p018ui.input.pointer.EnumC0662a;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p070e.C4906j;
import p093f1.C5307n;
import p093f1.C5318u;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p181jd.C6449y;
import p373u0.C10774f;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;

/* renamed from: u.i0 */
/* loaded from: classes.dex */
public final class C10695i0 {

    /* renamed from: a */
    private static final InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27567a = new C10696a(null);

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m20196f = "TapGestureDetector.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.i0$a */
    /* loaded from: classes.dex */
    static final class C10696a extends AbstractC6764l implements InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: x */
        int f27568x;

        C10696a(InterfaceC1886d<? super C10696a> interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        @Override // id.InterfaceC6113q
        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(InterfaceC10767y interfaceC10767y, C10774f c10774f, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return m7298d(interfaceC10767y, c10774f.m7137s(), interfaceC1886d);
        }

        /* renamed from: d */
        public final Object m7298d(InterfaceC10767y interfaceC10767y, long j, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return new C10696a(interfaceC1886d).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27568x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m20196f = "TapGestureDetector.kt", m20195l = {245}, m20194m = "awaitFirstDownOnPass")
    /* renamed from: u.i0$b */
    /* loaded from: classes.dex */
    public static final class C10697b extends AbstractC6757d {

        /* renamed from: A */
        int f27569A;

        /* renamed from: w */
        Object f27570w;

        /* renamed from: x */
        Object f27571x;

        /* renamed from: y */
        boolean f27572y;

        /* renamed from: z */
        /* synthetic */ Object f27573z;

        C10697b(InterfaceC1886d<? super C10697b> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27573z = obj;
            this.f27569A |= Integer.MIN_VALUE;
            return C10695i0.m7305f(null, null, false, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m20196f = "TapGestureDetector.kt", m20195l = {192}, m20194m = "invokeSuspend")
    /* renamed from: u.i0$c */
    /* loaded from: classes.dex */
    public static final class C10698c extends AbstractC6763k implements InterfaceC6112p<InterfaceC5274c, InterfaceC1886d<? super C5318u>, Object> {

        /* renamed from: A */
        final /* synthetic */ C5318u f27574A;

        /* renamed from: x */
        long f27575x;

        /* renamed from: y */
        int f27576y;

        /* renamed from: z */
        private /* synthetic */ Object f27577z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10698c(C5318u c5318u, InterfaceC1886d<? super C10698c> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27574A = c5318u;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C10698c c10698c = new C10698c(this.f27574A, interfaceC1886d);
            c10698c.f27577z = obj;
            return c10698c;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d<? super C5318u> interfaceC1886d) {
            return ((C10698c) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0048 -> B:30:0x004e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r9.f27576y
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                long r3 = r9.f27575x
                java.lang.Object r1 = r9.f27577z
                f1.c r1 = (p093f1.InterfaceC5274c) r1
                p468yc.C13186n.m1453b(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L4e
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                p468yc.C13186n.m1453b(r10)
                java.lang.Object r10 = r9.f27577z
                f1.c r10 = (p093f1.InterfaceC5274c) r10
                f1.u r1 = r9.f27574A
                long r3 = r1.m24645n()
                androidx.compose.ui.platform.p1 r1 = r10.getViewConfiguration()
                long r5 = r1.m39643b()
                long r3 = r3 + r5
                r1 = r10
                r10 = r9
            L39:
                r5 = 0
                r6 = 0
                r10.f27577z = r1
                r10.f27575x = r3
                r10.f27576y = r2
                java.lang.Object r5 = p372u.C10695i0.m7306e(r1, r5, r10, r2, r6)
                if (r5 != r0) goto L48
                return r0
            L48:
                r8 = r0
                r0 = r10
                r10 = r5
                r4 = r3
                r3 = r1
                r1 = r8
            L4e:
                f1.u r10 = (p093f1.C5318u) r10
                long r6 = r10.m24645n()
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 < 0) goto L59
                return r10
            L59:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L39
            */
            throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.C10698c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m20196f = "TapGestureDetector.kt", m20195l = {175}, m20194m = "consumeUntilUp")
    /* renamed from: u.i0$d */
    /* loaded from: classes.dex */
    public static final class C10699d extends AbstractC6757d {

        /* renamed from: w */
        Object f27578w;

        /* renamed from: x */
        /* synthetic */ Object f27579x;

        /* renamed from: y */
        int f27580y;

        C10699d(InterfaceC1886d<? super C10699d> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27579x = obj;
            this.f27580y |= Integer.MIN_VALUE;
            return C10695i0.m7303h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m20196f = "TapGestureDetector.kt", m20195l = {207}, m20194m = "invokeSuspend")
    /* renamed from: u.i0$e */
    /* loaded from: classes.dex */
    public static final class C10700e extends AbstractC6764l implements InterfaceC6112p<InterfaceC5276c0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27581A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27582B;

        /* renamed from: x */
        int f27583x;

        /* renamed from: y */
        private /* synthetic */ Object f27584y;

        /* renamed from: z */
        final /* synthetic */ TapGestureDetector f27585z;

        /* compiled from: TapGestureDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m20196f = "TapGestureDetector.kt", m20195l = {209}, m20194m = "invokeSuspend")
        /* renamed from: u.i0$e$a */
        /* loaded from: classes.dex */
        public static final class C10701a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

            /* renamed from: A */
            final /* synthetic */ InterfaceC5276c0 f27586A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27587B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27588C;

            /* renamed from: x */
            int f27589x;

            /* renamed from: y */
            private /* synthetic */ Object f27590y;

            /* renamed from: z */
            final /* synthetic */ TapGestureDetector f27591z;

            /* compiled from: TapGestureDetector.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m20196f = "TapGestureDetector.kt", m20195l = {211, 217}, m20194m = "invokeSuspend")
            /* renamed from: u.i0$e$a$a */
            /* loaded from: classes.dex */
            public static final class C10702a extends AbstractC6763k implements InterfaceC6112p<InterfaceC5274c, InterfaceC1886d<? super C13195u>, Object> {

                /* renamed from: A */
                final /* synthetic */ InterfaceC10524i0 f27592A;

                /* renamed from: B */
                final /* synthetic */ TapGestureDetector f27593B;

                /* renamed from: C */
                final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27594C;

                /* renamed from: x */
                int f27595x;

                /* renamed from: y */
                private /* synthetic */ Object f27596y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27597z;

                /* compiled from: TapGestureDetector.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", m20196f = "TapGestureDetector.kt", m20195l = {214}, m20194m = "invokeSuspend")
                /* renamed from: u.i0$e$a$a$a */
                /* loaded from: classes.dex */
                public static final class C10703a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

                    /* renamed from: A */
                    final /* synthetic */ C5318u f27598A;

                    /* renamed from: x */
                    int f27599x;

                    /* renamed from: y */
                    final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27600y;

                    /* renamed from: z */
                    final /* synthetic */ TapGestureDetector f27601z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C10703a(InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, TapGestureDetector tapGestureDetector, C5318u c5318u, InterfaceC1886d<? super C10703a> interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f27600y = interfaceC6113q;
                        this.f27601z = tapGestureDetector;
                        this.f27598A = c5318u;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                        return new C10703a(this.f27600y, this.f27601z, this.f27598A, interfaceC1886d);
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                        return ((C10703a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27599x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> interfaceC6113q = this.f27600y;
                            TapGestureDetector tapGestureDetector = this.f27601z;
                            C10774f m7152d = C10774f.m7152d(this.f27598A.m24651h());
                            this.f27599x = 1;
                            if (interfaceC6113q.mo4533i(tapGestureDetector, m7152d, this) == m34636d) {
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
                /* JADX WARN: Multi-variable type inference failed */
                C10702a(InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC10524i0 interfaceC10524i0, TapGestureDetector tapGestureDetector, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC1886d<? super C10702a> interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f27597z = interfaceC6113q;
                    this.f27592A = interfaceC10524i0;
                    this.f27593B = tapGestureDetector;
                    this.f27594C = interfaceC6108l;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                    C10702a c10702a = new C10702a(this.f27597z, this.f27592A, this.f27593B, this.f27594C, interfaceC1886d);
                    c10702a.f27596y = obj;
                    return c10702a;
                }

                @Override // id.InterfaceC6112p
                /* renamed from: d */
                public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                    return ((C10702a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x006b  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = cd.C2111b.m34640d()
                        int r1 = r12.f27595x
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r4) goto L1b
                        if (r1 != r2) goto L13
                        p468yc.C13186n.m1453b(r13)
                        goto L61
                    L13:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1b:
                        java.lang.Object r1 = r12.f27596y
                        f1.c r1 = (p093f1.InterfaceC5274c) r1
                        p468yc.C13186n.m1453b(r13)
                        goto L37
                    L23:
                        p468yc.C13186n.m1453b(r13)
                        java.lang.Object r13 = r12.f27596y
                        r1 = r13
                        f1.c r1 = (p093f1.InterfaceC5274c) r1
                        r13 = 0
                        r12.f27596y = r1
                        r12.f27595x = r4
                        java.lang.Object r13 = p372u.C10695i0.m7306e(r1, r13, r12, r4, r3)
                        if (r13 != r0) goto L37
                        return r0
                    L37:
                        f1.u r13 = (p093f1.C5318u) r13
                        p093f1.C5307n.m24698f(r13)
                        id.q<u.y, u0.f, bd.d<? super yc.u>, java.lang.Object> r4 = r12.f27597z
                        id.q r5 = p372u.C10695i0.m7308c()
                        if (r4 == r5) goto L56
                        td.i0 r6 = r12.f27592A
                        r7 = 0
                        r8 = 0
                        u.i0$e$a$a$a r9 = new u.i0$e$a$a$a
                        id.q<u.y, u0.f, bd.d<? super yc.u>, java.lang.Object> r4 = r12.f27597z
                        u.z r5 = r12.f27593B
                        r9.<init>(r4, r5, r13, r3)
                        r10 = 3
                        r11 = 0
                        kotlinx.coroutines.C6769b.m20167d(r6, r7, r8, r9, r10, r11)
                    L56:
                        r12.f27596y = r3
                        r12.f27595x = r2
                        java.lang.Object r13 = p372u.C10695i0.m7299l(r1, r12)
                        if (r13 != r0) goto L61
                        return r0
                    L61:
                        f1.u r13 = (p093f1.C5318u) r13
                        if (r13 != 0) goto L6b
                        u.z r13 = r12.f27593B
                        r13.m7182k()
                        goto L83
                    L6b:
                        p093f1.C5307n.m24698f(r13)
                        u.z r0 = r12.f27593B
                        r0.m7181n()
                        id.l<u0.f, yc.u> r0 = r12.f27594C
                        if (r0 != 0) goto L78
                        goto L83
                    L78:
                        long r1 = r13.m24651h()
                        u0.f r13 = p373u0.C10774f.m7152d(r1)
                        r0.mo9587d(r13)
                    L83:
                        yc.u r13 = p468yc.C13195u.f34156a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.C10700e.C10701a.C10702a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C10701a(TapGestureDetector tapGestureDetector, InterfaceC5276c0 interfaceC5276c0, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC1886d<? super C10701a> interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27591z = tapGestureDetector;
                this.f27586A = interfaceC5276c0;
                this.f27587B = interfaceC6113q;
                this.f27588C = interfaceC6108l;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                C10701a c10701a = new C10701a(this.f27591z, this.f27586A, this.f27587B, this.f27588C, interfaceC1886d);
                c10701a.f27590y = obj;
                return c10701a;
            }

            @Override // id.InterfaceC6112p
            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                return ((C10701a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27589x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f27590y;
                    this.f27591z.m7180o();
                    InterfaceC5276c0 interfaceC5276c0 = this.f27586A;
                    C10702a c10702a = new C10702a(this.f27587B, interfaceC10524i0, this.f27591z, this.f27588C, null);
                    this.f27589x = 1;
                    if (interfaceC5276c0.mo24820Z(c10702a, this) == m34636d) {
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
        /* JADX WARN: Multi-variable type inference failed */
        C10700e(TapGestureDetector tapGestureDetector, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC1886d<? super C10700e> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27585z = tapGestureDetector;
            this.f27581A = interfaceC6113q;
            this.f27582B = interfaceC6108l;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C10700e c10700e = new C10700e(this.f27585z, this.f27581A, this.f27582B, interfaceC1886d);
            c10700e.f27584y = obj;
            return c10700e;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C10700e) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27583x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C10701a c10701a = new C10701a(this.f27585z, (InterfaceC5276c0) this.f27584y, this.f27581A, this.f27582B, null);
                this.f27583x = 1;
                if (C10531j0.m7768d(c10701a, this) == m34636d) {
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

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m20196f = "TapGestureDetector.kt", m20195l = {C0868i.f2968t0}, m20194m = "invokeSuspend")
    /* renamed from: u.i0$f */
    /* loaded from: classes.dex */
    public static final class C10704f extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27602A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27603B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27604C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27605D;

        /* renamed from: x */
        int f27606x;

        /* renamed from: y */
        private /* synthetic */ Object f27607y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC5276c0 f27608z;

        /* compiled from: TapGestureDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m20196f = "TapGestureDetector.kt", m20195l = {C0868i.f2973u0}, m20194m = "invokeSuspend")
        /* renamed from: u.i0$f$a */
        /* loaded from: classes.dex */
        public static final class C10705a extends AbstractC6764l implements InterfaceC6112p<InterfaceC5276c0, InterfaceC1886d<? super C13195u>, Object> {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27609A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC10524i0 f27610B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27611C;

            /* renamed from: D */
            final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27612D;

            /* renamed from: E */
            final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27613E;

            /* renamed from: x */
            int f27614x;

            /* renamed from: y */
            private /* synthetic */ Object f27615y;

            /* renamed from: z */
            final /* synthetic */ TapGestureDetector f27616z;

            /* compiled from: TapGestureDetector.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m20196f = "TapGestureDetector.kt", m20195l = {C0868i.f2978v0, C0868i.f2768G0, C4906j.f13380A0, 128, 141, 159}, m20194m = "invokeSuspend")
            /* renamed from: u.i0$f$a$a */
            /* loaded from: classes.dex */
            public static final class C10706a extends AbstractC6763k implements InterfaceC6112p<InterfaceC5274c, InterfaceC1886d<? super C13195u>, Object> {

                /* renamed from: A */
                long f27617A;

                /* renamed from: B */
                int f27618B;

                /* renamed from: C */
                private /* synthetic */ Object f27619C;

                /* renamed from: D */
                final /* synthetic */ TapGestureDetector f27620D;

                /* renamed from: E */
                final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27621E;

                /* renamed from: F */
                final /* synthetic */ InterfaceC10524i0 f27622F;

                /* renamed from: G */
                final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27623G;

                /* renamed from: H */
                final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27624H;

                /* renamed from: I */
                final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27625I;

                /* renamed from: x */
                Object f27626x;

                /* renamed from: y */
                Object f27627y;

                /* renamed from: z */
                Object f27628z;

                /* compiled from: TapGestureDetector.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", m20196f = "TapGestureDetector.kt", m20195l = {C0868i.f2998z0}, m20194m = "invokeSuspend")
                /* renamed from: u.i0$f$a$a$a */
                /* loaded from: classes.dex */
                public static final class C10707a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

                    /* renamed from: A */
                    final /* synthetic */ C5318u f27629A;

                    /* renamed from: x */
                    int f27630x;

                    /* renamed from: y */
                    final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27631y;

                    /* renamed from: z */
                    final /* synthetic */ TapGestureDetector f27632z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C10707a(InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, TapGestureDetector tapGestureDetector, C5318u c5318u, InterfaceC1886d<? super C10707a> interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f27631y = interfaceC6113q;
                        this.f27632z = tapGestureDetector;
                        this.f27629A = c5318u;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                        return new C10707a(this.f27631y, this.f27632z, this.f27629A, interfaceC1886d);
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                        return ((C10707a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27630x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> interfaceC6113q = this.f27631y;
                            TapGestureDetector tapGestureDetector = this.f27632z;
                            C10774f m7152d = C10774f.m7152d(this.f27629A.m24651h());
                            this.f27630x = 1;
                            if (interfaceC6113q.mo4533i(tapGestureDetector, m7152d, this) == m34636d) {
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

                /* compiled from: TapGestureDetector.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", m20196f = "TapGestureDetector.kt", m20195l = {C0868i.f2773H0}, m20194m = "invokeSuspend")
                /* renamed from: u.i0$f$a$a$b */
                /* loaded from: classes.dex */
                public static final class C10708b extends AbstractC6763k implements InterfaceC6112p<InterfaceC5274c, InterfaceC1886d<? super C5318u>, Object> {

                    /* renamed from: x */
                    int f27633x;

                    /* renamed from: y */
                    private /* synthetic */ Object f27634y;

                    C10708b(InterfaceC1886d<? super C10708b> interfaceC1886d) {
                        super(2, interfaceC1886d);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                        C10708b c10708b = new C10708b(interfaceC1886d);
                        c10708b.f27634y = obj;
                        return c10708b;
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d<? super C5318u> interfaceC1886d) {
                        return ((C10708b) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27633x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            this.f27633x = 1;
                            obj = C10695i0.m7299l((InterfaceC5274c) this.f27634y, this);
                            if (obj == m34636d) {
                                return m34636d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13186n.m1453b(obj);
                        }
                        return obj;
                    }
                }

                /* compiled from: TapGestureDetector.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", m20196f = "TapGestureDetector.kt", m20195l = {136}, m20194m = "invokeSuspend")
                /* renamed from: u.i0$f$a$a$c */
                /* loaded from: classes.dex */
                public static final class C10709c extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

                    /* renamed from: A */
                    final /* synthetic */ C5318u f27635A;

                    /* renamed from: x */
                    int f27636x;

                    /* renamed from: y */
                    final /* synthetic */ InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> f27637y;

                    /* renamed from: z */
                    final /* synthetic */ TapGestureDetector f27638z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C10709c(InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, TapGestureDetector tapGestureDetector, C5318u c5318u, InterfaceC1886d<? super C10709c> interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f27637y = interfaceC6113q;
                        this.f27638z = tapGestureDetector;
                        this.f27635A = c5318u;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                        return new C10709c(this.f27637y, this.f27638z, this.f27635A, interfaceC1886d);
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                        return ((C10709c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27636x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            InterfaceC6113q<InterfaceC10767y, C10774f, InterfaceC1886d<? super C13195u>, Object> interfaceC6113q = this.f27637y;
                            TapGestureDetector tapGestureDetector = this.f27638z;
                            C10774f m7152d = C10774f.m7152d(this.f27635A.m24651h());
                            this.f27636x = 1;
                            if (interfaceC6113q.mo4533i(tapGestureDetector, m7152d, this) == m34636d) {
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

                /* compiled from: TapGestureDetector.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", m20196f = "TapGestureDetector.kt", m20195l = {142}, m20194m = "invokeSuspend")
                /* renamed from: u.i0$f$a$a$d */
                /* loaded from: classes.dex */
                public static final class C10710d extends AbstractC6763k implements InterfaceC6112p<InterfaceC5274c, InterfaceC1886d<? super C13195u>, Object> {

                    /* renamed from: A */
                    final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27639A;

                    /* renamed from: B */
                    final /* synthetic */ InterfaceC6108l<C10774f, C13195u> f27640B;

                    /* renamed from: C */
                    final /* synthetic */ C6449y<C5318u> f27641C;

                    /* renamed from: x */
                    int f27642x;

                    /* renamed from: y */
                    private /* synthetic */ Object f27643y;

                    /* renamed from: z */
                    final /* synthetic */ TapGestureDetector f27644z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C10710d(TapGestureDetector tapGestureDetector, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l2, C6449y<C5318u> c6449y, InterfaceC1886d<? super C10710d> interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f27644z = tapGestureDetector;
                        this.f27639A = interfaceC6108l;
                        this.f27640B = interfaceC6108l2;
                        this.f27641C = c6449y;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                        C10710d c10710d = new C10710d(this.f27644z, this.f27639A, this.f27640B, this.f27641C, interfaceC1886d);
                        c10710d.f27643y = obj;
                        return c10710d;
                    }

                    @Override // id.InterfaceC6112p
                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                        return ((C10710d) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27642x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            this.f27642x = 1;
                            obj = C10695i0.m7299l((InterfaceC5274c) this.f27643y, this);
                            if (obj == m34636d) {
                                return m34636d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13186n.m1453b(obj);
                        }
                        C5318u c5318u = (C5318u) obj;
                        if (c5318u != null) {
                            C5307n.m24698f(c5318u);
                            this.f27644z.m7181n();
                            this.f27639A.mo9587d(C10774f.m7152d(c5318u.m24651h()));
                            return C13195u.f34156a;
                        }
                        this.f27644z.m7182k();
                        InterfaceC6108l<C10774f, C13195u> interfaceC6108l = this.f27640B;
                        if (interfaceC6108l == null) {
                            return null;
                        }
                        interfaceC6108l.mo9587d(C10774f.m7152d(this.f27641C.f17533w.m24651h()));
                        return C13195u.f34156a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C10706a(TapGestureDetector tapGestureDetector, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l2, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l3, InterfaceC1886d<? super C10706a> interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f27620D = tapGestureDetector;
                    this.f27621E = interfaceC6113q;
                    this.f27622F = interfaceC10524i0;
                    this.f27623G = interfaceC6108l;
                    this.f27624H = interfaceC6108l2;
                    this.f27625I = interfaceC6108l3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                    C10706a c10706a = new C10706a(this.f27620D, this.f27621E, this.f27622F, this.f27623G, this.f27624H, this.f27625I, interfaceC1886d);
                    c10706a.f27619C = obj;
                    return c10706a;
                }

                @Override // id.InterfaceC6112p
                /* renamed from: d */
                public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                    return ((C10706a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:122:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x00df A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:131:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x00e9 A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:132:0x00e3, B:134:0x00e9, B:135:0x00ef), top: B:188:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:135:0x00ef A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:132:0x00e3, B:134:0x00e9, B:135:0x00ef), top: B:188:0x00e3 }] */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x0120 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:148:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0161  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x01c1  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x01ef A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 522
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.C10704f.C10705a.C10706a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C10705a(TapGestureDetector tapGestureDetector, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC10524i0 interfaceC10524i0, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l2, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l3, InterfaceC1886d<? super C10705a> interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27616z = tapGestureDetector;
                this.f27609A = interfaceC6113q;
                this.f27610B = interfaceC10524i0;
                this.f27611C = interfaceC6108l;
                this.f27612D = interfaceC6108l2;
                this.f27613E = interfaceC6108l3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                C10705a c10705a = new C10705a(this.f27616z, this.f27609A, this.f27610B, this.f27611C, this.f27612D, this.f27613E, interfaceC1886d);
                c10705a.f27615y = obj;
                return c10705a;
            }

            @Override // id.InterfaceC6112p
            /* renamed from: d */
            public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                return ((C10705a) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27614x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C10706a c10706a = new C10706a(this.f27616z, this.f27609A, this.f27610B, this.f27611C, this.f27612D, this.f27613E, null);
                    this.f27614x = 1;
                    if (((InterfaceC5276c0) this.f27615y).mo24820Z(c10706a, this) == m34636d) {
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
        /* JADX WARN: Multi-variable type inference failed */
        C10704f(InterfaceC5276c0 interfaceC5276c0, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l2, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l3, InterfaceC1886d<? super C10704f> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27608z = interfaceC5276c0;
            this.f27602A = interfaceC6113q;
            this.f27603B = interfaceC6108l;
            this.f27604C = interfaceC6108l2;
            this.f27605D = interfaceC6108l3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C10704f c10704f = new C10704f(this.f27608z, this.f27602A, this.f27603B, this.f27604C, this.f27605D, interfaceC1886d);
            c10704f.f27607y = obj;
            return c10704f;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C10704f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27606x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f27607y;
                TapGestureDetector tapGestureDetector = new TapGestureDetector(this.f27608z);
                InterfaceC5276c0 interfaceC5276c0 = this.f27608z;
                C10705a c10705a = new C10705a(tapGestureDetector, this.f27602A, interfaceC10524i0, this.f27603B, this.f27604C, this.f27605D, null);
                this.f27606x = 1;
                if (ForEachGesture.m7214d(interfaceC5276c0, c10705a, this) == m34636d) {
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

    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m20196f = "TapGestureDetector.kt", m20195l = {263, 278}, m20194m = "waitForUpOrCancellation")
    /* renamed from: u.i0$g */
    /* loaded from: classes.dex */
    public static final class C10711g extends AbstractC6757d {

        /* renamed from: w */
        Object f27645w;

        /* renamed from: x */
        /* synthetic */ Object f27646x;

        /* renamed from: y */
        int f27647y;

        C10711g(InterfaceC1886d<? super C10711g> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27646x = obj;
            this.f27647y |= Integer.MIN_VALUE;
            return C10695i0.m7299l(null, this);
        }
    }

    /* renamed from: d */
    public static final Object m7307d(InterfaceC5274c interfaceC5274c, boolean z, InterfaceC1886d<? super C5318u> interfaceC1886d) {
        return m7305f(interfaceC5274c, EnumC0662a.Main, z, interfaceC1886d);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m7306e(InterfaceC5274c interfaceC5274c, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m7307d(interfaceC5274c, z, interfaceC1886d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x004d -> B:51:0x0050). Please submit an issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7305f(p093f1.InterfaceC5274c r9, androidx.compose.p018ui.input.pointer.EnumC0662a r10, boolean r11, bd.InterfaceC1886d<? super p093f1.C5318u> r12) {
        /*
            boolean r0 = r12 instanceof p372u.C10695i0.C10697b
            if (r0 == 0) goto L13
            r0 = r12
            u.i0$b r0 = (p372u.C10695i0.C10697b) r0
            int r1 = r0.f27569A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27569A = r1
            goto L18
        L13:
            u.i0$b r0 = new u.i0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f27573z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27569A
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f27572y
            java.lang.Object r10 = r0.f27571x
            androidx.compose.ui.input.pointer.a r10 = (androidx.compose.p018ui.input.pointer.EnumC0662a) r10
            java.lang.Object r11 = r0.f27570w
            f1.c r11 = (p093f1.InterfaceC5274c) r11
            p468yc.C13186n.m1453b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            p468yc.C13186n.m1453b(r12)
        L41:
            r0.f27570w = r9
            r0.f27571x = r10
            r0.f27572y = r11
            r0.f27569A = r3
            java.lang.Object r12 = r9.mo24823b0(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            f1.m r12 = (p093f1.C5306m) r12
            java.util.List r2 = r12.m24707b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L77
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            f1.u r6 = (p093f1.C5318u) r6
            if (r11 == 0) goto L6d
            boolean r6 = p093f1.C5307n.m24703a(r6)
            goto L71
        L6d:
            boolean r6 = p093f1.C5307n.m24702b(r6)
        L71:
            if (r6 != 0) goto L75
            r2 = r5
            goto L78
        L75:
            r6 = r7
            goto L5c
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.m24707b()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.m7305f(f1.c, androidx.compose.ui.input.pointer.a, boolean, bd.d):java.lang.Object");
    }

    /* renamed from: g */
    public static final Object m7304g(InterfaceC5274c interfaceC5274c, C5318u c5318u, InterfaceC1886d<? super C5318u> interfaceC1886d) {
        return interfaceC5274c.mo24825T(interfaceC5274c.getViewConfiguration().m39644a(), new C10698c(c5318u, null), interfaceC1886d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[LOOP:0: B:52:0x0050->B:53:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c A[EDGE_INSN: B:65:0x007c->B:60:0x007c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0041 -> B:51:0x0044). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7303h(p093f1.InterfaceC5274c r8, bd.InterfaceC1886d<? super p468yc.C13195u> r9) {
        /*
            boolean r0 = r9 instanceof p372u.C10695i0.C10699d
            if (r0 == 0) goto L13
            r0 = r9
            u.i0$d r0 = (p372u.C10695i0.C10699d) r0
            int r1 = r0.f27580y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27580y = r1
            goto L18
        L13:
            u.i0$d r0 = new u.i0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27579x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27580y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f27578w
            f1.c r8 = (p093f1.InterfaceC5274c) r8
            p468yc.C13186n.m1453b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p468yc.C13186n.m1453b(r9)
        L38:
            r0.f27578w = r8
            r0.f27580y = r3
            r9 = 0
            java.lang.Object r9 = p093f1.InterfaceC5274c.C5275a.m24821a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            f1.m r9 = (p093f1.C5306m) r9
            java.util.List r2 = r9.m24707b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5f
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            f1.u r6 = (p093f1.C5318u) r6
            p093f1.C5307n.m24699e(r6)
            r6 = r7
            goto L50
        L5f:
            java.util.List r9 = r9.m24707b()
            int r2 = r9.size()
            r4 = r5
        L68:
            if (r4 >= r2) goto L7c
            int r6 = r4 + 1
            java.lang.Object r4 = r9.get(r4)
            f1.u r4 = (p093f1.C5318u) r4
            boolean r4 = r4.m24650i()
            if (r4 == 0) goto L7a
            r5 = r3
            goto L7c
        L7a:
            r4 = r6
            goto L68
        L7c:
            if (r5 != 0) goto L38
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.m7303h(f1.c, bd.d):java.lang.Object");
    }

    /* renamed from: i */
    public static final Object m7302i(InterfaceC5276c0 interfaceC5276c0, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object m7214d = ForEachGesture.m7214d(interfaceC5276c0, new C10700e(new TapGestureDetector(interfaceC5276c0), interfaceC6113q, interfaceC6108l, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7214d == m34636d ? m7214d : C13195u.f34156a;
    }

    /* renamed from: j */
    public static final Object m7301j(InterfaceC5276c0 interfaceC5276c0, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l2, InterfaceC6113q<? super InterfaceC10767y, ? super C10774f, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6108l<? super C10774f, C13195u> interfaceC6108l3, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C10704f(interfaceC5276c0, interfaceC6113q, interfaceC6108l2, interfaceC6108l, interfaceC6108l3, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m7300k(InterfaceC5276c0 interfaceC5276c0, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, InterfaceC6113q interfaceC6113q, InterfaceC6108l interfaceC6108l3, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        InterfaceC6108l interfaceC6108l4 = (i & 1) != 0 ? null : interfaceC6108l;
        InterfaceC6108l interfaceC6108l5 = (i & 2) != 0 ? null : interfaceC6108l2;
        if ((i & 4) != 0) {
            interfaceC6113q = f27567a;
        }
        return m7301j(interfaceC5276c0, interfaceC6108l4, interfaceC6108l5, interfaceC6113q, (i & 8) != 0 ? null : interfaceC6108l3, interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x00c1 -> B:111:0x00c4). Please submit an issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7299l(p093f1.InterfaceC5274c r13, bd.InterfaceC1886d<? super p093f1.C5318u> r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10695i0.m7299l(f1.c, bd.d):java.lang.Object");
    }
}
