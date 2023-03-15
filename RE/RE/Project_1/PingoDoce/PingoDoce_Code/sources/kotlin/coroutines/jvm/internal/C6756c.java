package kotlin.coroutines.jvm.internal;

import bd.CoroutineContext;
import bd.InterfaceC1886d;

/* renamed from: kotlin.coroutines.jvm.internal.c */
/* loaded from: classes2.dex */
public final class C6756c implements InterfaceC1886d<Object> {

    /* renamed from: w */
    public static final C6756c f18119w = new C6756c();

    private C6756c() {
    }

    @Override // bd.InterfaceC1886d
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // bd.InterfaceC1886d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
