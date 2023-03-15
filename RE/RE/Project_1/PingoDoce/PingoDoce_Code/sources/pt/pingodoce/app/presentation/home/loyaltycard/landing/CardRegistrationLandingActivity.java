package pt.pingodoce.app.presentation.home.loyaltycard.landing;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p033bk.AvailableCardsResumeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p430wk.OnboardingCardQuestionActivity;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import p494zh.AbstractC13816c;
import p494zh.C13821d;
import p494zh.C13873m0;
import p496zj.CardRegistrationLandingViewModel;
import pe.C8616c;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* compiled from: CardRegistrationLandingActivity.kt */
/* loaded from: classes2.dex */
public final class CardRegistrationLandingActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24291g0;

    /* compiled from: CardRegistrationLandingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingActivity$a */
    /* loaded from: classes2.dex */
    static final class C9224a extends AbstractC6438m implements InterfaceC6097a {
        C9224a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12073r1 = CardRegistrationLandingActivity.this.m12073r1();
            CardRegistrationLandingActivity cardRegistrationLandingActivity = CardRegistrationLandingActivity.this;
            return m12073r1.m20377b(cardRegistrationLandingActivity, cardRegistrationLandingActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12078J0() {
        return C6450z.m20906b(CardRegistrationLandingViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12077K0() {
        return new C9224a();
    }

    /* renamed from: k1 */
    protected List m12076k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2143g.C2144a.f6179a);
        return m202b;
    }

    /* renamed from: m1 */
    public void m12075m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13873m0.f34989a)) {
            OnboardingCardQuestionActivity.m3476a(this, (OnboardingFlowData) c13182l.m1459d());
            finish();
        } else if (Intrinsics.equals(abstractC13816c, C13821d.f34928a)) {
            AvailableCardsResumeActivity.m35122b(this, (OnboardingFlowData) c13182l.m1459d(), false, 2, null);
            finish();
        }
    }

    /* renamed from: n */
    public boolean m12074n() {
        return true;
    }

    /* renamed from: r1 */
    public final ViewModelFactoryByInjection m12073r1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24291g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8616c();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_card_registration_landing;
    }
}
