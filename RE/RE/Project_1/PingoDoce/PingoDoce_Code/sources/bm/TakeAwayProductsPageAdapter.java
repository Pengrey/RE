package bm;

import am.TakeAwayProductListFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import id.InterfaceC6108l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;

/* renamed from: bm.e */
/* loaded from: classes2.dex */
public final class TakeAwayProductsPageAdapter extends FragmentStateAdapter {

    /* renamed from: k */
    private final List f5763k;

    /* renamed from: l */
    private final int f5764l;

    /* renamed from: m */
    private final String f5765m;

    /* renamed from: n */
    private final InterfaceC6108l f5766n;

    /* renamed from: o */
    private final InterfaceC6108l f5767o;

    /* renamed from: p */
    private final Map f5768p;

    /* renamed from: q */
    private TakeAwayFlowData f5769q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayProductsPageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, TakeAwayFlowData takeAwayFlowData, List list, int i, String str, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(list, "categories");
        Intrinsics.isThisObjectNull(str, "pickupDate");
        this.f5763k = list;
        this.f5764l = i;
        this.f5765m = str;
        this.f5766n = interfaceC6108l;
        this.f5767o = interfaceC6108l2;
        this.f5768p = new LinkedHashMap();
        this.f5769q = takeAwayFlowData;
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (!this.f5768p.containsKey(Integer.valueOf(i))) {
            this.f5768p.put(Integer.valueOf(i), TakeAwayProductListFragment.f466I0.m41550a(this.f5769q, ((TakeAwayCategory) this.f5763k.get(i)).m14293a(), this.f5764l, this.f5765m, i == 0, i == 0 ? this.f5766n : null, this.f5767o));
        }
        Object obj = this.f5768p.get(Integer.valueOf(i));
        Intrinsics.ifNullDoSomething(obj);
        return (Fragment) obj;
    }

    /* renamed from: X */
    public final int m35032X(TakeAwayCategory takeAwayCategory) {
        Intrinsics.isThisObjectNull(takeAwayCategory, "category");
        int i = 0;
        for (TakeAwayCategory takeAwayCategory2 : this.f5763k) {
            if (Intrinsics.equals(takeAwayCategory2.m14293a(), takeAwayCategory.m14293a())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Y */
    public final void m35031Y(int i) {
        TakeAwayProductListFragment takeAwayProductListFragment = (TakeAwayProductListFragment) this.f5768p.get(Integer.valueOf(i));
        if (takeAwayProductListFragment != null) {
            takeAwayProductListFragment.mo33458Y0();
        }
    }

    /* renamed from: Z */
    public final void m35030Z(int i, TakeAwayFlowData takeAwayFlowData) {
        Intrinsics.isThisObjectNull(takeAwayFlowData, "data");
        this.f5769q = takeAwayFlowData;
        TakeAwayProductListFragment takeAwayProductListFragment = (TakeAwayProductListFragment) this.f5768p.get(Integer.valueOf(i));
        if (takeAwayProductListFragment != null) {
            takeAwayProductListFragment.m41563K2(takeAwayFlowData);
        }
    }

    /* renamed from: f */
    public int mo29834f() {
        return this.f5763k.size();
    }
}
