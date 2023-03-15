package mg;

import p066dg.CoachmarksAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.r */
/* loaded from: classes2.dex */
public final class C7397r implements InterfaceC11614c<CoachMarkManager> {

    /* renamed from: a */
    private final InterfaceC12341a<CoachmarksAgent> f19623a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardAgent> f19624b;

    /* renamed from: c */
    private final InterfaceC12341a<UserProfileAgent> f19625c;

    public C7397r(InterfaceC12341a<CoachmarksAgent> interfaceC12341a, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3) {
        this.f19623a = interfaceC12341a;
        this.f19624b = interfaceC12341a2;
        this.f19625c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C7397r m18579a(InterfaceC12341a<CoachmarksAgent> interfaceC12341a, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3) {
        return new C7397r(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static CoachMarkManager m18577c(CoachmarksAgent coachmarksAgent, LoyaltyCardAgent loyaltyCardAgent, UserProfileAgent userProfileAgent) {
        return new CoachMarkManager(coachmarksAgent, loyaltyCardAgent, userProfileAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public CoachMarkManager mo42226get() {
        return m18577c(this.f19623a.mo42226get(), this.f19624b.mo42226get(), this.f19625c.mo42226get());
    }
}
