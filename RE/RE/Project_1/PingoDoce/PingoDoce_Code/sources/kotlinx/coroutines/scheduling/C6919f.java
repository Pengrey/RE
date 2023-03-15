package kotlinx.coroutines.scheduling;

import bd.CoroutineContext;
import td.AbstractC10525i1;

/* renamed from: kotlinx.coroutines.scheduling.f */
/* loaded from: classes2.dex */
public class C6919f extends AbstractC10525i1 {

    /* renamed from: A */
    private final long f18402A;

    /* renamed from: B */
    private final String f18403B;

    /* renamed from: C */
    private ExecutorC6910a f18404C = m19791H0();

    /* renamed from: y */
    private final int f18405y;

    /* renamed from: z */
    private final int f18406z;

    public C6919f(int i, int i2, long j, String str) {
        this.f18405y = i;
        this.f18406z = i2;
        this.f18402A = j;
        this.f18403B = str;
    }

    /* renamed from: H0 */
    private final ExecutorC6910a m19791H0() {
        return new ExecutorC6910a(this.f18405y, this.f18406z, this.f18402A, this.f18403B);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC6910a.m19814v(this.f18404C, runnable, null, false, 6, null);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: E0 */
    public void mo7797E0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC6910a.m19814v(this.f18404C, runnable, null, true, 2, null);
    }

    /* renamed from: I0 */
    public final void m19790I0(Runnable runnable, InterfaceC6922i interfaceC6922i, boolean z) {
        this.f18404C.m19815t(runnable, interfaceC6922i, z);
    }
}
