package pt.pingodoce.app.presentation.account.loggedAccount.loyalty;

import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.C6842v;
import kotlinx.coroutines.flow.InterfaceC6834q;
import kotlinx.coroutines.flow.InterfaceC6837t;
import mg.AbstractC7229c1;
import mg.AnalyticsManager;
import mg.LoyaltyCardManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import p494zh.C13898s;
import p494zh.C13902t;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a */
/* loaded from: classes2.dex */
public final class LoyaltyViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final LoyaltyCardManager f23368p;

    /* renamed from: q */
    private final AnalyticsManager f23369q;

    /* renamed from: r */
    private final LiveData f23370r;

    /* renamed from: s */
    private final InterfaceC6834q f23371s;

    /* renamed from: t */
    private final InterfaceC6837t f23372t;

    /* renamed from: u */
    private final InterfaceC6108l f23373u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoyaltyViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC8830a {
        MANAGE_ASSOCIATIONS,
        LOYALTY_CARD
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$b */
    /* loaded from: classes2.dex */
    public static final class C8831b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: LoyaltyViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8832a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23375a;

            static {
                int[] iArr = new int[EnumC8830a.values().length];
                iArr[EnumC8830a.MANAGE_ASSOCIATIONS.ordinal()] = 1;
                iArr[EnumC8830a.LOYALTY_CARD.ordinal()] = 2;
                f23375a = iArr;
            }
        }

        C8831b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13516a(EnumC8830a enumC8830a) {
            Intrinsics.isThisObjectNull(enumC8830a, "action");
            int i = C8832a.f23375a[enumC8830a.ordinal()];
            if (i == 1) {
                LoyaltyViewModel.this.m13522g0();
            } else if (i != 2) {
            } else {
                InterfaceC7886d.C7887a.m17629a(LoyaltyViewModel.m13534U(LoyaltyViewModel.this), AnalyticEvents.AbstractC7750e.C7760g.f20385b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                BaseViewModel.m119C(LoyaltyViewModel.this, C13902t.f35023a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13516a((EnumC8830a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$deleteCardAssociations$1", m20196f = "LoyaltyViewModel.kt", m20195l = {C0868i.f2748C0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$c */
    /* loaded from: classes2.dex */
    public static final class C8833c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23376x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$deleteCardAssociations$1$1", m20196f = "LoyaltyViewModel.kt", m20195l = {C0868i.f2753D0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C8834a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23378x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyViewModel f23379y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8834a(LoyaltyViewModel loyaltyViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23379y = loyaltyViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8834a(this.f23379y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8834a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23378x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m13533V = LoyaltyViewModel.m13533V(this.f23379y);
                    this.f23378x = 1;
                    obj = m13533V.m18933m(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f23379y.m13523f0();
                } else {
                    LoyaltyViewModel.m13529Z(this.f23379y, true);
                }
                return C13195u.f34156a;
            }
        }

        C8833c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8833c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8833c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23376x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(LoyaltyViewModel.this, true, false, 2, null);
                LoyaltyViewModel loyaltyViewModel = LoyaltyViewModel.this;
                C8834a c8834a = new C8834a(loyaltyViewModel, null);
                this.f23376x = 1;
                if (LoyaltyViewModel.m13531X(loyaltyViewModel, true, c8834a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m111K(LoyaltyViewModel.this, false, false, 2, null);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$fetchAndGetCardStatus$1", m20196f = "LoyaltyViewModel.kt", m20195l = {C4906j.f13612y0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$d */
    /* loaded from: classes2.dex */
    public static final class C8835d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23380x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$fetchAndGetCardStatus$1$1", m20196f = "LoyaltyViewModel.kt", m20195l = {C4906j.f13617z0, C4906j.f13380A0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C8836a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23382x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyViewModel f23383y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8836a(LoyaltyViewModel loyaltyViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23383y = loyaltyViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8836a(this.f23383y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8836a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23382x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m13533V = LoyaltyViewModel.m13533V(this.f23383y);
                    this.f23382x = 1;
                    obj = m13533V.m18929q(this);
                    if (obj == m34636d) {
                        return m34636d;
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
                if (((Result) obj) instanceof Result.C8078c) {
                    InterfaceC6834q m13532W = LoyaltyViewModel.m13532W(this.f23383y);
                    C13195u c13195u = C13195u.f34156a;
                    this.f23382x = 2;
                    if (m13532W.mo4529a(c13195u, this) == m34636d) {
                        return m34636d;
                    }
                } else {
                    LoyaltyViewModel.m13529Z(this.f23383y, true);
                }
                return C13195u.f34156a;
            }
        }

        C8835d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8835d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8835d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23380x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(LoyaltyViewModel.this, true, false, 2, null);
                LoyaltyViewModel loyaltyViewModel = LoyaltyViewModel.this;
                C8836a c8836a = new C8836a(loyaltyViewModel, null);
                this.f23380x = 1;
                if (LoyaltyViewModel.m13531X(loyaltyViewModel, true, c8836a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m111K(LoyaltyViewModel.this, false, false, 2, null);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$getInvitesAndUpdateList$1", m20196f = "LoyaltyViewModel.kt", m20195l = {76}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$e */
    /* loaded from: classes2.dex */
    public static final class C8837e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23384x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel$getInvitesAndUpdateList$1$1", m20196f = "LoyaltyViewModel.kt", m20195l = {77}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C8838a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23386x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyViewModel f23387y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8838a(LoyaltyViewModel loyaltyViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23387y = loyaltyViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8838a(this.f23387y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8838a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m197g;
                m34636d = C2116d.m34636d();
                int i = this.f23386x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m13533V = LoyaltyViewModel.m13533V(this.f23387y);
                    this.f23386x = 1;
                    obj = m13533V.m18921y(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7229c1 abstractC7229c1 = (AbstractC7229c1) obj;
                if (abstractC7229c1 instanceof AbstractC7229c1.C7232b) {
                    LoyaltyViewModel.m13529Z(this.f23387y, false);
                    AbstractC7229c1.C7232b c7232b = (AbstractC7229c1.C7232b) abstractC7229c1;
                    LoyaltyViewModel.m13530Y(this.f23387y, c7232b.m18907a().isEmpty());
                    LoyaltyViewModel.m13533V(this.f23387y).m18937i(c7232b.m18907a());
                    BaseViewModel.m119C(this.f23387y, C13898s.f35019a, null, 2, null);
                } else if (abstractC7229c1 instanceof AbstractC7229c1.AbstractC7230a.C7231a) {
                    LoyaltyViewModel.m13529Z(this.f23387y, true);
                    LoyaltyCardManager m13533V2 = LoyaltyViewModel.m13533V(this.f23387y);
                    m197g = C13780s.m197g();
                    m13533V2.m18937i(m197g);
                }
                return C13195u.f34156a;
            }
        }

        C8837e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8837e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8837e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23384x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(LoyaltyViewModel.this, true, false, 2, null);
                LoyaltyViewModel loyaltyViewModel = LoyaltyViewModel.this;
                C8838a c8838a = new C8838a(loyaltyViewModel, null);
                this.f23384x = 1;
                if (LoyaltyViewModel.m13531X(loyaltyViewModel, true, c8838a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m111K(LoyaltyViewModel.this, false, false, 2, null);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23368p = loyaltyCardManager;
        this.f23369q = analyticsManager;
        this.f23370r = m106t(loyaltyCardManager.m18930p());
        InterfaceC6834q m20039b = C6842v.m20039b(0, 0, null, 7, null);
        this.f23371s = m20039b;
        this.f23372t = m20039b;
        this.f23373u = OperatorExtensions.m35176e(0L, null, new C8831b(), 3, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7758e.f20383b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: R */
    public static /* synthetic */ void m13537R(LoyaltyViewModel loyaltyViewModel, View view) {
        m13524e0(loyaltyViewModel, view);
    }

    /* renamed from: S */
    public static /* synthetic */ void m13536S(LoyaltyViewModel loyaltyViewModel, View view) {
        m13527b0(loyaltyViewModel, view);
    }

    /* renamed from: T */
    public static /* synthetic */ void m13535T(LoyaltyViewModel loyaltyViewModel, View view) {
        m13517l0(loyaltyViewModel, view);
    }

    /* renamed from: U */
    public static final /* synthetic */ AnalyticsManager m13534U(LoyaltyViewModel loyaltyViewModel) {
        return loyaltyViewModel.f23369q;
    }

    /* renamed from: V */
    public static final /* synthetic */ LoyaltyCardManager m13533V(LoyaltyViewModel loyaltyViewModel) {
        return loyaltyViewModel.f23368p;
    }

    /* renamed from: W */
    public static final /* synthetic */ InterfaceC6834q m13532W(LoyaltyViewModel loyaltyViewModel) {
        return loyaltyViewModel.f23371s;
    }

    /* renamed from: X */
    public static final /* synthetic */ Object m13531X(LoyaltyViewModel loyaltyViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return loyaltyViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: Y */
    public static final /* synthetic */ void m13530Y(LoyaltyViewModel loyaltyViewModel, boolean z) {
        loyaltyViewModel.m20381p(z);
    }

    /* renamed from: Z */
    public static final /* synthetic */ void m13529Z(LoyaltyViewModel loyaltyViewModel, boolean z) {
        loyaltyViewModel.m20350O(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m13527b0(LoyaltyViewModel loyaltyViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyViewModel, "this$0");
        loyaltyViewModel.f23373u.mo9587d(EnumC8830a.MANAGE_ASSOCIATIONS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m13524e0(LoyaltyViewModel loyaltyViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyViewModel, "this$0");
        loyaltyViewModel.m13526c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m13517l0(LoyaltyViewModel loyaltyViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyViewModel, "this$0");
        loyaltyViewModel.f23373u.mo9587d(EnumC8830a.LOYALTY_CARD);
    }

    /* renamed from: N */
    protected void m13538N() {
        m13522g0();
    }

    /* renamed from: a0 */
    public final View.OnClickListener m13528a0() {
        return new View.OnClickListener() { // from class: ch.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyViewModel.m13527b0(LoyaltyViewModel.this, view);
            }
        };
    }

    /* renamed from: c0 */
    public final void m13526c0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8833c(null), 3, null);
    }

    /* renamed from: d0 */
    public final View.OnClickListener m13525d0() {
        return new View.OnClickListener() { // from class: ch.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyViewModel.m13524e0(LoyaltyViewModel.this, view);
            }
        };
    }

    /* renamed from: f0 */
    public final void m13523f0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8835d(null), 3, null);
    }

    /* renamed from: g0 */
    public final void m13522g0() {
        m20381p(false);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8837e(null), 3, null);
    }

    /* renamed from: h0 */
    public final LiveData m13521h0() {
        return this.f23370r;
    }

    /* renamed from: i0 */
    public final InterfaceC6837t m13520i0() {
        return this.f23372t;
    }

    /* renamed from: j0 */
    public final void m13519j0() {
        InterfaceC7886d.C7887a.m17629a(this.f23369q, AnalyticEvents.AbstractC7750e.C7759f.f20384b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: k0 */
    public final View.OnClickListener m13518k0() {
        return new View.OnClickListener() { // from class: ch.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyViewModel.m13517l0(LoyaltyViewModel.this, view);
            }
        };
    }
}
