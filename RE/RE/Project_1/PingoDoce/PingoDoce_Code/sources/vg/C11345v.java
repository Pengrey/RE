package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.v */
/* loaded from: classes2.dex */
public final class C11345v implements InterfaceC11614c<OnboardingService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29099a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29100b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29101c;

    public C11345v(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29099a = interfaceC12341a;
        this.f29100b = interfaceC12341a2;
        this.f29101c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11345v m5385a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11345v(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingService m5383c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new OnboardingService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public OnboardingService mo42226get() {
        OnboardingService m5383c = m5383c(this.f29099a.mo42226get(), this.f29100b.mo42226get());
        C11278f.m5547a(m5383c, this.f29101c.mo42226get());
        return m5383c;
    }
}
