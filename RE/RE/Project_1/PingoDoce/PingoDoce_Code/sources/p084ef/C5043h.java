package p084ef;

import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p338rf.HttpLoggingInterceptor;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import se.OAuthSharedPrefs;

/* renamed from: ef.h */
/* loaded from: classes2.dex */
public final class C5043h implements InterfaceC11614c<OkHttpClient> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient.C5510a> f13991a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthSharedPrefs> f13992b;

    /* renamed from: c */
    private final InterfaceC12341a<HttpLoggingInterceptor> f13993c;

    /* renamed from: d */
    private final InterfaceC12341a<InterfaceC5503w> f13994d;

    public C5043h(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a3, InterfaceC12341a<InterfaceC5503w> interfaceC12341a4) {
        this.f13991a = interfaceC12341a;
        this.f13992b = interfaceC12341a2;
        this.f13993c = interfaceC12341a3;
        this.f13994d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5043h m25827a(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a2, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a3, InterfaceC12341a<InterfaceC5503w> interfaceC12341a4) {
        return new C5043h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static OkHttpClient m25825c(OkHttpClient.C5510a c5510a, OAuthSharedPrefs oAuthSharedPrefs, HttpLoggingInterceptor httpLoggingInterceptor, InterfaceC5503w interfaceC5503w) {
        return (OkHttpClient) C11617f.m4587d(NetworkProviders.f13977a.m25855g(c5510a, oAuthSharedPrefs, httpLoggingInterceptor, interfaceC5503w));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OkHttpClient mo42226get() {
        return m25825c(this.f13991a.mo42226get(), this.f13992b.mo42226get(), this.f13993c.mo42226get(), this.f13994d.mo42226get());
    }
}
