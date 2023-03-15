package kotlin.coroutines.jvm.internal;

import bd.InterfaceC1886d;
import cd.C2116d;
import java.io.Serializable;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;

/* renamed from: kotlin.coroutines.jvm.internal.a */
/* loaded from: classes2.dex */
public abstract class ContinuationImpl implements InterfaceC1886d, InterfaceC6758e, Serializable {
    private final InterfaceC1886d completion;

    public ContinuationImpl(InterfaceC1886d interfaceC1886d) {
        this.completion = interfaceC1886d;
    }

    public InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d interfaceC1886d = this.completion;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    public final InterfaceC1886d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return DebugMetadata.m20189d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object m34636d;
        InterfaceC1886d interfaceC1886d = this;
        while (true) {
            DebugProbes.m20187b(interfaceC1886d);
            ContinuationImpl continuationImpl = (ContinuationImpl) interfaceC1886d;
            InterfaceC1886d interfaceC1886d2 = continuationImpl.completion;
            Intrinsics.ifNullDoSomething(interfaceC1886d2);
            try {
                invokeSuspend = continuationImpl.invokeSuspend(obj);
                m34636d = C2116d.m34636d();
            } catch (Throwable th2) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                obj = C13183m.m1458a(C13186n.m1454a(th2));
            }
            if (invokeSuspend == m34636d) {
                return;
            }
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            obj = C13183m.m1458a(invokeSuspend);
            continuationImpl.releaseIntercepted();
            if (!(interfaceC1886d2 instanceof ContinuationImpl)) {
                interfaceC1886d2.resumeWith(obj);
                return;
            }
            interfaceC1886d = interfaceC1886d2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
        Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
