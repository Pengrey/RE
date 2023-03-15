package kotlinx.coroutines.scheduling;

import td.C10543m0;

/* renamed from: kotlinx.coroutines.scheduling.k */
/* loaded from: classes2.dex */
public final class C6924k extends AbstractRunnableC6921h {

    /* renamed from: y */
    public final Runnable f18410y;

    public C6924k(Runnable runnable, long j, InterfaceC6922i interfaceC6922i) {
        super(j, interfaceC6922i);
        this.f18410y = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f18410y.run();
        } finally {
            this.f18408x.mo19788a();
        }
    }

    public String toString() {
        return "Task[" + C10543m0.m7712a(this.f18410y) + '@' + C10543m0.m7711b(this.f18410y) + ", " + this.f18407w + ", " + this.f18408x + ']';
    }
}
