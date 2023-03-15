package androidx.compose.runtime;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.C6847z;
import kotlinx.coroutines.flow.InterfaceC6835r;
import kotlinx.coroutines.flow.InterfaceC6844x;
import org.joda.time.DateTimeConstants;
import p092f0.BroadcastFrameClock;
import p092f0.C5217l0;
import p092f0.C5259v1;
import p092f0.InterfaceC5243s;
import p092f0.MonotonicFrameClock;
import p112g0.IdentityArraySet;
import p126h0.C5732a;
import p126h0.InterfaceC5742g;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.AbstractC7961h;
import p260o0.AbstractC7965i;
import p260o0.C7952c;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.Exceptions;
import td.C10521h1;
import td.C10534k;
import td.C10588w1;
import td.InterfaceC10524i0;
import td.InterfaceC10529j;
import td.InterfaceC10574t1;
import td.InterfaceC10582v;

/* renamed from: androidx.compose.runtime.c */
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {

    /* renamed from: q */
    public static final C0647a f2002q = new C0647a(null);

    /* renamed from: r */
    private static final InterfaceC6835r f2003r = C6847z.m20023a(C5732a.m23209c());

    /* renamed from: a */
    private long f2004a;

    /* renamed from: b */
    private final BroadcastFrameClock f2005b;

    /* renamed from: c */
    private final InterfaceC10582v f2006c;

    /* renamed from: d */
    private final CoroutineContext f2007d;

    /* renamed from: e */
    private final Object f2008e;

    /* renamed from: f */
    private InterfaceC10574t1 f2009f;

    /* renamed from: g */
    private Throwable f2010g;

    /* renamed from: h */
    private final List f2011h;

    /* renamed from: i */
    private final List f2012i;

    /* renamed from: j */
    private final List f2013j;

    /* renamed from: k */
    private final List f2014k;

    /* renamed from: l */
    private InterfaceC10529j f2015l;

    /* renamed from: m */
    private int f2016m;

    /* renamed from: n */
    private boolean f2017n;

    /* renamed from: o */
    private final InterfaceC6835r f2018o;

    /* renamed from: p */
    private final C0648b f2019p;

    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$a */
    /* loaded from: classes.dex */
    public static final class C0647a {
        private C0647a() {
        }

        public /* synthetic */ C0647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ void m39939a(C0647a c0647a, C0648b c0648b) {
            c0647a.m39937c(c0648b);
        }

        /* renamed from: b */
        public static final /* synthetic */ void m39938b(C0647a c0647a, C0648b c0648b) {
            c0647a.m39936d(c0648b);
        }

        /* renamed from: c */
        private final void m39937c(C0648b c0648b) {
            InterfaceC5742g interfaceC5742g;
            InterfaceC5742g add;
            do {
                interfaceC5742g = (InterfaceC5742g) Recomposer.m39987A().getValue();
                add = interfaceC5742g.add((InterfaceC5742g) c0648b);
                if (interfaceC5742g == add) {
                    return;
                }
            } while (!Recomposer.m39987A().mo20082b(interfaceC5742g, add));
        }

        /* renamed from: d */
        private final void m39936d(C0648b c0648b) {
            InterfaceC5742g interfaceC5742g;
            InterfaceC5742g remove;
            do {
                interfaceC5742g = (InterfaceC5742g) Recomposer.m39987A().getValue();
                remove = interfaceC5742g.remove((InterfaceC5742g) c0648b);
                if (interfaceC5742g == remove) {
                    return;
                }
            } while (!Recomposer.m39987A().mo20082b(interfaceC5742g, remove));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$b */
    /* loaded from: classes.dex */
    public final class C0648b {
        public C0648b(Recomposer recomposer) {
            Intrinsics.isThisObjectNull(recomposer, "this$0");
        }
    }

    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$c */
    /* loaded from: classes.dex */
    public enum EnumC0649c {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$d */
    /* loaded from: classes.dex */
    public static final class C0650d extends AbstractC6438m implements InterfaceC6097a {
        C0650d() {
            super(0);
        }

        /* renamed from: a */
        public final void m39935a() {
            InterfaceC10529j m39952n;
            Object m39941y = Recomposer.m39941y(Recomposer.this);
            Recomposer recomposer = Recomposer.this;
            synchronized (m39941y) {
                m39952n = Recomposer.m39952n(recomposer);
                if (((EnumC0649c) Recomposer.m39986B(recomposer).getValue()).compareTo(EnumC0649c.ShuttingDown) <= 0) {
                    throw C10521h1.m7784a("Recomposer shutdown; frame clock awaiter will never resume", Recomposer.m39950p(recomposer));
                }
            }
            if (m39952n == null) {
                return;
            }
            C13183m.C13184a c13184a = C13183m.f34143w;
            m39952n.resumeWith(C13183m.m1458a(C13195u.f34156a));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m39935a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$e */
    /* loaded from: classes.dex */
    public static final class C0651e extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        /* renamed from: androidx.compose.runtime.c$e$a */
        /* loaded from: classes.dex */
        public static final class C0652a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ Recomposer f2022w;

            /* renamed from: x */
            final /* synthetic */ Throwable f2023x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0652a(Recomposer recomposer, Throwable th2) {
                super(1);
                this.f2022w = recomposer;
                this.f2023x = th2;
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                invoke2((Throwable) obj);
                return C13195u.f34156a;
            }

            /* renamed from: invoke */
            public final void invoke2(Throwable th2) {
                Object m39941y = Recomposer.m39941y(this.f2022w);
                Recomposer recomposer = this.f2022w;
                Throwable th3 = this.f2023x;
                synchronized (m39941y) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        if (!(!(th2 instanceof CancellationException))) {
                            th2 = null;
                        }
                        if (th2 != null) {
                            Exceptions.m1470a(th3, th2);
                        }
                    }
                    Recomposer.m39980H(recomposer, th3);
                    Recomposer.m39986B(recomposer).setValue(EnumC0649c.ShutDown);
                    C13195u c13195u = C13195u.f34156a;
                }
            }
        }

        C0651e() {
            super(1);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            InterfaceC10529j interfaceC10529j;
            InterfaceC10529j m39940z;
            CancellationException m7784a = C10521h1.m7784a("Recomposer effect job completed", th2);
            Object m39941y = Recomposer.m39941y(Recomposer.this);
            Recomposer recomposer = Recomposer.this;
            synchronized (m39941y) {
                InterfaceC10574t1 m39944v = Recomposer.m39944v(recomposer);
                interfaceC10529j = null;
                if (m39944v != null) {
                    Recomposer.m39986B(recomposer).setValue(EnumC0649c.ShuttingDown);
                    if (!Recomposer.m39985C(recomposer)) {
                        m39944v.mo5695e(m7784a);
                    } else if (Recomposer.m39940z(recomposer) != null) {
                        m39940z = Recomposer.m39940z(recomposer);
                        Recomposer.m39978J(recomposer, null);
                        m39944v.mo7659X(new C0652a(recomposer, th2));
                        interfaceC10529j = m39940z;
                    }
                    m39940z = null;
                    Recomposer.m39978J(recomposer, null);
                    m39944v.mo7659X(new C0652a(recomposer, th2));
                    interfaceC10529j = m39940z;
                } else {
                    Recomposer.m39980H(recomposer, m7784a);
                    Recomposer.m39986B(recomposer).setValue(EnumC0649c.ShutDown);
                    C13195u c13195u = C13195u.f34156a;
                }
            }
            if (interfaceC10529j == null) {
                return;
            }
            C13183m.C13184a c13184a = C13183m.f34143w;
            interfaceC10529j.resumeWith(C13183m.m1458a(C13195u.f34156a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.Recomposer$join$2", m20196f = "Recomposer.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.c$f */
    /* loaded from: classes.dex */
    public static final class C0653f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f2024x;

        /* renamed from: y */
        /* synthetic */ Object f2025y;

        C0653f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C0653f c0653f = new C0653f(interfaceC1886d);
            c0653f.f2025y = obj;
            return c0653f;
        }

        /* renamed from: d */
        public final Object mo39856d(EnumC0649c enumC0649c, InterfaceC1886d interfaceC1886d) {
            return ((C0653f) create(enumC0649c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f2024x == 0) {
                C13186n.m1453b(obj);
                return C6755b.m20201a(((EnumC0649c) this.f2025y) == EnumC0649c.ShutDown);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$g */
    /* loaded from: classes.dex */
    public static final class C0654g extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ IdentityArraySet f2026w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC5243s f2027x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0654g(IdentityArraySet identityArraySet, InterfaceC5243s interfaceC5243s) {
            super(0);
            this.f2026w = identityArraySet;
            this.f2027x = interfaceC5243s;
        }

        /* renamed from: a */
        public final void m39933a() {
            IdentityArraySet<Object> identityArraySet = this.f2026w;
            InterfaceC5243s interfaceC5243s = this.f2027x;
            for (Object obj : identityArraySet) {
                interfaceC5243s.mo24920k(obj);
            }
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m39933a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$h */
    /* loaded from: classes.dex */
    public static final class C0655h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5243s f2028w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0655h(InterfaceC5243s interfaceC5243s) {
            super(1);
            this.f2028w = interfaceC5243s;
        }

        /* renamed from: a */
        public final void m39932a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "value");
            this.f2028w.mo24917p(obj);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39932a(obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m20196f = "Recomposer.kt", m20195l = {681}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.c$i */
    /* loaded from: classes.dex */
    public static final class C0656i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: B */
        final /* synthetic */ InterfaceC6113q f2030B;

        /* renamed from: C */
        final /* synthetic */ MonotonicFrameClock f2031C;

        /* renamed from: x */
        Object f2032x;

        /* renamed from: y */
        int f2033y;

        /* renamed from: z */
        private /* synthetic */ Object f2034z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", m20196f = "Recomposer.kt", m20195l = {682}, m20194m = "invokeSuspend")
        /* renamed from: androidx.compose.runtime.c$i$a */
        /* loaded from: classes.dex */
        public static final class C0657a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ MonotonicFrameClock f2035A;

            /* renamed from: x */
            int f2036x;

            /* renamed from: y */
            private /* synthetic */ Object f2037y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC6113q f2038z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0657a(InterfaceC6113q interfaceC6113q, MonotonicFrameClock monotonicFrameClock, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f2038z = interfaceC6113q;
                this.f2035A = monotonicFrameClock;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C0657a c0657a = new C0657a(this.f2038z, this.f2035A, interfaceC1886d);
                c0657a.f2037y = obj;
                return c0657a;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C0657a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f2036x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC6113q interfaceC6113q = this.f2038z;
                    MonotonicFrameClock monotonicFrameClock = this.f2035A;
                    this.f2036x = 1;
                    if (interfaceC6113q.mo4533i((InterfaceC10524i0) this.f2037y, monotonicFrameClock, this) == m34636d) {
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
        /* compiled from: Recomposer.kt */
        /* renamed from: androidx.compose.runtime.c$i$b */
        /* loaded from: classes.dex */
        public static final class C0658b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ Recomposer f2039w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0658b(Recomposer recomposer) {
                super(2);
                this.f2039w = recomposer;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m39929a((Set) obj, (AbstractC7961h) obj2);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m39929a(Set set, AbstractC7961h abstractC7961h) {
                InterfaceC10529j interfaceC10529j;
                Intrinsics.isThisObjectNull(set, "changed");
                Intrinsics.isThisObjectNull(abstractC7961h, "$noName_1");
                Object m39941y = Recomposer.m39941y(this.f2039w);
                Recomposer recomposer = this.f2039w;
                synchronized (m39941y) {
                    if (((EnumC0649c) Recomposer.m39986B(recomposer).getValue()).compareTo(EnumC0649c.Idle) >= 0) {
                        Recomposer.m39942x(recomposer).add(set);
                        interfaceC10529j = Recomposer.m39952n(recomposer);
                    } else {
                        interfaceC10529j = null;
                    }
                }
                if (interfaceC10529j == null) {
                    return;
                }
                C13183m.C13184a c13184a = C13183m.f34143w;
                interfaceC10529j.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0656i(InterfaceC6113q interfaceC6113q, MonotonicFrameClock monotonicFrameClock, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f2030B = interfaceC6113q;
            this.f2031C = monotonicFrameClock;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C0656i c0656i = new C0656i(this.f2030B, this.f2031C, interfaceC1886d);
            c0656i.f2034z = obj;
            return c0656i;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0656i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C0656i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m20196f = "Recomposer.kt", m20195l = {407, 425}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.c$j */
    /* loaded from: classes.dex */
    public static final class C0659j extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        /* synthetic */ Object f2040A;

        /* renamed from: x */
        Object f2042x;

        /* renamed from: y */
        Object f2043y;

        /* renamed from: z */
        int f2044z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        /* renamed from: androidx.compose.runtime.c$j$a */
        /* loaded from: classes.dex */
        public static final class C0660a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ Recomposer f2045w;

            /* renamed from: x */
            final /* synthetic */ List f2046x;

            /* renamed from: y */
            final /* synthetic */ List f2047y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0660a(Recomposer recomposer, List list, List list2) {
                super(1);
                this.f2045w = recomposer;
                this.f2046x = list;
                this.f2047y = list2;
            }

            /* renamed from: a */
            public final InterfaceC10529j m39927a(long j) {
                Object m24890a;
                int i;
                InterfaceC10529j m39952n;
                if (Recomposer.m39951o(this.f2045w).m25423k()) {
                    Recomposer recomposer = this.f2045w;
                    C5259v1 c5259v1 = C5259v1.f14529a;
                    m24890a = c5259v1.m24890a("Recomposer:animation");
                    try {
                        Recomposer.m39951o(recomposer).m25422l(j);
                        AbstractC7961h.f20646d.m17363f();
                        C13195u c13195u = C13195u.f34156a;
                        c5259v1.m24889b(m24890a);
                    } finally {
                    }
                }
                Recomposer recomposer2 = this.f2045w;
                List list = this.f2046x;
                List list2 = this.f2047y;
                m24890a = C5259v1.f14529a.m24890a("Recomposer:recompose");
                try {
                    synchronized (Recomposer.m39941y(recomposer2)) {
                        Recomposer.m39983E(recomposer2);
                        List m39949q = Recomposer.m39949q(recomposer2);
                        int size = m39949q.size();
                        i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            list.add((InterfaceC5243s) m39949q.get(i2));
                        }
                        Recomposer.m39949q(recomposer2).clear();
                        C13195u c13195u2 = C13195u.f34156a;
                    }
                    IdentityArraySet identityArraySet = new IdentityArraySet();
                    IdentityArraySet identityArraySet2 = new IdentityArraySet();
                    while (!list.isEmpty()) {
                        int size2 = list.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            int i4 = i3 + 1;
                            InterfaceC5243s interfaceC5243s = (InterfaceC5243s) list.get(i3);
                            identityArraySet2.add(interfaceC5243s);
                            InterfaceC5243s m39984D = Recomposer.m39984D(recomposer2, interfaceC5243s, identityArraySet);
                            if (m39984D != null) {
                                list2.add(m39984D);
                            }
                            i3 = i4;
                        }
                        list.clear();
                        if (identityArraySet.m23677o()) {
                            synchronized (Recomposer.m39941y(recomposer2)) {
                                List m39946t = Recomposer.m39946t(recomposer2);
                                int size3 = m39946t.size();
                                int i5 = 0;
                                while (i5 < size3) {
                                    int i6 = i5 + 1;
                                    InterfaceC5243s interfaceC5243s2 = (InterfaceC5243s) m39946t.get(i5);
                                    if (!identityArraySet2.contains(interfaceC5243s2) && interfaceC5243s2.mo24919l(identityArraySet)) {
                                        list.add(interfaceC5243s2);
                                    }
                                    i5 = i6;
                                }
                                C13195u c13195u3 = C13195u.f34156a;
                            }
                        }
                    }
                    if (!list2.isEmpty()) {
                        Recomposer.m39981G(recomposer2, recomposer2.m39973O() + 1);
                        int size4 = list2.size();
                        while (i < size4) {
                            int i7 = i + 1;
                            ((InterfaceC5243s) list2.get(i)).mo24923h();
                            i = i7;
                        }
                        list2.clear();
                    }
                    synchronized (Recomposer.m39941y(recomposer2)) {
                        m39952n = Recomposer.m39952n(recomposer2);
                    }
                    return m39952n;
                } finally {
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                return m39927a(((Number) obj).longValue());
            }
        }

        C0659j(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo4533i(InterfaceC10524i0 interfaceC10524i0, MonotonicFrameClock monotonicFrameClock, InterfaceC1886d interfaceC1886d) {
            C0659j c0659j = new C0659j(interfaceC1886d);
            c0659j.f2040A = monotonicFrameClock;
            return c0659j.invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:11:0x0052). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009c -> B:11:0x0052). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r11.f2044z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L40
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                java.lang.Object r1 = r11.f2043y
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f2042x
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r11.f2040A
                f0.k0 r5 = (p092f0.MonotonicFrameClock) r5
                p468yc.C13186n.m1453b(r12)
                r12 = r5
                r5 = r11
                r10 = r4
                r4 = r1
                r1 = r10
                goto L52
            L23:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2b:
                java.lang.Object r1 = r11.f2043y
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f2042x
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r11.f2040A
                f0.k0 r5 = (p092f0.MonotonicFrameClock) r5
                p468yc.C13186n.m1453b(r12)
                r12 = r5
                r5 = r11
                r10 = r4
                r4 = r1
                r1 = r10
                goto L6b
            L40:
                p468yc.C13186n.m1453b(r12)
                java.lang.Object r12 = r11.f2040A
                f0.k0 r12 = (p092f0.MonotonicFrameClock) r12
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r5 = r11
            L52:
                androidx.compose.runtime.c r6 = androidx.compose.runtime.Recomposer.this
                boolean r6 = androidx.compose.runtime.Recomposer.m39943w(r6)
                if (r6 == 0) goto La2
                androidx.compose.runtime.c r6 = androidx.compose.runtime.Recomposer.this
                r5.f2040A = r12
                r5.f2042x = r1
                r5.f2043y = r4
                r5.f2044z = r3
                java.lang.Object r6 = androidx.compose.runtime.Recomposer.m39953m(r6, r5)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                androidx.compose.runtime.c r6 = androidx.compose.runtime.Recomposer.this
                java.lang.Object r6 = androidx.compose.runtime.Recomposer.m39941y(r6)
                androidx.compose.runtime.c r7 = androidx.compose.runtime.Recomposer.this
                monitor-enter(r6)
                boolean r8 = androidx.compose.runtime.Recomposer.m39948r(r7)     // Catch: java.lang.Throwable -> L9f
                r9 = 0
                if (r8 != 0) goto L85
                androidx.compose.runtime.Recomposer.m39983E(r7)     // Catch: java.lang.Throwable -> L9f
                boolean r7 = androidx.compose.runtime.Recomposer.m39948r(r7)     // Catch: java.lang.Throwable -> L9f
                if (r7 != 0) goto L85
                r9 = r3
            L85:
                monitor-exit(r6)
                if (r9 == 0) goto L89
                goto L52
            L89:
                androidx.compose.runtime.c$j$a r6 = new androidx.compose.runtime.c$j$a
                androidx.compose.runtime.c r7 = androidx.compose.runtime.Recomposer.this
                r6.<init>(r7, r1, r4)
                r5.f2040A = r12
                r5.f2042x = r1
                r5.f2043y = r4
                r5.f2044z = r2
                java.lang.Object r6 = r12.mo24912F(r6, r5)
                if (r6 != r0) goto L52
                return r0
            L9f:
                r12 = move-exception
                monitor-exit(r6)
                throw r12
            La2:
                yc.u r12 = p468yc.C13195u.f34156a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C0659j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    /* renamed from: androidx.compose.runtime.c$k */
    /* loaded from: classes.dex */
    public static final class C0661k extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5243s f2048w;

        /* renamed from: x */
        final /* synthetic */ IdentityArraySet f2049x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0661k(InterfaceC5243s interfaceC5243s, IdentityArraySet identityArraySet) {
            super(1);
            this.f2048w = interfaceC5243s;
            this.f2049x = identityArraySet;
        }

        /* renamed from: a */
        public final void m39926a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "value");
            this.f2048w.mo24920k(obj);
            IdentityArraySet identityArraySet = this.f2049x;
            if (identityArraySet == null) {
                return;
            }
            identityArraySet.add(obj);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39926a(obj);
            return C13195u.f34156a;
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new C0650d());
        this.f2005b = broadcastFrameClock;
        InterfaceC10582v m7618a = C10588w1.m7618a((InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s));
        m7618a.mo7659X(new C0651e());
        this.f2006c = m7618a;
        this.f2007d = coroutineContext.mo4545f0(broadcastFrameClock).mo4545f0(m7618a);
        this.f2008e = new Object();
        this.f2011h = new ArrayList();
        this.f2012i = new ArrayList();
        this.f2013j = new ArrayList();
        this.f2014k = new ArrayList();
        this.f2018o = C6847z.m20023a(EnumC0649c.Inactive);
        this.f2019p = new C0648b(this);
    }

    /* renamed from: A */
    public static final /* synthetic */ InterfaceC6835r m39987A() {
        return f2003r;
    }

    /* renamed from: B */
    public static final /* synthetic */ InterfaceC6835r m39986B(Recomposer recomposer) {
        return recomposer.f2018o;
    }

    /* renamed from: C */
    public static final /* synthetic */ boolean m39985C(Recomposer recomposer) {
        return recomposer.f2017n;
    }

    /* renamed from: D */
    public static final /* synthetic */ InterfaceC5243s m39984D(Recomposer recomposer, InterfaceC5243s interfaceC5243s, IdentityArraySet identityArraySet) {
        return recomposer.m39967U(interfaceC5243s, identityArraySet);
    }

    /* renamed from: E */
    public static final /* synthetic */ void m39983E(Recomposer recomposer) {
        recomposer.m39964X();
    }

    /* renamed from: F */
    public static final /* synthetic */ void m39982F(Recomposer recomposer, InterfaceC10574t1 interfaceC10574t1) {
        recomposer.m39963Y(interfaceC10574t1);
    }

    /* renamed from: G */
    public static final /* synthetic */ void m39981G(Recomposer recomposer, long j) {
        recomposer.f2004a = j;
    }

    /* renamed from: H */
    public static final /* synthetic */ void m39980H(Recomposer recomposer, Throwable th2) {
        recomposer.f2010g = th2;
    }

    /* renamed from: I */
    public static final /* synthetic */ void m39979I(Recomposer recomposer, InterfaceC10574t1 interfaceC10574t1) {
        recomposer.f2009f = interfaceC10574t1;
    }

    /* renamed from: J */
    public static final /* synthetic */ void m39978J(Recomposer recomposer, InterfaceC10529j interfaceC10529j) {
        recomposer.f2015l = interfaceC10529j;
    }

    /* renamed from: K */
    private final void m39977K(C7952c c7952c) {
        try {
            if (c7952c.m17452v() instanceof AbstractC7965i.C7966a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            c7952c.m17463b();
        }
    }

    /* renamed from: L */
    private final Object m39976L(InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        C13195u c13195u;
        Object m34636d;
        Object m34636d2;
        if (!m39970R()) {
            m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
            C10534k c10534k = new C10534k(m34637c, 1);
            c10534k.m7723y();
            synchronized (m39941y(this)) {
                if (m39947s(this)) {
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    c10534k.resumeWith(C13183m.m1458a(C13195u.f34156a));
                } else {
                    m39978J(this, c10534k);
                }
                c13195u = C13195u.f34156a;
            }
            Object m7728t = c10534k.m7728t();
            m34636d = C2116d.m34636d();
            if (m7728t == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            m34636d2 = C2116d.m34636d();
            return m7728t == m34636d2 ? m7728t : c13195u;
        }
        return C13195u.f34156a;
    }

    /* renamed from: N */
    private final InterfaceC10529j m39974N() {
        EnumC0649c enumC0649c;
        if (((EnumC0649c) this.f2018o.getValue()).compareTo(EnumC0649c.ShuttingDown) <= 0) {
            this.f2011h.clear();
            this.f2012i.clear();
            this.f2013j.clear();
            this.f2014k.clear();
            InterfaceC10529j interfaceC10529j = this.f2015l;
            if (interfaceC10529j != null) {
                InterfaceC10529j.C10530a.m7773a(interfaceC10529j, null, 1, null);
            }
            this.f2015l = null;
            return null;
        }
        if (this.f2009f == null) {
            this.f2012i.clear();
            this.f2013j.clear();
            enumC0649c = this.f2005b.m25423k() ? EnumC0649c.InactivePendingWork : EnumC0649c.Inactive;
        } else if (!(!this.f2013j.isEmpty()) && !(!this.f2012i.isEmpty()) && !(!this.f2014k.isEmpty()) && this.f2016m <= 0 && !this.f2005b.m25423k()) {
            enumC0649c = EnumC0649c.Idle;
        } else {
            enumC0649c = EnumC0649c.PendingWork;
        }
        this.f2018o.setValue(enumC0649c);
        if (enumC0649c == EnumC0649c.PendingWork) {
            InterfaceC10529j interfaceC10529j2 = this.f2015l;
            this.f2015l = null;
            return interfaceC10529j2;
        }
        return null;
    }

    /* renamed from: Q */
    private final boolean m39971Q() {
        return (this.f2013j.isEmpty() ^ true) || this.f2005b.m25423k();
    }

    /* renamed from: R */
    private final boolean m39970R() {
        boolean z;
        synchronized (this.f2008e) {
            z = true;
            if (!(!this.f2012i.isEmpty()) && !(!this.f2013j.isEmpty())) {
                if (!this.f2005b.m25423k()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: S */
    private final boolean m39969S() {
        boolean z;
        boolean z2;
        synchronized (this.f2008e) {
            z = !this.f2017n;
        }
        if (z) {
            return true;
        }
        Iterator<InterfaceC10574t1> it = this.f2006c.mo7660H().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (it.next().mo5659a()) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    /* renamed from: U */
    private final InterfaceC5243s m39967U(InterfaceC5243s interfaceC5243s, IdentityArraySet identityArraySet) {
        if (interfaceC5243s.mo24922i() || interfaceC5243s.mo25007q()) {
            return null;
        }
        C7952c m17362g = AbstractC7961h.f20646d.m17362g(m39966V(interfaceC5243s), m39960a0(interfaceC5243s, identityArraySet));
        try {
            AbstractC7961h m17379i = m17362g.m17379i();
            if (identityArraySet != null && identityArraySet.m23677o()) {
                interfaceC5243s.mo24921j(new C0654g(identityArraySet, interfaceC5243s));
            }
            boolean mo24916s = interfaceC5243s.mo24916s();
            m17362g.m17374n(m17379i);
            if (mo24916s) {
                return interfaceC5243s;
            }
            return null;
        } finally {
            m39977K(m17362g);
        }
    }

    /* renamed from: V */
    private final InterfaceC6108l m39966V(InterfaceC5243s interfaceC5243s) {
        return new C0655h(interfaceC5243s);
    }

    /* renamed from: W */
    private final Object m39965W(InterfaceC6113q interfaceC6113q, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(this.f2005b, new C0656i(interfaceC6113q, C5217l0.m25005a(interfaceC1886d.getContext()), null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* renamed from: X */
    private final void m39964X() {
        if (!this.f2012i.isEmpty()) {
            List list = this.f2012i;
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Set<? extends Object> set = (Set) list.get(i);
                List list2 = this.f2011h;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((InterfaceC5243s) list2.get(i3)).mo24915t(set);
                }
                i = i2;
            }
            this.f2012i.clear();
            if (m39974N() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* renamed from: Y */
    private final void m39963Y(InterfaceC10574t1 interfaceC10574t1) {
        synchronized (this.f2008e) {
            Throwable th2 = this.f2010g;
            if (th2 == null) {
                if (((EnumC0649c) this.f2018o.getValue()).compareTo(EnumC0649c.ShuttingDown) > 0) {
                    if (this.f2009f == null) {
                        this.f2009f = interfaceC10574t1;
                        m39974N();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th2;
            }
        }
    }

    /* renamed from: a0 */
    private final InterfaceC6108l m39960a0(InterfaceC5243s interfaceC5243s, IdentityArraySet identityArraySet) {
        return new C0661k(interfaceC5243s, identityArraySet);
    }

    /* renamed from: m */
    public static final /* synthetic */ Object m39953m(Recomposer recomposer, InterfaceC1886d interfaceC1886d) {
        return recomposer.m39976L(interfaceC1886d);
    }

    /* renamed from: n */
    public static final /* synthetic */ InterfaceC10529j m39952n(Recomposer recomposer) {
        return recomposer.m39974N();
    }

    /* renamed from: o */
    public static final /* synthetic */ BroadcastFrameClock m39951o(Recomposer recomposer) {
        return recomposer.f2005b;
    }

    /* renamed from: p */
    public static final /* synthetic */ Throwable m39950p(Recomposer recomposer) {
        return recomposer.f2010g;
    }

    /* renamed from: q */
    public static final /* synthetic */ List m39949q(Recomposer recomposer) {
        return recomposer.f2013j;
    }

    /* renamed from: r */
    public static final /* synthetic */ boolean m39948r(Recomposer recomposer) {
        return recomposer.m39971Q();
    }

    /* renamed from: s */
    public static final /* synthetic */ boolean m39947s(Recomposer recomposer) {
        return recomposer.m39970R();
    }

    /* renamed from: t */
    public static final /* synthetic */ List m39946t(Recomposer recomposer) {
        return recomposer.f2011h;
    }

    /* renamed from: u */
    public static final /* synthetic */ C0648b m39945u(Recomposer recomposer) {
        return recomposer.f2019p;
    }

    /* renamed from: v */
    public static final /* synthetic */ InterfaceC10574t1 m39944v(Recomposer recomposer) {
        return recomposer.f2009f;
    }

    /* renamed from: w */
    public static final /* synthetic */ boolean m39943w(Recomposer recomposer) {
        return recomposer.m39969S();
    }

    /* renamed from: x */
    public static final /* synthetic */ List m39942x(Recomposer recomposer) {
        return recomposer.f2012i;
    }

    /* renamed from: y */
    public static final /* synthetic */ Object m39941y(Recomposer recomposer) {
        return recomposer.f2008e;
    }

    /* renamed from: z */
    public static final /* synthetic */ InterfaceC10529j m39940z(Recomposer recomposer) {
        return recomposer.f2015l;
    }

    /* renamed from: M */
    public final void m39975M() {
        synchronized (this.f2008e) {
            if (((EnumC0649c) this.f2018o.getValue()).compareTo(EnumC0649c.Idle) >= 0) {
                this.f2018o.setValue(EnumC0649c.ShuttingDown);
            }
            C13195u c13195u = C13195u.f34156a;
        }
        InterfaceC10574t1.C10575a.m7654a(this.f2006c, null, 1, null);
    }

    /* renamed from: O */
    public final long m39973O() {
        return this.f2004a;
    }

    /* renamed from: P */
    public final InterfaceC6844x m39972P() {
        return this.f2018o;
    }

    /* renamed from: T */
    public final Object m39968T(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20135m = C6788e.m20135m(m39972P(), new C0653f(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20135m == m34636d ? m20135m : C13195u.f34156a;
    }

    /* renamed from: Z */
    public final Object m39962Z(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m39965W = m39965W(new C0659j(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m39965W == m34636d ? m39965W : C13195u.f34156a;
    }

    /* renamed from: a */
    public void m39961a(InterfaceC5243s interfaceC5243s, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        boolean mo24922i = interfaceC5243s.mo24922i();
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        C7952c m17362g = c7962a.m17362g(m39966V(interfaceC5243s), m39960a0(interfaceC5243s, null));
        try {
            AbstractC7961h m17379i = m17362g.m17379i();
            interfaceC5243s.mo24918o(interfaceC6112p);
            C13195u c13195u = C13195u.f34156a;
            m17362g.m17374n(m17379i);
            if (!mo24922i) {
                c7962a.m17367b();
            }
            synchronized (this.f2008e) {
                if (((EnumC0649c) this.f2018o.getValue()).compareTo(EnumC0649c.ShuttingDown) > 0 && !this.f2011h.contains(interfaceC5243s)) {
                    this.f2011h.add(interfaceC5243s);
                }
            }
            interfaceC5243s.mo24923h();
            if (mo24922i) {
                return;
            }
            c7962a.m17367b();
        } finally {
            m39977K(m17362g);
        }
    }

    /* renamed from: c */
    public boolean m39959c() {
        return false;
    }

    /* renamed from: e */
    public int m39958e() {
        return DateTimeConstants.MILLIS_PER_SECOND;
    }

    /* renamed from: f */
    public CoroutineContext m39957f() {
        return this.f2007d;
    }

    /* renamed from: g */
    public void m39956g(InterfaceC5243s interfaceC5243s) {
        InterfaceC10529j interfaceC10529j;
        Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
        synchronized (this.f2008e) {
            if (this.f2013j.contains(interfaceC5243s)) {
                interfaceC10529j = null;
            } else {
                this.f2013j.add(interfaceC5243s);
                interfaceC10529j = m39974N();
            }
        }
        if (interfaceC10529j == null) {
            return;
        }
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC10529j.resumeWith(C13183m.m1458a(C13195u.f34156a));
    }

    /* renamed from: h */
    public void m39955h(Set set) {
        Intrinsics.isThisObjectNull(set, "table");
    }

    /* renamed from: l */
    public void m39954l(InterfaceC5243s interfaceC5243s) {
        Intrinsics.isThisObjectNull(interfaceC5243s, "composition");
        synchronized (this.f2008e) {
            this.f2011h.remove(interfaceC5243s);
            C13195u c13195u = C13195u.f34156a;
        }
    }
}
