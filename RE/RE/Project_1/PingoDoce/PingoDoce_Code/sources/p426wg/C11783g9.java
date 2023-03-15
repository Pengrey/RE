package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7629e;

/* renamed from: wg.g9 */
/* loaded from: classes2.dex */
public class C11783g9 extends AbstractC11763f9 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30407H = null;

    /* renamed from: I */
    private static final SparseIntArray f30408I = null;

    /* renamed from: F */
    private final ConstraintLayout f30409F;

    /* renamed from: G */
    private long f30410G;

    public C11783g9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30407H, f30408I));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (28 == i) {
            mo4253R((String) obj);
        } else if (8 == i) {
            mo4254Q((String) obj);
        } else if (47 == i) {
            mo4252S((Boolean) obj);
        } else if (110 == i) {
            mo4250U((Boolean) obj);
        } else if (77 != i) {
            return false;
        } else {
            mo4251T((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11763f9
    /* renamed from: Q */
    public void mo4254Q(String str) {
        this.f30319A = str;
        synchronized (this) {
            this.f30410G |= 2;
        }
        m37781c(8);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11763f9
    /* renamed from: R */
    public void mo4253R(String str) {
        this.f30322D = str;
        synchronized (this) {
            this.f30410G |= 1;
        }
        m37781c(28);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11763f9
    /* renamed from: S */
    public void mo4252S(Boolean bool) {
        this.f30320B = bool;
        synchronized (this) {
            this.f30410G |= 4;
        }
        m37781c(47);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11763f9
    /* renamed from: T */
    public void mo4251T(String str) {
        this.f30321C = str;
        synchronized (this) {
            this.f30410G |= 16;
        }
        m37781c(77);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11763f9
    /* renamed from: U */
    public void mo4250U(Boolean bool) {
        this.f30323E = bool;
        synchronized (this) {
            this.f30410G |= 8;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f30410G;
            this.f30410G = 0L;
        }
        String str = this.f30322D;
        String str2 = this.f30319A;
        Boolean bool = this.f30320B;
        Boolean bool2 = this.f30323E;
        String str3 = this.f30321C;
        int i = ((33 & j) > 0L ? 1 : ((33 & j) == 0L ? 0 : -1));
        int i2 = ((34 & j) > 0L ? 1 : ((34 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            z = !(str2 != null ? str2.isEmpty() : false);
        } else {
            z = false;
        }
        int i3 = ((36 & j) > 0L ? 1 : ((36 & j) == 0L ? 0 : -1));
        boolean z2 = i3 != 0 ? !ViewDataBinding.m37823H(bool) : false;
        int i4 = ((j & 48) > 0L ? 1 : ((j & 48) == 0L ? 0 : -1));
        if ((j & 40) != 0) {
            BindingAdapters.m41779l(this.f30409F, bool2, Boolean.TRUE);
        }
        if ((j & 32) != 0) {
            BindingAdapters.m41778m(this.f30324x, true);
        }
        if (i != 0) {
            C7629e.m17885g(this.f30324x, str);
        }
        if (i3 != 0) {
            BindingAdapters.m41779l(this.f30324x, Boolean.valueOf(z2), null);
        }
        if (i4 != 0) {
            C7629e.m17885g(this.f30325y, str3);
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f30326z, Boolean.valueOf(z), Boolean.TRUE);
            BindingAdapters.m41781j(this.f30326z, str2, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30410G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30410G = 32L;
        }
        m37826E();
    }

    private C11783g9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[3], (TextView) objArr[2], (ImageView) objArr[1]);
        this.f30410G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30409F = constraintLayout;
        constraintLayout.setTag(null);
        this.f30324x.setTag(null);
        this.f30325y.setTag(null);
        this.f30326z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
