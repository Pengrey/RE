package p408vk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.EmailManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: vk.g */
/* loaded from: classes2.dex */
public final class C11395g {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f29241a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f29242b;

    /* renamed from: c */
    private final InterfaceC12341a<EmailManager> f29243c;

    /* renamed from: d */
    private final InterfaceC12341a<C7296j0> f29244d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f29245e;

    public C11395g(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<EmailManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f29241a = interfaceC12341a;
        this.f29242b = interfaceC12341a2;
        this.f29243c = interfaceC12341a3;
        this.f29244d = interfaceC12341a4;
        this.f29245e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C11395g m5245a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<EmailManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C11395g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static OnboardingEmailSentViewModel m5243c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, EmailManager emailManager, C7296j0 c7296j0) {
        return new OnboardingEmailSentViewModel(c1459l0, resourcesProvider, analyticsManager, emailManager, c7296j0);
    }

    /* renamed from: b */
    public OnboardingEmailSentViewModel m5244b(C1459l0 c1459l0) {
        OnboardingEmailSentViewModel m5243c = m5243c(c1459l0, this.f29241a.mo42226get(), this.f29242b.mo42226get(), this.f29243c.mo42226get(), this.f29244d.mo42226get());
        C13886p.m94a(m5243c, this.f29245e.mo42226get());
        return m5243c;
    }
}
