package mg;

import p066dg.BannersAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.i */
/* loaded from: classes2.dex */
public final class C7293i implements InterfaceC11614c<BannerManager> {

    /* renamed from: a */
    private final InterfaceC12341a<BannersAgent> f19316a;

    /* renamed from: b */
    private final InterfaceC12341a<DefaultStoreAgent> f19317b;

    /* renamed from: c */
    private final InterfaceC12341a<UserProfileAgent> f19318c;

    /* renamed from: d */
    private final InterfaceC12341a<ClubsCodesAgent> f19319d;

    public C7293i(InterfaceC12341a<BannersAgent> interfaceC12341a, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a4) {
        this.f19316a = interfaceC12341a;
        this.f19317b = interfaceC12341a2;
        this.f19318c = interfaceC12341a3;
        this.f19319d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7293i m18781a(InterfaceC12341a<BannersAgent> interfaceC12341a, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a4) {
        return new C7293i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static BannerManager m18779c(BannersAgent bannersAgent, DefaultStoreAgent defaultStoreAgent, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        return new BannerManager(bannersAgent, defaultStoreAgent, userProfileAgent, clubsCodesAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public BannerManager mo42226get() {
        return m18779c(this.f19316a.mo42226get(), this.f19317b.mo42226get(), this.f19318c.mo42226get(), this.f19319d.mo42226get());
    }
}
