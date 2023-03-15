package androidx.lifecycle;

import bd.CoroutineContext;
import p181jd.Intrinsics;
import td.AbstractC10505e0;
import td.C10587w0;

/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public final class PausingDispatcher extends AbstractC10505e0 {

    /* renamed from: y */
    public final DispatchQueue f4299y = new DispatchQueue();

    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        Intrinsics.isThisObjectNull(runnable, "block");
        this.f4299y.m37038c(coroutineContext, runnable);
    }

    /* renamed from: F0 */
    public boolean mo7627F0(CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        if (C10587w0.m7619c().mo7830H0().mo7627F0(coroutineContext)) {
            return true;
        }
        return !this.f4299y.m37039b();
    }
}
