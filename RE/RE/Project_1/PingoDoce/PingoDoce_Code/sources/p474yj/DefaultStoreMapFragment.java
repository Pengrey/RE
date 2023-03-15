package p474yj;

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
import p407vj.DefaultStoreViewModel;
import p429wj.DefaultStoreDetailActivity;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreActivity;

/* renamed from: yj.a */
/* loaded from: classes2.dex */
public final class DefaultStoreMapFragment extends StoreMapFragment {

    /* renamed from: H0 */
    public static final C13465a f34240H0 = new C13465a(null);

    /* renamed from: F0 */
    public TransactionCacheManager f34241F0;

    /* renamed from: G0 */
    public ViewModelFactoryByInjection f34242G0;

    /* compiled from: DefaultStoreMapFragment.kt */
    /* renamed from: yj.a$a */
    /* loaded from: classes2.dex */
    public static final class C13465a {
        private C13465a() {
        }

        public /* synthetic */ C13465a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DefaultStoreMapFragment m1330a() {
            return new DefaultStoreMapFragment();
        }
    }

    /* compiled from: DefaultStoreMapFragment.kt */
    /* renamed from: yj.a$b */
    /* loaded from: classes2.dex */
    static final class C13466b extends AbstractC6438m implements InterfaceC6097a {
        C13466b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(DefaultStoreMapFragment.this.m1333c3(), DefaultStoreMapFragment.this, null, 2, null);
        }
    }

    /* renamed from: M2 */
    public void m1337M2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        ((DefaultStoreViewModel) m22721j2()).m5295n0(store);
    }

    /* renamed from: P2 */
    public void m1336P2(LatLng latLng) {
        AbstractC6515g.m20754a0((AbstractC6515g) m22721j2(), latLng, false, 2, null);
    }

    /* renamed from: a3 */
    public void m1335a3(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        DefaultStoreActivity defaultStoreActivity = (DefaultStoreActivity) m37652G1();
        DefaultStoreDetailActivity.m3491a(defaultStoreActivity.m20770o1(), defaultStoreActivity, store, m1334b3());
    }

    /* renamed from: b3 */
    public final TransactionCacheManager m1334b3() {
        TransactionCacheManager transactionCacheManager = this.f34241F0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: c3 */
    public final ViewModelFactoryByInjection m1333c3() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f34242G0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m1332k2() {
        return C6450z.m20906b(DefaultStoreViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m1331l2() {
        return new C13466b();
    }
}
