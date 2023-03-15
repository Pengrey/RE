package td;

import id.InterfaceC6108l;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.q1 */
/* loaded from: classes2.dex */
public final class C10562q1 extends AbstractC10518h {

    /* renamed from: w */
    private final InterfaceC6108l<Throwable, C13195u> f27275w;

    /* JADX WARN: Multi-variable type inference failed */
    public C10562q1(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        this.f27275w = interfaceC6108l;
    }

    @Override // td.AbstractC10523i
    /* renamed from: a */
    public void mo5730a(Throwable th2) {
        this.f27275w.mo9587d(th2);
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo5730a(th2);
        return C13195u.f34156a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C10543m0.m7712a(this.f27275w) + '@' + C10543m0.m7711b(this) + ']';
    }
}
