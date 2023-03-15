package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.b0 */
/* loaded from: classes2.dex */
public final class C11259b0 implements InterfaceC11614c<PurchaseService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28845a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28846b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28847c;

    public C11259b0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28845a = interfaceC12341a;
        this.f28846b = interfaceC12341a2;
        this.f28847c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11259b0 m5596a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11259b0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static PurchaseService m5594c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new PurchaseService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PurchaseService mo42226get() {
        PurchaseService m5594c = m5594c(this.f28845a.mo42226get(), this.f28846b.mo42226get());
        C11278f.m5547a(m5594c, this.f28847c.mo42226get());
        return m5594c;
    }
}
