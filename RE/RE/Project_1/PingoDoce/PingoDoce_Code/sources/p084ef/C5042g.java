package p084ef;

import p107ff.CertificatePinner;
import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p338rf.HttpLoggingInterceptor;
import p370te.OAuthManager;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import se.OAuthSharedPrefs;

/* renamed from: ef.g */
/* loaded from: classes2.dex */
public final class C5042g implements InterfaceC11614c<OkHttpClient> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient.C5510a> f13984a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthSharedPrefs> f13985b;

    /* renamed from: c */
    private final InterfaceC12341a<OAuthManager> f13986c;

    /* renamed from: d */
    private final InterfaceC12341a<HttpLoggingInterceptor> f13987d;

    /* renamed from: e */
    private final InterfaceC12341a<CertificatePinner> f13988e;

    /* renamed from: f */
    private final InterfaceC12341a<InterfaceC5503w> f13989f;

    /* renamed from: g */
    private final InterfaceC12341a<InterfaceC5503w> f13990g;

    public C5042g(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2, InterfaceC12341a<OAuthManager> interfaceC12341a3, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a4, InterfaceC12341a<CertificatePinner> interfaceC12341a5, InterfaceC12341a<InterfaceC5503w> interfaceC12341a6, InterfaceC12341a<InterfaceC5503w> interfaceC12341a7) {
        this.f13984a = interfaceC12341a;
        this.f13985b = interfaceC12341a2;
        this.f13986c = interfaceC12341a3;
        this.f13987d = interfaceC12341a4;
        this.f13988e = interfaceC12341a5;
        this.f13989f = interfaceC12341a6;
        this.f13990g = interfaceC12341a7;
    }

    /* renamed from: a */
    public static C5042g m25830a(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2, InterfaceC12341a<OAuthManager> interfaceC12341a3, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a4, InterfaceC12341a<CertificatePinner> interfaceC12341a5, InterfaceC12341a<InterfaceC5503w> interfaceC12341a6, InterfaceC12341a<InterfaceC5503w> interfaceC12341a7) {
        return new C5042g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7);
    }

    /* renamed from: c */
    public static OkHttpClient m25828c(OkHttpClient.C5510a c5510a, OAuthSharedPrefs oAuthSharedPrefs, OAuthManager oAuthManager, HttpLoggingInterceptor httpLoggingInterceptor, CertificatePinner certificatePinner, InterfaceC5503w interfaceC5503w, InterfaceC5503w interfaceC5503w2) {
        return (OkHttpClient) C11617f.m4587d(NetworkProviders.f13977a.m25856f(c5510a, oAuthSharedPrefs, oAuthManager, httpLoggingInterceptor, certificatePinner, interfaceC5503w, interfaceC5503w2));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OkHttpClient mo42226get() {
        return m25828c(this.f13984a.mo42226get(), this.f13985b.mo42226get(), this.f13986c.mo42226get(), this.f13987d.mo42226get(), this.f13988e.mo42226get(), this.f13989f.mo42226get(), this.f13990g.mo42226get());
    }
}
