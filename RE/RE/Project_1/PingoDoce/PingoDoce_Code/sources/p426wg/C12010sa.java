package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.sa */
/* loaded from: classes2.dex */
public class C12010sa extends AbstractC11991ra {

    /* renamed from: A */
    private static final SparseIntArray f31469A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31470z = null;

    /* renamed from: x */
    private final FrameLayout f31471x;

    /* renamed from: y */
    private long f31472y;

    public C12010sa(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f31470z, f31469A));
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
            this.f31472y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31472y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31472y = 1L;
        }
        m37826E();
    }

    private C12010sa(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31472y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31471x = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
