package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import dj.ProductListViewModel;
import java.util.List;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* renamed from: wg.q6 */
/* loaded from: classes2.dex */
public class C11969q6 extends AbstractC11947p6 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31296F;

    /* renamed from: G */
    private static final SparseIntArray f31297G;

    /* renamed from: A */
    private final ConstraintLayout f31298A;

    /* renamed from: B */
    private final AbstractC11800h9 f31299B;

    /* renamed from: C */
    private final AbstractC12100x8 f31300C;

    /* renamed from: D */
    private final AbstractC11695ba f31301D;

    /* renamed from: E */
    private long f31302E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31296F = c1263i;
        c1263i.m37795a(0, new String[]{"view_placeholder_generic_for_grid", "view_for_products_not_found", "view_for_no_connection", "view_loading_small"}, new int[]{2, 3, 4, 5}, new int[]{C2336R.layout.view_placeholder_generic_for_grid, C2336R.layout.view_for_products_not_found, C2336R.layout.view_for_no_connection, C2336R.layout.view_loading_small});
        f31297G = null;
    }

    public C11969q6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31296F, f31297G));
    }

    /* renamed from: Q */
    private boolean m3851Q(AbstractC11913nb abstractC11913nb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31302E |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3850R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31302E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3849S(LiveData<List<CatalogProduct>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31302E |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3848T(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31302E |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3847U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31302E |= 4;
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
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        return m3851Q((AbstractC11913nb) obj, i2);
                    }
                    return m3849S((LiveData) obj, i2);
                }
                return m3847U((LiveData) obj, i2);
            }
            return m3848T((C1436e0) obj, i2);
        }
        return m3850R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31209y.mo3594K(interfaceC1491v);
        this.f31299B.mo3594K(interfaceC1491v);
        this.f31300C.mo3594K(interfaceC1491v);
        this.f31301D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3846V((ProductListViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public void m3846V(ProductListViewModel productListViewModel) {
        this.f31210z = productListViewModel;
        synchronized (this) {
            this.f31302E |= 32;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        boolean z2;
        C1436e0 c1436e0;
        View.OnClickListener onClickListener;
        LiveData liveData;
        Boolean bool;
        Boolean bool2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j2;
        View.OnClickListener onClickListener2;
        synchronized (this) {
            j = this.f31302E;
            this.f31302E = 0L;
        }
        ProductListViewModel productListViewModel = this.f31210z;
        if ((111 & j) != 0) {
            if ((j & 97) != 0) {
                LiveData m20387j = productListViewModel != null ? productListViewModel.m20387j() : null;
                m37818O(0, m20387j);
                z = ViewDataBinding.m37823H(m20387j != null ? (Boolean) m20387j.mo172f() : null);
            } else {
                z = false;
            }
            if ((j & 98) != 0) {
                c1436e0 = productListViewModel != null ? productListViewModel.m20352M() : null;
                m37818O(1, c1436e0);
                bool2 = c1436e0 != null ? (Boolean) c1436e0.mo172f() : null;
                z3 = ViewDataBinding.m37823H(bool2);
                z4 = !z3;
            } else {
                c1436e0 = null;
                bool2 = null;
                z3 = false;
                z4 = false;
            }
            if ((j & 96) == 0 || productListViewModel == null) {
                j2 = 100;
                onClickListener2 = null;
            } else {
                onClickListener2 = productListViewModel.m20349P();
                j2 = 100;
            }
            if ((j & j2) != 0) {
                liveData = productListViewModel != null ? productListViewModel.m26373n0() : null;
                m37818O(2, liveData);
                bool = liveData != null ? (Boolean) liveData.mo172f() : null;
                z5 = ViewDataBinding.m37823H(bool);
            } else {
                liveData = null;
                bool = null;
                z5 = false;
            }
            int i = ((j & 110) > 0L ? 1 : ((j & 110) == 0L ? 0 : -1));
            if (i != 0) {
                LiveData m26376k0 = productListViewModel != null ? productListViewModel.m26376k0() : null;
                m37818O(3, m26376k0);
                List list = m26376k0 != null ? (List) m26376k0.mo172f() : null;
                z2 = list != null ? list.isEmpty() : false;
                if (i != 0) {
                    j = z2 ? j | 1024 : j | 512;
                }
                onClickListener = onClickListener2;
            } else {
                onClickListener = onClickListener2;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
            c1436e0 = null;
            onClickListener = null;
            liveData = null;
            bool = null;
            bool2 = null;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if ((j & 1024) != 0) {
            if (productListViewModel != null) {
                c1436e0 = productListViewModel.m20352M();
            }
            m37818O(1, c1436e0);
            if (c1436e0 != null) {
                bool2 = (Boolean) c1436e0.mo172f();
            }
            z3 = ViewDataBinding.m37823H(bool2);
            z4 = !z3;
        }
        boolean z9 = z3;
        int i2 = ((j & 110) > 0L ? 1 : ((j & 110) == 0L ? 0 : -1));
        if (i2 != 0) {
            z6 = z2 ? z4 : false;
            if (i2 != 0) {
                j = z6 ? j | 256 : j | 128;
            }
        } else {
            z6 = false;
        }
        if ((j & 256) != 0) {
            if (productListViewModel != null) {
                liveData = productListViewModel.m26373n0();
            }
            m37818O(2, liveData);
            if (liveData != null) {
                bool = (Boolean) liveData.mo172f();
            }
            boolean m37823H = ViewDataBinding.m37823H(bool);
            z8 = !m37823H;
            z7 = m37823H;
        } else {
            z7 = z5;
            z8 = false;
        }
        int i3 = ((j & 110) > 0L ? 1 : ((j & 110) == 0L ? 0 : -1));
        z8 = (i3 == 0 || !z6) ? false : false;
        if ((64 & j) != 0) {
            this.f31299B.mo4188Q(m37802s().getResources().getString(C2336R.string.lbl_products_not_found));
        }
        if (i3 != 0) {
            this.f31299B.mo4187R(Boolean.valueOf(z8));
        }
        if ((96 & j) != 0) {
            this.f31300C.mo3603Q(onClickListener);
        }
        if ((98 & j) != 0) {
            this.f31300C.mo3602R(z9);
            BindingAdapters.m41779l(this.f31208x, Boolean.valueOf(z4), null);
        }
        if ((97 & j) != 0) {
            this.f31301D.mo4419R(z);
        }
        if ((j & 100) != 0) {
            this.f31209y.mo3920Q(z7);
        }
        ViewDataBinding.m37808m(this.f31209y);
        ViewDataBinding.m37808m(this.f31299B);
        ViewDataBinding.m37808m(this.f31300C);
        ViewDataBinding.m37808m(this.f31301D);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31302E != 0) {
                return true;
            }
            return this.f31209y.mo3580u() || this.f31299B.mo3580u() || this.f31300C.mo3580u() || this.f31301D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31302E = 64L;
        }
        this.f31209y.mo3579w();
        this.f31299B.mo3579w();
        this.f31300C.mo3579w();
        this.f31301D.mo3579w();
        m37826E();
    }

    private C11969q6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 5, (PlaceHolderRecyclerView) objArr[1], (AbstractC11913nb) objArr[2]);
        this.f31302E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31298A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11800h9 abstractC11800h9 = (AbstractC11800h9) objArr[3];
        this.f31299B = abstractC11800h9;
        m37821J(abstractC11800h9);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[4];
        this.f31300C = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[5];
        this.f31301D = abstractC11695ba;
        m37821J(abstractC11695ba);
        this.f31208x.setTag(null);
        m37821J(this.f31209y);
        m37820L(view);
        mo3579w();
    }
}
