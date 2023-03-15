package td;

import bd.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p468yc.Exceptions;

/* renamed from: td.g0 */
/* loaded from: classes2.dex */
public final class C10515g0 {
    /* renamed from: a */
    public static final void m7790a(CoroutineContext coroutineContext, Throwable th2) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.mo4546c(CoroutineExceptionHandler.f18136q);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.mo20171q0(coroutineContext, th2);
            } else {
                C10511f0.m7792a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C10511f0.m7792a(coroutineContext, m7789b(th2, th3));
        }
    }

    /* renamed from: b */
    public static final Throwable m7789b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        Exceptions.m1470a(runtimeException, th2);
        return runtimeException;
    }
}
