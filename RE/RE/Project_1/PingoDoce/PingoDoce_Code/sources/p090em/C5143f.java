package p090em;

import androidx.lifecycle.C1459l0;
import mg.C7310l;
import mg.C7405s1;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: em.f */
/* loaded from: classes2.dex */
public final class C5143f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f14223a;

    /* renamed from: b */
    private final InterfaceC12341a<StoreManager> f14224b;

    /* renamed from: c */
    private final InterfaceC12341a<C7310l> f14225c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f14226d;

    public C5143f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f14223a = interfaceC12341a;
        this.f14224b = interfaceC12341a2;
        this.f14225c = interfaceC12341a3;
        this.f14226d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5143f m25565a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<StoreManager> interfaceC12341a2, InterfaceC12341a<C7310l> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C5143f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static PushNotificationDispatcherViewModel m25563c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, StoreManager storeManager, C7310l c7310l) {
        return new PushNotificationDispatcherViewModel(c1459l0, resourcesProvider, storeManager, c7310l);
    }

    /* renamed from: b */
    public PushNotificationDispatcherViewModel m25564b(C1459l0 c1459l0) {
        PushNotificationDispatcherViewModel m25563c = m25563c(c1459l0, this.f14223a.mo42226get(), this.f14224b.mo42226get(), this.f14225c.mo42226get());
        C13886p.m94a(m25563c, this.f14226d.mo42226get());
        return m25563c;
    }
}
