package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.o9 */
/* loaded from: classes2.dex */
public class C11933o9 extends AbstractC11911n9 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f31138K;

    /* renamed from: L */
    private static final SparseIntArray f31139L;

    /* renamed from: G */
    private final LinearLayout f31140G;

    /* renamed from: H */
    private final ConstraintLayout f31141H;

    /* renamed from: I */
    private final ConstraintLayout f31142I;

    /* renamed from: J */
    private long f31143J;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f31138K = c1263i;
        c1263i.m37795a(1, new String[]{"view_for_wine_type"}, new int[]{5}, new int[]{C2336R.layout.view_for_wine_type});
        c1263i.m37795a(3, new String[]{"view_for_wine_region"}, new int[]{6}, new int[]{C2336R.layout.view_for_wine_region});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31139L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 7);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator_2, 8);
    }

    public C11933o9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31138K, f31139L));
    }

    /* renamed from: V */
    private boolean m3924V(AbstractC12067v9 abstractC12067v9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31143J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3923W(AbstractC12101x9 abstractC12101x9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31143J |= 1;
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
            return m3924V((AbstractC12067v9) obj, i2);
        }
        return m3923W((AbstractC12101x9) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31055z.mo3594K(interfaceC1491v);
        this.f31053x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (101 == i) {
            mo3928R((Boolean) obj);
        } else if (110 == i) {
            mo3927S((Boolean) obj);
        } else if (112 == i) {
            mo3926T((View.OnClickListener) obj);
        } else if (100 == i) {
            mo3929Q((Boolean) obj);
        } else if (113 != i) {
            return false;
        } else {
            mo3925U((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11911n9
    /* renamed from: Q */
    public void mo3929Q(Boolean bool) {
        this.f31052F = bool;
        synchronized (this) {
            this.f31143J |= 32;
        }
        m37781c(100);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11911n9
    /* renamed from: R */
    public void mo3928R(Boolean bool) {
        this.f31051E = bool;
        synchronized (this) {
            this.f31143J |= 4;
        }
        m37781c(C0868i.f2743B0);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11911n9
    /* renamed from: S */
    public void mo3927S(Boolean bool) {
        this.f31050D = bool;
        synchronized (this) {
            this.f31143J |= 8;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11911n9
    /* renamed from: T */
    public void mo3926T(View.OnClickListener onClickListener) {
        this.f31049C = onClickListener;
        synchronized (this) {
            this.f31143J |= 16;
        }
        m37781c(112);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11911n9
    /* renamed from: U */
    public void mo3925U(View.OnClickListener onClickListener) {
        this.f31048B = onClickListener;
        synchronized (this) {
            this.f31143J |= 64;
        }
        m37781c(113);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31143J;
            this.f31143J = 0L;
        }
        Boolean bool = this.f31051E;
        Boolean bool2 = this.f31050D;
        View.OnClickListener onClickListener = this.f31049C;
        Boolean bool3 = this.f31052F;
        View.OnClickListener onClickListener2 = this.f31048B;
        int i = ((132 & j) > 0L ? 1 : ((132 & j) == 0L ? 0 : -1));
        int i2 = ((136 & j) > 0L ? 1 : ((136 & j) == 0L ? 0 : -1));
        int i3 = ((144 & j) > 0L ? 1 : ((144 & j) == 0L ? 0 : -1));
        int i4 = ((160 & j) > 0L ? 1 : ((160 & j) == 0L ? 0 : -1));
        int i5 = ((j & 192) > 0L ? 1 : ((j & 192) == 0L ? 0 : -1));
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f31140G, bool2, Boolean.TRUE);
        }
        if (i4 != 0) {
            this.f31053x.mo3665Q(bool3);
        }
        if (i3 != 0) {
            this.f31054y.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            this.f31055z.mo3601Q(bool);
        }
        if (i5 != 0) {
            this.f31047A.setOnClickListener(onClickListener2);
        }
        ViewDataBinding.m37808m(this.f31055z);
        ViewDataBinding.m37808m(this.f31053x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31143J != 0) {
                return true;
            }
            return this.f31055z.mo3580u() || this.f31053x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31143J = 128L;
        }
        this.f31055z.mo3579w();
        this.f31053x.mo3579w();
        m37826E();
    }

    private C11933o9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (View) objArr[7], (View) objArr[8], (AbstractC12067v9) objArr[6], (ImageButton) objArr[4], (AbstractC12101x9) objArr[5], (ImageButton) objArr[2]);
        this.f31143J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31140G = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31141H = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[3];
        this.f31142I = constraintLayout2;
        constraintLayout2.setTag(null);
        m37821J(this.f31053x);
        this.f31054y.setTag(null);
        m37821J(this.f31055z);
        this.f31047A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
