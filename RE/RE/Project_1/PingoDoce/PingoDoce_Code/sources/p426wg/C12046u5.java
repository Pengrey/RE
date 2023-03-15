package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import fj.FiltersViewModel;
import ki.NoConnectionViewModel;

/* renamed from: wg.u5 */
/* loaded from: classes2.dex */
public class C12046u5 extends AbstractC12022t5 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f31640K;

    /* renamed from: L */
    private static final SparseIntArray f31641L;

    /* renamed from: H */
    private final ConstraintLayout f31642H;

    /* renamed from: I */
    private final AbstractC11695ba f31643I;

    /* renamed from: J */
    private long f31644J;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(16);
        f31640K = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_no_connection"}, new int[]{4}, new int[]{C2336R.layout.view_for_no_connection});
        c1263i.m37795a(2, new String[]{"view_loading_small"}, new int[]{3}, new int[]{C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31641L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.coordinatorLayout, 5);
        sparseIntArray.put(C2336R.C2338id.const_filters_order_label, 6);
        sparseIntArray.put(C2336R.C2338id.const_filters_order_RadioGroup, 7);
        sparseIntArray.put(C2336R.C2338id.const_filters_brands_label, 8);
        sparseIntArray.put(C2336R.C2338id.filters_brands_switcher, 9);
        sparseIntArray.put(C2336R.C2338id.const_filters_header, 10);
        sparseIntArray.put(C2336R.C2338id.filters_brands_RecyclerView, 11);
        sparseIntArray.put(C2336R.C2338id.const_filters_bottom_constraintLayout, 12);
        sparseIntArray.put(C2336R.C2338id.const_filters_divider_bottom, 13);
        sparseIntArray.put(C2336R.C2338id.btn_filters_clean, 14);
        sparseIntArray.put(C2336R.C2338id.btn_filters_apply, 15);
    }

    public C12046u5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f31640K, f31641L));
    }

    /* renamed from: T */
    private boolean m3725T(AbstractC12100x8 abstractC12100x8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31644J |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3724U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31644J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3723V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31644J |= 2;
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
                    return false;
                }
                return m3725T((AbstractC12100x8) obj, i2);
            }
            return m3723V((C1436e0) obj, i2);
        }
        return m3724U((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31643I.mo3594K(interfaceC1491v);
        this.f31523E.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo3726S((FiltersViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12022t5
    /* renamed from: S */
    public void mo3726S(FiltersViewModel filtersViewModel) {
        this.f31525G = filtersViewModel;
        synchronized (this) {
            this.f31644J |= 8;
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
        View.OnClickListener onClickListener;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.f31644J;
            this.f31644J = 0L;
        }
        NoConnectionViewModel noConnectionViewModel = this.f31525G;
        boolean z5 = false;
        if ((27 & j) != 0) {
            if ((j & 25) != 0) {
                LiveData m20387j = noConnectionViewModel != null ? noConnectionViewModel.m20387j() : null;
                m37818O(0, m20387j);
                z3 = ViewDataBinding.m37823H(m20387j != null ? (Boolean) m20387j.mo172f() : null);
            } else {
                z3 = false;
            }
            if ((j & 26) != 0) {
                C1436e0 m20352M = noConnectionViewModel != null ? noConnectionViewModel.m20352M() : null;
                m37818O(1, m20352M);
                z5 = ViewDataBinding.m37823H(m20352M != null ? (Boolean) m20352M.mo172f() : null);
                z4 = !z5;
            } else {
                z4 = false;
            }
            onClickListener = ((j & 24) == 0 || noConnectionViewModel == null) ? null : noConnectionViewModel.m20349P();
            boolean z6 = z4;
            z2 = z3;
            z = z5;
            z5 = z6;
        } else {
            z = false;
            z2 = false;
            onClickListener = null;
        }
        if ((26 & j) != 0) {
            BindingAdapters.m41779l(this.f31526x, Boolean.valueOf(z5), null);
            this.f31523E.mo3602R(z);
        }
        if ((j & 24) != 0) {
            this.f31523E.mo3603Q(onClickListener);
        }
        if ((j & 25) != 0) {
            this.f31643I.mo4419R(z2);
        }
        ViewDataBinding.m37808m(this.f31643I);
        ViewDataBinding.m37808m(this.f31523E);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31644J != 0) {
                return true;
            }
            return this.f31643I.mo3580u() || this.f31523E.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31644J = 16L;
        }
        this.f31643I.mo3579w();
        this.f31523E.mo3579w();
        m37826E();
    }

    private C12046u5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (ConstraintLayout) objArr[1], (MaterialButton) objArr[15], (MaterialButton) objArr[14], (ConstraintLayout) objArr[12], (TextView) objArr[8], (View) objArr[13], (TextView) objArr[10], (TextView) objArr[6], (RadioGroup) objArr[7], (CoordinatorLayout) objArr[5], (RecyclerView) objArr[11], (SwitchCompat) objArr[9], (AbstractC12100x8) objArr[4], (Toolbar) objArr[2]);
        this.f31644J = -1L;
        this.f31526x.setTag(null);
        m37821J(this.f31523E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31642H = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[3];
        this.f31643I = abstractC11695ba;
        m37821J(abstractC11695ba);
        this.f31524F.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
