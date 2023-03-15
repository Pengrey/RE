package pt.pingodoce.app.presentation.onboarding.success;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import cl.OnboardingSuccessViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11793h2;
import p468yc.C13182l;
import p489zc.C13780s;
import pe.C8617d;

/* compiled from: OnboardingSuccessActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingSuccessActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24584g0;

    /* compiled from: OnboardingSuccessActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.success.OnboardingSuccessActivity$a */
    /* loaded from: classes2.dex */
    static final class C9353a extends AbstractC6438m implements InterfaceC6097a {
        C9353a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingSuccessActivity.this.m11541s1(), OnboardingSuccessActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11549J0() {
        return C6450z.m20906b(OnboardingSuccessViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11548K0() {
        return new C9353a();
    }

    /* renamed from: S0 */
    protected boolean m11546S0() {
        return false;
    }

    /* renamed from: k1 */
    protected List m11545k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11544m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11541s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24584g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t1 */
    public void m11543n1(AbstractC11793h2 abstractC11793h2, OnboardingSuccessViewModel onboardingSuccessViewModel) {
        Intrinsics.isThisObjectNull(abstractC11793h2, "binding");
        Intrinsics.isThisObjectNull(onboardingSuccessViewModel, "viewModel");
        super.m34589n1(abstractC11793h2, onboardingSuccessViewModel);
        onboardingSuccessViewModel.m34507d0();
        onboardingSuccessViewModel.m34508c0();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_success;
    }
}
