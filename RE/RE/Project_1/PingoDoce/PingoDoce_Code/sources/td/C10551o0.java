package td;

import kotlinx.coroutines.internal.C6869i0;
import kotlinx.coroutines.internal.C6905x;

/* renamed from: td.o0 */
/* loaded from: classes2.dex */
public final class C10551o0 {

    /* renamed from: a */
    private static final boolean f27266a = C6869i0.m19961e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final InterfaceC10560q0 f27267b = m7693b();

    /* renamed from: a */
    public static final InterfaceC10560q0 m7694a() {
        return f27267b;
    }

    /* renamed from: b */
    private static final InterfaceC10560q0 m7693b() {
        if (f27266a) {
            AbstractC10492c2 m7619c = C10587w0.m7619c();
            return (C6905x.m19842c(m7619c) || !(m7619c instanceof InterfaceC10560q0)) ? RunnableC10547n0.f27263D : (InterfaceC10560q0) m7619c;
        }
        return RunnableC10547n0.f27263D;
    }
}
