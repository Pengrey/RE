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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7629e;

/* renamed from: wg.c8 */
/* loaded from: classes2.dex */
public class C11710c8 extends AbstractC11693b8 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30007G = null;

    /* renamed from: H */
    private static final SparseIntArray f30008H;

    /* renamed from: D */
    private final ConstraintLayout f30009D;

    /* renamed from: E */
    private InterfaceC1276g f30010E;

    /* renamed from: F */
    private long f30011F;

    /* compiled from: ViewForBabyClubNameBindingImpl.java */
    /* renamed from: wg.c8$a */
    /* loaded from: classes2.dex */
    class C11711a implements InterfaceC1276g {
        C11711a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11710c8.this.f29948y);
            C11710c8 c11710c8 = C11710c8.this;
            String str = c11710c8.f29949z;
            if (c11710c8 != null) {
                c11710c8.mo4430R(m17891a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30008H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 3);
    }

    public C11710c8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30007G, f30008H));
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
            mo4428T((Boolean) obj);
        } else if (6 == i) {
            mo4430R((String) obj);
        } else if (110 == i) {
            mo4427U((Boolean) obj);
        } else if (35 != i) {
            return false;
        } else {
            mo4429S((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11693b8
    /* renamed from: R */
    public void mo4430R(String str) {
        this.f29949z = str;
        synchronized (this) {
            this.f30011F |= 2;
        }
        m37781c(6);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11693b8
    /* renamed from: S */
    public void mo4429S(String str) {
        this.f29945B = str;
        synchronized (this) {
            this.f30011F |= 8;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11693b8
    /* renamed from: T */
    public void mo4428T(Boolean bool) {
        this.f29944A = bool;
        synchronized (this) {
            this.f30011F |= 1;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11693b8
    /* renamed from: U */
    public void mo4427U(Boolean bool) {
        this.f29946C = bool;
        synchronized (this) {
            this.f30011F |= 4;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30011F;
            this.f30011F = 0L;
        }
        Boolean bool = this.f29944A;
        String str = this.f29949z;
        Boolean bool2 = this.f29946C;
        String str2 = this.f29945B;
        int i = ((17 & j) > 0L ? 1 : ((17 & j) == 0L ? 0 : -1));
        boolean m37823H = i != 0 ? ViewDataBinding.m37823H(bool) : false;
        int i2 = ((18 & j) > 0L ? 1 : ((18 & j) == 0L ? 0 : -1));
        int i3 = ((20 & j) > 0L ? 1 : ((20 & j) == 0L ? 0 : -1));
        int i4 = ((24 & j) > 0L ? 1 : ((24 & j) == 0L ? 0 : -1));
        if (i != 0) {
            this.f29947x.setErrorEnabled(m37823H);
        }
        if (i4 != 0) {
            BindingAdapters.m41780k(this.f29947x, str2);
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f29948y, str);
        }
        if ((j & 16) != 0) {
            C7629e.m17884h(this.f29948y, null, null, null, this.f30010E);
        }
        if (i3 != 0) {
            BindingAdapters.m41779l(this.f30009D, bool2, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30011F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30011F = 16L;
        }
        m37826E();
    }

    private C11710c8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[3], (TextInputLayout) objArr[1], (TextInputEditText) objArr[2]);
        this.f30010E = new C11711a();
        this.f30011F = -1L;
        this.f29947x.setTag(null);
        this.f29948y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30009D = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
