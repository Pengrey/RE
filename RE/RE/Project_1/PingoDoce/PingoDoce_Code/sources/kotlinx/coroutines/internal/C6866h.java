package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import td.InterfaceC10524i0;

/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes2.dex */
public final class C6866h implements InterfaceC10524i0 {

    /* renamed from: w */
    private final CoroutineContext f18314w;

    public C6866h(CoroutineContext coroutineContext) {
        this.f18314w = coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo7716y() + ')';
    }

    @Override // td.InterfaceC10524i0
    /* renamed from: y */
    public CoroutineContext mo7716y() {
        return this.f18314w;
    }
}
