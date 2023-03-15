package vg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.StoreApi;
import pt.pingodoce.app.data.remote.models.request.StoreDefaultRequest;
import retrofit2.Retrofit;

/* renamed from: vg.g0 */
/* loaded from: classes2.dex */
public final class StoreService extends BaseService {

    /* renamed from: d */
    private final StoreApi f28926d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StoreService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.StoreService$getDefault$2", m20196f = "StoreService.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: vg.g0$a */
    /* loaded from: classes2.dex */
    public static final class C11286a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28927x;

        C11286a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11286a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11286a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28927x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreApi m5529l = StoreService.m5529l(StoreService.this);
                this.f28927x = 1;
                obj = m5529l.m39646default(this);
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
    /* compiled from: StoreService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.StoreService$setDefault$2", m20196f = "StoreService.kt", m20195l = {27}, m20194m = "invokeSuspend")
    /* renamed from: vg.g0$b */
    /* loaded from: classes2.dex */
    public static final class C11287b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28929x;

        /* renamed from: z */
        final /* synthetic */ int f28931z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11287b(int i, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28931z = i;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11287b(this.f28931z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11287b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28929x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreApi m5529l = StoreService.m5529l(StoreService.this);
                StoreDefaultRequest storeDefaultRequest = new StoreDefaultRequest(this.f28931z);
                this.f28929x = 1;
                obj = m5529l.setDefault(storeDefaultRequest, this);
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
    /* compiled from: StoreService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.StoreService$storeList$2", m20196f = "StoreService.kt", m20195l = {19}, m20194m = "invokeSuspend")
    /* renamed from: vg.g0$c */
    /* loaded from: classes2.dex */
    public static final class C11288c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28932x;

        C11288c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11288c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11288c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28932x;
            if (i == 0) {
                C13186n.m1453b(obj);
                StoreApi m5529l = StoreService.m5529l(StoreService.this);
                this.f28932x = 1;
                obj = m5529l.stores(this);
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
    public StoreService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28926d = (StoreApi) retrofit.create(StoreApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ StoreApi m5529l(StoreService storeService) {
        return storeService.f28926d;
    }

    /* renamed from: m */
    public final Object m5528m(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11286a(null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5527n(int i, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11287b(i, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: o */
    public final Object m5526o(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11288c(null), interfaceC1886d);
    }
}
