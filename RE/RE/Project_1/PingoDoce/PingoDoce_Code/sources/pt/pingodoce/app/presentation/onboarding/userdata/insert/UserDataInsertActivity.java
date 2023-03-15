package pt.pingodoce.app.presentation.onboarding.userdata.insert;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p034bl.OnboardingResumeActivity;
import p069dl.UserDataActivity;
import p089el.UserDataInsertViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p430wk.OnboardingCardQuestionActivity;
import p468yc.C13182l;
import p475yk.OnboardingNifActivity;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13847i1;
import p494zh.C13874m1;
import p494zh.C13910v;
import p494zh.C13918x;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import uk.OnboardingEmailActivity;

/* compiled from: UserDataInsertActivity.kt */
/* loaded from: classes2.dex */
public final class UserDataInsertActivity extends UserDataActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24586g0;

    /* compiled from: UserDataInsertActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.userdata.insert.UserDataInsertActivity$a */
    /* loaded from: classes2.dex */
    static final class C9354a extends AbstractC6438m implements InterfaceC6097a {
        C9354a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11532t1 = UserDataInsertActivity.this.m11532t1();
            UserDataInsertActivity userDataInsertActivity = UserDataInsertActivity.this;
            return m11532t1.m20377b(userDataInsertActivity, userDataInsertActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11536J0() {
        return C6450z.m20906b(UserDataInsertViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11535K0() {
        return new C9354a();
    }

    /* renamed from: k1 */
    protected List m11534k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11533m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13874m1.f34990a)) {
            OnboardingNifActivity.m1326a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13910v.f35031a)) {
            OnboardingCardQuestionActivity.m3476a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35084b(this, (OnboardingFlowData) c13182l.m1459d(), false, 2, null);
        }
    }

    public void onBackPressed() {
        ((UserDataInsertViewModel) m22758I0()).m25587D0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m11532t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24586g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
