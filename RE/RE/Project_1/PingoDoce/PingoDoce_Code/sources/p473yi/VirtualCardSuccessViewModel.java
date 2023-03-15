package p473yi;

import android.view.View;
import androidx.lifecycle.C1459l0;
import ci.FlowViewModel;
import id.InterfaceC6108l;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13869l0;

/* renamed from: yi.q */
/* loaded from: classes2.dex */
public final class VirtualCardSuccessViewModel extends FlowViewModel {

    /* renamed from: q */
    private final AnalyticsManager f34233q;

    /* renamed from: r */
    private final InterfaceC6108l f34234r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VirtualCardSuccessViewModel.kt */
    /* renamed from: yi.q$a */
    /* loaded from: classes2.dex */
    public static final class C13462a extends AbstractC6438m implements InterfaceC6108l {
        C13462a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1343a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(VirtualCardSuccessViewModel.this, C13869l0.f34986a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1343a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCardSuccessViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f34233q = analyticsManager;
        this.f34234r = BaseViewModel.m113I(this, 0L, new C13462a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m1347V(VirtualCardSuccessViewModel virtualCardSuccessViewModel, View view) {
        m1345X(virtualCardSuccessViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m1345X(VirtualCardSuccessViewModel virtualCardSuccessViewModel, View view) {
        Intrinsics.isThisObjectNull(virtualCardSuccessViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(virtualCardSuccessViewModel.f34233q, AnalyticEvents.AbstractC7750e.C7756c0.f20381b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        virtualCardSuccessViewModel.f34234r.mo9587d(C13195u.f34156a);
    }

    /* renamed from: W */
    public final View.OnClickListener m1346W() {
        return new View.OnClickListener() { // from class: yi.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualCardSuccessViewModel.m1345X(VirtualCardSuccessViewModel.this, view);
            }
        };
    }

    /* renamed from: Y */
    public final void m1344Y() {
        InterfaceC7886d.C7887a.m17629a(this.f34233q, AnalyticEvents.AbstractC7750e.C7754b0.f20379b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }
}
