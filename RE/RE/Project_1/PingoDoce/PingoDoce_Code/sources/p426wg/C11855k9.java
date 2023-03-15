package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;

/* renamed from: wg.k9 */
/* loaded from: classes2.dex */
public class C11855k9 extends AbstractC11835j9 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30781B = null;

    /* renamed from: C */
    private static final SparseIntArray f30782C;

    /* renamed from: A */
    private long f30783A;

    /* renamed from: z */
    private final ConstraintLayout f30784z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30782C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_bg, 2);
        sparseIntArray.put(C2336R.C2338id.const_badge_background, 3);
    }

    public C11855k9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30781B, f30782C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (9 == i) {
            mo4083Q((Integer) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11835j9
    /* renamed from: Q */
    public void mo4083Q(Integer num) {
        this.f30684y = num;
        synchronized (this) {
            this.f30783A |= 1;
        }
        m37781c(9);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30783A;
            this.f30783A = 0L;
        }
        String str = null;
        Integer num = this.f30684y;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0 && num != null) {
            str = num.toString();
        }
        if (i != 0) {
            C7629e.m17885g(this.f30683x, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30783A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30783A = 2L;
        }
        m37826E();
    }

    private C11855k9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1], (View) objArr[3], (FrameLayout) objArr[2]);
        this.f30783A = -1L;
        this.f30683x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30784z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
