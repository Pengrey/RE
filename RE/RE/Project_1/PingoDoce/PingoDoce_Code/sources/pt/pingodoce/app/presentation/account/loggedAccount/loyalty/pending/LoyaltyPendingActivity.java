package pt.pingodoce.app.presentation.account.loggedAccount.loyalty.pending;

import android.content.Intent;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p143hh.LoyaltyPendingViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC11686b1;
import p494zh.BaseActivity;
import pe.C8617d;

/* compiled from: LoyaltyPendingActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyPendingActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23397f0;

    /* compiled from: LoyaltyPendingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.pending.LoyaltyPendingActivity$a */
    /* loaded from: classes2.dex */
    static final class C8845a extends AbstractC6438m implements InterfaceC6097a {
        C8845a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13471i1 = LoyaltyPendingActivity.this.m13471i1();
            LoyaltyPendingActivity loyaltyPendingActivity = LoyaltyPendingActivity.this;
            Intent intent = loyaltyPendingActivity.getIntent();
            return m13471i1.m20377b(loyaltyPendingActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* renamed from: E0 */
    protected Integer m13477E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: G0 */
    protected int m13476G0() {
        return C2336R.string.lbl_account_loyalty;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13475J0() {
        return C6450z.m20906b(LoyaltyPendingViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13474K0() {
        return new C8845a();
    }

    /* renamed from: S0 */
    protected boolean m13472S0() {
        return true;
    }

    /* renamed from: i1 */
    public final ViewModelFactoryByInjection m13471i1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23397f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public void m13473P0(AbstractC11686b1 abstractC11686b1, LoyaltyPendingViewModel loyaltyPendingViewModel) {
        Intrinsics.isThisObjectNull(abstractC11686b1, "binding");
        Intrinsics.isThisObjectNull(loyaltyPendingViewModel, "viewModel");
    }

    /* renamed from: n */
    public boolean m13469n() {
        return true;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_pending;
    }
}
