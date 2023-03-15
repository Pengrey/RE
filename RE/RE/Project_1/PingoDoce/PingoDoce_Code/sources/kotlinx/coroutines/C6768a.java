package kotlinx.coroutines;

import bd.CoroutineContext;
import java.util.concurrent.locks.LockSupport;
import p181jd.Intrinsics;
import td.AbstractC10476a;
import td.AbstractC10491c1;
import td.C10488b2;
import td.C10489c;
import td.C10590x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes2.dex */
public final class C6768a<T> extends AbstractC10476a {

    /* renamed from: y */
    private final Thread f18140y;

    /* renamed from: z */
    private final AbstractC10491c1 f18141z;

    public C6768a(CoroutineContext coroutineContext, Thread thread, AbstractC10491c1 abstractC10491c1) {
        super(coroutineContext, true, true);
        this.f18140y = thread;
        this.f18141z = abstractC10491c1;
    }

    /* renamed from: a1 */
    public final Object m20173a1() {
        C10489c.m7844a();
        try {
            AbstractC10491c1 abstractC10491c1 = this.f18141z;
            if (abstractC10491c1 != null) {
                AbstractC10491c1.m7836N0(abstractC10491c1, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC10491c1 abstractC10491c12 = this.f18141z;
                long mo7833Q0 = abstractC10491c12 != null ? abstractC10491c12.mo7833Q0() : Long.MAX_VALUE;
                if (!mo7657j0()) {
                    C10489c.m7844a();
                    LockSupport.parkNanos(this, mo7833Q0);
                } else {
                    AbstractC10491c1 abstractC10491c13 = this.f18141z;
                    if (abstractC10491c13 != null) {
                        AbstractC10491c1.m7841I0(abstractC10491c13, false, 1, null);
                    }
                    C10489c.m7844a();
                    Object m7845h = C10488b2.m7845h(m7887i0());
                    C10590x c10590x = m7845h instanceof C10590x ? (C10590x) m7845h : null;
                    if (c10590x == null) {
                        return m7845h;
                    }
                    throw c10590x.f27303a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m7921A(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C10489c.m7844a();
            throw th2;
        }
    }

    /* renamed from: r0 */
    protected boolean mo20001r0() {
        return true;
    }

    /* renamed from: s */
    protected void mo7662s(Object obj) {
        if (Intrinsics.equals(Thread.currentThread(), this.f18140y)) {
            return;
        }
        Thread thread = this.f18140y;
        C10489c.m7844a();
        LockSupport.unpark(thread);
    }
}
