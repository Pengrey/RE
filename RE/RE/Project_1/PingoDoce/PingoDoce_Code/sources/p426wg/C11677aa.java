package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.aa */
/* loaded from: classes2.dex */
public class C11677aa extends AbstractC12136z9 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f29868A = null;

    /* renamed from: B */
    private static final SparseIntArray f29869B = null;

    /* renamed from: y */
    private final ConstraintLayout f29870y;

    /* renamed from: z */
    private long f29871z;

    public C11677aa(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f29868A, f29869B));
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
            mo3570Q((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12136z9
    /* renamed from: Q */
    public void mo3570Q(Boolean bool) {
        this.f32056x = bool;
        synchronized (this) {
            this.f29871z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f29871z;
            this.f29871z = 0L;
        }
        Boolean bool = this.f32056x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f29870y, bool, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29871z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29871z = 2L;
        }
        m37826E();
    }

    private C11677aa(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f29871z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29870y = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
