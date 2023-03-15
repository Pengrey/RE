package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;

/* renamed from: wg.g5 */
/* loaded from: classes2.dex */
public class C11778g5 extends AbstractC11759f5 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30389F = null;

    /* renamed from: G */
    private static final SparseIntArray f30390G;

    /* renamed from: C */
    private final ConstraintLayout f30391C;

    /* renamed from: D */
    private final TextView f30392D;

    /* renamed from: E */
    private long f30393E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30390G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_divider, 4);
    }

    public C11778g5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30389F, f30390G));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (10 == i) {
            mo4269S((String) obj);
        } else if (11 == i) {
            mo4268T((String) obj);
        } else if (12 != i) {
            return false;
        } else {
            mo4267U((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11759f5
    /* renamed from: S */
    public void mo4269S(String str) {
        this.f30300A = str;
        synchronized (this) {
            this.f30393E |= 1;
        }
        m37781c(10);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11759f5
    /* renamed from: T */
    public void mo4268T(String str) {
        this.f30301B = str;
        synchronized (this) {
            this.f30393E |= 2;
        }
        m37781c(11);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11759f5
    /* renamed from: U */
    public void mo4267U(String str) {
        this.f30304z = str;
        synchronized (this) {
            this.f30393E |= 4;
        }
        m37781c(12);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30393E;
            this.f30393E = 0L;
        }
        String str = this.f30300A;
        String str2 = this.f30301B;
        String str3 = this.f30304z;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        int i2 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        if ((j & 12) != 0) {
            BindingAdapters.m41781j(this.f30302x, str3, null, null, null, null);
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f30303y, str2);
        }
        if (i != 0) {
            C7629e.m17885g(this.f30392D, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30393E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30393E = 8L;
        }
        m37826E();
    }

    private C11778g5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[2], (View) objArr[4], (TextView) objArr[1]);
        this.f30393E = -1L;
        this.f30302x.setTag(null);
        this.f30303y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30391C = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f30392D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
