package p093f1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.C6427b0;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.Density;
import p489zc.C13780s;
import td.InterfaceC10524i0;

/* compiled from: SuspendingPointerInputFilter.kt */
/* renamed from: f1.i0 */
/* loaded from: classes.dex */
public final class C5293i0 {

    /* renamed from: a */
    private static final C5306m f14597a;

    /* compiled from: InspectableValue.kt */
    /* renamed from: f1.i0$a */
    /* loaded from: classes.dex */
    public static final class C5294a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Object f14598w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f14599x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5294a(Object obj, InterfaceC6112p interfaceC6112p) {
            super(1);
            this.f14598w = obj;
            this.f14599x = interfaceC6112p;
        }

        /* renamed from: a */
        public final void m24736a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("pointerInput");
            c0816w0.m39492a().m39649b("key1", this.f14598w);
            c0816w0.m39492a().m39649b("block", this.f14599x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24736a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: f1.i0$b */
    /* loaded from: classes.dex */
    public static final class C5295b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Object f14600w;

        /* renamed from: x */
        final /* synthetic */ Object f14601x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f14602y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5295b(Object obj, Object obj2, InterfaceC6112p interfaceC6112p) {
            super(1);
            this.f14600w = obj;
            this.f14601x = obj2;
            this.f14602y = interfaceC6112p;
        }

        /* renamed from: a */
        public final void m24735a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("pointerInput");
            c0816w0.m39492a().m39649b("key1", this.f14600w);
            c0816w0.m39492a().m39649b("key2", this.f14601x);
            c0816w0.m39492a().m39649b("block", this.f14602y);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24735a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: f1.i0$c */
    /* loaded from: classes.dex */
    public static final class C5296c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Object[] f14603w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f14604x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5296c(Object[] objArr, InterfaceC6112p interfaceC6112p) {
            super(1);
            this.f14603w = objArr;
            this.f14604x = interfaceC6112p;
        }

        /* renamed from: a */
        public final void m24734a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("pointerInput");
            c0816w0.m39492a().m39649b("keys", this.f14603w);
            c0816w0.m39492a().m39649b("block", this.f14604x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24734a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.i0$d */
    /* loaded from: classes.dex */
    public static final class C5297d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object f14605w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f14606x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {225}, m20194m = "invokeSuspend")
        /* renamed from: f1.i0$d$a */
        /* loaded from: classes.dex */
        public static final class C5298a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6112p f14607A;

            /* renamed from: B */
            final /* synthetic */ SuspendingPointerInputFilter f14608B;

            /* renamed from: x */
            int f14609x;

            /* renamed from: y */
            private /* synthetic */ Object f14610y;

            /* renamed from: z */
            final /* synthetic */ SuspendingPointerInputFilter f14611z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5298a(SuspendingPointerInputFilter suspendingPointerInputFilter, InterfaceC6112p interfaceC6112p, SuspendingPointerInputFilter suspendingPointerInputFilter2, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14611z = suspendingPointerInputFilter;
                this.f14607A = interfaceC6112p;
                this.f14608B = suspendingPointerInputFilter2;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C5298a c5298a = new C5298a(this.f14611z, this.f14607A, this.f14608B, interfaceC1886d);
                c5298a.f14610y = obj;
                return c5298a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C5298a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14609x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f14611z.m24760w0((InterfaceC10524i0) this.f14610y);
                    InterfaceC6112p interfaceC6112p = this.f14607A;
                    SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14608B;
                    this.f14609x = 1;
                    if (interfaceC6112p.mo39856d(suspendingPointerInputFilter, this) == m34636d) {
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
        C5297d(Object obj, InterfaceC6112p interfaceC6112p) {
            super(3);
            this.f14605w = obj;
            this.f14606x = interfaceC6112p;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m24733a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m24733a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(674421615);
            Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
            ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
            interfaceC5179i.mo25263g(-3686930);
            boolean mo25276I = interfaceC5179i.mo25276I(density);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new SuspendingPointerInputFilter(viewConfiguration, density);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) mo25262h;
            Effects.m25538d(suspendingPointerInputFilter, this.f14605w, new C5298a(suspendingPointerInputFilter, this.f14606x, suspendingPointerInputFilter, null), interfaceC5179i, 64);
            interfaceC5179i.mo25282C();
            return suspendingPointerInputFilter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.i0$e */
    /* loaded from: classes.dex */
    public static final class C5299e extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object f14612w;

        /* renamed from: x */
        final /* synthetic */ Object f14613x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f14614y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {257}, m20194m = "invokeSuspend")
        /* renamed from: f1.i0$e$a */
        /* loaded from: classes.dex */
        public static final class C5300a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6112p f14615A;

            /* renamed from: x */
            int f14616x;

            /* renamed from: y */
            private /* synthetic */ Object f14617y;

            /* renamed from: z */
            final /* synthetic */ SuspendingPointerInputFilter f14618z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5300a(SuspendingPointerInputFilter suspendingPointerInputFilter, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14618z = suspendingPointerInputFilter;
                this.f14615A = interfaceC6112p;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C5300a c5300a = new C5300a(this.f14618z, this.f14615A, interfaceC1886d);
                c5300a.f14617y = obj;
                return c5300a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C5300a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14616x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f14618z.m24760w0((InterfaceC10524i0) this.f14617y);
                    InterfaceC6112p interfaceC6112p = this.f14615A;
                    SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14618z;
                    this.f14616x = 1;
                    if (interfaceC6112p.mo39856d(suspendingPointerInputFilter, this) == m34636d) {
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
        C5299e(Object obj, Object obj2, InterfaceC6112p interfaceC6112p) {
            super(3);
            this.f14612w = obj;
            this.f14613x = obj2;
            this.f14614y = interfaceC6112p;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m24731a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m24731a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(674422863);
            Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
            ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
            interfaceC5179i.mo25263g(-3686930);
            boolean mo25276I = interfaceC5179i.mo25276I(density);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new SuspendingPointerInputFilter(viewConfiguration, density);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) mo25262h;
            Effects.m25537e(interfaceC9570f, this.f14612w, this.f14613x, new C5300a(suspendingPointerInputFilter, this.f14614y, null), interfaceC5179i, (i & 14) | 576);
            interfaceC5179i.mo25282C();
            return suspendingPointerInputFilter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.i0$f */
    /* loaded from: classes.dex */
    public static final class C5301f extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ Object[] f14619w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f14620x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$6$2$1", m20196f = "SuspendingPointerInputFilter.kt", m20195l = {287}, m20194m = "invokeSuspend")
        /* renamed from: f1.i0$f$a */
        /* loaded from: classes.dex */
        public static final class C5302a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6112p f14621A;

            /* renamed from: B */
            final /* synthetic */ SuspendingPointerInputFilter f14622B;

            /* renamed from: x */
            int f14623x;

            /* renamed from: y */
            private /* synthetic */ Object f14624y;

            /* renamed from: z */
            final /* synthetic */ SuspendingPointerInputFilter f14625z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5302a(SuspendingPointerInputFilter suspendingPointerInputFilter, InterfaceC6112p interfaceC6112p, SuspendingPointerInputFilter suspendingPointerInputFilter2, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f14625z = suspendingPointerInputFilter;
                this.f14621A = interfaceC6112p;
                this.f14622B = suspendingPointerInputFilter2;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C5302a c5302a = new C5302a(this.f14625z, this.f14621A, this.f14622B, interfaceC1886d);
                c5302a.f14624y = obj;
                return c5302a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C5302a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f14623x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f14625z.m24760w0((InterfaceC10524i0) this.f14624y);
                    InterfaceC6112p interfaceC6112p = this.f14621A;
                    SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14622B;
                    this.f14623x = 1;
                    if (interfaceC6112p.mo39856d(suspendingPointerInputFilter, this) == m34636d) {
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
        C5301f(Object[] objArr, InterfaceC6112p interfaceC6112p) {
            super(3);
            this.f14619w = objArr;
            this.f14620x = interfaceC6112p;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m24729a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m24729a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(674424053);
            Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
            ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
            interfaceC5179i.mo25263g(-3686930);
            boolean mo25276I = interfaceC5179i.mo25276I(density);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new SuspendingPointerInputFilter(viewConfiguration, density);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            Object[] objArr = this.f14619w;
            InterfaceC6112p interfaceC6112p = this.f14620x;
            SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) mo25262h;
            C6427b0 c6427b0 = new C6427b0(2);
            c6427b0.m20962a(suspendingPointerInputFilter);
            c6427b0.m20961b(objArr);
            Effects.m25536f(c6427b0.m20959d(new Object[c6427b0.m20960c()]), new C5302a(suspendingPointerInputFilter, interfaceC6112p, suspendingPointerInputFilter, null), interfaceC5179i, 8);
            interfaceC5179i.mo25282C();
            return suspendingPointerInputFilter;
        }
    }

    static {
        List m197g;
        m197g = C13780s.m197g();
        f14597a = new C5306m(m197g);
    }

    /* renamed from: a */
    public static final /* synthetic */ C5306m m24740a() {
        return f14597a;
    }

    /* renamed from: b */
    public static final InterfaceC9570f m24739b(InterfaceC9570f interfaceC9570f, Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C5294a(obj, interfaceC6112p) : C0812v0.m39497a(), new C5297d(obj, interfaceC6112p));
    }

    /* renamed from: c */
    public static final InterfaceC9570f m24738c(InterfaceC9570f interfaceC9570f, Object obj, Object obj2, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C5295b(obj, obj2, interfaceC6112p) : C0812v0.m39497a(), new C5299e(obj, obj2, interfaceC6112p));
    }

    /* renamed from: d */
    public static final InterfaceC9570f m24737d(InterfaceC9570f interfaceC9570f, Object[] objArr, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(objArr, "keys");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C5296c(objArr, interfaceC6112p) : C0812v0.m39497a(), new C5301f(objArr, interfaceC6112p));
    }
}
