package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* renamed from: f0.k0 */
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends CoroutineContext.InterfaceC1891b {

    /* renamed from: n */
    public static final C5215b f14435n = C5215b.f14436w;

    /* compiled from: MonotonicFrameClock.kt */
    /* renamed from: f0.k0$a */
    /* loaded from: classes.dex */
    public static final class C5214a {
        /* renamed from: a */
        public static Object m25018a(MonotonicFrameClock monotonicFrameClock, Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(monotonicFrameClock, "this");
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return CoroutineContext.InterfaceC1891b.C1892a.m35184a(monotonicFrameClock, obj, interfaceC6112p);
        }

        /* renamed from: b */
        public static CoroutineContext.InterfaceC1891b m25017b(MonotonicFrameClock monotonicFrameClock, CoroutineContext.InterfaceC1893c interfaceC1893c) {
            Intrinsics.isThisObjectNull(monotonicFrameClock, "this");
            Intrinsics.isThisObjectNull(interfaceC1893c, "key");
            return CoroutineContext.InterfaceC1891b.C1892a.m35183b(monotonicFrameClock, interfaceC1893c);
        }

        /* renamed from: c */
        public static CoroutineContext.InterfaceC1893c m25016c(MonotonicFrameClock monotonicFrameClock) {
            Intrinsics.isThisObjectNull(monotonicFrameClock, "this");
            return MonotonicFrameClock.f14435n;
        }

        /* renamed from: d */
        public static CoroutineContext m25015d(MonotonicFrameClock monotonicFrameClock, CoroutineContext.InterfaceC1893c interfaceC1893c) {
            Intrinsics.isThisObjectNull(monotonicFrameClock, "this");
            Intrinsics.isThisObjectNull(interfaceC1893c, "key");
            return CoroutineContext.InterfaceC1891b.C1892a.m35182c(monotonicFrameClock, interfaceC1893c);
        }

        /* renamed from: e */
        public static CoroutineContext m25014e(MonotonicFrameClock monotonicFrameClock, CoroutineContext coroutineContext) {
            Intrinsics.isThisObjectNull(monotonicFrameClock, "this");
            Intrinsics.isThisObjectNull(coroutineContext, "context");
            return CoroutineContext.InterfaceC1891b.C1892a.m35181d(monotonicFrameClock, coroutineContext);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    /* renamed from: f0.k0$b */
    /* loaded from: classes.dex */
    public static final class C5215b implements CoroutineContext.InterfaceC1893c {

        /* renamed from: w */
        static final /* synthetic */ C5215b f14436w = new C5215b();

        private C5215b() {
        }
    }

    /* renamed from: F */
    Object mo24912F(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d);
}
