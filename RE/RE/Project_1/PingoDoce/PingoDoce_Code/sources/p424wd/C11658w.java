package p424wd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wd.w */
/* loaded from: classes2.dex */
public final class C11658w<T> implements InterfaceC1886d<T>, InterfaceC6758e {

    /* renamed from: w */
    private final InterfaceC1886d<T> f29794w;

    /* renamed from: x */
    private final CoroutineContext f29795x;

    /* JADX WARN: Multi-variable type inference failed */
    public C11658w(InterfaceC1886d<? super T> interfaceC1886d, CoroutineContext coroutineContext) {
        this.f29794w = interfaceC1886d;
        this.f29795x = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6758e
    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d<T> interfaceC1886d = this.f29794w;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    @Override // bd.InterfaceC1886d
    public CoroutineContext getContext() {
        return this.f29795x;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6758e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // bd.InterfaceC1886d
    public void resumeWith(Object obj) {
        this.f29794w.resumeWith(obj);
    }
}
