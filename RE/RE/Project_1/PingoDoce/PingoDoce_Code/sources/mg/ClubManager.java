package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p066dg.BannersAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.clubs.Club;
import td.InterfaceC10524i0;

/* renamed from: mg.o */
/* loaded from: classes2.dex */
public final class ClubManager {

    /* renamed from: a */
    private final ClubsAgent f19547a;

    /* renamed from: b */
    private final ClubsCodesAgent f19548b;

    /* renamed from: c */
    private final UserProfileAgent f19549c;

    /* renamed from: d */
    private final LoyaltyCardAgent f19550d;

    /* renamed from: e */
    private final FlyersAgent f19551e;

    /* renamed from: f */
    private final SearchCatalogResponsesAgent f19552f;

    /* renamed from: g */
    private final RecommendationsCatalogResponsesAgent f19553g;

    /* renamed from: h */
    private final BannersAgent f19554h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager", m20196f = "ClubManager.kt", m20195l = {66, 67, 68, 69, 70, 71}, m20194m = "cleanClubCodesRelatedCache")
    /* renamed from: mg.o$a */
    /* loaded from: classes2.dex */
    public static final class C7364a extends AbstractC6757d {

        /* renamed from: w */
        Object f19555w;

        /* renamed from: x */
        /* synthetic */ Object f19556x;

        /* renamed from: z */
        int f19558z;

        C7364a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19556x = obj;
            this.f19558z |= Integer.MIN_VALUE;
            return ClubManager.m18653a(ClubManager.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$forceFetchClubCodes$2", m20196f = "ClubManager.kt", m20195l = {42}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$b */
    /* loaded from: classes2.dex */
    public static final class C7365b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19559x;

        C7365b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7365b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7365b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19559x;
            if (i == 0) {
                C13186n.m1453b(obj);
                if (ClubManager.m18650d(ClubManager.this).m26569R()) {
                    ClubsCodesAgent m18651c = ClubManager.m18651c(ClubManager.this);
                    this.f19559x = 1;
                    if (m18651c.m25743B(this) == m34636d) {
                        return m34636d;
                    }
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
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$getClubsList$2", m20196f = "ClubManager.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$c */
    /* loaded from: classes2.dex */
    public static final class C7366c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19561x;

        C7366c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7366c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7366c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19561x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsAgent m18652b = ClubManager.m18652b(ClubManager.this);
                this.f19561x = 1;
                obj = m18652b.m25742C(this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$loadCachedClubList$1", m20196f = "ClubManager.kt", m20195l = {76}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$d */
    /* loaded from: classes2.dex */
    public static final class C7367d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19563x;

        C7367d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7367d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7367d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19563x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m25740E = ClubManager.m18652b(ClubManager.this).m25740E();
                this.f19563x = 1;
                obj = C6788e.m20136l(m25740E, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$subscribeClub$2", m20196f = "ClubManager.kt", m20195l = {53, 54}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$e */
    /* loaded from: classes2.dex */
    public static final class C7368e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19565x;

        /* renamed from: z */
        final /* synthetic */ Club f19567z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7368e(Club club, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19567z = club;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7368e(this.f19567z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7368e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19565x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsAgent m18652b = ClubManager.m18652b(ClubManager.this);
                Club club = this.f19567z;
                this.f19565x = 1;
                if (m18652b.m26535I(club, this) == m34636d) {
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
            ClubManager clubManager = ClubManager.this;
            this.f19565x = 2;
            if (ClubManager.m18649e(clubManager, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$unsubscribeClub$2", m20196f = "ClubManager.kt", m20195l = {60, 61}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$f */
    /* loaded from: classes2.dex */
    public static final class C7369f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19568x;

        /* renamed from: z */
        final /* synthetic */ Club f19570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7369f(Club club, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19570z = club;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7369f(this.f19570z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7369f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19568x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsAgent m18652b = ClubManager.m18652b(ClubManager.this);
                Club club = this.f19570z;
                this.f19568x = 1;
                if (m18652b.m26534J(club, this) == m34636d) {
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
            ClubManager clubManager = ClubManager.this;
            this.f19568x = 2;
            if (ClubManager.m18649e(clubManager, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager$updateClub$2", m20196f = "ClubManager.kt", m20195l = {48}, m20194m = "invokeSuspend")
    /* renamed from: mg.o$g */
    /* loaded from: classes2.dex */
    public static final class C7370g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19571x;

        /* renamed from: z */
        final /* synthetic */ Club f19573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7370g(Club club, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19573z = club;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7370g(this.f19573z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7370g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19571x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsAgent m18652b = ClubManager.m18652b(ClubManager.this);
                Club club = this.f19573z;
                this.f19571x = 1;
                if (m18652b.m26533K(club, this) == m34636d) {
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
    /* compiled from: ClubManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.ClubManager", m20196f = "ClubManager.kt", m20195l = {80, 81, 81}, m20194m = "updateCodesFromClubs")
    /* renamed from: mg.o$h */
    /* loaded from: classes2.dex */
    public static final class C7371h extends AbstractC6757d {

        /* renamed from: w */
        Object f19574w;

        /* renamed from: x */
        /* synthetic */ Object f19575x;

        /* renamed from: z */
        int f19577z;

        C7371h(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19575x = obj;
            this.f19577z |= Integer.MIN_VALUE;
            return ClubManager.m18649e(ClubManager.this, this);
        }
    }

    public ClubManager(ClubsAgent clubsAgent, ClubsCodesAgent clubsCodesAgent, UserProfileAgent userProfileAgent, LoyaltyCardAgent loyaltyCardAgent, FlyersAgent flyersAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, BannersAgent bannersAgent) {
        Intrinsics.isThisObjectNull(clubsAgent, "clubsAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(flyersAgent, "flyersAgent");
        Intrinsics.isThisObjectNull(searchCatalogResponsesAgent, "searchCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(recommendationsCatalogResponsesAgent, "recommendationsCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(bannersAgent, "bannersAgent");
        this.f19547a = clubsAgent;
        this.f19548b = clubsCodesAgent;
        this.f19549c = userProfileAgent;
        this.f19550d = loyaltyCardAgent;
        this.f19551e = flyersAgent;
        this.f19552f = searchCatalogResponsesAgent;
        this.f19553g = recommendationsCatalogResponsesAgent;
        this.f19554h = bannersAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m18653a(ClubManager clubManager, InterfaceC1886d interfaceC1886d) {
        return clubManager.m18648f(interfaceC1886d);
    }

    /* renamed from: b */
    public static final /* synthetic */ ClubsAgent m18652b(ClubManager clubManager) {
        return clubManager.f19547a;
    }

    /* renamed from: c */
    public static final /* synthetic */ ClubsCodesAgent m18651c(ClubManager clubManager) {
        return clubManager.f19548b;
    }

    /* renamed from: d */
    public static final /* synthetic */ UserProfileAgent m18650d(ClubManager clubManager) {
        return clubManager.f19549c;
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m18649e(ClubManager clubManager, InterfaceC1886d interfaceC1886d) {
        return clubManager.m18640n(interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18648f(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.ClubManager.C7364a
            if (r0 == 0) goto L13
            r0 = r5
            mg.o$a r0 = (mg.ClubManager.C7364a) r0
            int r1 = r0.f19558z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19558z = r1
            goto L18
        L13:
            mg.o$a r0 = new mg.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19556x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19558z
            switch(r2) {
                case 0: goto L58;
                case 1: goto L50;
                case 2: goto L48;
                case 3: goto L40;
                case 4: goto L38;
                case 5: goto L30;
                case 6: goto L2b;
                default: goto L23;
            }
        L23:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            p468yc.C13186n.m1453b(r5)
            goto Lb1
        L30:
            java.lang.Object r2 = r0.f19555w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r5)
            goto La2
        L38:
            java.lang.Object r2 = r0.f19555w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r5)
            goto L94
        L40:
            java.lang.Object r2 = r0.f19555w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r5)
            goto L86
        L48:
            java.lang.Object r2 = r0.f19555w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r5)
            goto L78
        L50:
            java.lang.Object r2 = r0.f19555w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r5)
            goto L6a
        L58:
            p468yc.C13186n.m1453b(r5)
            dg.b0 r5 = r4.f19549c
            r0.f19555w = r4
            r2 = 1
            r0.f19558z = r2
            java.lang.Object r5 = r5.m25784x(r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            r2 = r4
        L6a:
            dg.s r5 = r2.f19550d
            r0.f19555w = r2
            r3 = 2
            r0.f19558z = r3
            java.lang.Object r5 = r5.m25786v(r0)
            if (r5 != r1) goto L78
            return r1
        L78:
            dg.b r5 = r2.f19554h
            r0.f19555w = r2
            r3 = 3
            r0.f19558z = r3
            java.lang.Object r5 = r5.m25755a(r0)
            if (r5 != r1) goto L86
            return r1
        L86:
            dg.q r5 = r2.f19551e
            r0.f19555w = r2
            r3 = 4
            r0.f19558z = r3
            java.lang.Object r5 = r5.m25755a(r0)
            if (r5 != r1) goto L94
            return r1
        L94:
            dg.v r5 = r2.f19553g
            r0.f19555w = r2
            r3 = 5
            r0.f19558z = r3
            java.lang.Object r5 = r5.m25755a(r0)
            if (r5 != r1) goto La2
            return r1
        La2:
            dg.x r5 = r2.f19552f
            r2 = 0
            r0.f19555w = r2
            r2 = 6
            r0.f19558z = r2
            java.lang.Object r5 = r5.m25755a(r0)
            if (r5 != r1) goto Lb1
            return r1
        Lb1:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.ClubManager.m18648f(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[LOOP:1: B:33:0x009a->B:35:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[RETURN] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18640n(bd.InterfaceC1886d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof mg.ClubManager.C7371h
            if (r0 == 0) goto L13
            r0 = r9
            mg.o$h r0 = (mg.ClubManager.C7371h) r0
            int r1 = r0.f19577z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19577z = r1
            goto L18
        L13:
            mg.o$h r0 = new mg.o$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19575x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19577z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            p468yc.C13186n.m1453b(r9)
            goto Lba
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f19574w
            dg.h r2 = (p066dg.ClubsCodesAgent) r2
            p468yc.C13186n.m1453b(r9)
            goto L69
        L40:
            java.lang.Object r2 = r0.f19574w
            mg.o r2 = (mg.ClubManager) r2
            p468yc.C13186n.m1453b(r9)
            goto L57
        L48:
            p468yc.C13186n.m1453b(r9)
            r0.f19574w = r8
            r0.f19577z = r5
            java.lang.Object r9 = r8.m18648f(r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            dg.h r9 = r2.f19548b
            dg.f r2 = r2.f19547a
            r0.f19574w = r9
            r0.f19577z = r4
            java.lang.Object r2 = r2.m25742C(r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r7 = r2
            r2 = r9
            r9 = r7
        L69:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()
        L74:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r9.next()
            r6 = r5
            pt.pingodoce.app.data.local.models.clubs.Club r6 = (pt.pingodoce.app.data.local.models.clubs.Club) r6
            boolean r6 = r6.m14640w()
            if (r6 == 0) goto L74
            r4.add(r5)
            goto L74
        L8b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r5 = 10
            int r5 = p489zc.C13777q.m218r(r4, r5)
            r9.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L9a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            pt.pingodoce.app.data.local.models.clubs.Club r5 = (pt.pingodoce.app.data.local.models.clubs.Club) r5
            java.lang.String r5 = r5.m14652e()
            r9.add(r5)
            goto L9a
        Lae:
            r4 = 0
            r0.f19574w = r4
            r0.f19577z = r3
            java.lang.Object r9 = r2.m25783y(r9, r0)
            if (r9 != r1) goto Lba
            return r1
        Lba:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.ClubManager.m18640n(bd.d):java.lang.Object");
    }

    /* renamed from: g */
    public final Object m18647g(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7365b(null), interfaceC1886d);
    }

    /* renamed from: h */
    public final Object m18646h(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7366c(null), interfaceC1886d);
    }

    /* renamed from: i */
    public final InterfaceC6785c m18645i() {
        return this.f19547a.m25740E();
    }

    /* renamed from: j */
    public final List m18644j() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C7367d(null), 1, null);
        return (List) m20162b;
    }

    /* renamed from: k */
    public final Object m18643k(Club club, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7368e(club, null), interfaceC1886d);
    }

    /* renamed from: l */
    public final Object m18642l(Club club, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7369f(club, null), interfaceC1886d);
    }

    /* renamed from: m */
    public final Object m18641m(Club club, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7370g(club, null), interfaceC1886d);
    }
}
