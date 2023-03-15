package p089el;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: el.d */
/* loaded from: classes2.dex */
public final class C5133d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f14193a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f14194b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f14195c;

    public C5133d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f14193a = interfaceC12341a;
        this.f14194b = interfaceC12341a2;
        this.f14195c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5133d m25585a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C5133d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static UserDataInsertViewModel m25583c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new UserDataInsertViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public UserDataInsertViewModel m25584b(C1459l0 c1459l0) {
        UserDataInsertViewModel m25583c = m25583c(c1459l0, this.f14193a.mo42226get(), this.f14194b.mo42226get());
        C13886p.m94a(m25583c, this.f14195c.mo42226get());
        return m25583c;
    }
}
