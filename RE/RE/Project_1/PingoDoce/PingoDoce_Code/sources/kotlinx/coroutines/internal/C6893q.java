package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.q */
/* loaded from: classes2.dex */
public final class C6893q {
    /* renamed from: a */
    public static final void m19888a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
