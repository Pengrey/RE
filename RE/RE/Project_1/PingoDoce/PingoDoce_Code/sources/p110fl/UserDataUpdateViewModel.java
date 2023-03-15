package p110fl;

import android.content.Intent;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import java.util.ArrayList;
import java.util.List;
import mg.AnalyticsManager;
import p069dl.UserDataViewModel;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p451xi.C12997f;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.Iterables;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: fl.c */
/* loaded from: classes2.dex */
public final class UserDataUpdateViewModel extends UserDataViewModel {

    /* renamed from: J */
    private C2381h f15759J;

    /* renamed from: K */
    private final OnboardingFlowData f15760K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataUpdateViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_update));
        this.f15759J = c2381h;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) c1459l0.m37005b("EXTRA_FOR_FLOW_DATA");
        this.f15760K = onboardingFlowData;
        m26338z0().mo166p(onboardingFlowData != null ? onboardingFlowData.m14715m() : null);
        m26347B0().mo166p(onboardingFlowData != null ? onboardingFlowData.m14713r() : null);
    }

    /* renamed from: g0 */
    protected C2381h m23726g0() {
        return this.f15759J;
    }

    /* renamed from: n0 */
    protected Object m23725n0(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        int m186r;
        String str;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel;
        OnboardingFlowData onboardingFlowData = this.f15760K;
        C13195u c13195u = null;
        if (onboardingFlowData != null) {
            if (onboardingFlowData.m14718i().size() > 1) {
                String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                List m1964a = C12997f.m1964a(onboardingFlowData.m14718i());
                String string2 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                loyaltyCardResumeViewModel = new LoyaltyCardResumeViewModel(string, m1964a, string2);
            } else {
                String string3 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
                Intrinsics.checkIfNull(string3, "ctx.getString(id)");
                if (onboardingFlowData.m14718i().isEmpty()) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    List<LoyaltyCardProvisory> m14718i = onboardingFlowData.m14718i();
                    m186r = Iterables.m186r(m14718i, 10);
                    ArrayList arrayList = new ArrayList(m186r);
                    for (LoyaltyCardProvisory loyaltyCardProvisory : m14718i) {
                        arrayList.add(loyaltyCardProvisory.m14566e());
                    }
                    str = (String) C13777q.m256L(arrayList);
                }
                String string4 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
                Intrinsics.checkIfNull(string4, "ctx.getString(id)");
                loyaltyCardResumeViewModel = new LoyaltyCardResumeViewModel(string3, str, string4);
            }
            onboardingFlowData.m14733G(loyaltyCardResumeViewModel);
            T mo172f = m26338z0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            onboardingFlowData.m14731I((String) mo172f);
            T mo172f2 = m26347B0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f2);
            onboardingFlowData.m14730J((String) mo172f2);
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FOR_FLOW_DATA", onboardingFlowData);
            C13195u c13195u2 = C13195u.f34156a;
            UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
            c13195u = c13195u2;
        }
        m34636d = C2116d.m34636d();
        return c13195u == m34636d ? c13195u : C13195u.f34156a;
    }
}
