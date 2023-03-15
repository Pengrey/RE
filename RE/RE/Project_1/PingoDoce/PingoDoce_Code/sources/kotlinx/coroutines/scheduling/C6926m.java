package kotlinx.coroutines.scheduling;

import bd.CoroutineContext;
import td.AbstractC10505e0;

/* renamed from: kotlinx.coroutines.scheduling.m */
/* loaded from: classes2.dex */
final class C6926m extends AbstractC10505e0 {

    /* renamed from: y */
    public static final C6926m f18418y = new C6926m();

    private C6926m() {
    }

    @Override // td.AbstractC10505e0
    /* renamed from: D0 */
    public void mo7628D0(CoroutineContext coroutineContext, Runnable runnable) {
        C6916c.f18400D.m19790I0(runnable, C6925l.f18417g, false);
    }

    @Override // td.AbstractC10505e0
    /* renamed from: E0 */
    public void mo7797E0(CoroutineContext coroutineContext, Runnable runnable) {
        C6916c.f18400D.m19790I0(runnable, C6925l.f18417g, true);
    }
}
