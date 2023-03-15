package bd;

import bd.CoroutineContext;
import p181jd.Intrinsics;

/* renamed from: bd.e */
/* loaded from: classes2.dex */
public interface ContinuationInterceptor extends CoroutineContext.InterfaceC1891b {

    /* renamed from: d */
    public static final C1888b f5618d = C1888b.f5619w;

    /* compiled from: ContinuationInterceptor.kt */
    /* renamed from: bd.e$a */
    /* loaded from: classes2.dex */
    public static final class C1887a {
        /* renamed from: a */
        public static CoroutineContext.InterfaceC1891b m35191a(ContinuationInterceptor continuationInterceptor, CoroutineContext.InterfaceC1893c interfaceC1893c) {
            Intrinsics.isThisObjectNull(interfaceC1893c, "key");
            if (interfaceC1893c instanceof AbstractC1880b) {
                AbstractC1880b abstractC1880b = (AbstractC1880b) interfaceC1893c;
                if (abstractC1880b.m35198a(continuationInterceptor.getKey())) {
                    CoroutineContext.InterfaceC1891b m35197b = abstractC1880b.m35197b(continuationInterceptor);
                    if (m35197b instanceof CoroutineContext.InterfaceC1891b) {
                        return m35197b;
                    }
                    return null;
                }
                return null;
            } else if (ContinuationInterceptor.f5618d == interfaceC1893c) {
                Intrinsics.m20929f(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            } else {
                return null;
            }
        }

        /* renamed from: b */
        public static CoroutineContext m35190b(ContinuationInterceptor continuationInterceptor, CoroutineContext.InterfaceC1893c interfaceC1893c) {
            Intrinsics.isThisObjectNull(interfaceC1893c, "key");
            if (!(interfaceC1893c instanceof AbstractC1880b)) {
                return ContinuationInterceptor.f5618d == interfaceC1893c ? C1894h.f5621w : continuationInterceptor;
            }
            AbstractC1880b abstractC1880b = (AbstractC1880b) interfaceC1893c;
            return (!abstractC1880b.m35198a(continuationInterceptor.getKey()) || abstractC1880b.m35197b(continuationInterceptor) == null) ? continuationInterceptor : C1894h.f5621w;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    /* renamed from: bd.e$b */
    /* loaded from: classes2.dex */
    public static final class C1888b implements CoroutineContext.InterfaceC1893c {

        /* renamed from: w */
        static final /* synthetic */ C1888b f5619w = new C1888b();

        private C1888b() {
        }
    }

    /* renamed from: P */
    void mo7796P(InterfaceC1886d interfaceC1886d);

    /* renamed from: o0 */
    InterfaceC1886d mo7795o0(InterfaceC1886d interfaceC1886d);
}
