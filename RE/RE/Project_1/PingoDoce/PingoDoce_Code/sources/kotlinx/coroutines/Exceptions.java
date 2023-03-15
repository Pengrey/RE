package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p181jd.Intrinsics;
import td.C10539l0;
import td.InterfaceC10490c0;
import td.InterfaceC10574t1;

/* renamed from: kotlinx.coroutines.JobCancellationException */
/* loaded from: classes2.dex */
public final class Exceptions extends CancellationException implements InterfaceC10490c0 {

    /* renamed from: w */
    public final transient InterfaceC10574t1 f18138w;

    public Exceptions(String str, Throwable th2, InterfaceC10574t1 interfaceC10574t1) {
        super(str);
        this.f18138w = interfaceC10574t1;
        if (th2 != null) {
            initCause(th2);
        }
    }

    /* renamed from: b */
    public Exceptions mo7843a() {
        if (C10539l0.m7718c()) {
            String message = getMessage();
            Intrinsics.ifNullDoSomething(message);
            return new Exceptions(message, this, this.f18138w);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Exceptions) {
                Exceptions exceptions = (Exceptions) obj;
                if (!Intrinsics.equals(exceptions.getMessage(), getMessage()) || !Intrinsics.equals(exceptions.f18138w, this.f18138w) || !Intrinsics.equals(exceptions.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (C10539l0.m7718c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.ifNullDoSomething(message);
        int hashCode = ((message.hashCode() * 31) + this.f18138w.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f18138w;
    }
}
