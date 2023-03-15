package p280ok;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.EncryptedPrefsManager;
import mg.PinRecoveryManager;
import p014aj.NewPinViewModel;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13877n0;
import td.InterfaceC10524i0;

/* renamed from: ok.c */
/* loaded from: classes2.dex */
public final class RecoverPinViewModel extends NewPinViewModel {

    /* renamed from: e0 */
    private final PinRecoveryManager f20924e0;

    /* renamed from: f0 */
    private final C7405s1 f20925f0;

    /* compiled from: RecoverPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.change.RecoverPinViewModel$submitRequest$1", m20196f = "RecoverPinViewModel.kt", m20195l = {51, 61, 63}, m20194m = "invokeSuspend")
    /* renamed from: ok.c$a */
    /* loaded from: classes2.dex */
    static final class C8097a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f20926x;

        /* renamed from: z */
        final /* synthetic */ String f20928z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RecoverPinViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.change.RecoverPinViewModel$submitRequest$1$result$1", m20196f = "RecoverPinViewModel.kt", m20195l = {52}, m20194m = "invokeSuspend")
        /* renamed from: ok.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C8098a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f20929x;

            /* renamed from: y */
            final /* synthetic */ RecoverPinViewModel f20930y;

            /* renamed from: z */
            final /* synthetic */ String f20931z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8098a(RecoverPinViewModel recoverPinViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f20930y = recoverPinViewModel;
                this.f20931z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8098a(this.f20930y, this.f20931z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8098a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f20929x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PinRecoveryManager m16905j1 = RecoverPinViewModel.m16905j1(this.f20930y);
                    String str = this.f20931z;
                    this.f20929x = 1;
                    obj = m16905j1.m18595b(str, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8097a(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f20928z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8097a(this.f20928z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8097a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r7.f20926x
                r2 = 3
                r3 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                p468yc.C13186n.m1453b(r8)
                goto La4
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                p468yc.C13186n.m1453b(r8)
                goto L6f
            L23:
                p468yc.C13186n.m1453b(r8)
                goto L3c
            L27:
                p468yc.C13186n.m1453b(r8)
                ok.c r8 = p280ok.RecoverPinViewModel.this
                ok.c$a$a r1 = new ok.c$a$a
                java.lang.String r6 = r7.f20928z
                r1.<init>(r8, r6, r3)
                r7.f20926x = r5
                java.lang.Object r8 = p280ok.RecoverPinViewModel.m16902m1(r8, r5, r1, r7)
                if (r8 != r0) goto L3c
                return r0
            L3c:
                og.a r8 = (p276og.Result) r8
                boolean r1 = r8 instanceof p276og.Result.C8078c
                if (r1 == 0) goto L8a
                ok.c r8 = p280ok.RecoverPinViewModel.this
                mg.j r8 = p280ok.RecoverPinViewModel.m16906i1(r8)
                boolean r8 = r8.m18774b()
                if (r8 != 0) goto L54
                ok.c r8 = p280ok.RecoverPinViewModel.this
                p280ok.RecoverPinViewModel.m16908g1(r8)
                goto L60
            L54:
                ok.c r8 = p280ok.RecoverPinViewModel.this
                r8.m16901n1()
                ok.c r8 = p280ok.RecoverPinViewModel.this
                zh.n0 r1 = p494zh.C13877n0.f34992a
                p494zh.BaseViewModel.m119C(r8, r1, r3, r4, r3)
            L60:
                ok.c r8 = p280ok.RecoverPinViewModel.this
                mg.e r8 = p280ok.RecoverPinViewModel.m16907h1(r8)
                r7.f20926x = r4
                java.lang.Object r8 = r8.m18885k(r7)
                if (r8 != r0) goto L6f
                return r0
            L6f:
                ok.c r8 = p280ok.RecoverPinViewModel.this
                mg.s1 r8 = p280ok.RecoverPinViewModel.m16904k1(r8)
                boolean r8 = r8.m18496n()
                if (r8 == 0) goto La4
                ok.c r8 = p280ok.RecoverPinViewModel.this
                mg.e r8 = p280ok.RecoverPinViewModel.m16907h1(r8)
                r7.f20926x = r2
                java.lang.Object r8 = r8.m18874v(r7)
                if (r8 != r0) goto La4
                return r0
            L8a:
                boolean r0 = r8 instanceof p276og.Result.C8077b
                if (r0 == 0) goto La4
                og.a$b r8 = (p276og.Result.C8077b) r8
                java.lang.Throwable r8 = r8.m16964b()
                java.lang.String r8 = r8.getMessage()
                if (r8 == 0) goto L9f
                le.a r0 = p221le.UiEventsLiveData.f18671a
                r0.m19510t(r8)
            L9f:
                ok.c r8 = p280ok.RecoverPinViewModel.this
                p280ok.RecoverPinViewModel.m16903l1(r8)
            La4:
                yc.u r8 = p468yc.C13195u.f34156a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p280ok.RecoverPinViewModel.C8097a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, OAuthManager oAuthManager, EncryptedPrefsManager encryptedPrefsManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, authManager, c0577e, pinRecoveryManager, oAuthManager, biometricsManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f20924e0 = pinRecoveryManager;
        this.f20925f0 = c7405s1;
        Intrinsics.checkIfNull(c1459l0.m37003d("_token", BuildConfig.VERSION_NAME), "stateHandle.getLiveData(\"_token\", \"\")");
        Intrinsics.checkIfNull(c1459l0.m37003d("_email", BuildConfig.VERSION_NAME), "stateHandle.getLiveData(\"_email\", \"\")");
        m104v(C2146h.f6181a);
    }

    /* renamed from: g1 */
    public static final /* synthetic */ void m16908g1(RecoverPinViewModel recoverPinViewModel) {
        recoverPinViewModel.m41627e0();
    }

    /* renamed from: h1 */
    public static final /* synthetic */ AuthManager m16907h1(RecoverPinViewModel recoverPinViewModel) {
        return recoverPinViewModel.m41618n0();
    }

    /* renamed from: i1 */
    public static final /* synthetic */ BiometricsManager m16906i1(RecoverPinViewModel recoverPinViewModel) {
        return recoverPinViewModel.m41614r0();
    }

    /* renamed from: j1 */
    public static final /* synthetic */ PinRecoveryManager m16905j1(RecoverPinViewModel recoverPinViewModel) {
        return recoverPinViewModel.f20924e0;
    }

    /* renamed from: k1 */
    public static final /* synthetic */ C7405s1 m16904k1(RecoverPinViewModel recoverPinViewModel) {
        return recoverPinViewModel.f20925f0;
    }

    /* renamed from: l1 */
    public static final /* synthetic */ void m16903l1(RecoverPinViewModel recoverPinViewModel) {
        recoverPinViewModel.m41643L0();
    }

    /* renamed from: m1 */
    public static final /* synthetic */ Object m16902m1(RecoverPinViewModel recoverPinViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return recoverPinViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: a */
    public String mo10002a() {
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: f1 */
    public void m16909f1(String str) {
        Intrinsics.isThisObjectNull(str, "newPin");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8097a(str, null), 3, null);
    }

    /* renamed from: n1 */
    public final void m16901n1() {
        m104v(C2146h.f6181a);
        BaseViewModel.m119C(this, C13877n0.f34992a, null, 2, null);
    }
}
