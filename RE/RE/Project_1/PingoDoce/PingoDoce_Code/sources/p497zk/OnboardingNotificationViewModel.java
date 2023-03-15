package p497zk;

import android.view.View;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import ci.C2143g;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.OnboardingManager;
import mg.PrefsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13869l0;
import p494zh.C13884o1;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;
import td.InterfaceC10524i0;

/* renamed from: zk.e */
/* loaded from: classes2.dex */
public final class OnboardingNotificationViewModel extends FlowViewModel {

    /* renamed from: q */
    private final AuthManager f35088q;

    /* renamed from: r */
    private final PrefsManager f35089r;

    /* renamed from: s */
    private final C7296j0 f35090s;

    /* renamed from: t */
    private final AnalyticsManager f35091t;

    /* renamed from: u */
    private final InterfaceC6108l f35092u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNotificationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationViewModel$logInAsGuest$1", m20196f = "OnboardingNotificationViewModel.kt", m20195l = {63}, m20194m = "invokeSuspend")
    /* renamed from: zk.e$a */
    /* loaded from: classes2.dex */
    public static final class C13942a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f35093x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingNotificationViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationViewModel$logInAsGuest$1$1", m20196f = "OnboardingNotificationViewModel.kt", m20195l = {64}, m20194m = "invokeSuspend")
        /* renamed from: zk.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C13943a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f35095x;

            /* renamed from: y */
            final /* synthetic */ OnboardingNotificationViewModel f35096y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13943a(OnboardingNotificationViewModel onboardingNotificationViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f35096y = onboardingNotificationViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13943a(this.f35096y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13943a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f35095x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AuthManager m36Z = OnboardingNotificationViewModel.m36Z(this.f35096y);
                    this.f35095x = 1;
                    obj = m36Z.m18875u(this);
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

        C13942a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13942a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13942a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f35093x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingNotificationViewModel onboardingNotificationViewModel = OnboardingNotificationViewModel.this;
                C13943a c13943a = new C13943a(onboardingNotificationViewModel, null);
                this.f35093x = 1;
                obj = OnboardingNotificationViewModel.m31e0(onboardingNotificationViewModel, true, c13943a, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (Intrinsics.equals((Boolean) obj, C6755b.m20201a(true))) {
                BaseViewModel.m119C(OnboardingNotificationViewModel.this, C13869l0.f34986a, null, 2, null);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNotificationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationViewModel$setNotificationsForLoggedUser$1", m20196f = "OnboardingNotificationViewModel.kt", m20195l = {74, 83}, m20194m = "invokeSuspend")
    /* renamed from: zk.e$b */
    /* loaded from: classes2.dex */
    public static final class C13944b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f35097x;

        /* compiled from: OnboardingNotificationViewModel.kt */
        /* renamed from: zk.e$b$a */
        /* loaded from: classes2.dex */
        public static final class C13945a implements UiWidgets.InterfaceC7047d {

            /* renamed from: a */
            final /* synthetic */ OnboardingNotificationViewModel f35099a;

            C13945a(OnboardingNotificationViewModel onboardingNotificationViewModel) {
                this.f35099a = onboardingNotificationViewModel;
            }

            public void onDismiss() {
                this.f35099a.m104v(C2143g.C2145b.f6180a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingNotificationViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationViewModel$setNotificationsForLoggedUser$1$result$1", m20196f = "OnboardingNotificationViewModel.kt", m20195l = {77}, m20194m = "invokeSuspend")
        /* renamed from: zk.e$b$b */
        /* loaded from: classes2.dex */
        public static final class C13946b extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f35100x;

            /* renamed from: y */
            final /* synthetic */ OnboardingNotificationViewModel f35101y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13946b(OnboardingNotificationViewModel onboardingNotificationViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f35101y = onboardingNotificationViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13946b(this.f35101y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13946b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f35100x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    String m18884l = OnboardingNotificationViewModel.m36Z(this.f35101y).m18884l();
                    this.f35100x = 1;
                    obj = OnboardingNotificationViewModel.m35a0(this.f35101y).m18769c((OnboardingFlowData) this.f35101y.m34578S(), m18884l, this);
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

        C13944b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13944b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13944b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f35097x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingNotificationViewModel onboardingNotificationViewModel = OnboardingNotificationViewModel.this;
                C13946b c13946b = new C13946b(onboardingNotificationViewModel, null);
                this.f35097x = 1;
                obj = OnboardingNotificationViewModel.m31e0(onboardingNotificationViewModel, true, c13946b, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                OnboardingNotificationViewModel.m36Z(OnboardingNotificationViewModel.this).m18898B();
                OnboardingNotificationViewModel.m34b0(OnboardingNotificationViewModel.this).m18546N(false);
                OnboardingNotificationViewModel onboardingNotificationViewModel2 = OnboardingNotificationViewModel.this;
                onboardingNotificationViewModel2.m120B(C13884o1.f35006a, onboardingNotificationViewModel2.m34578S());
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
            }
            OnboardingManager onboardingManager = (OnboardingManager) obj;
            if (onboardingManager instanceof OnboardingManager.C7209b) {
                AuthManager m36Z = OnboardingNotificationViewModel.m36Z(OnboardingNotificationViewModel.this);
                this.f35097x = 2;
                if (m36Z.m18887i(this) == m34636d) {
                    return m34636d;
                }
                OnboardingNotificationViewModel.m36Z(OnboardingNotificationViewModel.this).m18898B();
                OnboardingNotificationViewModel.m34b0(OnboardingNotificationViewModel.this).m18546N(false);
                OnboardingNotificationViewModel onboardingNotificationViewModel22 = OnboardingNotificationViewModel.this;
                onboardingNotificationViewModel22.m120B(C13884o1.f35006a, onboardingNotificationViewModel22.m34578S());
                return C13195u.f34156a;
            }
            if (onboardingManager instanceof OnboardingManager.AbstractC7206a.C7208b) {
                UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                String string = OnboardingNotificationViewModel.m33c0(OnboardingNotificationViewModel.this).m6899a().getString(C2336R.string.dialog_caution_title);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                String string2 = OnboardingNotificationViewModel.m33c0(OnboardingNotificationViewModel.this).m6899a().getString(C2336R.string.dialog_sms_code_expired);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                uiEventsLiveData.m19515o(string, string2, new C13945a(OnboardingNotificationViewModel.this));
            } else if (onboardingManager instanceof OnboardingManager.AbstractC7206a) {
                OnboardingNotificationViewModel.m32d0(OnboardingNotificationViewModel.this, ((OnboardingManager.AbstractC7206a) onboardingManager).m18950a());
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNotificationViewModel.kt */
    /* renamed from: zk.e$c */
    /* loaded from: classes2.dex */
    public static final class C13947c extends AbstractC6438m implements InterfaceC6108l {
        C13947c() {
            super(1);
        }

        /* renamed from: a */
        public final void m18a(boolean z) {
            OnboardingNotificationViewModel.m30f0(OnboardingNotificationViewModel.this, z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m18a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNotificationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C7405s1 c7405s1, PrefsManager prefsManager, C7296j0 c7296j0, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f35088q = authManager;
        this.f35089r = prefsManager;
        this.f35090s = c7296j0;
        this.f35091t = analyticsManager;
        this.f35092u = OperatorExtensions.m35177d(1000L, C1473p0.m36987a(this), new C13947c());
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7806i0.f20430b, null, null, null, 14, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7802h.f20426b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m40V(OnboardingNotificationViewModel onboardingNotificationViewModel, View view) {
        m37Y(onboardingNotificationViewModel, view);
    }

    /* renamed from: W */
    public static /* synthetic */ void m39W(OnboardingNotificationViewModel onboardingNotificationViewModel, View view) {
        m28h0(onboardingNotificationViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m37Y(OnboardingNotificationViewModel onboardingNotificationViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingNotificationViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(onboardingNotificationViewModel.f35091t, AnalyticEvents.AbstractC7780f.C7805i.f20429b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        onboardingNotificationViewModel.f35092u.mo9587d(Boolean.TRUE);
    }

    /* renamed from: Z */
    public static final /* synthetic */ AuthManager m36Z(OnboardingNotificationViewModel onboardingNotificationViewModel) {
        return onboardingNotificationViewModel.f35088q;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C7296j0 m35a0(OnboardingNotificationViewModel onboardingNotificationViewModel) {
        return onboardingNotificationViewModel.f35090s;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ PrefsManager m34b0(OnboardingNotificationViewModel onboardingNotificationViewModel) {
        return onboardingNotificationViewModel.f35089r;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ ResourcesProvider m33c0(OnboardingNotificationViewModel onboardingNotificationViewModel) {
        return onboardingNotificationViewModel.m20390g();
    }

    /* renamed from: d0 */
    public static final /* synthetic */ void m32d0(OnboardingNotificationViewModel onboardingNotificationViewModel, Throwable th2) {
        onboardingNotificationViewModel.m109l(th2);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ Object m31e0(OnboardingNotificationViewModel onboardingNotificationViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return onboardingNotificationViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ void m30f0(OnboardingNotificationViewModel onboardingNotificationViewModel, boolean z) {
        onboardingNotificationViewModel.m25k0(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m28h0(OnboardingNotificationViewModel onboardingNotificationViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingNotificationViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(onboardingNotificationViewModel.f35091t, AnalyticEvents.AbstractC7780f.C7808j.f20432b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        onboardingNotificationViewModel.f35092u.mo9587d(Boolean.FALSE);
    }

    /* renamed from: i0 */
    private final void m27i0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13942a(null), 3, null);
    }

    /* renamed from: j0 */
    private final void m26j0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13944b(null), 3, null);
    }

    /* renamed from: k0 */
    private final void m25k0(boolean z) {
        if (m34577T()) {
            m34576U(OnboardingFlowData.m14720f((OnboardingFlowData) m34578S(), null, null, null, null, null, null, null, null, false, false, false, null, null, AppNotifications.f22824E.m14212a(z), null, null, false, null, null, 516095, null));
            m26j0();
            return;
        }
        m27i0();
    }

    /* renamed from: X */
    public final View.OnClickListener m38X() {
        return new View.OnClickListener() { // from class: zk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingNotificationViewModel.m37Y(OnboardingNotificationViewModel.this, view);
            }
        };
    }

    /* renamed from: g0 */
    public final View.OnClickListener m29g0() {
        return new View.OnClickListener() { // from class: zk.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingNotificationViewModel.m28h0(OnboardingNotificationViewModel.this, view);
            }
        };
    }
}
