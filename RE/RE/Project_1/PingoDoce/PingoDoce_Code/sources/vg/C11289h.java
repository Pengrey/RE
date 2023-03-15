package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.h */
/* loaded from: classes2.dex */
public final class C11289h implements InterfaceC11614c<CatalogService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28934a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28935b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28936c;

    public C11289h(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28934a = interfaceC12341a;
        this.f28935b = interfaceC12341a2;
        this.f28936c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11289h m5522a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11289h(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static CatalogService m5520c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new CatalogService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public CatalogService mo42226get() {
        CatalogService m5520c = m5520c(this.f28934a.mo42226get(), this.f28935b.mo42226get());
        C11278f.m5547a(m5520c, this.f28936c.mo42226get());
        return m5520c;
    }
}
