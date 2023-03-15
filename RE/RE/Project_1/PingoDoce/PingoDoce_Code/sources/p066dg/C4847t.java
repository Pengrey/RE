package p066dg;

import gg.C5670o;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.LoyaltyCardService;

/* renamed from: dg.t */
/* loaded from: classes2.dex */
public final class C4847t implements InterfaceC11614c<LoyaltyCardAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<LoyaltyCardService> f13265a;

    /* renamed from: b */
    private final InterfaceC12341a<C5670o> f13266b;

    public C4847t(InterfaceC12341a<LoyaltyCardService> interfaceC12341a, InterfaceC12341a<C5670o> interfaceC12341a2) {
        this.f13265a = interfaceC12341a;
        this.f13266b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4847t m26478a(InterfaceC12341a<LoyaltyCardService> interfaceC12341a, InterfaceC12341a<C5670o> interfaceC12341a2) {
        return new C4847t(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static LoyaltyCardAgent m26476c(LoyaltyCardService loyaltyCardService, C5670o c5670o) {
        return new LoyaltyCardAgent(loyaltyCardService, c5670o);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public LoyaltyCardAgent mo42226get() {
        return m26476c(this.f13265a.mo42226get(), this.f13266b.mo42226get());
    }
}
