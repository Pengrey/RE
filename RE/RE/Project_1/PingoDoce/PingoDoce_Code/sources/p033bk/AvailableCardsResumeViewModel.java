package p033bk;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import module.network.data.remote.models.user.User;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p451xi.AbstractC12995e;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import p494zh.C13873m0;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: bk.e */
/* loaded from: classes2.dex */
public final class AvailableCardsResumeViewModel extends AbstractC12995e {

    /* renamed from: T */
    private final AnalyticsManager f5689T;

    /* renamed from: U */
    private final LoyaltyCardManager f5690U;

    /* renamed from: V */
    private final C7405s1 f5691V;

    /* renamed from: W */
    private final C1436e0 f5692W;

    /* renamed from: X */
    private final boolean f5693X;

    /* renamed from: Y */
    private final InterfaceC6108l f5694Y;

    /* renamed from: Z */
    private final boolean f5695Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvailableCardsResumeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.resume.AvailableCardsResumeViewModel", m20196f = "AvailableCardsResumeViewModel.kt", m20195l = {147}, m20194m = "onSubmit")
    /* renamed from: bk.e$a */
    /* loaded from: classes2.dex */
    public static final class C1931a extends AbstractC6757d {

        /* renamed from: A */
        int f5696A;

        /* renamed from: w */
        Object f5697w;

        /* renamed from: x */
        Object f5698x;

        /* renamed from: y */
        /* synthetic */ Object f5699y;

        C1931a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5699y = obj;
            this.f5696A |= Integer.MIN_VALUE;
            return AvailableCardsResumeViewModel.this.m35108n0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvailableCardsResumeViewModel.kt */
    /* renamed from: bk.e$b */
    /* loaded from: classes2.dex */
    public static final class C1932b extends AbstractC6438m implements InterfaceC6108l {
        C1932b() {
            super(1);
        }

        /* renamed from: a */
        public final void m35107a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (AvailableCardsResumeViewModel.m35113N0(AvailableCardsResumeViewModel.this)) {
                InterfaceC7886d.C7887a.m17629a(AvailableCardsResumeViewModel.m35114M0(AvailableCardsResumeViewModel.this), AnalyticEvents.AbstractC7750e.C7778y.f20403b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            } else {
                InterfaceC7886d.C7887a.m17629a(AvailableCardsResumeViewModel.m35114M0(AvailableCardsResumeViewModel.this), AnalyticEvents.AbstractC7750e.C7776w.f20401b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
            AvailableCardsResumeViewModel availableCardsResumeViewModel = AvailableCardsResumeViewModel.this;
            availableCardsResumeViewModel.m120B(C13873m0.f34989a, availableCardsResumeViewModel.m35119D0());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35107a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableCardsResumeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, analyticsManager);
        List m191m;
        String m14722d;
        List m191m2;
        List m14718i;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f5689T = analyticsManager;
        this.f5690U = loyaltyCardManager;
        this.f5691V = c7405s1;
        C1436e0 c1436e0 = new C1436e0(c1459l0.m37005b("EXTRA_FOR_ONBOARDING_DATA"));
        this.f5692W = c1436e0;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) c1436e0.mo172f();
        Integer valueOf = (onboardingFlowData == null || (m14718i = onboardingFlowData.m14718i()) == null) ? null : Integer.valueOf(m14718i.size());
        Intrinsics.ifNullDoSomething(valueOf);
        boolean z = valueOf.intValue() > 1;
        this.f5693X = z;
        if (z) {
            InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7777x.f20402b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7775v.f20400b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        }
        OnboardingFlowData onboardingFlowData2 = (OnboardingFlowData) c1436e0.mo172f();
        if (onboardingFlowData2 != null) {
            if (onboardingFlowData2.m14735E()) {
                C1436e0 m1978F0 = m1978F0();
                LoyaltyCardResumeViewModel[] loyaltyCardResumeViewModelArr = new LoyaltyCardResumeViewModel[3];
                String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_onboarding_resume_phone);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                loyaltyCardResumeViewModelArr[0] = new LoyaltyCardResumeViewModel(string, onboardingFlowData2.m14723b(), null, false, null, false, false, false, 0, false, null, false, 4092, null);
                String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_onboarding_resume_name);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                User m18502h = c7405s1.m18502h();
                loyaltyCardResumeViewModelArr[1] = new LoyaltyCardResumeViewModel(string2, (m18502h == null || (m14722d = m18502h.m18189c()) == null) ? onboardingFlowData2.m14722d() : m14722d, null, false, null, false, false, false, 0, false, null, false, 4092, null);
                LoyaltyCardResumeViewModel m14719h = onboardingFlowData2.m14719h();
                Intrinsics.ifNullDoSomething(m14719h);
                loyaltyCardResumeViewModelArr[2] = m14719h;
                m191m2 = C13780s.m191m(loyaltyCardResumeViewModelArr);
                m1978F0.mo166p(m191m2);
            } else {
                C1436e0 m1978F02 = m1978F0();
                LoyaltyCardResumeViewModel m14719h2 = onboardingFlowData2.m14719h();
                Intrinsics.ifNullDoSomething(m14719h2);
                m191m = C13780s.m191m(m14719h2);
                m1978F02.mo166p(m191m);
            }
            C1436e0 m1977G0 = m1977G0();
            OnboardingFlowData onboardingFlowData3 = (OnboardingFlowData) c1436e0.mo172f();
            m1977G0.mo166p(onboardingFlowData3 != null ? Boolean.valueOf(onboardingFlowData3.m14714n()) : Boolean.FALSE);
            LoyaltyCardResumeViewModel m14719h3 = onboardingFlowData2.m14719h();
            Intrinsics.ifNullDoSomething(m14719h3);
            onboardingFlowData2.m14725O(new LoyaltyCardProvisory(m14719h3.m12646k(), null, null, 6, null));
        }
        this.f5694Y = BaseViewModel.m113I(this, 0L, new C1932b(), 1, null);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m35116K0(AvailableCardsResumeViewModel availableCardsResumeViewModel, View view) {
        m35109R0(availableCardsResumeViewModel, view);
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m35115L0(View view) {
        m35110Q0(view);
    }

    /* renamed from: M0 */
    public static final /* synthetic */ AnalyticsManager m35114M0(AvailableCardsResumeViewModel availableCardsResumeViewModel) {
        return availableCardsResumeViewModel.f5689T;
    }

    /* renamed from: N0 */
    public static final /* synthetic */ boolean m35113N0(AvailableCardsResumeViewModel availableCardsResumeViewModel) {
        return availableCardsResumeViewModel.f5693X;
    }

    /* renamed from: Q0 */
    private static final void m35110Q0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static final void m35109R0(AvailableCardsResumeViewModel availableCardsResumeViewModel, View view) {
        Intrinsics.isThisObjectNull(availableCardsResumeViewModel, "this$0");
        availableCardsResumeViewModel.f5694Y.mo9587d(C13195u.f34156a);
    }

    /* renamed from: B0 */
    public boolean m35120B0() {
        return this.f5695Z;
    }

    /* renamed from: H0 */
    public View.OnClickListener m35118H0() {
        return View$OnClickListenerC1930d.f5688w;
    }

    /* renamed from: I0 */
    public View.OnClickListener m35117I0() {
        return new View.OnClickListener() { // from class: bk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableCardsResumeViewModel.m35109R0(AvailableCardsResumeViewModel.this, view);
            }
        };
    }

    /* renamed from: O0 */
    public OnboardingFlowData m35119D0() {
        T mo172f = this.f5692W.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        return (OnboardingFlowData) mo172f;
    }

    /* renamed from: P0 */
    public final void m35111P0() {
        if (this.f5693X) {
            InterfaceC7886d.C7887a.m17629a(this.f5689T, AnalyticEvents.AbstractC7780f.C7798f1.f20422b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(this.f5689T, AnalyticEvents.AbstractC7780f.C7783a1.f20407b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARN: Type inference failed for: r12v1, types: [pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory, T] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory, T] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, java.lang.Object] */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m35108n0(bd.InterfaceC1886d r23) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033bk.AvailableCardsResumeViewModel.m35108n0(bd.d):java.lang.Object");
    }
}
