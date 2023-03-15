package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.ca */
/* loaded from: classes2.dex */
public class C11713ca extends AbstractC11695ba {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30019B = null;

    /* renamed from: C */
    private static final SparseIntArray f30020C = null;

    /* renamed from: A */
    private long f30021A;

    /* renamed from: z */
    private final ProgressBar f30022z;

    public C11713ca(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30019B, f30020C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (46 == i) {
            mo4420Q(((Boolean) obj).booleanValue());
        } else if (110 != i) {
            return false;
        } else {
            mo4419R(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p426wg.AbstractC11695ba
    /* renamed from: Q */
    public void mo4420Q(boolean z) {
        this.f29954y = z;
        synchronized (this) {
            this.f30021A |= 1;
        }
        m37781c(46);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11695ba
    /* renamed from: R */
    public void mo4419R(boolean z) {
        this.f29953x = z;
        synchronized (this) {
            this.f30021A |= 2;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30021A;
            this.f30021A = 0L;
        }
        boolean z = this.f29954y;
        boolean z2 = this.f29953x;
        if ((j & 7) != 0) {
            BindingAdapters.m41779l(this.f30022z, Boolean.valueOf(z2), Boolean.valueOf(z));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30021A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30021A = 4L;
        }
        m37826E();
    }

    private C11713ca(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30021A = -1L;
        ProgressBar progressBar = (ProgressBar) objArr[0];
        this.f30022z = progressBar;
        progressBar.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
