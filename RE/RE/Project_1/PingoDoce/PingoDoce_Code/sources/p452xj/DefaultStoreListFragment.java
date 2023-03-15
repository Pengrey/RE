package p452xj;

import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.android.gms.maps.model.LatLng;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.TransactionCacheManager;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p186jj.AbstractC6515g;
import p226lj.StoreListFragment;
import p314qd.InterfaceC9717b;
import p407vj.DefaultStoreViewModel;
import p429wj.DefaultStoreDetailActivity;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreActivity;
import td.InterfaceC10524i0;

/* renamed from: xj.a */
/* loaded from: classes2.dex */
public final class DefaultStoreListFragment extends StoreListFragment {

    /* renamed from: E0 */
    public static final C13003b f33748E0 = new C13003b(null);

    /* renamed from: C0 */
    public TransactionCacheManager f33749C0;

    /* renamed from: D0 */
    public ViewModelFactoryByInjection f33750D0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultStoreListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.list.DefaultStoreListFragment$1", m20196f = "DefaultStoreListFragment.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: xj.a$a */
    /* loaded from: classes2.dex */
    public static final class C13002a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33751x;

        C13002a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13002a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13002a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33751x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DefaultStoreViewModel m1950J2 = DefaultStoreListFragment.m1950J2(DefaultStoreListFragment.this);
                this.f33751x = 1;
                if (m1950J2.m5298k0(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: DefaultStoreListFragment.kt */
    /* renamed from: xj.a$b */
    /* loaded from: classes2.dex */
    public static final class C13003b {
        private C13003b() {
        }

        public /* synthetic */ C13003b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DefaultStoreListFragment m1943a() {
            return new DefaultStoreListFragment();
        }
    }

    /* compiled from: DefaultStoreListFragment.kt */
    /* renamed from: xj.a$c */
    /* loaded from: classes2.dex */
    static final class C13004c extends AbstractC6438m implements InterfaceC6097a {
        C13004c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(DefaultStoreListFragment.this.m1948L2(), DefaultStoreListFragment.this, null, 2, null);
        }
    }

    public DefaultStoreListFragment() {
        LifecycleOwner.m36965a(this).m36985h(new C13002a(null));
    }

    /* renamed from: J2 */
    public static final /* synthetic */ DefaultStoreViewModel m1950J2(DefaultStoreListFragment defaultStoreListFragment) {
        return (DefaultStoreViewModel) defaultStoreListFragment.m22721j2();
    }

    /* renamed from: A2 */
    public void m1953A2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        ((DefaultStoreViewModel) m22721j2()).m5295n0(store);
    }

    /* renamed from: C2 */
    public void m1952C2(LatLng latLng) {
        AbstractC6515g.m20754a0((AbstractC6515g) m22721j2(), latLng, false, 2, null);
    }

    /* renamed from: I2 */
    public void m1951I2(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        DefaultStoreActivity defaultStoreActivity = (DefaultStoreActivity) m37652G1();
        DefaultStoreDetailActivity.m3491a(defaultStoreActivity.m20770o1(), defaultStoreActivity, store, m1949K2());
    }

    /* renamed from: K2 */
    public final TransactionCacheManager m1949K2() {
        TransactionCacheManager transactionCacheManager = this.f33749C0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: L2 */
    public final ViewModelFactoryByInjection m1948L2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f33750D0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m1947k2() {
        return C6450z.m20906b(DefaultStoreViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m1946l2() {
        return new C13004c();
    }
}
