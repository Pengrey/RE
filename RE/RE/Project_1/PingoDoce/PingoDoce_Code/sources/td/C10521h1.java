package td;

import java.util.concurrent.CancellationException;

/* renamed from: td.h1 */
/* loaded from: classes2.dex */
public final class C10521h1 {
    /* renamed from: a */
    public static final CancellationException m7784a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
