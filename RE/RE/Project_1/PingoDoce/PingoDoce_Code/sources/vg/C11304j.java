package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.j */
/* loaded from: classes2.dex */
public final class C11304j implements InterfaceC11614c<ClubService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28982a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28983b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28984c;

    public C11304j(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28982a = interfaceC12341a;
        this.f28983b = interfaceC12341a2;
        this.f28984c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11304j m5489a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11304j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ClubService m5487c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new ClubService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ClubService mo42226get() {
        ClubService m5487c = m5487c(this.f28982a.mo42226get(), this.f28983b.mo42226get());
        C11278f.m5547a(m5487c, this.f28984c.mo42226get());
        return m5487c;
    }
}
