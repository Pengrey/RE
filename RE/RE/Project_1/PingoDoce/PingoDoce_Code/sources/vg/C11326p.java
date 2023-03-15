package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.p */
/* loaded from: classes2.dex */
public final class C11326p implements InterfaceC11614c<EmailService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29045a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29046b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29047c;

    public C11326p(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29045a = interfaceC12341a;
        this.f29046b = interfaceC12341a2;
        this.f29047c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11326p m5432a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11326p(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static EmailService m5430c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new EmailService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public EmailService mo42226get() {
        EmailService m5430c = m5430c(this.f29045a.mo42226get(), this.f29046b.mo42226get());
        C11278f.m5547a(m5430c, this.f29047c.mo42226get());
        return m5430c;
    }
}
