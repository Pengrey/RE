package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: wg.of */
/* loaded from: classes2.dex */
public class C11939of extends AbstractC11917nf {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f31167A = null;

    /* renamed from: B */
    private static final SparseIntArray f31168B;

    /* renamed from: y */
    private final AppBarLayout f31169y;

    /* renamed from: z */
    private long f31170z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31168B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.toolbar, 1);
    }

    public C11939of(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31167A, f31168B));
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
            this.f31170z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31170z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31170z = 1L;
        }
        m37826E();
    }

    private C11939of(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (Toolbar) objArr[1]);
        this.f31170z = -1L;
        AppBarLayout appBarLayout = (AppBarLayout) objArr[0];
        this.f31169y = appBarLayout;
        appBarLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
