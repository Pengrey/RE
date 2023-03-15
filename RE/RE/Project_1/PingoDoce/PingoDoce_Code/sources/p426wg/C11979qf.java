package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: wg.qf */
/* loaded from: classes2.dex */
public class C11979qf extends AbstractC11956pf {

    /* renamed from: A */
    private static final SparseIntArray f31336A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31337z = null;

    /* renamed from: x */
    private final AppBarLayout f31338x;

    /* renamed from: y */
    private long f31339y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31336A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.toolbar, 1);
    }

    public C11979qf(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31337z, f31336A));
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
            this.f31339y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31339y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31339y = 1L;
        }
        m37826E();
    }

    private C11979qf(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (Toolbar) objArr[1]);
        this.f31339y = -1L;
        AppBarLayout appBarLayout = (AppBarLayout) objArr[0];
        this.f31338x = appBarLayout;
        appBarLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
