package p475yk;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.EmailManager;
import mg.NifManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p495zi.NifViewModel;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import td.InterfaceC10524i0;

/* renamed from: yk.c */
/* loaded from: classes2.dex */
public final class OnboardingNifViewModel extends NifViewModel {

    /* renamed from: T */
    private final NifManager f34244T;

    /* renamed from: U */
    private final C7296j0 f34245U;

    /* renamed from: V */
    private final EmailManager f34246V;

    /* renamed from: W */
    private final AnalyticsManager f34247W;

    /* renamed from: X */
    private final OnboardingFlowData f34248X;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel", m20196f = "OnboardingNifViewModel.kt", m20195l = {80}, m20194m = "getLoyaltyCards")
    /* renamed from: yk.c$a */
    /* loaded from: classes2.dex */
    public static final class C13469a extends AbstractC6757d {

        /* renamed from: w */
        Object f34249w;

        /* renamed from: x */
        /* synthetic */ Object f34250x;

        /* renamed from: z */
        int f34252z;

        C13469a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f34250x = obj;
            this.f34252z |= Integer.MIN_VALUE;
            return OnboardingNifViewModel.m1322Q0(OnboardingNifViewModel.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel$getLoyaltyCards$response$1", m20196f = "OnboardingNifViewModel.kt", m20195l = {80}, m20194m = "invokeSuspend")
    /* renamed from: yk.c$b */
    /* loaded from: classes2.dex */
    public static final class C13470b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f34253x;

        C13470b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C13470b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C13470b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f34253x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7296j0 m1321R0 = OnboardingNifViewModel.m1321R0(OnboardingNifViewModel.this);
                this.f34253x = 1;
                obj = m1321R0.m18771a(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* compiled from: OnboardingNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel$skipAction$1", m20196f = "OnboardingNifViewModel.kt", m20195l = {50}, m20194m = "invokeSuspend")
    /* renamed from: yk.c$c */
    /* loaded from: classes2.dex */
    static final class C13471c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f34255x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingNifViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel$skipAction$1$1", m20196f = "OnboardingNifViewModel.kt", m20195l = {51}, m20194m = "invokeSuspend")
        /* renamed from: yk.c$c$a */
        /* loaded from: classes2.dex */
        public static final class C13472a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f34257x;

            /* renamed from: y */
            final /* synthetic */ OnboardingNifViewModel f34258y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13472a(OnboardingNifViewModel onboardingNifViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f34258y = onboardingNifViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13472a(this.f34258y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13472a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f34257x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    OnboardingNifViewModel onboardingNifViewModel = this.f34258y;
                    this.f34257x = 1;
                    if (OnboardingNifViewModel.m1319T0(onboardingNifViewModel, this) == m34636d) {
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

        C13471c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13471c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13471c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f34255x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingNifViewModel onboardingNifViewModel = OnboardingNifViewModel.this;
                C13472a c13472a = new C13472a(onboardingNifViewModel, null);
                this.f34255x = 1;
                if (OnboardingNifViewModel.m1320S0(onboardingNifViewModel, true, c13472a, this) == m34636d) {
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
    /* compiled from: OnboardingNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel", m20196f = "OnboardingNifViewModel.kt", m20195l = {58, 63}, m20194m = "submitAction")
    /* renamed from: yk.c$d */
    /* loaded from: classes2.dex */
    public static final class C13473d extends AbstractC6757d {

        /* renamed from: A */
        int f34259A;

        /* renamed from: w */
        Object f34260w;

        /* renamed from: x */
        Object f34261x;

        /* renamed from: y */
        /* synthetic */ Object f34262y;

        C13473d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f34262y = obj;
            this.f34259A |= Integer.MIN_VALUE;
            return OnboardingNifViewModel.this.m1323N0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifViewModel", m20196f = "OnboardingNifViewModel.kt", m20195l = {72, 73}, m20194m = "validateEmailAndNavigate")
    /* renamed from: yk.c$e */
    /* loaded from: classes2.dex */
    public static final class C13474e extends AbstractC6757d {

        /* renamed from: w */
        Object f34264w;

        /* renamed from: x */
        /* synthetic */ Object f34265x;

        /* renamed from: z */
        int f34267z;

        C13474e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f34265x = obj;
            this.f34267z |= Integer.MIN_VALUE;
            return OnboardingNifViewModel.m1319T0(OnboardingNifViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNifViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, NifManager nifManager, C7296j0 c7296j0, EmailManager emailManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(nifManager, "nifManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f34244T = nifManager;
        this.f34245U = c7296j0;
        this.f34246V = emailManager;
        this.f34247W = analyticsManager;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) m34578S();
        this.f34248X = onboardingFlowData;
        m84C0().mo166p(onboardingFlowData.m14711t());
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7809j0.f20433b, null, null, null, 14, null);
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ Object m1322Q0(OnboardingNifViewModel onboardingNifViewModel, InterfaceC1886d interfaceC1886d) {
        return onboardingNifViewModel.m1318U0(interfaceC1886d);
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C7296j0 m1321R0(OnboardingNifViewModel onboardingNifViewModel) {
        return onboardingNifViewModel.f34245U;
    }

    /* renamed from: S0 */
    public static final /* synthetic */ Object m1320S0(OnboardingNifViewModel onboardingNifViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return onboardingNifViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: T0 */
    public static final /* synthetic */ Object m1319T0(OnboardingNifViewModel onboardingNifViewModel, InterfaceC1886d interfaceC1886d) {
        return onboardingNifViewModel.m1316W0(interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m1318U0(bd.InterfaceC1886d r32) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p475yk.OnboardingNifViewModel.m1318U0(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m1316W0(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p475yk.OnboardingNifViewModel.C13474e
            if (r0 == 0) goto L13
            r0 = r6
            yk.c$e r0 = (p475yk.OnboardingNifViewModel.C13474e) r0
            int r1 = r0.f34267z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34267z = r1
            goto L18
        L13:
            yk.c$e r0 = new yk.c$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34265x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f34267z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r6)
            goto L76
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f34264w
            yk.c r2 = (p475yk.OnboardingNifViewModel) r2
            p468yc.C13186n.m1453b(r6)
            goto L62
        L3c:
            p468yc.C13186n.m1453b(r6)
            pt.pingodoce.app.data.local.flows.FlowData r6 = r5.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r6 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r6
            java.lang.String r6 = r6.m14716k()
            int r6 = r6.length()
            if (r6 <= 0) goto L51
            r6 = r4
            goto L52
        L51:
            r6 = 0
        L52:
            if (r6 == 0) goto L79
            mg.v r6 = r5.f34246V
            r0.f34264w = r5
            r0.f34267z = r4
            java.lang.Object r6 = r6.m18456a(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r2 = r5
        L62:
            mg.x$b r4 = mg.AbstractC7468x.C7472b.f19757a
            boolean r6 = p181jd.Intrinsics.equals(r6, r4)
            if (r6 == 0) goto L7a
            r6 = 0
            r0.f34264w = r6
            r0.f34267z = r3
            java.lang.Object r6 = r2.m1318U0(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L79:
            r2 = r5
        L7a:
            zh.i1 r6 = p494zh.C13847i1.f34955a
            pt.pingodoce.app.data.local.flows.FlowData r0 = r2.m34578S()
            r2.m120B(r6, r0)
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p475yk.OnboardingNifViewModel.m1316W0(bd.d):java.lang.Object");
    }

    /* renamed from: K0 */
    protected void m1324K0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13471c(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1323N0(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p475yk.OnboardingNifViewModel.C13473d
            if (r0 == 0) goto L13
            r0 = r8
            yk.c$d r0 = (p475yk.OnboardingNifViewModel.C13473d) r0
            int r1 = r0.f34259A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34259A = r1
            goto L18
        L13:
            yk.c$d r0 = new yk.c$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34262y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f34259A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r8)
            goto L9a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f34261x
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.f34260w
            yk.c r5 = (p475yk.OnboardingNifViewModel) r5
            p468yc.C13186n.m1453b(r8)
            goto L60
        L40:
            p468yc.C13186n.m1453b(r8)
            androidx.lifecycle.e0 r8 = r7.m84C0()
            java.lang.Object r8 = r8.mo172f()
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L9a
            mg.f0 r8 = r7.f34244T
            r0.f34260w = r7
            r0.f34261x = r2
            r0.f34259A = r4
            java.lang.Object r8 = r8.m18861a(r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r5 = r7
        L60:
            mg.h0 r8 = (mg.AbstractC7286h0) r8
            boolean r6 = r8 instanceof mg.AbstractC7286h0.C7288b
            if (r6 == 0) goto L85
            pt.pingodoce.app.data.local.flows.FlowData r8 = r5.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r8 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r8
            java.lang.String r4 = "it"
            p181jd.Intrinsics.checkIfNull(r2, r4)
            r8.m14728L(r2)
            r5.m34576U(r8)
            r8 = 0
            r0.f34260w = r8
            r0.f34261x = r8
            r0.f34259A = r3
            java.lang.Object r8 = r5.m1316W0(r0)
            if (r8 != r1) goto L9a
            return r1
        L85:
            boolean r0 = r8 instanceof mg.AbstractC7286h0.AbstractC7287a
            if (r0 == 0) goto L9a
            mg.h0$a r8 = (mg.AbstractC7286h0.AbstractC7287a) r8
            we.b r8 = r8.m18789a()
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L97
            java.lang.String r8 = ""
        L97:
            r5.m72O0(r4, r8)
        L9a:
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p475yk.OnboardingNifViewModel.m1323N0(bd.d):java.lang.Object");
    }

    /* renamed from: V0 */
    public final void m1317V0() {
        InterfaceC7886d.C7887a.m17629a(this.f34247W, AnalyticEvents.AbstractC7780f.C7850x.f20474b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }
}
