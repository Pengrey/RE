package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.f0 */
/* loaded from: classes2.dex */
public final class C11279f0 implements InterfaceC11614c<SmsService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28905a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28906b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28907c;

    public C11279f0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28905a = interfaceC12341a;
        this.f28906b = interfaceC12341a2;
        this.f28907c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11279f0 m5546a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11279f0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static SmsService m5544c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new SmsService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SmsService mo42226get() {
        SmsService m5544c = m5544c(this.f28905a.mo42226get(), this.f28906b.mo42226get());
        C11278f.m5547a(m5544c, this.f28907c.mo42226get());
        return m5544c;
    }
}
