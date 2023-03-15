package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.o5 */
/* loaded from: classes2.dex */
public class C11929o5 extends AbstractC11907n5 {

    /* renamed from: A */
    private static final SparseIntArray f31122A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31123z = null;

    /* renamed from: x */
    private final LinearLayout f31124x;

    /* renamed from: y */
    private long f31125y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31122A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.btn_biometric_negative, 1);
        sparseIntArray.put(C2336R.C2338id.btn_biometric_positive, 2);
    }

    public C11929o5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31123z, f31122A));
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
            this.f31125y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31125y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31125y = 1L;
        }
        m37826E();
    }

    private C11929o5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[1], (MaterialButton) objArr[2]);
        this.f31125y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31124x = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
