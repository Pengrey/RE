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
import p473yi.VirtualCardSuccessViewModel;

/* renamed from: wg.s4 */
/* loaded from: classes2.dex */
public class C12004s4 extends AbstractC11985r4 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f31442D;

    /* renamed from: E */
    private static final SparseIntArray f31443E;

    /* renamed from: B */
    private final ConstraintLayout f31444B;

    /* renamed from: C */
    private long f31445C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31442D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31443E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.tv_card_registration_success_title, 3);
        sparseIntArray.put(C2336R.C2338id.tv_card_registration_success_subtitle, 4);
        sparseIntArray.put(C2336R.C2338id.iv_card_registration_success, 5);
    }

    public C12004s4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31442D, f31443E));
    }

    /* renamed from: Q */
    private boolean m3792Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31445C |= 1;
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
        return m3792Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31367y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3791R((VirtualCardSuccessViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m3791R(VirtualCardSuccessViewModel virtualCardSuccessViewModel) {
        this.f31365A = virtualCardSuccessViewModel;
        synchronized (this) {
            this.f31445C |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31445C;
            this.f31445C = 0L;
        }
        VirtualCardSuccessViewModel virtualCardSuccessViewModel = this.f31365A;
        View.OnClickListener onClickListener = null;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0 && virtualCardSuccessViewModel != null) {
            onClickListener = virtualCardSuccessViewModel.m1346W();
        }
        if (i != 0) {
            this.f31366x.setOnClickListener(onClickListener);
        }
        ViewDataBinding.m37808m(this.f31367y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31445C != 0) {
                return true;
            }
            return this.f31367y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31445C = 4L;
        }
        this.f31367y.mo3579w();
        m37826E();
    }

    private C12004s4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[1], (AbstractC11996rf) objArr[2], (ImageView) objArr[5], (TextView) objArr[4], (TextView) objArr[3]);
        this.f31445C = -1L;
        this.f31366x.setTag(null);
        m37821J(this.f31367y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31444B = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
