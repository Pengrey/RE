package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.n */
/* loaded from: classes2.dex */
public final class C11321n implements InterfaceC11614c<DeviceService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29030a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29031b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29032c;

    public C11321n(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29030a = interfaceC12341a;
        this.f29031b = interfaceC12341a2;
        this.f29032c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11321n m5445a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11321n(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static DeviceService m5443c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new DeviceService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public DeviceService mo42226get() {
        DeviceService m5443c = m5443c(this.f29030a.mo42226get(), this.f29031b.mo42226get());
        C11278f.m5547a(m5443c, this.f29032c.mo42226get());
        return m5443c;
    }
}
