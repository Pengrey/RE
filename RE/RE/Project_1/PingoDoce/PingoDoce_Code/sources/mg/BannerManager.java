package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p066dg.BannersAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import tg.C10618a;

/* renamed from: mg.h */
/* loaded from: classes2.dex */
public final class BannerManager {

    /* renamed from: a */
    private final BannersAgent f19284a;

    /* renamed from: b */
    private final DefaultStoreAgent f19285b;

    /* renamed from: c */
    private final UserProfileAgent f19286c;

    /* renamed from: d */
    private final ClubsCodesAgent f19287d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.BannerManager$dismissBanner$2", m20196f = "BannerManager.kt", m20195l = {44, 47}, m20194m = "invokeSuspend")
    /* renamed from: mg.h$a */
    /* loaded from: classes2.dex */
    public static final class C7282a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19288x;

        /* renamed from: z */
        final /* synthetic */ int f19290z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7282a(int i, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19290z = i;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7282a(this.f19290z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7282a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19288x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DefaultStoreAgent m18798c = BannerManager.m18798c(BannerManager.this);
                boolean m26569R = BannerManager.m18797d(BannerManager.this).m26569R();
                this.f19288x = 1;
                obj = m18798c.m26499I(m26569R, this);
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
            Store store = (Store) obj;
            if (store != null) {
                int m13711f = store.m13711f();
                BannersAgent m18800a = BannerManager.m18800a(BannerManager.this);
                C10618a c10618a = new C10618a(m13711f);
                int i2 = this.f19290z;
                this.f19288x = 2;
                if (m18800a.m26583o(c10618a, i2, this) == m34636d) {
                    return m34636d;
                }
                return C13195u.f34156a;
            }
            throw C7294i0.f19320x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.BannerManager$forceFetchBannersList$2", m20196f = "BannerManager.kt", m20195l = {27, 29}, m20194m = "invokeSuspend")
    /* renamed from: mg.h$b */
    /* loaded from: classes2.dex */
    public static final class C7283b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19291x;

        C7283b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7283b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7283b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19291x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DefaultStoreAgent m18798c = BannerManager.m18798c(BannerManager.this);
                boolean m26569R = BannerManager.m18797d(BannerManager.this).m26569R();
                this.f19291x = 1;
                obj = m18798c.m26499I(m26569R, this);
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
            Store store = (Store) obj;
            if (store != null) {
                int m13711f = store.m13711f();
                BannersAgent m18800a = BannerManager.m18800a(BannerManager.this);
                C10618a c10618a = new C10618a(m13711f);
                this.f19291x = 2;
                if (m18800a.m25753c(c10618a, this) == m34636d) {
                    return m34636d;
                }
                return C13195u.f34156a;
            }
            throw C7294i0.f19320x;
        }
    }

    /* compiled from: Merge.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.BannerManager$getBannersFlow$$inlined$flatMapLatest$1", m20196f = "BannerManager.kt", m20195l = {216, 217, 217}, m20194m = "invokeSuspend")
    /* renamed from: mg.h$c */
    /* loaded from: classes2.dex */
    public static final class C7284c extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ BannerManager f19293A;

        /* renamed from: x */
        int f19294x;

        /* renamed from: y */
        private /* synthetic */ Object f19295y;

        /* renamed from: z */
        /* synthetic */ Object f19296z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7284c(InterfaceC1886d interfaceC1886d, BannerManager bannerManager) {
            super(3, interfaceC1886d);
            this.f19293A = bannerManager;
        }

        /* renamed from: d */
        public final Object mo4533i(InterfaceC6787d interfaceC6787d, Object obj, InterfaceC1886d interfaceC1886d) {
            C7284c c7284c = new C7284c(interfaceC1886d, this.f19293A);
            c7284c.f19295y = interfaceC6787d;
            c7284c.f19296z = obj;
            return c7284c.invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r9.f19294x
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L33
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                p468yc.C13186n.m1453b(r10)
                goto L7e
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.f19295y
                kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.InterfaceC6787d) r1
                p468yc.C13186n.m1453b(r10)
                goto L71
            L26:
                java.lang.Object r1 = r9.f19296z
                pt.pingodoce.app.data.remote.models.response.Store r1 = (pt.pingodoce.app.data.remote.models.response.Store) r1
                java.lang.Object r4 = r9.f19295y
                kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC6787d) r4
                p468yc.C13186n.m1453b(r10)
                r10 = r4
                goto L52
            L33:
                p468yc.C13186n.m1453b(r10)
                java.lang.Object r10 = r9.f19295y
                kotlinx.coroutines.flow.d r10 = (kotlinx.coroutines.flow.InterfaceC6787d) r10
                java.lang.Object r1 = r9.f19296z
                pt.pingodoce.app.data.remote.models.response.Store r1 = (pt.pingodoce.app.data.remote.models.response.Store) r1
                mg.h$d r6 = new mg.h$d
                mg.h r7 = r9.f19293A
                r6.<init>(r5)
                r9.f19295y = r10
                r9.f19296z = r1
                r9.f19294x = r4
                java.lang.Object r4 = p276og.C8079b.m16960b(r6, r9)
                if (r4 != r0) goto L52
                return r0
            L52:
                mg.h r4 = r9.f19293A
                dg.b r4 = mg.BannerManager.m18800a(r4)
                tg.a r6 = new tg.a
                int r1 = r1.m13711f()
                r6.<init>(r1)
                r9.f19295y = r10
                r9.f19296z = r5
                r9.f19294x = r3
                java.lang.Object r1 = r4.m25749g(r6, r9)
                if (r1 != r0) goto L6e
                return r0
            L6e:
                r8 = r1
                r1 = r10
                r10 = r8
            L71:
                kotlinx.coroutines.flow.c r10 = (kotlinx.coroutines.flow.InterfaceC6785c) r10
                r9.f19295y = r5
                r9.f19294x = r2
                java.lang.Object r10 = kotlinx.coroutines.flow.C6788e.m20140h(r1, r10, r9)
                if (r10 != r0) goto L7e
                return r0
            L7e:
                yc.u r10 = p468yc.C13195u.f34156a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.BannerManager.C7284c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.BannerManager$getBannersFlow$1$1", m20196f = "BannerManager.kt", m20195l = {37}, m20194m = "invokeSuspend")
    /* renamed from: mg.h$d */
    /* loaded from: classes2.dex */
    public static final class C7285d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19297x;

        C7285d(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7285d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7285d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19297x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsCodesAgent m18799b = BannerManager.m18799b(BannerManager.this);
                this.f19297x = 1;
                obj = m18799b.m25742C(this);
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

    public BannerManager(BannersAgent bannersAgent, DefaultStoreAgent defaultStoreAgent, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        Intrinsics.isThisObjectNull(bannersAgent, "bannersAgent");
        Intrinsics.isThisObjectNull(defaultStoreAgent, "defaultStoreAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        this.f19284a = bannersAgent;
        this.f19285b = defaultStoreAgent;
        this.f19286c = userProfileAgent;
        this.f19287d = clubsCodesAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ BannersAgent m18800a(BannerManager bannerManager) {
        return bannerManager.f19284a;
    }

    /* renamed from: b */
    public static final /* synthetic */ ClubsCodesAgent m18799b(BannerManager bannerManager) {
        return bannerManager.f19287d;
    }

    /* renamed from: c */
    public static final /* synthetic */ DefaultStoreAgent m18798c(BannerManager bannerManager) {
        return bannerManager.f19285b;
    }

    /* renamed from: d */
    public static final /* synthetic */ UserProfileAgent m18797d(BannerManager bannerManager) {
        return bannerManager.f19286c;
    }

    /* renamed from: e */
    public final Object m18796e(int i, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7282a(i, null), interfaceC1886d);
    }

    /* renamed from: f */
    public final Object m18795f(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7283b(null), interfaceC1886d);
    }

    /* renamed from: g */
    public final InterfaceC6785c m18794g() {
        return C6788e.m20137k(C6788e.m20123y(C6788e.m20137k(this.f19285b.m26498J(this.f19286c.m26569R())), new C7284c(null, this)));
    }
}
