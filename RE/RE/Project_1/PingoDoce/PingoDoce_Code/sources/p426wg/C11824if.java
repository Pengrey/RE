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

/* renamed from: wg.if */
/* loaded from: classes2.dex */
public class C11824if extends AbstractC11806hf {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30604C = null;

    /* renamed from: D */
    private static final SparseIntArray f30605D;

    /* renamed from: A */
    private final TextView f30606A;

    /* renamed from: B */
    private long f30607B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30605D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_no_product, 2);
    }

    public C11824if(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30604C, f30605D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo4175R(((Boolean) obj).booleanValue());
        } else if (73 != i) {
            return false;
        } else {
            mo4176Q((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11806hf
    /* renamed from: Q */
    public void mo4176Q(String str) {
        this.f30502y = str;
        synchronized (this) {
            this.f30607B |= 2;
        }
        m37781c(73);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11806hf
    /* renamed from: R */
    public void mo4175R(boolean z) {
        this.f30503z = z;
        synchronized (this) {
            this.f30607B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30607B;
            this.f30607B = 0L;
        }
        boolean z = this.f30503z;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        String format = i2 != 0 ? String.format(this.f30606A.getResources().getString(C2336R.string.lbl_no_product), this.f30502y) : null;
        if (i2 != 0) {
            C7629e.m17885g(this.f30606A, format);
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f30501x, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30607B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30607B = 4L;
        }
        m37826E();
    }

    private C11824if(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[2], (ConstraintLayout) objArr[0]);
        this.f30607B = -1L;
        TextView textView = (TextView) objArr[1];
        this.f30606A = textView;
        textView.setTag(null);
        this.f30501x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
