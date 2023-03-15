package td;

import p468yc.C13195u;

/* renamed from: td.q */
/* loaded from: classes2.dex */
public final class C10559q extends AbstractC10580u1 implements InterfaceC10554p {

    /* renamed from: A */
    public final InterfaceC10564r f27274A;

    public C10559q(InterfaceC10564r interfaceC10564r) {
        this.f27274A = interfaceC10564r;
    }

    @Override // td.AbstractC10599z
    /* renamed from: A */
    public void mo7587A(Throwable th2) {
        this.f27274A.mo7678W(m7586B());
    }

    @Override // td.InterfaceC10554p
    /* renamed from: e */
    public boolean mo7681e(Throwable th2) {
        return m7586B().mo4543J(th2);
    }

    @Override // td.InterfaceC10554p
    public InterfaceC10574t1 getParent() {
        return m7586B();
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo7587A(th2);
        return C13195u.f34156a;
    }
}
