package p066dg;

import gg.C5649a;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.BannerService;

/* renamed from: dg.c */
/* loaded from: classes2.dex */
public final class C4815c implements InterfaceC11614c<BannersAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<BannerService> f13183a;

    /* renamed from: b */
    private final InterfaceC12341a<C5649a> f13184b;

    public C4815c(InterfaceC12341a<BannerService> interfaceC12341a, InterfaceC12341a<C5649a> interfaceC12341a2) {
        this.f13183a = interfaceC12341a;
        this.f13184b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4815c m26547a(InterfaceC12341a<BannerService> interfaceC12341a, InterfaceC12341a<C5649a> interfaceC12341a2) {
        return new C4815c(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static BannersAgent m26545c(BannerService bannerService, C5649a c5649a) {
        return new BannersAgent(bannerService, c5649a);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public BannersAgent mo42226get() {
        return m26545c(this.f13183a.mo42226get(), this.f13184b.mo42226get());
    }
}
