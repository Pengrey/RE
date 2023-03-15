package td;

import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.z0 */
/* loaded from: classes2.dex */
public final class C10600z0 extends AbstractC10518h {

    /* renamed from: w */
    private final InterfaceC10595y0 f27310w;

    public C10600z0(InterfaceC10595y0 interfaceC10595y0) {
        this.f27310w = interfaceC10595y0;
    }

    @Override // td.AbstractC10523i
    /* renamed from: a */
    public void mo5730a(Throwable th2) {
        this.f27310w.mo6823b();
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo5730a(th2);
        return C13195u.f34156a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f27310w + ']';
    }
}
