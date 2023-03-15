package pk;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0577e;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2142f;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7256f1;
import mg.C7405s1;
import mg.PinRecoveryManager;
import module.network.data.remote.models.user.User;
import p014aj.AbstractC0188n;
import p014aj.EnumC0170a;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13869l0;
import p494zh.C13870l1;
import pt.pingodoce.app.data.local.flows.EnumC8682a;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: pk.c */
/* loaded from: classes2.dex */
public final class InsertPinViewModel extends AbstractC0188n {

    /* renamed from: W */
    private final C7256f1 f22269W;

    /* renamed from: X */
    private final C7405s1 f22270X;

    /* renamed from: Y */
    private final C1436e0 f22271Y;

    /* renamed from: Z */
    private OnboardingFlowData f22272Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InsertPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel$1", m20196f = "InsertPinViewModel.kt", m20195l = {68, 69, 75}, m20194m = "invokeSuspend")
    /* renamed from: pk.c$a */
    /* loaded from: classes2.dex */
    public static final class C8639a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ BiometricsManager f22273A;

        /* renamed from: B */
        final /* synthetic */ C0577e f22274B;

        /* renamed from: C */
        final /* synthetic */ AuthManager f22275C;

        /* renamed from: x */
        Object f22276x;

        /* renamed from: y */
        int f22277y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8639a(BiometricsManager biometricsManager, C0577e c0577e, AuthManager authManager, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f22273A = biometricsManager;
            this.f22274B = c0577e;
            this.f22275C = authManager;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8639a(this.f22273A, this.f22274B, this.f22275C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8639a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r6.f22277y
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                p468yc.C13186n.m1453b(r7)
                goto L91
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p468yc.C13186n.m1453b(r7)
                goto L64
            L23:
                java.lang.Object r1 = r6.f22276x
                androidx.lifecycle.e0 r1 = (androidx.lifecycle.C1436e0) r1
                p468yc.C13186n.m1453b(r7)
                goto L41
            L2b:
                p468yc.C13186n.m1453b(r7)
                pk.c r7 = pk.InsertPinViewModel.this
                androidx.lifecycle.e0 r1 = pk.InsertPinViewModel.m14931U0(r7)
                pk.c r7 = pk.InsertPinViewModel.this
                r6.f22276x = r1
                r6.f22277y = r5
                java.lang.Object r7 = pk.InsertPinViewModel.m14927Y0(r7, r6)
                if (r7 != r0) goto L41
                return r0
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r7 = r7 ^ r5
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r7)
                r1.mo166p(r7)
                mg.j r7 = r6.f22273A
                boolean r7 = r7.m18774b()
                if (r7 == 0) goto L7c
                pk.c r7 = pk.InsertPinViewModel.this
                r6.f22276x = r2
                r6.f22277y = r4
                java.lang.Object r7 = pk.InsertPinViewModel.m14927Y0(r7, r6)
                if (r7 != r0) goto L64
                return r0
            L64:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L7c
                androidx.biometric.e r7 = r6.f22274B
                r1 = 255(0xff, float:3.57E-43)
                int r7 = r7.m40226b(r1)
                if (r7 != 0) goto L7c
                pk.c r7 = pk.InsertPinViewModel.this
                r7.m41626f0()
                goto Lac
            L7c:
                mg.e r7 = r6.f22275C
                boolean r7 = r7.m18882n()
                if (r7 == 0) goto Lac
                pk.c r7 = pk.InsertPinViewModel.this
                r6.f22276x = r2
                r6.f22277y = r3
                java.lang.Object r7 = pk.InsertPinViewModel.m14927Y0(r7, r6)
                if (r7 != r0) goto L91
                return r0
            L91:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto Lac
                mg.j r7 = r6.f22273A
                boolean r7 = r7.m18773c()
                if (r7 == 0) goto Lac
                pk.c r7 = pk.InsertPinViewModel.this
                r0 = 0
                r7.m41630b0(r0)
                pk.c r7 = pk.InsertPinViewModel.this
                pk.InsertPinViewModel.m14933S0(r7)
            Lac:
                yc.u r7 = p468yc.C13195u.f34156a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.InsertPinViewModel.C8639a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InsertPinViewModel.kt */
    /* renamed from: pk.c$b */
    /* loaded from: classes2.dex */
    public static final class C8640b extends BiometricPrompt.AbstractC0544a {
        C8640b() {
        }

        /* renamed from: c */
        public void mo40310c(BiometricPrompt.C0545b c0545b) {
            Intrinsics.isThisObjectNull(c0545b, "result");
            super.mo40310c(c0545b);
            if (InsertPinViewModel.m14932T0(InsertPinViewModel.this).m18882n()) {
                InsertPinViewModel.this.m41645J0(true);
            } else {
                InsertPinViewModel.m14925a1(InsertPinViewModel.this, EnumC0170a.Undefined);
            }
        }
    }

    /* compiled from: InsertPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel$onPinCompleted$1", m20196f = "InsertPinViewModel.kt", m20195l = {86}, m20194m = "invokeSuspend")
    /* renamed from: pk.c$c */
    /* loaded from: classes2.dex */
    static final class C8641c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f22280x;

        /* renamed from: z */
        final /* synthetic */ String f22282z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InsertPinViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel$onPinCompleted$1$1", m20196f = "InsertPinViewModel.kt", m20195l = {87, 88}, m20194m = "invokeSuspend")
        /* renamed from: pk.c$c$a */
        /* loaded from: classes2.dex */
        public static final class C8642a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f22283x;

            /* renamed from: y */
            final /* synthetic */ InsertPinViewModel f22284y;

            /* renamed from: z */
            final /* synthetic */ String f22285z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: InsertPinViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel$onPinCompleted$1$1$1", m20196f = "InsertPinViewModel.kt", m20195l = {C0868i.f2983w0}, m20194m = "invokeSuspend")
            /* renamed from: pk.c$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C8643a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                Object f22286x;

                /* renamed from: y */
                int f22287y;

                /* renamed from: z */
                final /* synthetic */ InsertPinViewModel f22288z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8643a(InsertPinViewModel insertPinViewModel, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f22288z = insertPinViewModel;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C8643a(this.f22288z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C8643a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    C1436e0 c1436e0;
                    m34636d = C2116d.m34636d();
                    int i = this.f22287y;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C1436e0 m14931U0 = InsertPinViewModel.m14931U0(this.f22288z);
                        InsertPinViewModel insertPinViewModel = this.f22288z;
                        this.f22286x = m14931U0;
                        this.f22287y = 1;
                        Object m14927Y0 = InsertPinViewModel.m14927Y0(insertPinViewModel, this);
                        if (m14927Y0 == m34636d) {
                            return m34636d;
                        }
                        c1436e0 = m14931U0;
                        obj = m14927Y0;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        c1436e0 = (C1436e0) this.f22286x;
                        C13186n.m1453b(obj);
                    }
                    c1436e0.mo166p(C6755b.m20201a(!((Boolean) obj).booleanValue()));
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8642a(InsertPinViewModel insertPinViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f22284y = insertPinViewModel;
                this.f22285z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8642a(this.f22284y, this.f22285z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8642a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                InterfaceC10574t1 m20158d;
                m34636d = C2116d.m34636d();
                int i = this.f22283x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InsertPinViewModel insertPinViewModel = this.f22284y;
                    this.f22283x = 1;
                    obj = InsertPinViewModel.m14927Y0(insertPinViewModel, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        C13186n.m1453b(obj);
                        return C13195u.f34156a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    InsertPinViewModel insertPinViewModel2 = this.f22284y;
                    String str = this.f22285z;
                    this.f22283x = 2;
                    if (InsertPinViewModel.m14929W0(insertPinViewModel2, str, this) == m34636d) {
                        return m34636d;
                    }
                    return C13195u.f34156a;
                } else if (InsertPinViewModel.m14932T0(this.f22284y).m18879q(this.f22285z)) {
                    InsertPinViewModel.m14921e1(this.f22284y, null, 1, null);
                    return C13195u.f34156a;
                } else {
                    InsertPinViewModel.m14930V0(this.f22284y);
                    InsertPinViewModel.m14926Z0(this.f22284y, true);
                    m20158d = C6772d.m20158d(C1473p0.m36987a(this.f22284y), null, null, new C8643a(this.f22284y, null), 3, null);
                    return m20158d;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8641c(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f22282z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8641c(this.f22282z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8641c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f22280x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InsertPinViewModel insertPinViewModel = InsertPinViewModel.this;
                C8642a c8642a = new C8642a(insertPinViewModel, this.f22282z, null);
                this.f22280x = 1;
                if (InsertPinViewModel.m14928X0(insertPinViewModel, true, c8642a, this) == m34636d) {
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
    /* compiled from: InsertPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel", m20196f = "InsertPinViewModel.kt", m20195l = {C0868i.f2763F0, 112}, m20194m = "proceedWithUserLoginRequest")
    /* renamed from: pk.c$d */
    /* loaded from: classes2.dex */
    public static final class C8644d extends AbstractC6757d {

        /* renamed from: A */
        int f22289A;

        /* renamed from: w */
        Object f22290w;

        /* renamed from: x */
        Object f22291x;

        /* renamed from: y */
        /* synthetic */ Object f22292y;

        C8644d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f22292y = obj;
            this.f22289A |= Integer.MIN_VALUE;
            return InsertPinViewModel.m14929W0(InsertPinViewModel.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InsertPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinViewModel", m20196f = "InsertPinViewModel.kt", m20195l = {194}, m20194m = "shouldLoginInServer")
    /* renamed from: pk.c$e */
    /* loaded from: classes2.dex */
    public static final class C8645e extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f22294w;

        /* renamed from: y */
        int f22296y;

        C8645e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f22294w = obj;
            this.f22296y |= Integer.MIN_VALUE;
            return InsertPinViewModel.m14927Y0(InsertPinViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertPinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, BiometricsManager biometricsManager, C7256f1 c7256f1, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f22269W = c7256f1;
        this.f22270X = c7405s1;
        C1436e0 m37003d = c1459l0.m37003d("_shouldReturnForResult", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…dReturnForResult\", false)");
        this.f22271Y = m37003d;
        C1436e0 m41648G0 = m41648G0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m41648G0.mo166p(string);
        C1436e0 m41649F0 = m41649F0();
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m41649F0.mo166p(string2);
        C1436e0 m41653B0 = m41653B0();
        String string3 = resourcesProvider.m6899a().getString(C2336R.string.error_input_pin_invalid);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        m41653B0.mo166p(string3);
        m41650E0().mo166p(Boolean.TRUE);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8639a(biometricsManager, c0577e, authManager, null), 3, null);
        T mo172f = m41610v0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        String m14750b = ((LoginFlowData) m34578S()).m14750b();
        this.f22272Z = new OnboardingFlowData(m14750b, (String) mo172f, null, null, null, null, null, null, false, false, false, EnumC8682a.LOGIN, ((LoginFlowData) m34578S()).m14751a(), null, null, null, ((LoginFlowData) m34578S()).m14745i(), null, null, 452604, null);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ void m14933S0(InsertPinViewModel insertPinViewModel) {
        insertPinViewModel.m41627e0();
    }

    /* renamed from: T0 */
    public static final /* synthetic */ AuthManager m14932T0(InsertPinViewModel insertPinViewModel) {
        return insertPinViewModel.m41618n0();
    }

    /* renamed from: U0 */
    public static final /* synthetic */ C1436e0 m14931U0(InsertPinViewModel insertPinViewModel) {
        return insertPinViewModel.m41652C0();
    }

    /* renamed from: V0 */
    public static final /* synthetic */ void m14930V0(InsertPinViewModel insertPinViewModel) {
        insertPinViewModel.m41647H0();
    }

    /* renamed from: W0 */
    public static final /* synthetic */ Object m14929W0(InsertPinViewModel insertPinViewModel, String str, InterfaceC1886d interfaceC1886d) {
        return insertPinViewModel.m14917h1(str, interfaceC1886d);
    }

    /* renamed from: X0 */
    public static final /* synthetic */ Object m14928X0(InsertPinViewModel insertPinViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return insertPinViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ Object m14927Y0(InsertPinViewModel insertPinViewModel, InterfaceC1886d interfaceC1886d) {
        return insertPinViewModel.m14915j1(interfaceC1886d);
    }

    /* renamed from: Z0 */
    public static final /* synthetic */ void m14926Z0(InsertPinViewModel insertPinViewModel, boolean z) {
        insertPinViewModel.m41638Q0(z);
    }

    /* renamed from: a1 */
    public static final /* synthetic */ void m14925a1(InsertPinViewModel insertPinViewModel, EnumC0170a enumC0170a) {
        insertPinViewModel.m41637R0(enumC0170a);
    }

    /* renamed from: d1 */
    private final void m14922d1(User user) {
        if (m14914k1()) {
            UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, -1, null, 2, null);
        } else if (user != null) {
            OnboardingFlowData onboardingFlowData = this.f22272Z;
            String m18186f = user.m18186f();
            String m18184i = user.m18184i();
            String m18181m = user.m18181m();
            String m18179r = user.m18179r();
            T mo172f = m41610v0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            this.f22272Z = OnboardingFlowData.m14720f(onboardingFlowData, null, (String) mo172f, null, m18184i, m18181m, null, m18179r, m18186f, false, false, false, null, null, null, null, null, false, null, null, 524069, null);
            if (user.m18194K()) {
                m120B(C13870l1.f34987a, this.f22272Z);
                return;
            }
            BaseViewModel.m119C(this, C13869l0.f34986a, null, 2, null);
            m104v(C2142f.f6177a);
        }
    }

    /* renamed from: e1 */
    static /* synthetic */ void m14921e1(InsertPinViewModel insertPinViewModel, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = null;
        }
        insertPinViewModel.m14922d1(user);
    }

    /* renamed from: g1 */
    private final Object m14918g1(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        if (this.f22269W.m18848M()) {
            Object m18816w = this.f22269W.m18816w(interfaceC1886d);
            m34636d2 = C2116d.m34636d();
            return m18816w == m34636d2 ? m18816w : C13195u.f34156a;
        }
        C7256f1 c7256f1 = this.f22269W;
        Object m18835d = c7256f1.m18835d(c7256f1.m18823p(), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m18835d == m34636d ? m18835d : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* renamed from: h1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m14917h1(java.lang.String r11, bd.InterfaceC1886d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pk.InsertPinViewModel.C8644d
            if (r0 == 0) goto L13
            r0 = r12
            pk.c$d r0 = (pk.InsertPinViewModel.C8644d) r0
            int r1 = r0.f22289A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22289A = r1
            goto L18
        L13:
            pk.c$d r0 = new pk.c$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f22292y
            java.lang.Object r7 = cd.C2111b.m34640d()
            int r1 = r0.f22289A
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L44
            if (r1 == r9) goto L3c
            if (r1 != r8) goto L34
            java.lang.Object r11 = r0.f22291x
            og.a r11 = (p276og.Result) r11
            java.lang.Object r0 = r0.f22290w
            pk.c r0 = (pk.InsertPinViewModel) r0
            p468yc.C13186n.m1453b(r12)
            goto L8c
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            java.lang.Object r11 = r0.f22290w
            pk.c r11 = (pk.InsertPinViewModel) r11
            p468yc.C13186n.m1453b(r12)
            goto L77
        L44:
            p468yc.C13186n.m1453b(r12)
            mg.e r1 = r10.m41618n0()
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            pt.pingodoce.app.data.local.flows.LoginFlowData r12 = (pt.pingodoce.app.data.local.flows.LoginFlowData) r12
            java.lang.String r2 = r12.m14750b()
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            pt.pingodoce.app.data.local.flows.LoginFlowData r12 = (pt.pingodoce.app.data.local.flows.LoginFlowData) r12
            java.lang.String r3 = r12.m14747f()
            pt.pingodoce.app.data.local.flows.FlowData r12 = r10.m34578S()
            pt.pingodoce.app.data.local.flows.LoginFlowData r12 = (pt.pingodoce.app.data.local.flows.LoginFlowData) r12
            pt.pingodoce.app.data.remote.models.response.Consent r5 = r12.m14751a()
            r0.f22290w = r10
            r0.f22289A = r9
            r4 = r11
            r6 = r0
            java.lang.Object r12 = r1.m18876t(r2, r3, r4, r5, r6)
            if (r12 != r7) goto L76
            return r7
        L76:
            r11 = r10
        L77:
            og.a r12 = (p276og.Result) r12
            boolean r1 = r12 instanceof p276og.Result.C8078c
            if (r1 == 0) goto L98
            r0.f22290w = r11
            r0.f22291x = r12
            r0.f22289A = r8
            java.lang.Object r0 = r11.m14918g1(r0)
            if (r0 != r7) goto L8a
            return r7
        L8a:
            r0 = r11
            r11 = r12
        L8c:
            og.a$c r11 = (p276og.Result.C8078c) r11
            java.lang.Object r11 = r11.m16962b()
            module.network.data.remote.models.user.User r11 = (module.network.data.remote.models.user.User) r11
            r0.m14922d1(r11)
            goto Lc7
        L98:
            boolean r0 = r12 instanceof p276og.Result.C8077b
            if (r0 == 0) goto Lc7
            og.a$b r12 = (p276og.Result.C8077b) r12
            java.lang.Throwable r0 = r12.m16964b()
            boolean r0 = r0 instanceof p339rg.PinInvalidException
            if (r0 == 0) goto Lbc
            androidx.lifecycle.e0 r0 = r11.m41653B0()
            java.lang.Throwable r12 = r12.m16964b()
            java.lang.String r12 = r12.getMessage()
            r0.mo166p(r12)
            r11.m41647H0()
            r11.m41638Q0(r9)
            goto Lc7
        Lbc:
            r0 = 0
            r11.m41638Q0(r0)
            java.lang.Throwable r12 = r12.m16964b()
            r11.m109l(r12)
        Lc7:
            yc.u r11 = p468yc.C13195u.f34156a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.InsertPinViewModel.m14917h1(java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if ((r6 == null && !r6.m18194K()) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m14915j1(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pk.InsertPinViewModel.C8645e
            if (r0 == 0) goto L13
            r0 = r6
            pk.c$e r0 = (pk.InsertPinViewModel.C8645e) r0
            int r1 = r0.f22296y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22296y = r1
            goto L18
        L13:
            pk.c$e r0 = new pk.c$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22294w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f22296y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            p468yc.C13186n.m1453b(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p468yc.C13186n.m1453b(r6)
            mg.e r6 = r5.m41618n0()
            boolean r6 = r6.m18882n()
            if (r6 == 0) goto L6b
            pt.pingodoce.app.data.local.flows.FlowData r6 = r5.m34578S()
            pt.pingodoce.app.data.local.flows.LoginFlowData r6 = (pt.pingodoce.app.data.local.flows.LoginFlowData) r6
            boolean r6 = r6.m14745i()
            if (r6 != 0) goto L6b
            mg.s1 r6 = r5.f22270X
            r0.f22296y = r4
            java.lang.Object r6 = r6.m18501i(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            og.a r6 = (p276og.Result) r6
            java.lang.Object r6 = r6.m16966a()
            module.network.data.remote.models.user.User r6 = (module.network.data.remote.models.user.User) r6
            if (r6 == 0) goto L68
            boolean r6 = r6.m18194K()
            if (r6 != 0) goto L68
            r6 = r4
            goto L69
        L68:
            r6 = r3
        L69:
            if (r6 != 0) goto L6c
        L6b:
            r3 = r4
        L6c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.InsertPinViewModel.m14915j1(bd.d):java.lang.Object");
    }

    /* renamed from: k1 */
    private final boolean m14914k1() {
        return Intrinsics.equals(this.f22271Y.mo172f(), Boolean.TRUE);
    }

    /* renamed from: K0 */
    public void m14934K0(String str) {
        Intrinsics.isThisObjectNull(str, "input");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8641c(str, null), 3, null);
    }

    /* renamed from: a */
    public String mo10002a() {
        return ((LoginFlowData) m34578S()).m14750b();
    }

    /* renamed from: b1 */
    public final Object m14924b1(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m18885k = m41618n0().m18885k(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m18885k == m34636d ? m18885k : C13195u.f34156a;
    }

    /* renamed from: c1 */
    public final void m14923c1() {
        m104v(C2146h.f6181a);
        m104v(C2142f.f6177a);
    }

    /* renamed from: f1 */
    public final OnboardingFlowData m14920f1() {
        return this.f22272Z;
    }

    /* renamed from: g0 */
    public BiometricPrompt.AbstractC0544a m14919g0() {
        return new C8640b();
    }

    /* renamed from: i1 */
    public final void m14916i1(boolean z) {
        this.f22271Y.mo166p(Boolean.valueOf(z));
    }
}
