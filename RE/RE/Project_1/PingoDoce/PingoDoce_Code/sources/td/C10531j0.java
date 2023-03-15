package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.internal.C6859d0;
import kotlinx.coroutines.internal.C6866h;
import p446xd.C12343b;

/* renamed from: td.j0 */
/* loaded from: classes2.dex */
public final class C10531j0 {
    /* renamed from: a */
    public static final InterfaceC10524i0 m7771a(CoroutineContext coroutineContext) {
        if (coroutineContext.mo4546c(InterfaceC10574t1.f27288s) == null) {
            coroutineContext = coroutineContext.mo4545f0(C10588w1.m7617b(null, 1, null));
        }
        return new C6866h(coroutineContext);
    }

    /* renamed from: b */
    public static final void m7770b(InterfaceC10524i0 interfaceC10524i0, CancellationException cancellationException) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) interfaceC10524i0.mo7716y().mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 != null) {
            interfaceC10574t1.mo5695e(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC10524i0).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ void m7769c(InterfaceC10524i0 interfaceC10524i0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m7770b(interfaceC10524i0, cancellationException);
    }

    /* renamed from: d */
    public static final <R> Object m7768d(InterfaceC6112p<? super InterfaceC10524i0, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super R> interfaceC1886d) {
        Object m34636d;
        C6859d0 c6859d0 = new C6859d0(interfaceC1886d.getContext(), interfaceC1886d);
        Object m3020c = C12343b.m3020c(c6859d0, c6859d0, interfaceC6112p);
        m34636d = C2116d.m34636d();
        if (m3020c == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m3020c;
    }

    /* renamed from: e */
    public static final void m7767e(InterfaceC10524i0 interfaceC10524i0) {
        C10588w1.m7609j(interfaceC10524i0.mo7716y());
    }

    /* renamed from: f */
    public static final boolean m7766f(InterfaceC10524i0 interfaceC10524i0) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) interfaceC10524i0.mo7716y().mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 != null) {
            return interfaceC10574t1.mo5659a();
        }
        return true;
    }
}
