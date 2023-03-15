package td;

import id.InterfaceC6108l;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.s1 */
/* loaded from: classes2.dex */
public final class C10570s1 extends AbstractC10601z1 {

    /* renamed from: A */
    private final InterfaceC6108l<Throwable, C13195u> f27282A;

    /* JADX WARN: Multi-variable type inference failed */
    public C10570s1(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        this.f27282A = interfaceC6108l;
    }

    @Override // td.AbstractC10599z
    /* renamed from: A */
    public void mo7587A(Throwable th2) {
        this.f27282A.mo9587d(th2);
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo7587A(th2);
        return C13195u.f34156a;
    }
}
