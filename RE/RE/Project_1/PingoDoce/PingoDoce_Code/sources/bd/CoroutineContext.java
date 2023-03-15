package bd;

import bd.ContinuationInterceptor;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* renamed from: bd.g */
/* loaded from: classes2.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    /* renamed from: bd.g$a */
    /* loaded from: classes2.dex */
    public static final class C1889a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        /* renamed from: bd.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C1890a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C1890a f5620w = new C1890a();

            C1890a() {
                super(2);
            }

            /* renamed from: a */
            public final CoroutineContext mo39856d(CoroutineContext coroutineContext, InterfaceC1891b interfaceC1891b) {
                C1881c c1881c;
                Intrinsics.isThisObjectNull(coroutineContext, "acc");
                Intrinsics.isThisObjectNull(interfaceC1891b, "element");
                CoroutineContext mo4544l0 = coroutineContext.mo4544l0(interfaceC1891b.getKey());
                C1894h c1894h = C1894h.f5621w;
                if (mo4544l0 == c1894h) {
                    return interfaceC1891b;
                }
                ContinuationInterceptor.C1888b c1888b = ContinuationInterceptor.f5618d;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) mo4544l0.mo4546c(c1888b);
                if (continuationInterceptor == null) {
                    c1881c = new C1881c(mo4544l0, interfaceC1891b);
                } else {
                    CoroutineContext mo4544l02 = mo4544l0.mo4544l0(c1888b);
                    if (mo4544l02 == c1894h) {
                        return new C1881c(interfaceC1891b, continuationInterceptor);
                    }
                    c1881c = new C1881c(new C1881c(mo4544l02, interfaceC1891b), continuationInterceptor);
                }
                return c1881c;
            }
        }

        /* renamed from: a */
        public static CoroutineContext m35186a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            Intrinsics.isThisObjectNull(coroutineContext2, "context");
            return coroutineContext2 == C1894h.f5621w ? coroutineContext : (CoroutineContext) coroutineContext2.mo4547M(coroutineContext, C1890a.f5620w);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: bd.g$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1891b extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: bd.g$b$a */
        /* loaded from: classes2.dex */
        public static final class C1892a {
            /* renamed from: a */
            public static Object m35184a(InterfaceC1891b interfaceC1891b, Object obj, InterfaceC6112p interfaceC6112p) {
                Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
                return interfaceC6112p.mo39856d(obj, interfaceC1891b);
            }

            /* renamed from: b */
            public static InterfaceC1891b m35183b(InterfaceC1891b interfaceC1891b, InterfaceC1893c interfaceC1893c) {
                Intrinsics.isThisObjectNull(interfaceC1893c, "key");
                if (Intrinsics.equals(interfaceC1891b.getKey(), interfaceC1893c)) {
                    Intrinsics.m20929f(interfaceC1891b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return interfaceC1891b;
                }
                return null;
            }

            /* renamed from: c */
            public static CoroutineContext m35182c(InterfaceC1891b interfaceC1891b, InterfaceC1893c interfaceC1893c) {
                Intrinsics.isThisObjectNull(interfaceC1893c, "key");
                return Intrinsics.equals(interfaceC1891b.getKey(), interfaceC1893c) ? C1894h.f5621w : interfaceC1891b;
            }

            /* renamed from: d */
            public static CoroutineContext m35181d(InterfaceC1891b interfaceC1891b, CoroutineContext coroutineContext) {
                Intrinsics.isThisObjectNull(coroutineContext, "context");
                return C1889a.m35186a(interfaceC1891b, coroutineContext);
            }
        }

        /* renamed from: c */
        InterfaceC1891b mo4546c(InterfaceC1893c interfaceC1893c);

        InterfaceC1893c getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: bd.g$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1893c<E extends InterfaceC1891b> {
    }

    /* renamed from: M */
    Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p);

    /* renamed from: c */
    InterfaceC1891b mo4546c(InterfaceC1893c interfaceC1893c);

    /* renamed from: f0 */
    CoroutineContext mo4545f0(CoroutineContext coroutineContext);

    /* renamed from: l0 */
    CoroutineContext mo4544l0(InterfaceC1893c interfaceC1893c);
}
