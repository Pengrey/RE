package p036c0;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p093f1.C5307n;
import p093f1.C5318u;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p372u.ForEachGesture;
import p468yc.C13186n;
import p468yc.C13195u;

/* compiled from: TextSelectionMouseDetector.kt */
/* renamed from: c0.l */
/* loaded from: classes.dex */
public final class C1979l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", m20196f = "TextSelectionMouseDetector.kt", m20195l = {128}, m20194m = "awaitMouseEventDown")
    /* renamed from: c0.l$a */
    /* loaded from: classes.dex */
    public static final class C1980a extends AbstractC6757d {

        /* renamed from: w */
        Object f5794w;

        /* renamed from: x */
        /* synthetic */ Object f5795x;

        /* renamed from: y */
        int f5796y;

        C1980a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5795x = obj;
            this.f5796y |= Integer.MIN_VALUE;
            return C1979l.m34991a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", m20196f = "TextSelectionMouseDetector.kt", m20195l = {88}, m20194m = "invokeSuspend")
    /* renamed from: c0.l$b */
    /* loaded from: classes.dex */
    public static final class C1981b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f5797x;

        /* renamed from: y */
        private /* synthetic */ Object f5798y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC1961b f5799z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextSelectionMouseDetector.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", m20196f = "TextSelectionMouseDetector.kt", m20195l = {91, C0868i.f2993y0, 113}, m20194m = "invokeSuspend")
        /* renamed from: c0.l$b$a */
        /* loaded from: classes.dex */
        public static final class C1982a extends AbstractC6763k implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC1961b f5800A;

            /* renamed from: x */
            Object f5801x;

            /* renamed from: y */
            int f5802y;

            /* renamed from: z */
            private /* synthetic */ Object f5803z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextSelectionMouseDetector.kt */
            /* renamed from: c0.l$b$a$a */
            /* loaded from: classes.dex */
            public static final class C1983a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ InterfaceC1961b f5804w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1983a(InterfaceC1961b interfaceC1961b) {
                    super(1);
                    this.f5804w = interfaceC1961b;
                }

                /* renamed from: a */
                public final void m34986a(C5318u c5318u) {
                    Intrinsics.isThisObjectNull(c5318u, "it");
                    if (this.f5804w.mo35020b(c5318u.m24651h())) {
                        C5307n.m24699e(c5318u);
                    }
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m34986a((C5318u) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextSelectionMouseDetector.kt */
            /* renamed from: c0.l$b$a$b */
            /* loaded from: classes.dex */
            public static final class C1984b extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ InterfaceC1961b f5805w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC1965f f5806x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1984b(InterfaceC1961b interfaceC1961b, InterfaceC1965f interfaceC1965f) {
                    super(1);
                    this.f5805w = interfaceC1961b;
                    this.f5806x = interfaceC1965f;
                }

                /* renamed from: a */
                public final void m34985a(C5318u c5318u) {
                    Intrinsics.isThisObjectNull(c5318u, "it");
                    if (this.f5805w.mo35019c(c5318u.m24651h(), this.f5806x)) {
                        C5307n.m24699e(c5318u);
                    }
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m34985a((C5318u) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1982a(InterfaceC1961b interfaceC1961b, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f5800A = interfaceC1961b;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C1982a c1982a = new C1982a(this.f5800A, interfaceC1886d);
                c1982a.f5803z = obj;
                return c1982a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                return ((C1982a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r12.f5802y
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1a:
                    java.lang.Object r1 = r12.f5801x
                    c0.a r1 = (p036c0.TextSelectionMouseDetector) r1
                    java.lang.Object r5 = r12.f5803z
                    f1.c r5 = (p093f1.InterfaceC5274c) r5
                    p468yc.C13186n.m1453b(r13)
                    r13 = r5
                    goto L44
                L27:
                    java.lang.Object r1 = r12.f5801x
                    c0.a r1 = (p036c0.TextSelectionMouseDetector) r1
                    java.lang.Object r5 = r12.f5803z
                    f1.c r5 = (p093f1.InterfaceC5274c) r5
                    p468yc.C13186n.m1453b(r13)
                    r6 = r12
                    goto L56
                L34:
                    p468yc.C13186n.m1453b(r13)
                    java.lang.Object r13 = r12.f5803z
                    f1.c r13 = (p093f1.InterfaceC5274c) r13
                    c0.a r1 = new c0.a
                    androidx.compose.ui.platform.p1 r5 = r13.getViewConfiguration()
                    r1.<init>(r5)
                L44:
                    r5 = r12
                L45:
                    r5.f5803z = r13
                    r5.f5801x = r1
                    r5.f5802y = r4
                    java.lang.Object r6 = p036c0.C1979l.m34991a(r13, r5)
                    if (r6 != r0) goto L52
                    return r0
                L52:
                    r11 = r5
                    r5 = r13
                    r13 = r6
                    r6 = r11
                L56:
                    f1.m r13 = (p093f1.C5306m) r13
                    r1.m35022d(r13)
                    java.util.List r7 = r13.m24707b()
                    r8 = 0
                    java.lang.Object r7 = r7.get(r8)
                    f1.u r7 = (p093f1.C5318u) r7
                    boolean r13 = p036c0.C1975i.m34997a(r13)
                    if (r13 == 0) goto L93
                    c0.b r13 = r6.f5800A
                    long r8 = r7.m24651h()
                    boolean r13 = r13.mo35018d(r8)
                    if (r13 == 0) goto Ld6
                    p093f1.C5307n.m24698f(r7)
                    long r7 = r7.m24652g()
                    c0.l$b$a$a r13 = new c0.l$b$a$a
                    c0.b r9 = r6.f5800A
                    r13.<init>(r9)
                    r6.f5803z = r5
                    r6.f5801x = r1
                    r6.f5802y = r3
                    java.lang.Object r13 = p372u.DragGestureDetector.m7278h(r5, r7, r13, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                L93:
                    int r13 = r1.m35025a()
                    if (r13 == r4) goto La9
                    if (r13 == r3) goto La2
                    c0.f$a r13 = p036c0.InterfaceC1965f.f5780a
                    c0.f r13 = r13.m35012c()
                    goto Laf
                La2:
                    c0.f$a r13 = p036c0.InterfaceC1965f.f5780a
                    c0.f r13 = r13.m35011d()
                    goto Laf
                La9:
                    c0.f$a r13 = p036c0.InterfaceC1965f.f5780a
                    c0.f r13 = r13.m35013b()
                Laf:
                    c0.b r8 = r6.f5800A
                    long r9 = r7.m24651h()
                    boolean r8 = r8.mo35021a(r9, r13)
                    if (r8 == 0) goto Ld6
                    p093f1.C5307n.m24698f(r7)
                    long r7 = r7.m24652g()
                    c0.l$b$a$b r9 = new c0.l$b$a$b
                    c0.b r10 = r6.f5800A
                    r9.<init>(r10, r13)
                    r6.f5803z = r5
                    r6.f5801x = r1
                    r6.f5802y = r2
                    java.lang.Object r13 = p372u.DragGestureDetector.m7278h(r5, r7, r9, r6)
                    if (r13 != r0) goto Ld6
                    return r0
                Ld6:
                    r13 = r5
                    r5 = r6
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: p036c0.C1979l.C1981b.C1982a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1981b(InterfaceC1961b interfaceC1961b, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f5799z = interfaceC1961b;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C1981b c1981b = new C1981b(this.f5799z, interfaceC1886d);
            c1981b.f5798y = obj;
            return c1981b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C1981b) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f5797x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C1982a c1982a = new C1982a(this.f5799z, null);
                this.f5797x = 1;
                if (((InterfaceC5276c0) this.f5798y).mo24820Z(c1982a, this) == m34636d) {
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

    /* renamed from: a */
    public static final /* synthetic */ Object m34991a(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
        return m34990b(interfaceC5274c, interfaceC1886d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m34990b(p093f1.InterfaceC5274c r10, bd.InterfaceC1886d r11) {
        /*
            boolean r0 = r11 instanceof p036c0.C1979l.C1980a
            if (r0 == 0) goto L13
            r0 = r11
            c0.l$a r0 = (p036c0.C1979l.C1980a) r0
            int r1 = r0.f5796y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5796y = r1
            goto L18
        L13:
            c0.l$a r0 = new c0.l$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5795x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f5796y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f5794w
            f1.c r10 = (p093f1.InterfaceC5274c) r10
            p468yc.C13186n.m1453b(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            p468yc.C13186n.m1453b(r11)
        L38:
            androidx.compose.ui.input.pointer.a r11 = androidx.compose.p018ui.input.pointer.EnumC0662a.Main
            r0.f5794w = r10
            r0.f5796y = r3
            java.lang.Object r11 = r10.mo24823b0(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            f1.m r11 = (p093f1.C5306m) r11
            java.util.List r2 = r11.m24707b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L51:
            if (r6 >= r4) goto L79
            int r7 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            f1.u r6 = (p093f1.C5318u) r6
            int r8 = r6.m24646m()
            f1.e0$a r9 = p093f1.C5280e0.f14552a
            int r9 = r9.m24802b()
            boolean r8 = p093f1.C5280e0.m24806g(r8, r9)
            if (r8 == 0) goto L73
            boolean r6 = p093f1.C5307n.m24703a(r6)
            if (r6 == 0) goto L73
            r6 = r3
            goto L74
        L73:
            r6 = r5
        L74:
            if (r6 != 0) goto L77
            goto L7a
        L77:
            r6 = r7
            goto L51
        L79:
            r5 = r3
        L7a:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c0.C1979l.m34990b(f1.c, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public static final Object m34989c(InterfaceC5276c0 interfaceC5276c0, InterfaceC1961b interfaceC1961b, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7214d = ForEachGesture.m7214d(interfaceC5276c0, new C1981b(interfaceC1961b, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7214d == m34636d ? m7214d : C13195u.f34156a;
    }
}
