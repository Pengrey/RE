package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;

/* renamed from: wg.we */
/* loaded from: classes2.dex */
public class C12090we extends AbstractC12072ve {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31819C = null;

    /* renamed from: D */
    private static final SparseIntArray f31820D;

    /* renamed from: A */
    private final ConstraintLayout f31821A;

    /* renamed from: B */
    private long f31822B;

    /* renamed from: z */
    private final LinearLayout f31823z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31820D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_img, 3);
        sparseIntArray.put(C2336R.C2338id.const_number_lbl, 4);
    }

    public C12090we(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31819C, f31820D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (75 == i) {
            mo3660S((String) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12072ve
    /* renamed from: S */
    public void mo3660S(String str) {
        this.f31742y = str;
        synchronized (this) {
            this.f31822B |= 1;
        }
        m37781c(75);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31822B;
            this.f31822B = 0L;
        }
        String str = this.f31742y;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0) {
            r1 = !(str != null ? str.isEmpty() : false);
        }
        if (i != 0) {
            C7629e.m17885g(this.f31741x, str);
            BindingAdapters.m41779l(this.f31821A, Boolean.valueOf(r1), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31822B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31822B = 2L;
        }
        m37826E();
    }

    private C12090we(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.f31822B = -1L;
        this.f31741x.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31823z = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31821A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
