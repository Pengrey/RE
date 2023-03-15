package pt.pingodoce.app.presentation.onboarding.nif;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p034bl.OnboardingResumeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p408vk.OnboardingEmailSentActivity;
import p468yc.C13182l;
import p475yk.OnboardingNifViewModel;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13847i1;
import p494zh.C13852j1;
import p494zh.C13878n1;
import p494zh.C13918x;
import p495zi.NifActivity;
import p497zk.OnboardingNotificationActivity;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingNifActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingNifActivity extends NifActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24561g0;

    /* compiled from: OnboardingNifActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifActivity$a */
    /* loaded from: classes2.dex */
    static final class C9341a extends AbstractC6438m implements InterfaceC6097a {
        C9341a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11599t1 = OnboardingNifActivity.this.m11599t1();
            OnboardingNifActivity onboardingNifActivity = OnboardingNifActivity.this;
            return m11599t1.m20377b(onboardingNifActivity, onboardingNifActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11603J0() {
        return C6450z.m20906b(OnboardingNifViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11602K0() {
        return new C9341a();
    }

    /* renamed from: k1 */
    protected List m11601k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11600m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35084b(this, (OnboardingFlowData) c13182l.m1459d(), false, 2, null);
        } else if (Intrinsics.equals(abstractC13816c, C13878n1.f34993a)) {
            OnboardingNotificationActivity.m42a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13852j1.f34960a)) {
            OnboardingEmailSentActivity.m5282a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    public void onBackPressed() {
        ((OnboardingNifViewModel) m22758I0()).m1317V0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m11599t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24561g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
