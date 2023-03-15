package pt.pingodoce.app.presentation.takeaway.landing.anonymousSession;

import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import dm.TakeAwayWalkThroughActivity;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import ni.BottomNavigationActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p258nk.LoginPhoneActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11701c;
import p468yc.C13182l;
import p494zh.AbstractC13816c;
import p494zh.C13888p1;

/* compiled from: AnonymousSessionTakeAwayLandingActivity.kt */
/* loaded from: classes2.dex */
public final class AnonymousSessionTakeAwayLandingActivity extends BottomNavigationActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f25006h0;

    /* compiled from: AnonymousSessionTakeAwayLandingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingActivity$a */
    /* loaded from: classes2.dex */
    static final class C9507a extends AbstractC6438m implements InterfaceC6097a {
        C9507a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(AnonymousSessionTakeAwayLandingActivity.this.m10880r1(), AnonymousSessionTakeAwayLandingActivity.this, null, 2, null);
        }
    }

    /* renamed from: G0 */
    protected int m10887G0() {
        return C2336R.string.lbl_take_away;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10886J0() {
        return C6450z.m20906b(AnonymousSessionTakeAwayLandingViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10885K0() {
        return new C9507a();
    }

    /* renamed from: S0 */
    protected boolean m10883S0() {
        return false;
    }

    /* renamed from: k1 */
    protected void m10882k1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        if (Intrinsics.equals((AbstractC13816c) c13182l.m1460c(), C13888p1.f35009a)) {
            LoginPhoneActivity.m17547a(this);
        }
    }

    /* renamed from: r1 */
    public final ViewModelFactoryByInjection m10880r1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25006h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: s */
    public BottomNavigationView mo17603s() {
        BottomNavigationView bottomNavigationView = ((AbstractC11701c) m22738w0()).f29972x.f30312x;
        Intrinsics.checkIfNull(bottomNavigationView, "binding.bottomNavigation….viewBottomNavigationView");
        return bottomNavigationView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public void m10881o1(AbstractC11701c abstractC11701c, AnonymousSessionTakeAwayLandingViewModel anonymousSessionTakeAwayLandingViewModel) {
        Intrinsics.isThisObjectNull(abstractC11701c, "binding");
        Intrinsics.isThisObjectNull(anonymousSessionTakeAwayLandingViewModel, "viewModel");
        super.m17611o1(abstractC11701c, anonymousSessionTakeAwayLandingViewModel);
        abstractC11701c.mo4411Q(m17612n1());
        if (anonymousSessionTakeAwayLandingViewModel.m10873M()) {
            TakeAwayWalkThroughActivity.m26337a(this);
        }
    }

    /* renamed from: w */
    public int mo17602w() {
        return C2336R.C2338id.navigation_takeaway;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_anonymous_session_take_away_landing;
    }
}
