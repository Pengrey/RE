package uk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.EmailManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: uk.d */
/* loaded from: classes2.dex */
public final class C10961d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f28254a;

    /* renamed from: b */
    private final InterfaceC12341a<EmailManager> f28255b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f28256c;

    /* renamed from: d */
    private final InterfaceC12341a<C7296j0> f28257d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f28258e;

    public C10961d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<EmailManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f28254a = interfaceC12341a;
        this.f28255b = interfaceC12341a2;
        this.f28256c = interfaceC12341a3;
        this.f28257d = interfaceC12341a4;
        this.f28258e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C10961d m6718a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<EmailManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C10961d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static OnboardingEmailViewModel m6716c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, EmailManager emailManager, AnalyticsManager analyticsManager, C7296j0 c7296j0) {
        return new OnboardingEmailViewModel(c1459l0, resourcesProvider, emailManager, analyticsManager, c7296j0);
    }

    /* renamed from: b */
    public OnboardingEmailViewModel m6717b(C1459l0 c1459l0) {
        OnboardingEmailViewModel m6716c = m6716c(c1459l0, this.f28254a.mo42226get(), this.f28255b.mo42226get(), this.f28256c.mo42226get(), this.f28257d.mo42226get());
        C13886p.m94a(m6716c, this.f28258e.mo42226get());
        return m6716c;
    }
}
