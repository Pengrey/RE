package hk;

import androidx.lifecycle.C1459l0;
import id.InterfaceC6108l;
import mg.CoachMarkManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p299pj.WalkThroughViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13877n0;

/* renamed from: hk.i */
/* loaded from: classes2.dex */
public final class AppWalkThroughViewModel extends WalkThroughViewModel {

    /* renamed from: r */
    private final InterfaceC6108l f16466r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppWalkThroughViewModel.kt */
    /* renamed from: hk.i$a */
    /* loaded from: classes2.dex */
    public static final class C5960a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ CoachMarkManager f16467w;

        /* renamed from: x */
        final /* synthetic */ AppWalkThroughViewModel f16468x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5960a(CoachMarkManager coachMarkManager, AppWalkThroughViewModel appWalkThroughViewModel) {
            super(1);
            this.f16467w = coachMarkManager;
            this.f16468x = appWalkThroughViewModel;
        }

        /* renamed from: a */
        public final void m22586a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            this.f16467w.m18601w();
            BaseViewModel.m119C(this.f16468x, C13877n0.f34992a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22586a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWalkThroughViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, CoachMarkManager coachMarkManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        this.f16466r = BaseViewModel.m113I(this, 0L, new C5960a(coachMarkManager, this), 1, null);
    }

    /* renamed from: Q */
    protected InterfaceC6108l m22587Q() {
        return this.f16466r;
    }
}
