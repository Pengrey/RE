package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.e7 */
/* loaded from: classes2.dex */
public class C11744e7 extends AbstractC11727d7 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30220B = null;

    /* renamed from: C */
    private static final SparseIntArray f30221C;

    /* renamed from: A */
    private long f30222A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30221C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_icon, 1);
        sparseIntArray.put(C2336R.C2338id.const_rating_title, 2);
        sparseIntArray.put(C2336R.C2338id.const_rating_message, 3);
        sparseIntArray.put(C2336R.C2338id.cancel_MaterialButton, 4);
        sparseIntArray.put(C2336R.C2338id.ok_MaterialButton, 5);
    }

    public C11744e7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30220B, f30221C));
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
            this.f30222A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30222A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30222A = 1L;
        }
        m37826E();
    }

    private C11744e7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[4], (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (ConstraintLayout) objArr[0], (MaterialButton) objArr[5]);
        this.f30222A = -1L;
        this.f30098y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
