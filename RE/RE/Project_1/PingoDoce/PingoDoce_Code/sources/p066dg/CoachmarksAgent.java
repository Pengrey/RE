package p066dg;

import android.content.SharedPreferences;
import bd.InterfaceC1886d;
import cd.C2116d;
import eg.ValueAgent;
import gg.C5661i;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.Intrinsics;
import p317qg.C9729a;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13778q0;
import p489zc._Collections;
import td.InterfaceC10524i0;

/* renamed from: dg.j */
/* loaded from: classes2.dex */
public final class CoachmarksAgent extends ValueAgent {

    /* renamed from: h */
    private final SharedPreferences f13215h;

    /* compiled from: CoachmarksAgent.kt */
    /* renamed from: dg.j$a */
    /* loaded from: classes2.dex */
    public enum EnumC4827a {
        KEY_FOR_SKIP_SPLASH,
        KEY_FOR_WALK_THROUGH,
        KEY_FOR_TAKE_AWAY_WALK_THROUGH,
        KEY_FOR_LOYALTY_CARD_BENEFITS,
        KEY_FOR_LOYALTY_CARD_COACH_MARK,
        KEY_FOR_EDIT_MODE_COACH_MARK,
        KEY_FOR_STORE_MODE_COACH_MARK,
        KEY_FOR_LOYALTY_CARD_SHARE_COACH_MARK,
        KEY_FOR_SL_SHARE_COACH_MARK
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoachmarksAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.CoachmarksAgent$clear$1", m20196f = "CoachmarksAgent.kt", m20195l = {43, 43}, m20194m = "invokeSuspend")
    /* renamed from: dg.j$b */
    /* loaded from: classes2.dex */
    public static final class C4828b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ EnumC4827a f13216A;

        /* renamed from: x */
        Object f13217x;

        /* renamed from: y */
        int f13218y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4828b(EnumC4827a enumC4827a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13216A = enumC4827a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4828b(this.f13216A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4828b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            CoachmarksAgent coachmarksAgent;
            Set m452q0;
            m34636d = C2116d.m34636d();
            int i = this.f13218y;
            if (i == 0) {
                C13186n.m1453b(obj);
                coachmarksAgent = CoachmarksAgent.this;
                this.f13217x = coachmarksAgent;
                this.f13218y = 1;
                obj = coachmarksAgent.m25742C(this);
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
                coachmarksAgent = (CoachmarksAgent) this.f13217x;
                C13186n.m1453b(obj);
            }
            m452q0 = _Collections.m452q0((Iterable) obj);
            m452q0.remove(this.f13216A.name());
            this.f13217x = null;
            this.f13218y = 2;
            if (coachmarksAgent.m25783y(m452q0, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: dg.j$c */
    /* loaded from: classes2.dex */
    public static final class C4829c implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f13220w;

        /* renamed from: x */
        final /* synthetic */ EnumC4827a f13221x;

        /* compiled from: Emitters.kt */
        /* renamed from: dg.j$c$a */
        /* loaded from: classes2.dex */
        public static final class C4830a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f13222w;

            /* renamed from: x */
            final /* synthetic */ EnumC4827a f13223x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.CoachmarksAgent$getFlowFor$$inlined$map$1$2", m20196f = "CoachmarksAgent.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: dg.j$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C4831a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f13224w;

                /* renamed from: x */
                int f13225x;

                public C4831a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f13224w = obj;
                    this.f13225x |= Integer.MIN_VALUE;
                    return C4830a.this.mo4529a(null, this);
                }
            }

            public C4830a(InterfaceC6787d interfaceC6787d, EnumC4827a enumC4827a) {
                this.f13222w = interfaceC6787d;
                this.f13223x = enumC4827a;
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
                    boolean r0 = r6 instanceof p066dg.CoachmarksAgent.C4829c.C4830a.C4831a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dg.j$c$a$a r0 = (p066dg.CoachmarksAgent.C4829c.C4830a.C4831a) r0
                    int r1 = r0.f13225x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13225x = r1
                    goto L18
                L13:
                    dg.j$c$a$a r0 = new dg.j$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13224w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f13225x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f13222w
                    java.util.Set r5 = (java.util.Set) r5
                    dg.j$a r2 = r4.f13223x
                    java.lang.String r2 = r2.name()
                    boolean r5 = r5.contains(r2)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f13225x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p066dg.CoachmarksAgent.C4829c.C4830a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C4829c(InterfaceC6785c interfaceC6785c, EnumC4827a enumC4827a) {
            this.f13220w = interfaceC6785c;
            this.f13221x = enumC4827a;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f13220w.mo20086d(new C4830a(interfaceC6787d, this.f13221x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: CoachmarksAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.CoachmarksAgent$getFreshData$1", m20196f = "CoachmarksAgent.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: dg.j$d */
    /* loaded from: classes2.dex */
    static final class C4832d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f13227x;

        C4832d(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C4832d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C4832d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f13227x == 0) {
                C13186n.m1453b(obj);
                return C4835k.m26511a(CoachmarksAgent.m26521I(CoachmarksAgent.this));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoachmarksAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.CoachmarksAgent$hasShown$1", m20196f = "CoachmarksAgent.kt", m20195l = {37}, m20194m = "invokeSuspend")
    /* renamed from: dg.j$e */
    /* loaded from: classes2.dex */
    public static final class C4833e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13229x;

        /* renamed from: z */
        final /* synthetic */ EnumC4827a f13231z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4833e(EnumC4827a enumC4827a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13231z = enumC4827a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4833e(this.f13231z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4833e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13229x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CoachmarksAgent coachmarksAgent = CoachmarksAgent.this;
                this.f13229x = 1;
                obj = coachmarksAgent.m25742C(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C6755b.m20201a(((Set) obj).contains(this.f13231z.name()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoachmarksAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.CoachmarksAgent$setHasShown$1", m20196f = "CoachmarksAgent.kt", m20195l = {51, 51}, m20194m = "invokeSuspend")
    /* renamed from: dg.j$f */
    /* loaded from: classes2.dex */
    public static final class C4834f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ EnumC4827a f13232A;

        /* renamed from: x */
        Object f13233x;

        /* renamed from: y */
        int f13234y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4834f(EnumC4827a enumC4827a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13232A = enumC4827a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4834f(this.f13232A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4834f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            CoachmarksAgent coachmarksAgent;
            Set m452q0;
            m34636d = C2116d.m34636d();
            int i = this.f13234y;
            if (i == 0) {
                C13186n.m1453b(obj);
                coachmarksAgent = CoachmarksAgent.this;
                this.f13233x = coachmarksAgent;
                this.f13234y = 1;
                obj = coachmarksAgent.m25742C(this);
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
                coachmarksAgent = (CoachmarksAgent) this.f13233x;
                C13186n.m1453b(obj);
            }
            m452q0 = _Collections.m452q0((Iterable) obj);
            m452q0.add(this.f13232A.name());
            this.f13233x = null;
            this.f13234y = 2;
            if (coachmarksAgent.m25783y(m452q0, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachmarksAgent(C5661i c5661i, SharedPreferences sharedPreferences) {
        super(new C9729a(1576800000L, 1576800000L), c5661i);
        Intrinsics.isThisObjectNull(c5661i, "localDataProvider");
        Intrinsics.isThisObjectNull(sharedPreferences, "preferences");
        this.f13215h = sharedPreferences;
    }

    /* renamed from: I */
    public static final /* synthetic */ SharedPreferences m26521I(CoachmarksAgent coachmarksAgent) {
        return coachmarksAgent.f13215h;
    }

    /* renamed from: F */
    public InterfaceC6108l m26522F() {
        return new C4832d(null);
    }

    /* renamed from: J */
    public final void m26520J(EnumC4827a enumC4827a) {
        Intrinsics.isThisObjectNull(enumC4827a, "coachmark");
        C6770c.m20162b(null, new C4828b(enumC4827a, null), 1, null);
    }

    /* renamed from: K */
    public final InterfaceC6785c m26519K(EnumC4827a enumC4827a) {
        Intrinsics.isThisObjectNull(enumC4827a, "coachmark");
        return new C4829c(C6788e.m20137k(m25740E()), enumC4827a);
    }

    /* renamed from: L */
    public final boolean m26518L(EnumC4827a enumC4827a) {
        Object m20162b;
        Intrinsics.isThisObjectNull(enumC4827a, "coachmark");
        m20162b = C6770c.m20162b(null, new C4833e(enumC4827a, null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* renamed from: M */
    public final void m26517M(EnumC4827a enumC4827a) {
        Intrinsics.isThisObjectNull(enumC4827a, "coachmark");
        C6770c.m20162b(null, new C4834f(enumC4827a, null), 1, null);
    }

    /* renamed from: g */
    public Object m26516g(InterfaceC1886d interfaceC1886d) {
        Set m208b;
        Object m34636d;
        m208b = C13778q0.m208b();
        Object m25783y = m25783y(m208b, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25783y == m34636d ? m25783y : C13195u.f34156a;
    }
}
