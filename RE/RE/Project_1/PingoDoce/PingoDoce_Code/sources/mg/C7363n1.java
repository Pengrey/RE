package mg;

import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.TakeAwayService;

/* renamed from: mg.n1 */
/* loaded from: classes2.dex */
public final class C7363n1 implements InterfaceC11614c<C7347m1> {

    /* renamed from: a */
    private final InterfaceC12341a<TakeAwayService> f19545a;

    /* renamed from: b */
    private final InterfaceC12341a<PrefsManager> f19546b;

    public C7363n1(InterfaceC12341a<TakeAwayService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2) {
        this.f19545a = interfaceC12341a;
        this.f19546b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7363n1 m18656a(InterfaceC12341a<TakeAwayService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2) {
        return new C7363n1(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C7347m1 m18654c(TakeAwayService takeAwayService, PrefsManager prefsManager) {
        return new C7347m1(takeAwayService, prefsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C7347m1 mo42226get() {
        return m18654c(this.f19545a.mo42226get(), this.f19546b.mo42226get());
    }
}
