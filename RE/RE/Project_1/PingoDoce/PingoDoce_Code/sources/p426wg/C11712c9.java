package p426wg;

import ae.BindingAdapters;
import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p048cj.ProductDetailViewModel;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* renamed from: wg.c9 */
/* loaded from: classes2.dex */
public class C11712c9 extends AbstractC11694b9 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f30013E;

    /* renamed from: F */
    private static final SparseIntArray f30014F;

    /* renamed from: A */
    private final ConstraintLayout f30015A;

    /* renamed from: B */
    private final AbstractC11695ba f30016B;

    /* renamed from: C */
    private final AbstractC12100x8 f30017C;

    /* renamed from: D */
    private long f30018D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f30013E = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_product_detail_description_item", "view_loading_small", "view_for_no_connection"}, new int[]{2, 3, 4}, new int[]{C2336R.layout.view_for_product_detail_description_item, C2336R.layout.view_loading_small, C2336R.layout.view_for_no_connection});
        f30014F = null;
    }

    public C11712c9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30013E, f30014F));
    }

    /* renamed from: R */
    private boolean m4425R(AbstractC11729d9 abstractC11729d9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30018D |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4424S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30018D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4423T(LiveData<CatalogProduct> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30018D |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4422U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30018D |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4421V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30018D |= 2;
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
                        if (i != 4) {
                            return false;
                        }
                        return m4425R((AbstractC11729d9) obj, i2);
                    }
                    return m4423T((LiveData) obj, i2);
                }
                return m4422U((LiveData) obj, i2);
            }
            return m4421V((LiveData) obj, i2);
        }
        return m4424S((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29950x.mo3594K(interfaceC1491v);
        this.f30016B.mo3594K(interfaceC1491v);
        this.f30017C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo4426Q((ProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11694b9
    /* renamed from: Q */
    public void mo4426Q(ProductDetailViewModel productDetailViewModel) {
        this.f29952z = productDetailViewModel;
        synchronized (this) {
            this.f30018D |= 32;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        Spanned spanned;
        Boolean bool;
        View.OnClickListener onClickListener;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        synchronized (this) {
            j = this.f30018D;
            this.f30018D = 0L;
        }
        ProductDetailViewModel productDetailViewModel = this.f29952z;
        if ((111 & j) != 0) {
            if ((j & 97) != 0) {
                LiveData m20387j = productDetailViewModel != null ? productDetailViewModel.m20387j() : null;
                m37818O(0, m20387j);
                z = ViewDataBinding.m37823H(m20387j != null ? (Boolean) m20387j.mo172f() : null);
            } else {
                z = false;
            }
            if ((j & 98) != 0) {
                LiveData m34552q0 = productDetailViewModel != null ? productDetailViewModel.m34552q0() : null;
                m37818O(1, m34552q0);
                bool = m34552q0 != null ? (Boolean) m34552q0.mo172f() : null;
                z3 = !ViewDataBinding.m37823H(bool);
            } else {
                bool = null;
                z3 = false;
            }
            if ((j & 100) != 0) {
                LiveData m34553p0 = productDetailViewModel != null ? productDetailViewModel.m34553p0() : null;
                m37818O(2, m34553p0);
                z4 = ViewDataBinding.m37823H(m34553p0 != null ? (Boolean) m34553p0.mo172f() : null);
                j2 = 96;
            } else {
                j2 = 96;
                z4 = false;
            }
            onClickListener = ((j & j2) == 0 || productDetailViewModel == null) ? null : productDetailViewModel.m20349P();
            if ((j & 104) != 0) {
                LiveData m34554o0 = productDetailViewModel != null ? productDetailViewModel.m34554o0() : null;
                m37818O(3, m34554o0);
                CatalogProduct catalogProduct = m34554o0 != null ? (CatalogProduct) m34554o0.mo172f() : null;
                if (catalogProduct != null) {
                    spanned = catalogProduct.m14507k();
                    z2 = z4;
                }
            }
            spanned = null;
            z2 = z4;
        } else {
            spanned = null;
            bool = null;
            onClickListener = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if ((j & 104) != 0) {
            this.f29950x.mo4366Q(spanned);
        }
        if ((98 & j) != 0) {
            this.f29950x.mo4365R(bool);
            BindingAdapters.m41779l(this.f29951y, Boolean.valueOf(z3), null);
        }
        if ((97 & j) != 0) {
            this.f30016B.mo4419R(z);
        }
        if ((96 & j) != 0) {
            this.f30017C.mo3603Q(onClickListener);
        }
        if ((j & 100) != 0) {
            this.f30017C.mo3602R(z2);
        }
        ViewDataBinding.m37808m(this.f29950x);
        ViewDataBinding.m37808m(this.f30016B);
        ViewDataBinding.m37808m(this.f30017C);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30018D != 0) {
                return true;
            }
            return this.f29950x.mo3580u() || this.f30016B.mo3580u() || this.f30017C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30018D = 64L;
        }
        this.f29950x.mo3579w();
        this.f30016B.mo3579w();
        this.f30017C.mo3579w();
        m37826E();
    }

    private C11712c9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 5, (AbstractC11729d9) objArr[2], (PlaceHolderRecyclerView) objArr[1]);
        this.f30018D = -1L;
        m37821J(this.f29950x);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30015A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[3];
        this.f30016B = abstractC11695ba;
        m37821J(abstractC11695ba);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[4];
        this.f30017C = abstractC12100x8;
        m37821J(abstractC12100x8);
        this.f29951y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
