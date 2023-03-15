package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.button.MaterialButton;
import p048cj.ProductDetailViewModel;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* renamed from: wg.a9 */
/* loaded from: classes2.dex */
public class C11676a9 extends AbstractC12135z8 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f29860K;

    /* renamed from: L */
    private static final SparseIntArray f29861L;

    /* renamed from: E */
    private final ConstraintLayout f29862E;

    /* renamed from: F */
    private final ImageView f29863F;

    /* renamed from: G */
    private final AbstractC11763f9 f29864G;

    /* renamed from: H */
    private final AbstractC11763f9 f29865H;

    /* renamed from: I */
    private final TextView f29866I;

    /* renamed from: J */
    private long f29867J;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(12);
        f29860K = c1263i;
        c1263i.m37795a(6, new String[]{"view_for_product_detail_price", "view_for_product_detail_price"}, new int[]{9, 10}, new int[]{C2336R.layout.view_for_product_detail_price, C2336R.layout.view_for_product_detail_price});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29861L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_guideline, 11);
    }

    public C11676a9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 12, f29860K, f29861L));
    }

    /* renamed from: R */
    private boolean m4479R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29867J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4478S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29867J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4477T(LiveData<CatalogProduct> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29867J |= 4;
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
                    return false;
                }
                return m4477T((LiveData) obj, i2);
            }
            return m4478S((LiveData) obj, i2);
        }
        return m4479R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29864G.mo3594K(interfaceC1491v);
        this.f29865H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo3571Q((ProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12135z8
    /* renamed from: Q */
    public void mo3571Q(ProductDetailViewModel productDetailViewModel) {
        this.f32052D = productDetailViewModel;
        synchronized (this) {
            this.f29867J |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11676a9.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29867J != 0) {
                return true;
            }
            return this.f29864G.mo3580u() || this.f29865H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29867J = 16L;
        }
        this.f29864G.mo3579w();
        this.f29865H.mo3579w();
        m37826E();
    }

    private C11676a9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (MaterialButton) objArr[5], (TextView) objArr[1], (Guideline) objArr[11], (ImageView) objArr[3], (TextView) objArr[4], (LinearLayout) objArr[6], (QuantityPickerView) objArr[7]);
        this.f29867J = -1L;
        this.f32053x.setTag(null);
        this.f32054y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29862E = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f29863F = imageView;
        imageView.setTag(null);
        AbstractC11763f9 abstractC11763f9 = (AbstractC11763f9) objArr[9];
        this.f29864G = abstractC11763f9;
        m37821J(abstractC11763f9);
        AbstractC11763f9 abstractC11763f92 = (AbstractC11763f9) objArr[10];
        this.f29865H = abstractC11763f92;
        m37821J(abstractC11763f92);
        TextView textView = (TextView) objArr[8];
        this.f29866I = textView;
        textView.setTag(null);
        this.f32055z.setTag(null);
        this.f32049A.setTag(null);
        this.f32050B.setTag(null);
        this.f32051C.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
