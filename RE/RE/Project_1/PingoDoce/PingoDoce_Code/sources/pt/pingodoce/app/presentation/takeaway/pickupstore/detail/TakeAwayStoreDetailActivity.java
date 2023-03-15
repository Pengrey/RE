package pt.pingodoce.app.presentation.takeaway.pickupstore.detail;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p205kj.StoreDetailActivity;
import p314qd.InterfaceC9717b;
import p454xl.TakeAwayStoreDetailViewModel;

/* compiled from: TakeAwayStoreDetailActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayStoreDetailActivity extends StoreDetailActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f25043h0;

    /* compiled from: TakeAwayStoreDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.pickupstore.detail.TakeAwayStoreDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9522a extends AbstractC6438m implements InterfaceC6097a {
        C9522a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10788m1 = TakeAwayStoreDetailActivity.this.m10788m1();
            TakeAwayStoreDetailActivity takeAwayStoreDetailActivity = TakeAwayStoreDetailActivity.this;
            return m10788m1.m20377b(takeAwayStoreDetailActivity, takeAwayStoreDetailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10790J0() {
        return C6450z.m20906b(TakeAwayStoreDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10789K0() {
        return new C9522a();
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m10788m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25043h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
