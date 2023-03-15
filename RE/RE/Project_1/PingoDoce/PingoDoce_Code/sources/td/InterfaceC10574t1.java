package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.concurrent.CancellationException;
import p337rd.InterfaceC9870e;
import p468yc.C13195u;

/* renamed from: td.t1 */
/* loaded from: classes2.dex */
public interface InterfaceC10574t1 extends CoroutineContext.InterfaceC1891b {

    /* renamed from: s */
    public static final C10576b f27288s = C10576b.f27289w;

    /* compiled from: Job.kt */
    /* renamed from: td.t1$a */
    /* loaded from: classes2.dex */
    public static final class C10575a {
        /* renamed from: a */
        public static /* synthetic */ void m7654a(InterfaceC10574t1 interfaceC10574t1, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC10574t1.mo5695e(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m7653b(InterfaceC10574t1 interfaceC10574t1, R r, InterfaceC6112p<? super R, ? super CoroutineContext.InterfaceC1891b, ? extends R> interfaceC6112p) {
            return (R) CoroutineContext.InterfaceC1891b.C1892a.m35184a(interfaceC10574t1, r, interfaceC6112p);
        }

        /* renamed from: c */
        public static <E extends CoroutineContext.InterfaceC1891b> E m7652c(InterfaceC10574t1 interfaceC10574t1, CoroutineContext.InterfaceC1893c<E> interfaceC1893c) {
            return (E) CoroutineContext.InterfaceC1891b.C1892a.m35183b(interfaceC10574t1, interfaceC1893c);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC10595y0 m7651d(InterfaceC10574t1 interfaceC10574t1, boolean z, boolean z2, InterfaceC6108l interfaceC6108l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return interfaceC10574t1.mo7661A0(z, z2, interfaceC6108l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static CoroutineContext m7650e(InterfaceC10574t1 interfaceC10574t1, CoroutineContext.InterfaceC1893c<?> interfaceC1893c) {
            return CoroutineContext.InterfaceC1891b.C1892a.m35182c(interfaceC10574t1, interfaceC1893c);
        }

        /* renamed from: f */
        public static CoroutineContext m7649f(InterfaceC10574t1 interfaceC10574t1, CoroutineContext coroutineContext) {
            return CoroutineContext.InterfaceC1891b.C1892a.m35181d(interfaceC10574t1, coroutineContext);
        }
    }

    /* compiled from: Job.kt */
    /* renamed from: td.t1$b */
    /* loaded from: classes2.dex */
    public static final class C10576b implements CoroutineContext.InterfaceC1893c<InterfaceC10574t1> {

        /* renamed from: w */
        static final /* synthetic */ C10576b f27289w = new C10576b();

        private C10576b() {
        }
    }

    /* renamed from: A0 */
    InterfaceC10595y0 mo7661A0(boolean z, boolean z2, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l);

    /* renamed from: H */
    InterfaceC9870e<InterfaceC10574t1> mo7660H();

    /* renamed from: X */
    InterfaceC10595y0 mo7659X(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l);

    /* renamed from: a */
    boolean mo5659a();

    /* renamed from: e */
    void mo5695e(CancellationException cancellationException);

    /* renamed from: e0 */
    CancellationException mo7658e0();

    /* renamed from: j0 */
    boolean mo7657j0();

    boolean start();

    /* renamed from: t */
    InterfaceC10554p mo7656t(InterfaceC10564r interfaceC10564r);

    /* renamed from: v */
    Object mo7655v(InterfaceC1886d<? super C13195u> interfaceC1886d);
}
