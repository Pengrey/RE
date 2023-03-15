package td;

import bd.AbstractC1880b;
import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C6870j;
import kotlinx.coroutines.internal.C6893q;
import kotlinx.coroutines.internal.RunnableC6891p;
import p181jd.AbstractC6438m;

/* renamed from: td.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10505e0 extends CoroutineContextImpl implements ContinuationInterceptor {

    /* renamed from: x */
    public static final C10506a f27232x = new C10506a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* renamed from: td.e0$a */
    /* loaded from: classes2.dex */
    public static final class C10506a extends AbstractC1880b<ContinuationInterceptor, AbstractC10505e0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: td.e0$a$a */
        /* loaded from: classes2.dex */
        static final class C10507a extends AbstractC6438m implements InterfaceC6108l<CoroutineContext.InterfaceC1891b, AbstractC10505e0> {

            /* renamed from: w */
            public static final C10507a f27233w = new C10507a();

            C10507a() {
                super(1);
            }

            @Override // id.InterfaceC6108l
            /* renamed from: a */
            public final AbstractC10505e0 mo9587d(CoroutineContext.InterfaceC1891b interfaceC1891b) {
                if (interfaceC1891b instanceof AbstractC10505e0) {
                    return (AbstractC10505e0) interfaceC1891b;
                }
                return null;
            }
        }

        private C10506a() {
            super(ContinuationInterceptor.f5618d, C10507a.f27233w);
        }

        public /* synthetic */ C10506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC10505e0() {
        super(ContinuationInterceptor.f5618d);
    }

    /* renamed from: D0 */
    public abstract void mo7628D0(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: E0 */
    public void mo7797E0(CoroutineContext coroutineContext, Runnable runnable) {
        mo7628D0(coroutineContext, runnable);
    }

    /* renamed from: F0 */
    public boolean mo7627F0(CoroutineContext coroutineContext) {
        return true;
    }

    /* renamed from: G0 */
    public AbstractC10505e0 mo7626G0(int i) {
        C6893q.m19888a(i);
        return new RunnableC6891p(this, i);
    }

    @Override // bd.ContinuationInterceptor
    /* renamed from: P */
    public final void mo7796P(InterfaceC1886d<?> interfaceC1886d) {
        ((C6870j) interfaceC1886d).m19949q();
    }

    @Override // bd.CoroutineContextImpl, bd.CoroutineContext.InterfaceC1891b, bd.CoroutineContext
    /* renamed from: c */
    public <E extends CoroutineContext.InterfaceC1891b> E mo4546c(CoroutineContext.InterfaceC1893c<E> interfaceC1893c) {
        return (E) ContinuationInterceptor.C1887a.m35191a(this, interfaceC1893c);
    }

    @Override // bd.CoroutineContextImpl, bd.CoroutineContext
    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c<?> interfaceC1893c) {
        return ContinuationInterceptor.C1887a.m35190b(this, interfaceC1893c);
    }

    @Override // bd.ContinuationInterceptor
    /* renamed from: o0 */
    public final <T> InterfaceC1886d<T> mo7795o0(InterfaceC1886d<? super T> interfaceC1886d) {
        return new C6870j(this, interfaceC1886d);
    }

    public String toString() {
        return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this);
    }
}
