package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.j0 */
/* loaded from: classes2.dex */
public final class C11305j0 implements InterfaceC11614c<TakeAwayService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28985a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28986b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28987c;

    public C11305j0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28985a = interfaceC12341a;
        this.f28986b = interfaceC12341a2;
        this.f28987c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11305j0 m5486a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11305j0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TakeAwayService m5484c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new TakeAwayService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public TakeAwayService mo42226get() {
        TakeAwayService m5484c = m5484c(this.f28985a.mo42226get(), this.f28986b.mo42226get());
        C11278f.m5547a(m5484c, this.f28987c.mo42226get());
        return m5484c;
    }
}
