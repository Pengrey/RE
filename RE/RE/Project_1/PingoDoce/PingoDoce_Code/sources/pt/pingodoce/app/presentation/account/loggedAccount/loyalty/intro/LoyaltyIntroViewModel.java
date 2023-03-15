package pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro;

import android.view.View;
import androidx.lifecycle.C1459l0;
import be.OperatorExtensions;
import id.InterfaceC6108l;
import mg.AnalyticsManager;
import mg.LoyaltyCardManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13810a3;
import p494zh.C13902t;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroViewModel;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.a */
/* loaded from: classes2.dex */
public final class LoyaltyIntroViewModel extends BaseViewModel {

    /* renamed from: m */
    private final AnalyticsManager f23393m;

    /* renamed from: n */
    private final InterfaceC6108l f23394n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoyaltyIntroViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC8842a {
        VISIT_WEBSITE,
        JOIN_LOYALTY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyIntroViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.a$b */
    /* loaded from: classes2.dex */
    public static final class C8843b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: LoyaltyIntroViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.a$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8844a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23396a;

            static {
                int[] iArr = new int[EnumC8842a.values().length];
                iArr[EnumC8842a.VISIT_WEBSITE.ordinal()] = 1;
                iArr[EnumC8842a.JOIN_LOYALTY.ordinal()] = 2;
                f23396a = iArr;
            }
        }

        C8843b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13478a(EnumC8842a enumC8842a) {
            Intrinsics.isThisObjectNull(enumC8842a, "action");
            int i = C8844a.f23396a[enumC8842a.ordinal()];
            if (i == 1) {
                BaseViewModel.m119C(LoyaltyIntroViewModel.this, C13810a3.f34918a, null, 2, null);
            } else if (i != 2) {
            } else {
                BaseViewModel.m119C(LoyaltyIntroViewModel.this, C13902t.f35023a, null, 2, null);
                InterfaceC7886d.C7887a.m17629a(LoyaltyIntroViewModel.m13484N(LoyaltyIntroViewModel.this), AnalyticEvents.AbstractC7750e.C7773t.f20398b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13478a((EnumC8842a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyIntroViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23393m = analyticsManager;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7772s.f20397b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        m106t(loyaltyCardManager.m18930p());
        this.f23394n = OperatorExtensions.m35176e(0L, null, new C8843b(), 3, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m13486L(LoyaltyIntroViewModel loyaltyIntroViewModel, View view) {
        m13482P(loyaltyIntroViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m13485M(LoyaltyIntroViewModel loyaltyIntroViewModel, View view) {
        m13479S(loyaltyIntroViewModel, view);
    }

    /* renamed from: N */
    public static final /* synthetic */ AnalyticsManager m13484N(LoyaltyIntroViewModel loyaltyIntroViewModel) {
        return loyaltyIntroViewModel.f23393m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m13482P(LoyaltyIntroViewModel loyaltyIntroViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyIntroViewModel, "this$0");
        loyaltyIntroViewModel.f23394n.mo9587d(EnumC8842a.JOIN_LOYALTY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m13479S(LoyaltyIntroViewModel loyaltyIntroViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyIntroViewModel, "this$0");
        loyaltyIntroViewModel.f23394n.mo9587d(EnumC8842a.VISIT_WEBSITE);
    }

    /* renamed from: O */
    public final View.OnClickListener m13483O() {
        return new View.OnClickListener() { // from class: gh.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyIntroViewModel.m13482P(LoyaltyIntroViewModel.this, view);
            }
        };
    }

    /* renamed from: Q */
    public final void m13481Q() {
        InterfaceC7886d.C7887a.m17629a(this.f23393m, AnalyticEvents.AbstractC7750e.C7774u.f20399b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: R */
    public final View.OnClickListener m13480R() {
        return new View.OnClickListener() { // from class: gh.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyIntroViewModel.m13479S(LoyaltyIntroViewModel.this, view);
            }
        };
    }
}
