package pt.pingodoce.app.presentation.onboarding.loyaltycard;

import al.CreatePinActivity;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11722d2;
import p430wk.OnboardingOtherUserCardTutorialViewModel;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13900s1;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingOtherUserCardTutorialActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingOtherUserCardTutorialActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24548g0;

    /* compiled from: OnboardingOtherUserCardTutorialActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOtherUserCardTutorialActivity$a */
    /* loaded from: classes2.dex */
    static final class C9332a extends AbstractC6438m implements InterfaceC6097a {
        C9332a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingOtherUserCardTutorialActivity.this.m11640s1(), OnboardingOtherUserCardTutorialActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11647J0() {
        return C6450z.m20906b(OnboardingOtherUserCardTutorialViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11646K0() {
        return new C9332a();
    }

    /* renamed from: k1 */
    protected List m11644k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11643m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13900s1.f35021a)) {
            CreatePinActivity.m41589a(this, (PhoneFlowData) c13182l.m1459d());
        } else {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11640s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24548g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public void m11642n1(AbstractC11722d2 abstractC11722d2, OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel) {
        Intrinsics.isThisObjectNull(abstractC11722d2, "binding");
        Intrinsics.isThisObjectNull(onboardingOtherUserCardTutorialViewModel, "viewModel");
        super.m34589n1(abstractC11722d2, onboardingOtherUserCardTutorialViewModel);
        onboardingOtherUserCardTutorialViewModel.m3422Y(((OnboardingFlowData) onboardingOtherUserCardTutorialViewModel.m34578S()).m14712s());
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_other_user_card_tutorial;
    }
}
