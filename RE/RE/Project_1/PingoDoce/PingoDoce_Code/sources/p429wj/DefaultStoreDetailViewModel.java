package p429wj;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.StoreManager;
import mg.TransactionCacheManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p205kj.StoreDetailViewModel;
import p221le.UiEventsLiveData;
import p276og.C8082c;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Store;
import td.InterfaceC10524i0;

/* renamed from: wj.c */
/* loaded from: classes2.dex */
public final class DefaultStoreDetailViewModel extends StoreDetailViewModel {

    /* renamed from: w */
    private final StoreManager f32129w;

    /* compiled from: DefaultStoreDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.detail.DefaultStoreDetailViewModel$actionClick$1", m20196f = "DefaultStoreDetailViewModel.kt", m20195l = {29}, m20194m = "invokeSuspend")
    /* renamed from: wj.c$a */
    /* loaded from: classes2.dex */
    static final class C12170a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32130x;

        /* renamed from: z */
        final /* synthetic */ Store f32132z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DefaultStoreDetailViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.defaultstore.detail.DefaultStoreDetailViewModel$actionClick$1$1", m20196f = "DefaultStoreDetailViewModel.kt", m20195l = {30}, m20194m = "invokeSuspend")
        /* renamed from: wj.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C12171a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f32133x;

            /* renamed from: y */
            final /* synthetic */ DefaultStoreDetailViewModel f32134y;

            /* renamed from: z */
            final /* synthetic */ Store f32135z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DefaultStoreDetailViewModel.kt */
            /* renamed from: wj.c$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C12172a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                public static final C12172a f32136w = new C12172a();

                C12172a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m3482a(C13195u c13195u) {
                    Intrinsics.isThisObjectNull(c13195u, "it");
                    UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m3482a((C13195u) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12171a(DefaultStoreDetailViewModel defaultStoreDetailViewModel, Store store, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32134y = defaultStoreDetailViewModel;
                this.f32135z = store;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12171a(this.f32134y, this.f32135z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12171a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f32133x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    StoreManager m3487c0 = DefaultStoreDetailViewModel.m3487c0(this.f32134y);
                    Store store = this.f32135z;
                    this.f32133x = 1;
                    obj = m3487c0.m18756k(store, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                C8082c.m16958b((Result) obj, C12172a.f32136w);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12170a(Store store, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32132z = store;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12170a(this.f32132z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12170a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32130x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DefaultStoreDetailViewModel defaultStoreDetailViewModel = DefaultStoreDetailViewModel.this;
                C12171a c12171a = new C12171a(defaultStoreDetailViewModel, this.f32132z, null);
                this.f32130x = 1;
                if (DefaultStoreDetailViewModel.m3486d0(defaultStoreDetailViewModel, true, c12171a, this) == m34636d) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStoreDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, TransactionCacheManager transactionCacheManager, StoreManager storeManager) {
        super(c1459l0, resourcesProvider, transactionCacheManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f32129w = storeManager;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ StoreManager m3487c0(DefaultStoreDetailViewModel defaultStoreDetailViewModel) {
        return defaultStoreDetailViewModel.f32129w;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ Object m3486d0(DefaultStoreDetailViewModel defaultStoreDetailViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return defaultStoreDetailViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: N */
    protected void m3489N() {
    }

    /* renamed from: Y */
    public void m3488Y(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12170a(store, null), 3, null);
    }
}
