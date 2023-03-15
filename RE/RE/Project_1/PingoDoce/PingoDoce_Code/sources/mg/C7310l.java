package mg;

import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.C6805m;
import kotlinx.coroutines.flow.C6847z;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p066dg.CategoriesAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p070e.C4906j;
import p181jd.Intrinsics;
import p276og.C8079b;
import p378u5.ResourcesProvider;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13190q;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc._Collections;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCategoriesParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchFlyersParameters;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;
import pt.pingodoce.app.data.remote.models.response.CriteriaResponse;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.common.search.models.Brand;
import pt.pingodoce.app.presentation.common.search.models.Criteria;
import vg.CatalogService;

/* compiled from: CatalogManager.kt */
/* renamed from: mg.l */
/* loaded from: classes2.dex */
public final class C7310l {

    /* renamed from: a */
    private final CatalogService f19389a;

    /* renamed from: b */
    private final C7405s1 f19390b;

    /* renamed from: c */
    private final LoyaltyCardAgent f19391c;

    /* renamed from: d */
    private final DefaultStoreAgent f19392d;

    /* renamed from: e */
    private final CategoriesAgent f19393e;

    /* renamed from: f */
    private final SearchCatalogResponsesAgent f19394f;

    /* renamed from: g */
    private final RecommendationsCatalogResponsesAgent f19395g;

    /* renamed from: h */
    private final FlyersAgent f19396h;

    /* renamed from: i */
    private final UserProfileAgent f19397i;

    /* renamed from: j */
    private final ClubsCodesAgent f19398j;

    /* renamed from: k */
    private List f19399k;

    /* renamed from: l */
    private List f19400l;

    /* compiled from: CatalogManager.kt */
    /* renamed from: mg.l$a */
    /* loaded from: classes2.dex */
    public static final class C7311a {
        private C7311a() {
        }

        public /* synthetic */ C7311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager", m20196f = "CatalogManager.kt", m20195l = {78}, m20194m = "criteria")
    /* renamed from: mg.l$b */
    /* loaded from: classes2.dex */
    public static final class C7312b extends AbstractC6757d {

        /* renamed from: w */
        Object f19401w;

        /* renamed from: x */
        /* synthetic */ Object f19402x;

        /* renamed from: z */
        int f19404z;

        C7312b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19402x = obj;
            this.f19404z |= Integer.MIN_VALUE;
            return C7310l.this.m18732k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$fetchRecommendationsProducts$2", m20196f = "CatalogManager.kt", m20195l = {183, 185, 186}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$c */
    /* loaded from: classes2.dex */
    public static final class C7313c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ int f19405A;

        /* renamed from: B */
        final /* synthetic */ int f19406B;

        /* renamed from: x */
        int f19407x;

        /* renamed from: y */
        int f19408y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7313c(int i, int i2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19405A = i;
            this.f19406B = i2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7313c(this.f19405A, this.f19406B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7313c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r9.f19408y
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L25
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                p468yc.C13186n.m1453b(r10)
                goto L86
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                int r1 = r9.f19407x
                p468yc.C13186n.m1453b(r10)
                goto L61
            L25:
                p468yc.C13186n.m1453b(r10)
                goto L49
            L29:
                p468yc.C13186n.m1453b(r10)
                mg.l r10 = mg.C7310l.this
                dg.b0 r10 = mg.C7310l.m18733j(r10)
                boolean r10 = r10.m26572O()
                if (r10 == 0) goto L3a
                r1 = r2
                goto L50
            L3a:
                mg.l r10 = mg.C7310l.this
                dg.s r10 = mg.C7310l.m18738e(r10)
                r9.f19408y = r5
                java.lang.Object r10 = r10.m26484C(r9)
                if (r10 != r0) goto L49
                return r0
            L49:
                pt.pingodoce.app.data.remote.models.response.LoyaltyCard r10 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r10
                boolean r10 = r10.m13814P()
                r1 = r10
            L50:
                mg.l r10 = mg.C7310l.this
                dg.b0 r10 = mg.C7310l.m18733j(r10)
                r9.f19407x = r1
                r9.f19408y = r4
                java.lang.Object r10 = r10.m25771D(r9)
                if (r10 != r0) goto L61
                return r0
            L61:
                module.network.data.remote.models.user.User r10 = (module.network.data.remote.models.user.User) r10
                if (r10 == 0) goto L6a
                java.lang.String r10 = r10.m18178s()
                goto L6b
            L6a:
                r10 = 0
            L6b:
                mg.l r4 = mg.C7310l.this
                dg.v r4 = mg.C7310l.m18737f(r4)
                pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters r6 = new pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters
                int r7 = r9.f19405A
                int r8 = r9.f19406B
                if (r1 == 0) goto L7a
                r2 = r5
            L7a:
                r6.<init>(r7, r8, r2, r10)
                r9.f19408y = r3
                java.lang.Object r10 = r4.m25753c(r6, r9)
                if (r10 != r0) goto L86
                return r0
            L86:
                yc.u r10 = p468yc.C13195u.f34156a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7313c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager", m20196f = "CatalogManager.kt", m20195l = {133, 138}, m20194m = "forceFetchFlyers")
    /* renamed from: mg.l$d */
    /* loaded from: classes2.dex */
    public static final class C7314d extends AbstractC6757d {

        /* renamed from: A */
        int f19410A;

        /* renamed from: w */
        Object f19411w;

        /* renamed from: x */
        Object f19412x;

        /* renamed from: y */
        /* synthetic */ Object f19413y;

        C7314d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19413y = obj;
            this.f19410A |= Integer.MIN_VALUE;
            return C7310l.this.m18729n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$forceFetchFlyers$2", m20196f = "CatalogManager.kt", m20195l = {139}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$e */
    /* loaded from: classes2.dex */
    public static final class C7315e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ Integer f19415A;

        /* renamed from: x */
        int f19416x;

        /* renamed from: z */
        final /* synthetic */ int f19418z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7315e(int i, Integer num, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19418z = i;
            this.f19415A = num;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7315e(this.f19418z, this.f19415A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7315e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19416x;
            if (i == 0) {
                C13186n.m1453b(obj);
                FlyersAgent m18739d = C7310l.m18739d(C7310l.this);
                SearchFlyersParameters searchFlyersParameters = new SearchFlyersParameters(this.f19418z, this.f19415A);
                this.f19416x = 1;
                if (m18739d.m25753c(searchFlyersParameters, this) == m34636d) {
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

    /* compiled from: Merge.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getCategoriesFlow$$inlined$flatMapLatest$1", m20196f = "CatalogManager.kt", m20195l = {216, 216}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$f */
    /* loaded from: classes2.dex */
    public static final class C7316f extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ C7310l f19419A;

        /* renamed from: B */
        final /* synthetic */ boolean f19420B;

        /* renamed from: x */
        int f19421x;

        /* renamed from: y */
        private /* synthetic */ Object f19422y;

        /* renamed from: z */
        /* synthetic */ Object f19423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7316f(InterfaceC1886d interfaceC1886d, C7310l c7310l, boolean z) {
            super(3, interfaceC1886d);
            this.f19419A = c7310l;
            this.f19420B = z;
        }

        /* renamed from: d */
        public final Object mo4533i(InterfaceC6787d interfaceC6787d, Object obj, InterfaceC1886d interfaceC1886d) {
            C7316f c7316f = new C7316f(interfaceC1886d, this.f19419A, this.f19420B);
            c7316f.f19422y = interfaceC6787d;
            c7316f.f19423z = obj;
            return c7316f.invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6787d interfaceC6787d;
            m34636d = C2116d.m34636d();
            int i = this.f19421x;
            if (i == 0) {
                C13186n.m1453b(obj);
                interfaceC6787d = (InterfaceC6787d) this.f19422y;
                CategoriesAgent m18742a = C7310l.m18742a(this.f19419A);
                SearchCategoriesParameters searchCategoriesParameters = new SearchCategoriesParameters(((Store) this.f19423z).m13711f(), this.f19420B);
                this.f19422y = interfaceC6787d;
                this.f19421x = 1;
                obj = m18742a.m25749g(searchCategoriesParameters, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                interfaceC6787d = (InterfaceC6787d) this.f19422y;
                C13186n.m1453b(obj);
            }
            this.f19422y = null;
            this.f19421x = 2;
            if (C6788e.m20140h(interfaceC6787d, (InterfaceC6785c) obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getFlyersFlow$1", m20196f = "CatalogManager.kt", m20195l = {160, 161}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$g */
    /* loaded from: classes2.dex */
    public static final class C7317g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ Integer f19424A;

        /* renamed from: x */
        int f19425x;

        /* renamed from: y */
        /* synthetic */ Object f19426y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CatalogManager.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getFlyersFlow$1$1", m20196f = "CatalogManager.kt", m20195l = {160}, m20194m = "invokeSuspend")
        /* renamed from: mg.l$g$a */
        /* loaded from: classes2.dex */
        public static final class C7318a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19428x;

            /* renamed from: y */
            final /* synthetic */ C7310l f19429y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7318a(C7310l c7310l, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19429y = c7310l;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7318a(this.f19429y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7318a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19428x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubsCodesAgent m18741b = C7310l.m18741b(this.f19429y);
                    this.f19428x = 1;
                    obj = m18741b.m25742C(this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7317g(Integer num, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f19424A = num;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C7317g c7317g = new C7317g(this.f19424A, interfaceC1886d);
            c7317g.f19426y = obj;
            return c7317g;
        }

        /* renamed from: d */
        public final Object mo39856d(Store store, InterfaceC1886d interfaceC1886d) {
            return ((C7317g) create(store, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Store store;
            m34636d = C2116d.m34636d();
            int i = this.f19425x;
            if (i == 0) {
                C13186n.m1453b(obj);
                store = (Store) this.f19426y;
                C7318a c7318a = new C7318a(C7310l.this, null);
                this.f19426y = store;
                this.f19425x = 1;
                if (C8079b.m16960b(c7318a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
            } else {
                store = (Store) this.f19426y;
                C13186n.m1453b(obj);
            }
            FlyersAgent m18739d = C7310l.m18739d(C7310l.this);
            SearchFlyersParameters searchFlyersParameters = new SearchFlyersParameters(store.m13711f(), this.f19424A);
            this.f19426y = null;
            this.f19425x = 2;
            obj = m18739d.m25749g(searchFlyersParameters, this);
            return obj == m34636d ? m34636d : obj;
        }
    }

    /* compiled from: Merge.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$$inlined$flatMapLatest$1", m20196f = "CatalogManager.kt", m20195l = {216, 217, 217}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$h */
    /* loaded from: classes2.dex */
    public static final class C7319h extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ C7310l f19430A;

        /* renamed from: B */
        final /* synthetic */ int f19431B;

        /* renamed from: C */
        final /* synthetic */ int f19432C;

        /* renamed from: x */
        int f19433x;

        /* renamed from: y */
        private /* synthetic */ Object f19434y;

        /* renamed from: z */
        /* synthetic */ Object f19435z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7319h(InterfaceC1886d interfaceC1886d, C7310l c7310l, int i, int i2) {
            super(3, interfaceC1886d);
            this.f19430A = c7310l;
            this.f19431B = i;
            this.f19432C = i2;
        }

        /* renamed from: d */
        public final Object mo4533i(InterfaceC6787d interfaceC6787d, Object obj, InterfaceC1886d interfaceC1886d) {
            C7319h c7319h = new C7319h(interfaceC1886d, this.f19430A, this.f19431B, this.f19432C);
            c7319h.f19434y = interfaceC6787d;
            c7319h.f19435z = obj;
            return c7319h.invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r11.f19433x
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                p468yc.C13186n.m1453b(r12)
                goto L8f
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f19434y
                kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.InterfaceC6787d) r1
                p468yc.C13186n.m1453b(r12)
                goto L82
            L27:
                java.lang.Object r1 = r11.f19435z
                yc.l r1 = (p468yc.C13182l) r1
                java.lang.Object r4 = r11.f19434y
                kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC6787d) r4
                p468yc.C13186n.m1453b(r12)
                r12 = r4
                goto L53
            L34:
                p468yc.C13186n.m1453b(r12)
                java.lang.Object r12 = r11.f19434y
                kotlinx.coroutines.flow.d r12 = (kotlinx.coroutines.flow.InterfaceC6787d) r12
                java.lang.Object r1 = r11.f19435z
                yc.l r1 = (p468yc.C13182l) r1
                mg.l$m r6 = new mg.l$m
                mg.l r7 = r11.f19430A
                r6.<init>(r5)
                r11.f19434y = r12
                r11.f19435z = r1
                r11.f19433x = r4
                java.lang.Object r4 = p276og.C8079b.m16960b(r6, r11)
                if (r4 != r0) goto L53
                return r0
            L53:
                mg.l r4 = r11.f19430A
                dg.v r4 = mg.C7310l.m18737f(r4)
                pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters r6 = new pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters
                int r7 = r11.f19431B
                int r8 = r11.f19432C
                java.lang.Object r9 = r1.m1459d()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.Object r1 = r1.m1460c()
                java.lang.String r1 = (java.lang.String) r1
                r6.<init>(r7, r8, r9, r1)
                r11.f19434y = r12
                r11.f19435z = r5
                r11.f19433x = r3
                java.lang.Object r1 = r4.m25749g(r6, r11)
                if (r1 != r0) goto L7f
                return r0
            L7f:
                r10 = r1
                r1 = r12
                r12 = r10
            L82:
                kotlinx.coroutines.flow.c r12 = (kotlinx.coroutines.flow.InterfaceC6785c) r12
                r11.f19434y = r5
                r11.f19433x = r2
                java.lang.Object r12 = kotlinx.coroutines.flow.C6788e.m20140h(r1, r12, r11)
                if (r12 != r0) goto L8f
                return r0
            L8f:
                yc.u r12 = p468yc.C13195u.f34156a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7319h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.l$i */
    /* loaded from: classes2.dex */
    public static final class C7320i implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19436w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.l$i$a */
        /* loaded from: classes2.dex */
        public static final class C7321a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19437w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$$inlined$map$1$2", m20196f = "CatalogManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.l$i$a$a */
            /* loaded from: classes2.dex */
            public static final class C7322a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19438w;

                /* renamed from: x */
                int f19439x;

                public C7322a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19438w = obj;
                    this.f19439x |= Integer.MIN_VALUE;
                    return C7321a.this.mo4529a(null, this);
                }
            }

            public C7321a(InterfaceC6787d interfaceC6787d) {
                this.f19437w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.C7310l.C7320i.C7321a.C7322a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.l$i$a$a r0 = (mg.C7310l.C7320i.C7321a.C7322a) r0
                    int r1 = r0.f19439x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19439x = r1
                    goto L18
                L13:
                    mg.l$i$a$a r0 = new mg.l$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19438w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19439x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f19437w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    boolean r5 = r5.m13814P()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
                    r0.f19439x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7320i.C7321a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7320i(InterfaceC6785c interfaceC6785c) {
            this.f19436w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19436w.mo20086d(new C7321a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.l$j */
    /* loaded from: classes2.dex */
    public static final class C7323j implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19441w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.l$j$a */
        /* loaded from: classes2.dex */
        public static final class C7324a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19442w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$$inlined$map$2$2", m20196f = "CatalogManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.l$j$a$a */
            /* loaded from: classes2.dex */
            public static final class C7325a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19443w;

                /* renamed from: x */
                int f19444x;

                public C7325a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19443w = obj;
                    this.f19444x |= Integer.MIN_VALUE;
                    return C7324a.this.mo4529a(null, this);
                }
            }

            public C7324a(InterfaceC6787d interfaceC6787d) {
                this.f19442w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.C7310l.C7323j.C7324a.C7325a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.l$j$a$a r0 = (mg.C7310l.C7323j.C7324a.C7325a) r0
                    int r1 = r0.f19444x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19444x = r1
                    goto L18
                L13:
                    mg.l$j$a$a r0 = new mg.l$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19443w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19444x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f19442w
                    module.network.data.remote.models.user.User r5 = (module.network.data.remote.models.user.User) r5
                    if (r5 == 0) goto L3f
                    java.lang.String r5 = r5.m18178s()
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    r0.f19444x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7323j.C7324a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7323j(InterfaceC6785c interfaceC6785c) {
            this.f19441w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19441w.mo20086d(new C7324a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: mg.l$k */
    /* loaded from: classes2.dex */
    public static final class C7326k implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f19446w;

        /* compiled from: Emitters.kt */
        /* renamed from: mg.l$k$a */
        /* loaded from: classes2.dex */
        public static final class C7327a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f19447w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$$inlined$map$3$2", m20196f = "CatalogManager.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: mg.l$k$a$a */
            /* loaded from: classes2.dex */
            public static final class C7328a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f19448w;

                /* renamed from: x */
                int f19449x;

                public C7328a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19448w = obj;
                    this.f19449x |= Integer.MIN_VALUE;
                    return C7327a.this.mo4529a(null, this);
                }
            }

            public C7327a(InterfaceC6787d interfaceC6787d) {
                this.f19447w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof mg.C7310l.C7326k.C7327a.C7328a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mg.l$k$a$a r0 = (mg.C7310l.C7326k.C7327a.C7328a) r0
                    int r1 = r0.f19449x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19449x = r1
                    goto L18
                L13:
                    mg.l$k$a$a r0 = new mg.l$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19448w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f19449x
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
                    kotlinx.coroutines.flow.d r6 = r4.f19447w
                    pt.pingodoce.app.data.remote.models.response.CatalogResponse r5 = (pt.pingodoce.app.data.remote.models.response.CatalogResponse) r5
                    java.util.List r5 = r5.m13884b()
                    r0.f19449x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7326k.C7327a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C7326k(InterfaceC6785c interfaceC6785c) {
            this.f19446w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f19446w.mo20086d(new C7327a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$1", m20196f = "CatalogManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$l */
    /* loaded from: classes2.dex */
    public static final class C7329l extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: x */
        int f19451x;

        /* renamed from: y */
        /* synthetic */ Object f19452y;

        /* renamed from: z */
        /* synthetic */ boolean f19453z;

        C7329l(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m18707d((String) obj, ((Boolean) obj2).booleanValue(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m18707d(String str, boolean z, InterfaceC1886d interfaceC1886d) {
            C7329l c7329l = new C7329l(interfaceC1886d);
            c7329l.f19452y = str;
            c7329l.f19453z = z;
            return c7329l.invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f19451x == 0) {
                C13186n.m1453b(obj);
                return new C13182l((String) this.f19452y, C6755b.m20201a(this.f19453z));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$getRecommendationProductsFlow$2$1", m20196f = "CatalogManager.kt", m20195l = {208}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$m */
    /* loaded from: classes2.dex */
    public static final class C7330m extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19454x;

        C7330m(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7330m(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7330m) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19454x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsCodesAgent m18741b = C7310l.m18741b(C7310l.this);
                this.f19454x = 1;
                obj = m18741b.m25742C(this);
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
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$searchCatalog$2", m20196f = "CatalogManager.kt", m20195l = {225, 230, 233, 242, 250}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$n */
    /* loaded from: classes2.dex */
    public static final class C7331n extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f19456A;

        /* renamed from: B */
        final /* synthetic */ SearchCatalogParameters f19457B;

        /* renamed from: x */
        int f19458x;

        /* renamed from: y */
        int f19459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7331n(boolean z, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19456A = z;
            this.f19457B = searchCatalogParameters;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7331n(this.f19456A, this.f19457B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7331n) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 351
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.C7331n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager", m20196f = "CatalogManager.kt", m20195l = {149, 153}, m20194m = "searchFlyers")
    /* renamed from: mg.l$o */
    /* loaded from: classes2.dex */
    public static final class C7332o extends AbstractC6757d {

        /* renamed from: A */
        int f19461A;

        /* renamed from: w */
        Object f19462w;

        /* renamed from: x */
        Object f19463x;

        /* renamed from: y */
        /* synthetic */ Object f19464y;

        C7332o(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19464y = obj;
            this.f19461A |= Integer.MIN_VALUE;
            return C7310l.this.m18718y(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager$searchFlyers$2", m20196f = "CatalogManager.kt", m20195l = {153}, m20194m = "invokeSuspend")
    /* renamed from: mg.l$p */
    /* loaded from: classes2.dex */
    public static final class C7333p extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ Integer f19466A;

        /* renamed from: x */
        int f19467x;

        /* renamed from: z */
        final /* synthetic */ int f19469z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7333p(int i, Integer num, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19469z = i;
            this.f19466A = num;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7333p(this.f19469z, this.f19466A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7333p) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19467x;
            if (i == 0) {
                C13186n.m1453b(obj);
                FlyersAgent m18739d = C7310l.m18739d(C7310l.this);
                SearchFlyersParameters searchFlyersParameters = new SearchFlyersParameters(this.f19469z, this.f19466A);
                this.f19467x = 1;
                obj = m18739d.m25752d(searchFlyersParameters, this);
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
    /* compiled from: CatalogManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.CatalogManager", m20196f = "CatalogManager.kt", m20195l = {C4906j.f13405F0}, m20194m = "searchTags")
    /* renamed from: mg.l$q */
    /* loaded from: classes2.dex */
    public static final class C7334q extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19470w;

        /* renamed from: y */
        int f19472y;

        C7334q(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19470w = obj;
            this.f19472y |= Integer.MIN_VALUE;
            return C7310l.this.m18717z(null, this);
        }
    }

    static {
        new C7311a(null);
    }

    public C7310l(ResourcesProvider resourcesProvider, CatalogService catalogService, C7405s1 c7405s1, LoyaltyCardAgent loyaltyCardAgent, DefaultStoreAgent defaultStoreAgent, CategoriesAgent categoriesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, FlyersAgent flyersAgent, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        List m191m;
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(catalogService, "service");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(defaultStoreAgent, "defaultStoreAgent");
        Intrinsics.isThisObjectNull(categoriesAgent, "categoriesAgent");
        Intrinsics.isThisObjectNull(searchCatalogResponsesAgent, "searchCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(recommendationsCatalogResponsesAgent, "recommendationsCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(flyersAgent, "flyersAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        this.f19389a = catalogService;
        this.f19390b = c7405s1;
        this.f19391c = loyaltyCardAgent;
        this.f19392d = defaultStoreAgent;
        this.f19393e = categoriesAgent;
        this.f19394f = searchCatalogResponsesAgent;
        this.f19395g = recommendationsCatalogResponsesAgent;
        this.f19396h = flyersAgent;
        this.f19397i = userProfileAgent;
        this.f19398j = clubsCodesAgent;
        this.f19399k = new ArrayList();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_filters_all_brands);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m191m = C13780s.m191m(new Brand(0, new BrandResponse(null, false, string, null, 11, null), false, 4, null));
        this.f19400l = m191m;
    }

    /* renamed from: a */
    public static final /* synthetic */ CategoriesAgent m18742a(C7310l c7310l) {
        return c7310l.f19393e;
    }

    /* renamed from: b */
    public static final /* synthetic */ ClubsCodesAgent m18741b(C7310l c7310l) {
        return c7310l.f19398j;
    }

    /* renamed from: c */
    public static final /* synthetic */ DefaultStoreAgent m18740c(C7310l c7310l) {
        return c7310l.f19392d;
    }

    /* renamed from: d */
    public static final /* synthetic */ FlyersAgent m18739d(C7310l c7310l) {
        return c7310l.f19396h;
    }

    /* renamed from: e */
    public static final /* synthetic */ LoyaltyCardAgent m18738e(C7310l c7310l) {
        return c7310l.f19391c;
    }

    /* renamed from: f */
    public static final /* synthetic */ RecommendationsCatalogResponsesAgent m18737f(C7310l c7310l) {
        return c7310l.f19395g;
    }

    /* renamed from: g */
    public static final /* synthetic */ SearchCatalogResponsesAgent m18736g(C7310l c7310l) {
        return c7310l.f19394f;
    }

    /* renamed from: h */
    public static final /* synthetic */ CatalogService m18735h(C7310l c7310l) {
        return c7310l.f19389a;
    }

    /* renamed from: i */
    public static final /* synthetic */ C7405s1 m18734i(C7310l c7310l) {
        return c7310l.f19390b;
    }

    /* renamed from: j */
    public static final /* synthetic */ UserProfileAgent m18733j(C7310l c7310l) {
        return c7310l.f19397i;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m18728o(C7310l c7310l, Integer num, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return c7310l.m18729n(num, interfaceC1886d);
    }

    /* renamed from: q */
    public static /* synthetic */ InterfaceC6785c m18726q(C7310l c7310l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c7310l.m18727p(z);
    }

    /* renamed from: s */
    public static /* synthetic */ InterfaceC6785c m18724s(C7310l c7310l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return c7310l.m18725r(num);
    }

    /* renamed from: u */
    private final List m18722u(List list) {
        int m186r;
        int m186r2;
        int m186r3;
        int m186r4;
        Set m450s0;
        List m453p0;
        if (this.f19400l.size() == 1) {
            List list2 = this.f19400l;
            m186r4 = Iterables.m186r(list, 10);
            ArrayList arrayList = new ArrayList(m186r4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Brand(0, (BrandResponse) it.next(), false, 5, null));
            }
            m450s0 = _Collections.m450s0(list2, arrayList);
            m453p0 = _Collections.m453p0(m450s0);
            this.f19400l = m453p0;
        } else {
            m186r = Iterables.m186r(list, 10);
            ArrayList arrayList2 = new ArrayList(m186r);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Brand(0, (BrandResponse) it2.next(), false, 5, null));
            }
            m186r2 = Iterables.m186r(list, 10);
            ArrayList arrayList3 = new ArrayList(m186r2);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C13780s.m187q();
                }
                BrandResponse brandResponse = (BrandResponse) obj;
                List<Brand> list3 = this.f19400l;
                m186r3 = Iterables.m186r(list3, 10);
                ArrayList arrayList4 = new ArrayList(m186r3);
                for (Brand brand : list3) {
                    arrayList4.add(brand.m12341c());
                }
                if (!arrayList4.contains(((Brand) arrayList2.get(i)).m12341c())) {
                    this.f19400l.add(new Brand(0, brandResponse, false, 5, null));
                }
                arrayList3.add(C13195u.f34156a);
                i = i2;
            }
        }
        return this.f19400l;
    }

    /* renamed from: v */
    private final List m18721v(List list) {
        int m186r;
        List m453p0;
        int m186r2;
        int m186r3;
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Criteria((CriteriaResponse) it.next(), false, 2, null));
        }
        m453p0 = _Collections.m453p0(arrayList);
        if (this.f19399k.isEmpty()) {
            this.f19399k.addAll(m453p0);
        } else {
            m186r2 = Iterables.m186r(list, 10);
            ArrayList arrayList2 = new ArrayList(m186r2);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C13780s.m187q();
                }
                CriteriaResponse criteriaResponse = (CriteriaResponse) obj;
                List<Criteria> list2 = this.f19399k;
                m186r3 = Iterables.m186r(list2, 10);
                ArrayList arrayList3 = new ArrayList(m186r3);
                for (Criteria criteria : list2) {
                    arrayList3.add(criteria.m12334c());
                }
                if (!arrayList3.contains(((Criteria) m453p0.get(i)).m12334c())) {
                    this.f19399k.add(new Criteria(criteriaResponse, false, 2, null));
                }
                arrayList2.add(C13195u.f34156a);
                i = i2;
            }
        }
        return this.f19399k;
    }

    /* renamed from: x */
    public static /* synthetic */ Object m18719x(C7310l c7310l, SearchCatalogParameters searchCatalogParameters, boolean z, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c7310l.m18720w(searchCatalogParameters, z, interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18732k(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7310l.C7312b
            if (r0 == 0) goto L13
            r0 = r5
            mg.l$b r0 = (mg.C7310l.C7312b) r0
            int r1 = r0.f19404z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19404z = r1
            goto L18
        L13:
            mg.l$b r0 = new mg.l$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19402x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19404z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f19401w
            mg.l r0 = (mg.C7310l) r0
            p468yc.C13186n.m1453b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            vg.g r5 = r4.f19389a
            r0.f19401w = r4
            r0.f19404z = r3
            java.lang.Object r5 = r5.m5541m(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r1 = r5 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L75
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r1 = r5.m26590a()
            pt.pingodoce.app.data.local.models.products.FilterCriteria r1 = (pt.pingodoce.app.data.local.models.products.FilterCriteria) r1
            java.util.List r1 = r1.m14480b()
            java.util.List r1 = r0.m18721v(r1)
            java.lang.Object r5 = r5.m26590a()
            pt.pingodoce.app.data.local.models.products.FilterCriteria r5 = (pt.pingodoce.app.data.local.models.products.FilterCriteria) r5
            java.util.List r5 = r5.m14481a()
            java.util.List r5 = r0.m18722u(r5)
            pt.pingodoce.app.presentation.common.search.models.FilterData r0 = new pt.pingodoce.app.presentation.common.search.models.FilterData
            r0.<init>(r1, r5)
            mg.a0$b r5 = new mg.a0$b
            r5.<init>(r0)
            goto L8d
        L75:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L93
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r0 = r5.m26591a()
            boolean r0 = r0 instanceof p447xe.NoConnectionException
            if (r0 == 0) goto L8e
            mg.a0$a$a r0 = new mg.a0$a$a
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
            r5 = r0
        L8d:
            return r5
        L8e:
            we.b r5 = r5.m26591a()
            throw r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.m18732k(bd.d):java.lang.Object");
    }

    /* renamed from: l */
    public final Object m18731l(int i, int i2, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7313c(i, i2, null), interfaceC1886d);
    }

    /* renamed from: m */
    public final C13190q m18730m() {
        int m186r;
        List m453p0;
        List list = this.f19399k;
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            arrayList.add(Criteria.m12335b((Criteria) obj, null, i == 0, 1, null));
            i = i2;
        }
        m453p0 = _Collections.m453p0(arrayList);
        return new C13190q(m453p0, this.f19400l, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18729n(java.lang.Integer r7, bd.InterfaceC1886d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mg.C7310l.C7314d
            if (r0 == 0) goto L13
            r0 = r8
            mg.l$d r0 = (mg.C7310l.C7314d) r0
            int r1 = r0.f19410A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19410A = r1
            goto L18
        L13:
            mg.l$d r0 = new mg.l$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19413y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19410A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f19412x
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r2 = r0.f19411w
            mg.l r2 = (mg.C7310l) r2
            p468yc.C13186n.m1453b(r8)
            goto L59
        L40:
            p468yc.C13186n.m1453b(r8)
            dg.o r8 = r6.f19392d
            dg.b0 r2 = r6.f19397i
            boolean r2 = r2.m26569R()
            r0.f19411w = r6
            r0.f19412x = r7
            r0.f19410A = r4
            java.lang.Object r8 = r8.m26499I(r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            pt.pingodoce.app.data.remote.models.response.Store r8 = (pt.pingodoce.app.data.remote.models.response.Store) r8
            if (r8 == 0) goto L75
            int r8 = r8.m13711f()
            mg.l$e r4 = new mg.l$e
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f19411w = r5
            r0.f19412x = r5
            r0.f19410A = r3
            java.lang.Object r8 = p276og.C8079b.m16960b(r4, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            return r8
        L75:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "Can't have a null default store here"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.m18729n(java.lang.Integer, bd.d):java.lang.Object");
    }

    /* renamed from: p */
    public final InterfaceC6785c m18727p(boolean z) {
        return C6788e.m20123y(C6788e.m20137k(this.f19392d.m26498J(this.f19397i.m26569R())), new C7316f(null, this, z));
    }

    /* renamed from: r */
    public final InterfaceC6785c m18725r(Integer num) {
        InterfaceC6785c m20103c;
        m20103c = C6805m.m20103c(C6788e.m20137k(this.f19392d.m26498J(this.f19397i.m26569R())), 0, new C7317g(num, null), 1, null);
        return C6788e.m20137k(m20103c);
    }

    /* renamed from: t */
    public final InterfaceC6785c m18723t(int i, int i2) {
        InterfaceC6785c c7320i;
        if (this.f19397i.m26572O()) {
            c7320i = C6847z.m20023a(Boolean.FALSE);
        } else {
            c7320i = new C7320i(this.f19391c.m25740E());
        }
        return new C7326k(C6788e.m20123y(C6788e.m20141g(C6788e.m20143e(new C7323j(this.f19397i.m25769F()), c7320i, new C7329l(null))), new C7319h(null, this, i, i2)));
    }

    /* renamed from: w */
    public final Object m18720w(SearchCatalogParameters searchCatalogParameters, boolean z, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7331n(z, searchCatalogParameters, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18718y(java.lang.Integer r7, bd.InterfaceC1886d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof mg.C7310l.C7332o
            if (r0 == 0) goto L13
            r0 = r8
            mg.l$o r0 = (mg.C7310l.C7332o) r0
            int r1 = r0.f19461A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19461A = r1
            goto L18
        L13:
            mg.l$o r0 = new mg.l$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19464y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19461A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r8)
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f19463x
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r2 = r0.f19462w
            mg.l r2 = (mg.C7310l) r2
            p468yc.C13186n.m1453b(r8)
            goto L59
        L40:
            p468yc.C13186n.m1453b(r8)
            dg.o r8 = r6.f19392d
            dg.b0 r2 = r6.f19397i
            boolean r2 = r2.m26569R()
            r0.f19462w = r6
            r0.f19463x = r7
            r0.f19461A = r4
            java.lang.Object r8 = r8.m26499I(r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            pt.pingodoce.app.data.remote.models.response.Store r8 = (pt.pingodoce.app.data.remote.models.response.Store) r8
            if (r8 == 0) goto L75
            int r8 = r8.m13711f()
            mg.l$p r4 = new mg.l$p
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f19462w = r5
            r0.f19463x = r5
            r0.f19461A = r3
            java.lang.Object r8 = p276og.C8079b.m16960b(r4, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            return r8
        L75:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "Can't have a null default store here"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.m18718y(java.lang.Integer, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18717z(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7310l.C7334q
            if (r0 == 0) goto L13
            r0 = r6
            mg.l$q r0 = (mg.C7310l.C7334q) r0
            int r1 = r0.f19472y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19472y = r1
            goto L18
        L13:
            mg.l$q r0 = new mg.l$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19470w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19472y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.g r6 = r4.f19389a
            r0.f19472y = r3
            java.lang.Object r6 = r6.m5536r(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L53
            mg.d1$b r5 = new mg.d1$b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            java.util.List r6 = (java.util.List) r6
            r5.<init>(r6)
            goto L6a
        L53:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L70
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r5 = r5 instanceof p447xe.NoConnectionException
            if (r5 == 0) goto L6b
            mg.d1$a$a r5 = new mg.d1$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L6a:
            return r5
        L6b:
            we.b r5 = r6.m26591a()
            throw r5
        L70:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7310l.m18717z(java.lang.String, bd.d):java.lang.Object");
    }
}
