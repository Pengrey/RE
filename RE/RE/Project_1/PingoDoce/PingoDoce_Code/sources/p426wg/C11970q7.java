package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.q7 */
/* loaded from: classes2.dex */
public class C11970q7 extends AbstractC11948p7 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31303B = null;

    /* renamed from: C */
    private static final SparseIntArray f31304C;

    /* renamed from: A */
    private long f31305A;

    /* renamed from: z */
    private final ConstraintLayout f31306z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31304C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.coachmark_TextView, 1);
        sparseIntArray.put(C2336R.C2338id.coachmark_MaterialButton, 2);
    }

    public C11970q7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31303B, f31304C));
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
            this.f31305A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31305A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31305A = 1L;
        }
        m37826E();
    }

    private C11970q7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[2], (TextView) objArr[1]);
        this.f31305A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31306z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
