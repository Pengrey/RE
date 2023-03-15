package p498zl;

import androidx.lifecycle.AbstractC1423a;
import com.google.android.gms.maps.model.LatLng;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.TransactionCacheManager;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p257nj.StoreMapFragment;
import p314qd.InterfaceC9717b;
import p431wl.TakeAwayStoreViewModel;
import p454xl.TakeAwayStoreDetailActivity;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreActivity;

/* renamed from: zl.a */
/* loaded from: classes2.dex */
public final class TakeAwayStoreMapFragment extends StoreMapFragment {

    /* renamed from: H0 */
    public static final C13950a f35111H0 = new C13950a(null);

    /* renamed from: F0 */
    public TransactionCacheManager f35112F0;

    /* renamed from: G0 */
    public ViewModelFactoryByInjection f35113G0;

    /* compiled from: TakeAwayStoreMapFragment.kt */
    /* renamed from: zl.a$a */
    /* loaded from: classes2.dex */
    public static final class C13950a {
        private C13950a() {
        }

        public /* synthetic */ C13950a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TakeAwayStoreMapFragment m4a() {
            return new TakeAwayStoreMapFragment();
        }
    }

    /* compiled from: TakeAwayStoreMapFragment.kt */
    /* renamed from: zl.a$b */
    /* loaded from: classes2.dex */
    static final class C13951b extends AbstractC6438m implements InterfaceC6097a {
        C13951b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayStoreMapFragment.this.m7c3(), TakeAwayStoreMapFragment.this, null, 2, null);
        }
    }

    /* renamed from: M2 */
    public void m11M2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        ((TakeAwayStoreViewModel) m22721j2()).m3399l0(store);
    }

    /* renamed from: P2 */
    public void m10P2(LatLng latLng) {
        AbstractC6515g.m20754a0((AbstractC6515g) m22721j2(), latLng, false, 2, null);
    }

    /* renamed from: a3 */
    public void m9a3(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        TakeAwayStoreActivity takeAwayStoreActivity = (TakeAwayStoreActivity) m37652G1();
        TakeAwayStoreDetailActivity.m1923a(takeAwayStoreActivity.m20770o1(), takeAwayStoreActivity, store, m8b3());
    }

    /* renamed from: b3 */
    public final TransactionCacheManager m8b3() {
        TransactionCacheManager transactionCacheManager = this.f35112F0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: c3 */
    public final ViewModelFactoryByInjection m7c3() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f35113G0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m6k2() {
        return C6450z.m20906b(TakeAwayStoreViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m5l2() {
        return new C13951b();
    }
}
