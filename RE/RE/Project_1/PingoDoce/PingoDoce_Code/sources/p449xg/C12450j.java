package p449xg;

import p107ff.InterfaceC5503w;
import p108fg.AppInterceptorDataProvider;
import p370te.OAuthManager;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.j */
/* loaded from: classes2.dex */
public final class C12450j implements InterfaceC11614c<InterfaceC5503w> {

    /* renamed from: a */
    private final InterfaceC12341a<OAuthManager> f32554a;

    /* renamed from: b */
    private final InterfaceC12341a<AppInterceptorDataProvider> f32555b;

    public C12450j(InterfaceC12341a<OAuthManager> interfaceC12341a, InterfaceC12341a<AppInterceptorDataProvider> interfaceC12341a2) {
        this.f32554a = interfaceC12341a;
        this.f32555b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12450j m2936a(InterfaceC12341a<OAuthManager> interfaceC12341a, InterfaceC12341a<AppInterceptorDataProvider> interfaceC12341a2) {
        return new C12450j(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static InterfaceC5503w m2934c(OAuthManager oAuthManager, AppInterceptorDataProvider appInterceptorDataProvider) {
        return (InterfaceC5503w) C11617f.m4587d(AppProviders.f32545a.m2974h(oAuthManager, appInterceptorDataProvider));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public InterfaceC5503w mo42226get() {
        return m2934c(this.f32554a.mo42226get(), this.f32555b.mo42226get());
    }
}
