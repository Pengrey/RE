package td;

import bd.CoroutineContext;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C6860e;
import p468yc.C13195u;

/* renamed from: td.j1 */
/* loaded from: classes2.dex */
public final class C10532j1 extends AbstractC10525i1 implements InterfaceC10560q0 {

    /* renamed from: y */
    private final Executor f27245y;

    public C10532j1(Executor executor) {
        this.f27245y = executor;
        C6860e.m20000a(m7764I0());
    }

    /* renamed from: H0 */
    private final void m7765H0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        C10588w1.m7616c(coroutineContext, C10521h1.m7784a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: J0 */
    private final ScheduledFuture<?> m7763J0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m7765H0(coroutineContext, e);
            return null;
        }
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor m7764I0 = m7764I0();
            C10489c.m7844a();
            m7764I0.execute(runnable);
        } catch (RejectedExecutionException e) {
            C10489c.m7844a();
            m7765H0(coroutineContext, e);
            C10587w0.m7620b().mo7628D0(coroutineContext, runnable);
        }
    }

    /* renamed from: I0 */
    public Executor m7764I0() {
        return this.f27245y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor m7764I0 = m7764I0();
        ExecutorService executorService = m7764I0 instanceof ExecutorService ? (ExecutorService) m7764I0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10532j1) && ((C10532j1) obj).m7764I0() == m7764I0();
    }

    public int hashCode() {
        return System.identityHashCode(m7764I0());
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: t0 */
    public InterfaceC10595y0 mo6812t0(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor m7764I0 = m7764I0();
        ScheduledExecutorService scheduledExecutorService = m7764I0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) m7764I0 : null;
        ScheduledFuture<?> m7763J0 = scheduledExecutorService != null ? m7763J0(scheduledExecutorService, runnable, coroutineContext, j) : null;
        if (m7763J0 != null) {
            return new C10591x0(m7763J0);
        }
        return RunnableC10547n0.f27263D.mo6812t0(j, runnable, coroutineContext);
    }

    @Override // td.AbstractC10505e0
    public String toString() {
        return m7764I0().toString();
    }

    @Override // td.InterfaceC10560q0
    /* renamed from: y */
    public void mo7680y(long j, InterfaceC10529j<? super C13195u> interfaceC10529j) {
        Executor m7764I0 = m7764I0();
        ScheduledExecutorService scheduledExecutorService = m7764I0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) m7764I0 : null;
        ScheduledFuture<?> m7763J0 = scheduledExecutorService != null ? m7763J0(scheduledExecutorService, new RunnableC10541l2(this, interfaceC10529j), interfaceC10529j.getContext(), j) : null;
        if (m7763J0 != null) {
            C10588w1.m7611h(interfaceC10529j, m7763J0);
        } else {
            RunnableC10547n0.f27263D.mo7680y(j, interfaceC10529j);
        }
    }
}
