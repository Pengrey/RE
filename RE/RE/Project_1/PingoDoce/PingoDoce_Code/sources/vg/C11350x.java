package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.x */
/* loaded from: classes2.dex */
public final class C11350x implements InterfaceC11614c<PhoneService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29117a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29118b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29119c;

    public C11350x(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29117a = interfaceC12341a;
        this.f29118b = interfaceC12341a2;
        this.f29119c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11350x m5372a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11350x(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static PhoneService m5370c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new PhoneService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PhoneService mo42226get() {
        PhoneService m5370c = m5370c(this.f29117a.mo42226get(), this.f29118b.mo42226get());
        C11278f.m5547a(m5370c, this.f29119c.mo42226get());
        return m5370c;
    }
}
