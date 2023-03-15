package p093f1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.CompositionLocals;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: f1.q */
/* loaded from: classes.dex */
public final class PointerIcon {

    /* compiled from: InspectableValue.kt */
    /* renamed from: f1.q$a */
    /* loaded from: classes.dex */
    public static final class C5311a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5310p f14646w;

        /* renamed from: x */
        final /* synthetic */ boolean f14647x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5311a(InterfaceC5310p interfaceC5310p, boolean z) {
            super(1);
            this.f14646w = interfaceC5310p;
            this.f14647x = z;
        }

        /* renamed from: a */
        public final void m24671a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("pointerHoverIcon");
            c0816w0.m39492a().m39649b("icon", this.f14646w);
            c0816w0.m39492a().m39649b("overrideDescendants", Boolean.valueOf(this.f14647x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24671a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerIcon.kt */
    /* renamed from: f1.q$b */
    /* loaded from: classes.dex */
    public static final class C5312b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5310p f14648w;

        /* renamed from: x */
        final /* synthetic */ boolean f14649x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", m20196f = "PointerIcon.kt", m20195l = {70}, m20194m = "invokeSuspend")
        /* renamed from: f1.q$b$a */
        /* loaded from: classes.dex */
        public static final class C5313a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC5315r f14650A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC5310p f14651B;

            /* renamed from: x */
            int f14652x;

            /* renamed from: y */
            private /* synthetic */ Object f14653y;

            /* renamed from: z */
            final /* synthetic */ boolean f14654z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PointerIcon.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", m20196f = "PointerIcon.kt", m20195l = {76}, m20194m = "invokeSuspend")
            /* renamed from: f1.q$b$a$a */
            /* loaded from: classes.dex */
            public static final class C5314a extends AbstractC6763k implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ InterfaceC5315r f14655A;

                /* renamed from: B */
                final /* synthetic */ InterfaceC5310p f14656B;

                /* renamed from: x */
                int f14657x;

                /* renamed from: y */
                private /* synthetic */ Object f14658y;

                /* renamed from: z */
                final /* synthetic */ boolean f14659z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C5314a(boolean z, InterfaceC5315r interfaceC5315r, InterfaceC5310p interfaceC5310p, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f14659z = z;
                    this.f14655A = interfaceC5315r;
                    this.f14656B = interfaceC5310p;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    C5314a c5314a = new C5314a(this.f14659z, this.f14655A, this.f14656B, interfaceC1886d);
                    c5314a.f14658y = obj;
                    return c5314a;
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                    return ((C5314a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please submit an issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = cd.C2111b.m34640d()
                        int r1 = r7.f14657x
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r7.f14658y
                        f1.c r1 = (p093f1.InterfaceC5274c) r1
                        p468yc.C13186n.m1453b(r8)
                        r3 = r1
                        r1 = r0
                        r0 = r7
                        goto L40
                    L16:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1e:
                        p468yc.C13186n.m1453b(r8)
                        java.lang.Object r8 = r7.f14658y
                        f1.c r8 = (p093f1.InterfaceC5274c) r8
                        r1 = r8
                        r8 = r7
                    L27:
                        boolean r3 = r8.f14659z
                        if (r3 == 0) goto L2e
                        androidx.compose.ui.input.pointer.a r3 = androidx.compose.p018ui.input.pointer.EnumC0662a.Main
                        goto L30
                    L2e:
                        androidx.compose.ui.input.pointer.a r3 = androidx.compose.p018ui.input.pointer.EnumC0662a.Initial
                    L30:
                        r8.f14658y = r1
                        r8.f14657x = r2
                        java.lang.Object r3 = r1.mo24823b0(r3, r8)
                        if (r3 != r0) goto L3b
                        return r0
                    L3b:
                        r6 = r0
                        r0 = r8
                        r8 = r3
                        r3 = r1
                        r1 = r6
                    L40:
                        f1.m r8 = (p093f1.C5306m) r8
                        int r8 = r8.m24705d()
                        f1.o$a r4 = p093f1.C5308o.f14638a
                        int r5 = r4.m24680a()
                        boolean r5 = p093f1.C5308o.m24681i(r8, r5)
                        if (r5 == 0) goto L54
                        r8 = r2
                        goto L5c
                    L54:
                        int r4 = r4.m24678c()
                        boolean r8 = p093f1.C5308o.m24681i(r8, r4)
                    L5c:
                        if (r8 == 0) goto L65
                        f1.r r8 = r0.f14655A
                        f1.p r4 = r0.f14656B
                        r8.mo24667a(r4)
                    L65:
                        r8 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p093f1.PointerIcon.C5312b.C5313a.C5314a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5313a(boolean z, InterfaceC5315r interfaceC5315r, InterfaceC5310p interfaceC5310p, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14654z = z;
                this.f14650A = interfaceC5315r;
                this.f14651B = interfaceC5310p;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C5313a c5313a = new C5313a(this.f14654z, this.f14650A, this.f14651B, interfaceC1886d);
                c5313a.f14653y = obj;
                return c5313a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
                return ((C5313a) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14652x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C5314a c5314a = new C5314a(this.f14654z, this.f14650A, this.f14651B, null);
                    this.f14652x = 1;
                    if (((InterfaceC5276c0) this.f14653y).mo24820Z(c5314a, this) == m34636d) {
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
        C5312b(InterfaceC5310p interfaceC5310p, boolean z) {
            super(3);
            this.f14648w = interfaceC5310p;
            this.f14649x = z;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m24670a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m24670a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            InterfaceC9570f m24738c;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-270919819);
            InterfaceC5315r interfaceC5315r = (InterfaceC5315r) interfaceC5179i.mo25256n(CompositionLocals.m39704h());
            if (interfaceC5315r == null) {
                m24738c = InterfaceC9570f.f25164r;
            } else {
                m24738c = C5293i0.m24738c(interfaceC9570f, this.f14648w, Boolean.valueOf(this.f14649x), new C5313a(this.f14649x, interfaceC5315r, this.f14648w, null));
            }
            interfaceC5179i.mo25282C();
            return m24738c;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m24673a(InterfaceC9570f interfaceC9570f, InterfaceC5310p interfaceC5310p, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC5310p, "icon");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C5311a(interfaceC5310p, z) : C0812v0.m39497a(), new C5312b(interfaceC5310p, z));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9570f m24672b(InterfaceC9570f interfaceC9570f, InterfaceC5310p interfaceC5310p, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24673a(interfaceC9570f, interfaceC5310p, z);
    }
}
