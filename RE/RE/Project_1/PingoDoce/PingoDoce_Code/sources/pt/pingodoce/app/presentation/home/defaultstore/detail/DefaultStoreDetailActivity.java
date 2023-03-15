package pt.pingodoce.app.presentation.home.defaultstore.detail;

import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p205kj.StoreDetailActivity;
import p314qd.InterfaceC9717b;
import p429wj.DefaultStoreDetailViewModel;

/* compiled from: DefaultStoreDetailActivity.kt */
/* loaded from: classes2.dex */
public final class DefaultStoreDetailActivity extends StoreDetailActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24289h0;

    /* compiled from: DefaultStoreDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.defaultstore.detail.DefaultStoreDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9223a extends AbstractC6438m implements InterfaceC6097a {
        C9223a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12080m1 = DefaultStoreDetailActivity.this.m12080m1();
            DefaultStoreDetailActivity defaultStoreDetailActivity = DefaultStoreDetailActivity.this;
            return m12080m1.m20377b(defaultStoreDetailActivity, defaultStoreDetailActivity.getIntent().getExtras());
        }
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12082J0() {
        return C6450z.m20906b(DefaultStoreDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12081K0() {
        return new C9223a();
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m12080m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24289h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
