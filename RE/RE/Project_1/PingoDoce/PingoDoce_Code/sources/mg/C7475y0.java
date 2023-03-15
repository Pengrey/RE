package mg;

import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.y0 */
/* loaded from: classes2.dex */
public final class C7475y0 implements InterfaceC11614c<PushNotificationsManager> {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19762a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f19763b;

    public C7475y0(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2) {
        this.f19762a = interfaceC12341a;
        this.f19763b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C7475y0 m18412a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2) {
        return new C7475y0(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static PushNotificationsManager m18410c(ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new PushNotificationsManager(resourcesProvider, analyticsManager);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public PushNotificationsManager mo42226get() {
        return m18410c(this.f19762a.mo42226get(), this.f19763b.mo42226get());
    }
}
