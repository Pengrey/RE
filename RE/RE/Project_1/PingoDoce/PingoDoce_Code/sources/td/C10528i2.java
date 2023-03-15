package td;

import kotlinx.coroutines.internal.C6896t;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.i2 */
/* loaded from: classes2.dex */
public final class C10528i2 extends AbstractC10504e {

    /* renamed from: w */
    private final C6896t f27244w;

    public C10528i2(C6896t c6896t) {
        this.f27244w = c6896t;
    }

    @Override // td.AbstractC10523i
    /* renamed from: a */
    public void mo5730a(Throwable th2) {
        this.f27244w.mo5634v();
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo5730a(th2);
        return C13195u.f34156a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f27244w + ']';
    }
}
