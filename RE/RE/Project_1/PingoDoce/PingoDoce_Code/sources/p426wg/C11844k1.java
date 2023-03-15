package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import ki.NoConnectionViewModel;
import p067dh.AssociationsViewModel;

/* renamed from: wg.k1 */
/* loaded from: classes2.dex */
public class C11844k1 extends AbstractC11827j1 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30731D;

    /* renamed from: E */
    private static final SparseIntArray f30732E;

    /* renamed from: A */
    private final AbstractC12136z9 f30733A;

    /* renamed from: B */
    private final CoordinatorLayout f30734B;

    /* renamed from: C */
    private long f30735C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30731D = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{1}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30732E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 2);
        sparseIntArray.put(C2336R.C2338id.toolbar, 3);
        sparseIntArray.put(C2336R.C2338id.associations_TabLayout, 4);
        sparseIntArray.put(C2336R.C2338id.associations_ViewPager2, 5);
    }

    public C11844k1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30731D, f30732E));
    }

    /* renamed from: Q */
    private boolean m4135Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30735C |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4135Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30733A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4134R((AssociationsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4134R(AssociationsViewModel associationsViewModel) {
        this.f30624z = associationsViewModel;
        synchronized (this) {
            this.f30735C |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30735C;
            this.f30735C = 0L;
        }
        NoConnectionViewModel noConnectionViewModel = this.f30624z;
        int i = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        Boolean bool = null;
        if (i != 0) {
            LiveData m20387j = noConnectionViewModel != null ? noConnectionViewModel.m20387j() : null;
            m37818O(0, m20387j);
            if (m20387j != null) {
                bool = (Boolean) m20387j.mo172f();
            }
        }
        if (i != 0) {
            this.f30733A.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f30733A);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30735C != 0) {
                return true;
            }
            return this.f30733A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30735C = 4L;
        }
        this.f30733A.mo3579w();
        m37826E();
    }

    private C11844k1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (TabLayout) objArr[4], (ViewPager2) objArr[5], (AppBarLayout) objArr[2], (Toolbar) objArr[3]);
        this.f30735C = -1L;
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[1];
        this.f30733A = abstractC12136z9;
        m37821J(abstractC12136z9);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30734B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
