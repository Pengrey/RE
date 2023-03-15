package p404vd;

import id.InterfaceC6108l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6907z;
import kotlinx.coroutines.internal.OnUndeliveredElement;
import p181jd.Intrinsics;
import p468yc.C13195u;
import td.C10538l;
import td.C10539l0;

/* renamed from: vd.m */
/* loaded from: classes2.dex */
public class C11234m<E> extends AbstractC11208a {

    /* renamed from: A */
    private Object f28813A;

    /* renamed from: z */
    private final ReentrantLock f28814z;

    public C11234m(InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f28814z = new ReentrantLock();
        this.f28813A = C11216b.f28787a;
    }

    /* renamed from: S */
    private final OnUndeliveredElement m5668S(Object obj) {
        InterfaceC6108l interfaceC6108l;
        Object obj2 = this.f28813A;
        OnUndeliveredElement onUndeliveredElement = null;
        if (obj2 != C11216b.f28787a && (interfaceC6108l = this.f28794w) != null) {
            onUndeliveredElement = C6907z.m19833d(interfaceC6108l, obj2, null, 2, null);
        }
        this.f28813A = obj;
        return onUndeliveredElement;
    }

    /* renamed from: H */
    protected boolean mo5742H(AbstractC11239r abstractC11239r) {
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            return super.mo5742H(abstractC11239r);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: I */
    protected final boolean mo5647I() {
        return false;
    }

    /* renamed from: J */
    protected final boolean mo5646J() {
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            return this.f28813A == C11216b.f28787a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: L */
    protected void mo5740L(boolean z) {
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            OnUndeliveredElement m5668S = m5668S(C11216b.f28787a);
            C13195u c13195u = C13195u.f34156a;
            reentrantLock.unlock();
            super.mo5740L(z);
            if (m5668S != null) {
                throw m5668S;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: P */
    protected Object mo5737P() {
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            Object obj = this.f28813A;
            C6867h0 c6867h0 = C11216b.f28787a;
            if (obj != c6867h0) {
                this.f28813A = c6867h0;
                C13195u c13195u = C13195u.f34156a;
                return obj;
            }
            Object m5719n = m5719n();
            if (m5719n == null) {
                m5719n = C11216b.f28790d;
            }
            return m5719n;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    protected String m5667l() {
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            return "(value=" + this.f28813A + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: u */
    protected final boolean mo5645u() {
        return false;
    }

    /* renamed from: v */
    protected final boolean mo5644v() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    protected Object mo5665x(Object obj) {
        InterfaceC11241t<E> mo5747B;
        C6867h0 mo5648f;
        ReentrantLock reentrantLock = this.f28814z;
        reentrantLock.lock();
        try {
            C11233l m5719n = m5719n();
            if (m5719n != null) {
                return m5719n;
            }
            if (this.f28813A == C11216b.f28787a) {
                do {
                    mo5747B = mo5747B();
                    if (mo5747B != null) {
                        if (mo5747B instanceof C11233l) {
                            return mo5747B;
                        }
                        Intrinsics.ifNullDoSomething(mo5747B);
                        mo5648f = mo5747B.mo5648f(obj, null);
                    }
                } while (mo5648f == null);
                if (C10539l0.m7720a()) {
                    if (!(mo5648f == C10538l.f27253a)) {
                        throw new AssertionError();
                    }
                }
                C13195u c13195u = C13195u.f34156a;
                reentrantLock.unlock();
                mo5747B.mo5650c(obj);
                return mo5747B.mo42225d();
            }
            OnUndeliveredElement m5668S = m5668S(obj);
            if (m5668S == null) {
                return C11216b.f28788b;
            }
            throw m5668S;
        } finally {
            reentrantLock.unlock();
        }
    }
}
