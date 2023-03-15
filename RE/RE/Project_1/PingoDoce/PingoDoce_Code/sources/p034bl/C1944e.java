package p034bl;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeViewModel;

/* renamed from: bl.e */
/* loaded from: classes2.dex */
public final class C1944e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f5732a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f5733b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f5734c;

    public C1944e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f5732a = interfaceC12341a;
        this.f5733b = interfaceC12341a2;
        this.f5734c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C1944e m35082a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C1944e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingResumeViewModel m35080c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new OnboardingResumeViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingResumeViewModel m35081b(C1459l0 c1459l0) {
        OnboardingResumeViewModel m35080c = m35080c(c1459l0, this.f5732a.mo42226get(), this.f5733b.mo42226get());
        C13886p.m94a(m35080c, this.f5734c.mo42226get());
        return m35080c;
    }
}
