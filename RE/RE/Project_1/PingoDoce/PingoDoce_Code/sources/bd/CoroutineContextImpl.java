package bd;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* renamed from: bd.a */
/* loaded from: classes2.dex */
public abstract class CoroutineContextImpl implements CoroutineContext.InterfaceC1891b {

    /* renamed from: w */
    private final CoroutineContext.InterfaceC1893c f5609w;

    public CoroutineContextImpl(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        this.f5609w = interfaceC1893c;
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35184a(this, obj, interfaceC6112p);
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35183b(this, interfaceC1893c);
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35181d(this, coroutineContext);
    }

    public CoroutineContext.InterfaceC1893c getKey() {
        return this.f5609w;
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return CoroutineContext.InterfaceC1891b.C1892a.m35182c(this, interfaceC1893c);
    }
}
