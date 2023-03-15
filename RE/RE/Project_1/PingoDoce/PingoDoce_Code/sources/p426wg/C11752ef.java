package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.ef */
/* loaded from: classes2.dex */
public class C11752ef extends AbstractC11735df {

    /* renamed from: A */
    private static final SparseIntArray f30253A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30254z = null;

    /* renamed from: y */
    private long f30255y;

    public C11752ef(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30254z, f30253A));
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
            this.f30255y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30255y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30255y = 1L;
        }
        m37826E();
    }

    private C11752ef(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[0]);
        this.f30255y = -1L;
        this.f30157x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
