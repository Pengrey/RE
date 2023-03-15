package td;

import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p468yc.C13195u;

/* renamed from: td.r0 */
/* loaded from: classes2.dex */
public final class C10565r0 {
    /* renamed from: a */
    public static final Object m7677a(long j, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        if (j <= 0) {
            return C13195u.f34156a;
        }
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        if (j < Long.MAX_VALUE) {
            m7676b(c10534k.getContext()).mo7680y(j, c10534k);
        }
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
    }

    /* renamed from: b */
    public static final InterfaceC10560q0 m7676b(CoroutineContext coroutineContext) {
        CoroutineContext.InterfaceC1891b mo4546c = coroutineContext.mo4546c(ContinuationInterceptor.f5618d);
        InterfaceC10560q0 interfaceC10560q0 = mo4546c instanceof InterfaceC10560q0 ? (InterfaceC10560q0) mo4546c : null;
        return interfaceC10560q0 == null ? C10551o0.m7694a() : interfaceC10560q0;
    }
}
