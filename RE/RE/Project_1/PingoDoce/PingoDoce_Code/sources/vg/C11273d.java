package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.d */
/* loaded from: classes2.dex */
public final class C11273d implements InterfaceC11614c<BannerService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28888a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28889b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28890c;

    public C11273d(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28888a = interfaceC12341a;
        this.f28889b = interfaceC12341a2;
        this.f28890c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11273d m5564a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11273d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static BannerService m5562c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new BannerService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public BannerService mo42226get() {
        BannerService m5562c = m5562c(this.f28888a.mo42226get(), this.f28889b.mo42226get());
        C11278f.m5547a(m5562c, this.f28890c.mo42226get());
        return m5562c;
    }
}
