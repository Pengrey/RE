package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;

/* renamed from: wg.kd */
/* loaded from: classes2.dex */
public class C11859kd extends AbstractC11839jd {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30796B = null;

    /* renamed from: C */
    private static final SparseIntArray f30797C;

    /* renamed from: A */
    private long f30798A;

    /* renamed from: y */
    private final ConstraintLayout f30799y;

    /* renamed from: z */
    private final TextView f30800z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30797C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 2);
    }

    public C11859kd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30796B, f30797C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            m4076Q((String) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m4076Q(String str) {
        this.f30696x = str;
        synchronized (this) {
            this.f30798A |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30798A;
            this.f30798A = 0L;
        }
        String str = this.f30696x;
        if ((j & 3) != 0) {
            C7629e.m17885g(this.f30800z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30798A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30798A = 2L;
        }
        m37826E();
    }

    private C11859kd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (View) objArr[2]);
        this.f30798A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30799y = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30800z = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
