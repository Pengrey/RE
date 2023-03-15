package mg;

import p066dg.UserProfileAgent;
import p370te.OAuthManager;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.SmsService;

/* renamed from: mg.i1 */
/* loaded from: classes2.dex */
public final class C7295i1 implements InterfaceC11614c<SmsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<SmsService> f19321a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthManager> f19322b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f19323c;

    /* renamed from: d */
    private final InterfaceC12341a<UserProfileAgent> f19324d;

    public C7295i1(InterfaceC12341a<SmsService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<UserProfileAgent> interfaceC12341a4) {
        this.f19321a = interfaceC12341a;
        this.f19322b = interfaceC12341a2;
        this.f19323c = interfaceC12341a3;
        this.f19324d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7295i1 m18778a(InterfaceC12341a<SmsService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<UserProfileAgent> interfaceC12341a4) {
        return new C7295i1(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static SmsManager m18776c(SmsService smsService, OAuthManager oAuthManager, LoyaltyCardManager loyaltyCardManager, UserProfileAgent userProfileAgent) {
        return new SmsManager(smsService, oAuthManager, loyaltyCardManager, userProfileAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SmsManager mo42226get() {
        return m18776c(this.f19321a.mo42226get(), this.f19322b.mo42226get(), this.f19323c.mo42226get(), this.f19324d.mo42226get());
    }
}
