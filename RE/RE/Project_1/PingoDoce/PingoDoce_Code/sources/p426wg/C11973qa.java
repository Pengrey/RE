package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.qa */
/* loaded from: classes2.dex */
public class C11973qa extends AbstractC11951pa {

    /* renamed from: A */
    private static final SparseIntArray f31315A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31316z = null;

    /* renamed from: x */
    private final FrameLayout f31317x;

    /* renamed from: y */
    private long f31318y;

    public C11973qa(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f31316z, f31315A));
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
            this.f31318y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31318y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31318y = 1L;
        }
        m37826E();
    }

    private C11973qa(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31318y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31317x = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
