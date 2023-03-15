package p092f0;

import bd.CoroutineContext;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProduceState.kt */
/* renamed from: f0.s0 */
/* loaded from: classes.dex */
public final class C5244s0<T> implements InterfaceC5241r0, InterfaceC5220m0 {

    /* renamed from: w */
    private final CoroutineContext f14509w;

    /* renamed from: x */
    private final /* synthetic */ InterfaceC5220m0 f14510x;

    public C5244s0(InterfaceC5220m0 interfaceC5220m0, CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(interfaceC5220m0, "state");
        Intrinsics.isThisObjectNull(coroutineContext, "coroutineContext");
        this.f14509w = coroutineContext;
        this.f14510x = interfaceC5220m0;
    }

    public Object getValue() {
        return this.f14510x.getValue();
    }

    public void setValue(Object obj) {
        this.f14510x.setValue(obj);
    }

    /* renamed from: y */
    public CoroutineContext mo7716y() {
        return this.f14509w;
    }
}
