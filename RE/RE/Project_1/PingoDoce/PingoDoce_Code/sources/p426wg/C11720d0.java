package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.d0 */
/* loaded from: classes2.dex */
public class C11720d0 extends AbstractC11702c0 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30054A;

    /* renamed from: B */
    private static final SparseIntArray f30055B;

    /* renamed from: x */
    private final AbstractC12136z9 f30056x;

    /* renamed from: y */
    private final ConstraintLayout f30057y;

    /* renamed from: z */
    private long f30058z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(2);
        f30054A = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{1}, new int[]{C2336R.layout.view_loading});
        f30055B = null;
    }

    public C11720d0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30054A, f30055B));
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
        this.f30056x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30058z;
            this.f30058z = 0L;
        }
        if ((j & 1) != 0) {
            this.f30056x.mo3570Q(Boolean.TRUE);
        }
        ViewDataBinding.m37808m(this.f30056x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30058z != 0) {
                return true;
            }
            return this.f30056x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30058z = 1L;
        }
        this.f30056x.mo3579w();
        m37826E();
    }

    private C11720d0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30058z = -1L;
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[1];
        this.f30056x = abstractC12136z9;
        m37821J(abstractC12136z9);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30057y = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
