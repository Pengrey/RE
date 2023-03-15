package vg;

import mg.AnalyticsManager;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import retrofit2.Retrofit;

/* renamed from: vg.d0 */
/* loaded from: classes2.dex */
public final class C11274d0 implements InterfaceC11614c<ShoppingListService> {

    /* renamed from: a */
    private final InterfaceC12341a<Retrofit> f28891a;

    /* renamed from: b */
    private final InterfaceC12341a<ResourcesProvider> f28892b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28893c;

    public C11274d0(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        this.f28891a = interfaceC12341a;
        this.f28892b = interfaceC12341a2;
        this.f28893c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C11274d0 m5561a(InterfaceC12341a<Retrofit> interfaceC12341a, InterfaceC12341a<ResourcesProvider> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3) {
        return new C11274d0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static ShoppingListService m5559c(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        return new ShoppingListService(retrofit, resourcesProvider);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ShoppingListService mo42226get() {
        ShoppingListService m5559c = m5559c(this.f28891a.mo42226get(), this.f28892b.mo42226get());
        C11278f.m5547a(m5559c, this.f28893c.mo42226get());
        return m5559c;
    }
}
