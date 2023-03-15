package uk;

import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.EmailManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p278oi.EmailViewModel;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: uk.c */
/* loaded from: classes2.dex */
public final class OnboardingEmailViewModel extends EmailViewModel {

    /* renamed from: R */
    private final EmailManager f28245R;

    /* renamed from: S */
    private final AnalyticsManager f28246S;

    /* renamed from: T */
    private final C7296j0 f28247T;

    /* renamed from: U */
    private OnboardingFlowData f28248U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.OnboardingEmailViewModel", m20196f = "OnboardingEmailViewModel.kt", m20195l = {49}, m20194m = "submitAction")
    /* renamed from: uk.c$a */
    /* loaded from: classes2.dex */
    public static final class C10960a extends AbstractC6757d {

        /* renamed from: A */
        int f28249A;

        /* renamed from: w */
        Object f28250w;

        /* renamed from: x */
        Object f28251x;

        /* renamed from: y */
        /* synthetic */ Object f28252y;

        C10960a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28252y = obj;
            this.f28249A |= Integer.MIN_VALUE;
            return OnboardingEmailViewModel.this.m6720H0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEmailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, EmailManager emailManager, AnalyticsManager analyticsManager, C7296j0 c7296j0) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        this.f28245R = emailManager;
        this.f28246S = analyticsManager;
        this.f28247T = c7296j0;
        this.f28248U = (OnboardingFlowData) m34578S();
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7797f0.f20421b, null, null, null, 14, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7811k.f20435b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        m16923x0().mo166p(this.f28248U.m14716k());
        m16937C0().mo166p(Boolean.TRUE);
    }

    /* renamed from: G0 */
    protected void m6721G0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m6720H0(bd.InterfaceC1886d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof uk.OnboardingEmailViewModel.C10960a
            if (r0 == 0) goto L13
            r0 = r9
            uk.c$a r0 = (uk.OnboardingEmailViewModel.C10960a) r0
            int r1 = r0.f28249A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28249A = r1
            goto L18
        L13:
            uk.c$a r0 = new uk.c$a
            r0.<init>(r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.f28252y
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r6.f28249A
            r7 = 1
            if (r1 == 0) goto L3a
            if (r1 != r7) goto L32
            java.lang.Object r0 = r6.f28251x
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f28250w
            uk.c r1 = (uk.OnboardingEmailViewModel) r1
            p468yc.C13186n.m1453b(r9)
            goto L7a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p468yc.C13186n.m1453b(r9)
            androidx.lifecycle.e0 r9 = r8.m16923x0()
            java.lang.Object r9 = r9.mo172f()
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Lc8
            mg.v r1 = r8.f28245R
            pt.pingodoce.app.data.local.flows.FlowData r2 = r8.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r2 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r2
            java.lang.String r3 = r2.m14715m()
            pt.pingodoce.app.data.local.flows.FlowData r2 = r8.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r2 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r2
            java.lang.String r4 = r2.m14713r()
            pt.pingodoce.app.data.local.flows.FlowData r2 = r8.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r2 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r2
            java.lang.String r5 = r2.m14711t()
            r6.f28250w = r8
            r6.f28251x = r9
            r6.f28249A = r7
            r2 = r9
            java.lang.Object r1 = r1.m18454c(r2, r3, r4, r5, r6)
            if (r1 != r0) goto L77
            return r0
        L77:
            r0 = r9
            r9 = r1
            r1 = r8
        L7a:
            mg.x r9 = (mg.AbstractC7468x) r9
            boolean r2 = r9 instanceof mg.AbstractC7468x.C7472b
            if (r2 == 0) goto La0
            pt.pingodoce.app.data.local.flows.FlowData r9 = r1.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r9 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r9
            java.lang.String r2 = "it"
            p181jd.Intrinsics.checkIfNull(r0, r2)
            r9.m14732H(r0)
            r1.m34576U(r9)
            mg.j0 r0 = r1.f28247T
            r0.m18768d(r9)
            zh.j1 r9 = p494zh.C13852j1.f34960a
            pt.pingodoce.app.data.local.flows.FlowData r0 = r1.m34578S()
            r1.m120B(r9, r0)
            goto Lc8
        La0:
            boolean r0 = r9 instanceof mg.AbstractC7468x.AbstractC7469a.C7470a
            if (r0 == 0) goto Lc8
            mg.a r0 = r1.f28246S
            ng.a$f$m r2 = ng.AnalyticEvents.AbstractC7780f.C7817m.f20441b
            ng.c r3 = ng.EnumC7885c.Error
            ng.b r4 = ng.EnumC7884b.View
            mg.x$a$a r9 = (mg.AbstractC7468x.AbstractC7469a.C7470a) r9
            we.b r5 = r9.m18430a()
            java.lang.String r5 = r5.getMessage()
            r0.mo17630a(r2, r3, r4, r5)
            we.b r9 = r9.m18430a()
            java.lang.String r9 = r9.getMessage()
            if (r9 != 0) goto Lc5
            java.lang.String r9 = ""
        Lc5:
            r1.m16931I0(r7, r9)
        Lc8:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.OnboardingEmailViewModel.m6720H0(bd.d):java.lang.Object");
    }

    /* renamed from: K0 */
    public final void m6719K0() {
        InterfaceC7886d.C7887a.m17629a(this.f28246S, AnalyticEvents.AbstractC7780f.C7814l.f20438b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }
}
