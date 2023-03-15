package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.ma */
/* loaded from: classes2.dex */
public class C11894ma extends AbstractC11873la {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30961A = null;

    /* renamed from: B */
    private static final SparseIntArray f30962B = null;

    /* renamed from: y */
    private final View f30963y;

    /* renamed from: z */
    private long f30964z;

    public C11894ma(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30961A, f30962B));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo3997Q(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11873la
    /* renamed from: Q */
    public void mo3997Q(boolean z) {
        this.f30882x = z;
        synchronized (this) {
            this.f30964z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30964z;
            this.f30964z = 0L;
        }
        boolean z = this.f30882x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f30963y, Boolean.valueOf(z), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30964z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30964z = 2L;
        }
        m37826E();
    }

    private C11894ma(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30964z = -1L;
        View view2 = (View) objArr[0];
        this.f30963y = view2;
        view2.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
