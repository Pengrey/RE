package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.s5 */
/* loaded from: classes2.dex */
public class C12005s5 extends AbstractC11986r5 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31446C = null;

    /* renamed from: D */
    private static final SparseIntArray f31447D;

    /* renamed from: A */
    private final ConstraintLayout f31448A;

    /* renamed from: B */
    private long f31449B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31447D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.title_TextView, 1);
        sparseIntArray.put(C2336R.C2338id.const_divider, 2);
        sparseIntArray.put(C2336R.C2338id.disclaimer_TextView, 3);
        sparseIntArray.put(C2336R.C2338id.ok_MaterialButton, 4);
    }

    public C12005s5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31446C, f31447D));
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
            this.f31449B = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31449B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31449B = 1L;
        }
        m37826E();
    }

    private C12005s5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (View) objArr[2], (TextView) objArr[3], (MaterialButton) objArr[4], (TextView) objArr[1]);
        this.f31449B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31448A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
