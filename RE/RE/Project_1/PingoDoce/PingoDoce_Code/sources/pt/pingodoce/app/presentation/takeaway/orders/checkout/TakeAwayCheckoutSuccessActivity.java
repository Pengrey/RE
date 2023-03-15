package pt.pingodoce.app.presentation.takeaway.orders.checkout;

import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12095x3;
import p494zh.BaseActivity;
import pe.C8617d;
import sl.TakeAwayCheckoutSuccessViewModel;

/* compiled from: TakeAwayCheckoutSuccessActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayCheckoutSuccessActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f25029f0;

    /* compiled from: TakeAwayCheckoutSuccessActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.checkout.TakeAwayCheckoutSuccessActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9513a {
        private C9513a() {
        }

        public /* synthetic */ C9513a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TakeAwayCheckoutSuccessActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.checkout.TakeAwayCheckoutSuccessActivity$b */
    /* loaded from: classes2.dex */
    static final class C9514b extends AbstractC6438m implements InterfaceC6097a {
        C9514b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10838j1 = TakeAwayCheckoutSuccessActivity.this.m10838j1();
            TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity = TakeAwayCheckoutSuccessActivity.this;
            return m10838j1.m20377b(takeAwayCheckoutSuccessActivity, takeAwayCheckoutSuccessActivity.getIntent().getExtras());
        }
    }

    static {
        new C9513a(null);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10843J0() {
        return C6450z.m20906b(TakeAwayCheckoutSuccessViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10842K0() {
        return new C9514b();
    }

    /* renamed from: S0 */
    protected boolean m10840S0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m10838j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25029f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m10841P0(AbstractC12095x3 abstractC12095x3, TakeAwayCheckoutSuccessViewModel takeAwayCheckoutSuccessViewModel) {
        Intrinsics.isThisObjectNull(abstractC12095x3, "binding");
        Intrinsics.isThisObjectNull(takeAwayCheckoutSuccessViewModel, "viewModel");
        C1112b0.m38465J0(abstractC12095x3.f31857z, "TRANSITION_STORE_VIEW");
        C1112b0.m38465J0(abstractC12095x3.f31855x, "TRANSITION_DAY_VIEW");
        C1112b0.m38465J0(abstractC12095x3.f31853A, "TRANSITION_TIME_VIEW");
        C1112b0.m38465J0(abstractC12095x3.f31856y, "TRANSITION_BUTTON");
    }

    /* renamed from: n */
    public boolean m10836n() {
        return true;
    }

    public void onBackPressed() {
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_checkout_success;
    }
}
