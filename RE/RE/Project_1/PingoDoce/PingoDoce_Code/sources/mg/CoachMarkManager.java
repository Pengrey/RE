package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p066dg.CoachmarksAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: mg.q */
/* loaded from: classes2.dex */
public final class CoachMarkManager {

    /* renamed from: a */
    private final CoachmarksAgent f19593a;

    /* renamed from: b */
    private final LoyaltyCardAgent f19594b;

    /* renamed from: c */
    private final UserProfileAgent f19595c;

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.q$a */
    /* loaded from: classes2.dex */
    public static final class C7385a implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19596w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.q$a$a */
        /* loaded from: classes2.dex */
        public static final class C7386a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19597w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CoachMarkManager$observeHasShownCoachMarkForEditMode$$inlined$map$1$2", m20196f = "CoachMarkManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.q$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7387a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19598w;

                /* renamed from: x */
                int f19599x;

                public C7387a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19598w = obj;
                    this.f19599x |= Integer.MIN_VALUE;
                    return C7386a.this.mo4529a(null, this);
                }
            }

            public C7386a(InterfaceC6787d interfaceC6787d) {
                this.f19597w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.CoachMarkManager.C7385a.C7386a.C7387a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.q$a$a$a r0 = (mg.CoachMarkManager.C7385a.C7386a.C7387a) r0
                    int r1 = r0.f19599x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19599x = r1
                    goto L18
                L13:
                    mg.q$a$a$a r0 = new mg.q$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19598w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19599x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f19597w
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f19599x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.CoachMarkManager.C7385a.C7386a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7385a(InterfaceC6785c interfaceC6785c) {
            this.f19596w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19596w.mo20086d(new C7386a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.q$b */
    /* loaded from: classes2.dex */
    public static final class C7388b implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19601w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.q$b$a */
        /* loaded from: classes2.dex */
        public static final class C7389a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19602w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CoachMarkManager$observeShowBenefitsCoachMark$$inlined$map$1$2", m20196f = "CoachMarkManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.q$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C7390a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19603w;

                /* renamed from: x */
                int f19604x;

                public C7390a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19603w = obj;
                    this.f19604x |= Integer.MIN_VALUE;
                    return C7389a.this.mo4529a(null, this);
                }
            }

            public C7389a(InterfaceC6787d interfaceC6787d) {
                this.f19602w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.CoachMarkManager.C7388b.C7389a.C7390a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.q$b$a$a r0 = (mg.CoachMarkManager.C7388b.C7389a.C7390a) r0
                    int r1 = r0.f19604x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19604x = r1
                    goto L18
                L13:
                    mg.q$b$a$a r0 = new mg.q$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19603w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19604x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f19602w
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f19604x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.CoachMarkManager.C7388b.C7389a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7388b(InterfaceC6785c interfaceC6785c) {
            this.f19601w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19601w.mo20086d(new C7389a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoachMarkManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CoachMarkManager$observeShowLoyaltyCardCoachMark$1", m20196f = "CoachMarkManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.q$c */
    /* loaded from: classes2.dex */
    public static final class C7391c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19606x;

        /* renamed from: y */
        /* synthetic */ boolean f19607y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoachMarkManager.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CoachMarkManager$observeShowLoyaltyCardCoachMark$1$1", m20196f = "CoachMarkManager.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: mg.q$c$a */
        /* loaded from: classes2.dex */
        public static final class C7392a extends AbstractC6764l implements InterfaceC6113q {

            /* renamed from: x */
            int f19609x;

            /* renamed from: y */
            /* synthetic */ boolean f19610y;

            /* renamed from: z */
            /* synthetic */ Object f19611z;

            C7392a(InterfaceC1886d interfaceC1886d) {
                super(3, interfaceC1886d);
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                return m18597d(((Boolean) obj).booleanValue(), (LoyaltyCard) obj2, (InterfaceC1886d) obj3);
            }

            /* renamed from: d */
            public final Object m18597d(boolean z, LoyaltyCard loyaltyCard, InterfaceC1886d interfaceC1886d) {
                C7392a c7392a = new C7392a(interfaceC1886d);
                c7392a.f19610y = z;
                c7392a.f19611z = loyaltyCard;
                return c7392a.invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f19609x == 0) {
                    C13186n.m1453b(obj);
                    return C6755b.m20201a(!this.f19610y && ((LoyaltyCard) this.f19611z).m13798n() == LoyaltyCard.Type.PoupaMais);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C7391c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m18598d(((Boolean) obj).booleanValue(), (InterfaceC1886d) obj2);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C7391c c7391c = new C7391c(interfaceC1886d);
            c7391c.f19607y = ((Boolean) obj).booleanValue();
            return c7391c;
        }

        /* renamed from: d */
        public final Object m18598d(boolean z, InterfaceC1886d interfaceC1886d) {
            return ((C7391c) create(Boolean.valueOf(z), interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19606x == 0) {
                C13186n.m1453b(obj);
                if (this.f19607y) {
                    return C6788e.m20143e(CoachMarkManager.m18623a(CoachMarkManager.this).m26519K(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_COACH_MARK), CoachMarkManager.m18622b(CoachMarkManager.this).m25740E(), new C7392a(null));
                }
                return C6788e.m20126v(C6755b.m20201a(false));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CoachMarkManager(CoachmarksAgent coachmarksAgent, LoyaltyCardAgent loyaltyCardAgent, UserProfileAgent userProfileAgent) {
        Intrinsics.isThisObjectNull(coachmarksAgent, "coachmarksAgent");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        this.f19593a = coachmarksAgent;
        this.f19594b = loyaltyCardAgent;
        this.f19595c = userProfileAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ CoachmarksAgent m18623a(CoachMarkManager coachMarkManager) {
        return coachMarkManager.f19593a;
    }

    /* renamed from: b */
    public static final /* synthetic */ LoyaltyCardAgent m18622b(CoachMarkManager coachMarkManager) {
        return coachMarkManager.f19594b;
    }

    /* renamed from: c */
    public final Object m18621c(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26516g = this.f19593a.m26516g(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26516g == m34636d ? m26516g : C13195u.f34156a;
    }

    /* renamed from: d */
    public final void m18620d() {
        this.f19593a.m26520J(CoachmarksAgent.EnumC4827a.KEY_FOR_SKIP_SPLASH);
    }

    /* renamed from: e */
    public final boolean m18619e() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_EDIT_MODE_COACH_MARK);
    }

    /* renamed from: f */
    public final boolean m18618f() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_SHARE_COACH_MARK);
    }

    /* renamed from: g */
    public final boolean m18617g() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_SL_SHARE_COACH_MARK);
    }

    /* renamed from: h */
    public final boolean m18616h() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_STORE_MODE_COACH_MARK);
    }

    /* renamed from: i */
    public final boolean m18615i() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_SKIP_SPLASH);
    }

    /* renamed from: j */
    public final boolean m18614j() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_TAKE_AWAY_WALK_THROUGH);
    }

    /* renamed from: k */
    public final boolean m18613k() {
        return this.f19593a.m26518L(CoachmarksAgent.EnumC4827a.KEY_FOR_WALK_THROUGH);
    }

    /* renamed from: l */
    public final InterfaceC6785c m18612l() {
        return new C7385a(this.f19593a.m26519K(CoachmarksAgent.EnumC4827a.KEY_FOR_EDIT_MODE_COACH_MARK));
    }

    /* renamed from: m */
    public final InterfaceC6785c m18611m() {
        return new C7388b(this.f19593a.m26519K(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_BENEFITS));
    }

    /* renamed from: n */
    public final InterfaceC6785c m18610n() {
        return C6788e.m20133o(this.f19595c.m26568S(), new C7391c(null));
    }

    /* renamed from: o */
    public final void m18609o() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_BENEFITS);
    }

    /* renamed from: p */
    public final void m18608p() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_EDIT_MODE_COACH_MARK);
    }

    /* renamed from: q */
    public final void m18607q() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_COACH_MARK);
    }

    /* renamed from: r */
    public final void m18606r() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_LOYALTY_CARD_SHARE_COACH_MARK);
    }

    /* renamed from: s */
    public final void m18605s() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_SL_SHARE_COACH_MARK);
    }

    /* renamed from: t */
    public final void m18604t() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_STORE_MODE_COACH_MARK);
    }

    /* renamed from: u */
    public final void m18603u() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_SKIP_SPLASH);
    }

    /* renamed from: v */
    public final void m18602v() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_TAKE_AWAY_WALK_THROUGH);
    }

    /* renamed from: w */
    public final void m18601w() {
        this.f19593a.m26517M(CoachmarksAgent.EnumC4827a.KEY_FOR_WALK_THROUGH);
    }
}
