package p426wg;

import ae.BindingAdapters;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import ki.C6676f;
import p391ul.TakeAwayOrderDetailViewModel;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: wg.g4 */
/* loaded from: classes2.dex */
public class C11777g4 extends AbstractC11758f4 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30384D;

    /* renamed from: E */
    private static final SparseIntArray f30385E;

    /* renamed from: A */
    private final AbstractC11917nf f30386A;

    /* renamed from: B */
    private final CoordinatorLayout f30387B;

    /* renamed from: C */
    private long f30388C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(4);
        f30384D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30385E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.order_RecyclerView, 3);
    }

    public C11777g4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30384D, f30385E));
    }

    /* renamed from: Q */
    private boolean m4273Q(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30388C |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4272R(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30388C |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4271S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30388C |= 4;
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
                return m4271S((LiveData) obj, i2);
            }
            return m4273Q((LiveData) obj, i2);
        }
        return m4272R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30386A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4270T((TakeAwayOrderDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m4270T(TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel) {
        this.f30299z = takeAwayOrderDetailViewModel;
        synchronized (this) {
            this.f30388C |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        C2381h c2381h;
        Drawable drawable;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        View.OnClickListener onClickListener;
        synchronized (this) {
            j = this.f30388C;
            this.f30388C = 0L;
        }
        TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel = this.f30299z;
        int i = ((31 & j) > 0L ? 1 : ((31 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        TakeAwayCheckout takeAwayCheckout = null;
        onClickListener2 = null;
        if (i != 0) {
            if (takeAwayOrderDetailViewModel != null) {
                liveData = takeAwayOrderDetailViewModel.m20327h0();
                liveData2 = takeAwayOrderDetailViewModel.m20331d0();
                liveData3 = takeAwayOrderDetailViewModel.m20326i0();
            } else {
                liveData = null;
                liveData2 = null;
                liveData3 = null;
            }
            m37818O(0, liveData);
            m37818O(1, liveData2);
            m37818O(2, liveData3);
            c2381h = liveData != null ? (C2381h) liveData.mo172f() : null;
            drawable = liveData2 != null ? (Drawable) liveData2.mo172f() : null;
            z = ViewDataBinding.m37823H(liveData3 != null ? (Boolean) liveData3.mo172f() : null);
            if ((j & 24) != 0) {
                if (takeAwayOrderDetailViewModel != null) {
                    View.OnClickListener m6692w0 = takeAwayOrderDetailViewModel.m6692w0();
                    takeAwayCheckout = takeAwayOrderDetailViewModel.m6699A0();
                    onClickListener = m6692w0;
                } else {
                    onClickListener = null;
                }
                r10 = takeAwayCheckout != null ? takeAwayCheckout.m10867c() : false;
                onClickListener2 = onClickListener;
            }
        } else {
            z = false;
            c2381h = null;
            drawable = null;
        }
        if ((j & 24) != 0) {
            this.f30297x.setOnClickListener(onClickListener2);
            BindingAdapters.m41779l(this.f30297x, Boolean.valueOf(r10), Boolean.TRUE);
        }
        if (i != 0) {
            C6676f.m20308a(this.f30297x, drawable, c2381h, z, true);
        }
        ViewDataBinding.m37808m(this.f30386A);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30388C != 0) {
                return true;
            }
            return this.f30386A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30388C = 16L;
        }
        this.f30386A.mo3579w();
        m37826E();
    }

    private C11777g4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (MaterialButton) objArr[1], (RecyclerView) objArr[3]);
        this.f30388C = -1L;
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[2];
        this.f30386A = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30387B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f30297x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
