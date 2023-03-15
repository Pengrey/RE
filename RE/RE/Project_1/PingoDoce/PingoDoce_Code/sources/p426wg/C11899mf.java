package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import gi.C5691c;

/* renamed from: wg.mf */
/* loaded from: classes2.dex */
public class C11899mf extends AbstractC11878lf {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30986B = null;

    /* renamed from: C */
    private static final SparseIntArray f30987C = null;

    /* renamed from: A */
    private long f30988A;

    /* renamed from: z */
    private final FrameLayout f30989z;

    public C11899mf(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30986B, f30987C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (17 == i) {
            mo3992Q((C5691c) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11878lf
    /* renamed from: Q */
    public void mo3992Q(C5691c c5691c) {
        this.f30891y = c5691c;
        synchronized (this) {
            this.f30988A |= 1;
        }
        m37781c(17);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30988A;
            this.f30988A = 0L;
        }
        int i = 0;
        C5691c c5691c = this.f30891y;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 != 0 && c5691c != null) {
            i = c5691c.m23337b();
        }
        if (i2 != 0) {
            this.f30890x.setText(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30988A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30988A = 2L;
        }
        m37826E();
    }

    private C11899mf(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (AppCompatTextView) objArr[1]);
        this.f30988A = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f30989z = frameLayout;
        frameLayout.setTag(null);
        this.f30890x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
