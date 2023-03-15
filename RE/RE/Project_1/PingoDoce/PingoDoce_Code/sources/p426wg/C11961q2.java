package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p048cj.ProductDetailViewModel;

/* renamed from: wg.q2 */
/* loaded from: classes2.dex */
public class C11961q2 extends AbstractC11943p2 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31265E;

    /* renamed from: F */
    private static final SparseIntArray f31266F;

    /* renamed from: B */
    private final CoordinatorLayout f31267B;

    /* renamed from: C */
    private final ConstraintLayout f31268C;

    /* renamed from: D */
    private long f31269D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f31265E = c1263i;
        c1263i.m37795a(1, new String[]{"view_for_product_detail_core"}, new int[]{3}, new int[]{C2336R.layout.view_for_product_detail_core});
        c1263i.m37795a(2, new String[]{"view_for_product_detail_description"}, new int[]{4}, new int[]{C2336R.layout.view_for_product_detail_description});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31266F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header_AppBarLayout, 5);
        sparseIntArray.put(C2336R.C2338id.toolbar, 6);
    }

    public C11961q2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31265E, f31266F));
    }

    /* renamed from: Q */
    private boolean m3874Q(AbstractC11694b9 abstractC11694b9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31269D |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3873R(AbstractC12135z8 abstractC12135z8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31269D |= 1;
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
                return false;
            }
            return m3874Q((AbstractC11694b9) obj, i2);
        }
        return m3873R((AbstractC12135z8) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31194z.mo3594K(interfaceC1491v);
        this.f31193y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3872S((ProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3872S(ProductDetailViewModel productDetailViewModel) {
        this.f31191A = productDetailViewModel;
        synchronized (this) {
            this.f31269D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31269D;
            this.f31269D = 0L;
        }
        ProductDetailViewModel productDetailViewModel = this.f31191A;
        if ((j & 12) != 0) {
            this.f31193y.mo4426Q(productDetailViewModel);
            this.f31194z.mo3571Q(productDetailViewModel);
        }
        ViewDataBinding.m37808m(this.f31194z);
        ViewDataBinding.m37808m(this.f31193y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31269D != 0) {
                return true;
            }
            return this.f31194z.mo3580u() || this.f31193y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31269D = 8L;
        }
        this.f31194z.mo3579w();
        this.f31193y.mo3579w();
        m37826E();
    }

    private C11961q2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (AppBarLayout) objArr[5], (CollapsingToolbarLayout) objArr[1], (AbstractC11694b9) objArr[4], (AbstractC12135z8) objArr[3], (Toolbar) objArr[6]);
        this.f31269D = -1L;
        this.f31192x.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31267B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.f31268C = constraintLayout;
        constraintLayout.setTag(null);
        m37821J(this.f31193y);
        m37821J(this.f31194z);
        m37820L(view);
        mo3579w();
    }
}
