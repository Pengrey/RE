package pt.pingodoce.app.presentation.shoppinglist.manualsort;

import android.graphics.Canvas;
import android.view.View;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.RecyclerView;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p227ll.InterfaceC7071a;
import p227ll.ManualSortShoppingListAdapter;
import p227ll.ManualSortShoppingListViewModel;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11805he;
import p426wg.AbstractC11866l3;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListActivity;

/* compiled from: ManualSortShoppingListActivity.kt */
/* loaded from: classes2.dex */
public final class ManualSortShoppingListActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24916f0;

    /* renamed from: g0 */
    private final ManualSortShoppingListAdapter f24917g0;

    /* renamed from: h0 */
    private final C1618k f24918h0;

    /* compiled from: ManualSortShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9477a extends C1618k.AbstractC1624f {

        /* renamed from: d */
        private final InterfaceC7071a f24919d;

        public C9477a(InterfaceC7071a interfaceC7071a) {
            Intrinsics.isThisObjectNull(interfaceC7071a, "adapter");
            this.f24919d = interfaceC7071a;
        }

        /* renamed from: C */
        public void mo35961C(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
            Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        }

        /* renamed from: l */
        public int mo35949l(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
            return C1618k.AbstractC1624f.m35940u(3, 0);
        }

        /* renamed from: r */
        public boolean mo35943r() {
            return false;
        }

        /* renamed from: v */
        public void mo35939v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, float f, float f2, int i, boolean z) {
            Intrinsics.isThisObjectNull(canvas, "c");
            Intrinsics.isThisObjectNull(recyclerView, "rv");
            Intrinsics.isThisObjectNull(abstractC1531c0, "vh");
            if (abstractC1531c0 instanceof ManualSortShoppingListAdapter.C7075a) {
                boolean z2 = z && i == 2;
                AbstractC11805he abstractC11805he = (AbstractC11805he) ((ManualSortShoppingListAdapter.C7075a) abstractC1531c0).m22151M();
                abstractC11805he.m37802s().setElevation(z2 ? UtilsExtensions.m35167e(7) : UtilsExtensions.m35167e(0));
                abstractC11805he.f30493B.setVisibility(z2 ? 4 : 0);
            }
            super.mo35939v(canvas, recyclerView, abstractC1531c0, f, f2, i, z);
        }

        /* renamed from: z */
        public boolean mo35935z(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
            Intrinsics.isThisObjectNull(abstractC1531c02, "target");
            this.f24919d.mo19367c(abstractC1531c0.m36568j(), abstractC1531c02.m36568j());
            return true;
        }
    }

    /* compiled from: ManualSortShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListActivity$b */
    /* loaded from: classes2.dex */
    static final class C9478b extends AbstractC6438m implements InterfaceC6097a {
        C9478b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ManualSortShoppingListActivity.this.m11047l1(), ManualSortShoppingListActivity.this, null, 2, null);
        }
    }

    public ManualSortShoppingListActivity() {
        ManualSortShoppingListAdapter manualSortShoppingListAdapter = new ManualSortShoppingListAdapter();
        this.f24917g0 = manualSortShoppingListAdapter;
        this.f24918h0 = new C1618k(new C9477a(manualSortShoppingListAdapter));
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m11050i1(ManualSortShoppingListViewModel manualSortShoppingListViewModel, ManualSortShoppingListActivity manualSortShoppingListActivity, View view) {
        m11044n1(manualSortShoppingListViewModel, manualSortShoppingListActivity, view);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m11049j1(ManualSortShoppingListActivity manualSortShoppingListActivity, List list) {
        m11043o1(manualSortShoppingListActivity, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m11044n1(ManualSortShoppingListViewModel manualSortShoppingListViewModel, ManualSortShoppingListActivity manualSortShoppingListActivity, View view) {
        Intrinsics.isThisObjectNull(manualSortShoppingListViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(manualSortShoppingListActivity, "this$0");
        manualSortShoppingListViewModel.m19354P(manualSortShoppingListActivity.f24917g0.m19364G());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m11043o1(ManualSortShoppingListActivity manualSortShoppingListActivity, List list) {
        Intrinsics.isThisObjectNull(manualSortShoppingListActivity, "this$0");
        ManualSortShoppingListAdapter manualSortShoppingListAdapter = manualSortShoppingListActivity.f24917g0;
        Intrinsics.checkIfNull(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ShoppingListProduct) {
                arrayList.add(obj);
            }
        }
        manualSortShoppingListAdapter.m22153F(arrayList);
    }

    /* renamed from: G0 */
    protected int m11054G0() {
        return C2336R.string.lbl_shopping_order_by_alt;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11053J0() {
        return C6450z.m20906b(ManualSortShoppingListViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11052K0() {
        return new C9478b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m11047l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24916f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public void m11051P0(AbstractC11866l3 abstractC11866l3, final ManualSortShoppingListViewModel manualSortShoppingListViewModel) {
        Intrinsics.isThisObjectNull(abstractC11866l3, "binding");
        Intrinsics.isThisObjectNull(manualSortShoppingListViewModel, "viewModel");
        this.f24918h0.m35981m(abstractC11866l3.f30843y);
        abstractC11866l3.f30843y.setAdapter(this.f24917g0);
        abstractC11866l3.f30842x.setOnClickListener(new View.OnClickListener() { // from class: ll.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManualSortShoppingListActivity.m11044n1(ManualSortShoppingListViewModel.this, this, view);
            }
        });
        manualSortShoppingListViewModel.m19355O().mo171i(this, new InterfaceC1440f0() { // from class: ll.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ManualSortShoppingListActivity.m11043o1(ManualSortShoppingListActivity.this, (List) obj);
            }
        });
    }

    /* renamed from: n */
    public boolean m11045n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_shopping_list_manual_sort;
    }
}
