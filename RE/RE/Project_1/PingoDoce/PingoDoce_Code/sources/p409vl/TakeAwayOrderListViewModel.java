package p409vl;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7347m1;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Collections;
import td.InterfaceC10524i0;

/* renamed from: vl.d */
/* loaded from: classes2.dex */
public final class TakeAwayOrderListViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final C7347m1 f29249p;

    /* renamed from: q */
    private final C1436e0 f29250q;

    /* renamed from: r */
    private final LiveData f29251r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayOrderListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListViewModel$search$1", m20196f = "TakeAwayOrderListViewModel.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vl.d$a */
    /* loaded from: classes2.dex */
    public static final class C11399a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29252x;

        /* renamed from: z */
        final /* synthetic */ boolean f29254z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TakeAwayOrderListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListViewModel$search$1$1", m20196f = "TakeAwayOrderListViewModel.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: vl.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C11400a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f29255x;

            /* renamed from: y */
            final /* synthetic */ TakeAwayOrderListViewModel f29256y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11400a(TakeAwayOrderListViewModel takeAwayOrderListViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f29256y = takeAwayOrderListViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C11400a(this.f29256y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C11400a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                List m453p0;
                C2116d.m34636d();
                if (this.f29255x == 0) {
                    C13186n.m1453b(obj);
                    C1436e0 m5236S = TakeAwayOrderListViewModel.m5236S(this.f29256y);
                    m453p0 = _Collections.m453p0(TakeAwayOrderListViewModel.m5237R(this.f29256y).m18680l());
                    m5236S.mo166p(m453p0);
                    TakeAwayOrderListViewModel takeAwayOrderListViewModel = this.f29256y;
                    Collection collection = (Collection) TakeAwayOrderListViewModel.m5236S(takeAwayOrderListViewModel).mo172f();
                    TakeAwayOrderListViewModel.m5234U(takeAwayOrderListViewModel, collection == null || collection.isEmpty());
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11399a(boolean z, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29254z = z;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C11399a(this.f29254z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11399a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29252x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayOrderListViewModel.m5234U(TakeAwayOrderListViewModel.this, false);
                TakeAwayOrderListViewModel takeAwayOrderListViewModel = TakeAwayOrderListViewModel.this;
                C11400a c11400a = new C11400a(takeAwayOrderListViewModel, null);
                this.f29252x = 1;
                if (TakeAwayOrderListViewModel.m5235T(takeAwayOrderListViewModel, !this.f29254z, c11400a, this) == m34636d) {
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
    public TakeAwayOrderListViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f29249p = c7347m1;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f29250q = c1436e0;
        this.f29251r = c1436e0;
    }

    /* renamed from: R */
    public static final /* synthetic */ C7347m1 m5237R(TakeAwayOrderListViewModel takeAwayOrderListViewModel) {
        return takeAwayOrderListViewModel.f29249p;
    }

    /* renamed from: S */
    public static final /* synthetic */ C1436e0 m5236S(TakeAwayOrderListViewModel takeAwayOrderListViewModel) {
        return takeAwayOrderListViewModel.f29250q;
    }

    /* renamed from: T */
    public static final /* synthetic */ Object m5235T(TakeAwayOrderListViewModel takeAwayOrderListViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return takeAwayOrderListViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: U */
    public static final /* synthetic */ void m5234U(TakeAwayOrderListViewModel takeAwayOrderListViewModel, boolean z) {
        takeAwayOrderListViewModel.m20381p(z);
    }

    /* renamed from: N */
    protected void m5238N() {
        m5232W(true);
    }

    /* renamed from: V */
    public final LiveData m5233V() {
        return this.f29251r;
    }

    /* renamed from: W */
    public final void m5232W(boolean z) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C11399a(z, null), 3, null);
    }
}
