package am;

import androidx.lifecycle.C1459l0;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.ArrayList;
import java.util.List;
import mg.AnalyticsManager;
import mg.C7347m1;
import p181jd.Intrinsics;
import p241mi.C7485d;
import p378u5.ResourcesProvider;
import pl.TakeAwayCheckoutViewModel;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: am.a */
/* loaded from: classes2.dex */
public abstract class TakeAwayCartViewModel extends TakeAwayCheckoutViewModel {

    /* renamed from: S */
    private final C7347m1 f461S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayCartViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f461S = c7347m1;
    }

    /* renamed from: O0 */
    private final void m41575O0() {
        C7485d.f19794a.m18382b(this.f461S.m18685g());
    }

    /* renamed from: L0 */
    public final void m41578L0(TakeAwayProduct takeAwayProduct, int i) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        m14844v0(TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, i, 0, takeAwayProduct.m14235w(), 98303, null));
        m41575O0();
    }

    /* renamed from: M0 */
    public final boolean m41577M0(TakeAwayProduct takeAwayProduct, int i, boolean z) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        boolean z2 = i < takeAwayProduct.m14235w();
        if ((10 < i || 30 < this.f461S.m18685g()) && !z2) {
            if (z) {
                String string = m20390g().m6899a().getString(C2336R.string.lbl_max_allowed_products_reached);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                m20382o(string);
            }
            return false;
        }
        return true;
    }

    /* renamed from: N0 */
    public final TakeAwayProduct m41576N0(int i) {
        return this.f461S.m18686f(i);
    }

    /* renamed from: P0 */
    public final List m41574P0(List list) {
        Intrinsics.isThisObjectNull(list, "value");
        ArrayList arrayList = new ArrayList();
        ArrayList<TakeAwayProduct> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof TakeAwayProduct) {
                arrayList2.add(obj);
            }
        }
        for (TakeAwayProduct takeAwayProduct : arrayList2) {
            TakeAwayProduct m41576N0 = m41576N0(takeAwayProduct.m14244i());
            arrayList.add(TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, m41576N0 != null ? m41576N0.m14235w() : 0, 0, 0, 229375, null));
        }
        return arrayList;
    }
}
