package mg;

import gg.C5682w;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.UserService;

/* renamed from: mg.t1 */
/* loaded from: classes2.dex */
public final class C7424t1 implements InterfaceC11614c<C7405s1> {

    /* renamed from: a */
    private final InterfaceC12341a<UserService> f19700a;

    /* renamed from: b */
    private final InterfaceC12341a<PrefsManager> f19701b;

    /* renamed from: c */
    private final InterfaceC12341a<UserProfileAgent> f19702c;

    /* renamed from: d */
    private final InterfaceC12341a<C5682w> f19703d;

    public C7424t1(InterfaceC12341a<UserService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<C5682w> interfaceC12341a4) {
        this.f19700a = interfaceC12341a;
        this.f19701b = interfaceC12341a2;
        this.f19702c = interfaceC12341a3;
        this.f19703d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7424t1 m18466a(InterfaceC12341a<UserService> interfaceC12341a, InterfaceC12341a<PrefsManager> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<C5682w> interfaceC12341a4) {
        return new C7424t1(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static C7405s1 m18464c(UserService userService, PrefsManager prefsManager, UserProfileAgent userProfileAgent, C5682w c5682w) {
        return new C7405s1(userService, prefsManager, userProfileAgent, c5682w);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C7405s1 mo42226get() {
        return m18464c(this.f19700a.mo42226get(), this.f19701b.mo42226get(), this.f19702c.mo42226get(), this.f19703d.mo42226get());
    }
}
