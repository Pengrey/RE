package p426wg;

import ae.BindingAdapters;
import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7629e;

/* renamed from: wg.e9 */
/* loaded from: classes2.dex */
public class C11746e9 extends AbstractC11729d9 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30227C = null;

    /* renamed from: D */
    private static final SparseIntArray f30228D = null;

    /* renamed from: A */
    private final NestedScrollView f30229A;

    /* renamed from: B */
    private long f30230B;

    public C11746e9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30227C, f30228D));
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
            mo4365R((Boolean) obj);
        } else if (53 != i) {
            return false;
        } else {
            mo4366Q((Spanned) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11729d9
    /* renamed from: Q */
    public void mo4366Q(Spanned spanned) {
        this.f30102y = spanned;
        synchronized (this) {
            this.f30230B |= 2;
        }
        m37781c(53);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11729d9
    /* renamed from: R */
    public void mo4365R(Boolean bool) {
        this.f30103z = bool;
        synchronized (this) {
            this.f30230B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30230B;
            this.f30230B = 0L;
        }
        Boolean bool = this.f30103z;
        Spanned spanned = this.f30102y;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        if ((j & 6) != 0) {
            C7629e.m17885g(this.f30101x, spanned);
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f30101x, bool, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30230B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30230B = 4L;
        }
        m37826E();
    }

    private C11746e9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1]);
        this.f30230B = -1L;
        this.f30101x.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.f30229A = nestedScrollView;
        nestedScrollView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
