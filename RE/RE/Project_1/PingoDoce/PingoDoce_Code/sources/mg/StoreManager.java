package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p066dg.BannersAgent;
import p066dg.CategoriesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.StoresAgent;
import p066dg.UserProfileAgent;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import vg.StoreService;

/* renamed from: mg.j1 */
/* loaded from: classes2.dex */
public final class StoreManager {

    /* renamed from: a */
    private final StoreService f19343a;

    /* renamed from: b */
    private final DefaultStoreAgent f19344b;

    /* renamed from: c */
    private final UserProfileAgent f19345c;

    /* renamed from: d */
    private final StoresAgent f19346d;

    /* renamed from: e */
    private final AuthManager f19347e;

    /* renamed from: f */
    private final FlyersAgent f19348f;

    /* renamed from: g */
    private final CategoriesAgent f19349g;

    /* renamed from: h */
    private final BannersAgent f19350h;

    /* renamed from: i */
    private final RecommendationsCatalogResponsesAgent f19351i;

    /* renamed from: j */
    private final SearchCatalogResponsesAgent f19352j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager", m20196f = "StoreManager.kt", m20195l = {76, 77, 78, 79, 80}, m20194m = "clearDefaultStoreDependentCaches")
    /* renamed from: mg.j1$a */
    /* loaded from: classes2.dex */
    public static final class C7300a extends AbstractC6757d {

        /* renamed from: w */
        Object f19353w;

        /* renamed from: x */
        /* synthetic */ Object f19354x;

        /* renamed from: z */
        int f19356z;

        C7300a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19354x = obj;
            this.f19356z |= Integer.MIN_VALUE;
            return StoreManager.m18766a(StoreManager.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager", m20196f = "StoreManager.kt", m20195l = {36, 41}, m20194m = "getDefaultStore")
    /* renamed from: mg.j1$b */
    /* loaded from: classes2.dex */
    public static final class C7301b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19357w;

        /* renamed from: y */
        int f19359y;

        C7301b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19357w = obj;
            this.f19359y |= Integer.MIN_VALUE;
            return StoreManager.this.m18760g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager$getDefaultStore$2", m20196f = "StoreManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.j1$c */
    /* loaded from: classes2.dex */
    public static final class C7302c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19360x;

        /* renamed from: y */
        final /* synthetic */ Store f19361y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7302c(Store store, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19361y = store;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7302c(this.f19361y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7302c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19360x == 0) {
                C13186n.m1453b(obj);
                return this.f19361y;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager", m20196f = "StoreManager.kt", m20195l = {49, 50, 56}, m20194m = "getStores")
    /* renamed from: mg.j1$d */
    /* loaded from: classes2.dex */
    public static final class C7303d extends AbstractC6757d {

        /* renamed from: w */
        Object f19362w;

        /* renamed from: x */
        /* synthetic */ Object f19363x;

        /* renamed from: z */
        int f19365z;

        C7303d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19363x = obj;
            this.f19365z |= Integer.MIN_VALUE;
            return StoreManager.this.m18758i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    /* renamed from: mg.j1$e */
    /* loaded from: classes2.dex */
    public static final class C7304e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ List f19366w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7304e(List list) {
            super(1);
            this.f19366w = list;
        }

        /* renamed from: a */
        public final void m18754a(Store store) {
            Iterator it = this.f19366w.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (store != null && ((Store) it.next()).m13711f() == store.m13711f()) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                ((Store) this.f19366w.get(i)).m13716A(true);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m18754a((Store) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager$getStores$3", m20196f = "StoreManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.j1$f */
    /* loaded from: classes2.dex */
    public static final class C7305f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19367x;

        /* renamed from: y */
        final /* synthetic */ List f19368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7305f(List list, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19368y = list;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7305f(this.f19368y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7305f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19367x == 0) {
                C13186n.m1453b(obj);
                return this.f19368y;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.StoreManager$setDefaultStore$2", m20196f = "StoreManager.kt", m20195l = {61, 62, 64, 65, 67}, m20194m = "invokeSuspend")
    /* renamed from: mg.j1$g */
    /* loaded from: classes2.dex */
    public static final class C7306g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19369x;

        /* renamed from: z */
        final /* synthetic */ Store f19371z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7306g(Store store, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19371z = store;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7306g(this.f19371z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7306g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r10.f19369x
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L35
                if (r1 == r6) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                p468yc.C13186n.m1453b(r11)
                goto Lc0
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L24:
                p468yc.C13186n.m1453b(r11)
                goto Lac
            L29:
                p468yc.C13186n.m1453b(r11)
                goto L94
            L2d:
                p468yc.C13186n.m1453b(r11)
                goto L5c
            L31:
                p468yc.C13186n.m1453b(r11)
                goto L4d
            L35:
                p468yc.C13186n.m1453b(r11)
                mg.j1 r11 = mg.StoreManager.this
                vg.g0 r11 = mg.StoreManager.m18763d(r11)
                pt.pingodoce.app.data.remote.models.response.Store r1 = r10.f19371z
                int r1 = r1.m13711f()
                r10.f19369x = r6
                java.lang.Object r11 = r11.m5527n(r1, r10)
                if (r11 != r0) goto L4d
                return r0
            L4d:
                mg.j1 r11 = mg.StoreManager.this
                dg.z r11 = mg.StoreManager.m18762e(r11)
                r10.f19369x = r5
                java.lang.Object r11 = r11.m25742C(r10)
                if (r11 != r0) goto L5c
                return r0
            L5c:
                java.util.List r11 = (java.util.List) r11
                java.util.List r11 = p489zc.C13777q.m221p0(r11)
                pt.pingodoce.app.data.remote.models.response.Store r1 = r10.f19371z
                java.util.Iterator r5 = r11.iterator()
            L68:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L85
                java.lang.Object r7 = r5.next()
                pt.pingodoce.app.data.remote.models.response.Store r7 = (pt.pingodoce.app.data.remote.models.response.Store) r7
                int r8 = r7.m13711f()
                int r9 = r1.m13711f()
                if (r8 != r9) goto L80
                r8 = r6
                goto L81
            L80:
                r8 = 0
            L81:
                r7.m13716A(r8)
                goto L68
            L85:
                mg.j1 r1 = mg.StoreManager.this
                dg.z r1 = mg.StoreManager.m18762e(r1)
                r10.f19369x = r4
                java.lang.Object r11 = r1.m25783y(r11, r10)
                if (r11 != r0) goto L94
                return r0
            L94:
                mg.j1 r11 = mg.StoreManager.this
                dg.o r11 = mg.StoreManager.m18764c(r11)
                pt.pingodoce.app.data.remote.models.response.Store r1 = r10.f19371z
                pt.pingodoce.app.data.remote.models.response.Store r1 = r1.m13714c()
                r1.m13716A(r6)
                r10.f19369x = r3
                java.lang.Object r11 = r11.m25783y(r1, r10)
                if (r11 != r0) goto Lac
                return r0
            Lac:
                mg.j1 r11 = mg.StoreManager.this
                mg.e r11 = mg.StoreManager.m18765b(r11)
                r11.m18898B()
                mg.j1 r11 = mg.StoreManager.this
                r10.f19369x = r2
                java.lang.Object r11 = mg.StoreManager.m18766a(r11, r10)
                if (r11 != r0) goto Lc0
                return r0
            Lc0:
                yc.u r11 = p468yc.C13195u.f34156a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.StoreManager.C7306g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public StoreManager(StoreService storeService, DefaultStoreAgent defaultStoreAgent, UserProfileAgent userProfileAgent, StoresAgent storesAgent, AuthManager authManager, FlyersAgent flyersAgent, CategoriesAgent categoriesAgent, BannersAgent bannersAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent) {
        Intrinsics.isThisObjectNull(storeService, "service");
        Intrinsics.isThisObjectNull(defaultStoreAgent, "defaultStoreAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(storesAgent, "storesAgent");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(flyersAgent, "flyersAgent");
        Intrinsics.isThisObjectNull(categoriesAgent, "categoriesAgent");
        Intrinsics.isThisObjectNull(bannersAgent, "bannersAgent");
        Intrinsics.isThisObjectNull(recommendationsCatalogResponsesAgent, "recommendationsCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(searchCatalogResponsesAgent, "searchCatalogResponsesAgent");
        this.f19343a = storeService;
        this.f19344b = defaultStoreAgent;
        this.f19345c = userProfileAgent;
        this.f19346d = storesAgent;
        this.f19347e = authManager;
        this.f19348f = flyersAgent;
        this.f19349g = categoriesAgent;
        this.f19350h = bannersAgent;
        this.f19351i = recommendationsCatalogResponsesAgent;
        this.f19352j = searchCatalogResponsesAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m18766a(StoreManager storeManager, InterfaceC1886d interfaceC1886d) {
        return storeManager.m18761f(interfaceC1886d);
    }

    /* renamed from: b */
    public static final /* synthetic */ AuthManager m18765b(StoreManager storeManager) {
        return storeManager.f19347e;
    }

    /* renamed from: c */
    public static final /* synthetic */ DefaultStoreAgent m18764c(StoreManager storeManager) {
        return storeManager.f19344b;
    }

    /* renamed from: d */
    public static final /* synthetic */ StoreService m18763d(StoreManager storeManager) {
        return storeManager.f19343a;
    }

    /* renamed from: e */
    public static final /* synthetic */ StoresAgent m18762e(StoreManager storeManager) {
        return storeManager.f19346d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18761f(bd.InterfaceC1886d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof mg.StoreManager.C7300a
            if (r0 == 0) goto L13
            r0 = r9
            mg.j1$a r0 = (mg.StoreManager.C7300a) r0
            int r1 = r0.f19356z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19356z = r1
            goto L18
        L13:
            mg.j1$a r0 = new mg.j1$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19354x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19356z
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5e
            if (r2 == r7) goto L56
            if (r2 == r6) goto L4e
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            p468yc.C13186n.m1453b(r9)
            goto La4
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3e:
            java.lang.Object r2 = r0.f19353w
            mg.j1 r2 = (mg.StoreManager) r2
            p468yc.C13186n.m1453b(r9)
            goto L96
        L46:
            java.lang.Object r2 = r0.f19353w
            mg.j1 r2 = (mg.StoreManager) r2
            p468yc.C13186n.m1453b(r9)
            goto L89
        L4e:
            java.lang.Object r2 = r0.f19353w
            mg.j1 r2 = (mg.StoreManager) r2
            p468yc.C13186n.m1453b(r9)
            goto L7c
        L56:
            java.lang.Object r2 = r0.f19353w
            mg.j1 r2 = (mg.StoreManager) r2
            p468yc.C13186n.m1453b(r9)
            goto L6f
        L5e:
            p468yc.C13186n.m1453b(r9)
            dg.d r9 = r8.f19349g
            r0.f19353w = r8
            r0.f19356z = r7
            java.lang.Object r9 = r9.m25755a(r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r2 = r8
        L6f:
            dg.q r9 = r2.f19348f
            r0.f19353w = r2
            r0.f19356z = r6
            java.lang.Object r9 = r9.m25755a(r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            dg.b r9 = r2.f19350h
            r0.f19353w = r2
            r0.f19356z = r5
            java.lang.Object r9 = r9.m25755a(r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            dg.v r9 = r2.f19351i
            r0.f19353w = r2
            r0.f19356z = r4
            java.lang.Object r9 = r9.m25755a(r0)
            if (r9 != r1) goto L96
            return r1
        L96:
            dg.x r9 = r2.f19352j
            r2 = 0
            r0.f19353w = r2
            r0.f19356z = r3
            java.lang.Object r9 = r9.m25755a(r0)
            if (r9 != r1) goto La4
            return r1
        La4:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.StoreManager.m18761f(bd.d):java.lang.Object");
    }

    /* renamed from: h */
    private final Object m18759h(InterfaceC1886d interfaceC1886d) {
        return this.f19344b.m26499I(this.f19345c.m26569R(), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[PHI: r6 
      PHI: (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x0052, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18760g(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.StoreManager.C7301b
            if (r0 == 0) goto L13
            r0 = r6
            mg.j1$b r0 = (mg.StoreManager.C7301b) r0
            int r1 = r0.f19359y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19359y = r1
            goto L18
        L13:
            mg.j1$b r0 = new mg.j1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19357w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19359y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r6)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            p468yc.C13186n.m1453b(r6)
            goto L44
        L38:
            p468yc.C13186n.m1453b(r6)
            r0.f19359y = r4
            java.lang.Object r6 = r5.m18759h(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            pt.pingodoce.app.data.remote.models.response.Store r6 = (pt.pingodoce.app.data.remote.models.response.Store) r6
            mg.j1$c r2 = new mg.j1$c
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19359y = r3
            java.lang.Object r6 = p276og.C8079b.m16961a(r2, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.StoreManager.m18760g(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[PHI: r8 
      PHI: (r8v11 java.lang.Object) = (r8v10 java.lang.Object), (r8v1 java.lang.Object) binds: [B:27:0x0080, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18758i(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mg.StoreManager.C7303d
            if (r0 == 0) goto L13
            r0 = r8
            mg.j1$d r0 = (mg.StoreManager.C7303d) r0
            int r1 = r0.f19365z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19365z = r1
            goto L18
        L13:
            mg.j1$d r0 = new mg.j1$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19363x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19365z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r8)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.f19362w
            java.util.List r2 = (java.util.List) r2
            p468yc.C13186n.m1453b(r8)
            goto L68
        L3f:
            java.lang.Object r2 = r0.f19362w
            mg.j1 r2 = (mg.StoreManager) r2
            p468yc.C13186n.m1453b(r8)
            goto L58
        L47:
            p468yc.C13186n.m1453b(r8)
            dg.z r8 = r7.f19346d
            r0.f19362w = r7
            r0.f19365z = r5
            java.lang.Object r8 = r8.m25742C(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r7
        L58:
            java.util.List r8 = (java.util.List) r8
            r0.f19362w = r8
            r0.f19365z = r4
            java.lang.Object r2 = r2.m18760g(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r8
            r8 = r6
        L68:
            og.a r8 = (p276og.Result) r8
            mg.j1$e r4 = new mg.j1$e
            r4.<init>(r2)
            p276og.C8082c.m16958b(r8, r4)
            mg.j1$f r8 = new mg.j1$f
            r4 = 0
            r8.<init>(r2, r4)
            r0.f19362w = r4
            r0.f19365z = r3
            java.lang.Object r8 = p276og.C8079b.m16960b(r8, r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.StoreManager.m18758i(bd.d):java.lang.Object");
    }

    /* renamed from: j */
    public final InterfaceC6785c m18757j() {
        return this.f19344b.m26498J(this.f19345c.m26569R());
    }

    /* renamed from: k */
    public final Object m18756k(Store store, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7306g(store, null), interfaceC1886d);
    }
}
