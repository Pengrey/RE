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

/* renamed from: wg.m9 */
/* loaded from: classes2.dex */
public class C11892m9 extends AbstractC11872l9 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30955G = null;

    /* renamed from: H */
    private static final SparseIntArray f30956H;

    /* renamed from: D */
    private final ConstraintLayout f30957D;

    /* renamed from: E */
    private InterfaceC1276g f30958E;

    /* renamed from: F */
    private long f30959F;

    /* compiled from: ViewForWineClubBirthdateBindingImpl.java */
    /* renamed from: wg.m9$a */
    /* loaded from: classes2.dex */
    class C11893a implements InterfaceC1276g {
        C11893a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11892m9.this.f30879x);
            C11892m9 c11892m9 = C11892m9.this;
            String str = c11892m9.f30876A;
            if (c11892m9 != null) {
                c11892m9.mo4001R(m17891a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30956H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 3);
        sparseIntArray.put(C2336R.C2338id.const_subtitle, 4);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 5);
    }

    public C11892m9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30955G, f30956H));
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
            mo3999T((Boolean) obj);
        } else if (21 == i) {
            mo4001R((String) obj);
        } else if (110 == i) {
            mo3998U(((Boolean) obj).booleanValue());
        } else if (35 != i) {
            return false;
        } else {
            mo4000S((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11872l9
    /* renamed from: R */
    public void mo4001R(String str) {
        this.f30876A = str;
        synchronized (this) {
            this.f30959F |= 2;
        }
        m37781c(21);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11872l9
    /* renamed from: S */
    public void mo4000S(String str) {
        this.f30878C = str;
        synchronized (this) {
            this.f30959F |= 8;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11872l9
    /* renamed from: T */
    public void mo3999T(Boolean bool) {
        this.f30877B = bool;
        synchronized (this) {
            this.f30959F |= 1;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11872l9
    /* renamed from: U */
    public void mo3998U(boolean z) {
        this.f30881z = z;
        synchronized (this) {
            this.f30959F |= 4;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30959F;
            this.f30959F = 0L;
        }
        Boolean bool = this.f30877B;
        String str = this.f30876A;
        boolean z = this.f30881z;
        String str2 = this.f30878C;
        int i = ((17 & j) > 0L ? 1 : ((17 & j) == 0L ? 0 : -1));
        boolean m37823H = i != 0 ? ViewDataBinding.m37823H(bool) : false;
        int i2 = ((20 & j) > 0L ? 1 : ((20 & j) == 0L ? 0 : -1));
        int i3 = ((24 & j) > 0L ? 1 : ((24 & j) == 0L ? 0 : -1));
        if ((18 & j) != 0) {
            C7629e.m17885g(this.f30879x, str);
        }
        if ((j & 16) != 0) {
            C7629e.m17884h(this.f30879x, null, null, null, this.f30958E);
        }
        if (i != 0) {
            this.f30880y.setErrorEnabled(m37823H);
        }
        if (i3 != 0) {
            BindingAdapters.m41780k(this.f30880y, str2);
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f30957D, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30959F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30959F = 16L;
        }
        m37826E();
    }

    private C11892m9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (View) objArr[5], (TextView) objArr[4], (TextView) objArr[3], (TextInputLayout) objArr[1]);
        this.f30958E = new C11893a();
        this.f30959F = -1L;
        this.f30879x.setTag(null);
        this.f30880y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30957D = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
