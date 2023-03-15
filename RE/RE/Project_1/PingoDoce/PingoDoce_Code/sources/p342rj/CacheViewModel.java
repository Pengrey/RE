package p342rj;

import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import eg.AbstractC5050a;
import eg.AbstractC5067d;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p066dg.BannersAgent;
import p066dg.CategoriesAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.CoachmarksAgent;
import p066dg.ConsentsAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.StoresAgent;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;

/* renamed from: rj.e */
/* loaded from: classes2.dex */
public final class CacheViewModel extends BaseViewModel {

    /* renamed from: A */
    private AbstractC5067d f25919A;

    /* renamed from: B */
    private final List f25920B;

    /* renamed from: C */
    private final C1436e0 f25921C;

    /* renamed from: D */
    private final LiveData f25922D;

    /* renamed from: m */
    private final BannersAgent f25923m;

    /* renamed from: n */
    private final CategoriesAgent f25924n;

    /* renamed from: o */
    private final ClubsAgent f25925o;

    /* renamed from: p */
    private final ClubsCodesAgent f25926p;

    /* renamed from: q */
    private final CoachmarksAgent f25927q;

    /* renamed from: r */
    private final ConsentsAgent f25928r;

    /* renamed from: s */
    private final DefaultStoreAgent f25929s;

    /* renamed from: t */
    private final FlyersAgent f25930t;

    /* renamed from: u */
    private final LoyaltyCardAgent f25931u;

    /* renamed from: v */
    private final RecommendationsCatalogResponsesAgent f25932v;

    /* renamed from: w */
    private final SearchCatalogResponsesAgent f25933w;

    /* renamed from: x */
    private final StoresAgent f25934x;

    /* renamed from: y */
    private final UserProfileAgent f25935y;

    /* renamed from: z */
    private AbstractC5050a f25936z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheViewModel", m20196f = "CacheViewModel.kt", m20195l = {C0868i.f2748C0, C0868i.f2763F0, 106}, m20194m = "clearValues")
    /* renamed from: rj.e$a */
    /* loaded from: classes2.dex */
    public static final class C9915a extends AbstractC6757d {

        /* renamed from: A */
        int f25937A;

        /* renamed from: w */
        Object f25938w;

        /* renamed from: x */
        Object f25939x;

        /* renamed from: y */
        /* synthetic */ Object f25940y;

        C9915a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25940y = obj;
            this.f25937A |= Integer.MIN_VALUE;
            return CacheViewModel.this.m9712M(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheViewModel", m20196f = "CacheViewModel.kt", m20195l = {90, 91, C0868i.f2968t0, C0868i.f2973u0}, m20194m = "getNewValues")
    /* renamed from: rj.e$b */
    /* loaded from: classes2.dex */
    public static final class C9916b extends AbstractC6757d {

        /* renamed from: A */
        Object f25942A;

        /* renamed from: B */
        /* synthetic */ Object f25943B;

        /* renamed from: D */
        int f25945D;

        /* renamed from: w */
        Object f25946w;

        /* renamed from: x */
        Object f25947x;

        /* renamed from: y */
        Object f25948y;

        /* renamed from: z */
        Object f25949z;

        C9916b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25943B = obj;
            this.f25945D |= Integer.MIN_VALUE;
            return CacheViewModel.this.m9709P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.debug.cache.CacheViewModel", m20196f = "CacheViewModel.kt", m20195l = {80, 82}, m20194m = "getValueInFlow")
    /* renamed from: rj.e$c */
    /* loaded from: classes2.dex */
    public static final class C9917c extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f25950A;

        /* renamed from: C */
        int f25952C;

        /* renamed from: w */
        Object f25953w;

        /* renamed from: x */
        Object f25954x;

        /* renamed from: y */
        Object f25955y;

        /* renamed from: z */
        Object f25956z;

        C9917c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25950A = obj;
            this.f25952C |= Integer.MIN_VALUE;
            return CacheViewModel.m9713L(CacheViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, BannersAgent bannersAgent, CategoriesAgent categoriesAgent, ClubsAgent clubsAgent, ClubsCodesAgent clubsCodesAgent, CoachmarksAgent coachmarksAgent, ConsentsAgent consentsAgent, DefaultStoreAgent defaultStoreAgent, FlyersAgent flyersAgent, LoyaltyCardAgent loyaltyCardAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, StoresAgent storesAgent, UserProfileAgent userProfileAgent) {
        super(c1459l0, resourcesProvider);
        ArrayList m201c;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(bannersAgent, "bannersAgent");
        Intrinsics.isThisObjectNull(categoriesAgent, "categoriesAgent");
        Intrinsics.isThisObjectNull(clubsAgent, "clubsAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        Intrinsics.isThisObjectNull(coachmarksAgent, "coachmarksAgent");
        Intrinsics.isThisObjectNull(consentsAgent, "consentsAgent");
        Intrinsics.isThisObjectNull(defaultStoreAgent, "defaultStoreAgent");
        Intrinsics.isThisObjectNull(flyersAgent, "flyersAgent");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(recommendationsCatalogResponsesAgent, "recommendationsCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(searchCatalogResponsesAgent, "searchCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(storesAgent, "storesAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        this.f25923m = bannersAgent;
        this.f25924n = categoriesAgent;
        this.f25925o = clubsAgent;
        this.f25926p = clubsCodesAgent;
        this.f25927q = coachmarksAgent;
        this.f25928r = consentsAgent;
        this.f25929s = defaultStoreAgent;
        this.f25930t = flyersAgent;
        this.f25931u = loyaltyCardAgent;
        this.f25932v = recommendationsCatalogResponsesAgent;
        this.f25933w = searchCatalogResponsesAgent;
        this.f25934x = storesAgent;
        this.f25935y = userProfileAgent;
        m201c = C13780s.m201c("BannersAgent", "CategoriesAgent", "ClubsAgent", "ClubsCodesAgent", "CoachmarksAgent", "ConsentsAgent", "DefaultStoreAgent", "FlyersAgent", "LoyaltyCardAgent", "RecommendationsCatalogResponsesAgent", "SearchCatalogResponsesAgent", "StoresAgent", "UserProfileAgent");
        this.f25920B = m201c;
        C1436e0 c1436e0 = new C1436e0();
        this.f25921C = c1436e0;
        this.f25922D = c1436e0;
    }

    /* renamed from: L */
    public static final /* synthetic */ Object m9713L(CacheViewModel cacheViewModel, InterfaceC1886d interfaceC1886d) {
        return cacheViewModel.m9708Q(interfaceC1886d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b5 -> B:32:0x00b6). Please submit an issue!!! */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m9708Q(bd.InterfaceC1886d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p342rj.CacheViewModel.C9917c
            if (r0 == 0) goto L13
            r0 = r9
            rj.e$c r0 = (p342rj.CacheViewModel.C9917c) r0
            int r1 = r0.f25952C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25952C = r1
            goto L18
        L13:
            rj.e$c r0 = new rj.e$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25950A
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25952C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r2 = r0.f25956z
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.f25955y
            androidx.lifecycle.e0 r4 = (androidx.lifecycle.C1436e0) r4
            java.lang.Object r5 = r0.f25954x
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f25953w
            java.util.Collection r6 = (java.util.Collection) r6
            p468yc.C13186n.m1453b(r9)
            goto Lb6
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L45:
            java.lang.Object r0 = r0.f25953w
            androidx.lifecycle.e0 r0 = (androidx.lifecycle.C1436e0) r0
            p468yc.C13186n.m1453b(r9)
            goto L6d
        L4d:
            p468yc.C13186n.m1453b(r9)
            androidx.lifecycle.e0 r9 = r8.f25921C
            eg.a r2 = r8.f25936z
            if (r2 == 0) goto L75
            p181jd.Intrinsics.ifNullDoSomething(r2)
            yc.u r3 = p468yc.C13195u.f34156a
            kotlinx.coroutines.flow.c r2 = r2.m25792p(r3)
            r0.f25953w = r9
            r0.f25952C = r4
            java.lang.Object r0 = kotlinx.coroutines.flow.C6788e.m20134n(r2, r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r7 = r0
            r0 = r9
            r9 = r7
        L6d:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r7 = r0
            r0 = r9
            r9 = r7
            goto Lca
        L75:
            eg.d r2 = r8.f25919A
            if (r2 == 0) goto Lc8
            p181jd.Intrinsics.ifNullDoSomething(r2)
            java.util.List r2 = r2.m25750f()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p489zc.C13777q.m218r(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = r2
            r2 = r4
            r4 = r9
        L92:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto Lbf
            java.lang.Object r9 = r5.next()
            eg.a r9 = (eg.AbstractC5050a) r9
            yc.u r6 = p468yc.C13195u.f34156a
            kotlinx.coroutines.flow.c r9 = r9.m25792p(r6)
            r0.f25953w = r2
            r0.f25954x = r5
            r0.f25955y = r4
            r0.f25956z = r2
            r0.f25952C = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.C6788e.m20134n(r9, r0)
            if (r9 != r1) goto Lb5
            return r1
        Lb5:
            r6 = r2
        Lb6:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r2.add(r9)
            r2 = r6
            goto L92
        Lbf:
            java.util.List r2 = (java.util.List) r2
            java.lang.String r9 = r2.toString()
            r0 = r9
            r9 = r4
            goto Lca
        Lc8:
            java.lang.String r0 = "Error"
        Lca:
            r9.mo166p(r0)
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p342rj.CacheViewModel.m9708Q(bd.d):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: R */
    private final void m9707R(String str) {
        AbstractC5050a abstractC5050a;
        AbstractC5067d abstractC5067d = null;
        switch (str.hashCode()) {
            case -1584537767:
                if (str.equals("CoachmarksAgent")) {
                    abstractC5050a = this.f25927q;
                    break;
                }
                abstractC5050a = null;
                break;
            case -1554100145:
                if (str.equals("LoyaltyCardAgent")) {
                    abstractC5050a = this.f25931u;
                    break;
                }
                abstractC5050a = null;
                break;
            case -420833689:
                if (str.equals("UserProfileAgent")) {
                    abstractC5050a = this.f25935y;
                    break;
                }
                abstractC5050a = null;
                break;
            case -31112536:
                if (str.equals("ClubsAgent")) {
                    abstractC5050a = this.f25925o;
                    break;
                }
                abstractC5050a = null;
                break;
            case 407812284:
                if (str.equals("ClubsCodesAgent")) {
                    abstractC5050a = this.f25926p;
                    break;
                }
                abstractC5050a = null;
                break;
            case 708204115:
                if (str.equals("StoresAgent")) {
                    abstractC5050a = this.f25934x;
                    break;
                }
                abstractC5050a = null;
                break;
            case 850301861:
                if (str.equals("DefaultStoreAgent")) {
                    abstractC5050a = this.f25929s;
                    break;
                }
                abstractC5050a = null;
                break;
            case 1537840844:
                if (str.equals("ConsentsAgent")) {
                    abstractC5050a = this.f25928r;
                    break;
                }
                abstractC5050a = null;
                break;
            default:
                abstractC5050a = null;
                break;
        }
        this.f25936z = abstractC5050a;
        switch (str.hashCode()) {
            case -1369261724:
                if (str.equals("SearchCatalogResponsesAgent")) {
                    abstractC5067d = this.f25933w;
                    break;
                }
                break;
            case 256255666:
                if (str.equals("RecommendationsCatalogResponsesAgent")) {
                    abstractC5067d = this.f25932v;
                    break;
                }
                break;
            case 742115986:
                if (str.equals("FlyersAgent")) {
                    abstractC5067d = this.f25930t;
                    break;
                }
                break;
            case 1383282217:
                if (str.equals("CategoriesAgent")) {
                    abstractC5067d = this.f25924n;
                    break;
                }
                break;
            case 1707697310:
                if (str.equals("BannersAgent")) {
                    abstractC5067d = this.f25923m;
                    break;
                }
                break;
        }
        this.f25919A = abstractC5067d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[RETURN] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m9712M(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p342rj.CacheViewModel.C9915a
            if (r0 == 0) goto L13
            r0 = r8
            rj.e$a r0 = (p342rj.CacheViewModel.C9915a) r0
            int r1 = r0.f25937A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25937A = r1
            goto L18
        L13:
            rj.e$a r0 = new rj.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25940y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25937A
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            goto L43
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.f25939x
            androidx.lifecycle.e0 r2 = (androidx.lifecycle.C1436e0) r2
            java.lang.Object r5 = r0.f25938w
            rj.e r5 = (p342rj.CacheViewModel) r5
            p468yc.C13186n.m1453b(r8)
            r8 = r2
            goto L7a
        L43:
            java.lang.Object r0 = r0.f25938w
            androidx.lifecycle.e0 r0 = (androidx.lifecycle.C1436e0) r0
            p468yc.C13186n.m1453b(r8)
            goto L63
        L4b:
            p468yc.C13186n.m1453b(r8)
            androidx.lifecycle.e0 r8 = r7.f25921C
            eg.a r2 = r7.f25936z
            if (r2 == 0) goto L65
            p181jd.Intrinsics.ifNullDoSomething(r2)
            r0.f25938w = r8
            r0.f25937A = r6
            java.lang.Object r0 = r2.m25801g(r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            r0 = r8
        L63:
            r8 = r0
            goto L8f
        L65:
            eg.d r2 = r7.f25919A
            if (r2 == 0) goto L8d
            p181jd.Intrinsics.ifNullDoSomething(r2)
            r0.f25938w = r7
            r0.f25939x = r8
            r0.f25937A = r5
            java.lang.Object r2 = r2.m25755a(r0)
            if (r2 != r1) goto L79
            return r1
        L79:
            r5 = r7
        L7a:
            eg.d r2 = r5.f25919A
            p181jd.Intrinsics.ifNullDoSomething(r2)
            r0.f25938w = r8
            r5 = 0
            r0.f25939x = r5
            r0.f25937A = r4
            java.lang.Object r0 = r2.m25755a(r0)
            if (r0 != r1) goto L62
            return r1
        L8d:
            java.lang.String r3 = "Error"
        L8f:
            r8.mo166p(r3)
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p342rj.CacheViewModel.m9712M(bd.d):java.lang.Object");
    }

    /* renamed from: N */
    public final List m9711N() {
        return this.f25920B;
    }

    /* renamed from: O */
    public final LiveData m9710O() {
        return this.f25922D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010e -> B:40:0x0110). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015b -> B:48:0x015c). Please submit an issue!!! */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m9709P(bd.InterfaceC1886d r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p342rj.CacheViewModel.m9709P(bd.d):java.lang.Object");
    }

    /* renamed from: S */
    public final Object m9706S(int i, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        m9707R((String) this.f25920B.get(i));
        Object m9708Q = m9708Q(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m9708Q == m34636d ? m9708Q : C13195u.f34156a;
    }
}
