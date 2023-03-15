package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* compiled from: MonotonicFrameClock.kt */
/* renamed from: f0.l0 */
/* loaded from: classes.dex */
public final class C5217l0 {
    /* renamed from: a */
    public static final MonotonicFrameClock m25005a(CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(coroutineContext, "<this>");
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.mo4546c(MonotonicFrameClock.f14435n);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    /* renamed from: b */
    public static final Object m25004b(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return m25005a(interfaceC1886d.getContext()).mo24912F(interfaceC6108l, interfaceC1886d);
    }
}
