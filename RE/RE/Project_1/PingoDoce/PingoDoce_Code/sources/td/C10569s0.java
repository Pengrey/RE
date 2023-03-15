package td;

import bd.CoroutineContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.s0 */
/* loaded from: classes2.dex */
public final class C10569s0 extends RuntimeException {

    /* renamed from: w */
    private final CoroutineContext f27281w;

    public C10569s0(CoroutineContext coroutineContext) {
        this.f27281w = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f27281w.toString();
    }
}
