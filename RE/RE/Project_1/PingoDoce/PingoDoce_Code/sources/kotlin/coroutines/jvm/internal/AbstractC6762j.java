package kotlin.coroutines.jvm.internal;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;

/* renamed from: kotlin.coroutines.jvm.internal.j */
/* loaded from: classes2.dex */
public abstract class AbstractC6762j extends ContinuationImpl {
    public AbstractC6762j(InterfaceC1886d<Object> interfaceC1886d) {
        super(interfaceC1886d);
        if (interfaceC1886d != null) {
            if (!(interfaceC1886d.getContext() == C1894h.f5621w)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // bd.InterfaceC1886d
    public CoroutineContext getContext() {
        return C1894h.f5621w;
    }
}
