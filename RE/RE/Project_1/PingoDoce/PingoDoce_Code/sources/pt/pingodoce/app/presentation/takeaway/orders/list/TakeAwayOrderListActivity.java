package pt.pingodoce.app.presentation.takeaway.orders.list;

import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p087ej.ItemSmallPlaceHolderAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p391ul.TakeAwayOrderDetailActivity;
import p409vl.TakeAwayOrderListViewModel;
import p409vl.TakeAwayOrdersListAdapter;
import p426wg.AbstractC11795h4;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity;
import td.InterfaceC10524i0;

/* compiled from: TakeAwayOrderListActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayOrderListActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f25035f0;

    /* compiled from: TakeAwayOrderListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity$a */
    /* loaded from: classes2.dex */
    static final class C9518a extends AbstractC6438m implements InterfaceC6097a {
        C9518a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10810k1 = TakeAwayOrderListActivity.this.m10810k1();
            TakeAwayOrderListActivity takeAwayOrderListActivity = TakeAwayOrderListActivity.this;
            return m10810k1.m20377b(takeAwayOrderListActivity, takeAwayOrderListActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayOrderListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity$initViews$2$1", m20196f = "TakeAwayOrderListActivity.kt", m20195l = {41}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9519b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25037x;

        /* renamed from: y */
        final /* synthetic */ TakeAwayOrdersListAdapter f25038y;

        /* renamed from: z */
        final /* synthetic */ List f25039z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9519b(TakeAwayOrdersListAdapter takeAwayOrdersListAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f25038y = takeAwayOrdersListAdapter;
            this.f25039z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9519b(this.f25038y, this.f25039z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9519b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25037x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayOrdersListAdapter takeAwayOrdersListAdapter = this.f25038y;
                List list = this.f25039z;
                Intrinsics.checkIfNull(list, "it");
                this.f25037x = 1;
                if (takeAwayOrdersListAdapter.m22148H(list, this) == m34636d) {
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
    /* compiled from: TakeAwayOrderListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9520c extends AbstractC6438m implements InterfaceC6108l {
        C9520c() {
            super(1);
        }

        /* renamed from: a */
        public final void m10802a(TakeAwayOrder takeAwayOrder) {
            Intrinsics.isThisObjectNull(takeAwayOrder, "it");
            TakeAwayOrderDetailActivity.m6701a(TakeAwayOrderListActivity.this, takeAwayOrder);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10802a((TakeAwayOrder) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m10812i1(TakeAwayOrderListActivity takeAwayOrderListActivity, TakeAwayOrdersListAdapter takeAwayOrdersListAdapter, List list) {
        m10808m1(takeAwayOrderListActivity, takeAwayOrdersListAdapter, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m10808m1(TakeAwayOrderListActivity takeAwayOrderListActivity, TakeAwayOrdersListAdapter takeAwayOrdersListAdapter, List list) {
        Intrinsics.isThisObjectNull(takeAwayOrderListActivity, "this$0");
        Intrinsics.isThisObjectNull(takeAwayOrdersListAdapter, "$ordersListAdapter");
        C6772d.m20158d(LifecycleOwner.m36965a(takeAwayOrderListActivity), null, null, new C9519b(takeAwayOrdersListAdapter, list, null), 3, null);
    }

    /* renamed from: G0 */
    protected int m10816G0() {
        return C2336R.string.lbl_take_away_orders;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10815J0() {
        return C6450z.m20906b(TakeAwayOrderListViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10814K0() {
        return new C9518a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: k1 */
    public final ViewModelFactoryByInjection m10810k1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25035f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m10813P0(AbstractC11795h4 abstractC11795h4, TakeAwayOrderListViewModel takeAwayOrderListViewModel) {
        Intrinsics.isThisObjectNull(abstractC11795h4, "binding");
        Intrinsics.isThisObjectNull(takeAwayOrderListViewModel, "viewModel");
        final TakeAwayOrdersListAdapter takeAwayOrdersListAdapter = new TakeAwayOrdersListAdapter(new C9520c());
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11795h4.f30450x;
        placeHolderRecyclerView.setAdapter(takeAwayOrdersListAdapter);
        placeHolderRecyclerView.setHoldersAdapter(new ItemSmallPlaceHolderAdapter());
        placeHolderRecyclerView.setHoldersItemDecoration(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(16), 0, 0, false, false, 0, 76, null));
        takeAwayOrderListViewModel.m5233V().mo171i(this, new InterfaceC1440f0() { // from class: vl.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayOrderListActivity.m10808m1(TakeAwayOrderListActivity.this, takeAwayOrdersListAdapter, (List) obj);
            }
        });
    }

    /* renamed from: n */
    public boolean m10807n() {
        return true;
    }

    protected void onResume() {
        super.onResume();
        ((TakeAwayOrderListViewModel) m22758I0()).m5232W(true);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_order_list;
    }
}
