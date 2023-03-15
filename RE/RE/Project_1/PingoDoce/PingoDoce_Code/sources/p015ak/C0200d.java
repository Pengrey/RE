package p015ak;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ak.d */
/* loaded from: classes2.dex */
public final class C0200d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f441a;

    /* renamed from: b */
    private final InterfaceC12341a<C7296j0> f442b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f443c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f444d;

    public C0200d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f441a = interfaceC12341a;
        this.f442b = interfaceC12341a2;
        this.f443c = interfaceC12341a3;
        this.f444d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C0200d m41594a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C0200d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static CardRegistrationViewModel m41592c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7296j0 c7296j0, AnalyticsManager analyticsManager) {
        return new CardRegistrationViewModel(c1459l0, resourcesProvider, c7296j0, analyticsManager);
    }

    /* renamed from: b */
    public CardRegistrationViewModel m41593b(C1459l0 c1459l0) {
        CardRegistrationViewModel m41592c = m41592c(c1459l0, this.f441a.mo42226get(), this.f442b.mo42226get(), this.f443c.mo42226get());
        C13886p.m94a(m41592c, this.f444d.mo42226get());
        return m41592c;
    }
}
