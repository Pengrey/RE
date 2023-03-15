package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import p143hh.LoyaltyPendingViewModel;
import p246n2.C7629e;

/* renamed from: wg.c1 */
/* loaded from: classes2.dex */
public class C11703c1 extends AbstractC11686b1 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f29975C;

    /* renamed from: D */
    private static final SparseIntArray f29976D;

    /* renamed from: A */
    private final ConstraintLayout f29977A;

    /* renamed from: B */
    private long f29978B;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(4);
        f29975C = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29976D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.iv_card_registration_success, 3);
    }

    public C11703c1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f29975C, f29976D));
    }

    /* renamed from: Q */
    private boolean m4452Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29978B |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4451R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29978B |= 1;
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
            return m4452Q((AbstractC11917nf) obj, i2);
        }
        return m4451R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29907y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4450S((LoyaltyPendingViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4450S(LoyaltyPendingViewModel loyaltyPendingViewModel) {
        this.f29908z = loyaltyPendingViewModel;
        synchronized (this) {
            this.f29978B |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f29978B;
            this.f29978B = 0L;
        }
        LoyaltyPendingViewModel loyaltyPendingViewModel = this.f29908z;
        int i = ((j & 13) > 0L ? 1 : ((j & 13) == 0L ? 0 : -1));
        String str = null;
        if (i != 0) {
            LiveData m22642M = loyaltyPendingViewModel != null ? loyaltyPendingViewModel.m22642M() : null;
            m37818O(0, m22642M);
            if (m22642M != null) {
                str = (String) m22642M.mo172f();
            }
        }
        if (i != 0) {
            C7629e.m17885g(this.f29906x, str);
        }
        ViewDataBinding.m37808m(this.f29907y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29978B != 0) {
                return true;
            }
            return this.f29907y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29978B = 8L;
        }
        this.f29907y.mo3579w();
        m37826E();
    }

    private C11703c1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (TextView) objArr[1], (AbstractC11917nf) objArr[2], (ImageView) objArr[3]);
        this.f29978B = -1L;
        this.f29906x.setTag(null);
        m37821J(this.f29907y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29977A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
