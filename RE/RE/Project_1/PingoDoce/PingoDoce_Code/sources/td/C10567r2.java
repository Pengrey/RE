package td;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: td.r2 */
/* loaded from: classes2.dex */
public final class C10567r2 {
    /* renamed from: b */
    public static final AbstractC10525i1 m7674b(final int i, final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return C10536k1.m7721a(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: td.q2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread m7673c;
                    m7673c = C10567r2.m7673c(i, str, atomicInteger, runnable);
                    return m7673c;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Thread m7673c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: d */
    public static final AbstractC10525i1 m7672d(String str) {
        return m7674b(1, str);
    }
}
