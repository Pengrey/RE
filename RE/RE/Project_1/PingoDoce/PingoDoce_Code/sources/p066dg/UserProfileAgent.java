package p066dg;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import eg.NullableValueAgent;
import gg.C5682w;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import module.network.data.remote.models.user.User;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;
import vg.UserService;

/* renamed from: dg.b0 */
/* loaded from: classes2.dex */
public final class UserProfileAgent extends NullableValueAgent {

    /* renamed from: h */
    private final UserService f13135h;

    /* renamed from: i */
    private final C5682w f13136i;

    /* renamed from: j */
    private final SimpleDateFormat f13137j;

    /* renamed from: k */
    private final SimpleDateFormat f13138k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent", m20196f = "UserProfileAgent.kt", m20195l = {86, 87, 89}, m20194m = "deletePicture")
    /* renamed from: dg.b0$a */
    /* loaded from: classes2.dex */
    public static final class C4797a extends AbstractC6757d {

        /* renamed from: w */
        Object f13139w;

        /* renamed from: x */
        /* synthetic */ Object f13140x;

        /* renamed from: z */
        int f13142z;

        C4797a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13140x = obj;
            this.f13142z |= Integer.MIN_VALUE;
            return UserProfileAgent.this.m26576K(this);
        }
    }

    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$getFreshData$1", m20196f = "UserProfileAgent.kt", m20195l = {33}, m20194m = "invokeSuspend")
    /* renamed from: dg.b0$b */
    /* loaded from: classes2.dex */
    static final class C4798b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        Object f13143x;

        /* renamed from: y */
        int f13144y;

        C4798b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C4798b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C4798b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            UserProfileAgent userProfileAgent;
            m34636d = C2116d.m34636d();
            int i = this.f13144y;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent userProfileAgent2 = UserProfileAgent.this;
                UserService m26578I = UserProfileAgent.m26578I(userProfileAgent2);
                this.f13143x = userProfileAgent2;
                this.f13144y = 1;
                Object m5470q = m26578I.m5470q(this);
                if (m5470q == m34636d) {
                    return m34636d;
                }
                userProfileAgent = userProfileAgent2;
                obj = m5470q;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                userProfileAgent = (UserProfileAgent) this.f13143x;
                C13186n.m1453b(obj);
            }
            return UserProfileAgent.m26579H(userProfileAgent, (User) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$hasAnonymousSession$1", m20196f = "UserProfileAgent.kt", m20195l = {67}, m20194m = "invokeSuspend")
    /* renamed from: dg.b0$c */
    /* loaded from: classes2.dex */
    public static final class C4799c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13146x;

        C4799c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4799c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4799c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13146x;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m26557r = UserProfileAgent.this.m26557r();
                this.f13146x = 1;
                obj = m26557r.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            User user = (User) obj;
            if (user == null || !user.m18197H()) {
                z = false;
            }
            return C6755b.m20201a(z);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: dg.b0$d */
    /* loaded from: classes2.dex */
    public static final class C4800d implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f13148w;

        /* compiled from: Emitters.kt */
        /* renamed from: dg.b0$d$a */
        /* loaded from: classes2.dex */
        public static final class C4801a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f13149w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$hasAnonymousSessionFlow$$inlined$map$1$2", m20196f = "UserProfileAgent.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: dg.b0$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C4802a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f13150w;

                /* renamed from: x */
                int f13151x;

                public C4802a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f13150w = obj;
                    this.f13151x |= Integer.MIN_VALUE;
                    return C4801a.this.mo4529a(null, this);
                }
            }

            public C4801a(InterfaceC6787d interfaceC6787d) {
                this.f13149w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof p066dg.UserProfileAgent.C4800d.C4801a.C4802a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dg.b0$d$a$a r0 = (p066dg.UserProfileAgent.C4800d.C4801a.C4802a) r0
                    int r1 = r0.f13151x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13151x = r1
                    goto L18
                L13:
                    dg.b0$d$a$a r0 = new dg.b0$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13150w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f13151x
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
                    kotlinx.coroutines.flow.d r6 = r4.f13149w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    r2 = 0
                    if (r5 == 0) goto L42
                    boolean r5 = r5.m18197H()
                    if (r5 != r3) goto L42
                    r2 = r3
                L42:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r2)
                    r0.f13151x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.C4800d.C4801a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C4800d(InterfaceC6785c interfaceC6785c) {
            this.f13148w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f13148w.mo20086d(new C4801a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$hasGuestOrLoggedSession$1", m20196f = "UserProfileAgent.kt", m20195l = {49}, m20194m = "invokeSuspend")
    /* renamed from: dg.b0$e */
    /* loaded from: classes2.dex */
    public static final class C4803e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13153x;

        C4803e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4803e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4803e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13153x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m26557r = UserProfileAgent.this.m26557r();
                this.f13153x = 1;
                obj = m26557r.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C6755b.m20201a(obj != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$hasLoggedSession$1", m20196f = "UserProfileAgent.kt", m20195l = {62}, m20194m = "invokeSuspend")
    /* renamed from: dg.b0$f */
    /* loaded from: classes2.dex */
    public static final class C4804f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13155x;

        C4804f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4804f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4804f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13155x;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m26557r = UserProfileAgent.this.m26557r();
                this.f13155x = 1;
                obj = m26557r.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            User user = (User) obj;
            if (user == null || !user.m18195J()) {
                z = false;
            }
            return C6755b.m20201a(z);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: dg.b0$g */
    /* loaded from: classes2.dex */
    public static final class C4805g implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f13157w;

        /* compiled from: Emitters.kt */
        /* renamed from: dg.b0$g$a */
        /* loaded from: classes2.dex */
        public static final class C4806a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f13158w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent$hasLoggedSessionFlow$$inlined$map$1$2", m20196f = "UserProfileAgent.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: dg.b0$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C4807a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f13159w;

                /* renamed from: x */
                int f13160x;

                public C4807a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f13159w = obj;
                    this.f13160x |= Integer.MIN_VALUE;
                    return C4806a.this.mo4529a(null, this);
                }
            }

            public C4806a(InterfaceC6787d interfaceC6787d) {
                this.f13158w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof p066dg.UserProfileAgent.C4805g.C4806a.C4807a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dg.b0$g$a$a r0 = (p066dg.UserProfileAgent.C4805g.C4806a.C4807a) r0
                    int r1 = r0.f13160x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13160x = r1
                    goto L18
                L13:
                    dg.b0$g$a$a r0 = new dg.b0$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13159w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f13160x
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
                    kotlinx.coroutines.flow.d r6 = r4.f13158w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    r2 = 0
                    if (r5 == 0) goto L42
                    boolean r5 = r5.m18195J()
                    if (r5 != r3) goto L42
                    r2 = r3
                L42:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r2)
                    r0.f13160x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.C4805g.C4806a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C4805g(InterfaceC6785c interfaceC6785c) {
            this.f13157w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f13157w.mo20086d(new C4806a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    /* renamed from: dg.b0$h */
    /* loaded from: classes2.dex */
    public static final class C4808h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f13162w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4808h(String str) {
            super(1);
            this.f13162w = str;
        }

        /* renamed from: a */
        public final User mo9587d(User user) {
            Intrinsics.isThisObjectNull(user, "it");
            return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, this.f13162w, null, 49151, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    /* renamed from: dg.b0$i */
    /* loaded from: classes2.dex */
    public static final class C4809i extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f13163w;

        /* renamed from: x */
        final /* synthetic */ boolean f13164x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4809i(String str, boolean z) {
            super(1);
            this.f13163w = str;
            this.f13164x = z;
        }

        /* renamed from: a */
        public final User mo9587d(User user) {
            Intrinsics.isThisObjectNull(user, "it");
            return User.m18190b(user, this.f13163w, this.f13164x, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65532, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    /* renamed from: dg.b0$j */
    /* loaded from: classes2.dex */
    public static final class C4810j extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f13165w;

        /* renamed from: x */
        final /* synthetic */ String f13166x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4810j(String str, String str2) {
            super(1);
            this.f13165w = str;
            this.f13166x = str2;
        }

        /* renamed from: a */
        public final User mo9587d(User user) {
            Intrinsics.isThisObjectNull(user, "it");
            return User.m18190b(user, null, false, this.f13165w, this.f13166x, null, null, false, null, null, null, null, null, null, null, null, null, 65523, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    /* renamed from: dg.b0$k */
    /* loaded from: classes2.dex */
    public static final class C4811k extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f13167w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4811k(String str) {
            super(1);
            this.f13167w = str;
        }

        /* renamed from: a */
        public final User mo9587d(User user) {
            Intrinsics.isThisObjectNull(user, "it");
            return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, this.f13167w, null, null, null, null, null, 64511, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent", m20196f = "UserProfileAgent.kt", m20195l = {79, 80, 82}, m20194m = "updatePicture")
    /* renamed from: dg.b0$l */
    /* loaded from: classes2.dex */
    public static final class C4812l extends AbstractC6757d {

        /* renamed from: A */
        int f13168A;

        /* renamed from: w */
        Object f13169w;

        /* renamed from: x */
        Object f13170x;

        /* renamed from: y */
        /* synthetic */ Object f13171y;

        C4812l(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13171y = obj;
            this.f13168A |= Integer.MIN_VALUE;
            return UserProfileAgent.this.m26562Y(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent", m20196f = "UserProfileAgent.kt", m20195l = {C0868i.f2778I0, 111, 112}, m20194m = "updatePropertyInUser")
    /* renamed from: dg.b0$m */
    /* loaded from: classes2.dex */
    public static final class C4813m extends AbstractC6757d {

        /* renamed from: A */
        int f13173A;

        /* renamed from: w */
        Object f13174w;

        /* renamed from: x */
        Object f13175x;

        /* renamed from: y */
        /* synthetic */ Object f13176y;

        C4813m(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13176y = obj;
            this.f13173A |= Integer.MIN_VALUE;
            return UserProfileAgent.m26577J(UserProfileAgent.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.UserProfileAgent", m20196f = "UserProfileAgent.kt", m20195l = {40, 41}, m20194m = "updateUnlocked")
    /* renamed from: dg.b0$n */
    /* loaded from: classes2.dex */
    public static final class C4814n extends AbstractC6757d {

        /* renamed from: A */
        int f13178A;

        /* renamed from: w */
        Object f13179w;

        /* renamed from: x */
        Object f13180x;

        /* renamed from: y */
        /* synthetic */ Object f13181y;

        C4814n(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13181y = obj;
            this.f13178A |= Integer.MIN_VALUE;
            return UserProfileAgent.this.m26556z(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileAgent(UserService userService, C5682w c5682w, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
        super(null, c5682w, 1, null);
        Intrinsics.isThisObjectNull(userService, "service");
        Intrinsics.isThisObjectNull(c5682w, "localDataProvider");
        Intrinsics.isThisObjectNull(simpleDateFormat, "birthDateServerFormat");
        Intrinsics.isThisObjectNull(simpleDateFormat2, "birthDateAppFormat");
        this.f13135h = userService;
        this.f13136i = c5682w;
        this.f13137j = simpleDateFormat;
        this.f13138k = simpleDateFormat2;
    }

    /* renamed from: H */
    public static final /* synthetic */ User m26579H(UserProfileAgent userProfileAgent, User user) {
        return userProfileAgent.m26574M(user);
    }

    /* renamed from: I */
    public static final /* synthetic */ UserService m26578I(UserProfileAgent userProfileAgent) {
        return userProfileAgent.f13135h;
    }

    /* renamed from: J */
    public static final /* synthetic */ Object m26577J(UserProfileAgent userProfileAgent, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return userProfileAgent.m26561Z(interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: L */
    private final User m26575L(User user) {
        if (!(user.m18188d().length() == 0) && !Intrinsics.equals(user.m18188d(), "0001-01-01T00:00:00")) {
            Date parse = this.f13138k.parse(user.m18188d());
            return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, String.valueOf(parse != null ? this.f13137j.format(parse) : null), null, 49151, null);
        }
        return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, BuildConfig.VERSION_NAME, null, 49151, null);
    }

    /* renamed from: M */
    private final User m26574M(User user) {
        if (!(user.m18188d().length() == 0) && !Intrinsics.equals(user.m18188d(), "0001-01-01T00:00:00")) {
            Date parse = this.f13137j.parse(user.m18188d());
            return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, String.valueOf(parse != null ? this.f13138k.format(parse) : null), null, 49151, null);
        }
        return User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, BuildConfig.VERSION_NAME, null, 49151, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m26561Z(id.InterfaceC6108l r7, bd.InterfaceC1886d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p066dg.UserProfileAgent.C4813m
            if (r0 == 0) goto L13
            r0 = r8
            dg.b0$m r0 = (p066dg.UserProfileAgent.C4813m) r0
            int r1 = r0.f13173A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13173A = r1
            goto L18
        L13:
            dg.b0$m r0 = new dg.b0$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13176y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13173A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f13175x
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            java.lang.Object r2 = r0.f13174w
            dg.b0 r2 = (p066dg.UserProfileAgent) r2
            p468yc.C13186n.m1453b(r8)
            goto L78
        L43:
            java.lang.Object r7 = r0.f13175x
            id.l r7 = (id.InterfaceC6108l) r7
            java.lang.Object r2 = r0.f13174w
            dg.b0 r2 = (p066dg.UserProfileAgent) r2
            p468yc.C13186n.m1453b(r8)
            goto L60
        L4f:
            p468yc.C13186n.m1453b(r8)
            r0.f13174w = r6
            r0.f13175x = r7
            r0.f13173A = r5
            java.lang.Object r8 = r6.m25771D(r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r2 = r6
        L60:
            p181jd.Intrinsics.ifNullDoSomething(r8)
            module.network.data.remote.models.user.User r8 = (module.network.data.remote.models.user.User) r8
            java.lang.Object r7 = r7.mo9587d(r8)
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            r0.f13174w = r2
            r0.f13175x = r7
            r0.f13173A = r4
            java.lang.Object r8 = r2.m26559b0(r7, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            r8 = 0
            r0.f13174w = r8
            r0.f13175x = r8
            r0.f13173A = r3
            java.lang.Object r7 = r2.m25783y(r7, r0)
            if (r7 != r1) goto L86
            return r1
        L86:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.m26561Z(id.l, bd.d):java.lang.Object");
    }

    /* renamed from: b0 */
    private final Object m26559b0(User user, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m5466u = this.f13135h.m5466u(m26575L(user), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m5466u == m34636d ? m5466u : C13195u.f34156a;
    }

    /* renamed from: G */
    public InterfaceC6108l m26580G() {
        return new C4798b(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26576K(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p066dg.UserProfileAgent.C4797a
            if (r0 == 0) goto L13
            r0 = r7
            dg.b0$a r0 = (p066dg.UserProfileAgent.C4797a) r0
            int r1 = r0.f13142z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13142z = r1
            goto L18
        L13:
            dg.b0$a r0 = new dg.b0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13140x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13142z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r7)
            goto L79
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f13139w
            dg.b0 r2 = (p066dg.UserProfileAgent) r2
            p468yc.C13186n.m1453b(r7)
            goto L63
        L3f:
            java.lang.Object r2 = r0.f13139w
            dg.b0 r2 = (p066dg.UserProfileAgent) r2
            p468yc.C13186n.m1453b(r7)
            goto L58
        L47:
            p468yc.C13186n.m1453b(r7)
            vg.k0 r7 = r6.f13135h
            r0.f13139w = r6
            r0.f13142z = r5
            java.lang.Object r7 = r7.m5473n(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r2 = r6
        L58:
            r0.f13139w = r2
            r0.f13142z = r4
            java.lang.Object r7 = r2.m25771D(r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            p181jd.Intrinsics.ifNullDoSomething(r7)
            java.lang.String r4 = ""
            r7.m18192M(r4)
            r4 = 0
            r0.f13139w = r4
            r0.f13142z = r3
            java.lang.Object r7 = r2.m25783y(r7, r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.m26576K(bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public C5682w m26557r() {
        return this.f13136i;
    }

    /* renamed from: O */
    public final boolean m26572O() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C4799c(null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* renamed from: P */
    public final InterfaceC6785c m26571P() {
        return new C4800d(m25769F());
    }

    /* renamed from: Q */
    public final boolean m26570Q() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C4803e(null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* renamed from: R */
    public final boolean m26569R() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C4804f(null), 1, null);
        return ((Boolean) m20162b).booleanValue();
    }

    /* renamed from: S */
    public final InterfaceC6785c m26568S() {
        return new C4805g(m25769F());
    }

    /* renamed from: T */
    public final Object m26567T(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m25783y = super.m25783y(new User(null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25783y == m34636d ? m25783y : C13195u.f34156a;
    }

    /* renamed from: U */
    public final Object m26566U(String str, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26561Z = m26561Z(new C4808h(str), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26561Z == m34636d ? m26561Z : C13195u.f34156a;
    }

    /* renamed from: V */
    public final Object m26565V(String str, boolean z, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26561Z = m26561Z(new C4809i(str, z), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26561Z == m34636d ? m26561Z : C13195u.f34156a;
    }

    /* renamed from: W */
    public final Object m26564W(String str, String str2, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26561Z = m26561Z(new C4810j(str, str2), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26561Z == m34636d ? m26561Z : C13195u.f34156a;
    }

    /* renamed from: X */
    public final Object m26563X(String str, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26561Z = m26561Z(new C4811k(str), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26561Z == m34636d ? m26561Z : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26562Y(android.graphics.Bitmap r28, bd.InterfaceC1886d r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            boolean r2 = r1 instanceof p066dg.UserProfileAgent.C4812l
            if (r2 == 0) goto L17
            r2 = r1
            dg.b0$l r2 = (p066dg.UserProfileAgent.C4812l) r2
            int r3 = r2.f13168A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f13168A = r3
            goto L1c
        L17:
            dg.b0$l r2 = new dg.b0$l
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f13171y
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f13168A
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L50
            if (r4 == r7) goto L48
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            p468yc.C13186n.m1453b(r1)
            goto Lb0
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r4 = r2.f13170x
            pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse r4 = (pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse) r4
            java.lang.Object r6 = r2.f13169w
            dg.b0 r6 = (p066dg.UserProfileAgent) r6
            p468yc.C13186n.m1453b(r1)
            goto L78
        L48:
            java.lang.Object r4 = r2.f13169w
            dg.b0 r4 = (p066dg.UserProfileAgent) r4
            p468yc.C13186n.m1453b(r1)
            goto L63
        L50:
            p468yc.C13186n.m1453b(r1)
            vg.k0 r1 = r0.f13135h
            r2.f13169w = r0
            r2.f13168A = r7
            r4 = r28
            java.lang.Object r1 = r1.m5465v(r4, r2)
            if (r1 != r3) goto L62
            return r3
        L62:
            r4 = r0
        L63:
            pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse r1 = (pt.pingodoce.app.data.remote.models.response.PhotoUploadResponse) r1
            r2.f13169w = r4
            r2.f13170x = r1
            r2.f13168A = r6
            java.lang.Object r6 = r4.m25771D(r2)
            if (r6 != r3) goto L72
            return r3
        L72:
            r26 = r4
            r4 = r1
            r1 = r6
            r6 = r26
        L78:
            p181jd.Intrinsics.ifNullDoSomething(r1)
            r7 = r1
            module.network.data.remote.models.user.User r7 = (module.network.data.remote.models.user.User) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r13 = r4.m13760a()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 65503(0xffdf, float:9.1789E-41)
            r25 = 0
            module.network.data.remote.models.user.User r1 = module.network.data.remote.models.user.User.m18190b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            r2.f13169w = r4
            r2.f13170x = r4
            r2.f13168A = r5
            java.lang.Object r1 = r6.m25783y(r1, r2)
            if (r1 != r3) goto Lb0
            return r3
        Lb0:
            yc.u r1 = p468yc.C13195u.f34156a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.m26562Y(android.graphics.Bitmap, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m26556z(module.network.data.remote.models.user.User r6, bd.InterfaceC1886d r7) throws ve.EmptyUserException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p066dg.UserProfileAgent.C4814n
            if (r0 == 0) goto L13
            r0 = r7
            dg.b0$n r0 = (p066dg.UserProfileAgent.C4814n) r0
            int r1 = r0.f13178A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13178A = r1
            goto L18
        L13:
            dg.b0$n r0 = new dg.b0$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13181y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13178A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f13180x
            module.network.data.remote.models.user.User r6 = (module.network.data.remote.models.user.User) r6
            java.lang.Object r2 = r0.f13179w
            dg.b0 r2 = (p066dg.UserProfileAgent) r2
            p468yc.C13186n.m1453b(r7)
            goto L5d
        L40:
            p468yc.C13186n.m1453b(r7)
            if (r6 == 0) goto L7f
            boolean r7 = r6.m18199F()
            if (r7 == 0) goto L72
            qg.a r7 = r5.m25766s()
            r0.f13179w = r5
            r0.f13180x = r6
            r0.f13178A = r4
            java.lang.Object r7 = r7.m10091j(r6, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r5
        L5d:
            gg.w r7 = r2.m26557r()
            r2 = 0
            r0.f13179w = r2
            r0.f13180x = r2
            r0.f13178A = r3
            java.lang.Object r6 = r7.mo22682i(r6, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L72:
            ve.a r6 = new ve.a
            af.a r7 = new af.a
            java.lang.String r0 = "/getUserProfiles body value should not be empty"
            r7.<init>(r0)
            r6.<init>(r7)
            throw r6
        L7f:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dg.UserProfileAgent.m26556z(module.network.data.remote.models.user.User, bd.d):java.lang.Object");
    }

    /* renamed from: c0 */
    public final Object m26558c0(User user, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        if (Intrinsics.equals(user != null ? user.m18188d() : null, "0001-01-01T00:00:00")) {
            Object m25783y = super.m25783y(User.m18190b(user, null, false, null, null, null, null, false, null, null, null, null, null, null, null, BuildConfig.VERSION_NAME, null, 49151, null), interfaceC1886d);
            m34636d2 = C2116d.m34636d();
            return m25783y == m34636d2 ? m25783y : C13195u.f34156a;
        }
        Object m25783y2 = super.m25783y(user, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m25783y2 == m34636d ? m25783y2 : C13195u.f34156a;
    }
}
