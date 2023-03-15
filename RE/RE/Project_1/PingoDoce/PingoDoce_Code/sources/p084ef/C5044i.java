package p084ef;

import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p338rf.HttpLoggingInterceptor;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: ef.i */
/* loaded from: classes2.dex */
public final class C5044i implements InterfaceC11614c<OkHttpClient> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient.C5510a> f13995a;

    /* renamed from: b */
    private final InterfaceC12341a<HttpLoggingInterceptor> f13996b;

    /* renamed from: c */
    private final InterfaceC12341a<InterfaceC5503w> f13997c;

    public C5044i(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a2, InterfaceC12341a<InterfaceC5503w> interfaceC12341a3) {
        this.f13995a = interfaceC12341a;
        this.f13996b = interfaceC12341a2;
        this.f13997c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5044i m25824a(InterfaceC12341a<OkHttpClient.C5510a> interfaceC12341a, InterfaceC12341a<HttpLoggingInterceptor> interfaceC12341a2, InterfaceC12341a<InterfaceC5503w> interfaceC12341a3) {
        return new C5044i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OkHttpClient m25822c(OkHttpClient.C5510a c5510a, HttpLoggingInterceptor httpLoggingInterceptor, InterfaceC5503w interfaceC5503w) {
        return (OkHttpClient) C11617f.m4587d(NetworkProviders.f13977a.m25854h(c5510a, httpLoggingInterceptor, interfaceC5503w));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OkHttpClient mo42226get() {
        return m25822c(this.f13995a.mo42226get(), this.f13996b.mo42226get(), this.f13997c.mo42226get());
    }
}
