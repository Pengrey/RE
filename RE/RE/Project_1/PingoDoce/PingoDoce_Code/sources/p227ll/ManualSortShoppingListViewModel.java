package p227ll;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7337l1;
import mg.C7256f1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import td.InterfaceC10524i0;

/* renamed from: ll.g */
/* loaded from: classes2.dex */
public final class ManualSortShoppingListViewModel extends BaseViewModel {

    /* renamed from: m */
    private final C7256f1 f18788m;

    /* renamed from: n */
    private final InterfaceC6108l f18789n;

    /* renamed from: o */
    private final C1436e0 f18790o;

    /* renamed from: p */
    private final LiveData f18791p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManualSortShoppingListViewModel.kt */
    /* renamed from: ll.g$a */
    /* loaded from: classes2.dex */
    public static final class C7076a extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ManualSortShoppingListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListViewModel$confirmThrottleClick$1$1", m20196f = "ManualSortShoppingListViewModel.kt", m20195l = {32}, m20194m = "invokeSuspend")
        /* renamed from: ll.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C7077a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f18793x;

            /* renamed from: y */
            final /* synthetic */ ManualSortShoppingListViewModel f18794y;

            /* renamed from: z */
            final /* synthetic */ List f18795z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ManualSortShoppingListViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListViewModel$confirmThrottleClick$1$1$1", m20196f = "ManualSortShoppingListViewModel.kt", m20195l = {34}, m20194m = "invokeSuspend")
            /* renamed from: ll.g$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7078a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f18796x;

                /* renamed from: y */
                final /* synthetic */ List f18797y;

                /* renamed from: z */
                final /* synthetic */ ManualSortShoppingListViewModel f18798z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C7078a(List list, ManualSortShoppingListViewModel manualSortShoppingListViewModel, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f18797y = list;
                    this.f18798z = manualSortShoppingListViewModel;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C7078a(this.f18797y, this.f18798z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C7078a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f18796x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        List list = this.f18797y;
                        ManualSortShoppingListViewModel manualSortShoppingListViewModel = this.f18798z;
                        int i2 = 0;
                        for (Object obj2 : list) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                C13780s.m187q();
                            }
                            ShoppingListProduct shoppingListProduct = (ShoppingListProduct) obj2;
                            C7256f1 m19358L = ManualSortShoppingListViewModel.m19358L(manualSortShoppingListViewModel);
                            shoppingListProduct.m14344J(i2);
                            m19358L.m18842S(shoppingListProduct);
                            i2 = i3;
                        }
                        C7256f1 m19358L2 = ManualSortShoppingListViewModel.m19358L(this.f18798z);
                        this.f18796x = 1;
                        obj = m19358L2.m18847N(true, this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    AbstractC7337l1 abstractC7337l1 = (AbstractC7337l1) obj;
                    if (abstractC7337l1 instanceof AbstractC7337l1.C7338a) {
                        ManualSortShoppingListViewModel.m19357M(this.f18798z, ((AbstractC7337l1.C7338a) abstractC7337l1).m18701a());
                    } else {
                        UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, -1, null, 2, null);
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7077a(ManualSortShoppingListViewModel manualSortShoppingListViewModel, List list, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f18794y = manualSortShoppingListViewModel;
                this.f18795z = list;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C7077a(this.f18794y, this.f18795z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C7077a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f18793x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ManualSortShoppingListViewModel manualSortShoppingListViewModel = this.f18794y;
                    C7078a c7078a = new C7078a(this.f18795z, manualSortShoppingListViewModel, null);
                    this.f18793x = 1;
                    if (ManualSortShoppingListViewModel.m19356N(manualSortShoppingListViewModel, true, c7078a, this) == m34636d) {
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

        C7076a() {
            super(1);
        }

        /* renamed from: a */
        public final void m19353a(List list) {
            Intrinsics.isThisObjectNull(list, "list");
            C6772d.m20158d(C1473p0.m36987a(ManualSortShoppingListViewModel.this), null, null, new C7077a(ManualSortShoppingListViewModel.this, list, null), 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m19353a((List) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSortShoppingListViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        this.f18788m = c7256f1;
        this.f18789n = OperatorExtensions.m35176e(0L, null, new C7076a(), 3, null);
        C1436e0 c1436e0 = new C1436e0();
        this.f18790o = c1436e0;
        this.f18791p = c1436e0;
        c1436e0.mo166p(c7256f1.m18822q());
    }

    /* renamed from: L */
    public static final /* synthetic */ C7256f1 m19358L(ManualSortShoppingListViewModel manualSortShoppingListViewModel) {
        return manualSortShoppingListViewModel.f18788m;
    }

    /* renamed from: M */
    public static final /* synthetic */ void m19357M(ManualSortShoppingListViewModel manualSortShoppingListViewModel, Throwable th2) {
        manualSortShoppingListViewModel.m109l(th2);
    }

    /* renamed from: N */
    public static final /* synthetic */ Object m19356N(ManualSortShoppingListViewModel manualSortShoppingListViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return manualSortShoppingListViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: O */
    public final LiveData m19355O() {
        return this.f18791p;
    }

    /* renamed from: P */
    public final void m19354P(List list) {
        Intrinsics.isThisObjectNull(list, "items");
        this.f18789n.mo9587d(list);
    }
}
