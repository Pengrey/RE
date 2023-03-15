package td;

import bd.CoroutineContext;

/* renamed from: td.v2 */
/* loaded from: classes2.dex */
public final class C10585v2 extends AbstractC10505e0 {

    /* renamed from: y */
    public static final C10585v2 f27293y = new C10585v2();

    private C10585v2() {
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        C10597y2 c10597y2 = (C10597y2) coroutineContext.mo4546c(C10597y2.f27308y);
        if (c10597y2 != null) {
            c10597y2.f27309x = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // td.AbstractC10505e0
    /* renamed from: F0 */
    public boolean mo7627F0(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // td.AbstractC10505e0
    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // td.AbstractC10505e0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
