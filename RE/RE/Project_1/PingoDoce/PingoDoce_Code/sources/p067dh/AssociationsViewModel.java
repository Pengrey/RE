package p067dh;

import androidx.lifecycle.C1459l0;
import mg.LoyaltyCardManager;
import p181jd.Intrinsics;
import p319qi.ManageAssociationsViewModel;
import p378u5.ResourcesProvider;

/* renamed from: dh.c */
/* loaded from: classes2.dex */
public final class AssociationsViewModel extends ManageAssociationsViewModel {

    /* renamed from: x */
    private final LoyaltyCardManager f13276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssociationsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider, loyaltyCardManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f13276x = loyaltyCardManager;
    }

    /* renamed from: N */
    protected void m26460N() {
        m10052Z().mo166p(this.f13276x.m18926t());
    }
}
