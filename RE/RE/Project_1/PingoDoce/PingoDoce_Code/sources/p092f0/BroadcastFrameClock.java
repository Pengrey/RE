package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p092f0.MonotonicFrameClock;
import p181jd.AbstractC6438m;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10534k;

/* renamed from: f0.f */
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {

    /* renamed from: w */
    private final InterfaceC6097a f14276w;

    /* renamed from: y */
    private Throwable f14278y;

    /* renamed from: x */
    private final Object f14277x = new Object();

    /* renamed from: z */
    private List f14279z = new ArrayList();

    /* renamed from: A */
    private List f14275A = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BroadcastFrameClock.kt */
    /* renamed from: f0.f$a */
    /* loaded from: classes.dex */
    public static final class C5165a<R> {

        /* renamed from: a */
        private final InterfaceC6108l f14280a;

        /* renamed from: b */
        private final InterfaceC1886d f14281b;

        public C5165a(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC6108l, "onFrame");
            Intrinsics.isThisObjectNull(interfaceC1886d, "continuation");
            this.f14280a = interfaceC6108l;
            this.f14281b = interfaceC1886d;
        }

        /* renamed from: a */
        public final InterfaceC1886d m25421a() {
            return this.f14281b;
        }

        /* renamed from: b */
        public final InterfaceC6108l m25420b() {
            return this.f14280a;
        }

        /* renamed from: c */
        public final void m25419c(long j) {
            Object m1458a;
            InterfaceC1886d interfaceC1886d = this.f14281b;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m1458a = C13183m.m1458a(m25420b().mo9587d(Long.valueOf(j)));
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            interfaceC1886d.resumeWith(m1458a);
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    /* renamed from: f0.f$b */
    /* loaded from: classes.dex */
    static final class C5166b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ C6449y f14283x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5166b(C6449y c6449y) {
            super(1);
            this.f14283x = c6449y;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            C5165a c5165a;
            Object m25426g = BroadcastFrameClock.m25426g(BroadcastFrameClock.this);
            BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
            C6449y c6449y = this.f14283x;
            synchronized (m25426g) {
                List m25428d = BroadcastFrameClock.m25428d(broadcastFrameClock);
                Object obj = c6449y.f17533w;
                if (obj == null) {
                    Intrinsics.throwUninitPropException("awaiter");
                    c5165a = null;
                } else {
                    c5165a = (C5165a) obj;
                }
                m25428d.remove(c5165a);
                C13195u c13195u = C13195u.f34156a;
            }
        }
    }

    public BroadcastFrameClock(InterfaceC6097a interfaceC6097a) {
        this.f14276w = interfaceC6097a;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m25429b(BroadcastFrameClock broadcastFrameClock, Throwable th2) {
        broadcastFrameClock.m25424j(th2);
    }

    /* renamed from: d */
    public static final /* synthetic */ List m25428d(BroadcastFrameClock broadcastFrameClock) {
        return broadcastFrameClock.f14279z;
    }

    /* renamed from: f */
    public static final /* synthetic */ Throwable m25427f(BroadcastFrameClock broadcastFrameClock) {
        return broadcastFrameClock.f14278y;
    }

    /* renamed from: g */
    public static final /* synthetic */ Object m25426g(BroadcastFrameClock broadcastFrameClock) {
        return broadcastFrameClock.f14277x;
    }

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC6097a m25425i(BroadcastFrameClock broadcastFrameClock) {
        return broadcastFrameClock.f14276w;
    }

    /* renamed from: j */
    private final void m25424j(Throwable th2) {
        synchronized (this.f14277x) {
            if (this.f14278y != null) {
                return;
            }
            this.f14278y = th2;
            List list = this.f14279z;
            int i = 0;
            int size = list.size();
            while (i < size) {
                int i2 = i + 1;
                InterfaceC1886d m25421a = ((C5165a) list.get(i)).m25421a();
                C13183m.C13184a c13184a = C13183m.f34143w;
                m25421a.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
                i = i2;
            }
            this.f14279z.clear();
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, f0.f$a] */
    /* renamed from: F */
    public Object mo24912F(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        C5165a c5165a;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        C6449y c6449y = new C6449y();
        synchronized (m25426g(this)) {
            Throwable m25427f = m25427f(this);
            if (m25427f != null) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                c10534k.resumeWith(C13183m.m1458a(C13186n.m1454a(m25427f)));
            } else {
                c6449y.f17533w = new C5165a(interfaceC6108l, c10534k);
                boolean z = !m25428d(this).isEmpty();
                List m25428d = m25428d(this);
                T t = c6449y.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("awaiter");
                    c5165a = null;
                } else {
                    c5165a = (C5165a) t;
                }
                m25428d.add(c5165a);
                boolean z2 = !z;
                c10534k.mo7778n(new C5166b(c6449y));
                if (z2 && m25425i(this) != null) {
                    try {
                        m25425i(this).mo42214q();
                    } catch (Throwable th2) {
                        m25429b(this, th2);
                    }
                }
            }
        }
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        return MonotonicFrameClock.C5214a.m25018a(this, obj, interfaceC6112p);
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25017b(this, interfaceC1893c);
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.C5214a.m25014e(this, coroutineContext);
    }

    public CoroutineContext.InterfaceC1893c getKey() {
        return MonotonicFrameClock.C5214a.m25016c(this);
    }

    /* renamed from: k */
    public final boolean m25423k() {
        boolean z;
        synchronized (this.f14277x) {
            z = !this.f14279z.isEmpty();
        }
        return z;
    }

    /* renamed from: l */
    public final void m25422l(long j) {
        synchronized (this.f14277x) {
            List list = this.f14279z;
            this.f14279z = this.f14275A;
            this.f14275A = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C5165a) list.get(i)).m25419c(j);
            }
            list.clear();
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25015d(this, interfaceC1893c);
    }
}
