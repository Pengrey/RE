package p110fl;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: fl.d */
/* loaded from: classes2.dex */
public final class C5575d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15761a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f15762b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f15763c;

    public C5575d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f15761a = interfaceC12341a;
        this.f15762b = interfaceC12341a2;
        this.f15763c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5575d m23724a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C5575d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static UserDataUpdateViewModel m23722c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new UserDataUpdateViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public UserDataUpdateViewModel m23723b(C1459l0 c1459l0) {
        UserDataUpdateViewModel m23722c = m23722c(c1459l0, this.f15761a.mo42226get(), this.f15762b.mo42226get());
        C13886p.m94a(m23722c, this.f15763c.mo42226get());
        return m23722c;
    }
}
