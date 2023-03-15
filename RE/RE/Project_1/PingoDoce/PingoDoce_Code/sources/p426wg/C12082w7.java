package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7629e;

/* renamed from: wg.w7 */
/* loaded from: classes2.dex */
public class C12082w7 extends AbstractC12065v7 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f31788G = null;

    /* renamed from: H */
    private static final SparseIntArray f31789H;

    /* renamed from: D */
    private final ConstraintLayout f31790D;

    /* renamed from: E */
    private InterfaceC1276g f31791E;

    /* renamed from: F */
    private long f31792F;

    /* compiled from: ViewForBabyClubBirthdateBindingImpl.java */
    /* renamed from: wg.w7$a */
    /* loaded from: classes2.dex */
    class C12083a implements InterfaceC1276g {
        C12083a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C12082w7.this.f31727x);
            C12082w7 c12082w7 = C12082w7.this;
            String str = c12082w7.f31724A;
            if (c12082w7 != null) {
                c12082w7.mo3669R(m17891a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31789H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 3);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 4);
    }

    public C12082w7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31788G, f31789H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (58 == i) {
            mo3667T((Boolean) obj);
        } else if (21 == i) {
            mo3669R((String) obj);
        } else if (110 == i) {
            mo3666U(((Boolean) obj).booleanValue());
        } else if (35 != i) {
            return false;
        } else {
            mo3668S((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12065v7
    /* renamed from: R */
    public void mo3669R(String str) {
        this.f31724A = str;
        synchronized (this) {
            this.f31792F |= 2;
        }
        m37781c(21);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12065v7
    /* renamed from: S */
    public void mo3668S(String str) {
        this.f31726C = str;
        synchronized (this) {
            this.f31792F |= 8;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12065v7
    /* renamed from: T */
    public void mo3667T(Boolean bool) {
        this.f31725B = bool;
        synchronized (this) {
            this.f31792F |= 1;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12065v7
    /* renamed from: U */
    public void mo3666U(boolean z) {
        this.f31729z = z;
        synchronized (this) {
            this.f31792F |= 4;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31792F;
            this.f31792F = 0L;
        }
        Boolean bool = this.f31725B;
        String str = this.f31724A;
        boolean z = this.f31729z;
        String str2 = this.f31726C;
        int i = ((17 & j) > 0L ? 1 : ((17 & j) == 0L ? 0 : -1));
        boolean m37823H = i != 0 ? ViewDataBinding.m37823H(bool) : false;
        int i2 = ((20 & j) > 0L ? 1 : ((20 & j) == 0L ? 0 : -1));
        int i3 = ((24 & j) > 0L ? 1 : ((24 & j) == 0L ? 0 : -1));
        if ((18 & j) != 0) {
            C7629e.m17885g(this.f31727x, str);
        }
        if ((j & 16) != 0) {
            C7629e.m17884h(this.f31727x, null, null, null, this.f31791E);
        }
        if (i != 0) {
            this.f31728y.setErrorEnabled(m37823H);
        }
        if (i3 != 0) {
            BindingAdapters.m41780k(this.f31728y, str2);
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f31790D, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31792F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31792F = 16L;
        }
        m37826E();
    }

    private C12082w7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (View) objArr[4], (TextView) objArr[3], (TextInputLayout) objArr[1]);
        this.f31791E = new C12083a();
        this.f31792F = -1L;
        this.f31727x.setTag(null);
        this.f31728y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31790D = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
