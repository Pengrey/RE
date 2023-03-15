package p370te;

import cf.OAuthService;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import se.OAuthSharedPrefs;

/* renamed from: te.b */
/* loaded from: classes2.dex */
public final class C10605b implements InterfaceC11614c<OAuthManager> {

    /* renamed from: a */
    private final InterfaceC12341a<OAuthService> f27323a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthSharedPrefs> f27324b;

    public C10605b(InterfaceC12341a<OAuthService> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2) {
        this.f27323a = interfaceC12341a;
        this.f27324b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C10605b m7571a(InterfaceC12341a<OAuthService> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2) {
        return new C10605b(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static OAuthManager m7569c(OAuthService oAuthService, OAuthSharedPrefs oAuthSharedPrefs) {
        return new OAuthManager(oAuthService, oAuthSharedPrefs);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OAuthManager mo42226get() {
        return m7569c(this.f27323a.mo42226get(), this.f27324b.mo42226get());
    }
}
