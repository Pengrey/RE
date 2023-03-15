package td;

import bd.CoroutineContext;
import id.InterfaceC6112p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.x2 */
/* loaded from: classes2.dex */
public final class C10593x2 implements CoroutineContext.InterfaceC1891b, CoroutineContext.InterfaceC1893c<C10593x2> {

    /* renamed from: w */
    public static final C10593x2 f27305w = new C10593x2();

    private C10593x2() {
    }

    @Override // bd.CoroutineContext
    /* renamed from: M */
    public <R> R mo4547M(R r, InterfaceC6112p<? super R, ? super CoroutineContext.InterfaceC1891b, ? extends R> interfaceC6112p) {
        return (R) CoroutineContext.InterfaceC1891b.C1892a.m35184a(this, r, interfaceC6112p);
    }

    @Override // bd.CoroutineContext.InterfaceC1891b, bd.CoroutineContext
    /* renamed from: c */
    public <E extends CoroutineContext.InterfaceC1891b> E mo4546c(CoroutineContext.InterfaceC1893c<E> interfaceC1893c) {
        return (E) CoroutineContext.InterfaceC1891b.C1892a.m35183b(this, interfaceC1893c);
    }

    @Override // bd.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35181d(this, coroutineContext);
    }

    @Override // bd.CoroutineContext.InterfaceC1891b
    public CoroutineContext.InterfaceC1893c<?> getKey() {
        return this;
    }

    @Override // bd.CoroutineContext
    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c<?> interfaceC1893c) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35182c(this, interfaceC1893c);
    }
}
