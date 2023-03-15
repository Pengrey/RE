package cf;

import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: cf.b */
/* loaded from: classes2.dex */
public final class C2127b implements InterfaceC11614c<OAuthService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f6160a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f6161b;

    public C2127b(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2) {
        this.f6160a = interfaceC12341a;
        this.f6161b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C2127b m34608a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2) {
        return new C2127b(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static OAuthService m34606c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new OAuthService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OAuthService mo42226get() {
        return m34606c(this.f6160a.mo42226get(), this.f6161b.mo42226get());
    }
}
