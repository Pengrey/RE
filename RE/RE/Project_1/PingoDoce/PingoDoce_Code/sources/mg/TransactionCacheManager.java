package mg;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: mg.q1 */
/* loaded from: classes2.dex */
public final class TransactionCacheManager {

    /* renamed from: a */
    private final SharedPreferences f19622a;

    /* compiled from: TransactionCacheManager.kt */
    /* renamed from: mg.q1$a */
    /* loaded from: classes2.dex */
    public static final class C7396a {
        private C7396a() {
        }

        public /* synthetic */ C7396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7396a(null);
    }

    public TransactionCacheManager(SharedPreferences sharedPreferences) {
        Intrinsics.isThisObjectNull(sharedPreferences, "prefs");
        this.f19622a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean m18589a(CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(catalogProduct, "value");
        return SharedPrefsKtx.m6039h(this.f19622a, "KEY_FOR_TRANSACTION_CATALOG_PRODUCT", catalogProduct, null, 4, null);
    }

    /* renamed from: b */
    public final boolean m18588b(Flyer flyer) {
        Intrinsics.isThisObjectNull(flyer, "value");
        return SharedPrefsKtx.m6039h(this.f19622a, "KEY_FOR_TRANSACTION_FLYER", flyer, null, 4, null);
    }

    /* renamed from: c */
    public final boolean m18587c(Store store) {
        Intrinsics.isThisObjectNull(store, "value");
        return SharedPrefsKtx.m6039h(this.f19622a, "KEY_FOR_TRANSACTION_STORE", store, null, 4, null);
    }

    /* renamed from: d */
    public final void m18586d() {
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_FLYER").apply();
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_CATALOG_PRODUCT").apply();
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_STORE").apply();
    }

    /* renamed from: e */
    public final CatalogProduct m18585e() {
        return (CatalogProduct) SharedPrefsKtx.m6043d(this.f19622a, "KEY_FOR_TRANSACTION_CATALOG_PRODUCT", C6450z.m20906b(CatalogProduct.class), new CatalogProduct(null, 0, null, null, null, null, null, null, null, false, null, null, 0, 0, false, null, 65535, null), null, 8, null);
    }

    /* renamed from: f */
    public final Flyer m18584f() {
        return (Flyer) SharedPrefsKtx.m6043d(this.f19622a, "KEY_FOR_TRANSACTION_FLYER", C6450z.m20906b(Flyer.class), new Flyer(0, null, null, null, null, null, null, 0, 0, null, 1023, null), null, 8, null);
    }

    /* renamed from: g */
    public final Store m18583g() {
        Store store = (Store) SharedPrefsKtx.m6043d(this.f19622a, "KEY_FOR_TRANSACTION_STORE", C6450z.m20906b(Store.class), new Store(0, false, false, null, null, null, null, null, null, 511, null), null, 8, null);
        if (store.m13711f() == -1) {
            return null;
        }
        return store;
    }

    /* renamed from: h */
    public final void m18582h() {
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_CATALOG_PRODUCT").apply();
    }

    /* renamed from: i */
    public final void m18581i() {
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_FLYER").apply();
    }

    /* renamed from: j */
    public final void m18580j() {
        this.f19622a.edit().remove("KEY_FOR_TRANSACTION_STORE").apply();
    }
}
