package kotlinx.coroutines.internal;

import p468yc.C13183m;
import p468yc.C13186n;

/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes2.dex */
public final class C6887n {

    /* renamed from: a */
    private static final boolean f18340a;

    static {
        Object m1458a;
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m1458a = C13183m.m1458a(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m1458a = C13183m.m1458a(C13186n.m1454a(th2));
        }
        f18340a = C13183m.m1455d(m1458a);
    }

    /* renamed from: a */
    public static final boolean m19899a() {
        return f18340a;
    }
}
