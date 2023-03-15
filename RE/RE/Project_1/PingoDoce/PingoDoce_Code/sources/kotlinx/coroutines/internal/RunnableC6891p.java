package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import p468yc.C13195u;
import td.AbstractC10505e0;
import td.C10551o0;
import td.InterfaceC10529j;
import td.InterfaceC10560q0;
import td.InterfaceC10595y0;

/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: classes2.dex */
public final class RunnableC6891p extends AbstractC10505e0 implements Runnable, InterfaceC10560q0 {

    /* renamed from: A */
    private final /* synthetic */ InterfaceC10560q0 f18345A;

    /* renamed from: B */
    private final C6900u<Runnable> f18346B;

    /* renamed from: C */
    private final Object f18347C;
    private volatile int runningWorkers;

    /* renamed from: y */
    private final AbstractC10505e0 f18348y;

    /* renamed from: z */
    private final int f18349z;

    public RunnableC6891p(AbstractC10505e0 abstractC10505e0, int i) {
        this.f18348y = abstractC10505e0;
        this.f18349z = i;
        InterfaceC10560q0 interfaceC10560q0 = abstractC10505e0 instanceof InterfaceC10560q0 ? (InterfaceC10560q0) abstractC10505e0 : null;
        this.f18345A = interfaceC10560q0 == null ? C10551o0.m7694a() : interfaceC10560q0;
        this.f18346B = new C6900u<>(false);
        this.f18347C = new Object();
    }

    /* renamed from: H0 */
    private final boolean m19891H0(Runnable runnable) {
        this.f18346B.m19864a(runnable);
        return this.runningWorkers >= this.f18349z;
    }

    /* renamed from: I0 */
    private final boolean m19890I0() {
        synchronized (this.f18347C) {
            if (this.runningWorkers >= this.f18349z) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        if (m19891H0(runnable) || !m19890I0()) {
            return;
        }
        this.f18348y.mo7628D0(this, this);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: E0 */
    public void mo7797E0(CoroutineContext coroutineContext, Runnable runnable) {
        if (m19891H0(runnable) || !m19890I0()) {
            return;
        }
        this.f18348y.mo7797E0(this, this);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        C6893q.m19888a(i);
        return i >= this.f18349z ? this : super.mo7626G0(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f18347C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f18346B.m19862c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = p468yc.C13195u.f34156a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.u<java.lang.Runnable> r2 = r4.f18346B
            java.lang.Object r2 = r2.m19861d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            bd.h r3 = bd.C1894h.f5621w
            td.C10515g0.m7790a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            td.e0 r2 = r4.f18348y
            boolean r2 = r2.mo7627F0(r4)
            if (r2 == 0) goto L2
            td.e0 r0 = r4.f18348y
            r0.mo7628D0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f18347C
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.u<java.lang.Runnable> r2 = r4.f18346B     // Catch: java.lang.Throwable -> L47
            int r2 = r2.m19862c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            yc.u r2 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.RunnableC6891p.run():void");
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f18345A.mo6812t0(j, runnable, coroutineContext);
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: y */
    public void mo7680y(long j, InterfaceC10529j<? super C13195u> interfaceC10529j) {
        this.f18345A.mo7680y(j, interfaceC10529j);
    }
}
