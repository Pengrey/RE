package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.CardNotFoundException;
import p339rg.CardPairNotFoundException;
import p339rg.InvalidCardFormatException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.endpoints.LoyaltyCardApi;
import pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceStatusRequest;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardInviteResponseRequest;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.VirtualCardRequest;
import retrofit2.Retrofit;

/* renamed from: vg.q */
/* loaded from: classes2.dex */
public final class LoyaltyCardService extends BaseService {

    /* renamed from: d */
    private final LoyaltyCardApi f29048d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$cardStatus$2", m20196f = "LoyaltyCardService.kt", m20195l = {53}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$a */
    /* loaded from: classes2.dex */
    public static final class C11327a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29049x;

        C11327a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11327a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11327a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29049x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                this.f29049x = 1;
                obj = m5428l.cardStatus(this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$delete$2", m20196f = "LoyaltyCardService.kt", m20195l = {57}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$b */
    /* loaded from: classes2.dex */
    public static final class C11328b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29051x;

        C11328b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11328b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11328b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29051x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                this.f29051x = 1;
                obj = m5428l.delete(this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$deleteCardAssociations$2", m20196f = "LoyaltyCardService.kt", m20195l = {45}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$c */
    /* loaded from: classes2.dex */
    public static final class C11329c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29053x;

        C11329c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11329c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11329c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29053x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                this.f29053x = 1;
                obj = m5428l.deleteCardAssociations(this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$electronicInvoice$2", m20196f = "LoyaltyCardService.kt", m20195l = {65}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$d */
    /* loaded from: classes2.dex */
    public static final class C11330d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29055x;

        /* renamed from: z */
        final /* synthetic */ ElectronicInvoiceStatusRequest f29057z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11330d(ElectronicInvoiceStatusRequest electronicInvoiceStatusRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29057z = electronicInvoiceStatusRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11330d(this.f29057z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11330d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29055x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                ElectronicInvoiceStatusRequest electronicInvoiceStatusRequest = this.f29057z;
                this.f29055x = 1;
                obj = m5428l.electronicInvoice(electronicInvoiceStatusRequest, this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$electronicInvoiceStatus$2", m20196f = "LoyaltyCardService.kt", m20195l = {61}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$e */
    /* loaded from: classes2.dex */
    public static final class C11331e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29058x;

        /* renamed from: z */
        final /* synthetic */ PhoneRequest f29060z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11331e(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29060z = phoneRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11331e(this.f29060z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11331e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29058x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                PhoneRequest phoneRequest = this.f29060z;
                this.f29058x = 1;
                obj = m5428l.electronicInvoiceStatus(phoneRequest, this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$getVirtualCardConsents$2", m20196f = "LoyaltyCardService.kt", m20195l = {73}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$f */
    /* loaded from: classes2.dex */
    public static final class C11332f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29061x;

        C11332f(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11332f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11332f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29061x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                this.f29061x = 1;
                obj = m5428l.virtualCardConsents(this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$register$2", m20196f = "LoyaltyCardService.kt", m20195l = {33}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$g */
    /* loaded from: classes2.dex */
    public static final class C11333g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29063x;

        /* renamed from: z */
        final /* synthetic */ LoyaltyCardProvisory f29065z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11333g(LoyaltyCardProvisory loyaltyCardProvisory, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29065z = loyaltyCardProvisory;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11333g(this.f29065z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11333g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29063x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                LoyaltyCardProvisory loyaltyCardProvisory = this.f29065z;
                this.f29063x = 1;
                obj = m5428l.register(loyaltyCardProvisory, this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$registerVirtualCard$2", m20196f = "LoyaltyCardService.kt", m20195l = {69}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$h */
    /* loaded from: classes2.dex */
    public static final class C11334h extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29066x;

        /* renamed from: z */
        final /* synthetic */ VirtualCardRequest f29068z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11334h(VirtualCardRequest virtualCardRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29068z = virtualCardRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11334h(this.f29068z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11334h) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29066x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                VirtualCardRequest virtualCardRequest = this.f29068z;
                this.f29066x = 1;
                obj = m5428l.registerVirtualCard(virtualCardRequest, this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$replyToRequests$2", m20196f = "LoyaltyCardService.kt", m20195l = {49}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$i */
    /* loaded from: classes2.dex */
    public static final class C11335i extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29069x;

        /* renamed from: z */
        final /* synthetic */ LoyaltyCardInviteResponseRequest f29071z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11335i(LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29071z = loyaltyCardInviteResponseRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11335i(this.f29071z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11335i) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29069x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest = this.f29071z;
                this.f29069x = 1;
                obj = m5428l.reply(loyaltyCardInviteResponseRequest, this);
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
    /* compiled from: LoyaltyCardService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.LoyaltyCardService$requests$2", m20196f = "LoyaltyCardService.kt", m20195l = {41}, m20194m = "invokeSuspend")
    /* renamed from: vg.q$j */
    /* loaded from: classes2.dex */
    public static final class C11336j extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29072x;

        C11336j(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11336j(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11336j) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29072x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardApi m5428l = LoyaltyCardService.m5428l(LoyaltyCardService.this);
                this.f29072x = 1;
                obj = m5428l.requests(this);
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
    public LoyaltyCardService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29048d = (LoyaltyCardApi) retrofit.create(LoyaltyCardApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ LoyaltyCardApi m5428l(LoyaltyCardService loyaltyCardService) {
        return loyaltyCardService.f29048d;
    }

    /* renamed from: k */
    protected ApiBaseException m5429k(String str, int i) {
        ApiBaseException invalidCardFormatException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i != 1015 && i != 1023) {
            if (i != 5000) {
                if (i == 5300) {
                    invalidCardFormatException = new CardPairNotFoundException(new ApiError(str));
                    return invalidCardFormatException;
                } else if (i != 5200) {
                    if (i != 5201) {
                        return super.m5556k(str, i);
                    }
                }
            }
            invalidCardFormatException = new CardNotFoundException(new ApiError(str));
            return invalidCardFormatException;
        }
        invalidCardFormatException = new InvalidCardFormatException(new ApiError(str));
        return invalidCardFormatException;
    }

    /* renamed from: m */
    public final Object m5427m(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11327a(null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5426n(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11328b(null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5425o(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11329c(null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5424p(ElectronicInvoiceStatusRequest electronicInvoiceStatusRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11330d(electronicInvoiceStatusRequest, null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5423q(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11331e(phoneRequest, null), interfaceC1886d);
    }

    /* renamed from: r */
    public final Object m5422r(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11332f(null), interfaceC1886d);
    }

    /* renamed from: s */
    public final Object m5421s(LoyaltyCardProvisory loyaltyCardProvisory, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11333g(loyaltyCardProvisory, null), interfaceC1886d);
    }

    /* renamed from: t */
    public final Object m5420t(VirtualCardRequest virtualCardRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11334h(virtualCardRequest, null), interfaceC1886d);
    }

    /* renamed from: u */
    public final Object m5419u(LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11335i(loyaltyCardInviteResponseRequest, null), interfaceC1886d);
    }

    /* renamed from: v */
    public final Object m5418v(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11336j(null), interfaceC1886d);
    }
}
