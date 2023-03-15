package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.p */
/* loaded from: classes2.dex */
public class C11940p extends AbstractC11918o {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f31171D = null;

    /* renamed from: E */
    private static final SparseIntArray f31172E;

    /* renamed from: B */
    private final ConstraintLayout f31173B;

    /* renamed from: C */
    private long f31174C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31172E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.spinner, 1);
        sparseIntArray.put(C2336R.C2338id.fetchbutton, 2);
        sparseIntArray.put(C2336R.C2338id.clearbutton, 3);
        sparseIntArray.put(C2336R.C2338id.description, 4);
    }

    public C11940p(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31171D, f31172E));
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
            this.f31174C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31174C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31174C = 1L;
        }
        m37826E();
    }

    private C11940p(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[3], (TextView) objArr[4], (MaterialButton) objArr[2], (Spinner) objArr[1]);
        this.f31174C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31173B = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
