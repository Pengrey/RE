package pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AuthManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import mg.UserManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13808a1;
import p494zh.C13813b1;
import p494zh.C13818c1;
import p494zh.C13823d1;
import p494zh.C13828e1;
import p494zh.C13832f1;
import p494zh.C13923y0;
import p494zh.C13927z0;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q */
/* loaded from: classes2.dex */
public final class NotificationsViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final C7405s1 f23582C;

    /* renamed from: D */
    private C2381h f23583D;

    /* renamed from: E */
    private final Void f23584E;

    /* renamed from: F */
    private final C1436e0 f23585F;

    /* renamed from: G */
    private final C1436e0 f23586G;

    /* renamed from: H */
    private final C1430c0 f23587H;

    /* renamed from: I */
    private final C1436e0 f23588I;

    /* renamed from: J */
    private final C1436e0 f23589J;

    /* renamed from: K */
    private final C1436e0 f23590K;

    /* renamed from: L */
    private final C1436e0 f23591L;

    /* renamed from: M */
    private final C1436e0 f23592M;

    /* renamed from: N */
    private final C1436e0 f23593N;

    /* renamed from: O */
    private final C1436e0 f23594O;

    /* renamed from: P */
    private final C1436e0 f23595P;

    /* renamed from: Q */
    private final LiveData f23596Q;

    /* renamed from: R */
    private final C1436e0 f23597R;

    /* renamed from: S */
    private final C1436e0 f23598S;

    /* renamed from: T */
    private final C1436e0 f23599T;

    /* renamed from: U */
    private final C1436e0 f23600U;

    /* renamed from: V */
    private final C1436e0 f23601V;

    /* renamed from: W */
    private final C1436e0 f23602W;

    /* renamed from: X */
    private final C1436e0 f23603X;

    /* renamed from: Y */
    private final C1436e0 f23604Y;

    /* renamed from: Z */
    private final InterfaceC6108l f23605Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel$9", m20196f = "NotificationsViewModel.kt", m20195l = {C0868i.f2748C0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$a */
    /* loaded from: classes2.dex */
    public static final class C8926a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23606x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel$9$1", m20196f = "NotificationsViewModel.kt", m20195l = {C0868i.f2753D0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$a$a */
        /* loaded from: classes2.dex */
        public static final class C8927a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23608x;

            /* renamed from: y */
            final /* synthetic */ NotificationsViewModel f23609y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8927a(NotificationsViewModel notificationsViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23609y = notificationsViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8927a(this.f23609y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8927a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23608x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13132a1 = NotificationsViewModel.m13132a1(this.f23609y);
                    this.f23608x = 1;
                    obj = m13132a1.m18503g(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                UserManager userManager = (UserManager) obj;
                if (userManager instanceof UserManager.C7201b) {
                    UserManager.C7201b c7201b = (UserManager.C7201b) userManager;
                    this.f23609y.m13114p1().mo166p(C6755b.m20201a(c7201b.m18952a().m14215f()));
                    this.f23609y.m13115o1().mo166p(C6755b.m20201a(c7201b.m18952a().m14217d()));
                    this.f23609y.m13118m1().mo166p(C6755b.m20201a(c7201b.m18952a().m14218c()));
                    this.f23609y.m13120k1().mo166p(C6755b.m20201a(c7201b.m18952a().m14220a()));
                    this.f23609y.m13113q1().mo166p(C6755b.m20201a(c7201b.m18952a().m14214h()));
                    this.f23609y.m13111s1().mo166p(C6755b.m20201a(c7201b.m18952a().m14216e()));
                    this.f23609y.m13112r1().mo166p(C6755b.m20201a(c7201b.m18952a().m14213i()));
                    this.f23609y.m13119l1().mo166p(C6755b.m20201a(c7201b.m18952a().m14219b()));
                    NotificationsViewModel.m13139T0(this.f23609y).mo166p(this.f23609y.m13119l1().mo172f());
                    NotificationsViewModel.m13134Y0(this.f23609y).mo166p(this.f23609y.m13112r1().mo172f());
                    NotificationsViewModel.m13136W0(this.f23609y).mo166p(this.f23609y.m13114p1().mo172f());
                    NotificationsViewModel.m13137V0(this.f23609y).mo166p(this.f23609y.m13115o1().mo172f());
                    NotificationsViewModel.m13138U0(this.f23609y).mo166p(this.f23609y.m13118m1().mo172f());
                    NotificationsViewModel.m13140S0(this.f23609y).mo166p(this.f23609y.m13120k1().mo172f());
                    NotificationsViewModel.m13135X0(this.f23609y).mo166p(this.f23609y.m13113q1().mo172f());
                    NotificationsViewModel.m13133Z0(this.f23609y).mo166p(this.f23609y.m13111s1().mo172f());
                } else if (userManager instanceof UserManager.C7200a) {
                    NotificationsViewModel.m13131b1(this.f23609y, ((UserManager.C7200a) userManager).m18953a());
                }
                return C13195u.f34156a;
            }
        }

        C8926a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8926a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8926a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23606x;
            if (i == 0) {
                C13186n.m1453b(obj);
                NotificationsViewModel notificationsViewModel = NotificationsViewModel.this;
                C8927a c8927a = new C8927a(notificationsViewModel, null);
                this.f23606x = 1;
                if (NotificationsViewModel.m13130c1(notificationsViewModel, true, c8927a, this) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationsViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$b */
    /* loaded from: classes2.dex */
    public enum EnumC8928b {
        SMS,
        EMAIL,
        MANUAL,
        FLYER,
        LOYALTY,
        SHOPPING_LIST,
        ORDER,
        ONLINE_PUBLICITY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$c */
    /* loaded from: classes2.dex */
    public static final class C8929c extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: NotificationsViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8930a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23611a;

            static {
                int[] iArr = new int[EnumC8928b.values().length];
                iArr[EnumC8928b.SMS.ordinal()] = 1;
                iArr[EnumC8928b.EMAIL.ordinal()] = 2;
                iArr[EnumC8928b.MANUAL.ordinal()] = 3;
                iArr[EnumC8928b.FLYER.ordinal()] = 4;
                iArr[EnumC8928b.LOYALTY.ordinal()] = 5;
                iArr[EnumC8928b.SHOPPING_LIST.ordinal()] = 6;
                iArr[EnumC8928b.ORDER.ordinal()] = 7;
                iArr[EnumC8928b.ONLINE_PUBLICITY.ordinal()] = 8;
                f23611a = iArr;
            }
        }

        C8929c() {
            super(1);
        }

        /* renamed from: a */
        public final void m13095a(EnumC8928b enumC8928b) {
            Intrinsics.isThisObjectNull(enumC8928b, "action");
            switch (C8930a.f23611a[enumC8928b.ordinal()]) {
                case 1:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13112r1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13828e1.f34935a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 2:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13119l1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13923y0.f35044a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 3:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13114p1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13813b1.f34921a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 4:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13118m1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13927z0.f35048a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 5:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13120k1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13808a1.f34916a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 6:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13113q1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13832f1.f34940a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 7:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13111s1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13823d1.f34930a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                case 8:
                    if (Intrinsics.equals(NotificationsViewModel.this.m13115o1().mo172f(), Boolean.FALSE)) {
                        BaseViewModel.m119C(NotificationsViewModel.this, C13818c1.f34925a, null, 2, null);
                    }
                    NotificationsViewModel.this.m13110t1().mo166p(Boolean.valueOf(NotificationsViewModel.this.m13108u1()));
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13095a((EnumC8928b) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel", m20196f = "NotificationsViewModel.kt", m20195l = {63}, m20194m = "onSubmit")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.q$d */
    /* loaded from: classes2.dex */
    public static final class C8931d extends AbstractC6757d {

        /* renamed from: w */
        Object f23612w;

        /* renamed from: x */
        /* synthetic */ Object f23613x;

        /* renamed from: z */
        int f23615z;

        C8931d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f23613x = obj;
            this.f23615z |= Integer.MIN_VALUE;
            return NotificationsViewModel.this.m13117n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, AuthManager authManager, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f23582C = c7405s1;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_save));
        this.f23583D = c2381h;
        Boolean bool = Boolean.FALSE;
        C1436e0 c1436e0 = new C1436e0(bool);
        this.f23585F = c1436e0;
        this.f23586G = new C1436e0(Boolean.valueOf(c7405s1.m18498l()));
        C1430c0 c1430c0 = new C1430c0();
        this.f23587H = c1430c0;
        C1436e0 c1436e02 = new C1436e0(bool);
        this.f23588I = c1436e02;
        C1436e0 c1436e03 = new C1436e0(bool);
        this.f23589J = c1436e03;
        C1436e0 c1436e04 = new C1436e0(bool);
        this.f23590K = c1436e04;
        C1436e0 c1436e05 = new C1436e0(bool);
        this.f23591L = c1436e05;
        C1436e0 c1436e06 = new C1436e0(bool);
        this.f23592M = c1436e06;
        C1436e0 c1436e07 = new C1436e0(bool);
        this.f23593N = c1436e07;
        C1436e0 c1436e08 = new C1436e0(bool);
        this.f23594O = c1436e08;
        C1436e0 c1436e09 = new C1436e0(bool);
        this.f23595P = c1436e09;
        this.f23596Q = c1436e0;
        this.f23597R = new C1436e0(bool);
        this.f23598S = new C1436e0(bool);
        this.f23599T = new C1436e0(bool);
        this.f23600U = new C1436e0(bool);
        this.f23601V = new C1436e0(bool);
        this.f23602W = new C1436e0(bool);
        this.f23603X = new C1436e0(bool);
        this.f23604Y = new C1436e0(bool);
        c1430c0.m37055q(c1436e04, new InterfaceC1440f0() { // from class: uh.q
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13148K0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e05, new InterfaceC1440f0() { // from class: uh.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13147L0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e06, new InterfaceC1440f0() { // from class: uh.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13146M0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e07, new InterfaceC1440f0() { // from class: uh.h
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13145N0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e08, new InterfaceC1440f0() { // from class: uh.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13144O0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e09, new InterfaceC1440f0() { // from class: uh.r
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13143P0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e03, new InterfaceC1440f0() { // from class: uh.i
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13142Q0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        c1430c0.m37055q(c1436e02, new InterfaceC1440f0() { // from class: uh.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NotificationsViewModel.m13141R0(NotificationsViewModel.this, (Boolean) obj);
            }
        });
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8926a(null), 3, null);
        this.f23605Z = OperatorExtensions.m35176e(0L, null, new C8929c(), 3, null);
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m13167A0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13144O0(notificationsViewModel, bool);
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m13165B0(NotificationsViewModel notificationsViewModel, View view) {
        m13160D1(notificationsViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m13164B1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.ONLINE_PUBLICITY);
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m13163C0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13141R0(notificationsViewModel, bool);
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m13161D0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13146M0(notificationsViewModel, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m13160D1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.ORDER);
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m13159E0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13147L0(notificationsViewModel, bool);
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m13157F0(NotificationsViewModel notificationsViewModel, View view) {
        m13122i1(notificationsViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m13156F1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.SHOPPING_LIST);
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m13155G0(NotificationsViewModel notificationsViewModel, View view) {
        m13164B1(notificationsViewModel, view);
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m13153H0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13145N0(notificationsViewModel, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m13152H1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.SMS);
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m13151I0(NotificationsViewModel notificationsViewModel, View view) {
        m13102x1(notificationsViewModel, view);
    }

    /* renamed from: I1 */
    private final void m13150I1(boolean z) {
        if (!z) {
            this.f23587H.mo166p(Boolean.FALSE);
        } else if (m13129d1()) {
            this.f23587H.mo166p(Boolean.TRUE);
        }
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m13149J0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13142Q0(notificationsViewModel, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m13148K0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m13147L0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m13146M0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m13145N0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m13144O0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m13143P0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final void m13142Q0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static final void m13141R0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        notificationsViewModel.m13150I1(bool.booleanValue());
    }

    /* renamed from: S0 */
    public static final /* synthetic */ C1436e0 m13140S0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23602W;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C1436e0 m13139T0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23597R;
    }

    /* renamed from: U0 */
    public static final /* synthetic */ C1436e0 m13138U0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23601V;
    }

    /* renamed from: V0 */
    public static final /* synthetic */ C1436e0 m13137V0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23600U;
    }

    /* renamed from: W0 */
    public static final /* synthetic */ C1436e0 m13136W0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23599T;
    }

    /* renamed from: X0 */
    public static final /* synthetic */ C1436e0 m13135X0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23603X;
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ C1436e0 m13134Y0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23598S;
    }

    /* renamed from: Z0 */
    public static final /* synthetic */ C1436e0 m13133Z0(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23604Y;
    }

    /* renamed from: a1 */
    public static final /* synthetic */ C7405s1 m13132a1(NotificationsViewModel notificationsViewModel) {
        return notificationsViewModel.f23582C;
    }

    /* renamed from: b1 */
    public static final /* synthetic */ void m13131b1(NotificationsViewModel notificationsViewModel, Throwable th2) {
        notificationsViewModel.m109l(th2);
    }

    /* renamed from: c1 */
    public static final /* synthetic */ Object m13130c1(NotificationsViewModel notificationsViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return notificationsViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: d1 */
    private final boolean m13129d1() {
        T mo172f = this.f23590K.mo172f();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.equals(mo172f, bool) && Intrinsics.equals(this.f23592M.mo172f(), bool) && Intrinsics.equals(this.f23593N.mo172f(), bool) && Intrinsics.equals(this.f23594O.mo172f(), bool) && Intrinsics.equals(this.f23595P.mo172f(), bool) && Intrinsics.equals(this.f23589J.mo172f(), bool) && Intrinsics.equals(this.f23588I.mo172f(), bool) && Intrinsics.equals(this.f23591L.mo172f(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public static final void m13124g1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.EMAIL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m13122i1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.FLYER);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m13109u0(NotificationsViewModel notificationsViewModel, View view) {
        m13156F1(notificationsViewModel, view);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m13107v0(NotificationsViewModel notificationsViewModel, View view) {
        m13098z1(notificationsViewModel, view);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m13105w0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13148K0(notificationsViewModel, bool);
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m13103x0(NotificationsViewModel notificationsViewModel, View view) {
        m13124g1(notificationsViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m13102x1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.LOYALTY);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m13101y0(NotificationsViewModel notificationsViewModel, Boolean bool) {
        m13143P0(notificationsViewModel, bool);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m13099z0(NotificationsViewModel notificationsViewModel, View view) {
        m13152H1(notificationsViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m13098z1(NotificationsViewModel notificationsViewModel, View view) {
        Intrinsics.isThisObjectNull(notificationsViewModel, "this$0");
        notificationsViewModel.f23605Z.mo9587d(EnumC8928b.MANUAL);
    }

    /* renamed from: A1 */
    public final View.OnClickListener m13166A1() {
        return new View.OnClickListener() { // from class: uh.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13164B1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: C1 */
    public final View.OnClickListener m13162C1() {
        return new View.OnClickListener() { // from class: uh.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13160D1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: E1 */
    public final View.OnClickListener m13158E1() {
        return new View.OnClickListener() { // from class: uh.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13156F1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: G1 */
    public final View.OnClickListener m13154G1() {
        return new View.OnClickListener() { // from class: uh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13152H1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: e1 */
    public final void m13128e1() {
        C1436e0 c1436e0 = this.f23592M;
        Boolean bool = Boolean.FALSE;
        c1436e0.mo166p(bool);
        this.f23593N.mo166p(bool);
        this.f23594O.mo166p(bool);
        this.f23595P.mo166p(bool);
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m13127f0() {
        return (Drawable) m13116n1();
    }

    /* renamed from: f1 */
    public final View.OnClickListener m13126f1() {
        return new View.OnClickListener() { // from class: uh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13124g1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: g0 */
    protected C2381h m13125g0() {
        return this.f23583D;
    }

    /* renamed from: h1 */
    public final View.OnClickListener m13123h1() {
        return new View.OnClickListener() { // from class: uh.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13122i1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: j1 */
    public final LiveData m13121j1() {
        return this.f23596Q;
    }

    /* renamed from: k1 */
    public final C1436e0 m13120k1() {
        return this.f23593N;
    }

    /* renamed from: l1 */
    public final C1436e0 m13119l1() {
        return this.f23588I;
    }

    /* renamed from: m1 */
    public final C1436e0 m13118m1() {
        return this.f23592M;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m13117n0(bd.InterfaceC1886d r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel.m13117n0(bd.d):java.lang.Object");
    }

    /* renamed from: n1 */
    protected Void m13116n1() {
        return this.f23584E;
    }

    /* renamed from: o1 */
    public final C1436e0 m13115o1() {
        return this.f23591L;
    }

    /* renamed from: p1 */
    public final C1436e0 m13114p1() {
        return this.f23590K;
    }

    /* renamed from: q1 */
    public final C1436e0 m13113q1() {
        return this.f23594O;
    }

    /* renamed from: r1 */
    public final C1436e0 m13112r1() {
        return this.f23589J;
    }

    /* renamed from: s1 */
    public final C1436e0 m13111s1() {
        return this.f23595P;
    }

    /* renamed from: t1 */
    public final C1436e0 m13110t1() {
        return this.f23585F;
    }

    /* renamed from: u1 */
    public final boolean m13108u1() {
        return (Intrinsics.equals(this.f23588I.mo172f(), this.f23597R.mo172f()) && Intrinsics.equals(this.f23589J.mo172f(), this.f23598S.mo172f()) && Intrinsics.equals(this.f23590K.mo172f(), this.f23599T.mo172f()) && Intrinsics.equals(this.f23591L.mo172f(), this.f23600U.mo172f()) && Intrinsics.equals(this.f23592M.mo172f(), this.f23601V.mo172f()) && Intrinsics.equals(this.f23593N.mo172f(), this.f23602W.mo172f()) && Intrinsics.equals(this.f23594O.mo172f(), this.f23603X.mo172f()) && Intrinsics.equals(this.f23595P.mo172f(), this.f23604Y.mo172f())) ? false : true;
    }

    /* renamed from: v1 */
    public final C1436e0 m13106v1() {
        return this.f23586G;
    }

    /* renamed from: w1 */
    public final View.OnClickListener m13104w1() {
        return new View.OnClickListener() { // from class: uh.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13102x1(NotificationsViewModel.this, view);
            }
        };
    }

    /* renamed from: y1 */
    public final View.OnClickListener m13100y1() {
        return new View.OnClickListener() { // from class: uh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsViewModel.m13098z1(NotificationsViewModel.this, view);
            }
        };
    }
}
