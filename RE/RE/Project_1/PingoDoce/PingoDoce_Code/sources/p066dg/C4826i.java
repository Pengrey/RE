package p066dg;

import gg.C5655e;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.ClubService;

/* renamed from: dg.i */
/* loaded from: classes2.dex */
public final class C4826i implements InterfaceC11614c<ClubsCodesAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<ClubService> f13213a;

    /* renamed from: b */
    private final InterfaceC12341a<C5655e> f13214b;

    public C4826i(InterfaceC12341a<ClubService> interfaceC12341a, InterfaceC12341a<C5655e> interfaceC12341a2) {
        this.f13213a = interfaceC12341a;
        this.f13214b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4826i m26525a(InterfaceC12341a<ClubService> interfaceC12341a, InterfaceC12341a<C5655e> interfaceC12341a2) {
        return new C4826i(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static ClubsCodesAgent m26523c(ClubService clubService, C5655e c5655e) {
        return new ClubsCodesAgent(clubService, c5655e);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ClubsCodesAgent mo42226get() {
        return m26523c(this.f13213a.mo42226get(), this.f13214b.mo42226get());
    }
}
