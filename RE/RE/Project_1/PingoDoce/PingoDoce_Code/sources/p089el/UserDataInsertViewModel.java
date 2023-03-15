package p089el;

import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p069dl.UserDataViewModel;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.C13874m1;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: el.c */
/* loaded from: classes2.dex */
public final class UserDataInsertViewModel extends UserDataViewModel {

    /* renamed from: J */
    private final AnalyticsManager f14191J;

    /* renamed from: K */
    private final OnboardingFlowData f14192K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataInsertViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f14191J = analyticsManager;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) m34578S();
        this.f14192K = onboardingFlowData;
        m26338z0().mo166p(onboardingFlowData.m14715m());
        m26347B0().mo166p(onboardingFlowData.m14713r());
    }

    /* renamed from: D0 */
    public final void m25587D0() {
        InterfaceC7886d.C7887a.m17629a(this.f14191J, AnalyticEvents.AbstractC7780f.C7788c0.f20412b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: n0 */
    protected Object m25586n0(InterfaceC1886d interfaceC1886d) {
        InterfaceC7886d.C7887a.m17629a(this.f14191J, AnalyticEvents.AbstractC7780f.C7794e0.f20418b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        String str = (String) m26338z0().mo172f();
        if (str != null) {
            this.f14192K.m14731I(str);
        }
        String str2 = (String) m26347B0().mo172f();
        if (str2 != null) {
            this.f14192K.m14730J(str2);
        }
        m34576U(this.f14192K);
        m120B(C13874m1.f34990a, m34578S());
        return C13195u.f34156a;
    }
}
