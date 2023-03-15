package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: wg.gb */
/* loaded from: classes2.dex */
public class C11785gb extends AbstractC11765fb {

    /* renamed from: A */
    private static final SparseIntArray f30414A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30415z = null;

    /* renamed from: x */
    private final ShimmerFrameLayout f30416x;

    /* renamed from: y */
    private long f30417y;

    public C11785gb(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30415z, f30414A));
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
            this.f30417y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30417y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30417y = 1L;
        }
        m37826E();
    }

    private C11785gb(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30417y = -1L;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[0];
        this.f30416x = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
