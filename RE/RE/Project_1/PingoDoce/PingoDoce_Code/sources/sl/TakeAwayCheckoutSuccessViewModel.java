package sl;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import ci.C2147i;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: sl.i */
/* loaded from: classes2.dex */
public final class TakeAwayCheckoutSuccessViewModel extends BaseViewModel {

    /* renamed from: m */
    private final InterfaceC6108l f26702m;

    /* renamed from: n */
    private final C1436e0 f26703n;

    /* renamed from: o */
    private final LiveData f26704o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutSuccessViewModel.kt */
    /* renamed from: sl.i$a */
    /* loaded from: classes2.dex */
    public static final class C10252a extends AbstractC6438m implements InterfaceC6108l {
        C10252a() {
            super(1);
        }

        /* renamed from: a */
        public final void m8392a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            TakeAwayCheckoutSuccessViewModel.this.m104v(C2147i.f6182a);
            UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8392a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayCheckoutSuccessViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f26702m = BaseViewModel.m113I(this, 0L, new C10252a(), 1, null);
        C1436e0 m37003d = c1459l0.m37003d("EXTRA_FOR_PICKUP_TAKE_AWAY_ORDER_STATUS", new TakeAwayCheckout(null, null, null, null, 0, null, null, null, null, null, null, false, 4095, null));
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…ATUS, TakeAwayCheckout())");
        this.f26703n = m37003d;
        this.f26704o = m37003d;
    }

    /* renamed from: L */
    public static /* synthetic */ void m8396L(TakeAwayCheckoutSuccessViewModel takeAwayCheckoutSuccessViewModel, View view) {
        m8393O(takeAwayCheckoutSuccessViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m8393O(TakeAwayCheckoutSuccessViewModel takeAwayCheckoutSuccessViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutSuccessViewModel, "this$0");
        takeAwayCheckoutSuccessViewModel.f26702m.mo9587d(C13195u.f34156a);
    }

    /* renamed from: M */
    public final LiveData m8395M() {
        return this.f26704o;
    }

    /* renamed from: N */
    public final View.OnClickListener m8394N() {
        return new View.OnClickListener() { // from class: sl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayCheckoutSuccessViewModel.m8393O(TakeAwayCheckoutSuccessViewModel.this, view);
            }
        };
    }
}
