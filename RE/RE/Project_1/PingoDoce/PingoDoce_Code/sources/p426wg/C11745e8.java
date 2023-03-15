package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.e8 */
/* loaded from: classes2.dex */
public class C11745e8 extends AbstractC11728d8 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30223A = null;

    /* renamed from: B */
    private static final SparseIntArray f30224B;

    /* renamed from: y */
    private final LinearLayout f30225y;

    /* renamed from: z */
    private long f30226z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30224B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 1);
        sparseIntArray.put(C2336R.C2338id.card2, 2);
    }

    public C11745e8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30223A, f30224B));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo4368Q((Boolean) obj);
        } else if (67 != i) {
            return false;
        } else {
            m4367R((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11728d8
    /* renamed from: Q */
    public void mo4368Q(Boolean bool) {
        this.f30100x = bool;
        synchronized (this) {
            this.f30226z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4367R(View.OnClickListener onClickListener) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30226z;
            this.f30226z = 0L;
        }
        Boolean bool = this.f30100x;
        if ((j & 5) != 0) {
            BindingAdapters.m41779l(this.f30225y, bool, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30226z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30226z = 4L;
        }
        m37826E();
    }

    private C11745e8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[2], (TextView) objArr[1]);
        this.f30226z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30225y = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
