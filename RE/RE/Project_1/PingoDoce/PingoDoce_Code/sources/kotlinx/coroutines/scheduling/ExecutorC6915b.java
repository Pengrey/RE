package kotlinx.coroutines.scheduling;

import bd.C1894h;
import bd.CoroutineContext;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C6869i0;
import kotlinx.coroutines.internal.C6873k0;
import p297pd._Ranges;
import td.AbstractC10505e0;
import td.AbstractC10525i1;

/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: classes2.dex */
public final class ExecutorC6915b extends AbstractC10525i1 implements Executor {

    /* renamed from: y */
    public static final ExecutorC6915b f18398y = new ExecutorC6915b();

    /* renamed from: z */
    private static final AbstractC10505e0 f18399z;

    static {
        int m15005d;
        int m19938d;
        C6926m c6926m = C6926m.f18418y;
        m15005d = _Ranges.m15005d(64, C6869i0.m19965a());
        m19938d = C6873k0.m19938d("kotlinx.coroutines.io.parallelism", m15005d, 0, 0, 12, null);
        f18399z = c6926m.mo7626G0(m19938d);
    }

    private ExecutorC6915b() {
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        f18399z.mo7628D0(coroutineContext, runnable);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: E0 */
    public void mo7797E0(CoroutineContext coroutineContext, Runnable runnable) {
        f18399z.mo7797E0(coroutineContext, runnable);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        return C6926m.f18418y.mo7626G0(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo7628D0(C1894h.f5621w, runnable);
    }

    @Override // td.AbstractC10505e0
    public String toString() {
        return "Dispatchers.IO";
    }
}
