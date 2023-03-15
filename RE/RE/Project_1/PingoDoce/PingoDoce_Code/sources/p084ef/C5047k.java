package p084ef;

import p107ff.OkHttpClient;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: ef.k */
/* loaded from: classes2.dex */
public final class C5047k implements InterfaceC11614c<Retrofit> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient> f13999a;

    /* renamed from: b */
    private final InterfaceC12341a<String> f14000b;

    public C5047k(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        this.f13999a = interfaceC12341a;
        this.f14000b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5047k m25817a(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        return new C5047k(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static Retrofit m25815c(OkHttpClient okHttpClient, String str) {
        return (Retrofit) C11617f.m4587d(NetworkProviders.f13977a.m25852j(okHttpClient, str));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public Retrofit mo42226get() {
        return m25815c(this.f13999a.mo42226get(), this.f14000b.mo42226get());
    }
}
