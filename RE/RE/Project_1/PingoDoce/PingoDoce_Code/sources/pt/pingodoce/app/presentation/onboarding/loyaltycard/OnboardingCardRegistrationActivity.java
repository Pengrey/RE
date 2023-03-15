package pt.pingodoce.app.presentation.onboarding.loyaltycard;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p034bl.OnboardingResumeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p430wk.OnboardingCardRegistrationViewModel;
import p468yc.C13182l;
import p494zh.AbstractC13816c;
import p494zh.C13896r1;
import p494zh.C13906u;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import vi.LoyaltyCardInsertActivity;

/* compiled from: OnboardingCardRegistrationActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingCardRegistrationActivity extends LoyaltyCardInsertActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24544h0;

    /* compiled from: OnboardingCardRegistrationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardRegistrationActivity$a */
    /* loaded from: classes2.dex */
    static final class C9330a extends AbstractC6438m implements InterfaceC6097a {
        C9330a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingCardRegistrationActivity.this.m11658z1(), OnboardingCardRegistrationActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11661J0() {
        return C6450z.m20906b(OnboardingCardRegistrationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11660K0() {
        return new C9330a();
    }

    /* renamed from: m1 */
    public void m11659m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (abstractC13816c instanceof C13906u) {
            OnboardingResumeActivity.m35084b(this, (OnboardingFlowData) c13182l.m1459d(), false, 2, null);
        } else if (abstractC13816c instanceof C13896r1) {
            p430wk.OnboardingOwnerInV2Activity.m3412b(this, (OnboardingFlowData) c13182l.m1459d(), false, 2, null);
        }
    }

    public void onBackPressed() {
        ((OnboardingCardRegistrationViewModel) m22758I0()).m3445E0();
        super.onBackPressed();
    }

    /* renamed from: z1 */
    public final ViewModelFactoryByInjection m11658z1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24544h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
