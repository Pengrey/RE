package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.i6 */
/* loaded from: classes2.dex */
public class C11815i6 extends AbstractC11797h6 {

    /* renamed from: A */
    private static final SparseIntArray f30565A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30566z = null;

    /* renamed from: x */
    private final ConstraintLayout f30567x;

    /* renamed from: y */
    private long f30568y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30565A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header, 1);
        sparseIntArray.put(C2336R.C2338id.v_term_divider, 2);
        sparseIntArray.put(C2336R.C2338id.tv_term_conditions, 3);
        sparseIntArray.put(C2336R.C2338id.btn_term_accept, 4);
        sparseIntArray.put(C2336R.C2338id.btn_term_cancel, 5);
    }

    public C11815i6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30566z, f30565A));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f30568y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30568y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30568y = 1L;
        }
        m37826E();
    }

    private C11815i6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[4], (MaterialButton) objArr[5], (TextView) objArr[1], (TextView) objArr[3], (View) objArr[2]);
        this.f30568y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30567x = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
