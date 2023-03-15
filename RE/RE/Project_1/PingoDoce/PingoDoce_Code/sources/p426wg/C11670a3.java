package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p188jl.PurchaseProductsViewModel;
import p246n2.C7629e;

/* renamed from: wg.a3 */
/* loaded from: classes2.dex */
public class C11670a3 extends AbstractC12129z2 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f29826D;

    /* renamed from: E */
    private static final SparseIntArray f29827E;

    /* renamed from: A */
    private final AbstractC11917nf f29828A;

    /* renamed from: B */
    private final CoordinatorLayout f29829B;

    /* renamed from: C */
    private long f29830C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f29826D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29827E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 3);
        sparseIntArray.put(C2336R.C2338id.products_PlaceHolderRecyclerView, 4);
    }

    public C11670a3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f29826D, f29827E));
    }

    /* renamed from: Q */
    private boolean m4511Q(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29830C |= 1;
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
        return m4511Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29828A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4510R((PurchaseProductsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4510R(PurchaseProductsViewModel purchaseProductsViewModel) {
        this.f32020z = purchaseProductsViewModel;
        synchronized (this) {
            this.f29830C |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f29830C;
            this.f29830C = 0L;
        }
        PurchaseProductsViewModel purchaseProductsViewModel = this.f32020z;
        int i = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener = null;
        if (i != 0) {
            LiveData m20688g0 = purchaseProductsViewModel != null ? purchaseProductsViewModel.m20688g0() : null;
            m37818O(0, m20688g0);
            str = m20688g0 != null ? (String) m20688g0.mo172f() : null;
            if ((j & 6) != 0 && purchaseProductsViewModel != null) {
                onClickListener = purchaseProductsViewModel.m20692c0();
            }
        } else {
            str = null;
        }
        if ((j & 6) != 0) {
            this.f32018x.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C7629e.m17885g(this.f32018x, str);
        }
        ViewDataBinding.m37808m(this.f29828A);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29830C != 0) {
                return true;
            }
            return this.f29828A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29830C = 4L;
        }
        this.f29828A.mo3579w();
        m37826E();
    }

    private C11670a3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[1], (TextView) objArr[3], (RecyclerView) objArr[4]);
        this.f29830C = -1L;
        this.f32018x.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[2];
        this.f29828A = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f29829B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
