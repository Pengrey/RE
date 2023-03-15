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
import pt.pingodoce.app.data.remote.endpoints.ConsentsApi;
import retrofit2.Retrofit;

/* renamed from: vg.k */
/* loaded from: classes2.dex */
public final class ConsentsService extends BaseService {

    /* renamed from: d */
    private final ConsentsApi f28988d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ConsentsService$clubConsents$2", m20196f = "ConsentsService.kt", m20195l = {24}, m20194m = "invokeSuspend")
    /* renamed from: vg.k$a */
    /* loaded from: classes2.dex */
    public static final class C11306a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28989x;

        /* renamed from: z */
        final /* synthetic */ String f28991z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11306a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28991z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11306a(this.f28991z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11306a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28989x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsApi m5482l = ConsentsService.m5482l(ConsentsService.this);
                Intrinsics.checkIfNull(m5482l, "api");
                String str = this.f28991z;
                this.f28989x = 1;
                obj = ConsentsApi.C8726a.m14221a(m5482l, null, str, this, 1, null);
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
    /* compiled from: ConsentsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ConsentsService$consents$2", m20196f = "ConsentsService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.k$b */
    /* loaded from: classes2.dex */
    public static final class C11307b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28992x;

        C11307b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11307b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11307b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28992x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsApi m5482l = ConsentsService.m5482l(ConsentsService.this);
                this.f28992x = 1;
                obj = m5482l.consents(true, this);
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
    /* compiled from: ConsentsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ConsentsService$latestConsents$2", m20196f = "ConsentsService.kt", m20195l = {20}, m20194m = "invokeSuspend")
    /* renamed from: vg.k$c */
    /* loaded from: classes2.dex */
    public static final class C11308c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28994x;

        C11308c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11308c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11308c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28994x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ConsentsApi m5482l = ConsentsService.m5482l(ConsentsService.this);
                this.f28994x = 1;
                obj = m5482l.latestConsents(this);
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
    public ConsentsService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28988d = (ConsentsApi) retrofit.create(ConsentsApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ ConsentsApi m5482l(ConsentsService consentsService) {
        return consentsService.f28988d;
    }

    /* renamed from: k */
    protected ApiBaseException m5483k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5002) {
            return new PolicyNotFoundException(new ApiError(str));
        }
        return super.m5556k(str, i);
    }

    /* renamed from: m */
    public final Object m5481m(String str, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11306a(str, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5480n(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11307b(null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5479o(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11308c(null), interfaceC1886d);
    }
}
