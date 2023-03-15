package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroViewModel;

/* renamed from: wg.a1 */
/* loaded from: classes2.dex */
public class C11668a1 extends AbstractC12127z0 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f29817G;

    /* renamed from: H */
    private static final SparseIntArray f29818H;

    /* renamed from: D */
    private final AbstractC12136z9 f29819D;

    /* renamed from: E */
    private final LinearLayout f29820E;

    /* renamed from: F */
    private long f29821F;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f29817G = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{3, 6}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_for_loyalty_intro_why_to", "view_for_loyalty_intro_know_more"}, new int[]{4, 5}, new int[]{C2336R.layout.view_for_loyalty_intro_why_to, C2336R.layout.view_for_loyalty_intro_know_more});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29818H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.card, 7);
        sparseIntArray.put(C2336R.C2338id.card_title, 8);
    }

    public C11668a1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f29817G, f29818H));
    }

    /* renamed from: R */
    private boolean m4518R(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29821F |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4517S(AbstractC12025t8 abstractC12025t8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29821F |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4516T(AbstractC12066v8 abstractC12066v8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29821F |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4515U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29821F |= 4;
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
                    return m4516T((AbstractC12066v8) obj, i2);
                }
                return m4515U((LiveData) obj, i2);
            }
            return m4518R((AbstractC11917nf) obj, i2);
        }
        return m4517S((AbstractC12025t8) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f32012y.mo3594K(interfaceC1491v);
        this.f32009B.mo3594K(interfaceC1491v);
        this.f32008A.mo3594K(interfaceC1491v);
        this.f29819D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo3577Q((LoyaltyIntroViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12127z0
    /* renamed from: Q */
    public void mo3577Q(LoyaltyIntroViewModel loyaltyIntroViewModel) {
        this.f32010C = loyaltyIntroViewModel;
        synchronized (this) {
            this.f29821F |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        Boolean bool;
        synchronized (this) {
            j = this.f29821F;
            this.f29821F = 0L;
        }
        LoyaltyIntroViewModel loyaltyIntroViewModel = this.f32010C;
        int i = ((52 & j) > 0L ? 1 : ((52 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        if (i != 0) {
            LiveData m20387j = loyaltyIntroViewModel != null ? loyaltyIntroViewModel.m20387j() : null;
            m37818O(2, m20387j);
            bool = m20387j != null ? (Boolean) m20387j.mo172f() : null;
            if ((j & 48) == 0 || loyaltyIntroViewModel == null) {
                onClickListener = null;
            } else {
                onClickListener2 = loyaltyIntroViewModel.m13483O();
                onClickListener = loyaltyIntroViewModel.m13480R();
            }
        } else {
            onClickListener = null;
            bool = null;
        }
        if ((j & 48) != 0) {
            this.f32013z.setOnClickListener(onClickListener2);
            this.f32008A.mo3717Q(onClickListener);
        }
        if (i != 0) {
            this.f29819D.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f32012y);
        ViewDataBinding.m37808m(this.f32009B);
        ViewDataBinding.m37808m(this.f32008A);
        ViewDataBinding.m37808m(this.f29819D);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29821F != 0) {
                return true;
            }
            return this.f32012y.mo3580u() || this.f32009B.mo3580u() || this.f32008A.mo3580u() || this.f29819D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29821F = 32L;
        }
        this.f32012y.mo3579w();
        this.f32009B.mo3579w();
        this.f32008A.mo3579w();
        this.f29819D.mo3579w();
        m37826E();
    }

    private C11668a1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (LinearLayout) objArr[7], (TextView) objArr[8], (ConstraintLayout) objArr[0], (AbstractC11917nf) objArr[3], (MaterialButton) objArr[2], (AbstractC12025t8) objArr[5], (AbstractC12066v8) objArr[4]);
        this.f29821F = -1L;
        this.f32011x.setTag(null);
        m37821J(this.f32012y);
        this.f32013z.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[6];
        this.f29819D = abstractC12136z9;
        m37821J(abstractC12136z9);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f29820E = linearLayout;
        linearLayout.setTag(null);
        m37821J(this.f32008A);
        m37821J(this.f32009B);
        m37820L(view);
        mo3579w();
    }
}
