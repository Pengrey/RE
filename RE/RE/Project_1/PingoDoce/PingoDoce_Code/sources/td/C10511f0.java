package td;

import bd.CoroutineContext;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p337rd.C9876k;
import p337rd.InterfaceC9870e;
import p337rd._Sequences;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.Exceptions;

/* renamed from: td.f0 */
/* loaded from: classes2.dex */
public final class C10511f0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f27236a;

    static {
        InterfaceC9870e m9761c;
        List<CoroutineExceptionHandler> m9751m;
        m9761c = C9876k.m9761c(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        m9751m = _Sequences.m9751m(m9761c);
        f27236a = m9751m;
    }

    /* renamed from: a */
    public static final void m7792a(CoroutineContext coroutineContext, Throwable th2) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : f27236a) {
            try {
                coroutineExceptionHandler.mo20171q0(coroutineContext, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C10515g0.m7789b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            Exceptions.m1470a(th2, new C10569s0(coroutineContext));
            C13183m.m1458a(C13195u.f34156a);
        } catch (Throwable th4) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            C13183m.m1458a(C13186n.m1454a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
