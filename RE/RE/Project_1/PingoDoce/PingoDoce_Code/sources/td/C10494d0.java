package td;

import bd.C1894h;
import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.C6773e;
import p181jd.AbstractC6438m;
import p181jd.C6449y;

/* renamed from: td.d0 */
/* loaded from: classes2.dex */
public final class C10494d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* renamed from: td.d0$a */
    /* loaded from: classes2.dex */
    public static final class C10495a extends AbstractC6438m implements InterfaceC6112p<CoroutineContext, CoroutineContext.InterfaceC1891b, CoroutineContext> {

        /* renamed from: w */
        public static final C10495a f27220w = new C10495a();

        C10495a() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: a */
        public final CoroutineContext mo39856d(CoroutineContext coroutineContext, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            if (interfaceC1891b instanceof InterfaceC10486b0) {
                return coroutineContext.mo4545f0(((InterfaceC10486b0) interfaceC1891b).m7854E());
            }
            return coroutineContext.mo4545f0(interfaceC1891b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* renamed from: td.d0$b */
    /* loaded from: classes2.dex */
    public static final class C10496b extends AbstractC6438m implements InterfaceC6112p<CoroutineContext, CoroutineContext.InterfaceC1891b, CoroutineContext> {

        /* renamed from: w */
        final /* synthetic */ C6449y<CoroutineContext> f27221w;

        /* renamed from: x */
        final /* synthetic */ boolean f27222x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10496b(C6449y<CoroutineContext> c6449y, boolean z) {
            super(2);
            this.f27221w = c6449y;
            this.f27222x = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, bd.g] */
        @Override // id.InterfaceC6112p
        /* renamed from: a */
        public final CoroutineContext mo39856d(CoroutineContext coroutineContext, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            if (interfaceC1891b instanceof InterfaceC10486b0) {
                CoroutineContext.InterfaceC1891b mo4546c = this.f27221w.f17533w.mo4546c(interfaceC1891b.getKey());
                if (mo4546c == null) {
                    InterfaceC10486b0 interfaceC10486b0 = (InterfaceC10486b0) interfaceC1891b;
                    if (this.f27222x) {
                        interfaceC10486b0 = interfaceC10486b0.m7854E();
                    }
                    return coroutineContext.mo4545f0(interfaceC10486b0);
                }
                C6449y<CoroutineContext> c6449y = this.f27221w;
                c6449y.f17533w = c6449y.f17533w.mo4544l0(interfaceC1891b.getKey());
                return coroutineContext.mo4545f0(((InterfaceC10486b0) interfaceC1891b).m7853x0(mo4546c));
            }
            return coroutineContext.mo4545f0(interfaceC1891b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* renamed from: td.d0$c */
    /* loaded from: classes2.dex */
    public static final class C10497c extends AbstractC6438m implements InterfaceC6112p<Boolean, CoroutineContext.InterfaceC1891b, Boolean> {

        /* renamed from: w */
        public static final C10497c f27223w = new C10497c();

        C10497c() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ Boolean mo39856d(Boolean bool, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            return m7819a(bool.booleanValue(), interfaceC1891b);
        }

        /* renamed from: a */
        public final Boolean m7819a(boolean z, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            return Boolean.valueOf(z || (interfaceC1891b instanceof InterfaceC10486b0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    private static final CoroutineContext m7828a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean m7826c = m7826c(coroutineContext);
        boolean m7826c2 = m7826c(coroutineContext2);
        if (!m7826c && !m7826c2) {
            return coroutineContext.mo4545f0(coroutineContext2);
        }
        C6449y c6449y = new C6449y();
        c6449y.f17533w = coroutineContext2;
        C1894h c1894h = C1894h.f5621w;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo4547M(c1894h, new C10496b(c6449y, z));
        if (m7826c2) {
            c6449y.f17533w = ((CoroutineContext) c6449y.f17533w).mo4547M(c1894h, C10495a.f27220w);
        }
        return coroutineContext3.mo4545f0((CoroutineContext) c6449y.f17533w);
    }

    /* renamed from: b */
    public static final String m7827b(CoroutineContext coroutineContext) {
        C6773e c6773e;
        if (C10539l0.m7718c() && (c6773e = (C6773e) coroutineContext.mo4546c(C6773e.f18142y)) != null) {
            C10519h0 c10519h0 = (C10519h0) coroutineContext.mo4546c(C10519h0.f27241y);
            String str = (c10519h0 == null || (str = c10519h0.m7785D0()) == null) ? "coroutine" : "coroutine";
            return str + '#' + c6773e.m20156D0();
        }
        return null;
    }

    /* renamed from: c */
    private static final boolean m7826c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo4547M(Boolean.FALSE, C10497c.f27223w)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m7825d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !m7826c(coroutineContext2) ? coroutineContext.mo4545f0(coroutineContext2) : m7828a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: e */
    public static final CoroutineContext m7824e(InterfaceC10524i0 interfaceC10524i0, CoroutineContext coroutineContext) {
        CoroutineContext m7828a = m7828a(interfaceC10524i0.mo7716y(), coroutineContext, true);
        CoroutineContext mo4545f0 = C10539l0.m7718c() ? m7828a.mo4545f0(new C6773e(C10539l0.m7719b().incrementAndGet())) : m7828a;
        return (m7828a == C10587w0.m7621a() || m7828a.mo4546c(ContinuationInterceptor.f5618d) != null) ? mo4545f0 : mo4545f0.mo4545f0(C10587w0.m7621a());
    }

    /* renamed from: f */
    public static final C10589w2<?> m7823f(InterfaceC6758e interfaceC6758e) {
        while (!(interfaceC6758e instanceof C10573t0) && (interfaceC6758e = interfaceC6758e.getCallerFrame()) != null) {
            if (interfaceC6758e instanceof C10589w2) {
                return (C10589w2) interfaceC6758e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C10589w2<?> m7822g(InterfaceC1886d<?> interfaceC1886d, CoroutineContext coroutineContext, Object obj) {
        if (interfaceC1886d instanceof InterfaceC6758e) {
            if (coroutineContext.mo4546c(C10593x2.f27305w) != null) {
                C10589w2<?> m7823f = m7823f((InterfaceC6758e) interfaceC1886d);
                if (m7823f != null) {
                    m7823f.m7603c1(coroutineContext, obj);
                }
                return m7823f;
            }
            return null;
        }
        return null;
    }
}
