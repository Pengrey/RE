package cm;

import am.TakeAwayCartViewModel;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import mg.AnalyticsManager;
import mg.C7347m1;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: cm.f */
/* loaded from: classes2.dex */
public final class TakeAwayProductDetailViewModel extends TakeAwayCartViewModel {

    /* renamed from: T */
    private final C1436e0 f6287T;

    /* renamed from: U */
    private final C1436e0 f6288U;

    /* renamed from: V */
    private final LiveData f6289V;

    /* renamed from: W */
    private final LiveData f6290W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayProductDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        C1436e0 c1436e0 = new C1436e0();
        this.f6287T = c1436e0;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_PRODUCT");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…oduct>(EXTRA_FOR_PRODUCT)");
        this.f6288U = m37004c;
        this.f6289V = m37004c;
        this.f6290W = c1436e0;
        TakeAwayProduct takeAwayProduct = (TakeAwayProduct) m37004c.mo172f();
        if (takeAwayProduct != null) {
            TakeAwayProduct m41576N0 = m41576N0(takeAwayProduct.m14244i());
            takeAwayProduct.m14253N(m41576N0 != null ? m41576N0.m14235w() : 0);
            m37004c.mo166p(takeAwayProduct);
            String m14242k = takeAwayProduct.m14242k();
            c1436e0.mo166p("%s " + m14242k);
        }
    }

    /* renamed from: N */
    protected void m34496N() {
    }

    /* renamed from: Q0 */
    public final LiveData m34495Q0() {
        return this.f6290W;
    }

    /* renamed from: R0 */
    public final LiveData m34494R0() {
        return this.f6289V;
    }

    /* renamed from: S0 */
    public final void m34493S0() {
        T mo172f = this.f6288U.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        TakeAwayProduct m41576N0 = m41576N0(((TakeAwayProduct) mo172f).m14244i());
        if (m41576N0 == null) {
            C1436e0 c1436e0 = this.f6288U;
            T mo172f2 = c1436e0.mo172f();
            Intrinsics.ifNullDoSomething(mo172f2);
            c1436e0.mo166p(TakeAwayProduct.m14249c((TakeAwayProduct) mo172f2, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 229375, null));
            return;
        }
        this.f6288U.mo166p(m41576N0);
    }
}
