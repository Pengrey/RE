package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wg.u3 */
/* loaded from: classes2.dex */
public class C12044u3 extends AbstractC12020t3 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31630C = null;

    /* renamed from: D */
    private static final SparseIntArray f31631D;

    /* renamed from: A */
    private final CoordinatorLayout f31632A;

    /* renamed from: B */
    private long f31633B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31631D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 1);
        sparseIntArray.put(C2336R.C2338id.toolbar, 2);
        sparseIntArray.put(C2336R.C2338id.store_TabLayout, 3);
        sparseIntArray.put(C2336R.C2338id.store_ViewPager2, 4);
    }

    public C12044u3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31630C, f31631D));
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
            this.f31633B = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31633B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31633B = 1L;
        }
        m37826E();
    }

    private C12044u3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (AppBarLayout) objArr[1], (TabLayout) objArr[3], (ViewPager2) objArr[4], (Toolbar) objArr[2]);
        this.f31633B = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31632A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
