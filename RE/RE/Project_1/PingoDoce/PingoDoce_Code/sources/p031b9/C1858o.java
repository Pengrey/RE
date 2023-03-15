package p031b9;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: b9.o */
/* loaded from: classes.dex */
final class C1858o extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f5580a;

    public C1858o(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        this.f5580a = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C1858o.class) {
            if (this == obj) {
                return true;
            }
            C1858o c1858o = (C1858o) obj;
            if (this.f5580a == c1858o.f5580a && get() == c1858o.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5580a;
    }
}
