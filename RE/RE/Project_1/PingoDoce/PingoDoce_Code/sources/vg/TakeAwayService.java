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
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.remote.endpoints.TakeAwayApi;
import pt.pingodoce.app.data.remote.models.request.TakeAwayOrderCancellationRequest;
import retrofit2.Retrofit;

/* renamed from: vg.i0 */
/* loaded from: classes2.dex */
public final class TakeAwayService extends BaseService {

    /* renamed from: d */
    private final TakeAwayApi f28957d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$cancelOrder$2", m20196f = "TakeAwayService.kt", m20195l = {48}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$a */
    /* loaded from: classes2.dex */
    public static final class C11297a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28958x;

        /* renamed from: z */
        final /* synthetic */ String f28960z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11297a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28960z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11297a(this.f28960z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11297a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28958x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                TakeAwayOrderCancellationRequest takeAwayOrderCancellationRequest = new TakeAwayOrderCancellationRequest(this.f28960z);
                this.f28958x = 1;
                obj = m5504l.cancelOrder(takeAwayOrderCancellationRequest, this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$categories$2", m20196f = "TakeAwayService.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$b */
    /* loaded from: classes2.dex */
    public static final class C11298b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f28961A;

        /* renamed from: x */
        int f28962x;

        /* renamed from: z */
        final /* synthetic */ int f28964z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11298b(int i, String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28964z = i;
            this.f28961A = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11298b(this.f28964z, this.f28961A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11298b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28962x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                int i2 = this.f28964z;
                String str = this.f28961A;
                this.f28962x = 1;
                obj = m5504l.categories(i2, str, this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$categoryProducts$2", m20196f = "TakeAwayService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$c */
    /* loaded from: classes2.dex */
    public static final class C11299c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ int f28965A;

        /* renamed from: B */
        final /* synthetic */ String f28966B;

        /* renamed from: C */
        final /* synthetic */ int f28967C;

        /* renamed from: D */
        final /* synthetic */ int f28968D;

        /* renamed from: x */
        int f28969x;

        /* renamed from: z */
        final /* synthetic */ String f28971z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11299c(String str, int i, String str2, int i2, int i3, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28971z = str;
            this.f28965A = i;
            this.f28966B = str2;
            this.f28967C = i2;
            this.f28968D = i3;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11299c(this.f28971z, this.f28965A, this.f28966B, this.f28967C, this.f28968D, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11299c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28969x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                String str = this.f28971z;
                int i2 = this.f28965A;
                String str2 = this.f28966B;
                int i3 = this.f28967C;
                int i4 = this.f28968D;
                this.f28969x = 1;
                obj = m5504l.categoryProducts(str, i2, str2, i3, i4, this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$orders$2", m20196f = "TakeAwayService.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$d */
    /* loaded from: classes2.dex */
    public static final class C11300d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28972x;

        C11300d(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11300d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11300d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28972x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                this.f28972x = 1;
                obj = m5504l.orders(this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$placeOrder$2", m20196f = "TakeAwayService.kt", m20195l = {44}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$e */
    /* loaded from: classes2.dex */
    public static final class C11301e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28974x;

        /* renamed from: z */
        final /* synthetic */ TakeAwayOrder f28976z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11301e(TakeAwayOrder takeAwayOrder, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28976z = takeAwayOrder;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11301e(this.f28976z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11301e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28974x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                TakeAwayOrder takeAwayOrder = this.f28976z;
                this.f28974x = 1;
                obj = m5504l.placeOrder(takeAwayOrder, this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$status$2", m20196f = "TakeAwayService.kt", m20195l = {24}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$f */
    /* loaded from: classes2.dex */
    public static final class C11302f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28977x;

        C11302f(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11302f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11302f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28977x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                this.f28977x = 1;
                obj = m5504l.status(this);
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
    /* compiled from: TakeAwayService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.TakeAwayService$takeAwaySchedules$2", m20196f = "TakeAwayService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.i0$g */
    /* loaded from: classes2.dex */
    public static final class C11303g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28979x;

        /* renamed from: z */
        final /* synthetic */ int f28981z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11303g(int i, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28981z = i;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11303g(this.f28981z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11303g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28979x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayApi m5504l = TakeAwayService.m5504l(TakeAwayService.this);
                int i2 = this.f28981z;
                this.f28979x = 1;
                obj = m5504l.takeAwaySchedules(i2, this);
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
    public TakeAwayService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28957d = (TakeAwayApi) retrofit.create(TakeAwayApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ TakeAwayApi m5504l(TakeAwayService takeAwayService) {
        return takeAwayService.f28957d;
    }

    /* renamed from: m */
    public final Object m5503m(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11297a(str, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5502n(int i, String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11298b(i, str, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5501o(String str, int i, String str2, int i2, int i3, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11299c(str, i, str2, i2, i3, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5500p(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11300d(null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5499q(TakeAwayOrder takeAwayOrder, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11301e(takeAwayOrder, null), interfaceC1886d);
    }

    /* renamed from: r */
    public final Object m5498r(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11302f(null), interfaceC1886d);
    }

    /* renamed from: s */
    public final Object m5497s(int i, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11303g(i, null), interfaceC1886d);
    }
}
