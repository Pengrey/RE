package pt.pingodoce.app.presentation.onboarding.loyaltycard;

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
import p430wk.OnboardingCardTutorialViewModel;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13847i1;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingCardTutorialActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingCardTutorialActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24546g0;

    /* compiled from: OnboardingCardTutorialActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardTutorialActivity$a */
    /* loaded from: classes2.dex */
    static final class C9331a extends AbstractC6438m implements InterfaceC6097a {
        C9331a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(OnboardingCardTutorialActivity.this.m11651s1(), OnboardingCardTutorialActivity.this, null, 2, null);
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11656J0() {
        return C6450z.m20906b(OnboardingCardTutorialViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11655K0() {
        return new C9331a();
    }

    /* renamed from: k1 */
    protected List m11654k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11653m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11651s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24546g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_card_tutorial;
    }
}
