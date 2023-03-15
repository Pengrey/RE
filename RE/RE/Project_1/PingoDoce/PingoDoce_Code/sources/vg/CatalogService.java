package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.PolicyNotFoundException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.CatalogApi;
import pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCategoriesParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchFlyersParameters;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchTagsParameters;
import retrofit2.Retrofit;

/* renamed from: vg.g */
/* loaded from: classes2.dex */
public final class CatalogService extends BaseService {

    /* renamed from: d */
    private final CatalogApi f28908d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$criteria$2", m20196f = "CatalogService.kt", m20195l = {26}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$a */
    /* loaded from: classes2.dex */
    public static final class C11280a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28909x;

        C11280a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11280a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11280a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28909x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                this.f28909x = 1;
                obj = m5542l.criteria(this);
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
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$recommendations$2", m20196f = "CatalogService.kt", m20195l = {46}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$b */
    /* loaded from: classes2.dex */
    public static final class C11281b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28911x;

        /* renamed from: z */
        final /* synthetic */ RecommendationsParameters f28913z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11281b(RecommendationsParameters recommendationsParameters, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28913z = recommendationsParameters;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11281b(this.f28913z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11281b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28911x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                RecommendationsParameters recommendationsParameters = this.f28913z;
                this.f28911x = 1;
                obj = m5542l.recommendations(recommendationsParameters, this);
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
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$searchCatalog$2", m20196f = "CatalogService.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$c */
    /* loaded from: classes2.dex */
    public static final class C11282c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28914x;

        /* renamed from: z */
        final /* synthetic */ SearchCatalogParameters f28916z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11282c(SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28916z = searchCatalogParameters;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11282c(this.f28916z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11282c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28914x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                SearchCatalogParameters searchCatalogParameters = this.f28916z;
                this.f28914x = 1;
                obj = m5542l.searchCatalog(searchCatalogParameters, this);
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
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$searchCategories$2", m20196f = "CatalogService.kt", m20195l = {42}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$d */
    /* loaded from: classes2.dex */
    public static final class C11283d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28917x;

        /* renamed from: z */
        final /* synthetic */ SearchCategoriesParameters f28919z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11283d(SearchCategoriesParameters searchCategoriesParameters, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28919z = searchCategoriesParameters;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11283d(this.f28919z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11283d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28917x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                SearchCategoriesParameters searchCategoriesParameters = this.f28919z;
                this.f28917x = 1;
                obj = m5542l.searchCategories(searchCategoriesParameters, this);
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
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$searchFlyers$2", m20196f = "CatalogService.kt", m20195l = {38}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$e */
    /* loaded from: classes2.dex */
    public static final class C11284e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28920x;

        /* renamed from: z */
        final /* synthetic */ SearchFlyersParameters f28922z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11284e(SearchFlyersParameters searchFlyersParameters, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28922z = searchFlyersParameters;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11284e(this.f28922z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11284e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28920x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                SearchFlyersParameters searchFlyersParameters = this.f28922z;
                this.f28920x = 1;
                obj = m5542l.searchFlyers(searchFlyersParameters, this);
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
    /* compiled from: CatalogService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.CatalogService$searchTags$2", m20196f = "CatalogService.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: vg.g$f */
    /* loaded from: classes2.dex */
    public static final class C11285f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28923x;

        /* renamed from: z */
        final /* synthetic */ String f28925z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11285f(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28925z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11285f(this.f28925z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11285f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28923x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CatalogApi m5542l = CatalogService.m5542l(CatalogService.this);
                SearchTagsParameters searchTagsParameters = new SearchTagsParameters(this.f28925z);
                this.f28923x = 1;
                obj = m5542l.searchTags(searchTagsParameters, this);
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
    public CatalogService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28908d = (CatalogApi) retrofit.create(CatalogApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ CatalogApi m5542l(CatalogService catalogService) {
        return catalogService.f28908d;
    }

    /* renamed from: k */
    protected ApiBaseException m5543k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5002) {
            return new PolicyNotFoundException(new ApiError(str));
        }
        return super.m5556k(str, i);
    }

    /* renamed from: m */
    public final Object m5541m(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11280a(null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5540n(RecommendationsParameters recommendationsParameters, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11281b(recommendationsParameters, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5539o(SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11282c(searchCatalogParameters, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5538p(SearchCategoriesParameters searchCategoriesParameters, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11283d(searchCategoriesParameters, null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5537q(SearchFlyersParameters searchFlyersParameters, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11284e(searchFlyersParameters, null), interfaceC1886d);
    }

    /* renamed from: r */
    public final Object m5536r(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11285f(str, null), interfaceC1886d);
    }
}
