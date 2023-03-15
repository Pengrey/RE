package pt.pingodoce.app.presentation.onboarding.email;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p278oi.EmailActivity;
import p314qd.InterfaceC9717b;
import p408vk.OnboardingEmailSentActivity;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13852j1;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import uk.OnboardingEmailViewModel;

/* compiled from: OnboardingEmailActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingEmailActivity extends EmailActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24538g0;

    /* compiled from: OnboardingEmailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.email.OnboardingEmailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9327a extends AbstractC6438m implements InterfaceC6097a {
        C9327a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11684t1 = OnboardingEmailActivity.this.m11684t1();
            OnboardingEmailActivity onboardingEmailActivity = OnboardingEmailActivity.this;
            return m11684t1.m20377b(onboardingEmailActivity, onboardingEmailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11688J0() {
        return C6450z.m20906b(OnboardingEmailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11687K0() {
        return new C9327a();
    }

    /* renamed from: k1 */
    protected List m11686k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11685m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13852j1.f34960a)) {
            OnboardingEmailSentActivity.m5282a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    public void onBackPressed() {
        ((OnboardingEmailViewModel) m22758I0()).m6719K0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m11684t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24538g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
