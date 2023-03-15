package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import dj.ProductListViewModel;
import ki.PingoDoceBindingAdapters;
import p111g.C5586a;
import p241mi.BottomNavigationViewModel;

/* renamed from: wg.s2 */
/* loaded from: classes2.dex */
public class C12002s2 extends AbstractC11983r2 {

    /* renamed from: M */
    private static final ViewDataBinding.C1263i f31429M;

    /* renamed from: N */
    private static final SparseIntArray f31430N;

    /* renamed from: F */
    private final CoordinatorLayout f31431F;

    /* renamed from: G */
    private final ConstraintLayout f31432G;

    /* renamed from: H */
    private final AbstractC11913nb f31433H;

    /* renamed from: I */
    private final AbstractC12100x8 f31434I;

    /* renamed from: J */
    private final AbstractC11799h8 f31435J;

    /* renamed from: K */
    private final ShimmerFrameLayout f31436K;

    /* renamed from: L */
    private long f31437L;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(16);
        f31429M = c1263i;
        c1263i.m37795a(1, new String[]{"view_placeholder_generic_for_grid", "view_for_no_connection", "view_bottom_menu", "view_for_empty"}, new int[]{5, 6, 7, 8}, new int[]{C2336R.layout.view_placeholder_generic_for_grid, C2336R.layout.view_for_no_connection, C2336R.layout.view_bottom_menu, C2336R.layout.view_for_empty});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31430N = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 9);
        sparseIntArray.put(C2336R.C2338id.toolbar, 10);
        sparseIntArray.put(C2336R.C2338id.const_subtitle, 11);
        sparseIntArray.put(C2336R.C2338id.category_TabLayout, 12);
        sparseIntArray.put(C2336R.C2338id.const_chip1, 13);
        sparseIntArray.put(C2336R.C2338id.const_chip3, 14);
        sparseIntArray.put(C2336R.C2338id.product_ViewPager2, 15);
    }

    public C12002s2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f31429M, f31430N));
    }

    /* renamed from: S */
    private boolean m3798S(AbstractC11761f7 abstractC11761f7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31437L |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3797T(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31437L |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3796U(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31437L |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3795V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31437L |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return m3795V((C1436e0) obj, i2);
                }
                return m3798S((AbstractC11761f7) obj, i2);
            }
            return m3797T((C1436e0) obj, i2);
        }
        return m3796U((C1436e0) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31433H.mo3594K(interfaceC1491v);
        this.f31434I.mo3594K(interfaceC1491v);
        this.f31361x.mo3594K(interfaceC1491v);
        this.f31435J.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (44 == i) {
            mo3800Q((Boolean) obj);
        } else if (74 == i) {
            mo3799R((BottomNavigationViewModel) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3794W((ProductListViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11983r2
    /* renamed from: Q */
    public void mo3800Q(Boolean bool) {
        this.f31358C = bool;
        synchronized (this) {
            this.f31437L |= 16;
        }
        m37781c(44);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11983r2
    /* renamed from: R */
    public void mo3799R(BottomNavigationViewModel bottomNavigationViewModel) {
        this.f31360E = bottomNavigationViewModel;
        synchronized (this) {
            this.f31437L |= 32;
        }
        m37781c(74);
        super.m37826E();
    }

    /* renamed from: W */
    public void m3794W(ProductListViewModel productListViewModel) {
        this.f31359D = productListViewModel;
        synchronized (this) {
            this.f31437L |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        Boolean bool;
        View.OnClickListener onClickListener;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        long j2;
        float f2;
        boolean z4;
        long j3;
        synchronized (this) {
            j = this.f31437L;
            this.f31437L = 0L;
        }
        Boolean bool2 = this.f31358C;
        BottomNavigationViewModel bottomNavigationViewModel = this.f31360E;
        ProductListViewModel productListViewModel = this.f31359D;
        if ((203 & j) != 0) {
            if ((j & 193) != 0) {
                C1436e0 m20352M = productListViewModel != null ? productListViewModel.m20352M() : null;
                m37818O(0, m20352M);
                z3 = ViewDataBinding.m37823H(m20352M != null ? (Boolean) m20352M.mo172f() : null);
            } else {
                z3 = false;
            }
            View.OnClickListener m20349P = ((j & 192) == 0 || productListViewModel == null) ? null : productListViewModel.m20349P();
            int i = ((j & 194) > 0L ? 1 : ((j & 194) == 0L ? 0 : -1));
            if (i != 0) {
                C1436e0 m26375l0 = productListViewModel != null ? productListViewModel.m26375l0() : null;
                m37818O(1, m26375l0);
                boolean m37823H = ViewDataBinding.m37823H(m26375l0 != null ? (Boolean) m26375l0.mo172f() : null);
                if (i != 0) {
                    j |= m37823H ? 512L : 256L;
                }
                j3 = 200;
                long j4 = j;
                z4 = m37823H;
                f2 = m37823H ? 0.93f : 1.0f;
                j2 = j4;
            } else {
                j2 = j;
                f2 = 0.0f;
                z4 = false;
                j3 = 200;
            }
            if ((j2 & j3) != 0) {
                C1436e0 m26374m0 = productListViewModel != null ? productListViewModel.m26374m0() : null;
                m37818O(3, m26374m0);
                Boolean bool3 = m26374m0 != null ? (Boolean) m26374m0.mo172f() : null;
                z2 = ViewDataBinding.m37823H(bool3);
                f = f2;
                z = z4;
                View.OnClickListener onClickListener2 = m20349P;
                bool = bool3;
                j = j2;
                onClickListener = onClickListener2;
            } else {
                f = f2;
                z = z4;
                j = j2;
                z2 = false;
                onClickListener = m20349P;
                bool = null;
            }
        } else {
            bool = null;
            onClickListener = null;
            z = false;
            z2 = false;
            z3 = false;
            f = 0.0f;
        }
        if ((j & 160) != 0) {
            this.f31361x.mo4259Q(bottomNavigationViewModel);
        }
        if ((j & 194) != 0) {
            this.f31361x.mo4258R(z);
            BindingAdapters.m41787d(this.f31356A, Float.valueOf(f), null, null);
        }
        if ((200 & j) != 0) {
            BindingAdapters.m41779l(this.f31362y, bool, null);
            this.f31433H.mo3920Q(z2);
            PingoDoceBindingAdapters.m20345b(this.f31436K, z2);
        }
        if ((192 & j) != 0) {
            this.f31434I.mo3603Q(onClickListener);
        }
        if ((j & 193) != 0) {
            this.f31434I.mo3602R(z3);
        }
        if ((128 & j) != 0) {
            this.f31435J.mo4193R(m37802s().getResources().getString(C2336R.string.lbl_empty_promotion_list));
            this.f31435J.mo4192S(C5586a.m23699b(m37802s().getContext(), C2336R.C2337drawable.ic_placeholder_product));
            this.f31435J.mo4191T(m37802s().getResources().getString(C2336R.string.lbl_empty_promotion_list_title));
        }
        if ((j & 144) != 0) {
            this.f31435J.mo4189V(bool2);
        }
        ViewDataBinding.m37808m(this.f31433H);
        ViewDataBinding.m37808m(this.f31434I);
        ViewDataBinding.m37808m(this.f31361x);
        ViewDataBinding.m37808m(this.f31435J);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31437L != 0) {
                return true;
            }
            return this.f31433H.mo3580u() || this.f31434I.mo3580u() || this.f31361x.mo3580u() || this.f31435J.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31437L = 128L;
        }
        this.f31433H.mo3579w();
        this.f31434I.mo3579w();
        this.f31361x.mo3579w();
        this.f31435J.mo3579w();
        m37826E();
    }

    private C12002s2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (AbstractC11761f7) objArr[7], (FrameLayout) objArr[3], (TabLayout) objArr[12], (MaterialCardView) objArr[13], (MaterialCardView) objArr[14], (Guideline) objArr[2], (TextView) objArr[11], (AppBarLayout) objArr[9], (ViewPager2) objArr[15], (Toolbar) objArr[10]);
        this.f31437L = -1L;
        m37821J(this.f31361x);
        this.f31362y.setTag(null);
        this.f31356A.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31431F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31432G = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11913nb abstractC11913nb = (AbstractC11913nb) objArr[5];
        this.f31433H = abstractC11913nb;
        m37821J(abstractC11913nb);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[6];
        this.f31434I = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[8];
        this.f31435J = abstractC11799h8;
        m37821J(abstractC11799h8);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[4];
        this.f31436K = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
