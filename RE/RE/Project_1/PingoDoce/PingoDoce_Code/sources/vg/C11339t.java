package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.t */
/* loaded from: classes2.dex */
public final class C11339t implements InterfaceC11614c<NifService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29081a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29082b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29083c;

    public C11339t(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29081a = interfaceC12341a;
        this.f29082b = interfaceC12341a2;
        this.f29083c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11339t m5400a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11339t(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static NifService m5398c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new NifService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public NifService mo42226get() {
        NifService m5398c = m5398c(this.f29081a.mo42226get(), this.f29082b.mo42226get());
        C11278f.m5547a(m5398c, this.f29083c.mo42226get());
        return m5398c;
    }
}
