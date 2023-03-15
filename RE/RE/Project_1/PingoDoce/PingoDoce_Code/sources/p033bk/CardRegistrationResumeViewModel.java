package p033bk;

import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
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
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p451xi.AbstractC12995e;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.flows.LoyaltyCardFlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: bk.k */
/* loaded from: classes2.dex */
public final class CardRegistrationResumeViewModel extends AbstractC12995e {

    /* renamed from: T */
    private final LoyaltyCardManager f5709T;

    /* renamed from: U */
    private final C7405s1 f5710U;

    /* renamed from: V */
    private final AnalyticsManager f5711V;

    /* renamed from: W */
    private final boolean f5712W;

    /* renamed from: X */
    private C2381h f5713X;

    /* renamed from: Y */
    private final C1436e0 f5714Y;

    /* renamed from: Z */
    private final boolean f5715Z;

    /* renamed from: a0 */
    private final LoyaltyCard.PoupaMaisStatus f5716a0;

    /* compiled from: CardRegistrationResumeViewModel.kt */
    /* renamed from: bk.k$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1937a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5717a;

        static {
            int[] iArr = new int[LoyaltyCard.PoupaMaisStatus.values().length];
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownOwner.ordinal()] = 1;
            iArr[LoyaltyCard.PoupaMaisStatus.Pending.ordinal()] = 2;
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownCard.ordinal()] = 3;
            f5717a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardRegistrationResumeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeViewModel", m20196f = "CardRegistrationResumeViewModel.kt", m20195l = {C0868i.f2763F0}, m20194m = "onSubmit")
    /* renamed from: bk.k$b */
    /* loaded from: classes2.dex */
    public static final class C1938b extends AbstractC6757d {

        /* renamed from: B */
        int f5719B;

        /* renamed from: w */
        Object f5720w;

        /* renamed from: x */
        Object f5721x;

        /* renamed from: y */
        Object f5722y;

        /* renamed from: z */
        /* synthetic */ Object f5723z;

        C1938b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5723z = obj;
            this.f5719B |= Integer.MIN_VALUE;
            return CardRegistrationResumeViewModel.this.m35091n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRegistrationResumeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        List m191m;
        String m14722d;
        List m191m2;
        List m14718i;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f5709T = loyaltyCardManager;
        this.f5710U = c7405s1;
        this.f5711V = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_confirm));
        this.f5713X = c2381h;
        C1436e0 c1436e0 = new C1436e0(c1459l0.m37005b("EXTRA_FOR_ONBOARDING_DATA"));
        this.f5714Y = c1436e0;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) c1436e0.mo172f();
        boolean z = (onboardingFlowData == null || (m14718i = onboardingFlowData.m14718i()) == null || m14718i.size() != 1) ? false : true;
        this.f5715Z = z;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) c1459l0.m37005b("EXTRA_FOR_PPLUS_STATUS");
        poupaMaisStatus = poupaMaisStatus == null ? LoyaltyCard.PoupaMaisStatus.UndefinedStatus : poupaMaisStatus;
        Intrinsics.checkIfNull(poupaMaisStatus, "stateHandle.get<LoyaltyC…aisStatus.UndefinedStatus");
        this.f5716a0 = poupaMaisStatus;
        OnboardingFlowData onboardingFlowData2 = (OnboardingFlowData) c1436e0.mo172f();
        if (onboardingFlowData2 != null) {
            User m18502h = c7405s1.m18502h();
            if (!(m18502h != null && m18502h.m18194K())) {
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7761h.f20386b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            } else if (z) {
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7854y0.f20478b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            } else {
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7792d1.f20416b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            }
            if (onboardingFlowData2.m14735E()) {
                C1436e0 m1978F0 = m1978F0();
                LoyaltyCardResumeViewModel[] loyaltyCardResumeViewModelArr = new LoyaltyCardResumeViewModel[3];
                String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_onboarding_resume_phone);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                loyaltyCardResumeViewModelArr[0] = new LoyaltyCardResumeViewModel(string, onboardingFlowData2.m14723b(), null, false, null, false, false, false, 0, false, null, false, 4092, null);
                String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_onboarding_resume_name);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                User m18502h2 = c7405s1.m18502h();
                loyaltyCardResumeViewModelArr[1] = new LoyaltyCardResumeViewModel(string2, (m18502h2 == null || (m14722d = m18502h2.m18189c()) == null) ? onboardingFlowData2.m14722d() : m14722d, null, false, null, false, false, false, 0, false, null, false, 4092, null);
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
            LoyaltyCardResumeViewModel m14719h3 = onboardingFlowData2.m14719h();
            Intrinsics.ifNullDoSomething(m14719h3);
            onboardingFlowData2.m14725O(new LoyaltyCardProvisory(m14719h3.m12646k(), null, null, 6, null));
            m34576U(new LoyaltyCardFlowData(null, null, onboardingFlowData2.m14737A().m14566e(), false, 11, null));
        }
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m35096K0(CardRegistrationResumeViewModel cardRegistrationResumeViewModel, View view) {
        m35093N0(cardRegistrationResumeViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m35093N0(CardRegistrationResumeViewModel cardRegistrationResumeViewModel, View view) {
        Intrinsics.isThisObjectNull(cardRegistrationResumeViewModel, "this$0");
        if (cardRegistrationResumeViewModel.f5715Z) {
            InterfaceC7886d.C7887a.m17629a(cardRegistrationResumeViewModel.f5711V, AnalyticEvents.AbstractC7780f.C7789c1.f20413b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(cardRegistrationResumeViewModel.f5711V, AnalyticEvents.AbstractC7780f.C7804h1.f20428b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
    }

    /* renamed from: B0 */
    public boolean m35099B0() {
        return this.f5712W;
    }

    /* renamed from: H0 */
    public View.OnClickListener m35097H0() {
        return new View.OnClickListener() { // from class: bk.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardRegistrationResumeViewModel.m35093N0(CardRegistrationResumeViewModel.this, view);
            }
        };
    }

    /* renamed from: L0 */
    public OnboardingFlowData m35098D0() {
        T mo172f = this.f5714Y.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        return (OnboardingFlowData) mo172f;
    }

    /* renamed from: M0 */
    public final void m35094M0() {
        int i = C1937a.f5717a[this.f5716a0.ordinal()];
        if (i == 2) {
            InterfaceC7886d.C7887a.m17629a(this.f5711V, AnalyticEvents.AbstractC7750e.C7762i.f20387b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else if (i != 3) {
        } else {
            InterfaceC7886d.C7887a.m17629a(this.f5711V, AnalyticEvents.AbstractC7750e.C7767n.f20392b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
    }

    /* renamed from: g0 */
    protected C2381h m35092g0() {
        return this.f5713X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m35091n0(bd.InterfaceC1886d r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p033bk.CardRegistrationResumeViewModel.m35091n0(bd.d):java.lang.Object");
    }
}
