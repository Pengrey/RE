package p372u;

import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p093f1.C5280e0;
import p093f1.C5306m;
import p093f1.C5307n;
import p093f1.C5317t;
import p093f1.C5318u;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p181jd.AbstractC6438m;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13605g;
import td.InterfaceC10524i0;

/* renamed from: u.j */
/* loaded from: classes.dex */
public final class DragGestureDetector {

    /* renamed from: a */
    private static final float f27648a;

    /* renamed from: b */
    private static final float f27649b;

    /* renamed from: c */
    private static final float f27650c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {825}, m20194m = "awaitDragOrCancellation-rnUCldI")
    /* renamed from: u.j$a */
    /* loaded from: classes.dex */
    public static final class C10712a extends AbstractC6757d {

        /* renamed from: w */
        Object f27651w;

        /* renamed from: x */
        Object f27652x;

        /* renamed from: y */
        /* synthetic */ Object f27653y;

        /* renamed from: z */
        int f27654z;

        C10712a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27653y = obj;
            this.f27654z |= Integer.MIN_VALUE;
            return DragGestureDetector.m7283c(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {831, 869}, m20194m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
    /* renamed from: u.j$b */
    /* loaded from: classes.dex */
    public static final class C10713b extends AbstractC6757d {

        /* renamed from: A */
        float f27655A;

        /* renamed from: B */
        float f27656B;

        /* renamed from: C */
        /* synthetic */ Object f27657C;

        /* renamed from: D */
        int f27658D;

        /* renamed from: w */
        Object f27659w;

        /* renamed from: x */
        Object f27660x;

        /* renamed from: y */
        Object f27661y;

        /* renamed from: z */
        Object f27662z;

        C10713b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27657C = obj;
            this.f27658D |= Integer.MIN_VALUE;
            return DragGestureDetector.m7282d(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {756}, m20194m = "awaitLongPressOrCancellation")
    /* renamed from: u.j$c */
    /* loaded from: classes.dex */
    public static final class C10714c extends AbstractC6757d {

        /* renamed from: w */
        Object f27663w;

        /* renamed from: x */
        Object f27664x;

        /* renamed from: y */
        /* synthetic */ Object f27665y;

        /* renamed from: z */
        int f27666z;

        C10714c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27665y = obj;
            this.f27666z |= Integer.MIN_VALUE;
            return DragGestureDetector.m7285a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m20196f = "DragGestureDetector.kt", m20195l = {757}, m20194m = "invokeSuspend")
    /* renamed from: u.j$d */
    /* loaded from: classes.dex */
    public static final class C10715d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C6449y f27667A;

        /* renamed from: x */
        int f27668x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC5276c0 f27669y;

        /* renamed from: z */
        final /* synthetic */ C6449y f27670z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DragGestureDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", m20196f = "DragGestureDetector.kt", m20195l = {760, 777}, m20194m = "invokeSuspend")
        /* renamed from: u.j$d$a */
        /* loaded from: classes.dex */
        public static final class C10716a extends AbstractC6763k implements InterfaceC6112p {

            /* renamed from: A */
            private /* synthetic */ Object f27671A;

            /* renamed from: B */
            final /* synthetic */ C6449y f27672B;

            /* renamed from: C */
            final /* synthetic */ C6449y f27673C;

            /* renamed from: x */
            Object f27674x;

            /* renamed from: y */
            int f27675y;

            /* renamed from: z */
            int f27676z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10716a(C6449y c6449y, C6449y c6449y2, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27672B = c6449y;
                this.f27673C = c6449y2;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10716a c10716a = new C10716a(this.f27672B, this.f27673C, interfaceC1886d);
                c10716a.f27671A = obj;
                return c10716a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                return ((C10716a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00ea A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x007a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00b4 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v10, types: [T, f1.u] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c9 -> B:44:0x00cb). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 362
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.C10715d.C10716a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10715d(InterfaceC5276c0 interfaceC5276c0, C6449y c6449y, C6449y c6449y2, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27669y = interfaceC5276c0;
            this.f27670z = c6449y;
            this.f27667A = c6449y2;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10715d(this.f27669y, this.f27670z, this.f27667A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10715d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27668x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC5276c0 interfaceC5276c0 = this.f27669y;
                C10716a c10716a = new C10716a(this.f27670z, this.f27667A, null);
                this.f27668x = 1;
                if (interfaceC5276c0.mo24820Z(c10716a, this) == m34636d) {
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
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {831, 869}, m20194m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
    /* renamed from: u.j$e */
    /* loaded from: classes.dex */
    public static final class C10717e extends AbstractC6757d {

        /* renamed from: A */
        float f27677A;

        /* renamed from: B */
        float f27678B;

        /* renamed from: C */
        /* synthetic */ Object f27679C;

        /* renamed from: D */
        int f27680D;

        /* renamed from: w */
        Object f27681w;

        /* renamed from: x */
        Object f27682x;

        /* renamed from: y */
        Object f27683y;

        /* renamed from: z */
        Object f27684z;

        C10717e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27679C = obj;
            this.f27680D |= Integer.MIN_VALUE;
            return DragGestureDetector.m7280f(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m20196f = "DragGestureDetector.kt", m20195l = {279, 283, 287}, m20194m = "invokeSuspend")
    /* renamed from: u.j$f */
    /* loaded from: classes.dex */
    public static final class C10718f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6097a f27685A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6097a f27686B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6112p f27687C;

        /* renamed from: x */
        int f27688x;

        /* renamed from: y */
        private /* synthetic */ Object f27689y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f27690z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DragGestureDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", m20196f = "DragGestureDetector.kt", m20195l = {289}, m20194m = "invokeSuspend")
        /* renamed from: u.j$f$a */
        /* loaded from: classes.dex */
        public static final class C10719a extends AbstractC6763k implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6097a f27691A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC6097a f27692B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6112p f27693C;

            /* renamed from: x */
            int f27694x;

            /* renamed from: y */
            private /* synthetic */ Object f27695y;

            /* renamed from: z */
            final /* synthetic */ C5318u f27696z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DragGestureDetector.kt */
            /* renamed from: u.j$f$a$a */
            /* loaded from: classes.dex */
            public static final class C10720a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ InterfaceC6112p f27697w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10720a(InterfaceC6112p interfaceC6112p) {
                    super(1);
                    this.f27697w = interfaceC6112p;
                }

                /* renamed from: a */
                public final void m7269a(C5318u c5318u) {
                    Intrinsics.isThisObjectNull(c5318u, "it");
                    this.f27697w.mo39856d(c5318u, C10774f.m7152d(C5307n.m24694j(c5318u)));
                    C5307n.m24697g(c5318u);
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m7269a((C5318u) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10719a(C5318u c5318u, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27696z = c5318u;
                this.f27691A = interfaceC6097a;
                this.f27692B = interfaceC6097a2;
                this.f27693C = interfaceC6112p;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10719a c10719a = new C10719a(this.f27696z, this.f27691A, this.f27692B, this.f27693C, interfaceC1886d);
                c10719a.f27695y = obj;
                return c10719a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                return ((C10719a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                InterfaceC5274c interfaceC5274c;
                m34636d = C2116d.m34636d();
                int i = this.f27694x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC5274c interfaceC5274c2 = (InterfaceC5274c) this.f27695y;
                    long m24652g = this.f27696z.m24652g();
                    C10720a c10720a = new C10720a(this.f27693C);
                    this.f27695y = interfaceC5274c2;
                    this.f27694x = 1;
                    Object m7278h = DragGestureDetector.m7278h(interfaceC5274c2, m24652g, c10720a, this);
                    if (m7278h == m34636d) {
                        return m34636d;
                    }
                    interfaceC5274c = interfaceC5274c2;
                    obj = m7278h;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    interfaceC5274c = (InterfaceC5274c) this.f27695y;
                    C13186n.m1453b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    List m24707b = interfaceC5274c.mo24822w().m24707b();
                    int i2 = 0;
                    int size = m24707b.size();
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        C5318u c5318u = (C5318u) m24707b.get(i2);
                        if (C5307n.m24701c(c5318u)) {
                            C5307n.m24698f(c5318u);
                        }
                        i2 = i3;
                    }
                    this.f27691A.mo42214q();
                } else {
                    this.f27692B.mo42214q();
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DragGestureDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", m20196f = "DragGestureDetector.kt", m20195l = {280}, m20194m = "invokeSuspend")
        /* renamed from: u.j$f$b */
        /* loaded from: classes.dex */
        public static final class C10721b extends AbstractC6763k implements InterfaceC6112p {

            /* renamed from: x */
            int f27698x;

            /* renamed from: y */
            private /* synthetic */ Object f27699y;

            C10721b(InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10721b c10721b = new C10721b(interfaceC1886d);
                c10721b.f27699y = obj;
                return c10721b;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                return ((C10721b) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27698x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f27698x = 1;
                    obj = C10695i0.m7307d((InterfaceC5274c) this.f27699y, false, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10718f(InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27690z = interfaceC6108l;
            this.f27685A = interfaceC6097a;
            this.f27686B = interfaceC6097a2;
            this.f27687C = interfaceC6112p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10718f c10718f = new C10718f(this.f27690z, this.f27685A, this.f27686B, this.f27687C, interfaceC1886d);
            c10718f.f27689y = obj;
            return c10718f;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C10718f) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0025, B:25:0x0058, B:27:0x005d, B:22:0x004d), top: B:34:0x000a }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r11.f27688x
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                p468yc.C13186n.m1453b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L82
            L17:
                r12 = move-exception
                goto L85
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.f27689y
                f1.c0 r1 = (p093f1.InterfaceC5276c0) r1
                p468yc.C13186n.m1453b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L58
            L29:
                java.lang.Object r1 = r11.f27689y
                f1.c0 r1 = (p093f1.InterfaceC5276c0) r1
                p468yc.C13186n.m1453b(r12)
                goto L4b
            L31:
                p468yc.C13186n.m1453b(r12)
                java.lang.Object r12 = r11.f27689y
                f1.c0 r12 = (p093f1.InterfaceC5276c0) r12
                u.j$f$b r1 = new u.j$f$b
                r1.<init>(r2)
                r11.f27689y = r12
                r11.f27688x = r5
                java.lang.Object r1 = r12.mo24820Z(r1, r11)
                if (r1 != r0) goto L48
                return r0
            L48:
                r10 = r1
                r1 = r12
                r12 = r10
            L4b:
                f1.u r12 = (p093f1.C5318u) r12
                r11.f27689y = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f27688x = r4     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = p372u.DragGestureDetector.m7285a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L58
                return r0
            L58:
                r5 = r12
                f1.u r5 = (p093f1.C5318u) r5     // Catch: java.util.concurrent.CancellationException -> L17
                if (r5 == 0) goto L82
                id.l r12 = r11.f27690z     // Catch: java.util.concurrent.CancellationException -> L17
                long r6 = r5.m24651h()     // Catch: java.util.concurrent.CancellationException -> L17
                u0.f r4 = p373u0.C10774f.m7152d(r6)     // Catch: java.util.concurrent.CancellationException -> L17
                r12.mo9587d(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                u.j$f$a r12 = new u.j$f$a     // Catch: java.util.concurrent.CancellationException -> L17
                id.a r6 = r11.f27686B     // Catch: java.util.concurrent.CancellationException -> L17
                id.a r7 = r11.f27685A     // Catch: java.util.concurrent.CancellationException -> L17
                id.p r8 = r11.f27687C     // Catch: java.util.concurrent.CancellationException -> L17
                r9 = 0
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f27689y = r2     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f27688x = r3     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = r1.mo24820Z(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L82
                return r0
            L82:
                yc.u r12 = p468yc.C13195u.f34156a
                return r12
            L85:
                id.a r0 = r11.f27685A
                r0.mo42214q()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.C10718f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {166}, m20194m = "drag-jO51t88")
    /* renamed from: u.j$g */
    /* loaded from: classes.dex */
    public static final class C10722g extends AbstractC6757d {

        /* renamed from: w */
        Object f27700w;

        /* renamed from: x */
        Object f27701x;

        /* renamed from: y */
        /* synthetic */ Object f27702y;

        /* renamed from: z */
        int f27703z;

        C10722g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27702y = obj;
            this.f27703z |= Integer.MIN_VALUE;
            return DragGestureDetector.m7278h(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {831}, m20194m = "horizontalDrag-jO51t88")
    /* renamed from: u.j$h */
    /* loaded from: classes.dex */
    public static final class C10723h extends AbstractC6757d {

        /* renamed from: A */
        int f27704A;

        /* renamed from: w */
        Object f27705w;

        /* renamed from: x */
        Object f27706x;

        /* renamed from: y */
        Object f27707y;

        /* renamed from: z */
        /* synthetic */ Object f27708z;

        C10723h(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27708z = obj;
            this.f27704A |= Integer.MIN_VALUE;
            return DragGestureDetector.m7277i(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m20196f = "DragGestureDetector.kt", m20195l = {831}, m20194m = "verticalDrag-jO51t88")
    /* renamed from: u.j$i */
    /* loaded from: classes.dex */
    public static final class C10724i extends AbstractC6757d {

        /* renamed from: A */
        int f27709A;

        /* renamed from: w */
        Object f27710w;

        /* renamed from: x */
        Object f27711x;

        /* renamed from: y */
        Object f27712y;

        /* renamed from: z */
        /* synthetic */ Object f27713z;

        C10724i(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27713z = obj;
            this.f27709A |= Integer.MIN_VALUE;
            return DragGestureDetector.m7274l(null, 0L, null, this);
        }
    }

    static {
        float m875g = C13605g.m875g((float) 0.125d);
        f27648a = m875g;
        float m875g2 = C13605g.m875g(18);
        f27649b = m875g2;
        f27650c = m875g / m875g2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m7285a(InterfaceC5276c0 interfaceC5276c0, C5318u c5318u, InterfaceC1886d interfaceC1886d) {
        return m7281e(interfaceC5276c0, c5318u, interfaceC1886d);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m7284b(C5306m c5306m, long j) {
        return m7276j(c5306m, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        if (p093f1.C5307n.m24690n(r10) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7283c(p093f1.InterfaceC5274c r17, long r18, bd.InterfaceC1886d r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7283c(f1.c, long, bd.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
        if (p093f1.C5307n.m24693k(r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:56:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0161 -> B:53:0x0164). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0187 -> B:56:0x016c). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7282d(p093f1.InterfaceC5274c r20, long r21, int r23, id.InterfaceC6112p r24, bd.InterfaceC1886d r25) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7282d(f1.c, long, int, id.p, bd.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.lang.Object, f1.u] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [f1.u] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m7281e(p093f1.InterfaceC5276c0 r8, p093f1.C5318u r9, bd.InterfaceC1886d r10) {
        /*
            boolean r0 = r10 instanceof p372u.DragGestureDetector.C10714c
            if (r0 == 0) goto L13
            r0 = r10
            u.j$c r0 = (p372u.DragGestureDetector.C10714c) r0
            int r1 = r0.f27666z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27666z = r1
            goto L18
        L13:
            u.j$c r0 = new u.j$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27665y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27666z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f27664x
            jd.y r8 = (p181jd.C6449y) r8
            java.lang.Object r9 = r0.f27663w
            f1.u r9 = (p093f1.C5318u) r9
            p468yc.C13186n.m1453b(r10)     // Catch: kotlinx.coroutines.Timeout -> L64
            goto L6d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            p468yc.C13186n.m1453b(r10)
            jd.y r10 = new jd.y
            r10.<init>()
            jd.y r2 = new jd.y
            r2.<init>()
            r2.f17533w = r9
            androidx.compose.ui.platform.p1 r5 = r8.getViewConfiguration()
            long r5 = r5.m39642c()
            u.j$d r7 = new u.j$d     // Catch: kotlinx.coroutines.Timeout -> L63
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.Timeout -> L63
            r0.f27663w = r9     // Catch: kotlinx.coroutines.Timeout -> L63
            r0.f27664x = r10     // Catch: kotlinx.coroutines.Timeout -> L63
            r0.f27666z = r4     // Catch: kotlinx.coroutines.Timeout -> L63
            java.lang.Object r8 = td.C10581u2.m7638c(r5, r7, r0)     // Catch: kotlinx.coroutines.Timeout -> L63
            if (r8 != r1) goto L6d
            return r1
        L63:
            r8 = r10
        L64:
            T r8 = r8.f17533w
            f1.u r8 = (p093f1.C5318u) r8
            if (r8 != 0) goto L6c
            r3 = r9
            goto L6d
        L6c:
            r3 = r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7281e(f1.c0, f1.u, bd.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
        if (p093f1.C5307n.m24693k(r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:56:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0161 -> B:53:0x0164). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0187 -> B:56:0x016c). Please submit an issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7280f(p093f1.InterfaceC5274c r20, long r21, int r23, id.InterfaceC6112p r24, bd.InterfaceC1886d r25) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7280f(f1.c, long, int, id.p, bd.d):java.lang.Object");
    }

    /* renamed from: g */
    public static final Object m7279g(InterfaceC5276c0 interfaceC5276c0, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7214d = ForEachGesture.m7214d(interfaceC5276c0, new C10718f(interfaceC6108l, interfaceC6097a2, interfaceC6097a, interfaceC6112p, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7214d == m34636d ? m7214d : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7278h(p093f1.InterfaceC5274c r4, long r5, id.InterfaceC6108l r7, bd.InterfaceC1886d r8) {
        /*
            boolean r0 = r8 instanceof p372u.DragGestureDetector.C10722g
            if (r0 == 0) goto L13
            r0 = r8
            u.j$g r0 = (p372u.DragGestureDetector.C10722g) r0
            int r1 = r0.f27703z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27703z = r1
            goto L18
        L13:
            u.j$g r0 = new u.j$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27702y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27703z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f27701x
            id.l r4 = (id.InterfaceC6108l) r4
            java.lang.Object r5 = r0.f27700w
            f1.c r5 = (p093f1.InterfaceC5274c) r5
            p468yc.C13186n.m1453b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p468yc.C13186n.m1453b(r8)
        L3e:
            r0.f27700w = r4
            r0.f27701x = r7
            r0.f27703z = r3
            java.lang.Object r8 = m7283c(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            f1.u r8 = (p093f1.C5318u) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
            return r4
        L55:
            boolean r5 = p093f1.C5307n.m24700d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r4
        L60:
            r7.mo9587d(r8)
            long r5 = r8.m24652g()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7278h(f1.c, long, id.l, bd.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if ((!(p373u0.C10774f.m7145k(p093f1.C5307n.m24692l(r11)) == 0.0f)) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007a). Please submit an issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7277i(p093f1.InterfaceC5274c r18, long r19, id.InterfaceC6108l r21, bd.InterfaceC1886d r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7277i(f1.c, long, id.l, bd.d):java.lang.Object");
    }

    /* renamed from: j */
    private static final boolean m7276j(C5306m c5306m, long j) {
        Object obj;
        List m24707b = c5306m.m24707b();
        int size = m24707b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            int i2 = i + 1;
            obj = m24707b.get(i);
            if (C5317t.m24662d(((C5318u) obj).m24652g(), j)) {
                break;
            }
            i = i2;
        }
        C5318u c5318u = (C5318u) obj;
        if (c5318u != null && c5318u.m24650i()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: k */
    public static final float m7275k(ViewConfiguration viewConfiguration, int i) {
        Intrinsics.isThisObjectNull(viewConfiguration, "$this$pointerSlop");
        return C5280e0.m24806g(i, C5280e0.f14552a.m24802b()) ? viewConfiguration.m39641d() * f27650c : viewConfiguration.m39641d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if ((!(p373u0.C10774f.m7144l(p093f1.C5307n.m24692l(r11)) == 0.0f)) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007a). Please submit an issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7274l(p093f1.InterfaceC5274c r18, long r19, id.InterfaceC6108l r21, bd.InterfaceC1886d r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.DragGestureDetector.m7274l(f1.c, long, id.l, bd.d):java.lang.Object");
    }
}
