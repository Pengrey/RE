package sj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import dj.ProductListViewModel;
import java.util.List;
import mg.C7256f1;
import mg.C7310l;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p490zd.C13784a;

/* renamed from: sj.g */
/* loaded from: classes2.dex */
public final class FlyerViewModel extends ProductListViewModel {

    /* renamed from: I */
    private final C1436e0 f26659I;

    /* renamed from: J */
    private final LiveData f26660J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyerViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        super(c1459l0, resourcesProvider, c7256f1, c7310l);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        C1436e0 m174a = C13784a.m174a();
        this.f26659I = m174a;
        this.f26660J = m174a;
    }

    /* renamed from: N */
    protected void m8452N() {
    }

    /* renamed from: j0 */
    public LiveData m8451j0() {
        return this.f26660J;
    }

    /* renamed from: w0 */
    public final void m8450w0(List list) {
        Intrinsics.isThisObjectNull(list, "categories");
        this.f26659I.mo166p(list);
    }
}
