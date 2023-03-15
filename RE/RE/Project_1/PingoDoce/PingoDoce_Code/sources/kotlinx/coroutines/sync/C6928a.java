package kotlinx.coroutines.sync;

import p468yc.C13195u;
import td.AbstractC10518h;

/* renamed from: kotlinx.coroutines.sync.a */
/* loaded from: classes2.dex */
final class C6928a extends AbstractC10518h {

    /* renamed from: w */
    private final C6944i f18424w;

    /* renamed from: x */
    private final int f18425x;

    public C6928a(C6944i c6944i, int i) {
        this.f18424w = c6944i;
        this.f18425x = i;
    }

    @Override // td.AbstractC10523i
    /* renamed from: a */
    public void mo5730a(Throwable th2) {
        this.f18424w.m19734q(this.f18425x);
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo5730a(th2);
        return C13195u.f34156a;
    }

    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f18424w + ", " + this.f18425x + ']';
    }
}
