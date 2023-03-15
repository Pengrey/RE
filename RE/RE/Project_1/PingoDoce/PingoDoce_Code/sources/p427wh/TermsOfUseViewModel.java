package p427wh;

import androidx.lifecycle.C1459l0;
import kotlinx.coroutines.flow.InterfaceC6785c;
import mg.ConsentsManager;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p494zh.BaseViewModel;

/* renamed from: wh.d */
/* loaded from: classes2.dex */
public final class TermsOfUseViewModel extends BaseViewModel {

    /* renamed from: m */
    private final InterfaceC6785c f32092m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsOfUseViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        this.f32092m = consentsManager.m18564g();
    }

    /* renamed from: L */
    public final InterfaceC6785c m3534L() {
        return this.f32092m;
    }
}
