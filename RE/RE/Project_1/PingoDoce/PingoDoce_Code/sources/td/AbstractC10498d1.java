package td;

import bd.CoroutineContext;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6886m0;
import kotlinx.coroutines.internal.C6901v;
import kotlinx.coroutines.internal.InterfaceC6888n0;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p468yc.C13195u;
import td.InterfaceC10560q0;

/* compiled from: EventLoop.common.kt */
/* renamed from: td.d1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10498d1 extends AbstractC10508e1 implements InterfaceC10560q0 {

    /* renamed from: B */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27224B = AtomicReferenceFieldUpdater.newUpdater(AbstractC10498d1.class, Object.class, "_queue");

    /* renamed from: C */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27225C = AtomicReferenceFieldUpdater.newUpdater(AbstractC10498d1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventLoop.common.kt */
    /* renamed from: td.d1$a */
    /* loaded from: classes2.dex */
    public final class C10499a extends AbstractRunnableC10501c {

        /* renamed from: y */
        private final InterfaceC10529j f27226y;

        public C10499a(long j, InterfaceC10529j interfaceC10529j) {
            super(j);
            this.f27226y = interfaceC10529j;
        }

        public void run() {
            this.f27226y.mo7780V(AbstractC10498d1.this, C13195u.f34156a);
        }

        public String toString() {
            return super.toString() + this.f27226y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventLoop.common.kt */
    /* renamed from: td.d1$b */
    /* loaded from: classes2.dex */
    public static final class C10500b extends AbstractRunnableC10501c {

        /* renamed from: y */
        private final Runnable f27228y;

        public C10500b(long j, Runnable runnable) {
            super(j);
            this.f27228y = runnable;
        }

        public void run() {
            this.f27228y.run();
        }

        public String toString() {
            return super.toString() + this.f27228y;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: td.d1$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractRunnableC10501c implements Runnable, Comparable, InterfaceC10595y0, InterfaceC6888n0 {
        private volatile Object _heap;

        /* renamed from: w */
        public long f27229w;

        /* renamed from: x */
        private int f27230x = -1;

        public AbstractRunnableC10501c(long j) {
            this.f27229w = j;
        }

        /* renamed from: b */
        public final synchronized void mo6823b() {
            C6867h0 c6867h0;
            C6867h0 c6867h02;
            Object obj = this._heap;
            c6867h0 = C10516g1.f27239a;
            if (obj == c6867h0) {
                return;
            }
            C10502d c10502d = obj instanceof C10502d ? (C10502d) obj : null;
            if (c10502d != null) {
                c10502d.m19906g(this);
            }
            c6867h02 = C10516g1.f27239a;
            this._heap = c6867h02;
        }

        /* renamed from: c */
        public void mo19898c(C6886m0 c6886m0) {
            C6867h0 c6867h0;
            Object obj = this._heap;
            c6867h0 = C10516g1.f27239a;
            if (obj != c6867h0) {
                this._heap = c6886m0;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: d */
        public C6886m0 mo19897d() {
            Object obj = this._heap;
            if (obj instanceof C6886m0) {
                return (C6886m0) obj;
            }
            return null;
        }

        /* renamed from: f */
        public int compareTo(AbstractRunnableC10501c abstractRunnableC10501c) {
            int i = ((this.f27229w - abstractRunnableC10501c.f27229w) > 0L ? 1 : ((this.f27229w - abstractRunnableC10501c.f27229w) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: g */
        public final synchronized int m7800g(long j, C10502d c10502d, AbstractC10498d1 abstractC10498d1) {
            C6867h0 c6867h0;
            Object obj = this._heap;
            c6867h0 = C10516g1.f27239a;
            if (obj == c6867h0) {
                return 2;
            }
            synchronized (c10502d) {
                AbstractRunnableC10501c abstractRunnableC10501c = (AbstractRunnableC10501c) c10502d.m19911b();
                if (AbstractC10498d1.m7816X0(abstractC10498d1)) {
                    return 1;
                }
                if (abstractRunnableC10501c == null) {
                    c10502d.f27231b = j;
                } else {
                    long j2 = abstractRunnableC10501c.f27229w;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c10502d.f27231b > 0) {
                        c10502d.f27231b = j;
                    }
                }
                long j3 = this.f27229w;
                long j4 = c10502d.f27231b;
                if (j3 - j4 < 0) {
                    this.f27229w = j4;
                }
                c10502d.m19912a(this);
                return 0;
            }
        }

        public int getIndex() {
            return this.f27230x;
        }

        /* renamed from: h */
        public final boolean m7799h(long j) {
            return j - this.f27229w >= 0;
        }

        public void setIndex(int i) {
            this.f27230x = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f27229w + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* renamed from: td.d1$d */
    /* loaded from: classes2.dex */
    public static final class C10502d extends C6886m0 {

        /* renamed from: b */
        public long f27231b;

        public C10502d(long j) {
            this.f27231b = j;
        }
    }

    /* renamed from: X0 */
    public static final /* synthetic */ boolean m7816X0(AbstractC10498d1 abstractC10498d1) {
        return abstractC10498d1.m7805j0();
    }

    /* renamed from: Y0 */
    private final void m7815Y0() {
        C6867h0 c6867h0;
        C6867h0 c6867h02;
        if (C10539l0.m7720a() && !m7805j0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27224B;
                c6867h0 = C10516g1.f27240b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, c6867h0)) {
                    return;
                }
            } else if (!(obj instanceof C6901v)) {
                c6867h02 = C10516g1.f27240b;
                if (obj == c6867h02) {
                    return;
                }
                C6901v c6901v = new C6901v(8, true);
                c6901v.m19860a((Runnable) obj);
                if (f27224B.compareAndSet(this, obj, c6901v)) {
                    return;
                }
            } else {
                ((C6901v) obj).m19857d();
                return;
            }
        }
    }

    /* renamed from: Z0 */
    private final Runnable m7814Z0() {
        C6867h0 c6867h0;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C6901v)) {
                c6867h0 = C10516g1.f27240b;
                if (obj == c6867h0) {
                    return null;
                }
                if (f27224B.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                C6901v c6901v = (C6901v) obj;
                Object m19851j = c6901v.m19851j();
                if (m19851j != C6901v.f18365h) {
                    return (Runnable) m19851j;
                }
                f27224B.compareAndSet(this, obj, c6901v.m19852i());
            }
        }
    }

    /* renamed from: b1 */
    private final boolean m7813b1(Runnable runnable) {
        C6867h0 c6867h0;
        while (true) {
            Object obj = this._queue;
            if (m7805j0()) {
                return false;
            }
            if (obj == null) {
                if (f27224B.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof C6901v)) {
                c6867h0 = C10516g1.f27240b;
                if (obj == c6867h0) {
                    return false;
                }
                C6901v c6901v = new C6901v(8, true);
                c6901v.m19860a((Runnable) obj);
                c6901v.m19860a(runnable);
                if (f27224B.compareAndSet(this, obj, c6901v)) {
                    return true;
                }
            } else {
                C6901v c6901v2 = (C6901v) obj;
                int m19860a = c6901v2.m19860a(runnable);
                if (m19860a == 0) {
                    return true;
                }
                if (m19860a == 1) {
                    f27224B.compareAndSet(this, obj, c6901v2.m19852i());
                } else if (m19860a == 2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: d1 */
    private final void m7811d1() {
        AbstractRunnableC10501c abstractRunnableC10501c;
        C10489c.m7844a();
        long nanoTime = System.nanoTime();
        while (true) {
            C10502d c10502d = (C10502d) this._delayed;
            if (c10502d == null || (abstractRunnableC10501c = (AbstractRunnableC10501c) c10502d.m19904i()) == null) {
                return;
            }
            mo7706V0(nanoTime, abstractRunnableC10501c);
        }
    }

    /* renamed from: g1 */
    private final int m7808g1(long j, AbstractRunnableC10501c abstractRunnableC10501c) {
        if (m7805j0()) {
            return 1;
        }
        C10502d c10502d = (C10502d) this._delayed;
        if (c10502d == null) {
            f27225C.compareAndSet(this, null, new C10502d(j));
            Object obj = this._delayed;
            Intrinsics.ifNullDoSomething(obj);
            c10502d = (C10502d) obj;
        }
        return abstractRunnableC10501c.m7800g(j, c10502d, this);
    }

    /* renamed from: i1 */
    private final void m7806i1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: j0 */
    private final boolean m7805j0() {
        return this._isCompleted;
    }

    /* renamed from: j1 */
    private final boolean m7804j1(AbstractRunnableC10501c abstractRunnableC10501c) {
        C10502d c10502d = (C10502d) this._delayed;
        return (c10502d != null ? (AbstractRunnableC10501c) c10502d.m19908e() : null) == abstractRunnableC10501c;
    }

    /* renamed from: D0 */
    public final void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        mo7705a1(runnable);
    }

    /* renamed from: L0 */
    protected long mo7838L0() {
        AbstractRunnableC10501c abstractRunnableC10501c;
        long m15004e;
        C6867h0 c6867h0;
        if (super.mo7838L0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C6901v)) {
                c6867h0 = C10516g1.f27240b;
                return obj == c6867h0 ? Long.MAX_VALUE : 0L;
            } else if (!((C6901v) obj).m19854g()) {
                return 0L;
            }
        }
        C10502d c10502d = (C10502d) this._delayed;
        if (c10502d == null || (abstractRunnableC10501c = (AbstractRunnableC10501c) c10502d.m19908e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = abstractRunnableC10501c.f27229w;
        C10489c.m7844a();
        m15004e = _Ranges.m15004e(j - System.nanoTime(), 0L);
        return m15004e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo7833Q0() {
        /*
            r9 = this;
            boolean r0 = r9.m7832R0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            td.d1$d r0 = (td.AbstractC10498d1.C10502d) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.m19909d()
            if (r3 != 0) goto L45
            td.C10489c.m7844a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.n0 r5 = r0.m19911b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
            monitor-exit(r0)
            goto L3d
        L26:
            td.d1$c r5 = (td.AbstractC10498d1.AbstractRunnableC10501c) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.m7799h(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.m7813b1(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L3c
            kotlinx.coroutines.internal.n0 r5 = r0.m19905h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
        L3c:
            monitor-exit(r0)
        L3d:
            td.d1$c r6 = (td.AbstractC10498d1.AbstractRunnableC10501c) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.m7814Z0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.mo7838L0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td.AbstractC10498d1.mo7833Q0():long");
    }

    /* renamed from: T0 */
    public void mo7708T0() {
        C10558p2.f27272a.m7683c();
        m7806i1(true);
        m7815Y0();
        do {
        } while (mo7833Q0() <= 0);
        m7811d1();
    }

    /* renamed from: a1 */
    public void mo7705a1(Runnable runnable) {
        if (m7813b1(runnable)) {
            m7793W0();
        } else {
            RunnableC10547n0.f27263D.mo7705a1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c1 */
    public boolean m7812c1() {
        C6867h0 c6867h0;
        if (m7834P0()) {
            C10502d c10502d = (C10502d) this._delayed;
            if (c10502d == null || c10502d.m19909d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof C6901v) {
                        return ((C6901v) obj).m19854g();
                    }
                    c6867h0 = C10516g1.f27240b;
                    if (obj != c6867h0) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e1 */
    public final void m7810e1() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: f1 */
    public final void m7809f1(long j, AbstractRunnableC10501c abstractRunnableC10501c) {
        int m7808g1 = m7808g1(j, abstractRunnableC10501c);
        if (m7808g1 == 0) {
            if (m7804j1(abstractRunnableC10501c)) {
                m7793W0();
            }
        } else if (m7808g1 == 1) {
            mo7706V0(j, abstractRunnableC10501c);
        } else if (m7808g1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public final InterfaceC10595y0 m7807h1(long j, Runnable runnable) {
        long m7786c = C10516g1.m7786c(j);
        if (m7786c < 4611686018427387903L) {
            C10489c.m7844a();
            long nanoTime = System.nanoTime();
            C10500b c10500b = new C10500b(m7786c + nanoTime, runnable);
            m7809f1(nanoTime, c10500b);
            return c10500b;
        }
        return C10513f2.f27237w;
    }

    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return InterfaceC10560q0.C10561a.m7679a(this, j, runnable, coroutineContext);
    }

    /* renamed from: y */
    public void mo7680y(long j, InterfaceC10529j interfaceC10529j) {
        long m7786c = C10516g1.m7786c(j);
        if (m7786c < 4611686018427387903L) {
            C10489c.m7844a();
            long nanoTime = System.nanoTime();
            C10499a c10499a = new C10499a(m7786c + nanoTime, interfaceC10529j);
            m7809f1(nanoTime, c10499a);
            C10542m.m7715a(interfaceC10529j, c10499a);
        }
    }
}
