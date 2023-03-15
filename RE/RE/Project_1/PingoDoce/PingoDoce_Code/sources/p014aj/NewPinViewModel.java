package p014aj;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0577e;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.PinRecoveryManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.FlowData;
import td.C10565r0;
import td.InterfaceC10524i0;

/* renamed from: aj.c */
/* loaded from: classes2.dex */
public abstract class NewPinViewModel<F extends FlowData> extends AbstractC0188n {

    /* renamed from: W */
    private final AnalyticsManager f359W;

    /* renamed from: X */
    private String f360X;

    /* renamed from: Y */
    private String f361Y;

    /* renamed from: Z */
    private String f362Z;

    /* renamed from: a0 */
    private String f363a0;

    /* renamed from: b0 */
    private String f364b0;

    /* renamed from: c0 */
    private final C1436e0 f365c0;

    /* renamed from: d0 */
    private LiveData f366d0;

    /* compiled from: NewPinViewModel.kt */
    /* renamed from: aj.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC0171a {
        PASSWORD_CREATION,
        PASSWORD_CONFIRMATION
    }

    /* compiled from: NewPinViewModel.kt */
    /* renamed from: aj.c$b */
    /* loaded from: classes2.dex */
    public static final class C0172b extends BiometricPrompt.AbstractC0544a {
        C0172b() {
        }

        /* renamed from: c */
        public void mo40310c(BiometricPrompt.C0545b c0545b) {
            Intrinsics.isThisObjectNull(c0545b, "result");
            super.mo40310c(c0545b);
            NewPinViewModel.this.m41614r0().m18772d(true);
            NewPinViewModel.this.m41637R0(EnumC0170a.Undefined);
        }
    }

    /* compiled from: NewPinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.pin.NewPinViewModel$onPinCompleted$1", m20196f = "NewPinViewModel.kt", m20195l = {64, 81}, m20194m = "invokeSuspend")
    /* renamed from: aj.c$c */
    /* loaded from: classes2.dex */
    static final class C0173c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f368x;

        /* renamed from: z */
        final /* synthetic */ String f370z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0173c(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f370z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0173c(this.f370z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0173c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f368x;
            if (i == 0) {
                C13186n.m1453b(obj);
                if (NewPinViewModel.m41700T0(NewPinViewModel.this).length() == 0) {
                    this.f368x = 1;
                    if (C10565r0.m7677a(200L, this) == m34636d) {
                        return m34636d;
                    }
                    NewPinViewModel.m41698V0(NewPinViewModel.this, this.f370z);
                    NewPinViewModel.this.m41610v0().mo166p(BuildConfig.VERSION_NAME);
                    InterfaceC7886d.C7887a.m17629a(NewPinViewModel.m41701S0(NewPinViewModel.this), AnalyticEvents.AbstractC7780f.C7839t0.f20463b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                    NewPinViewModel.m41699U0(NewPinViewModel.this).mo166p(EnumC0171a.PASSWORD_CONFIRMATION);
                    NewPinViewModel.this.m41648G0().mo166p(NewPinViewModel.this.m41694Z0());
                    NewPinViewModel.this.m41649F0().mo166p(NewPinViewModel.this.m41695Y0());
                } else if (Intrinsics.equals(this.f370z, NewPinViewModel.m41700T0(NewPinViewModel.this))) {
                    NewPinViewModel.this.m41688f1(this.f370z);
                    NewPinViewModel.this.m41637R0(EnumC0170a.Undefined);
                } else {
                    this.f368x = 2;
                    if (C10565r0.m7677a(200L, this) == m34636d) {
                        return m34636d;
                    }
                    NewPinViewModel.this.m41648G0().mo166p(NewPinViewModel.this.m41696X0());
                    NewPinViewModel.this.m41649F0().mo166p(NewPinViewModel.this.m41697W0());
                    NewPinViewModel.m41698V0(NewPinViewModel.this, BuildConfig.VERSION_NAME);
                    NewPinViewModel.this.m41647H0();
                }
            } else if (i == 1) {
                C13186n.m1453b(obj);
                NewPinViewModel.m41698V0(NewPinViewModel.this, this.f370z);
                NewPinViewModel.this.m41610v0().mo166p(BuildConfig.VERSION_NAME);
                InterfaceC7886d.C7887a.m17629a(NewPinViewModel.m41701S0(NewPinViewModel.this), AnalyticEvents.AbstractC7780f.C7839t0.f20463b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                NewPinViewModel.m41699U0(NewPinViewModel.this).mo166p(EnumC0171a.PASSWORD_CONFIRMATION);
                NewPinViewModel.this.m41648G0().mo166p(NewPinViewModel.this.m41694Z0());
                NewPinViewModel.this.m41649F0().mo166p(NewPinViewModel.this.m41695Y0());
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
                NewPinViewModel.this.m41648G0().mo166p(NewPinViewModel.this.m41696X0());
                NewPinViewModel.this.m41649F0().mo166p(NewPinViewModel.this.m41697W0());
                NewPinViewModel.m41698V0(NewPinViewModel.this, BuildConfig.VERSION_NAME);
                NewPinViewModel.this.m41647H0();
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, BiometricsManager biometricsManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f359W = analyticsManager;
        this.f360X = BuildConfig.VERSION_NAME;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_pin_title_alt_2);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        this.f361Y = string;
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_pin_subtitle_alt_2);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        this.f362Z = string2;
        String string3 = resourcesProvider.m6899a().getString(C2336R.string.lbl_confirm_pin_title_alt_2);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        this.f363a0 = string3;
        String string4 = resourcesProvider.m6899a().getString(C2336R.string.lbl_confirm_pin_subtitle_alt_2);
        Intrinsics.checkIfNull(string4, "ctx.getString(id)");
        this.f364b0 = string4;
        C1436e0 m37003d = c1459l0.m37003d("_stepNumber", EnumC0171a.PASSWORD_CREATION);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…NUMBER.PASSWORD_CREATION)");
        this.f365c0 = m37003d;
        this.f366d0 = m37003d;
        m41648G0().mo166p(this.f361Y);
        m41649F0().mo166p(this.f362Z);
        C1436e0 m41653B0 = m41653B0();
        String string5 = resourcesProvider.m6899a().getString(C2336R.string.error_input_pin_no_match);
        Intrinsics.checkIfNull(string5, "ctx.getString(id)");
        m41653B0.mo166p(string5);
        m41652C0().mo166p(Boolean.FALSE);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ AnalyticsManager m41701S0(NewPinViewModel newPinViewModel) {
        return newPinViewModel.f359W;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ String m41700T0(NewPinViewModel newPinViewModel) {
        return newPinViewModel.f360X;
    }

    /* renamed from: U0 */
    public static final /* synthetic */ C1436e0 m41699U0(NewPinViewModel newPinViewModel) {
        return newPinViewModel.f365c0;
    }

    /* renamed from: V0 */
    public static final /* synthetic */ void m41698V0(NewPinViewModel newPinViewModel, String str) {
        newPinViewModel.f360X = str;
    }

    /* renamed from: K0 */
    public void m41702K0(String str) {
        Intrinsics.isThisObjectNull(str, "input");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C0173c(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public final String m41697W0() {
        return this.f362Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public final String m41696X0() {
        return this.f361Y;
    }

    /* renamed from: Y0 */
    protected final String m41695Y0() {
        return this.f364b0;
    }

    /* renamed from: Z0 */
    protected final String m41694Z0() {
        return this.f363a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a1 */
    public final LiveData m41693a1() {
        return this.f366d0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final void m41692b1(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f362Z = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void m41691c1(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f361Y = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d1 */
    public final void m41690d1(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f364b0 = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e1 */
    public final void m41689e1(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f363a0 = str;
    }

    /* renamed from: f1 */
    public abstract void m41688f1(String str);

    /* renamed from: g0 */
    public BiometricPrompt.AbstractC0544a m41687g0() {
        return new C0172b();
    }
}
