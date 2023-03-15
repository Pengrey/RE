package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.s8 */
/* loaded from: classes2.dex */
public class C12008s8 extends AbstractC11989r8 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31460C = null;

    /* renamed from: D */
    private static final SparseIntArray f31461D = null;

    /* renamed from: A */
    private final MaterialButton f31462A;

    /* renamed from: B */
    private long f31463B;

    /* renamed from: z */
    private final LinearLayout f31464z;

    public C12008s8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31460C, f31461D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (25 == i) {
            mo3782Q((View.OnClickListener) obj);
        } else if (110 != i) {
            return false;
        } else {
            mo3781R((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11989r8
    /* renamed from: Q */
    public void mo3782Q(View.OnClickListener onClickListener) {
        this.f31383y = onClickListener;
        synchronized (this) {
            this.f31463B |= 1;
        }
        m37781c(25);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11989r8
    /* renamed from: R */
    public void mo3781R(Boolean bool) {
        this.f31382x = bool;
        synchronized (this) {
            this.f31463B |= 2;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31463B;
            this.f31463B = 0L;
        }
        View.OnClickListener onClickListener = this.f31383y;
        Boolean bool = this.f31382x;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        if ((j & 6) != 0) {
            BindingAdapters.m41779l(this.f31464z, bool, Boolean.TRUE);
        }
        if (i != 0) {
            this.f31462A.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31463B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31463B = 4L;
        }
        m37826E();
    }

    private C12008s8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31463B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31464z = linearLayout;
        linearLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[1];
        this.f31462A = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
