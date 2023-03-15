package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* renamed from: wg.gd */
/* loaded from: classes2.dex */
public class C11787gd extends AbstractC11767fd {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30422D;

    /* renamed from: E */
    private static final SparseIntArray f30423E;

    /* renamed from: B */
    private final FrameLayout f30424B;

    /* renamed from: C */
    private long f30425C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(2);
        f30422D = c1263i;
        c1263i.m37795a(0, new String[]{"view_row_for_product_item_big"}, new int[]{1}, new int[]{C2336R.layout.view_row_for_product_item_big});
        f30423E = null;
    }

    public C11787gd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30422D, f30423E));
    }

    /* renamed from: V */
    private boolean m4240V(AbstractC11733dd abstractC11733dd, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30425C |= 1;
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
        return m4240V((AbstractC11733dd) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30340x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (79 == i) {
            mo4242T((CatalogProduct) obj);
        } else if (80 == i) {
            mo4241U((Promotion) obj);
        } else if (77 != i) {
            return false;
        } else {
            mo4243S((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11767fd
    /* renamed from: S */
    public void mo4243S(String str) {
        this.f30339A = str;
        synchronized (this) {
            this.f30425C |= 8;
        }
        m37781c(77);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11767fd
    /* renamed from: T */
    public void mo4242T(CatalogProduct catalogProduct) {
        this.f30341y = catalogProduct;
        synchronized (this) {
            this.f30425C |= 2;
        }
        m37781c(79);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11767fd
    /* renamed from: U */
    public void mo4241U(Promotion promotion) {
        this.f30342z = promotion;
        synchronized (this) {
            this.f30425C |= 4;
        }
        m37781c(80);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30425C;
            this.f30425C = 0L;
        }
        CatalogProduct catalogProduct = this.f30341y;
        Promotion promotion = this.f30342z;
        String str = this.f30339A;
        int i = ((18 & j) > 0L ? 1 : ((18 & j) == 0L ? 0 : -1));
        int i2 = ((20 & j) > 0L ? 1 : ((20 & j) == 0L ? 0 : -1));
        int i3 = ((j & 24) > 0L ? 1 : ((j & 24) == 0L ? 0 : -1));
        if (i != 0) {
            this.f30340x.mo4357T(catalogProduct);
        }
        if (i2 != 0) {
            this.f30340x.mo4356U(promotion);
        }
        if (i3 != 0) {
            this.f30340x.mo4358S(str);
        }
        ViewDataBinding.m37808m(this.f30340x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30425C != 0) {
                return true;
            }
            return this.f30340x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30425C = 16L;
        }
        this.f30340x.mo3579w();
        m37826E();
    }

    private C11787gd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (AbstractC11733dd) objArr[1]);
        this.f30425C = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f30424B = frameLayout;
        frameLayout.setTag(null);
        m37821J(this.f30340x);
        m37820L(view);
        mo3579w();
    }
}
