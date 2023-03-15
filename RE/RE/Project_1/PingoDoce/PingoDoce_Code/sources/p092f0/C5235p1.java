package p092f0;

import java.util.concurrent.atomic.AtomicReference;
import p229m0.C7092e;
import p229m0.ThreadMap;
import p468yc.C13195u;

/* compiled from: ActualJvm.jvm.kt */
/* renamed from: f0.p1 */
/* loaded from: classes.dex */
public final class C5235p1<T> {

    /* renamed from: a */
    private final AtomicReference<ThreadMap> f14495a = new AtomicReference<>(C7092e.m19318a());

    /* renamed from: b */
    private final Object f14496b = new Object();

    /* renamed from: a */
    public final T m24956a() {
        return (T) this.f14495a.get().m19321b(Thread.currentThread().getId());
    }

    /* renamed from: b */
    public final void m24955b(T t) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.f14496b) {
            ThreadMap threadMap = this.f14495a.get();
            if (threadMap.m19319d(id2, t)) {
                return;
            }
            this.f14495a.set(threadMap.m19320c(id2, t));
            C13195u c13195u = C13195u.f34156a;
        }
    }
}
