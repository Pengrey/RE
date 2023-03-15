package p424wd;

import bd.CoroutineContext;
import id.InterfaceC6112p;

/* renamed from: wd.k */
/* loaded from: classes2.dex */
public final class C11642k implements CoroutineContext {

    /* renamed from: w */
    public final Throwable f29777w;

    /* renamed from: x */
    private final /* synthetic */ CoroutineContext f29778x;

    public C11642k(Throwable th2, CoroutineContext coroutineContext) {
        this.f29777w = th2;
        this.f29778x = coroutineContext;
    }

    @Override // bd.CoroutineContext
    /* renamed from: M */
    public <R> R mo4547M(R r, InterfaceC6112p<? super R, ? super CoroutineContext.InterfaceC1891b, ? extends R> interfaceC6112p) {
        return (R) this.f29778x.mo4547M(r, interfaceC6112p);
    }

    @Override // bd.CoroutineContext
    /* renamed from: c */
    public <E extends CoroutineContext.InterfaceC1891b> E mo4546c(CoroutineContext.InterfaceC1893c<E> interfaceC1893c) {
        return (E) this.f29778x.mo4546c(interfaceC1893c);
    }

    @Override // bd.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return this.f29778x.mo4545f0(coroutineContext);
    }

    @Override // bd.CoroutineContext
    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c<?> interfaceC1893c) {
        return this.f29778x.mo4544l0(interfaceC1893c);
    }
}
