package p424wd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlinx.coroutines.flow.internal.C14476ChildCancelledException;
import kotlinx.coroutines.internal.C6859d0;

/* renamed from: wd.l */
/* loaded from: classes2.dex */
final class C11643l<T> extends C6859d0<T> {
    public C11643l(CoroutineContext coroutineContext, InterfaceC1886d<? super T> interfaceC1886d) {
        super(coroutineContext, interfaceC1886d);
    }

    @Override // td.C10479a2
    /* renamed from: J */
    public boolean mo4543J(Throwable th2) {
        if (th2 instanceof C14476ChildCancelledException) {
            return true;
        }
        return m7920B(th2);
    }
}
