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

/* renamed from: wg.i9 */
/* loaded from: classes2.dex */
public class C11818i9 extends AbstractC11800h9 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30579C = null;

    /* renamed from: D */
    private static final SparseIntArray f30580D;

    /* renamed from: A */
    private final TextView f30581A;

    /* renamed from: B */
    private long f30582B;

    /* renamed from: z */
    private final ConstraintLayout f30583z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30580D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_no_product, 2);
    }

    public C11818i9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30579C, f30580D));
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
            mo4187R((Boolean) obj);
        } else if (26 != i) {
            return false;
        } else {
            mo4188Q((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11800h9
    /* renamed from: Q */
    public void mo4188Q(String str) {
        this.f30467y = str;
        synchronized (this) {
            this.f30582B |= 2;
        }
        m37781c(26);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11800h9
    /* renamed from: R */
    public void mo4187R(Boolean bool) {
        this.f30466x = bool;
        synchronized (this) {
            this.f30582B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30582B;
            this.f30582B = 0L;
        }
        Boolean bool = this.f30466x;
        String str = this.f30467y;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0) {
            BindingAdapters.m41779l(this.f30583z, bool, null);
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f30581A, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30582B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30582B = 4L;
        }
        m37826E();
    }

    private C11818i9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[2]);
        this.f30582B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30583z = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30581A = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
