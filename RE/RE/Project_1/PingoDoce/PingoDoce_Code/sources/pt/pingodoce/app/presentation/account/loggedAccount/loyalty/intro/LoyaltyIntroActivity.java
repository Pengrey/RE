package pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC12127z0;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13810a3;
import p494zh.C13902t;
import p496zj.CardRegistrationLandingActivity;
import pe.C8617d;

/* compiled from: LoyaltyIntroActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyIntroActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23390f0;

    /* compiled from: LoyaltyIntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroActivity$a */
    /* loaded from: classes2.dex */
    static final class C8840a extends AbstractC6438m implements InterfaceC6097a {
        C8840a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13492j1 = LoyaltyIntroActivity.this.m13492j1();
            LoyaltyIntroActivity loyaltyIntroActivity = LoyaltyIntroActivity.this;
            Intent intent = loyaltyIntroActivity.getIntent();
            return m13492j1.m20377b(loyaltyIntroActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyIntroActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8841b extends AbstractC6438m implements InterfaceC6108l {
        C8841b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13487a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            LoyaltyIntroActivity.this.m13493i1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13487a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: E0 */
    protected Integer m13499E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: G0 */
    protected int m13498G0() {
        return C2336R.string.lbl_account_loyalty;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13497J0() {
        return C6450z.m20906b(LoyaltyIntroViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13496K0() {
        return new C8840a();
    }

    /* renamed from: S0 */
    protected boolean m13494S0() {
        return true;
    }

    /* renamed from: i1 */
    public final void m13493i1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
        if (interfaceC7186c instanceof C13810a3) {
            Uri parse = Uri.parse("https://poupamais.pt/");
            Intrinsics.checkIfNull(parse, "parse(this)");
            startActivity(new Intent("android.intent.action.VIEW", parse));
        } else if (interfaceC7186c instanceof C13902t) {
            CardRegistrationLandingActivity.m59b(this);
            finish();
        }
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m13492j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23390f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m13495P0(AbstractC12127z0 abstractC12127z0, LoyaltyIntroViewModel loyaltyIntroViewModel) {
        Intrinsics.isThisObjectNull(abstractC12127z0, "binding");
        Intrinsics.isThisObjectNull(loyaltyIntroViewModel, "viewModel");
        abstractC12127z0.mo3577Q(loyaltyIntroViewModel);
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8841b()));
    }

    /* renamed from: n */
    public boolean m13490n() {
        return true;
    }

    public void onBackPressed() {
        ((LoyaltyIntroViewModel) m22758I0()).m13481Q();
        super.onBackPressed();
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_intro;
    }
}
