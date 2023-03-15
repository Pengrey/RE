package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.r */
/* loaded from: classes2.dex */
public final class C11337r implements InterfaceC11614c<LoyaltyCardService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29074a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29075b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29076c;

    public C11337r(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29074a = interfaceC12341a;
        this.f29075b = interfaceC12341a2;
        this.f29076c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11337r m5407a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11337r(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static LoyaltyCardService m5405c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new LoyaltyCardService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public LoyaltyCardService mo42226get() {
        LoyaltyCardService m5405c = m5405c(this.f29074a.mo42226get(), this.f29075b.mo42226get());
        C11278f.m5547a(m5405c, this.f29076c.mo42226get());
        return m5405c;
    }
}
