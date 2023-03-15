package am;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.C7347m1;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import td.InterfaceC10524i0;

/* renamed from: am.f */
/* loaded from: classes2.dex */
public final class TakeAwayProductListFragmentViewModel extends TakeAwayCartViewModel {

    /* renamed from: T */
    private final C7347m1 f486T;

    /* renamed from: U */
    private final C1436e0 f487U;

    /* renamed from: V */
    private final LiveData f488V;

    /* renamed from: W */
    private C1436e0 f489W;

    /* renamed from: X */
    private final C1436e0 f490X;

    /* renamed from: Y */
    private final C1436e0 f491Y;

    /* renamed from: Z */
    private final C1436e0 f492Z;

    /* renamed from: a0 */
    private final C1436e0 f493a0;

    /* renamed from: b0 */
    private final InterfaceC6108l f494b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragmentViewModel.kt */
    /* renamed from: am.f$a */
    /* loaded from: classes2.dex */
    public static final class C0220a extends AbstractC6438m implements InterfaceC6108l {
        C0220a() {
            super(1);
        }

        /* renamed from: a */
        public final void m41524a(boolean z) {
            String str = (String) TakeAwayProductListFragmentViewModel.m41537R0(TakeAwayProductListFragmentViewModel.this).mo172f();
            Integer num = (Integer) TakeAwayProductListFragmentViewModel.m41532W0(TakeAwayProductListFragmentViewModel.this).mo172f();
            String str2 = (String) TakeAwayProductListFragmentViewModel.m41534U0(TakeAwayProductListFragmentViewModel.this).mo172f();
            Boolean bool = (Boolean) TakeAwayProductListFragmentViewModel.m41536S0(TakeAwayProductListFragmentViewModel.this).mo172f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            if (str == null || num == null || str2 == null) {
                return;
            }
            TakeAwayProductListFragmentViewModel.this.m41525d1(str, num.intValue(), str2, booleanValue, z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m41524a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListFragmentViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductListFragmentViewModel$search$1", m20196f = "TakeAwayProductListFragmentViewModel.kt", m20195l = {69}, m20194m = "invokeSuspend")
    /* renamed from: am.f$b */
    /* loaded from: classes2.dex */
    public static final class C0221b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f496A;

        /* renamed from: B */
        final /* synthetic */ int f497B;

        /* renamed from: C */
        final /* synthetic */ String f498C;

        /* renamed from: D */
        final /* synthetic */ boolean f499D;

        /* renamed from: x */
        int f500x;

        /* renamed from: z */
        final /* synthetic */ boolean f502z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayProductListFragmentViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductListFragmentViewModel$search$1$1", m20196f = "TakeAwayProductListFragmentViewModel.kt", m20195l = {71}, m20194m = "invokeSuspend")
        /* renamed from: am.f$b$a */
        /* loaded from: classes2.dex */
        public static final class C0222a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f503A;

            /* renamed from: B */
            final /* synthetic */ int f504B;

            /* renamed from: C */
            final /* synthetic */ String f505C;

            /* renamed from: D */
            final /* synthetic */ boolean f506D;

            /* renamed from: x */
            int f507x;

            /* renamed from: y */
            int f508y;

            /* renamed from: z */
            final /* synthetic */ TakeAwayProductListFragmentViewModel f509z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0222a(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel, String str, int i, String str2, boolean z, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f509z = takeAwayProductListFragmentViewModel;
                this.f503A = str;
                this.f504B = i;
                this.f505C = str2;
                this.f506D = z;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C0222a(this.f509z, this.f503A, this.f504B, this.f505C, this.f506D, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C0222a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                int i;
                m34636d = C2116d.m34636d();
                int i2 = this.f508y;
                if (i2 == 0) {
                    C13186n.m1453b(obj);
                    Integer num = (Integer) TakeAwayProductListFragmentViewModel.m41535T0(this.f509z).mo172f();
                    if (num == null) {
                        num = C6755b.m20199c(0);
                    }
                    int intValue = num.intValue();
                    C7347m1 m41538Q0 = TakeAwayProductListFragmentViewModel.m41538Q0(this.f509z);
                    String str = this.f503A;
                    int i3 = this.f504B;
                    String str2 = this.f505C;
                    this.f507x = intValue;
                    this.f508y = 1;
                    Object m18676p = C7347m1.m18676p(m41538Q0, str, i3, str2, intValue, 0, this, 16, null);
                    if (m18676p == m34636d) {
                        return m34636d;
                    }
                    i = intValue;
                    obj = m18676p;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i = this.f507x;
                    C13186n.m1453b(obj);
                }
                List<TakeAwayProduct> list = (List) obj;
                if (!list.isEmpty()) {
                    TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel = this.f509z;
                    for (TakeAwayProduct takeAwayProduct : list) {
                        TakeAwayProduct m41576N0 = takeAwayProductListFragmentViewModel.m41576N0(takeAwayProduct.m14244i());
                        takeAwayProduct.m14253N(m41576N0 != null ? m41576N0.m14235w() : takeAwayProduct.m14235w());
                    }
                    UtilsExtensions.m35166f(TakeAwayProductListFragmentViewModel.m41533V0(this.f509z), list);
                    TakeAwayProductListFragmentViewModel.m41535T0(this.f509z).mo166p(C6755b.m20199c(i + 1));
                }
                if (this.f506D) {
                    C1436e0 m41533V0 = TakeAwayProductListFragmentViewModel.m41533V0(this.f509z);
                    List m18681k = TakeAwayProductListFragmentViewModel.m41538Q0(this.f509z).m18681k();
                    String str3 = this.f503A;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m18681k) {
                        TakeAwayCategory takeAwayCategory = (TakeAwayCategory) obj2;
                        if (!Intrinsics.equals(takeAwayCategory.m14293a(), str3) && takeAwayCategory.m14290d()) {
                            arrayList.add(obj2);
                        }
                    }
                    UtilsExtensions.m35166f(m41533V0, arrayList);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0221b(boolean z, String str, int i, String str2, boolean z2, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f502z = z;
            this.f496A = str;
            this.f497B = i;
            this.f498C = str2;
            this.f499D = z2;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0221b(this.f502z, this.f496A, this.f497B, this.f498C, this.f499D, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0221b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f500x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(TakeAwayProductListFragmentViewModel.this, this.f502z, false, 2, null);
                TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel = TakeAwayProductListFragmentViewModel.this;
                C0222a c0222a = new C0222a(takeAwayProductListFragmentViewModel, this.f496A, this.f497B, this.f498C, this.f499D, null);
                this.f500x = 1;
                if (TakeAwayProductListFragmentViewModel.m41531X0(takeAwayProductListFragmentViewModel, !this.f502z, c0222a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            TakeAwayProductListFragmentViewModel.m41530Y0(TakeAwayProductListFragmentViewModel.this, false, true);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayProductListFragmentViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f486T = c7347m1;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f487U = c1436e0;
        this.f488V = c1436e0;
        C1436e0 m37003d = c1459l0.m37003d("_lastPage", 1);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_lastPage\", 1)");
        this.f489W = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_categoryId", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(\"_categoryId\", \"\")");
        this.f490X = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_storeId", 0);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(\"_storeId\", 0)");
        this.f491Y = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("_pickupDate", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData(\"_pickupDate\", \"\")");
        this.f492Z = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_isFeatured", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData(\"_isFeatured\", false)");
        this.f493a0 = m37003d5;
        this.f494b0 = OperatorExtensions.m35176e(0L, null, new C0220a(), 3, null);
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C7347m1 m41538Q0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f486T;
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C1436e0 m41537R0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f490X;
    }

    /* renamed from: S0 */
    public static final /* synthetic */ C1436e0 m41536S0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f493a0;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C1436e0 m41535T0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f489W;
    }

    /* renamed from: U0 */
    public static final /* synthetic */ C1436e0 m41534U0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f492Z;
    }

    /* renamed from: V0 */
    public static final /* synthetic */ C1436e0 m41533V0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f487U;
    }

    /* renamed from: W0 */
    public static final /* synthetic */ C1436e0 m41532W0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        return takeAwayProductListFragmentViewModel.f491Y;
    }

    /* renamed from: X0 */
    public static final /* synthetic */ Object m41531X0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return takeAwayProductListFragmentViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ void m41530Y0(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel, boolean z, boolean z2) {
        takeAwayProductListFragmentViewModel.m112J(z, z2);
    }

    /* renamed from: N */
    protected void m41539N() {
        this.f494b0.mo9587d(Boolean.TRUE);
    }

    /* renamed from: Z0 */
    public final void m41529Z0(TakeAwayProduct takeAwayProduct, int i) {
        int i2 = i;
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        int m18675q = this.f486T.m18675q(takeAwayProduct);
        int m14235w = takeAwayProduct.m14235w();
        if (m18675q == 0) {
            m18675q = takeAwayProduct.m14235w();
        }
        boolean z = i2 < takeAwayProduct.m14235w();
        if ((i2 <= 10 && this.f486T.m18685g() < 30) || z) {
            m41578L0(takeAwayProduct, i);
        } else {
            String string = m20390g().m6899a().getString(C2336R.string.lbl_max_allowed_products_reached);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            m20382o(string);
            i2 = m14235w;
        }
        ArrayList arrayList = new ArrayList();
        T mo172f = this.f487U.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        ArrayList<TakeAwayProduct> arrayList2 = new ArrayList();
        for (Object obj : (Iterable) mo172f) {
            if (obj instanceof TakeAwayProduct) {
                arrayList2.add(obj);
            }
        }
        for (TakeAwayProduct takeAwayProduct2 : arrayList2) {
            if (takeAwayProduct.m14244i() == takeAwayProduct2.m14244i()) {
                arrayList.add(TakeAwayProduct.m14249c(takeAwayProduct2, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, i2, m18675q, 0, 163839, null));
            } else {
                arrayList.add(TakeAwayProduct.m14249c(takeAwayProduct2, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null));
            }
        }
        this.f487U.mo166p(arrayList);
    }

    /* renamed from: a1 */
    public final LiveData m41528a1() {
        return this.f488V;
    }

    /* renamed from: b1 */
    public final void m41527b1() {
        T mo172f = this.f493a0.mo172f();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.equals(mo172f, bool)) {
            this.f494b0.mo9587d(bool);
        }
    }

    /* renamed from: c1 */
    public final void m41526c1(String str) {
        Intrinsics.isThisObjectNull(str, "categoryId");
        Collection collection = (Collection) this.f487U.mo172f();
        if (collection == null || collection.isEmpty()) {
            return;
        }
        C1436e0 c1436e0 = this.f487U;
        T mo172f = c1436e0.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        c1436e0.mo166p(C6431d0.m20953b(m41574P0((List) mo172f)));
        if (Intrinsics.equals(this.f493a0.mo172f(), Boolean.TRUE)) {
            C1436e0 c1436e02 = this.f487U;
            List m18681k = this.f486T.m18681k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m18681k) {
                TakeAwayCategory takeAwayCategory = (TakeAwayCategory) obj;
                if (!Intrinsics.equals(takeAwayCategory.m14293a(), str) && takeAwayCategory.m14290d()) {
                    arrayList.add(obj);
                }
            }
            UtilsExtensions.m35166f(c1436e02, arrayList);
        }
    }

    /* renamed from: d1 */
    public final void m41525d1(String str, int i, String str2, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(str, "categoryId");
        Intrinsics.isThisObjectNull(str2, "pickupDate");
        this.f490X.mo166p(str);
        this.f491Y.mo166p(Integer.valueOf(i));
        this.f492Z.mo166p(str2);
        this.f493a0.mo166p(Boolean.valueOf(z));
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C0221b(z2, str, i, str2, z, null), 3, null);
    }
}
