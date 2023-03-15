package fi;

import androidx.lifecycle.C1459l0;
import fm.C5580d;
import ke.InterfaceC6657b;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;

/* renamed from: fi.g */
/* loaded from: classes2.dex */
public final class BenefitsDetailsBottomSheetFragment implements InterfaceC6657b {

    /* renamed from: a */
    private final ResourcesProvider f15684a;

    /* renamed from: b */
    private final C5580d f15685b;

    public BenefitsDetailsBottomSheetFragment(ResourcesProvider resourcesProvider, C5580d c5580d) {
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c5580d, "zxingHelper");
        this.f15684a = resourcesProvider;
        this.f15685b = c5580d;
    }

    /* renamed from: b */
    public BenefitsDetailsViewModel mo14a(C1459l0 c1459l0) {
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        return new BenefitsDetailsViewModel(c1459l0, this.f15684a, this.f15685b);
    }
}
