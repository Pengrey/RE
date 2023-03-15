package p084ef;

import p107ff.OkHttpClient;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: ef.l */
/* loaded from: classes2.dex */
public final class C5048l implements InterfaceC11614c<Retrofit> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient> f14001a;

    /* renamed from: b */
    private final InterfaceC12341a<String> f14002b;

    public C5048l(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        this.f14001a = interfaceC12341a;
        this.f14002b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5048l m25814a(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        return new C5048l(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static Retrofit m25812c(OkHttpClient okHttpClient, String str) {
        return (Retrofit) C11617f.m4587d(NetworkProviders.f13977a.m25851k(okHttpClient, str));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public Retrofit mo42226get() {
        return m25812c(this.f14001a.mo42226get(), this.f14002b.mo42226get());
    }
}
