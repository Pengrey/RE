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
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedViewModel;

/* renamed from: wg.e1 */
/* loaded from: classes2.dex */
public class C11738e1 extends AbstractC11721d1 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30193D;

    /* renamed from: E */
    private static final SparseIntArray f30194E;

    /* renamed from: B */
    private final ConstraintLayout f30195B;

    /* renamed from: C */
    private long f30196C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f30193D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30194E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.tv_card_registration_success_title, 4);
        sparseIntArray.put(C2336R.C2338id.tv_card_registration_success_subtitle, 5);
        sparseIntArray.put(C2336R.C2338id.iv_card_registration_success, 6);
    }

    public C11738e1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30193D, f30194E));
    }

    /* renamed from: Q */
    private boolean m4396Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30196C |= 1;
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
        return m4396Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30062z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4395R((LoyaltyRemovedViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4395R(LoyaltyRemovedViewModel loyaltyRemovedViewModel) {
        this.f30059A = loyaltyRemovedViewModel;
        synchronized (this) {
            this.f30196C |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        synchronized (this) {
            j = this.f30196C;
            this.f30196C = 0L;
        }
        LoyaltyRemovedViewModel loyaltyRemovedViewModel = this.f30059A;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        if (i == 0 || loyaltyRemovedViewModel == null) {
            onClickListener = null;
        } else {
            onClickListener = loyaltyRemovedViewModel.m12701P();
            onClickListener2 = loyaltyRemovedViewModel.m12703N();
        }
        if (i != 0) {
            this.f30060x.setOnClickListener(onClickListener2);
            this.f30061y.setOnClickListener(onClickListener);
        }
        ViewDataBinding.m37808m(this.f30062z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30196C != 0) {
                return true;
            }
            return this.f30062z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30196C = 4L;
        }
        this.f30062z.mo3579w();
        m37826E();
    }

    private C11738e1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[2], (MaterialButton) objArr[1], (AbstractC11996rf) objArr[3], (ImageView) objArr[6], (TextView) objArr[5], (TextView) objArr[4]);
        this.f30196C = -1L;
        this.f30060x.setTag(null);
        this.f30061y.setTag(null);
        m37821J(this.f30062z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30195B = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
