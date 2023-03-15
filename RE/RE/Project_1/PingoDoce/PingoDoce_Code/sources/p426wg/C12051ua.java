package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import ki.PingoDoceBindingAdapters;

/* renamed from: wg.ua */
/* loaded from: classes2.dex */
public class C12051ua extends AbstractC12027ta {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31663C;

    /* renamed from: D */
    private static final SparseIntArray f31664D;

    /* renamed from: A */
    private final ShimmerFrameLayout f31665A;

    /* renamed from: B */
    private long f31666B;

    /* renamed from: y */
    private final FrameLayout f31667y;

    /* renamed from: z */
    private final AbstractC11992rb f31668z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(3);
        f31663C = c1263i;
        c1263i.m37795a(0, new String[]{"view_placeholder_generic_for_viewpager"}, new int[]{2}, new int[]{C2336R.layout.view_placeholder_generic_for_viewpager});
        f31664D = null;
    }

    public C12051ua(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31663C, f31664D));
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
        this.f31668z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo3714Q(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12027ta
    /* renamed from: Q */
    public void mo3714Q(boolean z) {
        this.f31537x = z;
        synchronized (this) {
            this.f31666B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31666B;
            this.f31666B = 0L;
        }
        boolean z = this.f31537x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f31667y, Boolean.valueOf(z), Boolean.TRUE);
            PingoDoceBindingAdapters.m20345b(this.f31665A, z);
        }
        ViewDataBinding.m37808m(this.f31668z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31666B != 0) {
                return true;
            }
            return this.f31668z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31666B = 2L;
        }
        this.f31668z.mo3579w();
        m37826E();
    }

    private C12051ua(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31666B = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31667y = frameLayout;
        frameLayout.setTag(null);
        AbstractC11992rb abstractC11992rb = (AbstractC11992rb) objArr[2];
        this.f31668z = abstractC11992rb;
        m37821J(abstractC11992rb);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[1];
        this.f31665A = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
