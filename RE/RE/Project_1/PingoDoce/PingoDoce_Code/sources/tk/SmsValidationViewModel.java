package tk;

import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.LoyaltyCardManager;
import mg.PinRecoveryManager;
import mg.SmsManager;
import module.network.data.remote.models.local.pmCards.LoyaltyCardProvisoryV2;
import module.network.data.remote.models.response.authenticationv2.PmCardsResponse;
import module.network.data.remote.models.user.User;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p181jd.Intrinsics;
import p343rk.SmsTokenViewModel;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p451xi.C12997f;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.Iterables;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import td.InterfaceC10524i0;

/* renamed from: tk.c */
/* loaded from: classes2.dex */
public final class SmsValidationViewModel extends SmsTokenViewModel {

    /* renamed from: Q */
    private final OAuthManager f27390Q;

    /* renamed from: R */
    private final SmsManager f27391R;

    /* renamed from: S */
    private final C7296j0 f27392S;

    /* renamed from: T */
    private final LoyaltyCardManager f27393T;

    /* renamed from: U */
    private final PinRecoveryManager f27394U;

    /* renamed from: V */
    private final C1436e0 f27395V;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsValidationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.validate.SmsValidationViewModel$askForSmsToken$1", m20196f = "SmsValidationViewModel.kt", m20195l = {61}, m20194m = "invokeSuspend")
    /* renamed from: tk.c$a */
    /* loaded from: classes2.dex */
    public static final class C10636a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f27396x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SmsValidationViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.validate.SmsValidationViewModel$askForSmsToken$1$1", m20196f = "SmsValidationViewModel.kt", m20195l = {66, 77}, m20194m = "invokeSuspend")
        /* renamed from: tk.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C10637a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f27398x;

            /* renamed from: y */
            final /* synthetic */ SmsValidationViewModel f27399y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10637a(SmsValidationViewModel smsValidationViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f27399y = smsValidationViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C10637a(this.f27399y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C10637a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r14.f27398x
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r4) goto L1c
                    if (r1 != r2) goto L14
                    p468yc.C13186n.m1453b(r15)
                    goto Lc2
                L14:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1c:
                    p468yc.C13186n.m1453b(r15)
                    goto L61
                L20:
                    p468yc.C13186n.m1453b(r15)
                    tk.c r15 = r14.f27399y
                    r1 = 0
                    p343rk.SmsTokenViewModel.m9666z0(r15, r3, r3, r2, r1)
                    tk.c r15 = r14.f27399y
                    p343rk.SmsTokenViewModel.m9672N0(r15, r3, r1, r2, r1)
                    tk.c r15 = r14.f27399y
                    androidx.lifecycle.e0 r15 = tk.SmsValidationViewModel.m7445R0(r15)
                    java.lang.Object r15 = r15.mo172f()
                    java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r4)
                    boolean r15 = p181jd.Intrinsics.equals(r15, r1)
                    if (r15 == 0) goto L87
                    tk.c r15 = r14.f27399y
                    mg.q0 r15 = tk.SmsValidationViewModel.m7447P0(r15)
                    tk.c r1 = r14.f27399y
                    pt.pingodoce.app.data.local.flows.FlowData r1 = r1.m34578S()
                    pt.pingodoce.app.data.local.flows.PhoneFlowData r1 = (pt.pingodoce.app.data.local.flows.PhoneFlowData) r1
                    java.lang.String r1 = r1.m14701b()
                    java.lang.String r1 = be.UtilsExtensions.m35165g(r1)
                    r14.f27398x = r4
                    java.lang.Object r15 = r15.m18594c(r1, r14)
                    if (r15 != r0) goto L61
                    return r0
                L61:
                    og.a r15 = (p276og.Result) r15
                    boolean r0 = r15 instanceof p276og.Result.C8078c
                    if (r0 == 0) goto L6e
                    tk.c r15 = r14.f27399y
                    tk.SmsValidationViewModel.m7448O0(r15, r4, r4)
                    goto Le6
                L6e:
                    boolean r0 = r15 instanceof p276og.Result.C8077b
                    if (r0 == 0) goto Le6
                    tk.c r0 = r14.f27399y
                    tk.SmsValidationViewModel.m7448O0(r0, r4, r3)
                    tk.c r0 = r14.f27399y
                    og.a$b r15 = (p276og.Result.C8077b) r15
                    java.lang.Throwable r15 = r15.m16964b()
                    java.lang.String r15 = r15.getMessage()
                    tk.SmsValidationViewModel.m7444S0(r0, r4, r15)
                    goto Le6
                L87:
                    tk.c r15 = r14.f27399y
                    mg.h1 r15 = tk.SmsValidationViewModel.m7446Q0(r15)
                    tk.c r1 = r14.f27399y
                    pt.pingodoce.app.data.local.flows.FlowData r1 = r1.m34578S()
                    pt.pingodoce.app.data.local.flows.PhoneFlowData r1 = (pt.pingodoce.app.data.local.flows.PhoneFlowData) r1
                    java.lang.String r1 = r1.m14701b()
                    java.lang.String r1 = be.UtilsExtensions.m35165g(r1)
                    tk.c r5 = r14.f27399y
                    pt.pingodoce.app.data.local.flows.FlowData r5 = r5.m34578S()
                    pt.pingodoce.app.data.local.flows.PhoneFlowData r5 = (pt.pingodoce.app.data.local.flows.PhoneFlowData) r5
                    pt.pingodoce.app.data.remote.models.response.Consent r5 = r5.m14702a()
                    if (r5 != 0) goto Lb9
                    pt.pingodoce.app.data.remote.models.response.Consent r5 = new pt.pingodoce.app.data.remote.models.response.Consent
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 31
                    r13 = 0
                    r6 = r5
                    r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                Lb9:
                    r14.f27398x = r2
                    java.lang.Object r15 = r15.m18786c(r1, r5, r14)
                    if (r15 != r0) goto Lc2
                    return r0
                Lc2:
                    og.a r15 = (p276og.Result) r15
                    boolean r0 = r15 instanceof p276og.Result.C8078c
                    if (r0 == 0) goto Lce
                    tk.c r15 = r14.f27399y
                    tk.SmsValidationViewModel.m7448O0(r15, r4, r4)
                    goto Le6
                Lce:
                    boolean r0 = r15 instanceof p276og.Result.C8077b
                    if (r0 == 0) goto Le6
                    tk.c r0 = r14.f27399y
                    tk.SmsValidationViewModel.m7448O0(r0, r4, r3)
                    tk.c r0 = r14.f27399y
                    og.a$b r15 = (p276og.Result.C8077b) r15
                    java.lang.Throwable r15 = r15.m16964b()
                    java.lang.String r15 = r15.getMessage()
                    tk.SmsValidationViewModel.m7444S0(r0, r4, r15)
                Le6:
                    yc.u r15 = p468yc.C13195u.f34156a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: tk.SmsValidationViewModel.C10636a.C10637a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C10636a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10636a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10636a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27396x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsValidationViewModel smsValidationViewModel = SmsValidationViewModel.this;
                C10637a c10637a = new C10637a(smsValidationViewModel, null);
                this.f27396x = 1;
                if (CoreBaseViewModel.m20383n(smsValidationViewModel, false, c10637a, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsValidationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.validate.SmsValidationViewModel", m20196f = "SmsValidationViewModel.kt", m20195l = {C0868i.f2743B0, C4906j.f13405F0}, m20194m = "onSubmit")
    /* renamed from: tk.c$b */
    /* loaded from: classes2.dex */
    public static final class C10638b extends AbstractC6757d {

        /* renamed from: A */
        int f27400A;

        /* renamed from: w */
        Object f27401w;

        /* renamed from: x */
        Object f27402x;

        /* renamed from: y */
        /* synthetic */ Object f27403y;

        C10638b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27403y = obj;
            this.f27400A |= Integer.MIN_VALUE;
            return SmsValidationViewModel.this.m7441n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsValidationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, OAuthManager oAuthManager, SmsManager smsManager, C7296j0 c7296j0, LoyaltyCardManager loyaltyCardManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(smsManager, "smsManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "cardManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f27390Q = oAuthManager;
        this.f27391R = smsManager;
        this.f27392S = c7296j0;
        this.f27393T = loyaltyCardManager;
        this.f27394U = pinRecoveryManager;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_PIN_RECOVERY");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…>(EXTRA_FOR_PIN_RECOVERY)");
        this.f27395V = m37004c;
    }

    /* renamed from: O0 */
    public static final /* synthetic */ void m7448O0(SmsValidationViewModel smsValidationViewModel, boolean z, boolean z2) {
        smsValidationViewModel.m9667y0(z, z2);
    }

    /* renamed from: P0 */
    public static final /* synthetic */ PinRecoveryManager m7447P0(SmsValidationViewModel smsValidationViewModel) {
        return smsValidationViewModel.f27394U;
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ SmsManager m7446Q0(SmsValidationViewModel smsValidationViewModel) {
        return smsValidationViewModel.f27391R;
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C1436e0 m7445R0(SmsValidationViewModel smsValidationViewModel) {
        return smsValidationViewModel.f27395V;
    }

    /* renamed from: S0 */
    public static final /* synthetic */ void m7444S0(SmsValidationViewModel smsValidationViewModel, boolean z, String str) {
        smsValidationViewModel.m9673M0(z, str);
    }

    /* renamed from: T0 */
    private final OnboardingFlowData m7443T0(String str, User user) {
        int m186r;
        int m186r2;
        OnboardingFlowData onboardingFlowData;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel;
        PmCardsResponse m18925u = this.f27393T.m18925u();
        List<LoyaltyCardProvisoryV2> m18214c = m18925u.m18214c();
        m186r = Iterables.m186r(m18214c, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (LoyaltyCardProvisoryV2 loyaltyCardProvisoryV2 : m18214c) {
            arrayList.add(new LoyaltyCardProvisory(loyaltyCardProvisoryV2.m18253b(), loyaltyCardProvisoryV2.m18254a(), BuildConfig.VERSION_NAME));
        }
        String m14701b = ((PhoneFlowData) m34578S()).m14701b();
        Consent m14702a = ((PhoneFlowData) m34578S()).m14702a();
        if (m14702a == null) {
            m14702a = new Consent(null, null, null, null, null, 31, null);
        }
        OnboardingFlowData onboardingFlowData2 = new OnboardingFlowData(m14701b, null, null, user.m18184i(), user.m18181m(), str, null, null, false, false, !m18925u.m18214c().isEmpty(), null, m14702a, null, null, arrayList, false, null, null, 486342, null);
        if (!m18925u.m18214c().isEmpty()) {
            if (onboardingFlowData2.m14718i().size() > 1) {
                String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                List m1964a = C12997f.m1964a(onboardingFlowData2.m14718i());
                String string2 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                loyaltyCardResumeViewModel = new LoyaltyCardResumeViewModel(string, m1964a, string2);
                onboardingFlowData = onboardingFlowData2;
            } else {
                String string3 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
                Intrinsics.checkIfNull(string3, "ctx.getString(id)");
                List<LoyaltyCardProvisory> m14718i = onboardingFlowData2.m14718i();
                m186r2 = Iterables.m186r(m14718i, 10);
                ArrayList arrayList2 = new ArrayList(m186r2);
                for (LoyaltyCardProvisory loyaltyCardProvisory : m14718i) {
                    arrayList2.add(loyaltyCardProvisory.m14566e());
                }
                String string4 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
                Intrinsics.checkIfNull(string4, "ctx.getString(id)");
                onboardingFlowData = onboardingFlowData2;
                loyaltyCardResumeViewModel = new LoyaltyCardResumeViewModel(string3, (String) C13777q.m256L(arrayList2), string4);
            }
            onboardingFlowData.m14733G(loyaltyCardResumeViewModel);
            return onboardingFlowData;
        }
        return onboardingFlowData2;
    }

    /* renamed from: U0 */
    public final void m7442U0() {
        InterfaceC7886d.C7887a.m17629a(m9684B0(), AnalyticEvents.AbstractC7780f.C7837s1.f20461b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m7441n0(bd.InterfaceC1886d r32) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.SmsValidationViewModel.m7441n0(bd.d):java.lang.Object");
    }

    /* renamed from: x0 */
    public void m7440x0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10636a(null), 3, null);
    }
}
