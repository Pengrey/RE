package dm;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import mg.CoachMarkManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p299pj.WalkThroughViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;

/* renamed from: dm.h */
/* loaded from: classes2.dex */
public final class TakeAwayWalkThroughViewModel extends WalkThroughViewModel {

    /* renamed from: r */
    private final InterfaceC6108l f13357r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayWalkThroughViewModel.kt */
    /* renamed from: dm.h$a */
    /* loaded from: classes2.dex */
    public static final class C4894a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ CoachMarkManager f13358w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4894a(CoachMarkManager coachMarkManager) {
            super(1);
            this.f13358w = coachMarkManager;
        }

        /* renamed from: a */
        public final void m26324a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            this.f13358w.m18602v();
            UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m26324a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayWalkThroughViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, CoachMarkManager coachMarkManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        this.f13357r = BaseViewModel.m113I(this, 0L, new C4894a(coachMarkManager), 1, null);
        C1436e0 m14942S = m14942S();
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_take_away_start);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m14942S.mo166p(string);
    }

    /* renamed from: Q */
    protected InterfaceC6108l m26325Q() {
        return this.f13357r;
    }
}
