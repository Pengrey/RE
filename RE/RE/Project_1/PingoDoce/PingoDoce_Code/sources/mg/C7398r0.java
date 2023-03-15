package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.PinRecoveryService;

/* renamed from: mg.r0 */
/* loaded from: classes2.dex */
public final class C7398r0 implements InterfaceC11614c<PinRecoveryManager> {

    /* renamed from: a */
    private final InterfaceC12341a<PinRecoveryService> f19626a;

    public C7398r0(InterfaceC12341a<PinRecoveryService> interfaceC12341a) {
        this.f19626a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7398r0 m18576a(InterfaceC12341a<PinRecoveryService> interfaceC12341a) {
        return new C7398r0(interfaceC12341a);
    }

    /* renamed from: c */
    public static PinRecoveryManager m18574c(PinRecoveryService pinRecoveryService) {
        return new PinRecoveryManager(pinRecoveryService);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PinRecoveryManager mo42226get() {
        return m18574c(this.f19626a.mo42226get());
    }
}
