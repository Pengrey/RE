package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.q5 */
/* loaded from: classes2.dex */
public class C11968q5 extends AbstractC11946p5 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31292B = null;

    /* renamed from: C */
    private static final SparseIntArray f31293C;

    /* renamed from: A */
    private long f31294A;

    /* renamed from: z */
    private final ConstraintLayout f31295z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31293C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header, 1);
        sparseIntArray.put(C2336R.C2338id.v_term_divider, 2);
        sparseIntArray.put(C2336R.C2338id.tv_term_conditions, 3);
        sparseIntArray.put(C2336R.C2338id.btn_ok, 4);
        sparseIntArray.put(C2336R.C2338id.btn_cancel, 5);
    }

    public C11968q5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31292B, f31293C));
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
            this.f31294A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31294A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31294A = 1L;
        }
        m37826E();
    }

    private C11968q5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[5], (MaterialButton) objArr[4], (TextView) objArr[1], (TextView) objArr[3], (View) objArr[2]);
        this.f31294A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31295z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
