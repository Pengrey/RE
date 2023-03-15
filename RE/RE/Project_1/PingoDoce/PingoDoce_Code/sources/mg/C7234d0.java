package mg;

import org.threeten.p283bp.format.C8223b;
import p066dg.ClubsCodesAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.LoyaltyCardService;

/* renamed from: mg.d0 */
/* loaded from: classes2.dex */
public final class C7234d0 implements InterfaceC11614c<LoyaltyCardManager> {

    /* renamed from: a */
    private final InterfaceC12341a<LoyaltyCardService> f19116a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardAgent> f19117b;

    /* renamed from: c */
    private final InterfaceC12341a<PrefsManager> f19118c;

    /* renamed from: d */
    private final InterfaceC12341a<C8223b> f19119d;

    /* renamed from: e */
    private final InterfaceC12341a<UserProfileAgent> f19120e;

    /* renamed from: f */
    private final InterfaceC12341a<ClubsCodesAgent> f19121f;

    public C7234d0(InterfaceC12341a<LoyaltyCardService> interfaceC12341a, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a2, InterfaceC12341a<PrefsManager> interfaceC12341a3, InterfaceC12341a<C8223b> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a6) {
        this.f19116a = interfaceC12341a;
        this.f19117b = interfaceC12341a2;
        this.f19118c = interfaceC12341a3;
        this.f19119d = interfaceC12341a4;
        this.f19120e = interfaceC12341a5;
        this.f19121f = interfaceC12341a6;
    }

    /* renamed from: a */
    public static C7234d0 m18903a(InterfaceC12341a<LoyaltyCardService> interfaceC12341a, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a2, InterfaceC12341a<PrefsManager> interfaceC12341a3, InterfaceC12341a<C8223b> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a6) {
        return new C7234d0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6);
    }

    /* renamed from: c */
    public static LoyaltyCardManager m18901c(LoyaltyCardService loyaltyCardService, LoyaltyCardAgent loyaltyCardAgent, PrefsManager prefsManager, C8223b c8223b, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        return new LoyaltyCardManager(loyaltyCardService, loyaltyCardAgent, prefsManager, c8223b, userProfileAgent, clubsCodesAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public LoyaltyCardManager mo42226get() {
        return m18901c(this.f19116a.mo42226get(), this.f19117b.mo42226get(), this.f19118c.mo42226get(), this.f19119d.mo42226get(), this.f19120e.mo42226get(), this.f19121f.mo42226get());
    }
}
