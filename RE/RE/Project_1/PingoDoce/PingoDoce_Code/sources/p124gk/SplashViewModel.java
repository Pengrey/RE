package p124gk;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AuthManager;
import mg.C7256f1;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.TransactionCacheManager;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13869l0;
import p494zh.C13877n0;
import td.C10565r0;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: gk.c */
/* loaded from: classes2.dex */
public final class SplashViewModel extends BaseViewModel {

    /* renamed from: m */
    private final CoachMarkManager f15954m;

    /* renamed from: n */
    private final C7405s1 f15955n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.splash.SplashViewModel$1", m20196f = "SplashViewModel.kt", m20195l = {40, 42}, m20194m = "invokeSuspend")
    /* renamed from: gk.c$a */
    /* loaded from: classes2.dex */
    public static final class C5703a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15956x;

        /* renamed from: z */
        final /* synthetic */ AuthManager f15958z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SplashViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.splash.SplashViewModel$1$1", m20196f = "SplashViewModel.kt", m20195l = {40}, m20194m = "invokeSuspend")
        /* renamed from: gk.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C5704a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f15959x;

            /* renamed from: y */
            final /* synthetic */ AuthManager f15960y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5704a(AuthManager authManager, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f15960y = authManager;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5704a(this.f15960y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5704a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f15959x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AuthManager authManager = this.f15960y;
                    this.f15959x = 1;
                    if (authManager.m18874v(this) == m34636d) {
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
        C5703a(AuthManager authManager, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f15958z = authManager;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5703a(this.f15958z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5703a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f15956x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SplashViewModel.m23302L(SplashViewModel.this).m18620d();
                if (SplashViewModel.m23301M(SplashViewModel.this).m18495o()) {
                    SplashViewModel splashViewModel = SplashViewModel.this;
                    C5704a c5704a = new C5704a(this.f15958z, null);
                    this.f15956x = 1;
                    if (CoreBaseViewModel.m20383n(splashViewModel, false, c5704a, this, 1, null) == m34636d) {
                        return m34636d;
                    }
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
            }
            AuthManager authManager = this.f15958z;
            this.f15956x = 2;
            if (authManager.m18885k(this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SplashViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.splash.SplashViewModel$2", m20196f = "SplashViewModel.kt", m20195l = {49}, m20194m = "invokeSuspend")
    /* renamed from: gk.c$b */
    /* loaded from: classes2.dex */
    public static final class C5705b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15961x;

        C5705b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5705b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5705b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f15961x;
            if (i == 0) {
                C13186n.m1453b(obj);
                long j = SplashViewModel.m23302L(SplashViewModel.this).m18615i() ? 0L : 3000L;
                this.f15961x = 1;
                if (C10565r0.m7677a(j, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (SplashViewModel.m23301M(SplashViewModel.this).m18495o()) {
                SplashViewModel.m23302L(SplashViewModel.this).m18603u();
            }
            if (SplashViewModel.m23301M(SplashViewModel.this).m18496n()) {
                SplashViewModel splashViewModel = SplashViewModel.this;
                splashViewModel.m120B(C13869l0.f34986a, C6755b.m20201a(splashViewModel.m23299O()));
            } else {
                BaseViewModel.m119C(SplashViewModel.this, C13877n0.f34992a, null, 2, null);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C7256f1 c7256f1, TransactionCacheManager transactionCacheManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(transactionCacheManager, "transactionCacheManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f15954m = coachMarkManager;
        this.f15955n = c7405s1;
        if (Intrinsics.equals(c1459l0.m37005b("EXTRA_FOR_RESET"), Boolean.TRUE)) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C5703a(authManager, null), 3, null);
            c7256f1.m18829j();
            transactionCacheManager.m18586d();
        }
        C6772d.m20158d(C1473p0.m36987a(this), C10587w0.m7620b(), null, new C5705b(null), 2, null);
    }

    /* renamed from: L */
    public static final /* synthetic */ CoachMarkManager m23302L(SplashViewModel splashViewModel) {
        return splashViewModel.f15954m;
    }

    /* renamed from: M */
    public static final /* synthetic */ C7405s1 m23301M(SplashViewModel splashViewModel) {
        return splashViewModel.f15955n;
    }

    /* renamed from: N */
    public final boolean m23300N() {
        return !this.f15954m.m18615i();
    }

    /* renamed from: O */
    public final boolean m23299O() {
        return !this.f15954m.m18613k();
    }
}
