package p084ef;

import p107ff.OkHttpClient;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: ef.m */
/* loaded from: classes2.dex */
public final class C5049m implements InterfaceC11614c<Retrofit> {

    /* renamed from: a */
    private final InterfaceC12341a<OkHttpClient> f14003a;

    /* renamed from: b */
    private final InterfaceC12341a<String> f14004b;

    public C5049m(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        this.f14003a = interfaceC12341a;
        this.f14004b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5049m m25811a(InterfaceC12341a<OkHttpClient> interfaceC12341a, InterfaceC12341a<String> interfaceC12341a2) {
        return new C5049m(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static Retrofit m25809c(OkHttpClient okHttpClient, String str) {
        return (Retrofit) C11617f.m4587d(NetworkProviders.f13977a.m25850l(okHttpClient, str));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public Retrofit mo42226get() {
        return m25809c(this.f14003a.mo42226get(), this.f14004b.mo42226get());
    }
}
