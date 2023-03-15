package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p227ll.ManualSortShoppingListViewModel;
import p494zh.BaseViewModel;

/* renamed from: wg.m3 */
/* loaded from: classes2.dex */
public class C11884m3 extends AbstractC11866l3 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30921F;

    /* renamed from: G */
    private static final SparseIntArray f30922G;

    /* renamed from: A */
    private final ConstraintLayout f30923A;

    /* renamed from: B */
    private final AbstractC12136z9 f30924B;

    /* renamed from: C */
    private final CoordinatorLayout f30925C;

    /* renamed from: D */
    private final AbstractC11956pf f30926D;

    /* renamed from: E */
    private long f30927E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30921F = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{3}, new int[]{C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_toolbar_transparent"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar_transparent});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30922G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.items_RecyclerView, 4);
        sparseIntArray.put(C2336R.C2338id.confirm_MaterialButton, 5);
    }

    public C11884m3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30921F, f30922G));
    }

    /* renamed from: Q */
    private boolean m4025Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30927E |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4025Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30926D.mo3594K(interfaceC1491v);
        this.f30924B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4024R((ManualSortShoppingListViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4024R(ManualSortShoppingListViewModel manualSortShoppingListViewModel) {
        this.f30844z = manualSortShoppingListViewModel;
        synchronized (this) {
            this.f30927E |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30927E;
            this.f30927E = 0L;
        }
        BaseViewModel baseViewModel = this.f30844z;
        int i = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        Boolean bool = null;
        if (i != 0) {
            LiveData m20387j = baseViewModel != null ? baseViewModel.m20387j() : null;
            m37818O(0, m20387j);
            if (m20387j != null) {
                bool = (Boolean) m20387j.mo172f();
            }
        }
        if (i != 0) {
            this.f30924B.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f30926D);
        ViewDataBinding.m37808m(this.f30924B);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30927E != 0) {
                return true;
            }
            return this.f30926D.mo3580u() || this.f30924B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30927E = 4L;
        }
        this.f30926D.mo3579w();
        this.f30924B.mo3579w();
        m37826E();
    }

    private C11884m3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[5], (RecyclerView) objArr[4]);
        this.f30927E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30923A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[3];
        this.f30924B = abstractC12136z9;
        m37821J(abstractC12136z9);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[1];
        this.f30925C = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC11956pf abstractC11956pf = (AbstractC11956pf) objArr[2];
        this.f30926D = abstractC11956pf;
        m37821J(abstractC11956pf);
        m37820L(view);
        mo3579w();
    }
}
