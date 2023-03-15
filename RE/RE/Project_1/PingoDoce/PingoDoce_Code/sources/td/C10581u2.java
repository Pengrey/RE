package td;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.Timeout;
import p446xd.C12343b;

/* renamed from: td.u2 */
/* loaded from: classes2.dex */
public final class C10581u2 {
    /* renamed from: a */
    public static final Timeout m7640a(long j, InterfaceC10574t1 interfaceC10574t1) {
        return new Timeout("Timed out waiting for " + j + " ms", interfaceC10574t1);
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m7639b(RunnableC10577t2<U, ? super T> runnableC10577t2, InterfaceC6112p<? super InterfaceC10524i0, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) {
        C10588w1.m7610i(runnableC10577t2, C10565r0.m7676b(runnableC10577t2.f18305y.getContext()).mo6812t0(runnableC10577t2.f27290z, runnableC10577t2, runnableC10577t2.getContext()));
        return C12343b.m3019d(runnableC10577t2, runnableC10577t2, interfaceC6112p);
    }

    /* renamed from: c */
    public static final <T> Object m7638c(long j, InterfaceC6112p<? super InterfaceC10524i0, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super T> interfaceC1886d) {
        Object m34636d;
        if (j > 0) {
            Object m7639b = m7639b(new RunnableC10577t2(j, interfaceC1886d), interfaceC6112p);
            m34636d = C2116d.m34636d();
            if (m7639b == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            return m7639b;
        }
        throw new Timeout("Timed out immediately");
    }
}
