package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.l */
/* loaded from: classes2.dex */
public final class C11318l implements InterfaceC11614c<ConsentsService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29020a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29021b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29022c;

    public C11318l(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29020a = interfaceC12341a;
        this.f29021b = interfaceC12341a2;
        this.f29022c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11318l m5455a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11318l(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ConsentsService m5453c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new ConsentsService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ConsentsService mo42226get() {
        ConsentsService m5453c = m5453c(this.f29020a.mo42226get(), this.f29021b.mo42226get());
        C11278f.m5547a(m5453c, this.f29022c.mo42226get());
        return m5453c;
    }
}
