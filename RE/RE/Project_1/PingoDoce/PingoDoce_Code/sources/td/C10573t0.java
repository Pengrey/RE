package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C6859d0;
import kotlinx.coroutines.internal.C6872k;

/* compiled from: Builders.common.kt */
/* renamed from: td.t0 */
/* loaded from: classes2.dex */
public final class C10573t0<T> extends C6859d0<T> {

    /* renamed from: z */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27287z = AtomicIntegerFieldUpdater.newUpdater(C10573t0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public C10573t0(CoroutineContext coroutineContext, InterfaceC1886d<? super T> interfaceC1886d) {
        super(coroutineContext, interfaceC1886d);
        this._decision = 0;
    }

    /* renamed from: c1 */
    private final boolean m7664c1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27287z.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: d1 */
    private final boolean m7663d1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f27287z.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C6859d0, td.AbstractC10476a
    /* renamed from: W0 */
    protected void mo7605W0(Object obj) {
        InterfaceC1886d m34637c;
        if (m7664c1()) {
            return;
        }
        m34637c = IntrinsicsJvm.m34637c(this.f18305y);
        C6872k.m19943c(m34637c, C10477a0.m7925a(obj, this.f18305y), null, 2, null);
    }

    /* renamed from: b1 */
    public final Object m7665b1() {
        Object m34636d;
        if (m7663d1()) {
            m34636d = C2116d.m34636d();
            return m34636d;
        }
        Object m7845h = C10488b2.m7845h(m7887i0());
        if (m7845h instanceof C10590x) {
            throw ((C10590x) m7845h).f27303a;
        }
        return m7845h;
    }

    @Override // kotlinx.coroutines.internal.C6859d0, td.C10479a2
    /* renamed from: s */
    protected void mo7662s(Object obj) {
        mo7605W0(obj);
    }
}
