package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.l0 */
/* loaded from: classes2.dex */
public final class C11319l0 implements InterfaceC11614c<UserService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f29023a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f29024b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f29025c;

    public C11319l0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f29023a = interfaceC12341a;
        this.f29024b = interfaceC12341a2;
        this.f29025c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11319l0 m5452a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11319l0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static UserService m5450c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new UserService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public UserService mo42226get() {
        UserService m5450c = m5450c(this.f29023a.mo42226get(), this.f29024b.mo42226get());
        C11278f.m5547a(m5450c, this.f29025c.mo42226get());
        return m5450c;
    }
}
