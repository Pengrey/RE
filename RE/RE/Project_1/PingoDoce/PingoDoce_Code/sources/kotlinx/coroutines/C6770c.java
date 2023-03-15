package kotlinx.coroutines;

import bd.C1894h;
import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import td.AbstractC10491c1;
import td.C10494d0;
import td.C10540l1;
import td.C10558p2;
import td.InterfaceC10524i0;

/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6770c {
    /* renamed from: a */
    public static final <T> T m20163a(CoroutineContext coroutineContext, InterfaceC6112p<? super InterfaceC10524i0, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) throws InterruptedException {
        AbstractC10491c1 m7685a;
        CoroutineContext m7824e;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.mo4546c(ContinuationInterceptor.f5618d);
        if (continuationInterceptor == null) {
            m7685a = C10558p2.f27272a.m7684b();
            m7824e = C10494d0.m7824e(C10540l1.f27258w, coroutineContext.mo4545f0(m7685a));
        } else {
            AbstractC10491c1 abstractC10491c1 = continuationInterceptor instanceof AbstractC10491c1 ? (AbstractC10491c1) continuationInterceptor : null;
            if (abstractC10491c1 != null) {
                AbstractC10491c1 abstractC10491c12 = abstractC10491c1.m7831S0() ? abstractC10491c1 : null;
                if (abstractC10491c12 != null) {
                    m7685a = abstractC10491c12;
                    m7824e = C10494d0.m7824e(C10540l1.f27258w, coroutineContext);
                }
            }
            m7685a = C10558p2.f27272a.m7685a();
            m7824e = C10494d0.m7824e(C10540l1.f27258w, coroutineContext);
        }
        C6768a c6768a = new C6768a(m7824e, currentThread, m7685a);
        c6768a.m7928Z0(EnumC6775f.DEFAULT, c6768a, interfaceC6112p);
        return (T) c6768a.m20173a1();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m20162b(CoroutineContext coroutineContext, InterfaceC6112p interfaceC6112p, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        return C6769b.m20166e(coroutineContext, interfaceC6112p);
    }
}
