package p430wk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wk.e */
/* loaded from: classes2.dex */
public final class C12182e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32157a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f32158b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f32159c;

    public C12182e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f32157a = interfaceC12341a;
        this.f32158b = interfaceC12341a2;
        this.f32159c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C12182e m3452a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C12182e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingCardQuestionViewModel m3450c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new OnboardingCardQuestionViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public OnboardingCardQuestionViewModel m3451b(C1459l0 c1459l0) {
        OnboardingCardQuestionViewModel m3450c = m3450c(c1459l0, this.f32157a.mo42226get(), this.f32158b.mo42226get());
        C13886p.m94a(m3450c, this.f32159c.mo42226get());
        return m3450c;
    }
}
