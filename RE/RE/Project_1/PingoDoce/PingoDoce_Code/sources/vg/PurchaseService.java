package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.NoChartDataAvailableException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.PurchaseHistoryApi;
import retrofit2.Retrofit;

/* renamed from: vg.a0 */
/* loaded from: classes2.dex */
public final class PurchaseService extends BaseService {

    /* renamed from: d */
    private final PurchaseHistoryApi f28831d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PurchaseService$getChartData$2", m20196f = "PurchaseService.kt", m20195l = {22}, m20194m = "invokeSuspend")
    /* renamed from: vg.a0$a */
    /* loaded from: classes2.dex */
    public static final class C11255a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28832x;

        /* renamed from: z */
        final /* synthetic */ String f28834z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11255a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28834z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11255a(this.f28834z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11255a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28832x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseHistoryApi m5606l = PurchaseService.m5606l(PurchaseService.this);
                String str = this.f28834z;
                this.f28832x = 1;
                obj = m5606l.getChartData(str, this);
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
    /* compiled from: PurchaseService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PurchaseService$getPurchaseDetail$2", m20196f = "PurchaseService.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: vg.a0$b */
    /* loaded from: classes2.dex */
    public static final class C11256b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28835x;

        /* renamed from: z */
        final /* synthetic */ String f28837z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11256b(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28837z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11256b(this.f28837z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11256b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28835x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseHistoryApi m5606l = PurchaseService.m5606l(PurchaseService.this);
                String str = this.f28837z;
                this.f28835x = 1;
                obj = m5606l.getPurchaseDetail(str, this);
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
    /* compiled from: PurchaseService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PurchaseService$getPurchaseList$2", m20196f = "PurchaseService.kt", m20195l = {26}, m20194m = "invokeSuspend")
    /* renamed from: vg.a0$c */
    /* loaded from: classes2.dex */
    public static final class C11257c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ int f28838A;

        /* renamed from: x */
        int f28839x;

        /* renamed from: z */
        final /* synthetic */ int f28841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11257c(int i, int i2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28841z = i;
            this.f28838A = i2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11257c(this.f28841z, this.f28838A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11257c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28839x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseHistoryApi m5606l = PurchaseService.m5606l(PurchaseService.this);
                int i2 = this.f28841z;
                int i3 = this.f28838A;
                this.f28839x = 1;
                obj = m5606l.getPurchaseList(i2, i3, this);
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
    public PurchaseService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28831d = (PurchaseHistoryApi) retrofit.create(PurchaseHistoryApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ PurchaseHistoryApi m5606l(PurchaseService purchaseService) {
        return purchaseService.f28831d;
    }

    /* renamed from: k */
    protected ApiBaseException m5607k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i != 5403 && i != 5405) {
            return super.m5556k(str, i);
        }
        return new NoChartDataAvailableException(new ApiError(str));
    }

    /* renamed from: m */
    public final Object m5605m(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11255a(str, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5604n(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11256b(str, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5603o(int i, int i2, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11257c(i, i2, null), interfaceC1886d);
    }
}
