package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import java.util.concurrent.CancellationException;
import p468yc.C13195u;
import td.InterfaceC10574t1;

/* renamed from: td.y1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10596y1 {
    /* renamed from: a */
    public static final InterfaceC10582v m7599a(InterfaceC10574t1 interfaceC10574t1) {
        return new C10584v1(interfaceC10574t1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10582v m7598b(InterfaceC10574t1 interfaceC10574t1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC10574t1 = null;
        }
        return C10588w1.m7618a(interfaceC10574t1);
    }

    /* renamed from: c */
    public static final void m7597c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 != null) {
            interfaceC10574t1.mo5695e(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m7596d(InterfaceC10574t1 interfaceC10574t1, String str, Throwable th2) {
        interfaceC10574t1.mo5695e(C10521h1.m7784a(str, th2));
    }

    /* renamed from: e */
    public static /* synthetic */ void m7595e(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C10588w1.m7616c(coroutineContext, cancellationException);
    }

    /* renamed from: f */
    public static /* synthetic */ void m7594f(InterfaceC10574t1 interfaceC10574t1, String str, Throwable th2, int i, Object obj) {
        if ((i & 2) != 0) {
            th2 = null;
        }
        C10588w1.m7615d(interfaceC10574t1, str, th2);
    }

    /* renamed from: g */
    public static final Object m7593g(InterfaceC10574t1 interfaceC10574t1, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        Object mo7655v = interfaceC10574t1.mo7655v(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo7655v == m34636d ? mo7655v : C13195u.f34156a;
    }

    /* renamed from: h */
    public static final InterfaceC10595y0 m7592h(InterfaceC10574t1 interfaceC10574t1, InterfaceC10595y0 interfaceC10595y0) {
        return interfaceC10574t1.mo7659X(new C10478a1(interfaceC10595y0));
    }

    /* renamed from: i */
    public static final void m7591i(CoroutineContext coroutineContext) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 != null) {
            C10588w1.m7608k(interfaceC10574t1);
        }
    }

    /* renamed from: j */
    public static final void m7590j(InterfaceC10574t1 interfaceC10574t1) {
        if (!interfaceC10574t1.mo5659a()) {
            throw interfaceC10574t1.mo7658e0();
        }
    }

    /* renamed from: k */
    public static final InterfaceC10574t1 m7589k(CoroutineContext coroutineContext) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s);
        if (interfaceC10574t1 != null) {
            return interfaceC10574t1;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* renamed from: l */
    public static final boolean m7588l(CoroutineContext coroutineContext) {
        InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s);
        return interfaceC10574t1 != null && interfaceC10574t1.mo5659a();
    }
}
