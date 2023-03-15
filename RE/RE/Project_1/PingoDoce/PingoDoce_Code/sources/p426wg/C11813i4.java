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
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import ki.NoConnectionViewModel;
import p111g.C5586a;
import p409vl.TakeAwayOrderListViewModel;

/* renamed from: wg.i4 */
/* loaded from: classes2.dex */
public class C11813i4 extends AbstractC11795h4 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30547F;

    /* renamed from: G */
    private static final SparseIntArray f30548G;

    /* renamed from: A */
    private final CoordinatorLayout f30549A;

    /* renamed from: B */
    private final ConstraintLayout f30550B;

    /* renamed from: C */
    private final AbstractC11799h8 f30551C;

    /* renamed from: D */
    private final AbstractC11695ba f30552D;

    /* renamed from: E */
    private long f30553E;

    /* renamed from: z */
    private final AbstractC11917nf f30554z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30547F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar});
        c1263i.m37795a(1, new String[]{"view_for_empty", "view_loading_small"}, new int[]{3, 4}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30548G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.orders_PlaceHolderRecyclerView, 5);
    }

    public C11813i4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30547F, f30548G));
    }

    /* renamed from: Q */
    private boolean m4205Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30553E |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4204R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30553E |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return m4205Q((LiveData) obj, i2);
        }
        return m4204R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30554z.mo3594K(interfaceC1491v);
        this.f30551C.mo3594K(interfaceC1491v);
        this.f30552D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4203S((TakeAwayOrderListViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4203S(TakeAwayOrderListViewModel takeAwayOrderListViewModel) {
        this.f30451y = takeAwayOrderListViewModel;
        synchronized (this) {
            this.f30553E |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30553E;
            this.f30553E = 0L;
        }
        NoConnectionViewModel noConnectionViewModel = this.f30451y;
        boolean z = false;
        Boolean bool = null;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                LiveData m20387j = noConnectionViewModel != null ? noConnectionViewModel.m20387j() : null;
                m37818O(0, m20387j);
                z = ViewDataBinding.m37823H(m20387j != null ? (Boolean) m20387j.mo172f() : null);
            }
            if ((j & 14) != 0) {
                LiveData m20388i = noConnectionViewModel != null ? noConnectionViewModel.m20388i() : null;
                m37818O(1, m20388i);
                if (m20388i != null) {
                    bool = (Boolean) m20388i.mo172f();
                }
            }
        }
        if ((8 & j) != 0) {
            this.f30551C.mo4193R(m37802s().getResources().getString(C2336R.string.lbl_empty_take_away_order_list));
            this.f30551C.mo4192S(C5586a.m23699b(m37802s().getContext(), C2336R.C2337drawable.ic_empty_takeaway));
            this.f30551C.mo4191T(m37802s().getResources().getString(C2336R.string.lbl_empty_take_away_order_list_title));
        }
        if ((j & 14) != 0) {
            this.f30551C.mo4189V(bool);
        }
        if ((j & 13) != 0) {
            this.f30552D.mo4419R(z);
        }
        ViewDataBinding.m37808m(this.f30554z);
        ViewDataBinding.m37808m(this.f30551C);
        ViewDataBinding.m37808m(this.f30552D);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30553E != 0) {
                return true;
            }
            return this.f30554z.mo3580u() || this.f30551C.mo3580u() || this.f30552D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30553E = 8L;
        }
        this.f30554z.mo3579w();
        this.f30551C.mo3579w();
        this.f30552D.mo3579w();
        m37826E();
    }

    private C11813i4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (PlaceHolderRecyclerView) objArr[5]);
        this.f30553E = -1L;
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[2];
        this.f30554z = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30549A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30550B = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[3];
        this.f30551C = abstractC11799h8;
        m37821J(abstractC11799h8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[4];
        this.f30552D = abstractC11695ba;
        m37821J(abstractC11695ba);
        m37820L(view);
        mo3579w();
    }
}
