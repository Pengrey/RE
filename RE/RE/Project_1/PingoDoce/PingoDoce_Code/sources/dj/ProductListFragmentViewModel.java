package dj;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7310l;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;

/* renamed from: dj.c */
/* loaded from: classes2.dex */
public final class ProductListFragmentViewModel extends ProductListViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListFragmentViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        super(c1459l0, resourcesProvider, c7256f1, c7310l);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
    }

    /* renamed from: N */
    protected void m26394N() {
        SearchCatalogParameters searchCatalogParameters = (SearchCatalogParameters) m26372o0().mo172f();
        if (searchCatalogParameters != null) {
            m26369r0(searchCatalogParameters);
        }
    }
}
