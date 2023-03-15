package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import ki.PingoDoceBindingAdapters;

/* renamed from: wg.ya */
/* loaded from: classes2.dex */
public class C12120ya extends AbstractC12102xa {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31978C;

    /* renamed from: D */
    private static final SparseIntArray f31979D;

    /* renamed from: A */
    private final ShimmerFrameLayout f31980A;

    /* renamed from: B */
    private long f31981B;

    /* renamed from: y */
    private final LinearLayout f31982y;

    /* renamed from: z */
    private final AbstractC11952pb f31983z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(3);
        f31978C = c1263i;
        c1263i.m37795a(0, new String[]{"view_placeholder_generic_for_list_small_item"}, new int[]{2}, new int[]{C2336R.layout.view_placeholder_generic_for_list_small_item});
        f31979D = null;
    }

    public C12120ya(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31978C, f31979D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31983z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            m3600Q(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m3600Q(boolean z) {
        this.f31884x = z;
        synchronized (this) {
            this.f31981B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31981B;
            this.f31981B = 0L;
        }
        boolean z = this.f31884x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f31982y, Boolean.valueOf(z), Boolean.TRUE);
            PingoDoceBindingAdapters.m20345b(this.f31980A, z);
        }
        ViewDataBinding.m37808m(this.f31983z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31981B != 0) {
                return true;
            }
            return this.f31983z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31981B = 2L;
        }
        this.f31983z.mo3579w();
        m37826E();
    }

    private C12120ya(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31981B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31982y = linearLayout;
        linearLayout.setTag(null);
        AbstractC11952pb abstractC11952pb = (AbstractC11952pb) objArr[2];
        this.f31983z = abstractC11952pb;
        m37821J(abstractC11952pb);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[1];
        this.f31980A = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
