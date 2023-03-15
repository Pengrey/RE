package p357t;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
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
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p093f1.C5293i0;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p392v.C10980g;
import p392v.HoverInteraction;
import p392v.InterfaceC10987m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: t.i */
/* loaded from: classes.dex */
public final class Hoverable {

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.i$a */
    /* loaded from: classes.dex */
    public static final class C10294a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10987m f26833w;

        /* renamed from: x */
        final /* synthetic */ boolean f26834x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10294a(InterfaceC10987m interfaceC10987m, boolean z) {
            super(1);
            this.f26833w = interfaceC10987m;
            this.f26834x = z;
        }

        /* renamed from: a */
        public final void m8324a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("hoverable");
            c0816w0.m39492a().m39649b("interactionSource", this.f26833w);
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f26834x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8324a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hoverable.kt */
    /* renamed from: t.i$b */
    /* loaded from: classes.dex */
    public static final class C10295b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10987m f26835w;

        /* renamed from: x */
        final /* synthetic */ boolean f26836x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Hoverable.kt */
        /* renamed from: t.i$b$a */
        /* loaded from: classes.dex */
        public static final class C10296a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26837w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10987m f26838x;

            /* compiled from: Effects.kt */
            /* renamed from: t.i$b$a$a */
            /* loaded from: classes.dex */
            public static final class C10297a implements InterfaceC5264x {

                /* renamed from: a */
                final /* synthetic */ InterfaceC5220m0 f26839a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC10987m f26840b;

                public C10297a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                    this.f26839a = interfaceC5220m0;
                    this.f26840b = interfaceC10987m;
                }

                /* renamed from: b */
                public void mo24852b() {
                    C10295b.m8321c(this.f26839a, this.f26840b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10296a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                super(1);
                this.f26837w = interfaceC5220m0;
                this.f26838x = interfaceC10987m;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                return new C10297a(this.f26837w, this.f26838x);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Hoverable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", m20196f = "Hoverable.kt", m20195l = {85}, m20194m = "invokeSuspend")
        /* renamed from: t.i$b$b */
        /* loaded from: classes.dex */
        public static final class C10298b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC10987m f26841A;

            /* renamed from: x */
            int f26842x;

            /* renamed from: y */
            final /* synthetic */ boolean f26843y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC5220m0 f26844z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10298b(boolean z, InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f26843y = z;
                this.f26844z = interfaceC5220m0;
                this.f26841A = interfaceC10987m;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10298b(this.f26843y, this.f26844z, this.f26841A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10298b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f26842x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    if (!this.f26843y) {
                        InterfaceC5220m0 interfaceC5220m0 = this.f26844z;
                        InterfaceC10987m interfaceC10987m = this.f26841A;
                        this.f26842x = 1;
                        if (C10295b.m8322b(interfaceC5220m0, interfaceC10987m, this) == m34636d) {
                            return m34636d;
                        }
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
        /* compiled from: Hoverable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", m20196f = "Hoverable.kt", m20195l = {C0868i.f2738A0, C0868i.f2748C0, C0868i.f2753D0}, m20194m = "invokeSuspend")
        /* renamed from: t.i$b$c */
        /* loaded from: classes.dex */
        public static final class C10299c extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC10987m f26845A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC5220m0 f26846B;

            /* renamed from: x */
            Object f26847x;

            /* renamed from: y */
            int f26848y;

            /* renamed from: z */
            private /* synthetic */ Object f26849z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Hoverable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$event$1", m20196f = "Hoverable.kt", m20195l = {C0868i.f2738A0}, m20194m = "invokeSuspend")
            /* renamed from: t.i$b$c$a */
            /* loaded from: classes.dex */
            public static final class C10300a extends AbstractC6763k implements InterfaceC6112p {

                /* renamed from: x */
                int f26850x;

                /* renamed from: y */
                private /* synthetic */ Object f26851y;

                C10300a(InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    C10300a c10300a = new C10300a(interfaceC1886d);
                    c10300a.f26851y = obj;
                    return c10300a;
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                    return ((C10300a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f26850x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        this.f26850x = 1;
                        obj = InterfaceC5274c.C5275a.m24821a((InterfaceC5274c) this.f26851y, null, this, 1, null);
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
            C10299c(InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f26845A = interfaceC10987m;
                this.f26846B = interfaceC5220m0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10299c c10299c = new C10299c(this.f26845A, this.f26846B, interfaceC1886d);
                c10299c.f26849z = obj;
                return c10299c;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
                return ((C10299c) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009b -> B:14:0x0040). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r10.f26848y
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1a:
                    java.lang.Object r1 = r10.f26847x
                    bd.g r1 = (bd.CoroutineContext) r1
                    java.lang.Object r5 = r10.f26849z
                    f1.c0 r5 = (p093f1.InterfaceC5276c0) r5
                    p468yc.C13186n.m1453b(r11)
                    r11 = r5
                    goto L3f
                L27:
                    java.lang.Object r1 = r10.f26847x
                    bd.g r1 = (bd.CoroutineContext) r1
                    java.lang.Object r5 = r10.f26849z
                    f1.c0 r5 = (p093f1.InterfaceC5276c0) r5
                    p468yc.C13186n.m1453b(r11)
                    r6 = r10
                    goto L5d
                L34:
                    p468yc.C13186n.m1453b(r11)
                    java.lang.Object r11 = r10.f26849z
                    f1.c0 r11 = (p093f1.InterfaceC5276c0) r11
                    bd.g r1 = r10.getContext()
                L3f:
                    r5 = r10
                L40:
                    boolean r6 = td.C10588w1.m7606m(r1)
                    if (r6 == 0) goto L9e
                    t.i$b$c$a r6 = new t.i$b$c$a
                    r7 = 0
                    r6.<init>(r7)
                    r5.f26849z = r11
                    r5.f26847x = r1
                    r5.f26848y = r4
                    java.lang.Object r6 = r11.mo24820Z(r6, r5)
                    if (r6 != r0) goto L59
                    return r0
                L59:
                    r9 = r5
                    r5 = r11
                    r11 = r6
                    r6 = r9
                L5d:
                    f1.m r11 = (p093f1.C5306m) r11
                    int r11 = r11.m24705d()
                    f1.o$a r7 = p093f1.C5308o.f14638a
                    int r8 = r7.m24680a()
                    boolean r8 = p093f1.C5308o.m24681i(r11, r8)
                    if (r8 == 0) goto L80
                    v.m r11 = r6.f26845A
                    f0.m0 r7 = r6.f26846B
                    r6.f26849z = r5
                    r6.f26847x = r1
                    r6.f26848y = r3
                    java.lang.Object r11 = p357t.Hoverable.C10295b.m8323a(r11, r7, r6)
                    if (r11 != r0) goto L9b
                    return r0
                L80:
                    int r7 = r7.m24679b()
                    boolean r11 = p093f1.C5308o.m24681i(r11, r7)
                    if (r11 == 0) goto L9b
                    f0.m0 r11 = r6.f26846B
                    v.m r7 = r6.f26845A
                    r6.f26849z = r5
                    r6.f26847x = r1
                    r6.f26848y = r2
                    java.lang.Object r11 = p357t.Hoverable.C10295b.m8322b(r11, r7, r6)
                    if (r11 != r0) goto L9b
                    return r0
                L9b:
                    r11 = r5
                    r5 = r6
                    goto L40
                L9e:
                    yc.u r11 = p468yc.C13195u.f34156a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p357t.Hoverable.C10295b.C10299c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Hoverable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.HoverableKt$hoverable$2", m20196f = "Hoverable.kt", m20195l = {59}, m20194m = "invoke$emitEnter")
        /* renamed from: t.i$b$d */
        /* loaded from: classes.dex */
        public static final class C10301d extends AbstractC6757d {

            /* renamed from: w */
            Object f26852w;

            /* renamed from: x */
            Object f26853x;

            /* renamed from: y */
            /* synthetic */ Object f26854y;

            /* renamed from: z */
            int f26855z;

            C10301d(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f26854y = obj;
                this.f26855z |= Integer.MIN_VALUE;
                return C10295b.m8323a(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Hoverable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.HoverableKt$hoverable$2", m20196f = "Hoverable.kt", m20195l = {67}, m20194m = "invoke$emitExit")
        /* renamed from: t.i$b$e */
        /* loaded from: classes.dex */
        public static final class C10302e extends AbstractC6757d {

            /* renamed from: w */
            Object f26856w;

            /* renamed from: x */
            /* synthetic */ Object f26857x;

            /* renamed from: y */
            int f26858y;

            C10302e(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f26857x = obj;
                this.f26858y |= Integer.MIN_VALUE;
                return C10295b.m8322b(null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10295b(InterfaceC10987m interfaceC10987m, boolean z) {
            super(3);
            this.f26835w = interfaceC10987m;
            this.f26836x = z;
        }

        /* renamed from: a */
        public static final /* synthetic */ Object m8323a(InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
            return m8319e(interfaceC10987m, interfaceC5220m0, interfaceC1886d);
        }

        /* renamed from: b */
        public static final /* synthetic */ Object m8322b(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m, InterfaceC1886d interfaceC1886d) {
            return m8318f(interfaceC5220m0, interfaceC10987m, interfaceC1886d);
        }

        /* renamed from: c */
        public static final /* synthetic */ void m8321c(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
            m8315i(interfaceC5220m0, interfaceC10987m);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final java.lang.Object m8319e(p392v.InterfaceC10987m r4, p092f0.InterfaceC5220m0 r5, bd.InterfaceC1886d r6) {
            /*
                boolean r0 = r6 instanceof p357t.Hoverable.C10295b.C10301d
                if (r0 == 0) goto L13
                r0 = r6
                t.i$b$d r0 = (p357t.Hoverable.C10295b.C10301d) r0
                int r1 = r0.f26855z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26855z = r1
                goto L18
            L13:
                t.i$b$d r0 = new t.i$b$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f26854y
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f26855z
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f26853x
                v.g r4 = (p392v.C10980g) r4
                java.lang.Object r5 = r0.f26852w
                f0.m0 r5 = (p092f0.InterfaceC5220m0) r5
                p468yc.C13186n.m1453b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                p468yc.C13186n.m1453b(r6)
                v.g r6 = m8317g(r5)
                if (r6 != 0) goto L58
                v.g r6 = new v.g
                r6.<init>()
                r0.f26852w = r5
                r0.f26853x = r6
                r0.f26855z = r3
                java.lang.Object r4 = r4.mo6672a(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                m8316h(r5, r4)
            L58:
                yc.u r4 = p468yc.C13195u.f34156a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p357t.Hoverable.C10295b.m8319e(v.m, f0.m0, bd.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final java.lang.Object m8318f(p092f0.InterfaceC5220m0 r4, p392v.InterfaceC10987m r5, bd.InterfaceC1886d r6) {
            /*
                boolean r0 = r6 instanceof p357t.Hoverable.C10295b.C10302e
                if (r0 == 0) goto L13
                r0 = r6
                t.i$b$e r0 = (p357t.Hoverable.C10295b.C10302e) r0
                int r1 = r0.f26858y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26858y = r1
                goto L18
            L13:
                t.i$b$e r0 = new t.i$b$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f26857x
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f26858y
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f26856w
                f0.m0 r4 = (p092f0.InterfaceC5220m0) r4
                p468yc.C13186n.m1453b(r6)
                goto L4f
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                p468yc.C13186n.m1453b(r6)
                v.g r6 = m8317g(r4)
                if (r6 != 0) goto L3f
                goto L53
            L3f:
                v.h r2 = new v.h
                r2.<init>(r6)
                r0.f26856w = r4
                r0.f26858y = r3
                java.lang.Object r5 = r5.mo6672a(r2, r0)
                if (r5 != r1) goto L4f
                return r1
            L4f:
                r5 = 0
                m8316h(r4, r5)
            L53:
                yc.u r4 = p468yc.C13195u.f34156a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p357t.Hoverable.C10295b.m8318f(f0.m0, v.m, bd.d):java.lang.Object");
        }

        /* renamed from: g */
        private static final C10980g m8317g(InterfaceC5220m0 interfaceC5220m0) {
            return (C10980g) interfaceC5220m0.getValue();
        }

        /* renamed from: h */
        private static final void m8316h(InterfaceC5220m0 interfaceC5220m0, C10980g c10980g) {
            interfaceC5220m0.setValue(c10980g);
        }

        /* renamed from: i */
        private static final void m8315i(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
            C10980g m8317g = m8317g(interfaceC5220m0);
            if (m8317g == null) {
                return;
            }
            interfaceC10987m.mo6671b(new HoverInteraction(m8317g));
            m8316h(interfaceC5220m0, null);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8320d((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: d */
        public final InterfaceC9570f m8320d(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            InterfaceC9570f interfaceC9570f2;
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-222579755);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = C5232o1.m24962d(null, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
            InterfaceC10987m interfaceC10987m = this.f26835w;
            Effects.m25541a(interfaceC10987m, new C10296a(interfaceC5220m0, interfaceC10987m), interfaceC5179i, 0);
            Effects.m25539c(Boolean.valueOf(this.f26836x), new C10298b(this.f26836x, interfaceC5220m0, this.f26835w, null), interfaceC5179i, 0);
            if (this.f26836x) {
                InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
                InterfaceC10987m interfaceC10987m2 = this.f26835w;
                interfaceC9570f2 = C5293i0.m24739b(c9571a, interfaceC10987m2, new C10299c(interfaceC10987m2, interfaceC5220m0, null));
            } else {
                interfaceC9570f2 = InterfaceC9570f.f25164r;
            }
            interfaceC5179i.mo25282C();
            return interfaceC9570f2;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8325a(InterfaceC9570f interfaceC9570f, InterfaceC10987m interfaceC10987m, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10987m, "interactionSource");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10294a(interfaceC10987m, z) : C0812v0.m39497a(), new C10295b(interfaceC10987m, z));
    }
}
