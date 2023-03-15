package kotlin.coroutines.jvm.internal;

import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import p181jd.Intrinsics;

/* renamed from: kotlin.coroutines.jvm.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC6757d extends ContinuationImpl {
    private final CoroutineContext _context;
    private transient InterfaceC1886d intercepted;

    public AbstractC6757d(InterfaceC1886d interfaceC1886d, CoroutineContext coroutineContext) {
        super(interfaceC1886d);
        this._context = coroutineContext;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.ifNullDoSomething(coroutineContext);
        return coroutineContext;
    }

    public final InterfaceC1886d intercepted() {
        InterfaceC1886d interfaceC1886d = this.intercepted;
        if (interfaceC1886d == null) {
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) getContext().mo4546c(ContinuationInterceptor.f5618d);
            if (continuationInterceptor == null || (interfaceC1886d = continuationInterceptor.mo7795o0(this)) == null) {
                interfaceC1886d = this;
            }
            this.intercepted = interfaceC1886d;
        }
        return interfaceC1886d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void releaseIntercepted() {
        InterfaceC1886d<?> interfaceC1886d = this.intercepted;
        if (interfaceC1886d != null && interfaceC1886d != this) {
            CoroutineContext.InterfaceC1891b mo4546c = getContext().mo4546c(ContinuationInterceptor.f5618d);
            Intrinsics.ifNullDoSomething(mo4546c);
            ((ContinuationInterceptor) mo4546c).mo7796P(interfaceC1886d);
        }
        this.intercepted = C6756c.f18119w;
    }

    public AbstractC6757d(InterfaceC1886d interfaceC1886d) {
        this(interfaceC1886d, interfaceC1886d != null ? interfaceC1886d.getContext() : null);
    }
}
