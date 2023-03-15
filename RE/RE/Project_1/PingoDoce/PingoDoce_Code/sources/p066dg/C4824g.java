package p066dg;

import gg.C5658g;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.ClubService;

/* renamed from: dg.g */
/* loaded from: classes2.dex */
public final class C4824g implements InterfaceC11614c<ClubsAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<ClubService> f13210a;

    /* renamed from: b */
    private final InterfaceC12341a<C5658g> f13211b;

    public C4824g(InterfaceC12341a<ClubService> interfaceC12341a, InterfaceC12341a<C5658g> interfaceC12341a2) {
        this.f13210a = interfaceC12341a;
        this.f13211b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4824g m26530a(InterfaceC12341a<ClubService> interfaceC12341a, InterfaceC12341a<C5658g> interfaceC12341a2) {
        return new C4824g(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static ClubsAgent m26528c(ClubService clubService, C5658g c5658g) {
        return new ClubsAgent(clubService, c5658g);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ClubsAgent mo42226get() {
        return m26528c(this.f13210a.mo42226get(), this.f13211b.mo42226get());
    }
}
