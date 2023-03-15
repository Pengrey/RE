package pt.pingodoce.app.presentation.onboarding.loyaltycard;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p015ak.CardRegistrationActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p430wk.OnboardingCardQuestionViewModel;
import p468yc.C13182l;
import p473yi.VirtualCardDataConfirmationActivity;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13847i1;
import p494zh.C13873m0;
import p494zh.C13919x0;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingCardQuestionActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingCardQuestionActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24542g0;

    /* compiled from: OnboardingCardQuestionActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardQuestionActivity$a */
    /* loaded from: classes2.dex */
    static final class C9329a extends AbstractC6438m implements InterfaceC6097a {
        C9329a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingCardQuestionActivity.this.m11665s1(), OnboardingCardQuestionActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11670J0() {
        return C6450z.m20906b(OnboardingCardQuestionViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11669K0() {
        return new C9329a();
    }

    /* renamed from: k1 */
    protected List m11668k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11667m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13873m0.f34989a)) {
            CardRegistrationActivity.m41600a(this, (OnboardingFlowData) c13182l.m1459d(), true);
        } else if (Intrinsics.equals(abstractC13816c, C13919x0.f35040a)) {
            VirtualCardDataConfirmationActivity.m1397a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11665s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24542g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_card_question;
    }
}
