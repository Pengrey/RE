package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.h0 */
/* loaded from: classes2.dex */
public final class C11290h0 implements InterfaceC11614c<StoreService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28937a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28938b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28939c;

    public C11290h0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28937a = interfaceC12341a;
        this.f28938b = interfaceC12341a2;
        this.f28939c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11290h0 m5519a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11290h0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static StoreService m5517c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new StoreService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public StoreService mo42226get() {
        StoreService m5517c = m5517c(this.f28937a.mo42226get(), this.f28938b.mo42226get());
        C11278f.m5547a(m5517c, this.f28939c.mo42226get());
        return m5517c;
    }
}
