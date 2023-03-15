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
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.y8 */
/* loaded from: classes2.dex */
public class C12118y8 extends AbstractC12100x8 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31969C = null;

    /* renamed from: D */
    private static final SparseIntArray f31970D;

    /* renamed from: A */
    private final MaterialButton f31971A;

    /* renamed from: B */
    private long f31972B;

    /* renamed from: z */
    private final ConstraintLayout f31973z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31970D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_no_conection_image, 2);
        sparseIntArray.put(C2336R.C2338id.const_no_conection_title, 3);
        sparseIntArray.put(C2336R.C2338id.const_no_conection_description, 4);
    }

    public C12118y8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31969C, f31970D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (106 == i) {
            mo3603Q((View.OnClickListener) obj);
        } else if (110 != i) {
            return false;
        } else {
            mo3602R(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p426wg.AbstractC12100x8
    /* renamed from: Q */
    public void mo3603Q(View.OnClickListener onClickListener) {
        this.f31879x = onClickListener;
        synchronized (this) {
            this.f31972B |= 1;
        }
        m37781c(106);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12100x8
    /* renamed from: R */
    public void mo3602R(boolean z) {
        this.f31880y = z;
        synchronized (this) {
            this.f31972B |= 2;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31972B;
            this.f31972B = 0L;
        }
        View.OnClickListener onClickListener = this.f31879x;
        boolean z = this.f31880y;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        if ((j & 6) != 0) {
            BindingAdapters.m41779l(this.f31973z, Boolean.valueOf(z), Boolean.TRUE);
        }
        if (i != 0) {
            this.f31971A.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31972B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31972B = 4L;
        }
        m37826E();
    }

    private C12118y8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[4], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f31972B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31973z = constraintLayout;
        constraintLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[1];
        this.f31971A = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
