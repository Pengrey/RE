package pt.pingodoce.app.presentation.takeaway.landing.anonymousSession;

import android.view.View;
import androidx.lifecycle.C1459l0;
import be.OperatorExtensions;
import id.InterfaceC6108l;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.CoachMarkManager;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13888p1;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingViewModel;

/* renamed from: pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.a */
/* loaded from: classes2.dex */
public final class AnonymousSessionTakeAwayLandingViewModel extends BaseViewModel {

    /* renamed from: m */
    private final CoachMarkManager f25008m;

    /* renamed from: n */
    private final InterfaceC6108l f25009n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnonymousSessionTakeAwayLandingViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9508a {
        LOGIN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnonymousSessionTakeAwayLandingViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.a$b */
    /* loaded from: classes2.dex */
    public static final class C9509b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: AnonymousSessionTakeAwayLandingViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.a$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9510a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f25011a;

            static {
                int[] iArr = new int[EnumC9508a.values().length];
                iArr[EnumC9508a.LOGIN.ordinal()] = 1;
                f25011a = iArr;
            }
        }

        C9509b() {
            super(1);
        }

        /* renamed from: a */
        public final void m10870a(EnumC9508a enumC9508a) {
            Intrinsics.isThisObjectNull(enumC9508a, "type");
            if (C9510a.f25011a[enumC9508a.ordinal()] == 1) {
                BaseViewModel.m119C(AnonymousSessionTakeAwayLandingViewModel.this, C13888p1.f35009a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10870a((EnumC9508a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousSessionTakeAwayLandingViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f25008m = coachMarkManager;
        m106t(c7405s1.m18500j());
        this.f25009n = OperatorExtensions.m35176e(0L, null, new C9509b(), 3, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7812k0.f20436b, null, null, null, 14, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m10874L(AnonymousSessionTakeAwayLandingViewModel anonymousSessionTakeAwayLandingViewModel, View view) {
        m10871O(anonymousSessionTakeAwayLandingViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m10871O(AnonymousSessionTakeAwayLandingViewModel anonymousSessionTakeAwayLandingViewModel, View view) {
        Intrinsics.isThisObjectNull(anonymousSessionTakeAwayLandingViewModel, "this$0");
        anonymousSessionTakeAwayLandingViewModel.f25009n.mo9587d(EnumC9508a.LOGIN);
    }

    /* renamed from: M */
    public final boolean m10873M() {
        return !this.f25008m.m18614j();
    }

    /* renamed from: N */
    public final View.OnClickListener m10872N() {
        return new View.OnClickListener() { // from class: rl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousSessionTakeAwayLandingViewModel.m10871O(AnonymousSessionTakeAwayLandingViewModel.this, view);
            }
        };
    }
}
