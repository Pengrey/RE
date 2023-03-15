package pt.pingodoce.app.presentation.onboarding.notifications;

import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import ci.FlowActivity;
import cl.OnboardingSuccessActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p390uj.HomeActivity;
import p468yc.C13182l;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13884o1;
import p497zk.OnboardingNotificationViewModel;
import pe.C8618e;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* compiled from: OnboardingNotificationActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingNotificationActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24563g0;

    /* compiled from: OnboardingNotificationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationActivity$a */
    /* loaded from: classes2.dex */
    static final class C9342a extends AbstractC6438m implements InterfaceC6097a {
        C9342a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11591s1 = OnboardingNotificationActivity.this.m11591s1();
            OnboardingNotificationActivity onboardingNotificationActivity = OnboardingNotificationActivity.this;
            return m11591s1.m20377b(onboardingNotificationActivity, onboardingNotificationActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11597J0() {
        return C6450z.m20906b(OnboardingNotificationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11596K0() {
        return new C9342a();
    }

    /* renamed from: S0 */
    protected boolean m11595S0() {
        return false;
    }

    /* renamed from: k1 */
    protected List m11594k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11593m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (((AbstractC13816c) c13182l.m1460c()) instanceof C13884o1) {
            HomeActivity.m6743b(this);
            OnboardingSuccessActivity.m34517a(this, (PhoneFlowData) ((OnboardingNotificationViewModel) m22758I0()).m34578S());
            return;
        }
        HomeActivity.m6743b(this);
    }

    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m11591s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24563g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_notification;
    }
}
