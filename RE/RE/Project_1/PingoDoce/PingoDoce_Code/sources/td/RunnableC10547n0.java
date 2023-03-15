package td;

import bd.CoroutineContext;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p297pd._Ranges;
import td.AbstractC10498d1;

/* renamed from: td.n0 */
/* loaded from: classes2.dex */
public final class RunnableC10547n0 extends AbstractC10498d1 implements Runnable {

    /* renamed from: D */
    public static final RunnableC10547n0 f27263D;

    /* renamed from: E */
    private static final long f27264E;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        RunnableC10547n0 runnableC10547n0 = new RunnableC10547n0();
        f27263D = runnableC10547n0;
        AbstractC10491c1.m7836N0(runnableC10547n0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f27264E = timeUnit.toNanos(l.longValue());
    }

    private RunnableC10547n0() {
    }

    /* renamed from: k1 */
    private final synchronized void m7704k1() {
        if (m7701n1()) {
            debugStatus = 3;
            m7810e1();
            notifyAll();
        }
    }

    /* renamed from: l1 */
    private final synchronized Thread m7703l1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: m1 */
    private final boolean m7702m1() {
        return debugStatus == 4;
    }

    /* renamed from: n1 */
    private final boolean m7701n1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: o1 */
    private final synchronized boolean m7700o1() {
        if (m7701n1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: p1 */
    private final void m7699p1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // td.AbstractC10498d1, td.AbstractC10491c1
    /* renamed from: T0 */
    public void mo7708T0() {
        debugStatus = 4;
        super.mo7708T0();
    }

    @Override // td.AbstractC10508e1
    /* renamed from: U0 */
    protected Thread mo7707U0() {
        Thread thread = _thread;
        return thread == null ? m7703l1() : thread;
    }

    @Override // td.AbstractC10508e1
    /* renamed from: V0 */
    protected void mo7706V0(long j, AbstractC10498d1.AbstractRunnableC10501c abstractRunnableC10501c) {
        m7699p1();
    }

    @Override // td.AbstractC10498d1
    /* renamed from: a1 */
    public void mo7705a1(Runnable runnable) {
        if (m7702m1()) {
            m7699p1();
        }
        super.mo7705a1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m7812c1;
        C10558p2.f27272a.m7682d(this);
        C10489c.m7844a();
        try {
            if (!m7700o1()) {
                if (m7812c1) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo7833Q0 = mo7833Q0();
                if (mo7833Q0 == Long.MAX_VALUE) {
                    C10489c.m7844a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f27264E + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m7704k1();
                        C10489c.m7844a();
                        if (m7812c1()) {
                            return;
                        }
                        mo7707U0();
                        return;
                    }
                    mo7833Q0 = _Ranges.m14999j(mo7833Q0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo7833Q0 > 0) {
                    if (m7701n1()) {
                        _thread = null;
                        m7704k1();
                        C10489c.m7844a();
                        if (m7812c1()) {
                            return;
                        }
                        mo7707U0();
                        return;
                    }
                    C10489c.m7844a();
                    LockSupport.parkNanos(this, mo7833Q0);
                }
            }
        } finally {
            _thread = null;
            m7704k1();
            C10489c.m7844a();
            if (!m7812c1()) {
                mo7707U0();
            }
        }
    }

    @Override // td.AbstractC10498d1, td.InterfaceC10560q0
    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return m7807h1(j, runnable);
    }
}
