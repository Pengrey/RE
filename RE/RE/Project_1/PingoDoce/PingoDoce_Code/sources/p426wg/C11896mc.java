package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.mc */
/* loaded from: classes2.dex */
public class C11896mc extends AbstractC11875lc {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30969A = null;

    /* renamed from: B */
    private static final SparseIntArray f30970B;

    /* renamed from: y */
    private final ConstraintLayout f30971y;

    /* renamed from: z */
    private long f30972z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30970B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_category_name_MaterialButton, 1);
    }

    public C11896mc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30969A, f30970B));
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
            this.f30972z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30972z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30972z = 1L;
        }
        m37826E();
    }

    private C11896mc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[1]);
        this.f30972z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30971y = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
