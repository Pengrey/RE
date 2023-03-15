package am;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.C7347m1;
import p181jd.Intrinsics;
import p281ol.TakeAwayViewModel;
import p351s5.RecyclerPickerDialogFragment;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwaySetup;
import td.InterfaceC10524i0;

/* renamed from: am.r */
/* loaded from: classes2.dex */
public final class TakeAwayProductsViewModel extends TakeAwayViewModel {

    /* renamed from: j0 */
    private final C7347m1 f523j0;

    /* renamed from: k0 */
    private final C1436e0 f524k0;

    /* renamed from: l0 */
    private final LiveData f525l0;

    /* renamed from: m0 */
    private boolean f526m0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsViewModel$1", m20196f = "TakeAwayProductsViewModel.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: am.r$a */
    /* loaded from: classes2.dex */
    public static final class C0233a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f527x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayProductsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsViewModel$1$1", m20196f = "TakeAwayProductsViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: am.r$a$a */
        /* loaded from: classes2.dex */
        public static final class C0234a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f529x;

            /* renamed from: y */
            final /* synthetic */ TakeAwayProductsViewModel f530y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0234a(TakeAwayProductsViewModel takeAwayProductsViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f530y = takeAwayProductsViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C0234a(this.f530y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C0234a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f529x == 0) {
                    C13186n.m1453b(obj);
                    Store m18678n = TakeAwayProductsViewModel.m41511n1(this.f530y).m18678n();
                    if (m18678n != null) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : m18678n.m13715D()) {
                            arrayList.add(new RecyclerPickerDialogFragment(str));
                        }
                        this.f530y.m16421h1(m18678n);
                        TakeAwayProductsViewModel.m41508q1(this.f530y, arrayList);
                        TakeAwayProductsViewModel takeAwayProductsViewModel = this.f530y;
                        TakeAwayProductsViewModel.m41507r1(takeAwayProductsViewModel, ((TakeAwayFlowData) takeAwayProductsViewModel.m34578S()).m14689b().m10849b());
                    }
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C0233a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0233a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0233a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f527x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayProductsViewModel takeAwayProductsViewModel = TakeAwayProductsViewModel.this;
                C0234a c0234a = new C0234a(takeAwayProductsViewModel, null);
                this.f527x = 1;
                if (CoreBaseViewModel.m20383n(takeAwayProductsViewModel, false, c0234a, this, 1, null) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsViewModel$setPickUpHour$1", m20196f = "TakeAwayProductsViewModel.kt", m20195l = {71}, m20194m = "invokeSuspend")
    /* renamed from: am.r$b */
    /* loaded from: classes2.dex */
    public static final class C0235b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f531x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayProductsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsViewModel$setPickUpHour$1$1", m20196f = "TakeAwayProductsViewModel.kt", m20195l = {72}, m20194m = "invokeSuspend")
        /* renamed from: am.r$b$a */
        /* loaded from: classes2.dex */
        public static final class C0236a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f533x;

            /* renamed from: y */
            final /* synthetic */ TakeAwayProductsViewModel f534y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0236a(TakeAwayProductsViewModel takeAwayProductsViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f534y = takeAwayProductsViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C0236a(this.f534y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C0236a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f533x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7347m1 m41511n1 = TakeAwayProductsViewModel.m41511n1(this.f534y);
                    int m41504u1 = this.f534y.m41504u1();
                    String m41505t1 = this.f534y.m41505t1();
                    this.f533x = 1;
                    if (m41511n1.m18682j(m41504u1, m41505t1, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                TakeAwayProductsViewModel.m41510o1(this.f534y).mo166p(TakeAwayProductsViewModel.m41511n1(this.f534y).m18681k());
                return C13195u.f34156a;
            }
        }

        C0235b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0235b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0235b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f531x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayProductsViewModel takeAwayProductsViewModel = TakeAwayProductsViewModel.this;
                C0236a c0236a = new C0236a(takeAwayProductsViewModel, null);
                this.f531x = 1;
                if (TakeAwayProductsViewModel.m41509p1(takeAwayProductsViewModel, true, c0236a, this) == m34636d) {
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
    public TakeAwayProductsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "takeAwayManager");
        this.f523j0 = c7347m1;
        C1436e0 c1436e0 = new C1436e0();
        this.f524k0 = c1436e0;
        this.f525l0 = c1436e0;
        this.f526m0 = true;
        super.m16425d1(((TakeAwayFlowData) m34578S()).m14689b().m10849b());
        m41512e1(((TakeAwayFlowData) m34578S()).m14689b().m10848c());
        c1436e0.mo166p(c7347m1.m18681k());
        m16420i1(true);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C0233a(null), 3, null);
        this.f526m0 = false;
    }

    /* renamed from: n1 */
    public static final /* synthetic */ C7347m1 m41511n1(TakeAwayProductsViewModel takeAwayProductsViewModel) {
        return takeAwayProductsViewModel.f523j0;
    }

    /* renamed from: o1 */
    public static final /* synthetic */ C1436e0 m41510o1(TakeAwayProductsViewModel takeAwayProductsViewModel) {
        return takeAwayProductsViewModel.f524k0;
    }

    /* renamed from: p1 */
    public static final /* synthetic */ Object m41509p1(TakeAwayProductsViewModel takeAwayProductsViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return takeAwayProductsViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: q1 */
    public static final /* synthetic */ void m41508q1(TakeAwayProductsViewModel takeAwayProductsViewModel, ArrayList arrayList) {
        takeAwayProductsViewModel.m16423f1(arrayList);
    }

    /* renamed from: r1 */
    public static final /* synthetic */ void m41507r1(TakeAwayProductsViewModel takeAwayProductsViewModel, String str) {
        takeAwayProductsViewModel.m41503v1(str);
    }

    /* renamed from: v1 */
    private final void m41503v1(String str) {
        List<String> m13706m;
        ArrayList arrayList = new ArrayList();
        Store store = (Store) m16438Q0().mo172f();
        if (store != null && (m13706m = store.m13706m(str)) != null) {
            for (String str2 : m13706m) {
                arrayList.add(new RecyclerPickerDialogFragment(str2));
            }
        }
        m16422g1(arrayList);
    }

    /* renamed from: d1 */
    public void m41513d1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        String str2 = (String) m16440O0().mo172f();
        super.m16425d1(str);
        m41503v1(str);
        m16417l1(true);
        if (!m16435T0() || Intrinsics.equals(str2, str)) {
            return;
        }
        this.f523j0.m18689c();
        m14852H0();
    }

    /* renamed from: e1 */
    public void m41512e1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        super.m16424e1(str);
        if (this.f526m0) {
            return;
        }
        TakeAwaySetup m14689b = ((TakeAwayFlowData) m34578S()).m14689b();
        C7347m1 c7347m1 = this.f523j0;
        Object mo172f = m16438Q0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        Object mo172f2 = m16440O0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f2);
        Object mo172f3 = m16439P0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f3);
        m14689b.m10846e(c7347m1.m18674r((Store) mo172f, (String) mo172f2, (String) mo172f3));
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C0235b(null), 3, null);
    }

    /* renamed from: s1 */
    public final LiveData m41506s1() {
        return this.f525l0;
    }

    /* renamed from: t1 */
    public final String m41505t1() {
        return ((TakeAwayFlowData) m34578S()).m14689b().m10850a();
    }

    /* renamed from: u1 */
    public final int m41504u1() {
        return ((TakeAwayFlowData) m34578S()).m14689b().m10847d();
    }
}
