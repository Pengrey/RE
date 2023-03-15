package fj;

import androidx.lifecycle.C1459l0;
import ke.InterfaceC6657b;
import mg.C7256f1;
import mg.C7310l;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;

/* renamed from: fj.k */
/* loaded from: classes2.dex */
public final class FiltersBottomSheetFragment implements InterfaceC6657b {

    /* renamed from: a */
    private final ResourcesProvider f15705a;

    /* renamed from: b */
    private final C7256f1 f15706b;

    /* renamed from: c */
    private final C7310l f15707c;

    public FiltersBottomSheetFragment(ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        this.f15705a = resourcesProvider;
        this.f15706b = c7256f1;
        this.f15707c = c7310l;
    }

    /* renamed from: b */
    public FiltersViewModel mo14a(C1459l0 c1459l0) {
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        return new FiltersViewModel(c1459l0, this.f15705a, this.f15706b, this.f15707c);
    }
}
