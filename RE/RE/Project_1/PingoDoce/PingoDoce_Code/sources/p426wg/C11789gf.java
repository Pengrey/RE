package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.gf */
/* loaded from: classes2.dex */
public class C11789gf extends AbstractC11769ff {

    /* renamed from: A */
    private static final SparseIntArray f30431A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30432z = null;

    /* renamed from: y */
    private long f30433y;

    public C11789gf(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30432z, f30431A));
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
            this.f30433y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30433y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30433y = 1L;
        }
        m37826E();
    }

    private C11789gf(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[0]);
        this.f30433y = -1L;
        this.f30345x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
