package td;

import java.util.concurrent.locks.LockSupport;
import td.AbstractC10498d1;

/* renamed from: td.e1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10508e1 extends AbstractC10491c1 {
    /* renamed from: U0 */
    protected abstract Thread mo7707U0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo7706V0(long j, AbstractC10498d1.AbstractRunnableC10501c abstractRunnableC10501c) {
        RunnableC10547n0.f27263D.m7809f1(j, abstractRunnableC10501c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public final void m7793W0() {
        Thread mo7707U0 = mo7707U0();
        if (Thread.currentThread() != mo7707U0) {
            C10489c.m7844a();
            LockSupport.unpark(mo7707U0);
        }
    }
}
