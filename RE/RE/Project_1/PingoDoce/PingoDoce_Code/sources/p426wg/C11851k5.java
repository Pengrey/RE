package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.k5 */
/* loaded from: classes2.dex */
public class C11851k5 extends AbstractC11831j5 {

    /* renamed from: A */
    private static final SparseIntArray f30765A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30766z = null;

    /* renamed from: x */
    private final LinearLayout f30767x;

    /* renamed from: y */
    private long f30768y;

    public C11851k5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30766z, f30765A));
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
            this.f30768y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30768y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30768y = 1L;
        }
        m37826E();
    }

    private C11851k5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30768y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30767x = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
