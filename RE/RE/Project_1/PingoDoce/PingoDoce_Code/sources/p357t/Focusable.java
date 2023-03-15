package p357t;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.constraintlayout.widget.C0868i;
import bd.C1894h;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p037c1.C1985a;
import p037c1.InterfaceC1987b;
import p092f0.C5232o1;
import p092f0.C5240r;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p358t0.C10335k;
import p358t0.FocusChangedModifier;
import p358t0.FocusProperties;
import p358t0.InterfaceC10344p;
import p358t0.InterfaceC10352u;
import p392v.C10976d;
import p392v.FocusInteraction;
import p392v.InterfaceC10987m;
import p468yc.C13186n;
import p468yc.C13195u;
import p477z.C13484d;
import p477z.InterfaceC13480b;
import td.InterfaceC10524i0;

/* renamed from: t.h */
/* loaded from: classes.dex */
public final class Focusable {

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.h$a */
    /* loaded from: classes.dex */
    public static final class C10280a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ boolean f26797w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10987m f26798x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10280a(boolean z, InterfaceC10987m interfaceC10987m) {
            super(1);
            this.f26797w = z;
            this.f26798x = interfaceC10987m;
        }

        /* renamed from: a */
        public final void m8343a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("focusable");
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f26797w));
            c0816w0.m39492a().m39649b("interactionSource", this.f26798x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8343a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    /* renamed from: t.h$b */
    /* loaded from: classes.dex */
    public static final class C10281b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10987m f26799w;

        /* renamed from: x */
        final /* synthetic */ boolean f26800x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Focusable.kt */
        /* renamed from: t.h$b$a */
        /* loaded from: classes.dex */
        public static final class C10282a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26801w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10987m f26802x;

            /* compiled from: Effects.kt */
            /* renamed from: t.h$b$a$a */
            /* loaded from: classes.dex */
            public static final class C10283a implements InterfaceC5264x {

                /* renamed from: a */
                final /* synthetic */ InterfaceC5220m0 f26803a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC10987m f26804b;

                public C10283a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                    this.f26803a = interfaceC5220m0;
                    this.f26804b = interfaceC10987m;
                }

                /* renamed from: b */
                public void mo24852b() {
                    C10976d c10976d = (C10976d) this.f26803a.getValue();
                    if (c10976d == null) {
                        return;
                    }
                    FocusInteraction focusInteraction = new FocusInteraction(c10976d);
                    InterfaceC10987m interfaceC10987m = this.f26804b;
                    if (interfaceC10987m != null) {
                        interfaceC10987m.mo6671b(focusInteraction);
                    }
                    this.f26803a.setValue(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10282a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                super(1);
                this.f26801w = interfaceC5220m0;
                this.f26802x = interfaceC10987m;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                return new C10283a(this.f26801w, this.f26802x);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Focusable.kt */
        /* renamed from: t.h$b$b */
        /* loaded from: classes.dex */
        public static final class C10284b extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ boolean f26805w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10524i0 f26806x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC5220m0 f26807y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC10987m f26808z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Focusable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", m20196f = "Focusable.kt", m20195l = {81}, m20194m = "invokeSuspend")
            /* renamed from: t.h$b$b$a */
            /* loaded from: classes.dex */
            public static final class C10285a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ InterfaceC10987m f26809A;

                /* renamed from: x */
                Object f26810x;

                /* renamed from: y */
                int f26811y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC5220m0 f26812z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10285a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f26812z = interfaceC5220m0;
                    this.f26809A = interfaceC10987m;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C10285a(this.f26812z, this.f26809A, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C10285a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    InterfaceC5220m0 interfaceC5220m0;
                    InterfaceC5220m0 interfaceC5220m02;
                    m34636d = C2116d.m34636d();
                    int i = this.f26811y;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C10976d c10976d = (C10976d) this.f26812z.getValue();
                        if (c10976d != null) {
                            InterfaceC10987m interfaceC10987m = this.f26809A;
                            interfaceC5220m0 = this.f26812z;
                            FocusInteraction focusInteraction = new FocusInteraction(c10976d);
                            if (interfaceC10987m != null) {
                                this.f26810x = interfaceC5220m0;
                                this.f26811y = 1;
                                if (interfaceC10987m.mo6672a(focusInteraction, this) == m34636d) {
                                    return m34636d;
                                }
                                interfaceC5220m02 = interfaceC5220m0;
                            }
                            interfaceC5220m0.setValue(null);
                        }
                        return C13195u.f34156a;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        interfaceC5220m02 = (InterfaceC5220m0) this.f26810x;
                        C13186n.m1453b(obj);
                    }
                    interfaceC5220m0 = interfaceC5220m02;
                    interfaceC5220m0.setValue(null);
                    return C13195u.f34156a;
                }
            }

            /* compiled from: Effects.kt */
            /* renamed from: t.h$b$b$b */
            /* loaded from: classes.dex */
            public static final class C10286b implements InterfaceC5264x {
                /* renamed from: b */
                public void mo24852b() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10284b(boolean z, InterfaceC10524i0 interfaceC10524i0, InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                super(1);
                this.f26805w = z;
                this.f26806x = interfaceC10524i0;
                this.f26807y = interfaceC5220m0;
                this.f26808z = interfaceC10987m;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                if (!this.f26805w) {
                    C6772d.m20158d(this.f26806x, null, null, new C10285a(this.f26807y, this.f26808z, null), 3, null);
                }
                return new C10286b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Focusable.kt */
        /* renamed from: t.h$b$c */
        /* loaded from: classes.dex */
        public static final class C10287c extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26813w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10287c(InterfaceC5220m0 interfaceC5220m0) {
                super(1);
                this.f26813w = interfaceC5220m0;
            }

            /* renamed from: a */
            public final void m8332a(InterfaceC7621v interfaceC7621v) {
                Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
                C7617t.m17921q(interfaceC7621v, C10281b.m8342a(this.f26813w));
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m8332a((InterfaceC7621v) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Focusable.kt */
        /* renamed from: t.h$b$d */
        /* loaded from: classes.dex */
        public static final class C10288d extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ InterfaceC13480b f26814A;

            /* renamed from: w */
            final /* synthetic */ InterfaceC10524i0 f26815w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC5220m0 f26816x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC5220m0 f26817y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC10987m f26818z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Focusable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", m20196f = "Focusable.kt", m20195l = {C0868i.f2748C0, 106, C0868i.f2773H0}, m20194m = "invokeSuspend")
            /* renamed from: t.h$b$d$a */
            /* loaded from: classes.dex */
            public static final class C10289a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ InterfaceC10987m f26819A;

                /* renamed from: B */
                final /* synthetic */ InterfaceC13480b f26820B;

                /* renamed from: x */
                Object f26821x;

                /* renamed from: y */
                int f26822y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC5220m0 f26823z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10289a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m, InterfaceC13480b interfaceC13480b, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f26823z = interfaceC5220m0;
                    this.f26819A = interfaceC10987m;
                    this.f26820B = interfaceC13480b;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C10289a(this.f26823z, this.f26819A, this.f26820B, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C10289a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = cd.C2111b.m34640d()
                        int r1 = r8.f26822y
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        p468yc.C13186n.m1453b(r9)
                        goto L80
                    L17:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1f:
                        java.lang.Object r1 = r8.f26821x
                        v.d r1 = (p392v.C10976d) r1
                        p468yc.C13186n.m1453b(r9)
                        goto L6e
                    L27:
                        java.lang.Object r1 = r8.f26821x
                        f0.m0 r1 = (p092f0.InterfaceC5220m0) r1
                        p468yc.C13186n.m1453b(r9)
                        goto L55
                    L2f:
                        p468yc.C13186n.m1453b(r9)
                        f0.m0 r9 = r8.f26823z
                        java.lang.Object r9 = r9.getValue()
                        v.d r9 = (p392v.C10976d) r9
                        if (r9 != 0) goto L3d
                        goto L59
                    L3d:
                        v.m r1 = r8.f26819A
                        f0.m0 r6 = r8.f26823z
                        v.e r7 = new v.e
                        r7.<init>(r9)
                        if (r1 != 0) goto L49
                        goto L56
                    L49:
                        r8.f26821x = r6
                        r8.f26822y = r4
                        java.lang.Object r9 = r1.mo6672a(r7, r8)
                        if (r9 != r0) goto L54
                        return r0
                    L54:
                        r1 = r6
                    L55:
                        r6 = r1
                    L56:
                        r6.setValue(r5)
                    L59:
                        v.d r1 = new v.d
                        r1.<init>()
                        v.m r9 = r8.f26819A
                        if (r9 != 0) goto L63
                        goto L6e
                    L63:
                        r8.f26821x = r1
                        r8.f26822y = r3
                        java.lang.Object r9 = r9.mo6672a(r1, r8)
                        if (r9 != r0) goto L6e
                        return r0
                    L6e:
                        f0.m0 r9 = r8.f26823z
                        r9.setValue(r1)
                        z.b r9 = r8.f26820B
                        r8.f26821x = r5
                        r8.f26822y = r2
                        java.lang.Object r9 = p477z.InterfaceC13480b.C13481a.m1288a(r9, r5, r8, r4, r5)
                        if (r9 != r0) goto L80
                        return r0
                    L80:
                        yc.u r9 = p468yc.C13195u.f34156a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p357t.Focusable.C10281b.C10288d.C10289a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Focusable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", m20196f = "Focusable.kt", m20195l = {114}, m20194m = "invokeSuspend")
            /* renamed from: t.h$b$d$b */
            /* loaded from: classes.dex */
            public static final class C10290b extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ InterfaceC10987m f26824A;

                /* renamed from: x */
                Object f26825x;

                /* renamed from: y */
                int f26826y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC5220m0 f26827z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10290b(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f26827z = interfaceC5220m0;
                    this.f26824A = interfaceC10987m;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C10290b(this.f26827z, this.f26824A, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C10290b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    InterfaceC5220m0 interfaceC5220m0;
                    InterfaceC5220m0 interfaceC5220m02;
                    m34636d = C2116d.m34636d();
                    int i = this.f26826y;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C10976d c10976d = (C10976d) this.f26827z.getValue();
                        if (c10976d != null) {
                            InterfaceC10987m interfaceC10987m = this.f26824A;
                            interfaceC5220m0 = this.f26827z;
                            FocusInteraction focusInteraction = new FocusInteraction(c10976d);
                            if (interfaceC10987m != null) {
                                this.f26825x = interfaceC5220m0;
                                this.f26826y = 1;
                                if (interfaceC10987m.mo6672a(focusInteraction, this) == m34636d) {
                                    return m34636d;
                                }
                                interfaceC5220m02 = interfaceC5220m0;
                            }
                            interfaceC5220m0.setValue(null);
                        }
                        return C13195u.f34156a;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        interfaceC5220m02 = (InterfaceC5220m0) this.f26825x;
                        C13186n.m1453b(obj);
                    }
                    interfaceC5220m0 = interfaceC5220m02;
                    interfaceC5220m0.setValue(null);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10288d(InterfaceC10524i0 interfaceC10524i0, InterfaceC5220m0 interfaceC5220m0, InterfaceC5220m0 interfaceC5220m02, InterfaceC10987m interfaceC10987m, InterfaceC13480b interfaceC13480b) {
                super(1);
                this.f26815w = interfaceC10524i0;
                this.f26816x = interfaceC5220m0;
                this.f26817y = interfaceC5220m02;
                this.f26818z = interfaceC10987m;
                this.f26814A = interfaceC13480b;
            }

            /* renamed from: a */
            public final void m8331a(InterfaceC10352u interfaceC10352u) {
                Intrinsics.isThisObjectNull(interfaceC10352u, "it");
                C10281b.m8341b(this.f26816x, interfaceC10352u.isFocused());
                if (C10281b.m8342a(this.f26816x)) {
                    C6772d.m20158d(this.f26815w, null, null, new C10289a(this.f26817y, this.f26818z, this.f26814A, null), 3, null);
                } else {
                    C6772d.m20158d(this.f26815w, null, null, new C10290b(this.f26817y, this.f26818z, null), 3, null);
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m8331a((InterfaceC10352u) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10281b(InterfaceC10987m interfaceC10987m, boolean z) {
            super(3);
            this.f26799w = interfaceC10987m;
            this.f26800x = z;
        }

        /* renamed from: a */
        public static final /* synthetic */ boolean m8342a(InterfaceC5220m0 interfaceC5220m0) {
            return m8339d(interfaceC5220m0);
        }

        /* renamed from: b */
        public static final /* synthetic */ void m8341b(InterfaceC5220m0 interfaceC5220m0, boolean z) {
            m8338e(interfaceC5220m0, z);
        }

        /* renamed from: d */
        private static final boolean m8339d(InterfaceC5220m0 interfaceC5220m0) {
            return ((Boolean) interfaceC5220m0.getValue()).booleanValue();
        }

        /* renamed from: e */
        private static final void m8338e(InterfaceC5220m0 interfaceC5220m0, boolean z) {
            interfaceC5220m0.setValue(Boolean.valueOf(z));
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8340c((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: c */
        public final InterfaceC9570f m8340c(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            InterfaceC9570f interfaceC9570f2;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(1407538527);
            interfaceC5179i.mo25263g(-723524056);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            if (mo25262h == c5180a.m25243a()) {
                C5240r c5240r = new C5240r(Effects.m25533i(C1894h.f5621w, interfaceC5179i));
                interfaceC5179i.mo25247w(c5240r);
                mo25262h = c5240r;
            }
            interfaceC5179i.mo25282C();
            InterfaceC10524i0 m24924c = ((C5240r) mo25262h).m24924c();
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h2 = interfaceC5179i.mo25262h();
            if (mo25262h2 == c5180a.m25243a()) {
                mo25262h2 = C5232o1.m24962d(null, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h2);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h2;
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h3 = interfaceC5179i.mo25262h();
            if (mo25262h3 == c5180a.m25243a()) {
                mo25262h3 = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h3);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m02 = (InterfaceC5220m0) mo25262h3;
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h4 = interfaceC5179i.mo25262h();
            if (mo25262h4 == c5180a.m25243a()) {
                mo25262h4 = C13484d.m1285a();
                interfaceC5179i.mo25247w(mo25262h4);
            }
            interfaceC5179i.mo25282C();
            InterfaceC13480b interfaceC13480b = (InterfaceC13480b) mo25262h4;
            InterfaceC10987m interfaceC10987m = this.f26799w;
            Effects.m25541a(interfaceC10987m, new C10282a(interfaceC5220m0, interfaceC10987m), interfaceC5179i, 0);
            Effects.m25541a(Boolean.valueOf(this.f26800x), new C10284b(this.f26800x, m24924c, interfaceC5220m0, this.f26799w), interfaceC5179i, 0);
            if (this.f26800x) {
                interfaceC9570f2 = C10335k.m8223a(FocusChangedModifier.m8283a(C13484d.m1284b(C7600o.m18015b(InterfaceC9570f.f25164r, false, new C10287c(interfaceC5220m02), 1, null), interfaceC13480b), new C10288d(m24924c, interfaceC5220m02, interfaceC5220m0, this.f26799w, interfaceC13480b)));
            } else {
                interfaceC9570f2 = InterfaceC9570f.f25164r;
            }
            interfaceC5179i.mo25282C();
            return interfaceC9570f2;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.h$c */
    /* loaded from: classes.dex */
    public static final class C10291c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ boolean f26828w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10987m f26829x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10291c(boolean z, InterfaceC10987m interfaceC10987m) {
            super(1);
            this.f26828w = z;
            this.f26829x = interfaceC10987m;
        }

        /* renamed from: a */
        public final void m8328a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("focusableInNonTouchMode");
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f26828w));
            c0816w0.m39492a().m39649b("interactionSource", this.f26829x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8328a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    /* renamed from: t.h$d */
    /* loaded from: classes.dex */
    public static final class C10292d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ boolean f26830w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10987m f26831x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Focusable.kt */
        /* renamed from: t.h$d$a */
        /* loaded from: classes.dex */
        public static final class C10293a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC1987b f26832w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10293a(InterfaceC1987b interfaceC1987b) {
                super(1);
                this.f26832w = interfaceC1987b;
            }

            /* renamed from: a */
            public final void m8326a(InterfaceC10344p interfaceC10344p) {
                Intrinsics.isThisObjectNull(interfaceC10344p, "$this$focusProperties");
                interfaceC10344p.mo8201b(!C1985a.m34979f(this.f26832w.mo34973a(), C1985a.f5807b.m34974b()));
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m8326a((InterfaceC10344p) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10292d(boolean z, InterfaceC10987m interfaceC10987m) {
            super(3);
            this.f26830w = z;
            this.f26831x = interfaceC10987m;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8327a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8327a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-1672139192);
            InterfaceC9570f m8345a = Focusable.m8345a(FocusProperties.m8200a(InterfaceC9570f.f25164r, new C10293a((InterfaceC1987b) interfaceC5179i.mo25256n(CompositionLocals.m39706f()))), this.f26830w, this.f26831x);
            interfaceC5179i.mo25282C();
            return m8345a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8345a(InterfaceC9570f interfaceC9570f, boolean z, InterfaceC10987m interfaceC10987m) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10280a(z, interfaceC10987m) : C0812v0.m39497a(), new C10281b(interfaceC10987m, z));
    }

    /* renamed from: b */
    public static final InterfaceC9570f m8344b(InterfaceC9570f interfaceC9570f, boolean z, InterfaceC10987m interfaceC10987m) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10291c(z, interfaceC10987m) : C0812v0.m39497a(), new C10292d(z, interfaceC10987m));
    }
}
