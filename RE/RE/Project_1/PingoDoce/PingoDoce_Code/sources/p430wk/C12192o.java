package p430wk;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wk.o */
/* loaded from: classes2.dex */
public final class C12192o {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32177a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f32178b;

    public C12192o(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f32177a = interfaceC12341a;
        this.f32178b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C12192o m3432a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C12192o(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static OnboardingCardTutorialViewModel m3430c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new OnboardingCardTutorialViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public OnboardingCardTutorialViewModel m3431b(C1459l0 c1459l0) {
        OnboardingCardTutorialViewModel m3430c = m3430c(c1459l0, this.f32177a.mo42226get());
        C13886p.m94a(m3430c, this.f32178b.mo42226get());
        return m3430c;
    }
}
