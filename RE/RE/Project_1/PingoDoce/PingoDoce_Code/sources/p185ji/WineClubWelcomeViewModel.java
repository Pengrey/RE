package p185ji;

import android.view.View;
import androidx.lifecycle.C1459l0;
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
import p494zh.C13834f3;
import p494zh.C13869l0;

/* renamed from: ji.j0 */
/* loaded from: classes2.dex */
public final class WineClubWelcomeViewModel extends BaseViewModel {

    /* renamed from: m */
    private final AnalyticsManager f17607m;

    /* renamed from: n */
    private final InterfaceC6108l f17608n;

    /* renamed from: o */
    private final InterfaceC6108l f17609o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubWelcomeViewModel.kt */
    /* renamed from: ji.j0$a */
    /* loaded from: classes2.dex */
    public static final class C6491a extends AbstractC6438m implements InterfaceC6108l {
        C6491a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20820a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(WineClubWelcomeViewModel.m20825N(WineClubWelcomeViewModel.this), AnalyticEvents.AbstractC7859g.C7879t.f20502b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            BaseViewModel.m119C(WineClubWelcomeViewModel.this, C13869l0.f34986a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20820a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubWelcomeViewModel.kt */
    /* renamed from: ji.j0$b */
    /* loaded from: classes2.dex */
    public static final class C6492b extends AbstractC6438m implements InterfaceC6108l {
        C6492b() {
            super(1);
        }

        /* renamed from: a */
        public final void m20819a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(WineClubWelcomeViewModel.this, C13834f3.f34942a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20819a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WineClubWelcomeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f17607m = analyticsManager;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7859g.C7878s.f20501b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        this.f17608n = BaseViewModel.m113I(this, 0L, new C6491a(), 1, null);
        this.f17609o = BaseViewModel.m113I(this, 0L, new C6492b(), 1, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m20827L(WineClubWelcomeViewModel wineClubWelcomeViewModel, View view) {
        m20821R(wineClubWelcomeViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m20826M(WineClubWelcomeViewModel wineClubWelcomeViewModel, View view) {
        m20823P(wineClubWelcomeViewModel, view);
    }

    /* renamed from: N */
    public static final /* synthetic */ AnalyticsManager m20825N(WineClubWelcomeViewModel wineClubWelcomeViewModel) {
        return wineClubWelcomeViewModel.f17607m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m20823P(WineClubWelcomeViewModel wineClubWelcomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubWelcomeViewModel, "this$0");
        wineClubWelcomeViewModel.f17608n.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m20821R(WineClubWelcomeViewModel wineClubWelcomeViewModel, View view) {
        Intrinsics.isThisObjectNull(wineClubWelcomeViewModel, "this$0");
        wineClubWelcomeViewModel.f17609o.mo9587d(C13195u.f34156a);
    }

    /* renamed from: O */
    public final View.OnClickListener m20824O() {
        return new View.OnClickListener() { // from class: ji.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubWelcomeViewModel.m20823P(WineClubWelcomeViewModel.this, view);
            }
        };
    }

    /* renamed from: Q */
    public final View.OnClickListener m20822Q() {
        return new View.OnClickListener() { // from class: ji.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubWelcomeViewModel.m20821R(WineClubWelcomeViewModel.this, view);
            }
        };
    }
}
