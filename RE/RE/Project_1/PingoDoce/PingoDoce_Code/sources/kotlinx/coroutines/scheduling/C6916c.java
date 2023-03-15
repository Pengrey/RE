package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
/* loaded from: classes2.dex */
public final class C6916c extends C6919f {

    /* renamed from: D */
    public static final C6916c f18400D = new C6916c();

    private C6916c() {
        super(C6925l.f18412b, C6925l.f18413c, C6925l.f18414d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // td.AbstractC10505e0
    public String toString() {
        return "Dispatchers.Default";
    }
}
