package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import sh.ElectronicInvoiceStatusViewModel;

/* renamed from: wg.x */
/* loaded from: classes2.dex */
public class C12091x extends AbstractC12073w {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31824E;

    /* renamed from: F */
    private static final SparseIntArray f31825F;

    /* renamed from: B */
    private final ConstraintLayout f31826B;

    /* renamed from: C */
    private final AbstractC12136z9 f31827C;

    /* renamed from: D */
    private long f31828D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f31824E = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{2, 3}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31825F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.resume_RecyclerView, 4);
    }

    public C12091x(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31824E, f31825F));
    }

    /* renamed from: Q */
    private boolean m3659Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31828D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3658R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31828D |= 2;
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
            return m3658R((LiveData) obj, i2);
        }
        return m3659Q((AbstractC11917nf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31745y.mo3594K(interfaceC1491v);
        this.f31827C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3657S((ElectronicInvoiceStatusViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3657S(ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel) {
        this.f31743A = electronicInvoiceStatusViewModel;
        synchronized (this) {
            this.f31828D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        Boolean bool;
        synchronized (this) {
            j = this.f31828D;
            this.f31828D = 0L;
        }
        ElectronicInvoiceStatusViewModel electronicInvoiceStatusViewModel = this.f31743A;
        int i = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener = null;
        if (i != 0) {
            LiveData m20387j = electronicInvoiceStatusViewModel != null ? electronicInvoiceStatusViewModel.m20387j() : null;
            m37818O(1, m20387j);
            bool = m20387j != null ? (Boolean) m20387j.mo172f() : null;
            if ((j & 12) != 0 && electronicInvoiceStatusViewModel != null) {
                onClickListener = electronicInvoiceStatusViewModel.m8493c0();
            }
        } else {
            bool = null;
        }
        if ((j & 12) != 0) {
            this.f31744x.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            this.f31827C.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f31745y);
        ViewDataBinding.m37808m(this.f31827C);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31828D != 0) {
                return true;
            }
            return this.f31745y.mo3580u() || this.f31827C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31828D = 8L;
        }
        this.f31745y.mo3579w();
        this.f31827C.mo3579w();
        m37826E();
    }

    private C12091x(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[1], (AbstractC11917nf) objArr[2], (RecyclerView) objArr[4]);
        this.f31828D = -1L;
        this.f31744x.setTag(null);
        m37821J(this.f31745y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31826B = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[3];
        this.f31827C = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
