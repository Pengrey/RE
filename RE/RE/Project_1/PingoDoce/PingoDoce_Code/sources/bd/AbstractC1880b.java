package bd;

import bd.CoroutineContext;
import bd.CoroutineContext.InterfaceC1891b;
import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: bd.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1880b<B extends CoroutineContext.InterfaceC1891b, E extends B> implements CoroutineContext.InterfaceC1893c {

    /* renamed from: w */
    private final InterfaceC6108l f5610w;

    /* renamed from: x */
    private final CoroutineContext.InterfaceC1893c f5611x;

    public AbstractC1880b(CoroutineContext.InterfaceC1893c interfaceC1893c, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "baseKey");
        Intrinsics.isThisObjectNull(interfaceC6108l, "safeCast");
        this.f5610w = interfaceC6108l;
        this.f5611x = interfaceC1893c instanceof AbstractC1880b ? ((AbstractC1880b) interfaceC1893c).f5611x : interfaceC1893c;
    }

    /* renamed from: a */
    public final boolean m35198a(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        Intrinsics.isThisObjectNull(interfaceC1893c, "key");
        return interfaceC1893c == this || this.f5611x == interfaceC1893c;
    }

    /* renamed from: b */
    public final CoroutineContext.InterfaceC1891b m35197b(CoroutineContext.InterfaceC1891b interfaceC1891b) {
        Intrinsics.isThisObjectNull(interfaceC1891b, "element");
        return (CoroutineContext.InterfaceC1891b) this.f5610w.mo9587d(interfaceC1891b);
    }
}
