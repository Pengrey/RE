package p320qj;

import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.C6772d;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.remote.models.response.Store;
import sd._Strings;
import se.OAuthSharedPrefs;
import td.InterfaceC10524i0;

/* renamed from: qj.a */
/* loaded from: classes2.dex */
public final class DebugViewModel extends BaseViewModel {

    /* renamed from: m */
    private final OAuthManager f25641m;

    /* renamed from: n */
    private final C7405s1 f25642n;

    /* renamed from: o */
    private final OAuthSharedPrefs f25643o;

    /* renamed from: p */
    private final LoyaltyCardManager f25644p;

    /* renamed from: q */
    private final CoachMarkManager f25645q;

    /* renamed from: r */
    private final StoreManager f25646r;

    /* renamed from: s */
    private final C1436e0 f25647s;

    /* renamed from: t */
    private final C1436e0 f25648t;

    /* renamed from: u */
    private final C1436e0 f25649u;

    /* renamed from: v */
    private final LiveData f25650v;

    /* renamed from: w */
    private final LiveData f25651w;

    /* renamed from: x */
    private final LiveData f25652x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$clearCoachMarks$1", m20196f = "DebugViewModel.kt", m20195l = {84}, m20194m = "invokeSuspend")
    /* renamed from: qj.a$a */
    /* loaded from: classes2.dex */
    public static final class C9747a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25653x;

        C9747a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9747a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9747a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25653x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CoachMarkManager m10042L = DebugViewModel.m10042L(DebugViewModel.this);
                this.f25653x = 1;
                if (m10042L.m18621c(this) == m34636d) {
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
    /* compiled from: DebugViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$clearDefaultStore$1", m20196f = "DebugViewModel.kt", m20195l = {88}, m20194m = "invokeSuspend")
    /* renamed from: qj.a$b */
    /* loaded from: classes2.dex */
    public static final class C9748b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25655x;

        C9748b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9748b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9748b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25655x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreManager m10039O = DebugViewModel.m10039O(DebugViewModel.this);
                Store store = new Store(0, false, false, null, null, null, null, null, null, 511, null);
                this.f25655x = 1;
                if (m10039O.m18756k(store, this) == m34636d) {
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
    /* compiled from: DebugViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$refreshTokens$1", m20196f = "DebugViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: qj.a$c */
    /* loaded from: classes2.dex */
    public static final class C9749c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25657x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DebugViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$refreshTokens$1$1", m20196f = "DebugViewModel.kt", m20195l = {51}, m20194m = "invokeSuspend")
        /* renamed from: qj.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C9750a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f25659x;

            /* renamed from: y */
            final /* synthetic */ DebugViewModel f25660y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9750a(DebugViewModel debugViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f25660y = debugViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9750a(this.f25660y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9750a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f25659x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    OAuthManager m10040N = DebugViewModel.m10040N(this.f25660y);
                    this.f25659x = 1;
                    obj = m10040N.m7575g(this);
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

        C9749c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9749c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9749c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f25657x == 0) {
                C13186n.m1453b(obj);
                C6770c.m20162b(null, new C9750a(DebugViewModel.this, null), 1, null);
                DebugViewModel.m10036R(DebugViewModel.this);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$removeLoyaltyCard$1", m20196f = "DebugViewModel.kt", m20195l = {C0868i.f2778I0}, m20194m = "invokeSuspend")
    /* renamed from: qj.a$d */
    /* loaded from: classes2.dex */
    public static final class C9751d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25661x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DebugViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$removeLoyaltyCard$1$1", m20196f = "DebugViewModel.kt", m20195l = {110, 111, 112}, m20194m = "invokeSuspend")
        /* renamed from: qj.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C9752a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f25663x;

            /* renamed from: y */
            final /* synthetic */ DebugViewModel f25664y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9752a(DebugViewModel debugViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f25664y = debugViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9752a(this.f25664y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9752a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[PHI: r6 
              PHI: (r6v10 java.lang.Object) = (r6v9 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x0052, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r5.f25663x
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L21
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    p468yc.C13186n.m1453b(r6)
                    goto L55
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1d:
                    p468yc.C13186n.m1453b(r6)
                    goto L46
                L21:
                    p468yc.C13186n.m1453b(r6)
                    goto L37
                L25:
                    p468yc.C13186n.m1453b(r6)
                    qj.a r6 = r5.f25664y
                    mg.c0 r6 = p320qj.DebugViewModel.m10041M(r6)
                    r5.f25663x = r4
                    java.lang.Object r6 = r6.m18934l(r5)
                    if (r6 != r0) goto L37
                    return r0
                L37:
                    qj.a r6 = r5.f25664y
                    mg.c0 r6 = p320qj.DebugViewModel.m10041M(r6)
                    r5.f25663x = r3
                    java.lang.Object r6 = r6.m18929q(r5)
                    if (r6 != r0) goto L46
                    return r0
                L46:
                    qj.a r6 = r5.f25664y
                    mg.c0 r6 = p320qj.DebugViewModel.m10041M(r6)
                    r5.f25663x = r2
                    java.lang.Object r6 = r6.m18933m(r5)
                    if (r6 != r0) goto L55
                    return r0
                L55:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p320qj.DebugViewModel.C9751d.C9752a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C9751d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9751d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9751d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25661x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DebugViewModel debugViewModel = DebugViewModel.this;
                C9752a c9752a = new C9752a(debugViewModel, null);
                this.f25661x = 1;
                if (DebugViewModel.m10037Q(debugViewModel, true, c9752a, this) == m34636d) {
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
    /* compiled from: DebugViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.DebugViewModel$simulateEmptyUserRequest$1", m20196f = "DebugViewModel.kt", m20195l = {C0868i.f2963s0}, m20194m = "invokeSuspend")
    /* renamed from: qj.a$e */
    /* loaded from: classes2.dex */
    public static final class C9753e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25665x;

        C9753e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9753e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9753e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25665x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7405s1 m10038P = DebugViewModel.m10038P(DebugViewModel.this);
                this.f25665x = 1;
                if (m10038P.m18490t(this) == m34636d) {
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
    public DebugViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, OAuthManager oAuthManager, C7405s1 c7405s1, OAuthSharedPrefs oAuthSharedPrefs, LoyaltyCardManager loyaltyCardManager, CoachMarkManager coachMarkManager, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "oAuthSharedPrefs");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f25641m = oAuthManager;
        this.f25642n = c7405s1;
        this.f25643o = oAuthSharedPrefs;
        this.f25644p = loyaltyCardManager;
        this.f25645q = coachMarkManager;
        this.f25646r = storeManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f25647s = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f25648t = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        this.f25649u = c1436e03;
        this.f25650v = c1436e0;
        this.f25651w = c1436e02;
        this.f25652x = c1436e03;
        m10023e0();
    }

    /* renamed from: L */
    public static final /* synthetic */ CoachMarkManager m10042L(DebugViewModel debugViewModel) {
        return debugViewModel.f25645q;
    }

    /* renamed from: M */
    public static final /* synthetic */ LoyaltyCardManager m10041M(DebugViewModel debugViewModel) {
        return debugViewModel.f25644p;
    }

    /* renamed from: N */
    public static final /* synthetic */ OAuthManager m10040N(DebugViewModel debugViewModel) {
        return debugViewModel.f25641m;
    }

    /* renamed from: O */
    public static final /* synthetic */ StoreManager m10039O(DebugViewModel debugViewModel) {
        return debugViewModel.f25646r;
    }

    /* renamed from: P */
    public static final /* synthetic */ C7405s1 m10038P(DebugViewModel debugViewModel) {
        return debugViewModel.f25642n;
    }

    /* renamed from: Q */
    public static final /* synthetic */ Object m10037Q(DebugViewModel debugViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return debugViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: R */
    public static final /* synthetic */ void m10036R(DebugViewModel debugViewModel) {
        debugViewModel.m10023e0();
    }

    /* renamed from: e0 */
    private final void m10023e0() {
        C1436e0 c1436e0 = this.f25647s;
        String m10015a = C9754b.m10015a(String.valueOf(this.f25643o.m8863b()), 10);
        c1436e0.mo166p("accessToken: ..." + m10015a);
        C1436e0 c1436e02 = this.f25649u;
        String m10015a2 = C9754b.m10015a(String.valueOf(this.f25643o.m8861d()), 10);
        c1436e02.mo166p("refreshToken: " + m10015a2);
        C1436e0 c1436e03 = this.f25648t;
        Long m8862c = this.f25643o.m8862c();
        c1436e03.mo166p("accessTtl: " + m8862c);
    }

    /* renamed from: S */
    public final void m10035S() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9747a(null), 3, null);
    }

    /* renamed from: T */
    public final void m10034T() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9748b(null), 3, null);
    }

    /* renamed from: U */
    public final LiveData m10033U() {
        return this.f25650v;
    }

    /* renamed from: V */
    public final LiveData m10032V() {
        return this.f25651w;
    }

    /* renamed from: W */
    public final LiveData m10031W() {
        return this.f25652x;
    }

    /* renamed from: X */
    public final void m10030X() {
        String m8869M0;
        OAuthSharedPrefs oAuthSharedPrefs = this.f25643o;
        m8869M0 = _Strings.m8869M0(String.valueOf(oAuthSharedPrefs.m8863b()), 20);
        oAuthSharedPrefs.m8859f(m8869M0 + "a123456789a123456789");
        m10023e0();
    }

    /* renamed from: Y */
    public final void m10029Y() {
        this.f25643o.m8858g(0L);
        m10023e0();
    }

    /* renamed from: Z */
    public final void m10028Z() {
        String m8869M0;
        OAuthSharedPrefs oAuthSharedPrefs = this.f25643o;
        m8869M0 = _Strings.m8869M0(String.valueOf(oAuthSharedPrefs.m8861d()), 10);
        oAuthSharedPrefs.m8857h(m8869M0 + "a123456789");
        m10023e0();
    }

    /* renamed from: a0 */
    public final void m10027a0() {
        m10026b0();
        m10026b0();
        m10026b0();
        m10026b0();
        m10026b0();
    }

    /* renamed from: b0 */
    public final void m10026b0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9749c(null), 3, null);
    }

    /* renamed from: c0 */
    public final void m10025c0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9751d(null), 3, null);
    }

    /* renamed from: d0 */
    public final void m10024d0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9753e(null), 3, null);
    }
}
