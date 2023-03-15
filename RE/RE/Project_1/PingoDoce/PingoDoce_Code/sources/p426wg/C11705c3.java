package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.c3 */
/* loaded from: classes2.dex */
public class C11705c3 extends AbstractC11688b3 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f29984A;

    /* renamed from: B */
    private static final SparseIntArray f29985B;

    /* renamed from: x */
    private final AbstractC12136z9 f29986x;

    /* renamed from: y */
    private final ConstraintLayout f29987y;

    /* renamed from: z */
    private long f29988z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(2);
        f29984A = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{1}, new int[]{C2336R.layout.view_loading});
        f29985B = null;
    }

    public C11705c3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f29984A, f29985B));
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
        this.f29986x.mo3594K(interfaceC1491v);
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
            j = this.f29988z;
            this.f29988z = 0L;
        }
        if ((j & 1) != 0) {
            this.f29986x.mo3570Q(Boolean.TRUE);
        }
        ViewDataBinding.m37808m(this.f29986x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29988z != 0) {
                return true;
            }
            return this.f29986x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29988z = 1L;
        }
        this.f29986x.mo3579w();
        m37826E();
    }

    private C11705c3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f29988z = -1L;
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[1];
        this.f29986x = abstractC12136z9;
        m37821J(abstractC12136z9);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29987y = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
