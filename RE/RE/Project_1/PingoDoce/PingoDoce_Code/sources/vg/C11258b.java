package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.b */
/* loaded from: classes2.dex */
public final class C11258b implements InterfaceC11614c<AuthService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28842a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28843b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28844c;

    public C11258b(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28842a = interfaceC12341a;
        this.f28843b = interfaceC12341a2;
        this.f28844c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11258b m5599a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11258b(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static AuthService m5597c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new AuthService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AuthService mo42226get() {
        AuthService m5597c = m5597c(this.f28842a.mo42226get(), this.f28843b.mo42226get());
        C11278f.m5547a(m5597c, this.f28844c.mo42226get());
        return m5597c;
    }
}
