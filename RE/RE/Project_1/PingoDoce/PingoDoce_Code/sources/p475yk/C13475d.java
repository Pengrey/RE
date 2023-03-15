package p475yk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.EmailManager;
import mg.NifManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: yk.d */
/* loaded from: classes2.dex */
public final class C13475d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f34268a;

    /* renamed from: b */
    private final InterfaceC12341a<NifManager> f34269b;

    /* renamed from: c */
    private final InterfaceC12341a<C7296j0> f34270c;

    /* renamed from: d */
    private final InterfaceC12341a<EmailManager> f34271d;

    /* renamed from: e */
    private final InterfaceC12341a<AnalyticsManager> f34272e;

    /* renamed from: f */
    private final InterfaceC12341a<C7405s1> f34273f;

    public C13475d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<NifManager> interfaceC12341a2, InterfaceC12341a<C7296j0> interfaceC12341a3, InterfaceC12341a<EmailManager> interfaceC12341a4, InterfaceC12341a<AnalyticsManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        this.f34268a = interfaceC12341a;
        this.f34269b = interfaceC12341a2;
        this.f34270c = interfaceC12341a3;
        this.f34271d = interfaceC12341a4;
        this.f34272e = interfaceC12341a5;
        this.f34273f = interfaceC12341a6;
    }

    /* renamed from: a */
    public static C13475d m1311a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<NifManager> interfaceC12341a2, InterfaceC12341a<C7296j0> interfaceC12341a3, InterfaceC12341a<EmailManager> interfaceC12341a4, InterfaceC12341a<AnalyticsManager> interfaceC12341a5, InterfaceC12341a<C7405s1> interfaceC12341a6) {
        return new C13475d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6);
    }

    /* renamed from: c */
    public static OnboardingNifViewModel m1309c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, NifManager nifManager, C7296j0 c7296j0, EmailManager emailManager, AnalyticsManager analyticsManager) {
        return new OnboardingNifViewModel(c1459l0, resourcesProvider, nifManager, c7296j0, emailManager, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingNifViewModel m1310b(C1459l0 c1459l0) {
        OnboardingNifViewModel m1309c = m1309c(c1459l0, this.f34268a.mo42226get(), this.f34269b.mo42226get(), this.f34270c.mo42226get(), this.f34271d.mo42226get(), this.f34272e.mo42226get());
        C13886p.m94a(m1309c, this.f34273f.mo42226get());
        return m1309c;
    }
}
