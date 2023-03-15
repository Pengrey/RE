package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.flow.internal.ChildCancelledException  reason: case insensitive filesystem and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C14476ChildCancelledException extends CancellationException {
    public C14476ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C10539l0.m7718c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
