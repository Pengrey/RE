package mg;

import p370te.OAuthManager;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.PhoneService;

/* renamed from: mg.o0 */
/* loaded from: classes2.dex */
public final class C7372o0 implements InterfaceC11614c<PhoneManager> {

    /* renamed from: a */
    private final InterfaceC12341a<PhoneService> f19578a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthManager> f19579b;

    public C7372o0(InterfaceC12341a<PhoneService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2) {
        this.f19578a = interfaceC12341a;
        this.f19579b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7372o0 m18633a(InterfaceC12341a<PhoneService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2) {
        return new C7372o0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static PhoneManager m18631c(PhoneService phoneService, OAuthManager oAuthManager) {
        return new PhoneManager(phoneService, oAuthManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PhoneManager mo42226get() {
        return m18631c(this.f19578a.mo42226get(), this.f19579b.mo42226get());
    }
}
