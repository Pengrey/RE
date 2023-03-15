package p476yl;

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
import p226lj.StoreListFragment;
import p314qd.InterfaceC9717b;
import p431wl.TakeAwayStoreViewModel;
import p454xl.TakeAwayStoreDetailActivity;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreActivity;

/* renamed from: yl.a */
/* loaded from: classes2.dex */
public final class TakeAwayStoreListFragment extends StoreListFragment {

    /* renamed from: E0 */
    public static final C13477a f34275E0 = new C13477a(null);

    /* renamed from: C0 */
    public TransactionCacheManager f34276C0;

    /* renamed from: D0 */
    public ViewModelFactoryByInjection f34277D0;

    /* compiled from: TakeAwayStoreListFragment.kt */
    /* renamed from: yl.a$a */
    /* loaded from: classes2.dex */
    public static final class C13477a {
        private C13477a() {
        }

        public /* synthetic */ C13477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TakeAwayStoreListFragment m1298a() {
            return new TakeAwayStoreListFragment();
        }
    }

    /* compiled from: TakeAwayStoreListFragment.kt */
    /* renamed from: yl.a$b */
    /* loaded from: classes2.dex */
    static final class C13478b extends AbstractC6438m implements InterfaceC6097a {
        C13478b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayStoreListFragment.this.m1301K2(), TakeAwayStoreListFragment.this, null, 2, null);
        }
    }

    /* renamed from: A2 */
    public void m1306A2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        ((TakeAwayStoreViewModel) m22721j2()).m3399l0(store);
    }

    /* renamed from: B2 */
    protected boolean m1305B2() {
        return true;
    }

    /* renamed from: C2 */
    public void m1304C2(LatLng latLng) {
        AbstractC6515g.m20754a0((AbstractC6515g) m22721j2(), latLng, false, 2, null);
    }

    /* renamed from: I2 */
    public void m1303I2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        TakeAwayStoreActivity takeAwayStoreActivity = (TakeAwayStoreActivity) m37652G1();
        TakeAwayStoreDetailActivity.m1923a(takeAwayStoreActivity.m20770o1(), takeAwayStoreActivity, store, m1302J2());
    }

    /* renamed from: J2 */
    public final TransactionCacheManager m1302J2() {
        TransactionCacheManager transactionCacheManager = this.f34276C0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: K2 */
    public final ViewModelFactoryByInjection m1301K2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f34277D0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m1300k2() {
        return C6450z.m20906b(TakeAwayStoreViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m1299l2() {
        return new C13478b();
    }
}
