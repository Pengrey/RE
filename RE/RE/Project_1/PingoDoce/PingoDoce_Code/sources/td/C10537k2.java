package td;

import bd.InterfaceC1886d;
import p468yc.C13183m;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.k2 */
/* loaded from: classes2.dex */
public final class C10537k2 extends AbstractC10601z1 {

    /* renamed from: A */
    private final InterfaceC1886d<C13195u> f27252A;

    /* JADX WARN: Multi-variable type inference failed */
    public C10537k2(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        this.f27252A = interfaceC1886d;
    }

    @Override // td.AbstractC10599z
    /* renamed from: A */
    public void mo7587A(Throwable th2) {
        InterfaceC1886d<C13195u> interfaceC1886d = this.f27252A;
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC1886d.resumeWith(C13183m.m1458a(C13195u.f34156a));
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo7587A(th2);
        return C13195u.f34156a;
    }
}
