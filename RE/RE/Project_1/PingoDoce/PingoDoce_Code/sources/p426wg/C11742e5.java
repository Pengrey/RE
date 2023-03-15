package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.e5 */
/* loaded from: classes2.dex */
public class C11742e5 extends AbstractC11725d5 {

    /* renamed from: A */
    private static final SparseIntArray f30212A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30213z = null;

    /* renamed from: x */
    private final ConstraintLayout f30214x;

    /* renamed from: y */
    private long f30215y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30212A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header, 1);
        sparseIntArray.put(C2336R.C2338id.v_term_divider, 2);
        sparseIntArray.put(C2336R.C2338id.btn_term_accept, 3);
        sparseIntArray.put(C2336R.C2338id.btn_term_cancel, 4);
    }

    public C11742e5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30213z, f30212A));
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
            this.f30215y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30215y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30215y = 1L;
        }
        m37826E();
    }

    private C11742e5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[3], (MaterialButton) objArr[4], (TextView) objArr[1], (View) objArr[2]);
        this.f30215y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30214x = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
