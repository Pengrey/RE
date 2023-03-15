package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.ShoppingListCheckoutException;
import p339rg.ShoppingListNotFoundException;
import p339rg.ShoppingListNotSharedException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.stores.Coordinates;
import pt.pingodoce.app.data.remote.endpoints.ShoppingListApi;
import pt.pingodoce.app.data.remote.models.request.CheckoutRequest;
import pt.pingodoce.app.data.remote.models.request.PriceCalculationRequest;
import pt.pingodoce.app.data.remote.models.request.SharedWithUpdateRequest;
import pt.pingodoce.app.data.remote.models.request.ShoppingListStoreModeRequest;
import pt.pingodoce.app.data.remote.models.request.ShoppingListUpdateRequest;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;
import retrofit2.Retrofit;

/* renamed from: vg.c0 */
/* loaded from: classes2.dex */
public final class ShoppingListService extends BaseService {

    /* renamed from: d */
    private final ShoppingListApi f28855d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$calculatePriceWithPromotion$2", m20196f = "ShoppingListService.kt", m20195l = {52}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$a */
    /* loaded from: classes2.dex */
    public static final class C11262a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28856x;

        /* renamed from: z */
        final /* synthetic */ List f28858z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11262a(List list, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28858z = list;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11262a(this.f28858z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11262a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28856x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                PriceCalculationRequest priceCalculationRequest = new PriceCalculationRequest(this.f28858z);
                this.f28856x = 1;
                obj = m5587l.calculatePriceWithPromotion(priceCalculationRequest, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$checkout$2", m20196f = "ShoppingListService.kt", m20195l = {55}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$b */
    /* loaded from: classes2.dex */
    public static final class C11263b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28859x;

        /* renamed from: z */
        final /* synthetic */ ShoppingList f28861z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11263b(ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28861z = shoppingList;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11263b(this.f28861z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11263b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28859x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                CheckoutRequest checkoutRequest = new CheckoutRequest(this.f28861z);
                this.f28859x = 1;
                obj = m5587l.checkout(checkoutRequest, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$create$2", m20196f = "ShoppingListService.kt", m20195l = {41}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$c */
    /* loaded from: classes2.dex */
    public static final class C11264c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28862x;

        C11264c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11264c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11264c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28862x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                this.f28862x = 1;
                obj = m5587l.create(this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$delete$2", m20196f = "ShoppingListService.kt", m20195l = {43}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$d */
    /* loaded from: classes2.dex */
    public static final class C11265d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28864x;

        /* renamed from: z */
        final /* synthetic */ String f28866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11265d(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28866z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11265d(this.f28866z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11265d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28864x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                String str = this.f28866z;
                this.f28864x = 1;
                obj = m5587l.delete(str, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$enterStoreMode$2", m20196f = "ShoppingListService.kt", m20195l = {49}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$e */
    /* loaded from: classes2.dex */
    public static final class C11266e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ Coordinates f28867A;

        /* renamed from: x */
        int f28868x;

        /* renamed from: z */
        final /* synthetic */ String f28870z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11266e(String str, Coordinates coordinates, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28870z = str;
            this.f28867A = coordinates;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11266e(this.f28870z, this.f28867A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11266e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28868x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                ShoppingListStoreModeRequest shoppingListStoreModeRequest = new ShoppingListStoreModeRequest(this.f28870z, this.f28867A);
                this.f28868x = 1;
                obj = m5587l.storeMode(shoppingListStoreModeRequest, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$getAll$2", m20196f = "ShoppingListService.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$f */
    /* loaded from: classes2.dex */
    public static final class C11267f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28871x;

        C11267f(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11267f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11267f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28871x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                this.f28871x = 1;
                obj = m5587l.getAll(this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$getDefault$2", m20196f = "ShoppingListService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$g */
    /* loaded from: classes2.dex */
    public static final class C11268g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28873x;

        C11268g(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11268g(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11268g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28873x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                this.f28873x = 1;
                obj = m5587l.getDefault(this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$getListsCount$2", m20196f = "ShoppingListService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$h */
    /* loaded from: classes2.dex */
    public static final class C11269h extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28875x;

        C11269h(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11269h(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11269h) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28875x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                this.f28875x = 1;
                obj = m5587l.getListsCount(this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$permissionUpdate$2", m20196f = "ShoppingListService.kt", m20195l = {46}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$i */
    /* loaded from: classes2.dex */
    public static final class C11270i extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ List f28877A;

        /* renamed from: x */
        int f28878x;

        /* renamed from: z */
        final /* synthetic */ String f28880z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11270i(String str, List list, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28880z = str;
            this.f28877A = list;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11270i(this.f28880z, this.f28877A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11270i) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28878x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                SharedWithUpdateRequest sharedWithUpdateRequest = new SharedWithUpdateRequest(this.f28880z, this.f28877A);
                this.f28878x = 1;
                obj = m5587l.writePermissions(sharedWithUpdateRequest, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$setDefault$2", m20196f = "ShoppingListService.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$j */
    /* loaded from: classes2.dex */
    public static final class C11271j extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28881x;

        /* renamed from: z */
        final /* synthetic */ String f28883z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11271j(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28883z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11271j(this.f28883z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11271j) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28881x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                String str = this.f28883z;
                this.f28881x = 1;
                obj = m5587l.setDefault(str, this);
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
    /* compiled from: ShoppingListService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ShoppingListService$update$2", m20196f = "ShoppingListService.kt", m20195l = {39}, m20194m = "invokeSuspend")
    /* renamed from: vg.c0$k */
    /* loaded from: classes2.dex */
    public static final class C11272k extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ ShoppingList f28884A;

        /* renamed from: x */
        int f28885x;

        /* renamed from: z */
        final /* synthetic */ boolean f28887z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11272k(boolean z, ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28887z = z;
            this.f28884A = shoppingList;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11272k(this.f28887z, this.f28884A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11272k) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28885x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListApi m5587l = ShoppingListService.m5587l(ShoppingListService.this);
                ShoppingListUpdateRequest shoppingListUpdateRequest = new ShoppingListUpdateRequest(this.f28887z, this.f28884A);
                this.f28885x = 1;
                obj = m5587l.update(shoppingListUpdateRequest, this);
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
    public ShoppingListService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28855d = (ShoppingListApi) retrofit.create(ShoppingListApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ ShoppingListApi m5587l(ShoppingListService shoppingListService) {
        return shoppingListService.f28855d;
    }

    /* renamed from: k */
    protected ApiBaseException m5588k(String str, int i) {
        ApiBaseException shoppingListNotFoundException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5020) {
            shoppingListNotFoundException = new ShoppingListNotFoundException(new ApiError(str));
        } else if (i != 5021) {
            switch (i) {
                case 12001:
                case 12002:
                case 12003:
                case 12004:
                case 12005:
                case 12006:
                case 12007:
                    shoppingListNotFoundException = new ShoppingListCheckoutException(new ApiError(str));
                    break;
                default:
                    return super.m5556k(str, i);
            }
        } else {
            shoppingListNotFoundException = new ShoppingListNotSharedException(new ApiError(str));
        }
        return shoppingListNotFoundException;
    }

    /* renamed from: m */
    public final Object m5586m(List list, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11262a(list, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5585n(ShoppingList shoppingList, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11263b(shoppingList, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5584o(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11264c(null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5583p(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11265d(str, null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5582q(String str, Coordinates coordinates, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11266e(str, coordinates, null), interfaceC1886d);
    }

    /* renamed from: r */
    public final Object m5581r(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11267f(null), interfaceC1886d);
    }

    /* renamed from: s */
    public final Object m5580s(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11268g(null), interfaceC1886d);
    }

    /* renamed from: t */
    public final Object m5579t(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11269h(null), interfaceC1886d);
    }

    /* renamed from: u */
    public final Object m5578u(String str, List list, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11270i(str, list, null), interfaceC1886d);
    }

    /* renamed from: v */
    public final Object m5577v(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11271j(str, null), interfaceC1886d);
    }

    /* renamed from: w */
    public final Object m5576w(ShoppingList shoppingList, boolean z, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11272k(z, shoppingList, null), interfaceC1886d);
    }
}
