package p426wg;

import ae.BindingAdapters;
import am.TakeAwayProductListFragmentViewModel;
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
import java.util.List;
import p223lg.InterfaceC7054a;

/* renamed from: wg.a7 */
/* loaded from: classes2.dex */
public class C11674a7 extends AbstractC12133z6 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f29848E;

    /* renamed from: F */
    private static final SparseIntArray f29849F;

    /* renamed from: A */
    private final AbstractC11800h9 f29850A;

    /* renamed from: B */
    private final AbstractC12100x8 f29851B;

    /* renamed from: C */
    private final AbstractC11695ba f29852C;

    /* renamed from: D */
    private long f29853D;

    /* renamed from: z */
    private final ConstraintLayout f29854z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f29848E = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_products_not_found", "view_for_no_connection", "view_loading_small"}, new int[]{2, 3, 4}, new int[]{C2336R.layout.view_for_products_not_found, C2336R.layout.view_for_no_connection, C2336R.layout.view_loading_small});
        f29849F = null;
    }

    public C11674a7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f29848E, f29849F));
    }

    /* renamed from: Q */
    private boolean m4488Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29853D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4487R(LiveData<List<InterfaceC7054a>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29853D |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4486S(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29853D |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4485T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29853D |= 8;
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
                        return false;
                    }
                    return m4485T((LiveData) obj, i2);
                }
                return m4487R((LiveData) obj, i2);
            }
            return m4486S((C1436e0) obj, i2);
        }
        return m4488Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29850A.mo3594K(interfaceC1491v);
        this.f29851B.mo3594K(interfaceC1491v);
        this.f29852C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4484U((TakeAwayProductListFragmentViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4484U(TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel) {
        this.f32044y = takeAwayProductListFragmentViewModel;
        synchronized (this) {
            this.f29853D |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        View.OnClickListener onClickListener;
        C1436e0 c1436e0;
        Boolean bool;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        synchronized (this) {
            j = this.f29853D;
            this.f29853D = 0L;
        }
        TakeAwayProductListFragmentViewModel takeAwayProductListFragmentViewModel = this.f32044y;
        if ((63 & j) != 0) {
            if ((j & 49) != 0) {
                LiveData m20387j = takeAwayProductListFragmentViewModel != null ? takeAwayProductListFragmentViewModel.m20387j() : null;
                m37818O(0, m20387j);
                z = ViewDataBinding.m37823H(m20387j != null ? (Boolean) m20387j.mo172f() : null);
            } else {
                z = false;
            }
            if ((j & 50) != 0) {
                c1436e0 = takeAwayProductListFragmentViewModel != null ? takeAwayProductListFragmentViewModel.m20352M() : null;
                m37818O(1, c1436e0);
                bool = c1436e0 != null ? (Boolean) c1436e0.mo172f() : null;
                z3 = ViewDataBinding.m37823H(bool);
                z4 = !z3;
            } else {
                c1436e0 = null;
                bool = null;
                z3 = false;
                z4 = false;
            }
            View.OnClickListener m20349P = ((j & 48) == 0 || takeAwayProductListFragmentViewModel == null) ? null : takeAwayProductListFragmentViewModel.m20349P();
            int i = ((j & 62) > 0L ? 1 : ((j & 62) == 0L ? 0 : -1));
            if (i != 0) {
                LiveData m41528a1 = takeAwayProductListFragmentViewModel != null ? takeAwayProductListFragmentViewModel.m41528a1() : null;
                m37818O(2, m41528a1);
                List list = m41528a1 != null ? (List) m41528a1.mo172f() : null;
                z2 = list != null ? list.isEmpty() : false;
                if (i == 0) {
                    j2 = 128;
                } else if (z2) {
                    j2 = 128;
                    j |= 128;
                } else {
                    j2 = 128;
                    j |= 64;
                }
                onClickListener = m20349P;
            } else {
                j2 = 128;
                onClickListener = m20349P;
                z2 = false;
            }
        } else {
            j2 = 128;
            z = false;
            z2 = false;
            onClickListener = null;
            c1436e0 = null;
            bool = null;
            z3 = false;
            z4 = false;
        }
        if ((j & j2) != 0) {
            if (takeAwayProductListFragmentViewModel != null) {
                c1436e0 = takeAwayProductListFragmentViewModel.m20352M();
            }
            m37818O(1, c1436e0);
            if (c1436e0 != null) {
                bool = (Boolean) c1436e0.mo172f();
            }
            z3 = ViewDataBinding.m37823H(bool);
            z4 = !z3;
        }
        boolean z7 = z3;
        int i2 = ((j & 62) > 0L ? 1 : ((j & 62) == 0L ? 0 : -1));
        if (i2 != 0) {
            z5 = z2 ? z4 : false;
            if (i2 != 0) {
                j = z5 ? j | 512 : j | 256;
            }
        } else {
            z5 = false;
        }
        if ((j & 512) != 0) {
            LiveData m102x = takeAwayProductListFragmentViewModel != null ? takeAwayProductListFragmentViewModel.m102x() : null;
            m37818O(3, m102x);
            z6 = !ViewDataBinding.m37823H(m102x != null ? (Boolean) m102x.mo172f() : null);
        } else {
            z6 = false;
        }
        int i3 = ((j & 62) > 0L ? 1 : ((j & 62) == 0L ? 0 : -1));
        z6 = (i3 == 0 || !z5) ? false : false;
        if ((32 & j) != 0) {
            this.f29850A.mo4188Q(m37802s().getResources().getString(C2336R.string.lbl_meals_not_found));
        }
        if (i3 != 0) {
            this.f29850A.mo4187R(Boolean.valueOf(z6));
        }
        if ((48 & j) != 0) {
            this.f29851B.mo3603Q(onClickListener);
        }
        if ((50 & j) != 0) {
            this.f29851B.mo3602R(z7);
            BindingAdapters.m41779l(this.f32043x, Boolean.valueOf(z4), null);
        }
        if ((j & 49) != 0) {
            this.f29852C.mo4419R(z);
        }
        ViewDataBinding.m37808m(this.f29850A);
        ViewDataBinding.m37808m(this.f29851B);
        ViewDataBinding.m37808m(this.f29852C);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29853D != 0) {
                return true;
            }
            return this.f29850A.mo3580u() || this.f29851B.mo3580u() || this.f29852C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29853D = 32L;
        }
        this.f29850A.mo3579w();
        this.f29851B.mo3579w();
        this.f29852C.mo3579w();
        m37826E();
    }

    private C11674a7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (PlaceHolderRecyclerView) objArr[1]);
        this.f29853D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29854z = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11800h9 abstractC11800h9 = (AbstractC11800h9) objArr[2];
        this.f29850A = abstractC11800h9;
        m37821J(abstractC11800h9);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[3];
        this.f29851B = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[4];
        this.f29852C = abstractC11695ba;
        m37821J(abstractC11695ba);
        this.f32043x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
