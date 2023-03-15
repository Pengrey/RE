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

/* renamed from: wg.u9 */
/* loaded from: classes2.dex */
public class C12050u9 extends AbstractC12026t9 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f31659A = null;

    /* renamed from: B */
    private static final SparseIntArray f31660B;

    /* renamed from: y */
    private final LinearLayout f31661y;

    /* renamed from: z */
    private long f31662z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31660B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 1);
        sparseIntArray.put(C2336R.C2338id.card2, 2);
    }

    public C12050u9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31659A, f31660B));
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
            mo3716Q((Boolean) obj);
        } else if (67 != i) {
            return false;
        } else {
            m3715R((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12026t9
    /* renamed from: Q */
    public void mo3716Q(Boolean bool) {
        this.f31536x = bool;
        synchronized (this) {
            this.f31662z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    /* renamed from: R */
    public void m3715R(View.OnClickListener onClickListener) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31662z;
            this.f31662z = 0L;
        }
        Boolean bool = this.f31536x;
        if ((j & 5) != 0) {
            BindingAdapters.m41779l(this.f31661y, bool, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31662z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31662z = 4L;
        }
        m37826E();
    }

    private C12050u9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[2], (TextView) objArr[1]);
        this.f31662z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31661y = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
