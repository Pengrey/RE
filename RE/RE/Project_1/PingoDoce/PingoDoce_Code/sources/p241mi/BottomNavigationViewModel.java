package p241mi;

import android.view.MenuItem;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import be.OperatorExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import mg.C7256f1;
import mg.C7347m1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13833f2;
import p494zh.C13869l0;
import p494zh.C13875m2;
import p494zh.C13916w1;

/* renamed from: mi.a */
/* loaded from: classes2.dex */
public final class BottomNavigationViewModel extends BaseViewModel {

    /* renamed from: m */
    private final C7256f1 f19781m;

    /* renamed from: n */
    private final C7347m1 f19782n;

    /* renamed from: o */
    private final C1436e0 f19783o;

    /* renamed from: p */
    private final C1436e0 f19784p;

    /* renamed from: q */
    private final C1436e0 f19785q;

    /* renamed from: r */
    private final LiveData f19786r;

    /* renamed from: s */
    private final InterfaceC6108l f19787s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomNavigationViewModel.kt */
    /* renamed from: mi.a$a */
    /* loaded from: classes2.dex */
    public static final class C7482a extends AbstractC6438m implements InterfaceC6108l {
        C7482a() {
            super(1);
        }

        /* renamed from: a */
        public final void m18389a(MenuItem menuItem) {
            Intrinsics.isThisObjectNull(menuItem, "menuItem");
            switch (menuItem.getItemId()) {
                case C2336R.C2338id.navigation_home /* 2131362627 */:
                    BaseViewModel.m119C(BottomNavigationViewModel.this, C13869l0.f34986a, null, 2, null);
                    return;
                case C2336R.C2338id.navigation_promo /* 2131362628 */:
                    BaseViewModel.m119C(BottomNavigationViewModel.this, C13916w1.f35037a, null, 2, null);
                    return;
                case C2336R.C2338id.navigation_shoplist /* 2131362629 */:
                    BaseViewModel.m119C(BottomNavigationViewModel.this, C13833f2.f34941a, null, 2, null);
                    return;
                case C2336R.C2338id.navigation_takeaway /* 2131362630 */:
                    BaseViewModel.m119C(BottomNavigationViewModel.this, C13875m2.f34991a, null, 2, null);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m18389a((MenuItem) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        this.f19781m = c7256f1;
        this.f19782n = c7347m1;
        C1436e0 m37003d = c1459l0.m37003d("_isListBadgeVisible", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…ListBadgeVisible\", false)");
        this.f19783o = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_listBadgeCount", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<…g>(\"_listBadgeCount\", \"\")");
        this.f19784p = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_ordersBadgeCount", Integer.valueOf(c7347m1.m18680l().size()));
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<…LastFetchedOrders().size)");
        this.f19785q = m37003d3;
        this.f19786r = m37003d3;
        this.f19787s = OperatorExtensions.m35177d(0L, C1473p0.m36987a(this), new C7482a());
    }

    /* renamed from: L */
    private final C13195u m18394L() {
        String str = (String) this.f19784p.mo172f();
        if (str != null) {
            this.f19783o.mo166p(Boolean.valueOf(Integer.parseInt(str) > 0));
            return C13195u.f34156a;
        }
        return null;
    }

    /* renamed from: M */
    public final LiveData m18393M() {
        return this.f19786r;
    }

    /* renamed from: N */
    public final void m18392N(int i) {
        this.f19784p.mo166p(i > 99 ? "+99" : String.valueOf(i));
        m18394L();
    }

    /* renamed from: O */
    public final boolean m18391O(MenuItem menuItem) {
        Intrinsics.isThisObjectNull(menuItem, "menuItem");
        this.f19787s.mo9587d(menuItem);
        return true;
    }

    /* renamed from: P */
    public final void m18390P() {
        m18392N(this.f19781m.m18814y());
        this.f19785q.mo166p(Integer.valueOf(this.f19782n.m18680l().size()));
    }
}
