package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.InterfaceC6787d;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.flow.internal.AbortFlowException */
/* loaded from: classes2.dex */
public final class FlowExceptions extends CancellationException {

    /* renamed from: w */
    public final transient InterfaceC6787d<?> f18173w;

    public FlowExceptions(InterfaceC6787d<?> interfaceC6787d) {
        super("Flow was aborted, no more elements needed");
        this.f18173w = interfaceC6787d;
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
