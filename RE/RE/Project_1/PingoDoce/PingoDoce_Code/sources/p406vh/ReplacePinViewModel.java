package p406vh;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2137b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.PinRecoveryManager;
import p014aj.NewPinViewModel;
import p181jd.Intrinsics;
import p276og.Result;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: vh.h */
/* loaded from: classes2.dex */
public final class ReplacePinViewModel extends NewPinViewModel {

    /* renamed from: e0 */
    private final String f29144e0;

    /* compiled from: ReplacePinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinViewModel$submitRequest$1", m20196f = "ReplacePinViewModel.kt", m20195l = {61}, m20194m = "invokeSuspend")
    /* renamed from: vh.h$a */
    /* loaded from: classes2.dex */
    static final class C11359a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29145x;

        /* renamed from: z */
        final /* synthetic */ String f29147z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReplacePinViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinViewModel$submitRequest$1$1", m20196f = "ReplacePinViewModel.kt", m20195l = {62}, m20194m = "invokeSuspend")
        /* renamed from: vh.h$a$a */
        /* loaded from: classes2.dex */
        public static final class C11360a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f29148x;

            /* renamed from: y */
            final /* synthetic */ ReplacePinViewModel f29149y;

            /* renamed from: z */
            final /* synthetic */ String f29150z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11360a(ReplacePinViewModel replacePinViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f29149y = replacePinViewModel;
                this.f29150z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C11360a(this.f29149y, this.f29150z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C11360a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29148x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AuthManager m5346g1 = ReplacePinViewModel.m5346g1(this.f29149y);
                    String str = this.f29150z;
                    String m5345h1 = ReplacePinViewModel.m5345h1(this.f29149y);
                    this.f29148x = 1;
                    obj = m5346g1.m18888h(str, m5345h1, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    this.f29149y.m104v(C2137b.f6172a);
                } else if (result instanceof Result.C8077b) {
                    ReplacePinViewModel.m5344i1(this.f29149y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11359a(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29147z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C11359a(this.f29147z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11359a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29145x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ReplacePinViewModel replacePinViewModel = ReplacePinViewModel.this;
                C11360a c11360a = new C11360a(replacePinViewModel, this.f29147z, null);
                this.f29145x = 1;
                if (ReplacePinViewModel.m5343j1(replacePinViewModel, true, c11360a, this) == m34636d) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplacePinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, OAuthManager oAuthManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, authManager, c0577e, pinRecoveryManager, oAuthManager, biometricsManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        String str = (String) c1459l0.m37005b("EXTRA_FOR_TOKEN");
        this.f29144e0 = str == null ? BuildConfig.VERSION_NAME : str;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_pin_title_alt_2);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m41691c1(string);
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_pin_subtitle_alt_2);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m41692b1(string2);
        String string3 = resourcesProvider.m6899a().getString(C2336R.string.lbl_confirm_pin_title_alt_2);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        m41689e1(string3);
        String string4 = resourcesProvider.m6899a().getString(C2336R.string.lbl_confirm_pin_subtitle_alt_2);
        Intrinsics.checkIfNull(string4, "ctx.getString(id)");
        m41690d1(string4);
        m41648G0().mo166p(m41696X0());
        m41649F0().mo166p(m41697W0());
        m41651D0().mo166p(Boolean.TRUE);
    }

    /* renamed from: g1 */
    public static final /* synthetic */ AuthManager m5346g1(ReplacePinViewModel replacePinViewModel) {
        return replacePinViewModel.m41618n0();
    }

    /* renamed from: h1 */
    public static final /* synthetic */ String m5345h1(ReplacePinViewModel replacePinViewModel) {
        return replacePinViewModel.f29144e0;
    }

    /* renamed from: i1 */
    public static final /* synthetic */ void m5344i1(ReplacePinViewModel replacePinViewModel, Throwable th2) {
        replacePinViewModel.m109l(th2);
    }

    /* renamed from: j1 */
    public static final /* synthetic */ Object m5343j1(ReplacePinViewModel replacePinViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return replacePinViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: a */
    public String mo10002a() {
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: f1 */
    public void m5347f1(String str) {
        Intrinsics.isThisObjectNull(str, "newPin");
        if (this.f29144e0.length() > 0) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C11359a(str, null), 3, null);
        }
    }
}
