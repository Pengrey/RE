package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;

/* renamed from: wg.ab */
/* loaded from: classes2.dex */
public class C11678ab extends AbstractC12137za {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f29872A = null;

    /* renamed from: B */
    private static final SparseIntArray f29873B = null;

    /* renamed from: y */
    private final FrameLayout f29874y;

    /* renamed from: z */
    private long f29875z;

    public C11678ab(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f29872A, f29873B));
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
            m4476Q(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m4476Q(boolean z) {
        this.f32057x = z;
        synchronized (this) {
            this.f29875z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f29875z;
            this.f29875z = 0L;
        }
        boolean z = this.f32057x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f29874y, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29875z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29875z = 2L;
        }
        m37826E();
    }

    private C11678ab(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f29875z = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f29874y = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
