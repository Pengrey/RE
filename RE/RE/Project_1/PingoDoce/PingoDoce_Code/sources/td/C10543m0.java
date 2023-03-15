package td;

import bd.InterfaceC1886d;
import kotlinx.coroutines.internal.C6870j;
import p468yc.C13183m;
import p468yc.C13186n;

/* renamed from: td.m0 */
/* loaded from: classes2.dex */
public final class C10543m0 {
    /* renamed from: a */
    public static final String m7712a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m7711b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m7710c(InterfaceC1886d<?> interfaceC1886d) {
        String m1458a;
        if (interfaceC1886d instanceof C6870j) {
            return interfaceC1886d.toString();
        }
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m1458a = C13183m.m1458a(interfaceC1886d + '@' + m7711b(interfaceC1886d));
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m1458a = C13183m.m1458a(C13186n.m1454a(th2));
        }
        if (C13183m.m1457b(m1458a) != null) {
            m1458a = interfaceC1886d.getClass().getName() + '@' + m7711b(interfaceC1886d);
        }
        return (String) m1458a;
    }
}
