package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: wg.cb */
/* loaded from: classes2.dex */
public class C11714cb extends AbstractC11696bb {

    /* renamed from: A */
    private static final SparseIntArray f30023A = null;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f30024z = null;

    /* renamed from: x */
    private final ShimmerFrameLayout f30025x;

    /* renamed from: y */
    private long f30026y;

    public C11714cb(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f30024z, f30023A));
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
            this.f30026y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30026y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30026y = 1L;
        }
        m37826E();
    }

    private C11714cb(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30026y = -1L;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[0];
        this.f30025x = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
