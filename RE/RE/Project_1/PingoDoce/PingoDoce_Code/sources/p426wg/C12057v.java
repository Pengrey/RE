package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import ph.ElectronicInvoiceViewModel;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: wg.v */
/* loaded from: classes2.dex */
public class C12057v extends AbstractC12032u {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f31696D;

    /* renamed from: E */
    private static final SparseIntArray f31697E;

    /* renamed from: B */
    private final ConstraintLayout f31698B;

    /* renamed from: C */
    private long f31699C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f31696D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_row_for_onboarding_resume"}, new int[]{2, 3}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_row_for_onboarding_resume});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31697E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.success_title, 4);
        sparseIntArray.put(C2336R.C2338id.success_subtitle, 5);
        sparseIntArray.put(C2336R.C2338id.const_sep, 6);
    }

    public C12057v(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31696D, f31697E));
    }

    /* renamed from: Q */
    private boolean m3704Q(AbstractC12104xc abstractC12104xc, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31699C |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3703R(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31699C |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3702S(LiveData<LoyaltyCardResumeViewModel> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31699C |= 2;
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
                return m3704Q((AbstractC12104xc) obj, i2);
            }
            return m3702S((LiveData) obj, i2);
        }
        return m3703R((AbstractC11917nf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31572z.mo3594K(interfaceC1491v);
        this.f31571y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3701T((ElectronicInvoiceViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m3701T(ElectronicInvoiceViewModel electronicInvoiceViewModel) {
        this.f31569A = electronicInvoiceViewModel;
        synchronized (this) {
            this.f31699C |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel;
        synchronized (this) {
            j = this.f31699C;
            this.f31699C = 0L;
        }
        ElectronicInvoiceViewModel electronicInvoiceViewModel = this.f31569A;
        int i = ((26 & j) > 0L ? 1 : ((26 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener = null;
        if (i != 0) {
            View.OnClickListener m14981X = ((j & 24) == 0 || electronicInvoiceViewModel == null) ? null : electronicInvoiceViewModel.m14981X();
            LiveData m14982W = electronicInvoiceViewModel != null ? electronicInvoiceViewModel.m14982W() : null;
            m37818O(1, m14982W);
            loyaltyCardResumeViewModel = m14982W != null ? (LoyaltyCardResumeViewModel) m14982W.mo172f() : null;
            onClickListener = m14981X;
        } else {
            loyaltyCardResumeViewModel = null;
        }
        if ((j & 24) != 0) {
            this.f31570x.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            this.f31571y.mo3598Q(loyaltyCardResumeViewModel);
        }
        ViewDataBinding.m37808m(this.f31572z);
        ViewDataBinding.m37808m(this.f31571y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31699C != 0) {
                return true;
            }
            return this.f31572z.mo3580u() || this.f31571y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31699C = 16L;
        }
        this.f31572z.mo3579w();
        this.f31571y.mo3579w();
        m37826E();
    }

    private C12057v(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (MaterialButton) objArr[1], (AbstractC12104xc) objArr[3], (View) objArr[6], (AbstractC11917nf) objArr[2], (TextView) objArr[5], (TextView) objArr[4]);
        this.f31699C = -1L;
        this.f31570x.setTag(null);
        m37821J(this.f31571y);
        m37821J(this.f31572z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31698B = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
