package pt.pingodoce.app.presentation.takeaway.orders.detail;

import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p391ul.TakeAwayDetailAdapter;
import p391ul.TakeAwayOrderDetailViewModel;
import p426wg.AbstractC11758f4;
import p494zh.BaseActivity;
import pe.C8617d;

/* compiled from: TakeAwayOrderDetailActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayOrderDetailActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f25033f0;

    /* compiled from: TakeAwayOrderDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.detail.TakeAwayOrderDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9517a extends AbstractC6438m implements InterfaceC6097a {
        C9517a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10822j1 = TakeAwayOrderDetailActivity.this.m10822j1();
            TakeAwayOrderDetailActivity takeAwayOrderDetailActivity = TakeAwayOrderDetailActivity.this;
            return m10822j1.m20377b(takeAwayOrderDetailActivity, takeAwayOrderDetailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10826J0() {
        return C6450z.m20906b(TakeAwayOrderDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10825K0() {
        return new C9517a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m10822j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25033f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m10824P0(AbstractC11758f4 abstractC11758f4, TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC11758f4, "binding");
        Intrinsics.isThisObjectNull(takeAwayOrderDetailViewModel, "viewModel");
        abstractC11758f4.f30298y.setAdapter(new TakeAwayDetailAdapter(takeAwayOrderDetailViewModel.m6689z0(), takeAwayOrderDetailViewModel.m6699A0()));
    }

    /* renamed from: n */
    public boolean m10820n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_order_detail;
    }
}
