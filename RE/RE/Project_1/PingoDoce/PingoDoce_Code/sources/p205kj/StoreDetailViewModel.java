package p205kj;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import id.InterfaceC6108l;
import mg.TransactionCacheManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p186jj.ThemedStoreViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: kj.d */
/* loaded from: classes2.dex */
public abstract class StoreDetailViewModel extends ThemedStoreViewModel {

    /* renamed from: t */
    private final C1436e0 f18002t;

    /* renamed from: u */
    private final LiveData f18003u;

    /* renamed from: v */
    private final InterfaceC6108l f18004v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreDetailViewModel.kt */
    /* renamed from: kj.d$a */
    /* loaded from: classes2.dex */
    public static final class C6683a extends AbstractC6438m implements InterfaceC6108l {
        C6683a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20288a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            StoreDetailViewModel storeDetailViewModel = StoreDetailViewModel.this;
            T mo172f = StoreDetailViewModel.m20293X(storeDetailViewModel).mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            storeDetailViewModel.m20292Y((Store) mo172f);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20288a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, TransactionCacheManager transactionCacheManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        Store m18583g = transactionCacheManager.m18583g();
        C1436e0 m37003d = c1459l0.m37003d("EXTRA_FOR_STORE", m18583g == null ? new Store(0, false, false, null, null, null, null, null, null, 511, null) : m18583g);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…he.getStore() ?: Store())");
        this.f18002t = m37003d;
        this.f18003u = m37003d;
        this.f18004v = BaseViewModel.m113I(this, 0L, new C6683a(), 1, null);
        T mo172f = m37003d.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        m20745V((Store) mo172f);
    }

    /* renamed from: W */
    public static /* synthetic */ void m20294W(StoreDetailViewModel storeDetailViewModel, View view) {
        m20290a0(storeDetailViewModel, view);
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m20293X(StoreDetailViewModel storeDetailViewModel) {
        return storeDetailViewModel.f18002t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m20290a0(StoreDetailViewModel storeDetailViewModel, View view) {
        Intrinsics.isThisObjectNull(storeDetailViewModel, "this$0");
        storeDetailViewModel.f18004v.mo9587d(C13195u.f34156a);
    }

    /* renamed from: Y */
    public abstract void m20292Y(Store store);

    /* renamed from: Z */
    public final View.OnClickListener m20291Z() {
        return new View.OnClickListener() { // from class: kj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreDetailViewModel.m20290a0(StoreDetailViewModel.this, view);
            }
        };
    }

    /* renamed from: b0 */
    public final LiveData m20289b0() {
        return this.f18003u;
    }
}
