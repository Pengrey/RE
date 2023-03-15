package mg;

import java.text.SimpleDateFormat;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.ShoppingListService;

/* renamed from: mg.g1 */
/* loaded from: classes2.dex */
public final class C7281g1 implements InterfaceC11614c<C7256f1> {

    /* renamed from: a */
    private final InterfaceC12341a<ShoppingListService> f19278a;

    /* renamed from: b */
    private final InterfaceC12341a<PrefsManager> f19279b;

    /* renamed from: c */
    private final InterfaceC12341a<EncryptedPrefsManager> f19280c;

    /* renamed from: d */
    private final InterfaceC12341a<LoyaltyCardAgent> f19281d;

    /* renamed from: e */
    private final InterfaceC12341a<UserProfileAgent> f19282e;

    /* renamed from: f */
    private final InterfaceC12341a<SimpleDateFormat> f19283f;

    public C7281g1(InterfaceC12341a<ShoppingListService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5, InterfaceC12341a<SimpleDateFormat> interfaceC12341a6) {
        this.f19278a = interfaceC12341a;
        this.f19279b = interfaceC12341a2;
        this.f19280c = interfaceC12341a3;
        this.f19281d = interfaceC12341a4;
        this.f19282e = interfaceC12341a5;
        this.f19283f = interfaceC12341a6;
    }

    /* renamed from: a */
    public static C7281g1 m18803a(InterfaceC12341a<ShoppingListService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5, InterfaceC12341a<SimpleDateFormat> interfaceC12341a6) {
        return new C7281g1(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6);
    }

    /* renamed from: c */
    public static C7256f1 m18801c(ShoppingListService shoppingListService, PrefsManager prefsManager, EncryptedPrefsManager encryptedPrefsManager, LoyaltyCardAgent loyaltyCardAgent, UserProfileAgent userProfileAgent, SimpleDateFormat simpleDateFormat) {
        return new C7256f1(shoppingListService, prefsManager, encryptedPrefsManager, loyaltyCardAgent, userProfileAgent, simpleDateFormat);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C7256f1 mo42226get() {
        return m18801c(this.f19278a.mo42226get(), this.f19279b.mo42226get(), this.f19280c.mo42226get(), this.f19281d.mo42226get(), this.f19282e.mo42226get(), this.f19283f.mo42226get());
    }
}
