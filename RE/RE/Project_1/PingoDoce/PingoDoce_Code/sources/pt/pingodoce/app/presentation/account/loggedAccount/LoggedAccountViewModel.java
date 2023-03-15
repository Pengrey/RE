package pt.pingodoce.app.presentation.account.loggedAccount;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.C7405s1;
import mg.ClubManager;
import mg.LoyaltyCardManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p361t3.C10377a;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13807a0;
import p494zh.C13824d2;
import p494zh.C13853j2;
import p494zh.C13888p1;
import p494zh.C13890q;
import p494zh.C13895r0;
import p494zh.C13907u0;
import p494zh.C13908u1;
import p494zh.C13911v0;
import p494zh.C13920x1;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel;
import td.C10549n2;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a */
/* loaded from: classes2.dex */
public final class LoggedAccountViewModel extends NoConnectionViewModel {

    /* renamed from: A */
    private final LiveData f23325A;

    /* renamed from: B */
    private final LiveData f23326B;

    /* renamed from: C */
    private final C1436e0 f23327C;

    /* renamed from: D */
    private final LiveData f23328D;

    /* renamed from: p */
    private final LoyaltyCardManager f23329p;

    /* renamed from: q */
    private final C7405s1 f23330q;

    /* renamed from: r */
    private final ClubManager f23331r;

    /* renamed from: s */
    private boolean f23332s;

    /* renamed from: t */
    private final InterfaceC6108l f23333t;

    /* renamed from: u */
    private final LiveData f23334u;

    /* renamed from: v */
    private final LiveData f23335v;

    /* renamed from: w */
    private final LiveData f23336w;

    /* renamed from: x */
    private final LiveData f23337x;

    /* renamed from: y */
    private final LiveData f23338y;

    /* renamed from: z */
    private final LiveData f23339z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoggedAccountViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC8809a {
        LOGIN,
        CARD,
        BENEFITS,
        CLUB_LIST,
        PURCHASE_HISTORY,
        DEFAULT_STORE,
        PROFILE,
        SETTINGS
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoggedAccountViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$b */
    /* loaded from: classes2.dex */
    public static final class C8810b extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoggedAccountViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.LoggedLoggedAccountViewModel$clickThrottle$1$1", m20196f = "LoggedAccountViewModel.kt", m20195l = {57}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C8811a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f23341x;

            /* renamed from: y */
            final /* synthetic */ LoggedAccountViewModel f23342y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LoggedAccountViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.LoggedLoggedAccountViewModel$clickThrottle$1$1$1", m20196f = "LoggedAccountViewModel.kt", m20195l = {58}, m20194m = "invokeSuspend")
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C8812a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f23343x;

                /* renamed from: y */
                final /* synthetic */ LoggedAccountViewModel f23344y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8812a(LoggedAccountViewModel loggedAccountViewModel, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f23344y = loggedAccountViewModel;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C8812a(this.f23344y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C8812a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f23343x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        ClubManager m13586Z = LoggedAccountViewModel.m13586Z(this.f23344y);
                        this.f23343x = 1;
                        obj = m13586Z.m18646h(this);
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
                        BaseViewModel.m119C(this.f23344y, C13807a0.f34915a, null, 2, null);
                    } else if (result instanceof Result.C8077b) {
                        LoggedAccountViewModel.m13581e0(this.f23344y, ((Result.C8077b) result).m16964b());
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8811a(LoggedAccountViewModel loggedAccountViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f23342y = loggedAccountViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C8811a(this.f23342y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C8811a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23341x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoggedAccountViewModel loggedAccountViewModel = this.f23342y;
                    C8812a c8812a = new C8812a(loggedAccountViewModel, null);
                    this.f23341x = 1;
                    if (LoggedAccountViewModel.m13580f0(loggedAccountViewModel, true, c8812a, this) == m34636d) {
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

        /* compiled from: LoggedAccountViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$b$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8813b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23345a;

            static {
                int[] iArr = new int[EnumC8809a.values().length];
                iArr[EnumC8809a.CLUB_LIST.ordinal()] = 1;
                iArr[EnumC8809a.LOGIN.ordinal()] = 2;
                iArr[EnumC8809a.CARD.ordinal()] = 3;
                iArr[EnumC8809a.BENEFITS.ordinal()] = 4;
                iArr[EnumC8809a.PURCHASE_HISTORY.ordinal()] = 5;
                iArr[EnumC8809a.DEFAULT_STORE.ordinal()] = 6;
                iArr[EnumC8809a.PROFILE.ordinal()] = 7;
                iArr[EnumC8809a.SETTINGS.ordinal()] = 8;
                f23345a = iArr;
            }
        }

        C8810b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13559a(EnumC8809a enumC8809a) {
            Intrinsics.isThisObjectNull(enumC8809a, "action");
            switch (C8813b.f23345a[enumC8809a.ordinal()]) {
                case 1:
                    C6772d.m20158d(C1473p0.m36987a(LoggedAccountViewModel.this), null, null, new C8811a(LoggedAccountViewModel.this, null), 3, null);
                    return;
                case 2:
                    BaseViewModel.m119C(LoggedAccountViewModel.this, C13888p1.f35009a, null, 2, null);
                    return;
                case 3:
                    LoyaltyCard loyaltyCard = (LoyaltyCard) LoggedAccountViewModel.this.m13571o0().mo172f();
                    if ((loyaltyCard != null ? loyaltyCard.m13798n() : null) == LoyaltyCard.Type.PoupaMais) {
                        LoyaltyCard loyaltyCard2 = (LoyaltyCard) LoggedAccountViewModel.this.m13571o0().mo172f();
                        if (Intrinsics.equals(loyaltyCard2 != null ? loyaltyCard2.m13823G() : null, LoyaltyCardStatus.APPROVED.name())) {
                            BaseViewModel.m119C(LoggedAccountViewModel.this, C13895r0.f35016a, null, 2, null);
                            return;
                        }
                    }
                    LoyaltyCard loyaltyCard3 = (LoyaltyCard) LoggedAccountViewModel.this.m13571o0().mo172f();
                    if ((loyaltyCard3 != null ? loyaltyCard3.m13824F() : null) == LoyaltyCard.PoupaMaisStatus.Pending) {
                        BaseViewModel.m119C(LoggedAccountViewModel.this, C13911v0.f35032a, null, 2, null);
                        return;
                    } else {
                        BaseViewModel.m119C(LoggedAccountViewModel.this, C13907u0.f35028a, null, 2, null);
                        return;
                    }
                case 4:
                    BaseViewModel.m119C(LoggedAccountViewModel.this, C13890q.f35011a, null, 2, null);
                    return;
                case 5:
                    LoggedAccountViewModel loggedAccountViewModel = LoggedAccountViewModel.this;
                    loggedAccountViewModel.m120B(C13920x1.f35041a, Boolean.valueOf(LoggedAccountViewModel.m13583c0(loggedAccountViewModel)));
                    return;
                case 6:
                    BaseViewModel.m119C(LoggedAccountViewModel.this, C13853j2.f34961a, null, 2, null);
                    return;
                case 7:
                    BaseViewModel.m119C(LoggedAccountViewModel.this, C13908u1.f35029a, null, 2, null);
                    return;
                case 8:
                    BaseViewModel.m119C(LoggedAccountViewModel.this, C13824d2.f34931a, null, 2, null);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13559a((EnumC8809a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoggedAccountViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.LoggedLoggedAccountViewModel$onPullToRefresh$1", m20196f = "LoggedAccountViewModel.kt", m20195l = {144, 145}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$c */
    /* loaded from: classes2.dex */
    public static final class C8814c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23346x;

        C8814c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8814c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8814c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23346x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoggedAccountViewModel.m13582d0(LoggedAccountViewModel.this).mo169m(C6755b.m20201a(true));
                C7405s1 m13584b0 = LoggedAccountViewModel.m13584b0(LoggedAccountViewModel.this);
                this.f23346x = 1;
                if (m13584b0.m18505e(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                LoggedAccountViewModel.m13582d0(LoggedAccountViewModel.this).mo169m(C6755b.m20201a(false));
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
            }
            LoyaltyCardManager m13585a0 = LoggedAccountViewModel.m13585a0(LoggedAccountViewModel.this);
            this.f23346x = 2;
            if (m13585a0.m18931o(this) == m34636d) {
                return m34636d;
            }
            LoggedAccountViewModel.m13582d0(LoggedAccountViewModel.this).mo169m(C6755b.m20201a(false));
            return C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$d */
    /* loaded from: classes2.dex */
    public static final class C8815d<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard) obj).m13814P());
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$e */
    /* loaded from: classes2.dex */
    public static final class C8816e implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f23348w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C8817a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f23349w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.LoggedLoggedAccountViewModel$special$$inlined$map$2$2", m20196f = "LoggedAccountViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C8818a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f23350w;

                /* renamed from: x */
                int f23351x;

                public C8818a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23350w = obj;
                    this.f23351x |= Integer.MIN_VALUE;
                    return C8817a.this.mo4529a(null, this);
                }
            }

            public C8817a(InterfaceC6787d interfaceC6787d) {
                this.f23349w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8816e.C8817a.C8818a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.account.loggedAccount.a$e$a$a r0 = (pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8816e.C8817a.C8818a) r0
                    int r1 = r0.f23351x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23351x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.account.loggedAccount.a$e$a$a r0 = new pt.pingodoce.app.presentation.account.loggedAccount.a$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23350w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f23351x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f23349w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    java.lang.String r5 = r5.m18175w()
                    r0.f23351x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8816e.C8817a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8816e(InterfaceC6785c interfaceC6785c) {
            this.f23348w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f23348w.mo20086d(new C8817a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$f */
    /* loaded from: classes2.dex */
    public static final class C8819f implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f23353w;

        /* renamed from: x */
        final /* synthetic */ ResourcesProvider f23354x;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$f$a */
        /* loaded from: classes2.dex */
        public static final class C8820a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f23355w;

            /* renamed from: x */
            final /* synthetic */ ResourcesProvider f23356x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.LoggedLoggedAccountViewModel$special$$inlined$map$3$2", m20196f = "LoggedAccountViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C8821a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f23357w;

                /* renamed from: x */
                int f23358x;

                public C8821a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23357w = obj;
                    this.f23358x |= Integer.MIN_VALUE;
                    return C8820a.this.mo4529a(null, this);
                }
            }

            public C8820a(InterfaceC6787d interfaceC6787d, ResourcesProvider resourcesProvider) {
                this.f23355w = interfaceC6787d;
                this.f23356x = resourcesProvider;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r7, bd.InterfaceC1886d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8819f.C8820a.C8821a
                    if (r0 == 0) goto L13
                    r0 = r8
                    pt.pingodoce.app.presentation.account.loggedAccount.a$f$a$a r0 = (pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8819f.C8820a.C8821a) r0
                    int r1 = r0.f23358x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23358x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.account.loggedAccount.a$f$a$a r0 = new pt.pingodoce.app.presentation.account.loggedAccount.a$f$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f23357w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f23358x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r8)
                    goto L6b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    p468yc.C13186n.m1453b(r8)
                    kotlinx.coroutines.flow.d r8 = r6.f23355w
                    module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
                    jd.c0 r2 = p181jd.C6429c0.f17515a
                    u5.a r2 = r6.f23356x
                    r4 = 2131886712(0x7f120278, float:1.940801E38)
                    android.content.Context r2 = r2.m6899a()
                    java.lang.String r2 = r2.getString(r4)
                    java.lang.String r4 = "ctx.getString(id)"
                    p181jd.Intrinsics.checkIfNull(r2, r4)
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    r5 = 0
                    java.lang.String r7 = r7.m18178s()
                    r4[r5] = r7
                    java.lang.Object[] r7 = java.util.Arrays.copyOf(r4, r3)
                    java.lang.String r7 = java.lang.String.format(r2, r7)
                    java.lang.String r2 = "format(format, *args)"
                    p181jd.Intrinsics.checkIfNull(r7, r2)
                    r0.f23358x = r3
                    java.lang.Object r7 = r8.mo4529a(r7, r0)
                    if (r7 != r1) goto L6b
                    return r1
                L6b:
                    yc.u r7 = p468yc.C13195u.f34156a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel.C8819f.C8820a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8819f(InterfaceC6785c interfaceC6785c, ResourcesProvider resourcesProvider) {
            this.f23353w = interfaceC6785c;
            this.f23354x = resourcesProvider;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f23353w.mo20086d(new C8820a(interfaceC6787d, this.f23354x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$g */
    /* loaded from: classes2.dex */
    public static final class C8822g<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((String) obj).length() > 0);
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$h */
    /* loaded from: classes2.dex */
    public static final class C8823h<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((LoyaltyCard) obj).m13798n();
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.a$i */
    /* loaded from: classes2.dex */
    public static final class C8824i<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard.Type) obj) == LoyaltyCard.Type.PoupaMais);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedAccountViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1, ClubManager clubManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        this.f23329p = loyaltyCardManager;
        this.f23330q = c7405s1;
        this.f23331r = clubManager;
        this.f23333t = OperatorExtensions.m35176e(0L, null, new C8810b(), 3, null);
        LiveData m106t = m106t(loyaltyCardManager.m18930p());
        this.f23334u = m106t;
        Intrinsics.checkIfNull(C1465n0.m36993a(m106t(loyaltyCardManager.m18930p()), new C8815d()), "Transformations.map(this) { transform(it) }");
        this.f23335v = m106t(new C8816e(c7405s1.m18500j()));
        LiveData m106t2 = m106t(new C8819f(c7405s1.m18500j(), resourcesProvider));
        this.f23336w = m106t2;
        LiveData m36993a = C1465n0.m36993a(m106t2, new C8822g());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f23337x = m36993a;
        this.f23338y = new C1436e0(new C10377a());
        this.f23339z = m106t(loyaltyCardManager.m18927s());
        LiveData m36993a2 = C1465n0.m36993a(m106t, new C8823h());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f23325A = m36993a2;
        LiveData m36993a3 = C1465n0.m36993a(m36993a2, new C8824i());
        Intrinsics.checkIfNull(m36993a3, "Transformations.map(this) { transform(it) }");
        this.f23326B = m36993a3;
        C1436e0 c1436e0 = new C1436e0(Boolean.FALSE);
        this.f23327C = c1436e0;
        this.f23328D = c1436e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m13600A0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23332s = false;
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.PURCHASE_HISTORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m13598C0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23332s = true;
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.PURCHASE_HISTORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m13596E0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.SETTINGS);
    }

    /* renamed from: R */
    public static /* synthetic */ void m13594R(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13578h0(loggedAccountViewModel, view);
    }

    /* renamed from: S */
    public static /* synthetic */ void m13593S(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13598C0(loggedAccountViewModel, view);
    }

    /* renamed from: T */
    public static /* synthetic */ void m13592T(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13576j0(loggedAccountViewModel, view);
    }

    /* renamed from: U */
    public static /* synthetic */ void m13591U(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13596E0(loggedAccountViewModel, view);
    }

    /* renamed from: V */
    public static /* synthetic */ void m13590V(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13564v0(loggedAccountViewModel, view);
    }

    /* renamed from: W */
    public static /* synthetic */ void m13589W(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13561y0(loggedAccountViewModel, view);
    }

    /* renamed from: X */
    public static /* synthetic */ void m13588X(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13600A0(loggedAccountViewModel, view);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m13587Y(LoggedAccountViewModel loggedAccountViewModel, View view) {
        m13574l0(loggedAccountViewModel, view);
    }

    /* renamed from: Z */
    public static final /* synthetic */ ClubManager m13586Z(LoggedAccountViewModel loggedAccountViewModel) {
        return loggedAccountViewModel.f23331r;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ LoyaltyCardManager m13585a0(LoggedAccountViewModel loggedAccountViewModel) {
        return loggedAccountViewModel.f23329p;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ C7405s1 m13584b0(LoggedAccountViewModel loggedAccountViewModel) {
        return loggedAccountViewModel.f23330q;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ boolean m13583c0(LoggedAccountViewModel loggedAccountViewModel) {
        return loggedAccountViewModel.f23332s;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ C1436e0 m13582d0(LoggedAccountViewModel loggedAccountViewModel) {
        return loggedAccountViewModel.f23327C;
    }

    /* renamed from: e0 */
    public static final /* synthetic */ void m13581e0(LoggedAccountViewModel loggedAccountViewModel, Throwable th2) {
        loggedAccountViewModel.m109l(th2);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ Object m13580f0(LoggedAccountViewModel loggedAccountViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return loggedAccountViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m13578h0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.BENEFITS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m13576j0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.CLUB_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m13574l0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.DEFAULT_STORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m13564v0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m13561y0(LoggedAccountViewModel loggedAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(loggedAccountViewModel, "this$0");
        loggedAccountViewModel.f23333t.mo9587d(EnumC8809a.PROFILE);
    }

    /* renamed from: B0 */
    public final View.OnClickListener m13599B0() {
        return new View.OnClickListener() { // from class: bh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13598C0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: D0 */
    public final View.OnClickListener m13597D0() {
        return new View.OnClickListener() { // from class: bh.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13596E0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: N */
    protected void m13595N() {
        m13563w0();
    }

    /* renamed from: g0 */
    public final View.OnClickListener m13579g0() {
        return new View.OnClickListener() { // from class: bh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13578h0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: i0 */
    public final View.OnClickListener m13577i0() {
        return new View.OnClickListener() { // from class: bh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13576j0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: k0 */
    public final View.OnClickListener m13575k0() {
        return new View.OnClickListener() { // from class: bh.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13574l0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: m0 */
    public final LiveData m13573m0() {
        return this.f23339z;
    }

    /* renamed from: n0 */
    public final LiveData m13572n0() {
        return this.f23326B;
    }

    /* renamed from: o0 */
    public final LiveData m13571o0() {
        return this.f23334u;
    }

    /* renamed from: p0 */
    public final LiveData m13570p0() {
        return this.f23336w;
    }

    /* renamed from: q0 */
    public final LiveData m13569q0() {
        return this.f23337x;
    }

    /* renamed from: r0 */
    public final LiveData m13568r0() {
        return this.f23338y;
    }

    /* renamed from: s0 */
    public final LiveData m13567s0() {
        return this.f23335v;
    }

    /* renamed from: t0 */
    public final LiveData m13566t0() {
        return this.f23328D;
    }

    /* renamed from: u0 */
    public final View.OnClickListener m13565u0() {
        return new View.OnClickListener() { // from class: bh.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13564v0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: w0 */
    public final void m13563w0() {
        C6772d.m20158d(C1473p0.m36987a(this), C10549n2.m7695b(null, 1, null), null, new C8814c(null), 2, null);
    }

    /* renamed from: x0 */
    public final View.OnClickListener m13562x0() {
        return new View.OnClickListener() { // from class: bh.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13561y0(LoggedAccountViewModel.this, view);
            }
        };
    }

    /* renamed from: z0 */
    public final View.OnClickListener m13560z0() {
        return new View.OnClickListener() { // from class: bh.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoggedAccountViewModel.m13600A0(LoggedAccountViewModel.this, view);
            }
        };
    }
}
