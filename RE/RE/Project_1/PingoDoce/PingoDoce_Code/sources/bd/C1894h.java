package bd;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import java.io.Serializable;
import p181jd.Intrinsics;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: bd.h */
/* loaded from: classes2.dex */
public final class C1894h implements CoroutineContext, Serializable {

    /* renamed from: w */
    public static final C1894h f5621w = new C1894h();

    private C1894h() {
    }

    private final Object readResolve() {
        return f5621w;
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
        return obj;
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        return null;
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        return coroutineContext;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
